package cn.everphoto.template_panel.viewModel;

import android.content.res.Resources;
import cn.everphoto.template_panel.model.C0790c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class CutSameTemplateViewModel$noneTemplateItem$2 extends Lambda implements Function0<C0790c> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C0803c this$0;

    static {
        Covode.recordClassIndex(3846);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CutSameTemplateViewModel$noneTemplateItem$2(C0803c c0803c) {
        super(0);
        this.this$0 = c0803c;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, cn.everphoto.template_panel.model.c] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C0790c mo30099invoke() {
        Resources resources;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C0803c c0803c = this.this$0;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], c0803c, C0803c.LIZ, false, 1);
        if (proxy2.isSupported) {
            resources = (Resources) proxy2.result;
        } else {
            resources = c0803c.LIZIZ;
            if (resources == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
        }
        return new C0790c(null, resources.getString(2131581215), false, 1, false, 21);
    }
}
