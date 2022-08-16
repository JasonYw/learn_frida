package com.bytedance.android.live.broadcast.preview.viewmodel;

import com.bytedance.android.live.broadcast.preview.p277ui.chooseuser.viewbinder.C3192d;
import com.bytedance.android.live.broadcast.preview.p277ui.chooseuser.viewbinder.C3195i;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.LK5;

/* loaded from: classes3.dex */
public final class StartLiveVisibilityContext$refreshAllUserList$2 extends Lambda implements Function2<List<C3195i>, Boolean, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C3209g $limitItem;
    public final /* synthetic */ C3207d this$0;

    static {
        Covode.recordClassIndex(17463);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartLiveVisibilityContext$refreshAllUserList$2(C3207d c3207d, C3209g c3209g) {
        super(2);
        this.this$0 = c3207d;
        this.$limitItem = c3209g;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Unit invoke(List<C3195i> list, Boolean bool) {
        if (!PatchProxy.proxy(new Object[]{list, Byte.valueOf(bool.booleanValue() ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1).isSupported) {
            Long mo30099invoke = this.$limitItem.f25925LJ.mo30099invoke();
            if (mo30099invoke != null) {
                long longValue = mo30099invoke.longValue();
                String str = this.this$0.LIZJ;
                ALogger.m15801d(str, "refreshAllUserList: getCount for " + this.$limitItem + " :[" + longValue + LoggerUtil.M_RIGHT_TAG);
                if (longValue != 0) {
                    List<Object> list2 = this.this$0.LJI;
                    String LIZ = LK5.LIZ(this.$limitItem.LJFF, this.$limitItem.f25925LJ.mo30099invoke());
                    Intrinsics.checkNotNullExpressionValue(LIZ, "");
                    list2.add(new C3192d(LIZ));
                }
            }
            C3207d c3207d = this.this$0;
            c3207d.LIZ((List) c3207d.LJI, true);
            this.this$0.LIZ(this.$limitItem.LIZIZ);
            C3207d c3207d2 = this.this$0;
            c3207d2.LJIIIZ = true;
            if (c3207d2.LJIIIZ()) {
                this.this$0.LIZIZ(0);
            }
        }
        return Unit.INSTANCE;
    }
}
