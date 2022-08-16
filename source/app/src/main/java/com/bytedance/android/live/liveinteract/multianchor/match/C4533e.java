package com.bytedance.android.live.liveinteract.multianchor.match;

import com.bytedance.android.livesdk.chatroom.interact.model.C6053g;
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
import p003X.C2WC;
import p003X.C2WD;
import p003X.C79657Had;
import p003X.C79662Hai;
import p003X.C81289I2h;
import p003X.C81909IQd;
import p003X.HNS;
import p003X.HNU;

/* renamed from: com.bytedance.android.live.liveinteract.multianchor.match.e */
/* loaded from: classes3.dex */
public final class C4533e extends C13491f {
    public static ChangeQuickRedirect LIZ;
    public static final /* synthetic */ KProperty[] LIZIZ;
    public static final C79657Had LIZJ = new C79657Had((byte) 0);
    public final C81289I2h LIZLLL = HNU.LIZ(this, null, 1, null);

    /* renamed from: LJ */
    public final C81289I2h f26347LJ = C81909IQd.LIZ(this, C79662Hai.f6870LJ, null, 2, null);
    public final C81289I2h LJFF = C81909IQd.LIZ(this, C79662Hai.f6870LJ, null, 2, null);
    public final C81289I2h LJI = C81909IQd.LIZ(this, null, 1, null);
    public final C81289I2h LJII = C81909IQd.LIZ(this, null, 1, null);
    public final C81289I2h LJIIIIZZ = C81909IQd.LIZ(this, -1L, null, 2, null);
    public final C81289I2h LJIIIZ = HNS.LIZ(this, MultiPkMatchContext$matchSuccessEvent$2.INSTANCE);

    static {
        Covode.recordClassIndex(28123);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(C4533e.class, "service", "getService()Lcom/bytedance/live/datacontext/IConstantNullable;", 0);
        Reflection.property1(propertyReference1Impl);
        PropertyReference1Impl propertyReference1Impl2 = new PropertyReference1Impl(C4533e.class, "matchStatus", "getMatchStatus()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl2);
        PropertyReference1Impl propertyReference1Impl3 = new PropertyReference1Impl(C4533e.class, "lastMatchStatus", "getLastMatchStatus()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl3);
        PropertyReference1Impl propertyReference1Impl4 = new PropertyReference1Impl(C4533e.class, "selfAutoMatchInfo", "getSelfAutoMatchInfo()Lcom/bytedance/live/datacontext/IMutableNullable;", 0);
        Reflection.property1(propertyReference1Impl4);
        PropertyReference1Impl propertyReference1Impl5 = new PropertyReference1Impl(C4533e.class, "passiveAutoMatchInfo", "getPassiveAutoMatchInfo()Lcom/bytedance/live/datacontext/IMutableNullable;", 0);
        Reflection.property1(propertyReference1Impl5);
        PropertyReference1Impl propertyReference1Impl6 = new PropertyReference1Impl(C4533e.class, "countDownTime", "getCountDownTime()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl6);
        PropertyReference1Impl propertyReference1Impl7 = new PropertyReference1Impl(C4533e.class, "matchSuccessEvent", "getMatchSuccessEvent()Lcom/bytedance/live/datacontext/IEventMember;", 0);
        Reflection.property1(propertyReference1Impl7);
        LIZIZ = new KProperty[]{propertyReference1Impl, propertyReference1Impl2, propertyReference1Impl3, propertyReference1Impl4, propertyReference1Impl5, propertyReference1Impl6, propertyReference1Impl7};
    }

    public final AbstractC413392Xt<AbstractC4530a> LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (AbstractC413392Xt) (proxy.isSupported ? proxy.result : this.LIZLLL.LIZ(this, LIZIZ[0]));
    }

    public final C2WC<AbstractC4531c> LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return (C2WC) (proxy.isSupported ? proxy.result : this.f26347LJ.LIZ(this, LIZIZ[1]));
    }

    public final C2WC<AbstractC4531c> LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJFF.LIZ(this, LIZIZ[2]));
    }

    public final C2WD<C6053g> LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return (C2WD) (proxy.isSupported ? proxy.result : this.LJI.LIZ(this, LIZIZ[3]));
    }

    /* renamed from: LJ */
    public final C2WD<C6053g> m15725LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return (C2WD) (proxy.isSupported ? proxy.result : this.LJII.LIZ(this, LIZIZ[4]));
    }

    public final C2WC<Long> LJFF() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJIIIIZZ.LIZ(this, LIZIZ[5]));
    }

    public final AbstractC426192th<C4532d> LJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        return (AbstractC426192th) (proxy.isSupported ? proxy.result : this.LJIIIZ.LIZ(this, LIZIZ[6]));
    }

    public final C6053g LJII() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 8);
        if (proxy.isSupported) {
            return (C6053g) proxy.result;
        }
        if (LIZIZ().LIZ().LIZLLL) {
            return m15725LJ().LIZ();
        }
        return LIZLLL().LIZ();
    }
}
