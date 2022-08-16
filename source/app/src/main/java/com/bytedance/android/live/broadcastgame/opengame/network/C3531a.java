package com.bytedance.android.live.broadcastgame.opengame.network;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.network.a */
/* loaded from: classes5.dex */
public class C3531a {
    @SerializedName("room_crypt")
    public C3533b LIZ;
    @SerializedName("ability_list")
    public List<C3532a> LIZIZ;
    @SerializedName("domain_allow_list")
    public List<C3534c> LIZJ;
    @SerializedName("disable_interact_im")
    public boolean LIZLLL;
    @SerializedName("block_consume_list")

    /* renamed from: LJ */
    public boolean f26069LJ;
    @SerializedName("live_scene")
    public List<Integer> LJFF;
    @SerializedName("game_category")
    public String LJI;

    /* renamed from: com.bytedance.android.live.broadcastgame.opengame.network.a$a */
    /* loaded from: classes5.dex */
    public static class C3532a {
        @SerializedName("name")
        public String LIZ = "";
        @SerializedName("max_times")
        public int LIZIZ;
        @SerializedName("unit_time")
        public int LIZJ;
        @SerializedName("auth_info")
        public Map<String, Long> LIZLLL;

        static {
            Covode.recordClassIndex(20339);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.opengame.network.a$b */
    /* loaded from: classes5.dex */
    public static class C3533b {
        @SerializedName("key")
        public String LIZ = "";

        static {
            Covode.recordClassIndex(20340);
        }
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.opengame.network.a$c */
    /* loaded from: classes5.dex */
    public static class C3534c {
        @SerializedName("domain")
        public String LIZ = "";
        @SerializedName("kind")
        public long LIZIZ = 1;

        static {
            Covode.recordClassIndex(20341);
        }
    }

    static {
        Covode.recordClassIndex(20338);
    }
}
