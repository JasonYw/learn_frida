package com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.p348b;

import android.view.View;
import com.bytedance.android.livesdk.chatroom.interact.model.C6061r;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;

/* renamed from: com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.b.m$d */
/* loaded from: classes3.dex */
public abstract class m$d extends b$b<m$b> implements m$c {
    public static ChangeQuickRedirect LJIIJJI;
    public HashMap LIZ;

    static {
        Covode.recordClassIndex(25701);
    }

    public View LIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LJIIJJI, false, 1);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (this.LIZ == null) {
            this.LIZ = new HashMap();
        }
        View view = (View) this.LIZ.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.LIZ.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public abstract void LIZ(C6061r c6061r);

    public abstract void LIZ(Throwable th);

    public void LIZLLL() {
        HashMap hashMap;
        if (!PatchProxy.proxy(new Object[0], this, LJIIJJI, false, 2).isSupported && (hashMap = this.LIZ) != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.android.live.core.p317e.C4070a, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, LJIIJJI, false, 3).isSupported) {
            return;
        }
        super.onDestroyView();
        LIZLLL();
    }
}
