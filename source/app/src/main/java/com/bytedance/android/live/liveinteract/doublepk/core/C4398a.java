package com.bytedance.android.live.liveinteract.doublepk.core;

import com.bytedance.android.live.liveinteract.p382pk.AbstractC4725a;
import com.bytedance.android.livesdk.chatroom.model.interact.C6153ak;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.live.datacontext.C13491f;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import p003X.AbstractC413392Xt;
import p003X.AbstractC426192th;
import p003X.AbstractC77591GiP;
import p003X.C2WC;
import p003X.C2WD;
import p003X.C77590GiO;
import p003X.C81289I2h;
import p003X.C81909IQd;
import p003X.HNS;
import p003X.HNU;

/* renamed from: com.bytedance.android.live.liveinteract.doublepk.core.a */
/* loaded from: classes3.dex */
public final class C4398a extends C13491f implements AbstractC77591GiP {
    public static ChangeQuickRedirect LIZ;
    public static final /* synthetic */ KProperty[] LIZIZ;
    public static final C77590GiO LIZJ = new C77590GiO((byte) 0);
    public final C81289I2h LIZLLL = HNU.LIZ(this, null, 1, null);

    /* renamed from: LJ */
    public final C81289I2h f26312LJ = C81909IQd.LIZ(this, null, 1, null);
    public final C81289I2h LJFF = HNS.LIZ(this, null, 1, null);
    public final C81289I2h LJI = C81909IQd.LIZ(this, null, 1, null);
    public final C81289I2h LJII = C81909IQd.LIZ(this, null, 1, null);
    public final C81289I2h LJIIIIZZ = C81909IQd.LIZ(this, 0, null, 2, null);
    public final C81289I2h LJIIIZ = C81909IQd.LIZ(this, null, 1, null);
    public final C81289I2h LJIIJ = C81909IQd.LIZ(this, Boolean.FALSE, null, 2, null);

    static {
        Covode.recordClassIndex(26767);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(C4398a.class, "service", "getService()Lcom/bytedance/live/datacontext/IConstantNullable;", 0);
        Reflection.property1(propertyReference1Impl);
        PropertyReference1Impl propertyReference1Impl2 = new PropertyReference1Impl(C4398a.class, "serverConfig", "getServerConfig()Lcom/bytedance/live/datacontext/IMutableNullable;", 0);
        Reflection.property1(propertyReference1Impl2);
        PropertyReference1Impl propertyReference1Impl3 = new PropertyReference1Impl(C4398a.class, "countDownPlayModeEvent", "getCountDownPlayModeEvent()Lcom/bytedance/live/datacontext/IEventMember;", 0);
        Reflection.property1(propertyReference1Impl3);
        PropertyReference1Impl propertyReference1Impl4 = new PropertyReference1Impl(C4398a.class, "doublePkSate", "getDoublePkSate()Lcom/bytedance/live/datacontext/IMutableNullable;", 0);
        Reflection.property1(propertyReference1Impl4);
        PropertyReference1Impl propertyReference1Impl5 = new PropertyReference1Impl(C4398a.class, "startSource", "getStartSource()Lcom/bytedance/live/datacontext/IMutableNullable;", 0);
        Reflection.property1(propertyReference1Impl5);
        PropertyReference1Impl propertyReference1Impl6 = new PropertyReference1Impl(C4398a.class, "pkTime", "getPkTime()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl6);
        PropertyReference1Impl propertyReference1Impl7 = new PropertyReference1Impl(C4398a.class, "pkStartTime", "getPkStartTime()Lcom/bytedance/live/datacontext/IMutableNullable;", 0);
        Reflection.property1(propertyReference1Impl7);
        PropertyReference1Impl propertyReference1Impl8 = new PropertyReference1Impl(C4398a.class, "doublePkPlayModeEvent", "getDoublePkPlayModeEvent()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl8);
        LIZIZ = new KProperty[]{propertyReference1Impl, propertyReference1Impl2, propertyReference1Impl3, propertyReference1Impl4, propertyReference1Impl5, propertyReference1Impl6, propertyReference1Impl7, propertyReference1Impl8};
    }

    public final AbstractC413392Xt<AbstractC4725a> LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (AbstractC413392Xt) (proxy.isSupported ? proxy.result : this.LIZLLL.LIZ(this, LIZIZ[0]));
    }

    public final C2WD<C6153ak> LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return (C2WD) (proxy.isSupported ? proxy.result : this.f26312LJ.LIZ(this, LIZIZ[1]));
    }

    public final AbstractC426192th<Boolean> LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return (AbstractC426192th) (proxy.isSupported ? proxy.result : this.LJFF.LIZ(this, LIZIZ[2]));
    }

    public final C2WD<AbstractC4404d> LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return (C2WD) (proxy.isSupported ? proxy.result : this.LJI.LIZ(this, LIZIZ[3]));
    }

    /* renamed from: LJ */
    public final C2WD<String> m15740LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return (C2WD) (proxy.isSupported ? proxy.result : this.LJII.LIZ(this, LIZIZ[4]));
    }

    public final C2WC<Integer> LJFF() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJIIIIZZ.LIZ(this, LIZIZ[5]));
    }

    public final C2WD<Long> LJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        return (C2WD) (proxy.isSupported ? proxy.result : this.LJIIIZ.LIZ(this, LIZIZ[6]));
    }

    public final C2WC<Boolean> LJII() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 8);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJIIJ.LIZ(this, LIZIZ[7]));
    }
}
