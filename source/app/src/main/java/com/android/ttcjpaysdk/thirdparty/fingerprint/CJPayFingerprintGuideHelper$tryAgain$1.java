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
import p003X.C136968cZf;

/* loaded from: classes17.dex */
public final class CJPayFingerprintGuideHelper$tryAgain$1 extends Lambda implements Function1<Activity, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Activity $activity;
    public final /* synthetic */ DialogC2355b $fingerprintDialog;
    public final /* synthetic */ C136968cZf this$0;

    static {
        Covode.recordClassIndex(8413);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CJPayFingerprintGuideHelper$tryAgain$1(C136968cZf c136968cZf, DialogC2355b dialogC2355b, Activity activity) {
        super(1);
        this.this$0 = c136968cZf;
        this.$fingerprintDialog = dialogC2355b;
        this.$activity = activity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Activity activity) {
        Activity activity2 = activity;
        if (!PatchProxy.proxy(new Object[]{activity2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(activity2);
            this.$fingerprintDialog.LIZ(activity2.getString(2131561661), C116971W2r.LIZ(activity2.getResources(), 2131623990));
            this.this$0.LJFF.postDelayed(new Runnable() { // from class: com.android.ttcjpaysdk.thirdparty.fingerprint.CJPayFingerprintGuideHelper$tryAgain$1.1
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(8414);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    CJPayFingerprintGuideHelper$tryAgain$1.this.this$0.LIZ(CJPayFingerprintGuideHelper$tryAgain$1.this.$activity, new C23501());
                }

                /* renamed from: com.android.ttcjpaysdk.thirdparty.fingerprint.CJPayFingerprintGuideHelper$tryAgain$1$1$1 */
                /* loaded from: classes17.dex */
                public static final class C23501 extends Lambda implements Function1<Activity, Unit> {
                    public static ChangeQuickRedirect changeQuickRedirect;

                    static {
                        Covode.recordClassIndex(8415);
                    }

                    public C23501() {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ Unit invoke(Activity activity) {
                        Activity activity2 = activity;
                        if (!PatchProxy.proxy(new Object[]{activity2}, this, changeQuickRedirect, false, 1).isSupported) {
                            C106862S5w.LIZ(activity2);
                            CJPayFingerprintGuideHelper$tryAgain$1.this.$fingerprintDialog.LIZ(activity2.getString(2131561664), C116971W2r.LIZ(activity2.getResources(), 2131623985));
                        }
                        return Unit.INSTANCE;
                    }
                }
            }, 1000L);
        }
        return Unit.INSTANCE;
    }
}
