package com.bytedance.android.live.broadcast.preview;

import com.bytedance.android.livesdkapi.room.p781a.AbstractC9661d;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class StartLiveFragment$onDestroy$1 extends Lambda implements Function1<AbstractC9661d, Unit> {
    public static final StartLiveFragment$onDestroy$1 INSTANCE = new StartLiveFragment$onDestroy$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(17120);
    }

    public StartLiveFragment$onDestroy$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(AbstractC9661d abstractC9661d) {
        AbstractC9661d abstractC9661d2 = abstractC9661d;
        if (!PatchProxy.proxy(new Object[]{abstractC9661d2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(abstractC9661d2);
            abstractC9661d2.LIZIZ();
        }
        return Unit.INSTANCE;
    }
}
