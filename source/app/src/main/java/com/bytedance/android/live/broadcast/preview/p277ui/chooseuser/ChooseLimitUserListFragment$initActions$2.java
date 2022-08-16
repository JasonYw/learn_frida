package com.bytedance.android.live.broadcast.preview.p277ui.chooseuser;

import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.broadcast.preview.viewmodel.C3207d;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C77294Gdc;

/* renamed from: com.bytedance.android.live.broadcast.preview.ui.chooseuser.ChooseLimitUserListFragment$initActions$2 */
/* loaded from: classes3.dex */
public final class ChooseLimitUserListFragment$initActions$2 extends Lambda implements Function1<Integer, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C77294Gdc this$0;

    static {
        Covode.recordClassIndex(17374);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChooseLimitUserListFragment$initActions$2(C77294Gdc c77294Gdc) {
        super(1);
        this.this$0 = c77294Gdc;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Integer num) {
        C3207d c3207d;
        int intValue = num.intValue();
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(intValue)}, this, changeQuickRedirect, false, 1).isSupported) {
            if (intValue == this.this$0.LIZLLL) {
                ALogger.m15795w(this.this$0.LIZIZ, "set same type for mSelectedFilter,skip");
            } else {
                C77294Gdc c77294Gdc = this.this$0;
                c77294Gdc.LIZLLL = intValue;
                if (!PatchProxy.proxy(new Object[0], c77294Gdc, C77294Gdc.LIZ, false, 14).isSupported && (c3207d = c77294Gdc.LIZJ) != null) {
                    c3207d.LIZ(c77294Gdc.LIZLLL, c3207d.LIZIZ().LIZ());
                }
                C3207d c3207d2 = this.this$0.LIZJ;
                if (c3207d2 != null && c3207d2.LIZJ(this.this$0.LIZLLL)) {
                    this.this$0.LJI.LIZ();
                } else {
                    this.this$0.LJI.LIZIZ();
                }
                ((RecyclerView) this.this$0.LIZ(2131188506)).scrollToPosition(0);
            }
        }
        return Unit.INSTANCE;
    }
}
