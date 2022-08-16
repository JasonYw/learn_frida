package com.bytedance.android.live.broadcast.preview.p277ui.widget;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.android.live.broadcast.preview.viewmodel.C3207d;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.IQV;

/* renamed from: com.bytedance.android.live.broadcast.preview.ui.widget.StartLiveVisibilityServiceWidget$startLiveVisibilityContext$2 */
/* loaded from: classes3.dex */
public final class StartLiveVisibilityServiceWidget$startLiveVisibilityContext$2 extends Lambda implements Function0<C3207d> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ StartLiveVisibilityServiceWidget this$0;

    static {
        Covode.recordClassIndex(17447);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartLiveVisibilityServiceWidget$startLiveVisibilityContext$2(StartLiveVisibilityServiceWidget startLiveVisibilityServiceWidget) {
        super(0);
        this.this$0 = startLiveVisibilityServiceWidget;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [com.bytedance.android.live.broadcast.preview.viewmodel.d, com.bytedance.live.datacontext.f] */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.bytedance.android.live.broadcast.preview.viewmodel.d, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C3207d mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        Context context = this.this$0.context;
        if (context != null) {
            return PatchProxy.proxy(new Object[]{(FragmentActivity) context, null, 2, null}, null, IQV.LIZ, true, 6).LIZ(C3207d.class);
        }
        throw new NullPointerException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }
}
