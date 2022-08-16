package com.bytedance.android.live.liveinteract.chatroom.chatroom.list;

import android.view.View;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.p348b.b$b;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.model.C4366b;
import com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class a$b extends b$b<a$a> {
    public static ChangeQuickRedirect LIZ;
    public HashMap LIZIZ;

    static {
        Covode.recordClassIndex(26171);
    }

    public abstract void LIZ(int i);

    public abstract void LIZ(C4366b c4366b);

    public abstract void LIZ(Throwable th);

    public abstract void LIZ(List<? extends LinkPlayerInfo> list);

    public abstract void LIZ(List<? extends LinkPlayerInfo> list, int i, boolean z, String str, String str2, boolean z2);

    public abstract void LIZ(boolean z);

    public View LIZIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{2131167003}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (this.LIZIZ == null) {
            this.LIZIZ = new HashMap();
        }
        View view = (View) this.LIZIZ.get(2131167003);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(2131167003);
        this.LIZIZ.put(2131167003, findViewById);
        return findViewById;
    }

    public abstract void LIZIZ(Throwable th);

    public abstract void LIZIZ(List<? extends LinkPlayerInfo> list);

    public abstract void LIZIZ(boolean z);

    /* renamed from: LJ */
    public void mo15754LJ() {
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
        mo15754LJ();
    }
}
