package cn.everphoto.template_panel.fragment;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.cutsameconsumer.templatemodel.TemplateModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C83341Isx;

/* loaded from: classes4.dex */
public final class CutSameTemplateFragment$compressDone$2$onSuccess$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ TemplateModel $model;
    public final /* synthetic */ C83341Isx this$0;

    static {
        Covode.recordClassIndex(3722);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CutSameTemplateFragment$compressDone$2$onSuccess$1(C83341Isx c83341Isx, TemplateModel templateModel) {
        super(0);
        this.this$0 = c83341Isx;
        this.$model = templateModel;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LIZIZ.LIZIZ().LIZ(this.$model, 1);
        }
        return Unit.INSTANCE;
    }
}
