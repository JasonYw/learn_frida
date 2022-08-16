package cn.ever.cloud.network.entity;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class NPagination {
    @SerializedName("has_more")
    public final boolean hasMore;
    @SerializedName("next")
    public final String next;

    static {
        Covode.recordClassIndex(3225);
    }

    public final boolean getHasMore() {
        return this.hasMore;
    }

    public final String getNext() {
        return this.next;
    }

    public NPagination(String str, boolean z) {
        C106862S5w.LIZ(str);
        this.next = str;
        this.hasMore = z;
    }
}
