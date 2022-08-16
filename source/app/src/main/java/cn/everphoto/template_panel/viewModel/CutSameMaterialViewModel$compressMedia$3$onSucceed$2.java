package cn.everphoto.template_panel.viewModel;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C83214Iqu;

/* loaded from: classes4.dex */
public final class CutSameMaterialViewModel$compressMedia$3$onSucceed$2 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C83214Iqu this$0;

    static {
        Covode.recordClassIndex(3830);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CutSameMaterialViewModel$compressMedia$3$onSucceed$2(C83214Iqu c83214Iqu) {
        super(0);
        this.this$0 = c83214Iqu;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LIZIZ.LJJII.setValue(new Pair<>(Boolean.TRUE, Long.valueOf(this.this$0.LIZLLL)));
        }
        return Unit.INSTANCE;
    }
}
