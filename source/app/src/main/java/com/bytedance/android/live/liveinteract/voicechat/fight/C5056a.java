package com.bytedance.android.live.liveinteract.voicechat.fight;

import com.bytedance.android.live.liveinteract.p343b.AbstractC4286c;
import com.bytedance.android.livesdk.chatroom.model.interact.C6153ak;
import com.bytedance.android.livesdk.chatroom.model.interact.C6174n;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.live.datacontext.C13491f;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import p003X.AbstractC413392Xt;
import p003X.AbstractC426192th;
import p003X.AbstractC81988ITe;
import p003X.C2WC;
import p003X.C2WD;
import p003X.C78411Gvd;
import p003X.C81289I2h;
import p003X.C81909IQd;
import p003X.HNS;
import p003X.HNU;

/* renamed from: com.bytedance.android.live.liveinteract.voicechat.fight.a */
/* loaded from: classes3.dex */
public final class C5056a extends C13491f implements AbstractC81988ITe {
    public static ChangeQuickRedirect LIZ;
    public static final /* synthetic */ KProperty[] LIZIZ;
    public static final C78411Gvd LIZJ = new C78411Gvd((byte) 0);
    public final C81289I2h LIZLLL = HNU.LIZ(this, null, 1, null);

    /* renamed from: LJ */
    public final C81289I2h f26485LJ = C81909IQd.LIZ(this, 0, null, 2, null);
    public final C81289I2h LJFF = HNS.LIZ(this, TeamFightContext$stateChangeEffect$2.INSTANCE);
    public final C81289I2h LJI = C81909IQd.LIZ(this, 0, null, 2, null);
    public final C81289I2h LJII = C81909IQd.LIZ(this, 0L, null, 2, null);
    public final C81289I2h LJIIIIZZ = C81909IQd.LIZ(this, new C6174n(), null, 2, null);
    public final C81289I2h LJIIIZ = C81909IQd.LIZ(this, null, 1, null);
    public final C81289I2h LJIIJ = C81909IQd.LIZ(this, "", null, 2, null);

    static {
        Covode.recordClassIndex(31312);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(C5056a.class, "service", "getService()Lcom/bytedance/live/datacontext/IConstantNullable;", 0);
        Reflection.property1(propertyReference1Impl);
        PropertyReference1Impl propertyReference1Impl2 = new PropertyReference1Impl(C5056a.class, "fightStatus", "getFightStatus()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl2);
        PropertyReference1Impl propertyReference1Impl3 = new PropertyReference1Impl(C5056a.class, "stateChangeEffect", "getStateChangeEffect()Lcom/bytedance/live/datacontext/IEventMember;", 0);
        Reflection.property1(propertyReference1Impl3);
        PropertyReference1Impl propertyReference1Impl4 = new PropertyReference1Impl(C5056a.class, "currentApplyTeam", "getCurrentApplyTeam()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl4);
        PropertyReference1Impl propertyReference1Impl5 = new PropertyReference1Impl(C5056a.class, "fightStartTime", "getFightStartTime()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl5);
        PropertyReference1Impl propertyReference1Impl6 = new PropertyReference1Impl(C5056a.class, "teamFightInfo", "getTeamFightInfo()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl6);
        PropertyReference1Impl propertyReference1Impl7 = new PropertyReference1Impl(C5056a.class, "serverConfig", "getServerConfig()Lcom/bytedance/live/datacontext/IMutableNullable;", 0);
        Reflection.property1(propertyReference1Impl7);
        PropertyReference1Impl propertyReference1Impl8 = new PropertyReference1Impl(C5056a.class, "requestPage", "getRequestPage()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl8);
        LIZIZ = new KProperty[]{propertyReference1Impl, propertyReference1Impl2, propertyReference1Impl3, propertyReference1Impl4, propertyReference1Impl5, propertyReference1Impl6, propertyReference1Impl7, propertyReference1Impl8};
    }

    @JvmStatic
    public static final boolean LJIIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, LIZ, true, 15);
        return proxy.isSupported ? ((Boolean) proxy.result).booleanValue() : LIZJ.LIZJ();
    }

    @JvmStatic
    public static final boolean LJIILIIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, LIZ, true, 16);
        return proxy.isSupported ? ((Boolean) proxy.result).booleanValue() : LIZJ.LJFF();
    }

    @JvmStatic
    public static final C6174n LJIILJJIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, LIZ, true, 18);
        return proxy.isSupported ? (C6174n) proxy.result : LIZJ.LJII();
    }

    @JvmStatic
    public static final boolean LJIILL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, LIZ, true, 19);
        return proxy.isSupported ? ((Boolean) proxy.result).booleanValue() : LIZJ.LJIIIIZZ();
    }

    public final AbstractC413392Xt<AbstractC4286c> LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (AbstractC413392Xt) (proxy.isSupported ? proxy.result : this.LIZLLL.LIZ(this, LIZIZ[0]));
    }

    /* renamed from: LJ */
    public final C2WC<Integer> m15647LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return (C2WC) (proxy.isSupported ? proxy.result : this.f26485LJ.LIZ(this, LIZIZ[1]));
    }

    public final AbstractC426192th<b$b> LJFF() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return (AbstractC426192th) (proxy.isSupported ? proxy.result : this.LJFF.LIZ(this, LIZIZ[2]));
    }

    public final C2WC<Integer> LJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJI.LIZ(this, LIZIZ[3]));
    }

    public final C2WC<Long> LJII() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJII.LIZ(this, LIZIZ[4]));
    }

    public final C2WC<C6174n> LJIIIIZZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJIIIIZZ.LIZ(this, LIZIZ[5]));
    }

    public final C2WD<C6153ak> LJIIIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        return (C2WD) (proxy.isSupported ? proxy.result : this.LJIIIZ.LIZ(this, LIZIZ[6]));
    }

    public final C2WC<String> LJIIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 8);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJIIJ.LIZ(this, LIZIZ[7]));
    }

    @Override // p003X.AbstractC81988ITe
    public final boolean LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 9);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return LIZJ.LIZJ();
    }

    @Override // p003X.AbstractC81988ITe
    public final boolean LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 10);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return LIZJ.LJFF();
    }

    @Override // p003X.AbstractC81988ITe
    public final C6174n LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 12);
        if (proxy.isSupported) {
            return (C6174n) proxy.result;
        }
        return LJIIIIZZ().LIZ();
    }

    public final int LJIIJJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 11);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        return m15647LJ().LIZ().intValue();
    }
}
