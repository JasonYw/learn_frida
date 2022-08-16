package cn.everphoto.template_panel.viewModel;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C83358ItE;

/* loaded from: classes4.dex */
public final class CutSameTemplateViewModel$preDownloadTemplate$2$onSuccess$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C83358ItE this$0;

    static {
        Covode.recordClassIndex(3848);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CutSameTemplateViewModel$preDownloadTemplate$2$onSuccess$1(C83358ItE c83358ItE) {
        super(0);
        this.this$0 = c83358ItE;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LIZIZ.LJIIZILJ.remove(this.this$0.LIZJ);
            this.this$0.LIZIZ.LIZ(this.this$0.LIZLLL, this.this$0.f7785LJ);
        }
        return Unit.INSTANCE;
    }
}
