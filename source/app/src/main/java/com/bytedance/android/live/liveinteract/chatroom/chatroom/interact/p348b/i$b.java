package com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.p348b;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import p003X.C80013HgN;

/* renamed from: com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.b.i$b */
/* loaded from: classes3.dex */
public abstract class i$b extends b$b<i$a> {
    public static ChangeQuickRedirect LIZ;
    public HashMap LIZIZ;

    static {
        Covode.recordClassIndex(25688);
    }

    public View LIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (this.LIZIZ == null) {
            this.LIZIZ = new HashMap();
        }
        View view = (View) this.LIZIZ.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.LIZIZ.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public abstract void LIZ(C80013HgN c80013HgN);

    /* renamed from: LJ */
    public void mo15765LJ() {
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
        mo15765LJ();
    }
}
