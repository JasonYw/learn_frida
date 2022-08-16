package com.bytedance.android.live.liveinteract.voicechat.panel.p394a;

import com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.p348b.b$a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* renamed from: com.bytedance.android.live.liveinteract.voicechat.panel.a.c$a */
/* loaded from: classes3.dex */
public abstract class c$a extends b$a<c$b> {

    /* renamed from: LJ */
    public static ChangeQuickRedirect f26498LJ;

    static {
        Covode.recordClassIndex(31639);
    }

    public abstract void LIZ(long j);

    public abstract void LIZ(boolean z, int i, String str);

    public c$a(c$b c_b) {
        super(c_b);
    }

    public static /* synthetic */ void LIZ(c$a c_a, boolean z, int i, String str, int i2, Object obj) {
        if (PatchProxy.proxy(new Object[]{c_a, Byte.valueOf(z ? (byte) 1 : (byte) 0), 0, str, Integer.valueOf(i2), null}, null, f26498LJ, true, 1).isSupported) {
            return;
        }
        if ((i2 & 2) != 0) {
            i = 20;
        }
        if ((i2 & 4) != 0) {
            str = "";
        }
        c_a.LIZ(z, i, str);
    }
}
