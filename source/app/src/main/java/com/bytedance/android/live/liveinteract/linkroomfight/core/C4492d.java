package com.bytedance.android.live.liveinteract.linkroomfight.core;

import com.bytedance.android.live.liveinteract.linkroomfight.core.e$c;
import com.bytedance.android.livesdk.chatroom.model.interact.C6174n;
import com.bytedance.android.livesdkapi.depend.model.live.linker.C9541n;
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
import p003X.AbstractC78468GwY;
import p003X.C2WC;
import p003X.C2WD;
import p003X.C78660Gze;
import p003X.C81289I2h;
import p003X.C81909IQd;
import p003X.HNS;
import p003X.HNU;

/* renamed from: com.bytedance.android.live.liveinteract.linkroomfight.core.d */
/* loaded from: classes3.dex */
public final class C4492d extends C13491f implements AbstractC78468GwY {
    public static ChangeQuickRedirect LIZ;
    public static final /* synthetic */ KProperty[] LIZIZ;
    public static final C78660Gze LIZLLL = new C78660Gze((byte) 0);

    /* renamed from: LJ */
    public final C81289I2h f26336LJ = HNU.LIZ(this, null, 1, null);
    public final C81289I2h LJFF = C81909IQd.LIZ(this, new C6174n(), null, 2, null);
    public final C81289I2h LJI = C81909IQd.LIZ(this, e$c.C4506c.LIZJ, null, 2, null);
    public final C81289I2h LJII = C81909IQd.LIZ(this, null, 1, null);
    public final C81289I2h LJIIIIZZ = HNS.LIZ(this, LinkRoomFightContext$stateChangeEffect$2.INSTANCE);
    public final C81289I2h LIZJ = C81909IQd.LIZ(this, "", null, 2, null);
    public final C81289I2h LJIIIZ = C81909IQd.LIZ(this, 0L, null, 2, null);

    static {
        Covode.recordClassIndex(27640);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(C4492d.class, "service", "getService()Lcom/bytedance/live/datacontext/IConstantNullable;", 0);
        Reflection.property1(propertyReference1Impl);
        PropertyReference1Impl propertyReference1Impl2 = new PropertyReference1Impl(C4492d.class, "fightInfo", "getFightInfo()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl2);
        PropertyReference1Impl propertyReference1Impl3 = new PropertyReference1Impl(C4492d.class, "fightState", "getFightState()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl3);
        PropertyReference1Impl propertyReference1Impl4 = new PropertyReference1Impl(C4492d.class, "linkRoomUpdateContent", "getLinkRoomUpdateContent()Lcom/bytedance/live/datacontext/IMutableNullable;", 0);
        Reflection.property1(propertyReference1Impl4);
        PropertyReference1Impl propertyReference1Impl5 = new PropertyReference1Impl(C4492d.class, "stateChangeEffect", "getStateChangeEffect()Lcom/bytedance/live/datacontext/IEventMember;", 0);
        Reflection.property1(propertyReference1Impl5);
        PropertyReference1Impl propertyReference1Impl6 = new PropertyReference1Impl(C4492d.class, "requestPage", "getRequestPage()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl6);
        PropertyReference1Impl propertyReference1Impl7 = new PropertyReference1Impl(C4492d.class, "startFightTimestamp", "getStartFightTimestamp()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl7);
        LIZIZ = new KProperty[]{propertyReference1Impl, propertyReference1Impl2, propertyReference1Impl3, propertyReference1Impl4, propertyReference1Impl5, propertyReference1Impl6, propertyReference1Impl7};
    }

    public final AbstractC413392Xt<AbstractC4491b> LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (AbstractC413392Xt) (proxy.isSupported ? proxy.result : this.f26336LJ.LIZ(this, LIZIZ[0]));
    }

    public final C2WC<C6174n> LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJFF.LIZ(this, LIZIZ[1]));
    }

    public final C2WC<e$c> LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJI.LIZ(this, LIZIZ[2]));
    }

    public final C2WD<C9541n> LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return (C2WD) (proxy.isSupported ? proxy.result : this.LJII.LIZ(this, LIZIZ[3]));
    }

    /* renamed from: LJ */
    public final AbstractC426192th<e$b> m15732LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return (AbstractC426192th) (proxy.isSupported ? proxy.result : this.LJIIIIZZ.LIZ(this, LIZIZ[4]));
    }

    public final C2WC<Long> LJFF() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 8);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJIIIZ.LIZ(this, LIZIZ[6]));
    }
}
