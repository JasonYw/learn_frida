package com.bytedance.android.live.liveinteract.plantform.widgt;

import android.view.SurfaceView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class BaseGuestLinkWidget$surfaceViewByLazy$2 extends Lambda implements Function0<SurfaceView> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ BaseGuestLinkWidget this$0;

    static {
        Covode.recordClassIndex(29577);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseGuestLinkWidget$surfaceViewByLazy$2(BaseGuestLinkWidget baseGuestLinkWidget) {
        super(0);
        this.this$0 = baseGuestLinkWidget;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ SurfaceView mo30099invoke() {
        SurfaceView surfaceView;
        MethodCollector.m14708i(1989);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            surfaceView = proxy.result;
        } else {
            surfaceView = new SurfaceView(this.this$0.context);
        }
        MethodCollector.m14707o(1989);
        return surfaceView;
    }
}