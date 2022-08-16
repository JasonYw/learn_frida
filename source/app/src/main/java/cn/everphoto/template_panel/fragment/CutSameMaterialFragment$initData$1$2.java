package cn.everphoto.template_panel.fragment;

import cn.everphoto.template_panel.viewModel.C0802b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C115734VhA;

/* loaded from: classes24.dex */
public final class CutSameMaterialFragment$initData$1$2 extends Lambda implements Function1<Long, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C0802b $this_apply;

    static {
        Covode.recordClassIndex(3707);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CutSameMaterialFragment$initData$1$2(C0802b c0802b) {
        super(1);
        this.$this_apply = c0802b;
    }

    /* renamed from: cn.everphoto.template_panel.fragment.CutSameMaterialFragment$initData$1$2$1 */
    /* loaded from: classes24.dex */
    public static final class C07821 extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public final /* synthetic */ long $it;

        static {
            Covode.recordClassIndex(3708);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07821(long j) {
            super(0);
            this.$it = j;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final /* synthetic */ Unit mo30099invoke() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
                C0802b c0802b = CutSameMaterialFragment$initData$1$2.this.$this_apply;
                long j = this.$it;
                if (!PatchProxy.proxy(new Object[]{new Long(j)}, c0802b, C0802b.LIZ, false, 16).isSupported) {
                    c0802b.LJIJ.setValue(Long.valueOf(j));
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Long l) {
        long longValue = l.longValue();
        if (!PatchProxy.proxy(new Object[]{new Long(longValue)}, this, changeQuickRedirect, false, 1).isSupported) {
            C115734VhA.LIZIZ(0L, new C07821(longValue), 1, null);
        }
        return Unit.INSTANCE;
    }
}
