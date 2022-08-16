package com.android.ttcjpaysdk.bindcard.quickbind.p144ui;

import com.android.ttcjpaysdk.bindcard.quickbind.applog.C2237e;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.android.ttcjpaysdk.bindcard.quickbind.ui.TwoElementAuthActivity$showConflictDialog$1 */
/* loaded from: classes17.dex */
public final class TwoElementAuthActivity$showConflictDialog$1 extends Lambda implements Function1<Integer, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ TwoElementAuthActivity this$0;

    static {
        Covode.recordClassIndex(7304);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TwoElementAuthActivity$showConflictDialog$1(TwoElementAuthActivity twoElementAuthActivity) {
        super(1);
        this.this$0 = twoElementAuthActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Integer num) {
        C2237e c2237e;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(num.intValue())}, this, changeQuickRedirect, false, 1).isSupported && (c2237e = this.this$0.mvpLogger) != null) {
            c2237e.m16057LJ();
        }
        return Unit.INSTANCE;
    }
}
