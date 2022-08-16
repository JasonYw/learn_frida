package com.android.ttcjpaysdk.thirdparty.fingerprint;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.RunnableC136975cZm;

/* renamed from: com.android.ttcjpaysdk.thirdparty.fingerprint.CJPayFingerprintGuideHelper$showFingerprintGuide$$inlined$apply$lambda$2$1 */
/* loaded from: classes17.dex */
public final class C2347x85967123 extends Lambda implements Function1<Activity, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ RunnableC136975cZm this$0;

    static {
        Covode.recordClassIndex(8412);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2347x85967123(RunnableC136975cZm runnableC136975cZm) {
        super(1);
        this.this$0 = runnableC136975cZm;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Activity activity) {
        if (!PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(activity);
            if (!this.this$0.LIZIZ.LIZIZ) {
                C116971W2r.LIZJ(this.this$0.LIZLLL);
            }
        }
        return Unit.INSTANCE;
    }
}
