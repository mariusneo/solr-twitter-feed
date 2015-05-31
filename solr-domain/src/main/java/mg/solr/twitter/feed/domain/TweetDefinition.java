package mg.solr.twitter.feed.domain;

public interface TweetDefinition {
    String ID_FIELD_NAME = "id";
    String CREATED_AT_FIELD_NAME = "created_at";
    String TEXT_FIELD_NAME = "text";
    String SOURCE_FIELD_NAME = "source";
    String IN_REPLY_TO_STATUS_ID_FIELD_NAME = "in_reply_to_status_id";
    String IN_REPLY_TO_USER_ID = "in_reply_to_user_id";
    String IN_REPLY_TO_SCREEN_NAME = "in_reply_to_screen_name";
    String LOCATION_FIELD_NAME = "location";

    String PLACE_NAME_FIELD_NAME = "place_name";
    String PLACE_STREET_ADDRESS_FIELD_NAME = "place_street_address";
    String PLACE_COUNTRY_CODE_FIELD_NAME = "place_country_code";
    String PLACE_ID_FIELD_NAME = "place_id";
    String PLACE_TYPE_FIELD_NAME = "place_type";
    String PLACE_FULL_NAME_FIELD_NAME = "place_full_name";

    String IS_FAVORITED_FIELD_NAME = "favorited";
    String IS_RETWEETED_FIELD_NAME = "retweeted";
    String FAVORITE_COUNT_FIELD_NAME = "favorite_count";
    String RETWEET_COUNT_FIELD_NAME = "retweet_count";
    String IS_RETWEET_FIELD_NAME = "retweet";

    String USER_ID_FIELD_NAME = "user_id";
    String USER_NAME_FIELD_NAME = "user_name";
    String USER_SCREEN_NAME_FIELD_NAME = "user_screen_name";
    String USER_DESCRIPTION_FIELD_NAME = "user_description";
    String USER_PROFILE_IMAGE_URL_FIELD_NAME = "user_profile_image_url";
    String USER_MINI_PROFILE_IMAGE_URL_FIELD_NAME = "user_mini_profile_image_url";
    String USER_FOLLOWERS_COUNT_FIELD_NAME = "user_followers_count";
    String USER_FRIENDS_COUNT_FIELD_NAME = "user_friends_count";
    String USER_CREATED_AT_FIELD_NAME = "user_created_at";
    String USER_FAVORITES_COUNT_FIELD_NAME = "user_favorites_count";
    String USER_LANGUAGE_FIELD_NAME = "user_language";

    String LANGUAGE_FIELD_NAME = "lang";
}
