package com.bytedance.android.live.liveinteract.bid;

import com.bytedance.android.live.liveinteract.chatroom.chatroom.p354vm.C4378a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.live.datacontext.C13491f;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import p003X.AbstractC413392Xt;
import p003X.AbstractC78489Gwt;
import p003X.C2WC;
import p003X.C78488Gws;
import p003X.C81289I2h;
import p003X.C81909IQd;
import p003X.HNU;

/* renamed from: com.bytedance.android.live.liveinteract.bid.a */
/* loaded from: classes3.dex */
public final class C4287a extends C13491f implements AbstractC78489Gwt {
    public static ChangeQuickRedirect LIZ;
    public static final /* synthetic */ KProperty[] LIZIZ;
    public static final C78488Gws LIZJ = new C78488Gws((byte) 0);
    public final C81289I2h LIZLLL = HNU.LIZ(this, null, 1, null);

    /* renamed from: LJ */
    public final C81289I2h f26259LJ = HNU.LIZ(this, null, 1, null);
    public final C81289I2h LJFF = C81909IQd.LIZ(this, new C4288c(false, 0), null, 2, null);
    public final C81289I2h LJI = C81909IQd.LIZ(this, 0, null, 2, null);

    static {
        Covode.recordClassIndex(25225);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(C4287a.class, "service", "getService()Lcom/bytedance/live/datacontext/IConstantNullable;", 0);
        Reflection.property1(propertyReference1Impl);
        PropertyReference1Impl propertyReference1Impl2 = new PropertyReference1Impl(C4287a.class, "bidViewModel", "getBidViewModel()Lcom/bytedance/live/datacontext/IConstantNullable;", 0);
        Reflection.property1(propertyReference1Impl2);
        PropertyReference1Impl propertyReference1Impl3 = new PropertyReference1Impl(C4287a.class, "watchReport", "getWatchReport()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl3);
        PropertyReference1Impl propertyReference1Impl4 = new PropertyReference1Impl(C4287a.class, "lastSize", "getLastSize()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl4);
        LIZIZ = new KProperty[]{propertyReference1Impl, propertyReference1Impl2, propertyReference1Impl3, propertyReference1Impl4};
    }

    public final AbstractC413392Xt<AbstractC4289e> LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (AbstractC413392Xt) (proxy.isSupported ? proxy.result : this.LIZLLL.LIZ(this, LIZIZ[0]));
    }

    public final AbstractC413392Xt<C4378a> LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return (AbstractC413392Xt) (proxy.isSupported ? proxy.result : this.f26259LJ.LIZ(this, LIZIZ[1]));
    }

    public final C2WC<C4288c> LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJFF.LIZ(this, LIZIZ[2]));
    }

    public final C2WC<Integer> LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJI.LIZ(this, LIZIZ[3]));
    }
}
