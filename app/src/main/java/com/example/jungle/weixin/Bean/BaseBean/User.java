package com.example.jungle.weixin.Bean.BaseBean;

import com.example.jungle.weixin.PublicUtils.StringUtils;

import java.io.Serializable;

/**
 * Created by derrickJ on 2017/11/21.
 */

public class User implements Serializable{

    private long id;
    private String idstr;
    private String screen_name = "";
    private String location;
    private String description;
    private String verified_reason;
    private String profile_image_url;
    private String avatar_large;
    private String avatar_hd;
    private String gender;  //性别，m：男、f：女、n：未知
    private String profile_url;
    private String cover_image_phone;
    private int followers_count;
    private int follow_count;
    private int friends_count;
    private int statuses_count;
    private int verified_type;
    private boolean following;
    private boolean allow_all_act_msg;
    private boolean allow_all_comment;
    private boolean verified;
    private boolean follow_me;
    private Status status;

    public User(long id, String idstr, String screen_name, String location, String description, String verified_reason, String profile_image_url, String avatar_large, String avatar_hd, String gender, String profile_url, String cover_image_phone, int followers_count, int follow_count, int friends_count, int statuses_count, int verified_type, boolean following, boolean allow_all_act_msg, boolean allow_all_comment, boolean verified, boolean follow_me, Status status) {
        this.id = id;
        this.idstr = idstr;
        this.screen_name = screen_name;
        this.location = location;
        this.description = description;
        this.verified_reason = verified_reason;
        this.profile_image_url = profile_image_url;
        this.avatar_large = avatar_large;
        this.avatar_hd = avatar_hd;
        this.gender = gender;
        this.profile_url = profile_url;
        this.cover_image_phone = cover_image_phone;
        this.followers_count = followers_count;
        this.follow_count = follow_count;
        this.friends_count = friends_count;
        this.statuses_count = statuses_count;
        this.verified_type = verified_type;
        this.following = following;
        this.allow_all_act_msg = allow_all_act_msg;
        this.allow_all_comment = allow_all_comment;
        this.verified = verified;
        this.follow_me = follow_me;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIdstr() {
        return idstr;
    }

    public void setIdstr(String idstr) {
        this.idstr = idstr;
    }

    public String getScreen_name() {
        return screen_name;
    }

    public void setScreen_name(String screen_name) {
        this.screen_name = screen_name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVerified_reason() {
        return verified_reason;
    }

    public void setVerified_reason(String verified_reason) {
        this.verified_reason = verified_reason;
    }

    public String getProfile_image_url() {
        return profile_image_url;
    }

    public void setProfile_image_url(String profile_image_url) {
        this.profile_image_url = profile_image_url;
    }

    public String getAvatar_large() {
        return avatar_large;
    }

    public void setAvatar_large(String avatar_large) {
        this.avatar_large = avatar_large;
    }

    public String getAvatar_hd() {
        return avatar_hd;
    }

    public void setAvatar_hd(String avatar_hd) {
        this.avatar_hd = avatar_hd;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getProfile_url() {
        return profile_url;
    }

    public void setProfile_url(String profile_url) {
        this.profile_url = profile_url;
    }

    public String getCover_image_phone() {
        return cover_image_phone;
    }

    public void setCover_image_phone(String cover_image_phone) {
        this.cover_image_phone = cover_image_phone;
    }

    public int getFollowers_count() {
        return followers_count;
    }

    public void setFollowers_count(int followers_count) {
        this.followers_count = followers_count;
    }

    public int getFriends_count() {
        return friends_count;
    }

    public void setFriends_count(int friends_count) {
        this.friends_count = friends_count;
    }

    public int getFollow_count() {
        return follow_count;
    }

    public void setFollow_count(int follow_count) {
        this.follow_count = follow_count;
    }

    public int getStatuses_count() {
        return statuses_count;
    }

    public void setStatuses_count(int statuses_count) {
        this.statuses_count = statuses_count;
    }

    public int getVerified_type() {
        return verified_type;
    }

    public void setVerified_type(int verified_type) {
        this.verified_type = verified_type;
    }

    public boolean isFollowing() {
        return following;
    }

    public void setFollowing(boolean following) {
        this.following = following;
    }

    public boolean isAllow_all_act_msg() {
        return allow_all_act_msg;
    }

    public void setAllow_all_act_msg(boolean allow_all_act_msg) {
        this.allow_all_act_msg = allow_all_act_msg;
    }

    public boolean isAllow_all_comment() {
        return allow_all_comment;
    }

    public void setAllow_all_comment(boolean allow_all_comment) {
        this.allow_all_comment = allow_all_comment;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public boolean isFollow_me() {
        return follow_me;
    }

    public void setFollow_me(boolean follow_me) {
        this.follow_me = follow_me;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
