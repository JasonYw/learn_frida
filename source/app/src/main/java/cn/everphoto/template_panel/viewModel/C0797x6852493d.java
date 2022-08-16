package cn.everphoto.template_panel.viewModel;

import cn.everphoto.template_panel.model.C0790c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC83316IsY;
import p003X.C84S;

/* renamed from: cn.everphoto.template_panel.viewModel.CutSameMaterialViewModel$initTextEditManager$$inlined$apply$lambda$4 */
/* loaded from: classes4.dex */
public final class C0797x6852493d extends Lambda implements Function1<Long, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C0790c $epTemplateWrapper$inlined;
    public final /* synthetic */ List $list$inlined;
    public final /* synthetic */ C84S $videoPresenter$inlined;
    public final /* synthetic */ C0801a this$0;

    static {
        Covode.recordClassIndex(3834);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0797x6852493d(C0801a c0801a, C84S c84s, C0790c c0790c, List list) {
        super(1);
        this.this$0 = c0801a;
        this.$videoPresenter$inlined = c84s;
        this.$epTemplateWrapper$inlined = c0790c;
        this.$list$inlined = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Long l) {
        AbstractC83316IsY abstractC83316IsY;
        Long l2 = l;
        if (!PatchProxy.proxy(new Object[]{l2}, this, changeQuickRedirect, false, 1).isSupported && (abstractC83316IsY = this.this$0.LJFF) != null) {
            abstractC83316IsY.LJIJ(l2);
        }
        return Unit.INSTANCE;
    }
}
