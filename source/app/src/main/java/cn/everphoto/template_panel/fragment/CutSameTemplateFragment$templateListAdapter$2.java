package cn.everphoto.template_panel.fragment;

import androidx.fragment.app.FragmentActivity;
import cn.everphoto.template_panel.helper.C0788g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C83345It1;

/* loaded from: classes4.dex */
public final class CutSameTemplateFragment$templateListAdapter$2 extends Lambda implements Function0<C0788g> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C83345It1 this$0;

    static {
        Covode.recordClassIndex(3738);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CutSameTemplateFragment$templateListAdapter$2(C83345It1 c83345It1) {
        super(0);
        this.this$0 = c83345It1;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, cn.everphoto.template_panel.helper.g] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C0788g mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        FragmentActivity activity = this.this$0.getActivity();
        if (activity != null) {
            return new C0788g(activity, this.this$0.LIZ().LIZIZ());
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
    }
}
