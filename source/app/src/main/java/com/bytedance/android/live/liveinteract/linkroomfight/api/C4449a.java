package com.bytedance.android.live.liveinteract.linkroomfight.api;

import com.bytedance.android.live.liveinteract.linkroomfight.p363a.C4444c;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.bytedance.android.live.liveinteract.linkroomfight.api.a */
/* loaded from: classes3.dex */
public final class C4449a {
    @SerializedName("room_lists")
    public HashMap<Long, C4450a> LIZ = new HashMap<>();

    /* renamed from: com.bytedance.android.live.liveinteract.linkroomfight.api.a$a */
    /* loaded from: classes3.dex */
    public static final class C4450a {
        @SerializedName("rooms")
        public List<C4444c> LIZ = new ArrayList();
        @SerializedName("list_type")
        public int LIZIZ;

        static {
            Covode.recordClassIndex(27549);
        }
    }

    static {
        Covode.recordClassIndex(27548);
    }
}
