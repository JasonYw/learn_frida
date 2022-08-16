package com.bytedance.android.live.broadcast.gamedetail.block.widget;

import com.bytedance.android.live.broadcast.gamedetail.order.C3101e;
import com.bytedance.android.live.broadcast.gamedetail.order.model.C3108d;
import com.bytedance.android.live.broadcast.gamedetailv2.data.C3119b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcast.gamedetail.block.widget.AudienceOrderGameInfoItemWidgetKt$audienceStateV2ToOfficialProps$1 */
/* loaded from: classes5.dex */
public final class C3078xab657f28 extends Lambda implements Function2<C3101e, C3092r, C3092r> {
    public static final C3078xab657f28 INSTANCE = new C3078xab657f28();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(16358);
    }

    public C3078xab657f28() {
        super(2);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, com.bytedance.android.live.broadcast.gamedetail.block.widget.r] */
    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ C3092r invoke(C3101e c3101e, C3092r c3092r) {
        List<C3108d> list;
        C3108d c3108d;
        C3101e c3101e2 = c3101e;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3101e2, c3092r}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C106862S5w.LIZ(c3101e2);
        C3119b c3119b = c3101e2.LIZLLL;
        if (c3119b == null || (list = c3119b.LJIILIIL) == null || (c3108d = (C3108d) CollectionsKt___CollectionsKt.getOrNull(list, 0)) == null) {
            return null;
        }
        return new C3092r(c3108d.LIZJ, c3108d.LIZ(), c3108d.LIZIZ(), false, c3108d.LIZJ(), c3108d.LJII);
    }
}
