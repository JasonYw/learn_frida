package cn.everphoto.template_panel.fragment;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C83345It1;

/* loaded from: classes4.dex */
public final class CutSameTemplateFragment$failDownload$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C83345It1 this$0;

    static {
        Covode.recordClassIndex(3729);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CutSameTemplateFragment$failDownload$1(C83345It1 c83345It1) {
        super(0);
        this.this$0 = c83345It1;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LJII();
        }
        return Unit.INSTANCE;
    }
}
