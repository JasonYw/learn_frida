package com.bytedance.android.live.broadcast.gamedetail.block.widget;

import com.bytedance.android.live.broadcast.C3243u;
import com.bytedance.android.live.broadcast.gamedetail.order.C3101e;
import com.bytedance.android.live.broadcast.gamedetailv2.data.C3119b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcast.gamedetail.block.widget.AudienceOrderGameInfoItemWidgetKt$audienceStateV2ToGameIntroProps$1 */
/* loaded from: classes5.dex */
public final class C3077xb4b24b2d extends Lambda implements Function2<C3101e, C3091q, C3091q> {
    public static final C3077xb4b24b2d INSTANCE = new C3077xb4b24b2d();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(16357);
    }

    public C3077xb4b24b2d() {
        super(2);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, com.bytedance.android.live.broadcast.gamedetail.block.widget.q] */
    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ C3091q invoke(C3101e c3101e, C3091q c3091q) {
        C3243u c3243u;
        C3101e c3101e2 = c3101e;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3101e2, c3091q}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C106862S5w.LIZ(c3101e2);
        C3119b c3119b = c3101e2.LIZLLL;
        if (c3119b != null) {
            c3243u = c3119b.LIZIZ;
        } else {
            c3243u = null;
        }
        return new C3091q(c3243u, true, true, true);
    }
}
