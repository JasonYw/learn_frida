package com.bytedance.android.live.broadcast.preview.p277ui.chooseuser;

import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C77294Gdc;
import p003X.LK1;

/* renamed from: com.bytedance.android.live.broadcast.preview.ui.chooseuser.ChooseLimitUserListFragment$initActions$$inlined$apply$lambda$6 */
/* loaded from: classes3.dex */
public final class ChooseLimitUserListFragment$initActions$$inlined$apply$lambda$6 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C77294Gdc this$0;

    static {
        Covode.recordClassIndex(17368);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChooseLimitUserListFragment$initActions$$inlined$apply$lambda$6(C77294Gdc c77294Gdc) {
        super(0);
        this.this$0 = c77294Gdc;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            C77294Gdc c77294Gdc = this.this$0;
            if (!PatchProxy.proxy(new Object[0], c77294Gdc, C77294Gdc.LIZ, false, 10).isSupported) {
                LoadingStatusView loadingStatusView = (LoadingStatusView) c77294Gdc.LIZ(2131169169);
                Intrinsics.checkNotNullExpressionValue(loadingStatusView, "");
                LK1.LIZJ(loadingStatusView);
                ((LoadingStatusView) c77294Gdc.LIZ(2131169169)).LIZIZ();
            }
        }
        return Unit.INSTANCE;
    }
}
