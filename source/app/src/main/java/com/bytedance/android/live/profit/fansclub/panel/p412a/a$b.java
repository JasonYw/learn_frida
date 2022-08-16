package com.bytedance.android.live.profit.fansclub.panel.p412a;

import android.net.Uri;
import com.bytedance.android.live.profit.fansclub.panel.C5269c;
import com.bytedance.android.livesdk.utils.C9303cy;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.profit.fansclub.panel.a.a$b */
/* loaded from: classes12.dex */
public final class a$b extends C5269c {
    public static ChangeQuickRedirect LIZ;
    public C9303cy LIZIZ;
    public C9303cy LIZJ;

    static {
        Covode.recordClassIndex(33307);
    }

    public a$b() {
        Uri uri = Uri.EMPTY;
        Intrinsics.checkNotNullExpressionValue(uri, "");
        this.LIZIZ = new C9303cy(uri);
        Uri uri2 = Uri.EMPTY;
        Intrinsics.checkNotNullExpressionValue(uri2, "");
        this.LIZJ = new C9303cy(uri2);
    }

    public final C9303cy LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (C9303cy) proxy.result;
        }
        return this.LIZIZ.LIZJ(PushConstants.WEB_URL);
    }

    public final void LIZIZ(C9303cy c9303cy) {
        if (PatchProxy.proxy(new Object[]{c9303cy}, this, LIZ, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(c9303cy);
        this.LIZJ = c9303cy;
    }

    public final void LIZ(C9303cy c9303cy) {
        if (PatchProxy.proxy(new Object[]{c9303cy}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(c9303cy);
        this.LIZIZ = c9303cy;
    }
}
