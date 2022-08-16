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
import p003X.View$OnClickListenerC136972cZj;

/* renamed from: com.android.ttcjpaysdk.thirdparty.fingerprint.CJPayFingerprintGuideHelper$showFingerprintDialog$$inlined$apply$lambda$1$1 */
/* loaded from: classes17.dex */
public final class C2344x3b22502 extends Lambda implements Function1<Activity, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ View$OnClickListenerC136972cZj this$0;

    static {
        Covode.recordClassIndex(8409);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2344x3b22502(View$OnClickListenerC136972cZj view$OnClickListenerC136972cZj) {
        super(1);
        this.this$0 = view$OnClickListenerC136972cZj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Activity activity) {
        if (!PatchProxy.proxy(new Object[]{activity}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(activity);
            C116971W2r.LIZ(this.this$0.f18113LJ);
        }
        return Unit.INSTANCE;
    }
}
