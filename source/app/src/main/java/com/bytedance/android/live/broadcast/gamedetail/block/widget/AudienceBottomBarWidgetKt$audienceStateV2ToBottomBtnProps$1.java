package com.bytedance.android.live.broadcast.gamedetail.block.widget;

import com.bytedance.android.live.broadcast.gamedetail.order.C3101e;
import com.bytedance.android.live.broadcast.gamedetail.order.model.C3113i;
import com.bytedance.android.live.broadcast.gamedetailv2.data.C3119b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class AudienceBottomBarWidgetKt$audienceStateV2ToBottomBtnProps$1 extends Lambda implements Function2<C3101e, C3088n, C3088n> {
    public static final AudienceBottomBarWidgetKt$audienceStateV2ToBottomBtnProps$1 INSTANCE = new AudienceBottomBarWidgetKt$audienceStateV2ToBottomBtnProps$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(16324);
    }

    public AudienceBottomBarWidgetKt$audienceStateV2ToBottomBtnProps$1() {
        super(2);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.bytedance.android.live.broadcast.gamedetail.block.widget.n, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ C3088n invoke(C3101e c3101e, C3088n c3088n) {
        C3113i c3113i;
        C3101e c3101e2 = c3101e;
        boolean z = true;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3101e2, c3088n}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C106862S5w.LIZ(c3101e2);
        C3119b c3119b = c3101e2.LIZLLL;
        if (c3119b == null || (c3113i = c3119b.LJIJJLI) == null || c3113i.LIZJ != 1) {
            z = false;
        }
        return new C3088n(z, false, 2);
    }
}
