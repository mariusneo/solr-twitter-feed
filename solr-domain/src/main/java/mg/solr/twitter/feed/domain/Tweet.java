package mg.solr.twitter.feed.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.geo.Point;
import org.springframework.data.solr.core.mapping.Indexed;
import org.springframework.data.solr.core.mapping.SolrDocument;

import java.util.Date;


@SolrDocument(solrCoreName = "tweets")
public class Tweet implements TweetDefinition {

    private @Id @Indexed String id;

    private @Indexed(CREATED_AT_FIELD_NAME) Date createdAt;

    private @Indexed(TEXT_FIELD_NAME) String text;

    private @Indexed(SOURCE_FIELD_NAME) String source;

    private @Indexed(IN_REPLY_TO_STATUS_ID_FIELD_NAME) long inReplyToStatusId;

    private @Indexed(IN_REPLY_TO_USER_ID) long inReplyToUserId;

    private @Indexed(IN_REPLY_TO_SCREEN_NAME) String inReplyToScreenName;

    private @Indexed(LOCATION_FIELD_NAME) Point location;

    private @Indexed(PLACE_NAME_FIELD_NAME) String placeName;

    private @Indexed(PLACE_STREET_ADDRESS_FIELD_NAME) String placeStreetAddress;

    private @Indexed(PLACE_COUNTRY_CODE_FIELD_NAME) String placeContryCode;

    private @Indexed(PLACE_ID_FIELD_NAME) String placeId;

    private @Indexed(PLACE_TYPE_FIELD_NAME) String placeType;

    private @Indexed(PLACE_FULL_NAME_FIELD_NAME) String placeFullName;

    private @Indexed(IS_FAVORITED_FIELD_NAME) boolean isFavorited;

    private @Indexed(FAVORITE_COUNT_FIELD_NAME) int favoriteCount;

    private @Indexed(IS_RETWEETED_FIELD_NAME) boolean isRetweeted;

    private @Indexed(RETWEET_COUNT_FIELD_NAME) int retweetCount;

    private @Indexed(IS_RETWEET_FIELD_NAME) boolean isRetweet;

    private @Indexed(LANGUAGE_FIELD_NAME) String language;

    private @Indexed(USER_ID_FIELD_NAME)  long userId;

    private @Indexed(USER_NAME_FIELD_NAME) String userName;

    private @Indexed(USER_SCREEN_NAME_FIELD_NAME) String userScreenName;

    private @Indexed(USER_DESCRIPTION_FIELD_NAME) String userDescription;

    private @Indexed(USER_PROFILE_IMAGE_URL_FIELD_NAME) String userProfileImageUrl;

    private @Indexed(USER_MINI_PROFILE_IMAGE_URL_FIELD_NAME) String userMiniProfileImageUrl;

    private @Indexed(USER_FOLLOWERS_COUNT_FIELD_NAME) int userFollowersCount;

    private @Indexed(USER_FRIENDS_COUNT_FIELD_NAME)  int userFriendsCount;

    private @Indexed(USER_CREATED_AT_FIELD_NAME) Date userCreatedAt;

    private @Indexed(USER_FAVORITES_COUNT_FIELD_NAME) int userFavoritesCount;

    private @Indexed(USER_LANGUAGE_FIELD_NAME) String userLanguage;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public long getInReplyToStatusId() {
        return inReplyToStatusId;
    }

    public void setInReplyToStatusId(long inReplyToStatusId) {
        this.inReplyToStatusId = inReplyToStatusId;
    }

    public long getInReplyToUserId() {
        return inReplyToUserId;
    }

    public void setInReplyToUserId(long inReplyToUserId) {
        this.inReplyToUserId = inReplyToUserId;
    }

    public String getInReplyToScreenName() {
        return inReplyToScreenName;
    }

    public void setInReplyToScreenName(String inReplyToScreenName) {
        this.inReplyToScreenName = inReplyToScreenName;
    }

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public String getPlaceStreetAddress() {
        return placeStreetAddress;
    }

    public void setPlaceStreetAddress(String placeStreetAddress) {
        this.placeStreetAddress = placeStreetAddress;
    }

    public String getPlaceContryCode() {
        return placeContryCode;
    }

    public void setPlaceContryCode(String placeContryCode) {
        this.placeContryCode = placeContryCode;
    }

    public String getPlaceId() {
        return placeId;
    }

    public void setPlaceId(String placeId) {
        this.placeId = placeId;
    }

    public String getPlaceType() {
        return placeType;
    }

    public void setPlaceType(String placeType) {
        this.placeType = placeType;
    }

    public String getPlaceFullName() {
        return placeFullName;
    }

    public void setPlaceFullName(String placeFullName) {
        this.placeFullName = placeFullName;
    }

    public boolean isFavorited() {
        return isFavorited;
    }

    public void setIsFavorited(boolean isFavorited) {
        this.isFavorited = isFavorited;
    }

    public int getFavoriteCount() {
        return favoriteCount;
    }

    public void setFavoriteCount(int favoriteCount) {
        this.favoriteCount = favoriteCount;
    }

    public boolean isRetweeted() {
        return isRetweeted;
    }

    public void setIsRetweeted(boolean isRetweeted) {
        this.isRetweeted = isRetweeted;
    }

    public int getRetweetCount() {
        return retweetCount;
    }

    public void setRetweetCount(int retweetCount) {
        this.retweetCount = retweetCount;
    }

    public boolean isRetweet() {
        return isRetweet;
    }

    public void setIsRetweet(boolean isRetweet) {
        this.isRetweet = isRetweet;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserScreenName() {
        return userScreenName;
    }

    public void setUserScreenName(String userScreenName) {
        this.userScreenName = userScreenName;
    }

    public String getUserDescription() {
        return userDescription;
    }

    public void setUserDescription(String userDescription) {
        this.userDescription = userDescription;
    }

    public String getUserProfileImageUrl() {
        return userProfileImageUrl;
    }

    public void setUserProfileImageUrl(String userProfileImageUrl) {
        this.userProfileImageUrl = userProfileImageUrl;
    }

    public String getUserMiniProfileImageUrl() {
        return userMiniProfileImageUrl;
    }

    public void setUserMiniProfileImageUrl(String userMiniProfileImageUrl) {
        this.userMiniProfileImageUrl = userMiniProfileImageUrl;
    }

    public int getUserFollowersCount() {
        return userFollowersCount;
    }

    public void setUserFollowersCount(int userFollowersCount) {
        this.userFollowersCount = userFollowersCount;
    }

    public int getUserFriendsCount() {
        return userFriendsCount;
    }

    public void setUserFriendsCount(int userFriendsCount) {
        this.userFriendsCount = userFriendsCount;
    }

    public Date getUserCreatedAt() {
        return userCreatedAt;
    }

    public void setUserCreatedAt(Date userCreatedAt) {
        this.userCreatedAt = userCreatedAt;
    }

    public int getUserFavoritesCount() {
        return userFavoritesCount;
    }

    public void setUserFavoritesCount(int userFavoritesCount) {
        this.userFavoritesCount = userFavoritesCount;
    }

    public String getUserLanguage() {
        return userLanguage;
    }

    public void setUserLanguage(String userLanguage) {
        this.userLanguage = userLanguage;
    }

    @Override
    public String toString() {
        return "Tweet{" +
                "id='" + id + '\'' +
                ", text='" + text + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }

    public static class Builder {
        private Tweet build;

        public Builder() {
            build = new Tweet();
        }

        public Builder id(String id){
            build.id = id;
            return this;
        }

        public Builder createdAt(Date createdAt){
            build.createdAt = createdAt;
            return this;
        }

        public Builder text(String text){
            build.text = text;
            return this;
        }

        public Builder source(String source){
            build.source = source;
            return this;
        }

        public Builder inReplyToStatusId(long inReplyToStatusId){
            build.inReplyToStatusId = inReplyToStatusId;
            return this;
        }

        public Builder inReplyToUserId(long inReplyToUserId){
            build.inReplyToUserId = inReplyToUserId;
            return this;
        }

        public Builder inReplyToScreenName(String inReplyToScreenName){
            build.inReplyToScreenName = inReplyToScreenName;
            return this;
        }

        public Builder location(Point location){
            build.location= location;
            return this;
        }

        public Builder placeName(String placeName){
            build.placeName = placeName;
            return this;
        }

        public Builder placeStreetAddress(String placeStreetAddress){
            build.placeStreetAddress = placeStreetAddress;
            return this;
        }

        public Builder placeCountryCode(String placeCountryCode){
            build.placeContryCode = placeCountryCode;
            return this;
        }

        public Builder placeId(String placeId){
            build.placeId = placeId;
            return this;
        }

        public Builder placeType(String placeType){
            build.placeType = placeType;
            return this;
        }


        public Builder placeFullName(String placeFullName){
            build.placeFullName = placeFullName;
            return this;
        }

        public Builder favorited(boolean isFavorited){
            build.isFavorited = isFavorited;
            return  this;
        }

        public Builder favoritedCount(int favoriteCount){
            build.favoriteCount = favoriteCount;
            return this;
        }

        public Builder retweeted(boolean isRetweeted){
            build.isRetweeted = isRetweeted;
            return  this;
        }

        public Builder retweetCount(int retweetCount){
            build.retweetCount = retweetCount;
            return this;
        }

        public Builder retweet(boolean isRetweet){
            build.isRetweet = isRetweet;
            return this;
        }

        public Builder language(String language){
            build.language = language;
            return this;
        }

        public Builder userId(long userId){
            build.userId = userId;
            return this;
        }

        public Builder userName(String userName){
            build.userName = userName;
            return this;
        }

        public Builder userScreeenName(String userScreenName){
            build.userScreenName = userScreenName;
            return this;
        }

        public Builder userDescription(String userDescription){
            build.userDescription = userDescription;
            return this;
        }

        public Builder userProfileImageUrl(String userProfileImageUrl){
            build.userProfileImageUrl = userProfileImageUrl;
            return this;
        }

        public Builder userMiniProfileImageUrl(String userMiniProfileImageUrl){
            build.userMiniProfileImageUrl = userMiniProfileImageUrl;
            return this;
        }

        public Builder userFollowersCount(int userFollowersCount){
            build.userFollowersCount = userFollowersCount;
            return this;
        }

        public Builder userFriendsCount(int userFriendsCount){
            build.userFriendsCount = userFriendsCount;
            return this;
        }

        public Builder userCreatedAt(Date userCreatedAt){
            build.userCreatedAt = userCreatedAt;
            return this;
        }

        public Builder userFavoritesCount(int userFavoritesCount){
            build.userFavoritesCount = userFavoritesCount;
            return this;
        }

        public Builder userLanguage(String userLanguage){
            build.userLanguage = userLanguage;
            return this;
        }

        public Tweet build() {
            return build;
        }
    }
}