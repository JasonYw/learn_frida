package com.bytedance.android.live.broadcast.preview.p277ui.chooseuser;

import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.broadcast.preview.p277ui.chooseuser.viewbinder.C3195i;
import com.bytedance.android.live.broadcast.preview.viewmodel.C3207d;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C392771gt;
import p003X.C77294Gdc;
import p003X.C77347GeT;
import p003X.C88440Kt0;

/* renamed from: com.bytedance.android.live.broadcast.preview.ui.chooseuser.ChooseLimitUserListFragment$initActions$$inlined$apply$lambda$1 */
/* loaded from: classes3.dex */
public final class ChooseLimitUserListFragment$initActions$$inlined$apply$lambda$1 extends Lambda implements Function2<C3195i, Boolean, Boolean> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C3207d $this_apply;
    public final /* synthetic */ C77294Gdc this$0;

    static {
        Covode.recordClassIndex(17361);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChooseLimitUserListFragment$initActions$$inlined$apply$lambda$1(C3207d c3207d, C77294Gdc c77294Gdc) {
        super(2);
        this.$this_apply = c3207d;
        this.this$0 = c77294Gdc;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Boolean invoke(C3195i c3195i, Boolean bool) {
        Object obj;
        C3195i c3195i2 = c3195i;
        boolean booleanValue = bool.booleanValue();
        boolean z = false;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3195i2, Byte.valueOf(booleanValue ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            z = ((Boolean) proxy.result).booleanValue();
        } else {
            C106862S5w.LIZ(c3195i2);
            if (!booleanValue) {
                this.$this_apply.LIZ(c3195i2);
                this.this$0.LIZIZ().put(C392771gt.LIZ(this.this$0.LIZLLL), "1");
            } else {
                int size = this.$this_apply.LIZIZ().LIZ().size();
                Integer LIZ = this.this$0.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ, "");
                if (size >= LIZ.intValue()) {
                    C88440Kt0.LIZ(2131587879);
                    String str = this.this$0.LIZIZ;
                    ALogger.m15801d(str, "select up to limit:" + this.this$0.LIZ() + ",skip");
                } else if (this.this$0.f6401LJ && !C77347GeT.LIZIZ(c3195i2.LIZIZ) && !C77347GeT.LIZ(c3195i2.LIZIZ)) {
                    int i = this.this$0.LJFF;
                    int i2 = 2131587877;
                    if (i != 77 && i == 79) {
                        i2 = 2131587878;
                    }
                    C88440Kt0.LIZ(i2);
                    String str2 = this.this$0.LIZIZ;
                    StringBuilder sb = new StringBuilder("select not fan :");
                    sb.append(c3195i2.LIZIZ.getId());
                    sb.append(" followStatus:");
                    FollowInfo followInfo = c3195i2.LIZIZ.getFollowInfo();
                    if (followInfo != null) {
                        obj = Long.valueOf(followInfo.getFollowStatus());
                    } else {
                        obj = null;
                    }
                    sb.append(obj);
                    sb.append(",skip");
                    ALogger.m15801d(str2, sb.toString());
                } else {
                    this.$this_apply.LIZ(c3195i2);
                    this.this$0.LIZIZ().put(C392771gt.LIZ(this.this$0.LIZLLL), "1");
                }
            }
            this.$this_apply.LJIIJJI().LIZ(Unit.INSTANCE);
            if (this.this$0.LIZLLL == 0) {
                this.this$0.LJI.notifyDataSetChanged();
            }
            this.this$0.LIZJ();
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
