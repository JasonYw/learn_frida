package cn.ever.cloud.network.entity;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class NCreateTagParam {
    @SerializedName("cover_link")
    public final Long coverLink;
    @SerializedName("cover_md5")
    public final String coverMd5;
    @SerializedName("created_at_utc")
    public final Long createdAtUtc;
    @SerializedName("tag_name")
    public final String tagName;

    static {
        Covode.recordClassIndex(3205);
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

    public final String getTagName() {
        return this.tagName;
    }

    public NCreateTagParam(String str, String str2, Long l, Long l2) {
        C106862S5w.LIZ(str);
        this.tagName = str;
        this.coverMd5 = str2;
        this.coverLink = l;
        this.createdAtUtc = l2;
    }
}
