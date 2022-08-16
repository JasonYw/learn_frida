package com.bytedance.android.live.liveinteract.linkroomfight.api;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.live.liveinteract.linkroomfight.api.c */
/* loaded from: classes3.dex */
public final class C4452c {
    @SerializedName("has_more")
    public boolean LIZ;
    @SerializedName("records")
    public List<C4453a> LIZIZ = new ArrayList();

    /* renamed from: com.bytedance.android.live.liveinteract.linkroomfight.api.c$a */
    /* loaded from: classes3.dex */
    public static final class C4453a {
        public static ChangeQuickRedirect LIZ;
        @SerializedName("rival_user")
        public User LIZIZ;
        @SerializedName("finish_time")
        public long LIZJ;
        @SerializedName("battle_result")
        public int LIZLLL;

        static {
            Covode.recordClassIndex(27552);
        }
    }

    static {
        Covode.recordClassIndex(27551);
    }
}
