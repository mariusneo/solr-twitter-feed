package mg.solr.twitter.feed.contract;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement
public class User {
    private  long id;

    private String name;

    private String screenName;

    private  String description;

    private String profileImageUrl;

    private  String miniProfileImageUrl;

    private int followersCount;

    private int friendsCount;

    private Date createdAt;

    private int favoritesCount;

    private String language;

    public User(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }

    public String getMiniProfileImageUrl() {
        return miniProfileImageUrl;
    }

    public void setMiniProfileImageUrl(String miniProfileImageUrl) {
        this.miniProfileImageUrl = miniProfileImageUrl;
    }

    public int getFollowersCount() {
        return followersCount;
    }

    public void setFollowersCount(int followersCount) {
        this.followersCount = followersCount;
    }

    public int getFriendsCount() {
        return friendsCount;
    }

    public void setFriendsCount(int friendsCount) {
        this.friendsCount = friendsCount;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public int getFavoritesCount() {
        return favoritesCount;
    }

    public void setFavoritesCount(int favoritesCount) {
        this.favoritesCount = favoritesCount;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
