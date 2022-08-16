package com.android.ttcjpaysdk.integrated.counter.outerpay.controller;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C137061cbB;
import p003X.C137063cbD;

/* loaded from: classes17.dex */
public final class CJDyPayOuterPayController$dispatchWithVersion$2 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C137063cbD this$0;

    static {
        Covode.recordClassIndex(7829);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CJDyPayOuterPayController$dispatchWithVersion$2(C137063cbD c137063cbD) {
        super(0);
        this.this$0 = c137063cbD;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LIZ(C137061cbB.LIZJ);
        }
        return Unit.INSTANCE;
    }
}
