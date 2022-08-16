package com.android.ttcjpaysdk.bdpay.bindcard.normal.view;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C136058cKz;

/* loaded from: classes17.dex */
public final class IndependentCreateBizRespView$onPostFinish$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Activity $activity;

    static {
        Covode.recordClassIndex(6961);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndependentCreateBizRespView$onPostFinish$1(Activity activity) {
        super(0);
        this.$activity = activity;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            C136058cKz.LIZIZ(this.$activity);
        }
        return Unit.INSTANCE;
    }
}
