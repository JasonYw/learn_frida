package com.bytedance.android.live.liveinteract.linkroomfight.p363a;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.linker.InviteSource;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import p003X.C106862S5w;
import p003X.H41;

/* renamed from: com.bytedance.android.live.liveinteract.linkroomfight.a.c */
/* loaded from: classes3.dex */
public final class C4444c {
    public static ChangeQuickRedirect LIZ;
    @SerializedName("user")
    public User LIZIZ;
    @SerializedName("room_info")
    public H41 LIZJ;
    @SerializedName("invite_status")
    public int LIZLLL;

    /* renamed from: LJ */
    public InviteSource f26330LJ = InviteSource.UNKNOWN;

    static {
        Covode.recordClassIndex(27498);
    }

    public final void LIZ(InviteSource inviteSource) {
        if (PatchProxy.proxy(new Object[]{inviteSource}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(inviteSource);
        this.f26330LJ = inviteSource;
    }
}
