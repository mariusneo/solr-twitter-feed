package mg.solr.twitter.feed.importer.service;

import mg.solr.twitter.feed.domain.Tweet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.solr.core.geo.Point;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import twitter4j.GeoLocation;
import twitter4j.Place;
import twitter4j.Status;
import twitter4j.User;

import mg.solr.twitter.feed.repository.TweetRepository;

@Service
public class SolrTweetImporterService {

    @Autowired
    private TweetRepository tweetRepository;

    private static Point createPoint(GeoLocation geoLocation) {
        return geoLocation == null ? null : new Point(geoLocation.getLongitude(), geoLocation.getLatitude());
    }

    private static Tweet createTweet(Status status){
        Tweet.Builder tweetBuilder = new Tweet.Builder();
        tweetBuilder.id(Long.toString(status.getId()))
                .createdAt(status.getCreatedAt())
                .text(status.getText())
                .source(status.getSource())
                .inReplyToStatusId(status.getInReplyToStatusId())
                .inReplyToUserId(status.getInReplyToUserId())
                .inReplyToScreenName(status.getInReplyToScreenName())
                .location(createPoint(status.getGeoLocation()))
                .favorited(status.isFavorited())
                .favoritedCount(status.getFavoriteCount())
                .retweeted(status.isRetweeted())
                .retweetCount(status.getRetweetCount())
                .retweet(status.isRetweet())
                .language(status.getLang());
        Place place = status.getPlace();
        if (place != null) {
            tweetBuilder.placeName(place.getName())
                    .placeStreetAddress(place.getStreetAddress())
                    .placeCountryCode(place.getCountryCode())
                    .placeId(place.getId())
                    .placeType(place.getPlaceType())
                    .placeFullName(place.getFullName());
        }

        User user = status.getUser();
        if (user != null) {
            tweetBuilder.userId(user.getId())
                    .userName(user.getName())
                    .userScreeenName(user.getScreenName())
                    .userDescription(user.getDescription())
                    .userProfileImageUrl(user.getProfileImageURL())
                    .userMiniProfileImageUrl(user.getMiniProfileImageURL())
                    .userFollowersCount(user.getFollowersCount())
                    .userFriendsCount(user.getFriendsCount())
                    .userCreatedAt(user.getCreatedAt())
                    .userFavoritesCount(user.getFavouritesCount())
                    .userLanguage(user.getLang());
        }
        return tweetBuilder.build();
    }

    @Async
    public void importTweet(Status status) {
        Tweet tweet = createTweet(status);

        tweetRepository.save(tweet);
    }
}
