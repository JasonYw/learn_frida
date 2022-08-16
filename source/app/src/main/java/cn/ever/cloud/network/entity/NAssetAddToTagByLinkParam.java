package cn.ever.cloud.network.entity;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class NAssetAddToTagByLinkParam {
    @SerializedName("added_at_utc")
    public final long addedAtUtc;
    @SerializedName("links")
    public final List<NTagAssetLink> links;
    @SerializedName("predefine_album_edit")
    public final Boolean predefineAlbumEdit;
    @SerializedName("tag_id")
    public final long tagId;

    static {
        Covode.recordClassIndex(3187);
    }

    public final long getAddedAtUtc() {
        return this.addedAtUtc;
    }

    public final List<NTagAssetLink> getLinks() {
        return this.links;
    }

    public final Boolean getPredefineAlbumEdit() {
        return this.predefineAlbumEdit;
    }

    public final long getTagId() {
        return this.tagId;
    }

    public NAssetAddToTagByLinkParam(long j, List<NTagAssetLink> list, long j2, Boolean bool) {
        C106862S5w.LIZ(list);
        this.tagId = j;
        this.links = list;
        this.addedAtUtc = j2;
        this.predefineAlbumEdit = bool;
    }
}
