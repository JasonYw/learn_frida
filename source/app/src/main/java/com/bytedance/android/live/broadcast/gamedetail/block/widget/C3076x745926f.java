package com.bytedance.android.live.broadcast.gamedetail.block.widget;

import com.bytedance.android.live.broadcast.C3243u;
import com.bytedance.android.live.broadcast.gamedetail.order.C3101e;
import com.bytedance.android.live.broadcast.gamedetail.order.model.C3108d;
import com.bytedance.android.live.broadcast.gamedetailv2.data.C3119b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p002O.C0002O;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcast.gamedetail.block.widget.AudienceOrderGameInfoItemWidgetKt$audienceStateV2ToDeveloperInfoProps$1 */
/* loaded from: classes5.dex */
public final class C3076x745926f extends Lambda implements Function2<C3101e, C3090p, C3090p> {
    public static final C3076x745926f INSTANCE = new C3076x745926f();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(16356);
    }

    public C3076x745926f() {
        super(2);
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, com.bytedance.android.live.broadcast.gamedetail.block.widget.p] */
    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ C3090p invoke(C3101e c3101e, C3090p c3090p) {
        String str;
        String str2;
        List<C3108d> list;
        C3243u c3243u;
        C3243u c3243u2;
        C3101e c3101e2 = c3101e;
        boolean z = false;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3101e2, c3090p}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C106862S5w.LIZ(c3101e2);
        C3119b c3119b = c3101e2.LIZLLL;
        if (c3119b == null || (c3243u2 = c3119b.LIZIZ) == null || (str = c3243u2.LJI) == null) {
            str = "";
        }
        C3119b c3119b2 = c3101e2.LIZLLL;
        if (c3119b2 != null && (c3243u = c3119b2.LIZIZ) != null) {
            str2 = c3243u.LJJIFFI;
        } else {
            str2 = null;
        }
        String m25085C = C0002O.m25085C("预计", str2, "上线");
        C3119b c3119b3 = c3101e2.LIZLLL;
        if (c3119b3 != null && (list = c3119b3.LJIILIIL) != null && (list == null || list.isEmpty())) {
            z = true;
        }
        return new C3090p(str, m25085C, z);
    }
}
