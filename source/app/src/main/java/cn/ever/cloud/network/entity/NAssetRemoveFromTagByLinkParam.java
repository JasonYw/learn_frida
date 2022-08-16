package cn.ever.cloud.network.entity;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class NAssetRemoveFromTagByLinkParam {
    @SerializedName("links")
    public final List<NTagAssetLink> links;
    @SerializedName("tag_id")
    public final long tagId;

    static {
        Covode.recordClassIndex(3195);
    }

    public final List<NTagAssetLink> getLinks() {
        return this.links;
    }

    public final long getTagId() {
        return this.tagId;
    }

    public NAssetRemoveFromTagByLinkParam(long j, List<NTagAssetLink> list) {
        C106862S5w.LIZ(list);
        this.tagId = j;
        this.links = list;
    }
}
