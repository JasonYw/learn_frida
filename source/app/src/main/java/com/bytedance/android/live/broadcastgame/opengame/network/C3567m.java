package com.bytedance.android.live.broadcastgame.opengame.network;

import com.bytedance.android.livesdk.message.model.C9013l;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.network.m */
/* loaded from: classes5.dex */
public class C3567m {
    @SerializedName("entrances")
    public List<C3568a> LIZ;

    /* renamed from: com.bytedance.android.live.broadcastgame.opengame.network.m$a */
    /* loaded from: classes5.dex */
    public static class C3568a {
        @SerializedName("entrances")
        public C9013l LIZ;
        @SerializedName("disable_entrance")
        public boolean LIZIZ;

        static {
            Covode.recordClassIndex(20430);
        }
    }

    static {
        Covode.recordClassIndex(20429);
    }
}
