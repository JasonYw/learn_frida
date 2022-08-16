package cn.ever.cloud.network.entity;

import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.google.gson.annotations.SerializedName;
import com.umeng.commonsdk.vchannel.C33968a;
import java.util.List;
import p003X.C106862S5w;
import p003X.C109391T5d;

/* loaded from: classes23.dex */
public final class NAsset {
    @SerializedName("audio")
    public final NAssetAudio audio;
    @SerializedName("creation_time_utc")
    public final Long creationTimeUtc;
    @SerializedName("creator")
    public final long creator;
    @SerializedName("face_feature_version")
    public final Long faceFeatureVersion;
    @SerializedName("generated_at_utc")
    public final Long generatedAtUtc;
    @SerializedName("gps")
    public final NGps gps;
    @SerializedName(C109391T5d.LJFF)
    public final Long height;
    @SerializedName(C33968a.f42937f)

    /* renamed from: id */
    public final long f21063id;
    @SerializedName("ios_ids")
    public final List<String> iosIds;
    @SerializedName("live_photo_video")
    public final NAssetLivePhoto livePhotoVideo;
    @SerializedName("mime")
    public final String mime;
    @SerializedName("orientation")
    public final Long orientation;
    @SerializedName(UGCMonitor.TYPE_PHOTO)
    public final NAssetPhoto photo;
    @SerializedName("quality")
    public final Long quality;
    @SerializedName("source_path")
    public final String sourcePath;
    @SerializedName("status")
    public final long status;
    @SerializedName("subType")
    public final String subType;
    @SerializedName("tags")
    public final List<Long> tags;
    @SerializedName("tags_v2")
    public final List<NTagV2> tagsV2;
    @SerializedName("taken_utc")
    public final Long takenUtc;
    @SerializedName("uploaded_at_utc")
    public final Long uploadedAtUtc;
    @SerializedName("version")
    public final Long version;
    @SerializedName("video")
    public final NAssetVideo video;
    @SerializedName("width")
    public final Long width;

    static {
        Covode.recordClassIndex(3186);
    }

    public final NAssetAudio getAudio() {
        return this.audio;
    }

    public final Long getCreationTimeUtc() {
        return this.creationTimeUtc;
    }

    public final long getCreator() {
        return this.creator;
    }

    public final Long getFaceFeatureVersion() {
        return this.faceFeatureVersion;
    }

    public final Long getGeneratedAtUtc() {
        return this.generatedAtUtc;
    }

    public final NGps getGps() {
        return this.gps;
    }

    public final Long getHeight() {
        return this.height;
    }

    public final long getId() {
        return this.f21063id;
    }

    public final List<String> getIosIds() {
        return this.iosIds;
    }

    public final NAssetLivePhoto getLivePhotoVideo() {
        return this.livePhotoVideo;
    }

    public final String getMime() {
        return this.mime;
    }

    public final Long getOrientation() {
        return this.orientation;
    }

    public final NAssetPhoto getPhoto() {
        return this.photo;
    }

    public final Long getQuality() {
        return this.quality;
    }

    public final String getSourcePath() {
        return this.sourcePath;
    }

    public final long getStatus() {
        return this.status;
    }

    public final String getSubType() {
        return this.subType;
    }

    public final List<Long> getTags() {
        return this.tags;
    }

    public final List<NTagV2> getTagsV2() {
        return this.tagsV2;
    }

    public final Long getTakenUtc() {
        return this.takenUtc;
    }

    public final Long getUploadedAtUtc() {
        return this.uploadedAtUtc;
    }

    public final Long getVersion() {
        return this.version;
    }

    public final NAssetVideo getVideo() {
        return this.video;
    }

    public final Long getWidth() {
        return this.width;
    }

    public NAsset(long j, long j2, long j3, String str, String str2, Long l, Long l2, Long l3, Long l4, List<String> list, Long l5, Long l6, Long l7, Long l8, Long l9, NGps nGps, String str3, List<Long> list2, List<NTagV2> list3, NAssetPhoto nAssetPhoto, NAssetVideo nAssetVideo, NAssetAudio nAssetAudio, NAssetLivePhoto nAssetLivePhoto, Long l10) {
        C106862S5w.LIZ(list, list2, list3);
        this.f21063id = j;
        this.status = j2;
        this.creator = j3;
        this.mime = str;
        this.subType = str2;
        this.creationTimeUtc = l;
        this.takenUtc = l2;
        this.generatedAtUtc = l3;
        this.uploadedAtUtc = l4;
        this.iosIds = list;
        this.width = l5;
        this.height = l6;
        this.orientation = l7;
        this.quality = l8;
        this.faceFeatureVersion = l9;
        this.gps = nGps;
        this.sourcePath = str3;
        this.tags = list2;
        this.tagsV2 = list3;
        this.photo = nAssetPhoto;
        this.video = nAssetVideo;
        this.audio = nAssetAudio;
        this.livePhotoVideo = nAssetLivePhoto;
        this.version = l10;
    }
}
