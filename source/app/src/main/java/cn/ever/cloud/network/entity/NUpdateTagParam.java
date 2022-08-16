package cn.ever.cloud.network.entity;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes23.dex */
public final class NUpdateTagParam {
    @SerializedName("cover_link")
    public final Long coverLink;
    @SerializedName("cover_md5")
    public final String coverMd5;
    @SerializedName("predefine_album_edit")
    public final Boolean predefineAlbumEdit;
    @SerializedName("tag_id")
    public final long tagId;
    @SerializedName("tag_name")
    public final String tagName;

    static {
        Covode.recordClassIndex(3233);
    }

    public final Long getCoverLink() {
        return this.coverLink;
    }

    public final String getCoverMd5() {
        return this.coverMd5;
    }

    public final Boolean getPredefineAlbumEdit() {
        return this.predefineAlbumEdit;
    }

    public final long getTagId() {
        return this.tagId;
    }

    public final String getTagName() {
        return this.tagName;
    }

    public NUpdateTagParam(long j, String str, String str2, Long l, Boolean bool) {
        this.tagId = j;
        this.tagName = str;
        this.coverMd5 = str2;
        this.coverLink = l;
        this.predefineAlbumEdit = bool;
    }
}
