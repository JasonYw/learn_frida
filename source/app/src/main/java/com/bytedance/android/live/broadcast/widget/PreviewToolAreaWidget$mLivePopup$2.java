package com.bytedance.android.live.broadcast.widget;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.android.livesdk.popup.C9163d;
import com.bytedance.android.livesdk.popup.LiveRepelPopupRegion;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class PreviewToolAreaWidget$mLivePopup$2 extends Lambda implements Function0<C3313av> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PreviewToolAreaWidget this$0;

    static {
        Covode.recordClassIndex(18736);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewToolAreaWidget$mLivePopup$2(PreviewToolAreaWidget previewToolAreaWidget) {
        super(0);
        this.this$0 = previewToolAreaWidget;
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [com.bytedance.android.live.broadcast.widget.av, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [com.bytedance.android.live.broadcast.widget.av, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C3313av mo30099invoke() {
        MethodCollector.m14708i(1379);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            ?? r0 = proxy.result;
            MethodCollector.m14707o(1379);
            return r0;
        }
        C3313av c3313av = new C3313av();
        Context context = this.this$0.context;
        Intrinsics.checkNotNullExpressionValue(context, "");
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{context}, c3313av, C3313av.LIZ, false, 2);
        if (proxy2.isSupported) {
            ?? r02 = proxy2.result;
            MethodCollector.m14707o(1379);
            return r02;
        }
        C106862S5w.LIZ(context);
        View inflate = LayoutInflater.from(context).inflate(2131700237, (ViewGroup) null);
        c3313av.LIZIZ = (TextView) inflate.findViewById(2131185996);
        c3313av.LIZJ = inflate.findViewById(2131185991);
        c3313av.LIZLLL = inflate.findViewById(2131185992);
        c3313av.f26008LJ = C9163d.LJIILL.LIZ(context, LiveRepelPopupRegion.PREVIEW_FULL).LIZLLL(true).LIZ(inflate).LIZJ();
        MethodCollector.m14707o(1379);
        return c3313av;
    }
}
