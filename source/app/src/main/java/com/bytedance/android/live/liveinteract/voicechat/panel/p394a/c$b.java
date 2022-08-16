package com.bytedance.android.live.liveinteract.voicechat.panel.p394a;

import com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.p348b.b$b;
import com.bytedance.android.live.liveinteract.plantform.model.C4822q;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.bytedance.android.live.liveinteract.voicechat.panel.a.c$b */
/* loaded from: classes3.dex */
public abstract class c$b extends b$b<c$a> {
    public static ChangeQuickRedirect LJIJJLI;
    public HashMap LIZ;

    static {
        Covode.recordClassIndex(31640);
    }

    public abstract void LIZ(Throwable th);

    public abstract void LIZ(List<C4822q> list, int i, boolean z, String str);

    /* renamed from: LJ */
    public abstract void mo15641LJ();

    public abstract void LJIIJ();

    public void LJIIJJI() {
        HashMap hashMap;
        if (!PatchProxy.proxy(new Object[0], this, LJIJJLI, false, 2).isSupported && (hashMap = this.LIZ) != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.live.core.p317e.C4070a, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, LJIJJLI, false, 3).isSupported) {
            return;
        }
        super.onDestroyView();
        LJIIJJI();
    }
}
