package cn.everphoto.template_panel.fragment;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.BinderC83340Isw;

/* loaded from: classes4.dex */
public final class CutSameTemplateFragment$downloadTemplate$1$onProgress$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ float $progress;
    public final /* synthetic */ BinderC83340Isw this$0;

    static {
        Covode.recordClassIndex(3726);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CutSameTemplateFragment$downloadTemplate$1$onProgress$1(BinderC83340Isw binderC83340Isw, float f) {
        super(0);
        this.this$0 = binderC83340Isw;
        this.$progress = f;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LIZIZ.m23602LJ().LIZIZ((int) (this.$progress * 90.0f));
        }
        return Unit.INSTANCE;
    }
}
