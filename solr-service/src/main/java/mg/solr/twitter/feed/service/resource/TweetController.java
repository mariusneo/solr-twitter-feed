package mg.solr.twitter.feed.service.resource;

import mg.solr.twitter.feed.contract.Place;
import mg.solr.twitter.feed.contract.Tweet;
import mg.solr.twitter.feed.contract.User;
import mg.solr.twitter.feed.repository.TweetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tweets")
public class TweetController {

    @Autowired
    TweetRepository tweetRepository;

    private static Tweet createTweetResponse(mg.solr.twitter.feed.domain.Tweet domainTweet) {
        Tweet tweet = new Tweet();
        tweet.setId(domainTweet.getId());
        tweet.setCreatedAt(domainTweet.getCreatedAt());
        tweet.setText(domainTweet.getText());
        tweet.setSource(domainTweet.getSource());
        tweet.setInReplyToStatusId(domainTweet.getInReplyToStatusId());
        tweet.setInReplyToUserId(domainTweet.getInReplyToUserId());
        tweet.setInReplyToScreenName(domainTweet.getInReplyToScreenName());
        tweet.setLocation(domainTweet.getLocation() == null ? null : new double[]{domainTweet.getLocation().getX(),
                domainTweet.getLocation().getY()});
        tweet.setIsFavorited(domainTweet.isFavorited());
        tweet.setFavoriteCount(domainTweet.getFavoriteCount());
        tweet.setIsRetweeted(domainTweet.isRetweeted());
        tweet.setRetweetCount(domainTweet.getRetweetCount());
        tweet.setIsRetweet(domainTweet.isRetweet());
        tweet.setLanguage(domainTweet.getLanguage());

        Place place = new Place();
        place.setId(domainTweet.getPlaceId());
        place.setName(domainTweet.getPlaceName());
        place.setType(domainTweet.getPlaceType());
        place.setStreetAddress(domainTweet.getPlaceStreetAddress());
        place.setContryCode(domainTweet.getPlaceContryCode());
        place.setFullName(domainTweet.getPlaceFullName());
        tweet.setPlace(place);

        User user = new User();
        user.setId(domainTweet.getUserId());
        user.setName(domainTweet.getUserName());
        user.setScreenName(domainTweet.getUserScreenName());
        user.setDescription(domainTweet.getUserDescription());
        user.setProfileImageUrl(domainTweet.getUserProfileImageUrl());
        user.setMiniProfileImageUrl(domainTweet.getUserMiniProfileImageUrl());
        user.setFollowersCount(domainTweet.getUserFollowersCount());
        user.setFriendsCount(domainTweet.getUserFriendsCount());
        user.setCreatedAt(domainTweet.getUserCreatedAt());
        user.setFavoritesCount(domainTweet.getUserFavoritesCount());
        user.setLanguage(domainTweet.getUserLanguage());
        tweet.setUser(user);

        return tweet;
    }


    @RequestMapping(method= RequestMethod.GET, value="{id}")
    public Tweet readTweet(@PathVariable String id) {
        mg.solr.twitter.feed.domain.Tweet domainTweet = tweetRepository.findOne(id);
        if (domainTweet == null) {
            return null;
        }

        return createTweetResponse(domainTweet);
    }
}
