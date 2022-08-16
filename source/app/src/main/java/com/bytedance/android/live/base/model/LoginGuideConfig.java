package com.bytedance.android.live.base.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes5.dex */
public class LoginGuideConfig {
    @SerializedName("from_comment")
    public String fromComment;
    @SerializedName("from_default")
    public String fromDefault;
    @SerializedName("from_favorite")
    public String fromFavorite;
    @SerializedName("from_follow")
    public String fromFollow;
    @SerializedName("from_home_upper_right")
    public String fromHomeUpperRight;
    @SerializedName("image_url_from_comment")
    public String imageUrlFromComment;
    @SerializedName("image_url_from_default")
    public String imageUrlFromDefault;
    @SerializedName("image_url_from_favorite")
    public String imageUrlFromFavorite;
    @SerializedName("image_url_from_follow")
    public String imageUrlFromFollow;
    @SerializedName("image_url_from_home_upper_right")
    public String imageUrlFromHomeUpperRight;

    static {
        Covode.recordClassIndex(13964);
    }

    public String getFromComment() {
        return this.fromComment;
    }

    public String getFromDefault() {
        return this.fromDefault;
    }

    public String getFromFavorite() {
        return this.fromFavorite;
    }

    public String getFromFollow() {
        return this.fromFollow;
    }

    public String getFromHomeUpperRight() {
        return this.fromHomeUpperRight;
    }

    public String getImageUrlFromComment() {
        return this.imageUrlFromComment;
    }

    public String getImageUrlFromDefault() {
        return this.imageUrlFromDefault;
    }

    public String getImageUrlFromFavorite() {
        return this.imageUrlFromFavorite;
    }

    public String getImageUrlFromFollow() {
        return this.imageUrlFromFollow;
    }

    public String getImageUrlFromHomeUpperRight() {
        return this.imageUrlFromHomeUpperRight;
    }

    public void setFromComment(String str) {
        this.fromComment = str;
    }

    public void setFromDefault(String str) {
        this.fromDefault = str;
    }

    public void setFromFavorite(String str) {
        this.fromFavorite = str;
    }

    public void setFromFollow(String str) {
        this.fromFollow = str;
    }

    public void setFromHomeUpperRight(String str) {
        this.fromHomeUpperRight = str;
    }

    public void setImageUrlFromComment(String str) {
        this.imageUrlFromComment = str;
    }

    public void setImageUrlFromDefault(String str) {
        this.imageUrlFromDefault = str;
    }

    public void setImageUrlFromFavorite(String str) {
        this.imageUrlFromFavorite = str;
    }

    public void setImageUrlFromFollow(String str) {
        this.imageUrlFromFollow = str;
    }

    public void setImageUrlFromHomeUpperRight(String str) {
        this.imageUrlFromHomeUpperRight = str;
    }
}
