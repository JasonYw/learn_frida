package cn.everphoto.template_panel.fragment;

import androidx.fragment.app.FragmentActivity;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.dmt.p1121ui.p1122b.C12356b;
import com.bytedance.sdk.bridge.p1355js.delegate.JsBridgeDelegate;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C123004Yb8;
import p003X.C83345It1;

/* loaded from: classes4.dex */
public final class CutSameTemplateFragment$bubble$2 extends Lambda implements Function0<C12356b> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C83345It1 this$0;

    static {
        Covode.recordClassIndex(3719);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CutSameTemplateFragment$bubble$2(C83345It1 c83345It1) {
        super(0);
        this.this$0 = c83345It1;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, com.bytedance.ies.dmt.ui.b.b] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C12356b mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        FragmentActivity activity = this.this$0.getActivity();
        if (activity != null) {
            C123004Yb8 c123004Yb8 = new C123004Yb8(activity);
            c123004Yb8.LIZIZ(2131581212);
            c123004Yb8.LIZIZ(JsBridgeDelegate.GET_URL_OUT_TIME);
            c123004Yb8.LIZIZ(true);
            return c123004Yb8.LIZ();
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
    }
}
