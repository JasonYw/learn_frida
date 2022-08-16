package com.bytedance.android.live.liveinteract.api.chatroom.model;

import com.bytedance.android.livesdk.config.ba$a;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;

/* renamed from: com.bytedance.android.live.liveinteract.api.chatroom.model.b */
/* loaded from: classes3.dex */
public final class C4276b {
    @SerializedName("version")
    public int LIZ;
    @SerializedName("style_layout_config_map")
    public HashMap<Integer, C4277a> LIZIZ = new HashMap<>();

    /* renamed from: com.bytedance.android.live.liveinteract.api.chatroom.model.b$a */
    /* loaded from: classes3.dex */
    public static final class C4277a {
        @SerializedName("layout_config_map")
        public HashMap<Integer, ba$a> LIZ = new HashMap<>();

        static {
            Covode.recordClassIndex(25148);
        }
    }

    static {
        Covode.recordClassIndex(25147);
    }
}
