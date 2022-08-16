package com.android.ttcjpaysdk.bdpay.bindcard.normal.presenter;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C136757cWG;

/* loaded from: classes17.dex */
public final class CardBinPresenter$showFaceCompareLoading$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ boolean $show;
    public final /* synthetic */ C2191b this$0;

    static {
        Covode.recordClassIndex(6767);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardBinPresenter$showFaceCompareLoading$1(C2191b c2191b, boolean z) {
        super(0);
        this.this$0 = c2191b;
        this.$show = z;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            if (this.$show) {
                C136757cWG.f18084LJ.LIZ(this.this$0.getContext(), "");
            } else {
                C136757cWG.f18084LJ.LIZ();
            }
        }
        return Unit.INSTANCE;
    }
}
