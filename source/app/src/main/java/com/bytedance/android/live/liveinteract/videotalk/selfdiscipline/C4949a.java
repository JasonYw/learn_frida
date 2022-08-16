package com.bytedance.android.live.liveinteract.videotalk.selfdiscipline;

import com.bytedance.android.live.liveinteract.p357f.AbstractC4411b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.live.datacontext.C13491f;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import p003X.AbstractC413392Xt;
import p003X.C2WC;
import p003X.C79120HGw;
import p003X.C81289I2h;
import p003X.C81909IQd;
import p003X.HH7;
import p003X.HNU;

/* renamed from: com.bytedance.android.live.liveinteract.videotalk.selfdiscipline.a */
/* loaded from: classes3.dex */
public final class C4949a extends C13491f implements HH7 {
    public static ChangeQuickRedirect LIZ;
    public static final /* synthetic */ KProperty[] LIZIZ;
    public static boolean LIZJ;
    public final C81289I2h LJFF = HNU.LIZ(this, null, 1, null);
    public final C81289I2h LJI = C81909IQd.LIZ(this, "", null, 2, null);
    public final C81289I2h LJII = C81909IQd.LIZ(this, 0, null, 2, null);
    public final C81289I2h LJIIIIZZ = C81909IQd.LIZ(this, Boolean.FALSE, null, 2, null);
    public final Lazy LJIIIZ = LazyKt__LazyJVMKt.lazy(SelfDisciplineContext$durationHolder$2.INSTANCE);

    /* renamed from: LJ */
    public static final C79120HGw f26454LJ = new C79120HGw((byte) 0);
    public static String LIZLLL = "null";

    public final AbstractC413392Xt<AbstractC4411b> LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (AbstractC413392Xt) (proxy.isSupported ? proxy.result : this.LJFF.LIZ(this, LIZIZ[0]));
    }

    public final C2WC<String> LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJI.LIZ(this, LIZIZ[1]));
    }

    public final C2WC<Integer> LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJII.LIZ(this, LIZIZ[2]));
    }

    public final C2WC<Boolean> LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJIIIIZZ.LIZ(this, LIZIZ[3]));
    }

    /* renamed from: LJ */
    public final ConcurrentHashMap<Long, Long> m15680LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return (ConcurrentHashMap) (proxy.isSupported ? proxy.result : this.LJIIIZ.mo27335getValue());
    }

    static {
        Covode.recordClassIndex(30397);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(C4949a.class, "service", "getService()Lcom/bytedance/live/datacontext/IConstantNullable;", 0);
        Reflection.property1(propertyReference1Impl);
        PropertyReference1Impl propertyReference1Impl2 = new PropertyReference1Impl(C4949a.class, "currentTarget", "getCurrentTarget()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl2);
        PropertyReference1Impl propertyReference1Impl3 = new PropertyReference1Impl(C4949a.class, "status", "getStatus()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl3);
        PropertyReference1Impl propertyReference1Impl4 = new PropertyReference1Impl(C4949a.class, "isLeaving", "isLeaving()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl4);
        LIZIZ = new KProperty[]{propertyReference1Impl, propertyReference1Impl2, propertyReference1Impl3, propertyReference1Impl4};
    }
}
