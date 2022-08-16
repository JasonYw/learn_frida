package com.bytedance.android.live.liveinteract.chatroom.chatroom.list;

import android.app.Activity;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.p348b.b$a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C106862S5w;

/* loaded from: classes3.dex */
public abstract class a$a extends b$a<a$b> {

    /* renamed from: LJ */
    public static ChangeQuickRedirect f26285LJ;

    static {
        Covode.recordClassIndex(26170);
    }

    public abstract void LIZ(int i, Activity activity);

    public abstract void LIZ(long j);

    public abstract void LIZ(boolean z, String str, long j, String str2);

    public abstract void LIZIZ();

    /* renamed from: LJ */
    public abstract void mo15753LJ();

    public abstract void LJFF();

    public abstract void LJI();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a$a(a$b a_b) {
        super(a_b);
        C106862S5w.LIZ(a_b);
    }

    public static /* synthetic */ void LIZ(a$a a_a, boolean z, String str, long j, String str2, int i, Object obj) {
        if (PatchProxy.proxy(new Object[]{a_a, Byte.valueOf(z ? (byte) 1 : (byte) 0), str, 0L, str2, Integer.valueOf(i), null}, null, f26285LJ, true, 1).isSupported) {
            return;
        }
        if ((i & 4) != 0) {
            j = 20;
        }
        if ((i & 8) != 0) {
            str2 = "";
        }
        a_a.LIZ(z, str, j, str2);
    }
}
