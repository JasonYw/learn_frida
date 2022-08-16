package com.android.ttcjpaysdk.bindcard.unionpay.p148ui;

import com.android.ttcjpaysdk.bindcard.unionpay.applog.C2251e;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C135544cCh;

/* renamed from: com.android.ttcjpaysdk.bindcard.unionpay.ui.UnionPayTwoElementsActivity$showConflictDialog$1 */
/* loaded from: classes17.dex */
public final class UnionPayTwoElementsActivity$showConflictDialog$1 extends Lambda implements Function1<Integer, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ UnionPayTwoElementsActivity this$0;

    static {
        Covode.recordClassIndex(7378);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnionPayTwoElementsActivity$showConflictDialog$1(UnionPayTwoElementsActivity unionPayTwoElementsActivity) {
        super(1);
        this.this$0 = unionPayTwoElementsActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Integer num) {
        C135544cCh c135544cCh;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(num.intValue())}, this, changeQuickRedirect, false, 1).isSupported && (c135544cCh = this.this$0.mvpLogger) != null && !PatchProxy.proxy(new Object[0], c135544cCh, C2251e.LIZIZ, false, 8).isSupported) {
            c135544cCh.LIZ("wallet_businesstopay_auth_fail_click", MapsKt__MapsKt.hashMapOf(TuplesKt.m137to("auth_type", "two_elements")));
        }
        return Unit.INSTANCE;
    }
}
