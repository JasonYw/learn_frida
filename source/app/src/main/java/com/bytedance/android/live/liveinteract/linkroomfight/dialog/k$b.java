package com.bytedance.android.live.liveinteract.linkroomfight.dialog;

import com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.p348b.b$b;
import com.bytedance.android.livesdk.chatroom.model.interact.C6177q;
import com.bytedance.android.livesdk.chatroom.model.interact.C6178r;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class k$b extends b$b<k$a> {
    public static ChangeQuickRedirect LIZ;
    public HashMap LIZIZ;

    static {
        Covode.recordClassIndex(27754);
    }

    public abstract void LIZ(C6177q c6177q);

    public abstract void LIZ(Throwable th);

    public abstract void LIZ(List<String> list);

    public abstract void LIZIZ(Throwable th);

    public abstract void LIZIZ(List<? extends C6178r> list);

    public abstract void LJIIJ();

    public void LJIIJJI() {
        HashMap hashMap;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported && (hashMap = this.LIZIZ) != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.live.core.p317e.C4070a, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        super.onDestroyView();
        LJIIJJI();
    }
}
