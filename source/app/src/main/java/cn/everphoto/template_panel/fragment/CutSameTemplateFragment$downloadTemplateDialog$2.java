package cn.everphoto.template_panel.fragment;

import android.content.Context;
import cn.everphoto.template_panel.view.AlertDialogC0793b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C83345It1;
import p003X.C83354ItA;

/* loaded from: classes4.dex */
public final class CutSameTemplateFragment$downloadTemplateDialog$2 extends Lambda implements Function0<AlertDialogC0793b> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C83345It1 this$0;

    static {
        Covode.recordClassIndex(3727);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CutSameTemplateFragment$downloadTemplateDialog$2(C83345It1 c83345It1) {
        super(0);
        this.this$0 = c83345It1;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, cn.everphoto.template_panel.view.b] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ AlertDialogC0793b mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        Context requireContext = this.this$0.requireContext();
        Intrinsics.checkExpressionValueIsNotNull(requireContext, "");
        AlertDialogC0793b alertDialogC0793b = new AlertDialogC0793b(requireContext, 2131493635);
        alertDialogC0793b.setMessage(alertDialogC0793b.getContext().getString(2131581214));
        alertDialogC0793b.LIZ(0);
        alertDialogC0793b.setCancelable(false);
        C83354ItA c83354ItA = new C83354ItA(this);
        if (!PatchProxy.proxy(new Object[]{c83354ItA}, alertDialogC0793b, AlertDialogC0793b.LIZ, false, 10).isSupported) {
            C106862S5w.LIZ(c83354ItA);
            alertDialogC0793b.LIZIZ = c83354ItA;
        }
        return alertDialogC0793b;
    }
}
