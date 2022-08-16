package com.bytedance.android.live.broadcast.gamedetail.order;

import com.bytedance.android.live.broadcast.gamedetail.block.widget.C3083c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class AudienceGamePromoteDialogV2$initBottomContainer$2$1 extends Lambda implements Function3<C3101e, C3100d, C3083c, C3083c> {
    public static final AudienceGamePromoteDialogV2$initBottomContainer$2$1 INSTANCE = new AudienceGamePromoteDialogV2$initBottomContainer$2$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(16484);
    }

    public AudienceGamePromoteDialogV2$initBottomContainer$2$1() {
        super(3);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, com.bytedance.android.live.broadcast.gamedetail.block.widget.c] */
    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ C3083c invoke(C3101e c3101e, C3100d c3100d, C3083c c3083c) {
        C3101e c3101e2 = c3101e;
        C3100d c3100d2 = c3100d;
        C3083c c3083c2 = c3083c;
        boolean z = false;
        int i = 1;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3101e2, c3100d2, c3083c2}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C106862S5w.LIZ(c3101e2, c3100d2);
        if (!c3101e2.LIZIZ && c3101e2.LIZJ == 200 && (c3083c2 == null || c3083c2.LIZIZ)) {
            z = true;
        }
        if (c3083c2 != null) {
            i = c3083c2.LIZJ;
        }
        return new C3083c(z, i, c3101e2.LIZLLL, c3100d2);
    }
}
