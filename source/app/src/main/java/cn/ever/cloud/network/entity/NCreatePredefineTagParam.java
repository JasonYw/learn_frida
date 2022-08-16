package cn.ever.cloud.network.entity;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes23.dex */
public final class NCreatePredefineTagParam {
    @SerializedName("cover_link")
    public final Long coverLink;
    @SerializedName("cover_md5")
    public final String coverMd5;
    @SerializedName("created_at_utc")
    public final Long createdAtUtc;
    @SerializedName("tag_id")
    public final long tagId;
    @SerializedName("tag_name")
    public final String tagName;

    static {
        Covode.recordClassIndex(3204);
    }

    public final Long getCoverLink() {
        return this.coverLink;
    }

    public final String getCoverMd5() {
        return this.coverMd5;
    }

    public final Long getCreatedAtUtc() {
        return this.createdAtUtc;
    }

    public final long getTagId() {
        return this.tagId;
    }

    public final String getTagName() {
        return this.tagName;
    }

    public NCreatePredefineTagParam(long j, String str, String str2, Long l, Long l2) {
        this.tagId = j;
        this.tagName = str;
        this.coverMd5 = str2;
        this.coverLink = l;
        this.createdAtUtc = l2;
    }
}
