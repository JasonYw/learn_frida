package com.bytedance.android.live.broadcast.preview.p277ui.chooseuser;

import com.bytedance.android.live.broadcast.preview.p277ui.chooseuser.viewbinder.C3195i;
import com.bytedance.android.live.broadcast.preview.viewmodel.C3207d;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C77294Gdc;

/* renamed from: com.bytedance.android.live.broadcast.preview.ui.chooseuser.ChooseLimitUserListFragment$initActions$$inlined$apply$lambda$2 */
/* loaded from: classes3.dex */
public final class ChooseLimitUserListFragment$initActions$$inlined$apply$lambda$2 extends Lambda implements Function1<C3195i, Boolean> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C3207d $this_apply;
    public final /* synthetic */ C77294Gdc this$0;

    static {
        Covode.recordClassIndex(17366);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChooseLimitUserListFragment$initActions$$inlined$apply$lambda$2(C3207d c3207d, C77294Gdc c77294Gdc) {
        super(1);
        this.$this_apply = c3207d;
        this.this$0 = c77294Gdc;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Boolean invoke(C3195i c3195i) {
        boolean contains;
        C3195i c3195i2 = c3195i;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3195i2}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            contains = ((Boolean) proxy.result).booleanValue();
        } else {
            C106862S5w.LIZ(c3195i2);
            long currentTimeMillis = System.currentTimeMillis();
            contains = this.$this_apply.LIZIZ().LIZ().contains(c3195i2);
            long currentTimeMillis2 = System.currentTimeMillis();
            String str = this.this$0.LIZIZ;
            ALogger.m15797i(str, "user is selected judge for " + c3195i2.LIZIZ.getId() + " result:" + contains + " cost :[" + (currentTimeMillis2 - currentTimeMillis) + LoggerUtil.M_RIGHT_TAG);
        }
        return Boolean.valueOf(contains);
    }
}
