package com.bytedance.android.live.broadcast.gamedetail.block;

import com.bytedance.android.live.broadcast.gamedetail.block.widget.C3086g;
import com.bytedance.android.live.broadcast.gamedetail.order.C3100d;
import com.bytedance.android.live.broadcast.gamedetail.order.C3101e;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class AudienceGameMultiTabContentWidget$initTitleBar$1 extends Lambda implements Function3<C3101e, C3100d, C3086g, C3086g> {
    public static final AudienceGameMultiTabContentWidget$initTitleBar$1 INSTANCE = new AudienceGameMultiTabContentWidget$initTitleBar$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(16161);
    }

    public AudienceGameMultiTabContentWidget$initTitleBar$1() {
        super(3);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.bytedance.android.live.broadcast.gamedetail.block.widget.g, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ C3086g invoke(C3101e c3101e, C3100d c3100d, C3086g c3086g) {
        C3101e c3101e2 = c3101e;
        C3100d c3100d2 = c3100d;
        C3086g c3086g2 = c3086g;
        int i = 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3101e2, c3100d2, c3086g2}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C106862S5w.LIZ(c3101e2, c3100d2);
        if (c3086g2 != null) {
            i = c3086g2.LIZIZ;
        }
        return new C3086g(i, c3101e2.LIZLLL, c3100d2);
    }
}
