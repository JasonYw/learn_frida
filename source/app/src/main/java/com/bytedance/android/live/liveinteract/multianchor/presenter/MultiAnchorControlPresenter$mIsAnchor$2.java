package com.bytedance.android.live.liveinteract.multianchor.presenter;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C423702pg;
import p003X.C423712ph;
import p003X.HNI;

/* loaded from: classes3.dex */
public final class MultiAnchorControlPresenter$mIsAnchor$2 extends Lambda implements Function0<Boolean> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ HNI this$0;

    static {
        Covode.recordClassIndex(28326);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiAnchorControlPresenter$mIsAnchor$2(HNI hni) {
        super(0);
        this.this$0 = hni;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Boolean mo30099invoke() {
        C423712ph LIZ;
        boolean z = false;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            z = ((Boolean) proxy.result).booleanValue();
        } else {
            DataCenter dataCenter = this.this$0.LJJ;
            if (dataCenter != null && (LIZ = C423702pg.LIZ(dataCenter)) != null) {
                z = LIZ.LIZLLL;
            }
        }
        return Boolean.valueOf(z);
    }
}
