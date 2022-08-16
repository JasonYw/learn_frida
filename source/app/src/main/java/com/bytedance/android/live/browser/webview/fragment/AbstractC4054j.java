package com.bytedance.android.live.browser.webview.fragment;

import android.view.View;
import com.bytedance.android.live.browser.C4053p;
import com.bytedance.android.live.schema.p437vo.BaseHybridParamVo;
import com.bytedance.android.livesdk.C9078n;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.scalpel.scenemanager.core.AbstractC13971f;
import java.util.HashMap;
import p003X.AbstractC101281Pud;

/* renamed from: com.bytedance.android.live.browser.webview.fragment.j */
/* loaded from: classes8.dex */
public abstract class AbstractC4054j extends C9078n implements AbstractC13971f {
    public static ChangeQuickRedirect LIZ;
    public HashMap LIZIZ;

    static {
        Covode.recordClassIndex(23189);
    }

    @Override // com.bytedance.android.livesdk.C9078n, p003X.C88402KsO
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

    public abstract void LIZ(AbstractC101281Pud abstractC101281Pud);

    public abstract void LIZ(C4053p c4053p);

    public abstract void LIZ(String str, int i, int i2, int i3, int i4, BaseHybridParamVo.HybridType hybridType);

    public abstract void LIZ(boolean z);

    public abstract void LIZIZ(boolean z);

    @Override // com.bytedance.android.livesdk.C9078n, p003X.C88402KsO
    public void LIZJ() {
        HashMap hashMap;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported && (hashMap = this.LIZIZ) != null) {
            hashMap.clear();
        }
    }

    public abstract void LIZJ(boolean z);

    public abstract void LIZLLL(boolean z);

    @Override // com.bytedance.android.livesdk.C9078n, p003X.C88402KsO, com.bytedance.scalpel.scenemanager.core.AbstractC13971f
    public String getSceneFullName() {
        return "com/bytedance/android/live/browser/webview/fragment/BaseWebDialogFragment";
    }

    @Override // com.bytedance.android.livesdk.C9078n, p003X.C88402KsO, com.bytedance.scalpel.scenemanager.core.AbstractC13971f
    public String getSceneSimpleName() {
        return "BaseWebDialogFragment";
    }

    @Override // com.bytedance.android.livesdk.C9078n, p003X.C88402KsO, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        super.onDestroyView();
        LIZJ();
    }
}
