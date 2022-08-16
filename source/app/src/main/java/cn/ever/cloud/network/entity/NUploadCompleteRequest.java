package cn.ever.cloud.network.entity;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.C106862S5w;
import p003X.C109391T5d;
import p003X.C522466ka;

/* loaded from: classes23.dex */
public final class NUploadCompleteRequest {
    public static final C522466ka Companion = new C522466ka(null);
    @SerializedName("created_at_utc")
    public final Long createdAtUtc;
    @SerializedName("duration")
    public final Long duration;
    @SerializedName(C109391T5d.LJFF)
    public final Long height;
    @SerializedName("ios_id")
    public final String iosId;
    @SerializedName("latitude")
    public final Double latitude;
    @SerializedName("live_photo_md5")
    public final String livePhotoMd5;
    @SerializedName("longitude")
    public final Double longitude;
    @SerializedName("md5")
    public final String md5;
    @SerializedName("orientation")
    public final Long orientation;
    @SerializedName("predefine_album_edit")
    public final Boolean predefineAlbumEdit;
    @SerializedName("preview")
    public final String preview;
    @SerializedName("source_path")
    public final String sourcePath;
    @SerializedName("tag")
    public final Long tag;
    @SerializedName("tag_added_at_utc")
    public final Long tagAddedAtUtc;
    @SerializedName("tag_link")
    public final Long tagLink;
    @SerializedName("taken_utc")
    public final Long takenUtc;
    @SerializedName("width")
    public final Long width;

    static {
        Covode.recordClassIndex(3236);
    }

    public final Long getCreatedAtUtc() {
        return this.createdAtUtc;
    }

    public final Long getDuration() {
        return this.duration;
    }

    public final Long getHeight() {
        return this.height;
    }

    public final String getIosId() {
        return this.iosId;
    }

    public final Double getLatitude() {
        return this.latitude;
    }

    public final String getLivePhotoMd5() {
        return this.livePhotoMd5;
    }

    public final Double getLongitude() {
        return this.longitude;
    }

    public final String getMd5() {
        return this.md5;
    }

    public final Long getOrientation() {
        return this.orientation;
    }

    public final Boolean getPredefineAlbumEdit() {
        return this.predefineAlbumEdit;
    }

    public final String getPreview() {
        return this.preview;
    }

    public final String getSourcePath() {
        return this.sourcePath;
    }

    public final Long getTag() {
        return this.tag;
    }

    public final Long getTagAddedAtUtc() {
        return this.tagAddedAtUtc;
    }

    public final Long getTagLink() {
        return this.tagLink;
    }

    public final Long getTakenUtc() {
        return this.takenUtc;
    }

    public final Long getWidth() {
        return this.width;
    }

    public NUploadCompleteRequest(String str, Long l, Long l2, String str2, Long l3, Long l4, Long l5, Double d, Double d2, Long l6, String str3, String str4, Long l7, Long l8, Long l9, String str5, Boolean bool) {
        C106862S5w.LIZ(str);
        this.md5 = str;
        this.takenUtc = l;
        this.createdAtUtc = l2;
        this.sourcePath = str2;
        this.width = l3;
        this.height = l4;
        this.orientation = l5;
        this.latitude = d;
        this.longitude = d2;
        this.duration = l6;
        this.preview = str3;
        this.iosId = str4;
        this.tag = l7;
        this.tagLink = l8;
        this.tagAddedAtUtc = l9;
        this.livePhotoMd5 = str5;
        this.predefineAlbumEdit = bool;
    }
}
