package com.bytedance.android.live.base.model.feed;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;

/* renamed from: com.bytedance.android.live.base.model.feed.b */
/* loaded from: classes8.dex */
public class C2829b {
    @SerializedName("live_feed_preload_style_one")
    public int LIZ;
    @SerializedName("live_feed_preload_style_two")
    public int LIZIZ;
    @SerializedName("live_feed_preload_in_room")
    public int LIZJ;
    @SerializedName("live_feed_preload_new_feed")
    public int LIZLLL = 2;

    static {
        Covode.recordClassIndex(14039);
    }

    public final int LIZ() {
        return (this.LIZIZ - 1) * 2;
    }
}
