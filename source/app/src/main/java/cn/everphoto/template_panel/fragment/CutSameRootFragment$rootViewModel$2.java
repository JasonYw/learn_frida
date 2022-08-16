package cn.everphoto.template_panel.fragment;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProviders;
import cn.everphoto.template_panel.viewModel.C0802b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.TypeCastException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C83339Isv;

/* loaded from: classes23.dex */
public final class CutSameRootFragment$rootViewModel$2 extends Lambda implements Function0<C0802b> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C83339Isv this$0;

    static {
        Covode.recordClassIndex(3717);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CutSameRootFragment$rootViewModel$2(C83339Isv c83339Isv) {
        super(0);
        this.this$0 = c83339Isv;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [cn.everphoto.template_panel.viewModel.b, androidx.lifecycle.ViewModel] */
    /* JADX WARN: Type inference failed for: r0v7, types: [cn.everphoto.template_panel.viewModel.b, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C0802b mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        FragmentActivity activity = this.this$0.getActivity();
        if (activity != null) {
            return ViewModelProviders.m21142of(activity).get(C0802b.class);
        }
        throw new TypeCastException("null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
    }
}
