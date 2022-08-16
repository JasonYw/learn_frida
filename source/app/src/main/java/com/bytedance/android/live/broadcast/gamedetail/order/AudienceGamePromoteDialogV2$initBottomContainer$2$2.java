package com.bytedance.android.live.broadcast.gamedetail.order;

import com.bytedance.android.live.broadcast.gamedetail.block.reducer.C3070b;
import com.bytedance.android.live.broadcast.gamedetail.block.widget.C3083c;
import com.bytedance.android.live.broadcast.gamedetailv2.data.C3119b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class AudienceGamePromoteDialogV2$initBottomContainer$2$2 extends Lambda implements Function2<C3070b, C3083c, C3083c> {
    public static final AudienceGamePromoteDialogV2$initBottomContainer$2$2 INSTANCE = new AudienceGamePromoteDialogV2$initBottomContainer$2$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(16485);
    }

    public AudienceGamePromoteDialogV2$initBottomContainer$2$2() {
        super(2);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, com.bytedance.android.live.broadcast.gamedetail.block.widget.c] */
    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ C3083c invoke(C3070b c3070b, C3083c c3083c) {
        C3119b c3119b;
        C3070b c3070b2 = c3070b;
        C3083c c3083c2 = c3083c;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c3070b2, c3083c2}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C106862S5w.LIZ(c3070b2);
        boolean z = c3070b2.LJI;
        int i = c3070b2.LJFF;
        C3100d c3100d = null;
        if (c3083c2 != null) {
            c3119b = c3083c2.LIZLLL;
            c3100d = c3083c2.f25868LJ;
        } else {
            c3119b = null;
        }
        return new C3083c(z, i, c3119b, c3100d);
    }
}
