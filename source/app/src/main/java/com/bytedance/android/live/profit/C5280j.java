package com.bytedance.android.live.profit;

import com.bytedance.android.live.p336h.p337a.AbstractC4248a;
import com.bytedance.android.live.profit.api.AbstractC5247a;
import com.bytedance.android.live.profit.api.C5248d;
import com.bytedance.android.live.profit.dress.api.AbstractC5252a;
import com.bytedance.android.live.profit.fansclub.AbstractC5267o;
import com.bytedance.android.live.profit.lottery.AbstractC5325b;
import com.bytedance.android.live.profit.portal.AbstractC5346a;
import com.bytedance.android.live.profit.privilege.AbstractC5365a;
import com.bytedance.android.live.profit.vote.AbstractC5417b;
import com.bytedance.android.live.profit.wishlist.AbstractC5434a;
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
import p003X.C81289I2h;
import p003X.HNS;
import p003X.HNU;

/* renamed from: com.bytedance.android.live.profit.j */
/* loaded from: classes12.dex */
public final class C5280j extends C13491f implements AbstractC5247a {
    public static ChangeQuickRedirect LIZ;
    public static final /* synthetic */ KProperty[] LIZIZ;
    public final C81289I2h LIZJ = HNS.LIZ(this, null, 1, null);
    public final C81289I2h LIZLLL = HNU.LIZ(this, null, 1, null);

    /* renamed from: LJ */
    public final C81289I2h f26564LJ = HNU.LIZ(this, null, 1, null);
    public final C81289I2h LJFF = HNU.LIZ(this, null, 1, null);
    public final C81289I2h LJI = HNU.LIZ(this, null, 1, null);
    public final C81289I2h LJII = HNU.LIZ(this, null, 1, null);
    public final C81289I2h LJIIIIZZ = HNU.LIZ(this, null, 1, null);
    public final C81289I2h LJIIIZ = HNU.LIZ(this, null, 1, null);
    public final C81289I2h LJIIJ = HNU.LIZ(this, null, 1, null);

    static {
        Covode.recordClassIndex(33385);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(C5280j.class, "onInteractionLayerCreated", "getOnInteractionLayerCreated()Lcom/bytedance/live/datacontext/IEventMember;", 0);
        Reflection.property1(propertyReference1Impl);
        PropertyReference1Impl propertyReference1Impl2 = new PropertyReference1Impl(C5280j.class, "redPacketService", "getRedPacketService()Lcom/bytedance/live/datacontext/IConstantNullable;", 0);
        Reflection.property1(propertyReference1Impl2);
        PropertyReference1Impl propertyReference1Impl3 = new PropertyReference1Impl(C5280j.class, "dressService", "getDressService()Lcom/bytedance/live/datacontext/IConstantNullable;", 0);
        Reflection.property1(propertyReference1Impl3);
        PropertyReference1Impl propertyReference1Impl4 = new PropertyReference1Impl(C5280j.class, "lotteryContext", "getLotteryContext()Lcom/bytedance/live/datacontext/IConstantNullable;", 0);
        Reflection.property1(propertyReference1Impl4);
        PropertyReference1Impl propertyReference1Impl5 = new PropertyReference1Impl(C5280j.class, "portalContext", "getPortalContext()Lcom/bytedance/live/datacontext/IConstantNullable;", 0);
        Reflection.property1(propertyReference1Impl5);
        PropertyReference1Impl propertyReference1Impl6 = new PropertyReference1Impl(C5280j.class, "fansClubContext", "getFansClubContext()Lcom/bytedance/live/datacontext/IConstantNullable;", 0);
        Reflection.property1(propertyReference1Impl6);
        PropertyReference1Impl propertyReference1Impl7 = new PropertyReference1Impl(C5280j.class, "voteContext", "getVoteContext()Lcom/bytedance/live/datacontext/IConstantNullable;", 0);
        Reflection.property1(propertyReference1Impl7);
        PropertyReference1Impl propertyReference1Impl8 = new PropertyReference1Impl(C5280j.class, "privilegeContext", "getPrivilegeContext()Lcom/bytedance/live/datacontext/IConstantNullable;", 0);
        Reflection.property1(propertyReference1Impl8);
        PropertyReference1Impl propertyReference1Impl9 = new PropertyReference1Impl(C5280j.class, "wishListContext", "getWishListContext()Lcom/bytedance/live/datacontext/IConstantNullable;", 0);
        Reflection.property1(propertyReference1Impl9);
        LIZIZ = new KProperty[]{propertyReference1Impl, propertyReference1Impl2, propertyReference1Impl3, propertyReference1Impl4, propertyReference1Impl5, propertyReference1Impl6, propertyReference1Impl7, propertyReference1Impl8, propertyReference1Impl9};
    }

    @Override // com.bytedance.android.live.profit.api.AbstractC5247a
    public final AbstractC426192th<C5248d> LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (AbstractC426192th) (proxy.isSupported ? proxy.result : this.LIZJ.LIZ(this, LIZIZ[0]));
    }

    @Override // com.bytedance.android.live.profit.api.AbstractC5247a
    public final AbstractC413392Xt<AbstractC4248a> LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return (AbstractC413392Xt) (proxy.isSupported ? proxy.result : this.LIZLLL.LIZ(this, LIZIZ[1]));
    }

    @Override // com.bytedance.android.live.profit.api.AbstractC5247a
    public final AbstractC413392Xt<AbstractC5252a> LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return (AbstractC413392Xt) (proxy.isSupported ? proxy.result : this.f26564LJ.LIZ(this, LIZIZ[2]));
    }

    @Override // com.bytedance.android.live.profit.api.AbstractC5247a
    public final AbstractC413392Xt<AbstractC5325b> LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return (AbstractC413392Xt) (proxy.isSupported ? proxy.result : this.LJFF.LIZ(this, LIZIZ[3]));
    }

    @Override // com.bytedance.android.live.profit.api.AbstractC5247a
    /* renamed from: LJ */
    public final AbstractC413392Xt<AbstractC5346a> mo15616LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return (AbstractC413392Xt) (proxy.isSupported ? proxy.result : this.LJI.LIZ(this, LIZIZ[4]));
    }

    @Override // com.bytedance.android.live.profit.api.AbstractC5247a
    public final AbstractC413392Xt<AbstractC5267o> LJFF() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return (AbstractC413392Xt) (proxy.isSupported ? proxy.result : this.LJII.LIZ(this, LIZIZ[5]));
    }

    @Override // com.bytedance.android.live.profit.api.AbstractC5247a
    public final AbstractC413392Xt<AbstractC5417b> LJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        return (AbstractC413392Xt) (proxy.isSupported ? proxy.result : this.LJIIIIZZ.LIZ(this, LIZIZ[6]));
    }

    @Override // com.bytedance.android.live.profit.api.AbstractC5247a
    public final AbstractC413392Xt<AbstractC5365a> LJII() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 8);
        return (AbstractC413392Xt) (proxy.isSupported ? proxy.result : this.LJIIIZ.LIZ(this, LIZIZ[7]));
    }

    @Override // com.bytedance.android.live.profit.api.AbstractC5247a
    public final AbstractC413392Xt<AbstractC5434a> LJIIIIZZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 9);
        return (AbstractC413392Xt) (proxy.isSupported ? proxy.result : this.LJIIJ.LIZ(this, LIZIZ[8]));
    }
}
