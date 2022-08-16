package com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.viewbinder;

import com.bytedance.android.livesdkapi.depend.model.live.C9556o;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C106862S5w;

/* loaded from: classes3.dex */
public final class n$a {
    public static ChangeQuickRedirect LIZ;
    public C9556o LIZJ;
    public int LIZLLL;
    public int LIZIZ = 8;

    /* renamed from: LJ */
    public Integer f26276LJ = 0;
    public String LJFF = "";

    static {
        Covode.recordClassIndex(26058);
    }

    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.LJFF = str;
    }
}
