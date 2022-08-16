package com.bytedance.android.live.broadcast.widget;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.android.live.permissioncheck.p407c.C5185b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.IQV;
import p003X.IQX;

/* loaded from: classes3.dex */
public final class PreviewLocalCheckWidget$rulesDataContext$2 extends Lambda implements Function0<C5185b> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PreviewLocalCheckWidget this$0;

    static {
        Covode.recordClassIndex(18572);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewLocalCheckWidget$rulesDataContext$2(PreviewLocalCheckWidget previewLocalCheckWidget) {
        super(0);
        this.this$0 = previewLocalCheckWidget;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [com.bytedance.android.live.permissioncheck.c.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.bytedance.android.live.permissioncheck.c.b, com.bytedance.live.datacontext.f, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C5185b mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        Context context = this.this$0.context;
        if (context != null) {
            ?? LIZ = PatchProxy.proxy(new Object[]{(FragmentActivity) context, null, 2, null}, null, IQV.LIZ, true, 6).LIZ(C5185b.class);
            if (!PatchProxy.proxy(new Object[0], LIZ, C5185b.LIZ, false, 1).isSupported) {
                IQX.LIZ(LIZ, LIZ.getClass());
            }
            return LIZ;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }
}
