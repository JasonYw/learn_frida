package com.bytedance.android.live.broadcast.preview.p277ui.chooseuser;

import com.bytedance.android.live.broadcast.preview.viewmodel.C3207d;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C77294Gdc;

/* renamed from: com.bytedance.android.live.broadcast.preview.ui.chooseuser.ChooseLimitUserListFragment$initActions$$inlined$apply$lambda$3 */
/* loaded from: classes3.dex */
public final class ChooseLimitUserListFragment$initActions$$inlined$apply$lambda$3 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C3207d $this_apply;
    public final /* synthetic */ C77294Gdc this$0;

    static {
        Covode.recordClassIndex(17367);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChooseLimitUserListFragment$initActions$$inlined$apply$lambda$3(C3207d c3207d, C77294Gdc c77294Gdc) {
        super(0);
        this.$this_apply = c3207d;
        this.this$0 = c77294Gdc;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.$this_apply.LIZIZ(this.this$0.LIZLLL);
        }
        return Unit.INSTANCE;
    }
}
