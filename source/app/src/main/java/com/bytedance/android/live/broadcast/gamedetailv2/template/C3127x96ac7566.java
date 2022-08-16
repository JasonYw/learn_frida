package com.bytedance.android.live.broadcast.gamedetailv2.template;

import com.bytedance.android.live.broadcast.C3243u;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.L46;

/* renamed from: com.bytedance.android.live.broadcast.gamedetailv2.template.GameIntroTemplate$GameIntroViewHolder$bindData$$inlined$let$lambda$1 */
/* loaded from: classes5.dex */
public final class C3127x96ac7566 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C3243u $data$inlined;
    public final /* synthetic */ e$a this$0;

    static {
        Covode.recordClassIndex(16690);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3127x96ac7566(e$a e_a, C3243u c3243u) {
        super(0);
        this.this$0 = e_a;
        this.$data$inlined = c3243u;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        String str;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            if (this.this$0.f25892LJ.getVisibility() == 8) {
                this.this$0.f25892LJ.setVisibility(0);
                this.this$0.LIZ2(this.$data$inlined);
            }
            L46 l46 = L46.LIZIZ;
            Long l = this.$data$inlined.LIZIZ;
            if (l != null && ((int) l.longValue()) == 3) {
                str = "1";
            } else {
                str = "0";
            }
            l46.LIZ(str);
        }
        return Unit.INSTANCE;
    }
}
