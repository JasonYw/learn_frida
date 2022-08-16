package cn.everphoto.template_panel.fragment;

import cn.everphoto.template_panel.model.C0790c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C83345It1;

/* loaded from: classes4.dex */
public final class CutSameTemplateFragment$onChooseTemplate$2 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C0790c $templateItem;
    public final /* synthetic */ C83345It1 this$0;

    static {
        Covode.recordClassIndex(3734);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CutSameTemplateFragment$onChooseTemplate$2(C83345It1 c83345It1, C0790c c0790c) {
        super(0);
        this.this$0 = c83345It1;
        this.$templateItem = c0790c;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LIZJ().LJIIJJI = false;
            if (this.$templateItem.LIZ() == -1) {
                this.this$0.LIZJ(this.$templateItem);
                this.this$0.LIZIZ().LIZ();
            } else {
                this.this$0.LIZJ.postDelayed(new Runnable() { // from class: cn.everphoto.template_panel.fragment.CutSameTemplateFragment$onChooseTemplate$2.1
                    public static ChangeQuickRedirect LIZ;

                    static {
                        Covode.recordClassIndex(3735);
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                            return;
                        }
                        CutSameTemplateFragment$onChooseTemplate$2.this.this$0.m23601LJ(CutSameTemplateFragment$onChooseTemplate$2.this.$templateItem);
                    }
                }, 200L);
            }
        }
        return Unit.INSTANCE;
    }
}
