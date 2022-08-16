package com.android.ttcjpaysdk.thirdparty.verify.p176a;

import android.view.View;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.android.ttcjpaysdk.thirdparty.base.CJPayBaseFragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* renamed from: com.android.ttcjpaysdk.thirdparty.verify.a.a */
/* loaded from: classes17.dex */
public abstract class AbstractC2392a extends CJPayBaseFragment {
    public static ChangeQuickRedirect LIZ;
    public boolean LIZIZ;
    public int LIZJ = 1;
    public int LIZLLL = 1;

    static {
        Covode.recordClassIndex(8888);
    }

    public final void LIZ() {
        this.LIZIZ = true;
    }

    public void LIZLLL() {
    }

    public void LJII() {
    }

    public boolean LJIIIIZZ() {
        return true;
    }

    public boolean LJIIIZ() {
        return true;
    }

    public boolean LJIIJ() {
        return true;
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    /* renamed from: LJ */
    public final int mo16030LJ() {
        return this.LIZJ;
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public final int LJFF() {
        return this.LIZLLL;
    }

    public void LIZIZ(int i) {
        this.LIZLLL = i;
    }

    public void LIZ(int i) {
        this.LIZJ = i;
    }

    @Override // com.android.ttcjpaysdk.base.framework.BaseFragment
    public View LIZJ(View view) {
        int i;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (this.LIZIZ) {
            i = CJPayBasicUtils.getStatusBarHeight(CJPayHostInfo.applicationContext);
        } else {
            i = 0;
        }
        view.setPadding(0, i, 0, 0);
        return view;
    }
}
