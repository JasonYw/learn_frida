package com.bytedance.android.live.broadcast.preview.p277ui.chooseuser;

import com.bytedance.android.live.broadcast.preview.viewmodel.C3207d;
import com.bytedance.android.live.uikit.recyclerview.LoadingStatusView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C77294Gdc;
import p003X.C77295Gdd;
import p003X.LK1;
import p003X.LK5;

/* renamed from: com.bytedance.android.live.broadcast.preview.ui.chooseuser.ChooseLimitUserListFragment$initActions$$inlined$apply$lambda$8 */
/* loaded from: classes3.dex */
public final class ChooseLimitUserListFragment$initActions$$inlined$apply$lambda$8 extends Lambda implements Function1<Throwable, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C3207d $this_apply;
    public final /* synthetic */ C77294Gdc this$0;

    static {
        Covode.recordClassIndex(17371);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChooseLimitUserListFragment$initActions$$inlined$apply$lambda$8(C3207d c3207d, C77294Gdc c77294Gdc) {
        super(1);
        this.$this_apply = c3207d;
        this.this$0 = c77294Gdc;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Throwable th) {
        if (!PatchProxy.proxy(new Object[]{th}, this, changeQuickRedirect, false, 1).isSupported) {
            if (this.$this_apply.LJIIIZ()) {
                C77294Gdc c77294Gdc = this.this$0;
                if (!PatchProxy.proxy(new Object[0], c77294Gdc, C77294Gdc.LIZ, false, 13).isSupported) {
                    LoadingStatusView loadingStatusView = (LoadingStatusView) c77294Gdc.LIZ(2131169169);
                    Intrinsics.checkNotNullExpressionValue(loadingStatusView, "");
                    LK1.LIZJ(loadingStatusView);
                    C77295Gdd c77295Gdd = c77294Gdc.LJII;
                    if (c77295Gdd != null) {
                        String LIZ = LK5.LIZ(2131587863);
                        Intrinsics.checkNotNullExpressionValue(LIZ, "");
                        c77295Gdd.setMainTitle(LIZ);
                        String LIZ2 = LK5.LIZ(2131587867);
                        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
                        c77295Gdd.setSubTitle(LIZ2);
                    }
                    ((LoadingStatusView) c77294Gdc.LIZ(2131169169)).LIZLLL();
                }
            } else {
                this.this$0.LIZLLL();
                this.this$0.LJI.LIZJ();
            }
        }
        return Unit.INSTANCE;
    }
}
