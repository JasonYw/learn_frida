package com.bytedance.android.live.broadcast.widget;

import com.bytedance.android.live.broadcast.viewmodel.C3255a;
import com.bytedance.android.livesdk.C9078n;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import p003X.C106862S5w;
import p003X.C77347GeT;

/* renamed from: com.bytedance.android.live.broadcast.widget.d */
/* loaded from: classes12.dex */
public final class C3318d {
    public static ChangeQuickRedirect LIZ;
    public final Lazy LIZIZ = LazyKt__LazyJVMKt.lazy(new AnnouncementEntryCompat$forenoticeEntryWidget$2(this));
    public final Function0<Unit> LIZJ;
    public final Lazy LIZLLL;

    static {
        Covode.recordClassIndex(18954);
    }

    public final C3255a LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (C3255a) (proxy.isSupported ? proxy.result : this.LIZLLL.mo27335getValue());
    }

    public C3318d(C9078n c9078n, Function0<Unit> function0) {
        C106862S5w.LIZ(c9078n, function0);
        this.LIZJ = function0;
        this.LIZLLL = C77347GeT.LIZ(new AnnouncementEntryCompat$forenoticeViewModel$2(c9078n));
    }
}
