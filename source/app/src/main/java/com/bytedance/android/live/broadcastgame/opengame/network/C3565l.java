package com.bytedance.android.live.broadcastgame.opengame.network;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.network.l */
/* loaded from: classes5.dex */
public final class C3565l {
    @SerializedName("rank_list")
    public List<C3566a> LIZ;

    /* renamed from: com.bytedance.android.live.broadcastgame.opengame.network.l$a */
    /* loaded from: classes5.dex */
    public class C3566a {
        @SerializedName("user_id")
        public long LIZ;
        @SerializedName("nick_name")
        public String LIZIZ;
        @SerializedName("avatar_url")
        public String LIZJ;
        @SerializedName("diamonds")
        public long LIZLLL;

        static {
            Covode.recordClassIndex(20428);
        }
    }

    static {
        Covode.recordClassIndex(20427);
    }
}
