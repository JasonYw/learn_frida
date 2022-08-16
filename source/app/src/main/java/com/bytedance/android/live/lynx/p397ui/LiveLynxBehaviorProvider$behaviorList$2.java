package com.bytedance.android.live.lynx.p397ui;

import com.bytedance.android.live.lynx.AbstractC5151a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.lynx.tasm.behavior.Behavior;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C101454PxQ;
import p003X.C109177Syh;
import p003X.C109180Syk;
import p003X.C109200Sz4;
import p003X.C109202Sz6;
import p003X.C109214SzI;
import p003X.C109215SzJ;
import p003X.C109303T1t;
import p003X.C109305T1v;
import p003X.C109307T1x;
import p003X.T24;
import p003X.T25;
import p003X.T26;
import p003X.T27;
import p003X.T28;
import p003X.T29;
import p003X.T2A;
import p003X.T2B;
import p003X.T2C;
import p003X.T2D;
import p003X.T2E;
import p003X.T2F;
import p003X.T2O;
import p003X.T36;
import p003X.T3E;
import p003X.T3F;

/* renamed from: com.bytedance.android.live.lynx.ui.LiveLynxBehaviorProvider$behaviorList$2 */
/* loaded from: classes10.dex */
public final class LiveLynxBehaviorProvider$behaviorList$2 extends Lambda implements Function0<List<Behavior>> {
    public static final LiveLynxBehaviorProvider$behaviorList$2 INSTANCE = new LiveLynxBehaviorProvider$behaviorList$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(32350);
    }

    public LiveLynxBehaviorProvider$behaviorList$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v32, types: [java.util.List<com.lynx.tasm.behavior.Behavior>, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ List<Behavior> mo30099invoke() {
        List<Behavior> LIZ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        List<Behavior> mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(new T24("filter-image"), new T36("inline-image"), new C109180Syk("a"), new T27("swiper"), new T28("swiper-item"), new T29("lottie"), new T2A("x-lottie"), new T3E("textarea"), new T3F("x-textarea"), new T2B("input"), new C109215SzJ("webcast-image"), new T2E("lola-canvas"), new C109177Syh("svg"), new T2C("x-map"), new C109307T1x("x-picker-view"), new T2F("x-picker-view-column"), new C109303T1t("vs-record-video"), new T2O("vs-toolbar"), new T26("x-scroll-view"), new C109305T1v("x-impression-view"), new C109200Sz4("gamecp-list"), new C109202Sz6("gamecp-view"));
        mutableListOf.add(new T25("image", true));
        mutableListOf.add(new C109214SzI("ecom-image"));
        mutableListOf.add(new T2D("ecom-prelive"));
        AbstractC5151a abstractC5151a = (AbstractC5151a) C101454PxQ.LIZ(AbstractC5151a.class);
        if (abstractC5151a != null && (LIZ = abstractC5151a.LIZ()) != null) {
            mutableListOf.addAll(LIZ);
        }
        return mutableListOf;
    }
}
