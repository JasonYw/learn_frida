package com.bytedance.android.live.broadcast.gamedetail.block.tab;

import com.bytedance.android.live.broadcast.C3243u;
import com.bytedance.android.live.broadcast.gamedetail.order.C3100d;
import com.bytedance.android.live.broadcast.gamedetail.order.C3101e;
import com.bytedance.android.live.broadcast.gamedetailv2.data.C3119b;
import com.bytedance.android.live.broadcast.gamedetailv2.data.C3121e;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class GameDetailLynxTabWidget$onMount$2 extends Lambda implements Function3<C3101e, C3100d, C3075c, C3075c> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ GameDetailLynxTabWidget this$0;

    static {
        Covode.recordClassIndex(16302);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameDetailLynxTabWidget$onMount$2(GameDetailLynxTabWidget gameDetailLynxTabWidget) {
        super(3);
        this.this$0 = gameDetailLynxTabWidget;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, com.bytedance.android.live.broadcast.gamedetail.block.tab.c] */
    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ C3075c invoke(C3101e c3101e, C3100d c3100d, C3075c c3075c) {
        String str;
        C3243u c3243u;
        C3243u c3243u2;
        C3101e c3101e2 = c3101e;
        C3100d c3100d2 = c3100d;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3101e2, c3100d2, c3075c}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C106862S5w.LIZ(c3101e2, c3100d2);
        C3121e c3121e = new C3121e(this.this$0.f25857LJ, c3101e2.f25877LJ);
        String str2 = c3100d2.f25876LJ;
        C3119b c3119b = c3101e2.LIZLLL;
        String str3 = null;
        if (c3119b != null && (c3243u2 = c3119b.LIZIZ) != null) {
            str = c3243u2.LIZJ;
        } else {
            str = null;
        }
        C3119b c3119b2 = c3101e2.LIZLLL;
        if (c3119b2 != null && (c3243u = c3119b2.LIZIZ) != null) {
            str3 = c3243u.LIZLLL;
        }
        return new C3075c(c3121e, str2, str, str3);
    }
}
