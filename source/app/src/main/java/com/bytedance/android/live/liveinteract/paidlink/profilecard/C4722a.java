package com.bytedance.android.live.liveinteract.paidlink.profilecard;

import com.bytedance.android.live.liveinteract.api.data.C4285g;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4760aa;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.live.datacontext.C13491f;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import p003X.AbstractC413392Xt;
import p003X.AbstractC78358Gum;
import p003X.C2WD;
import p003X.C78357Gul;
import p003X.C81289I2h;
import p003X.C81909IQd;
import p003X.HNU;

/* renamed from: com.bytedance.android.live.liveinteract.paidlink.profilecard.a */
/* loaded from: classes3.dex */
public final class C4722a extends C13491f implements AbstractC78358Gum {
    public static ChangeQuickRedirect LIZ;
    public static final /* synthetic */ KProperty[] LIZIZ;
    public static final C78357Gul LIZJ = new C78357Gul((byte) 0);
    public final C81289I2h LIZLLL = HNU.LIZ(this, null, 1, null);

    /* renamed from: LJ */
    public final C81289I2h f26404LJ = C81909IQd.LIZ(this, null, 1, null);
    public final C81289I2h LJFF = C81909IQd.LIZ(this, null, 1, null);

    static {
        Covode.recordClassIndex(28886);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(C4722a.class, "service", "getService()Lcom/bytedance/live/datacontext/IConstantNullable;", 0);
        Reflection.property1(propertyReference1Impl);
        PropertyReference1Impl propertyReference1Impl2 = new PropertyReference1Impl(C4722a.class, "paidProfileCardPosition", "getPaidProfileCardPosition()Lcom/bytedance/live/datacontext/IMutableNullable;", 0);
        Reflection.property1(propertyReference1Impl2);
        PropertyReference1Impl propertyReference1Impl3 = new PropertyReference1Impl(C4722a.class, "paidProfileCardData", "getPaidProfileCardData()Lcom/bytedance/live/datacontext/IMutableNullable;", 0);
        Reflection.property1(propertyReference1Impl3);
        LIZIZ = new KProperty[]{propertyReference1Impl, propertyReference1Impl2, propertyReference1Impl3};
    }

    public final AbstractC413392Xt<AbstractC4760aa> LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (AbstractC413392Xt) (proxy.isSupported ? proxy.result : this.LIZLLL.LIZ(this, LIZIZ[0]));
    }

    public final C2WD<C4723b> LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return (C2WD) (proxy.isSupported ? proxy.result : this.f26404LJ.LIZ(this, LIZIZ[1]));
    }

    public final C2WD<C4285g> LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return (C2WD) (proxy.isSupported ? proxy.result : this.LJFF.LIZ(this, LIZIZ[2]));
    }

    /* renamed from: com.bytedance.android.live.liveinteract.paidlink.profilecard.a$b */
    /* loaded from: classes3.dex */
    public static final class C4723b {
        public final int LIZ;
        public final int LIZIZ = 0;
        public final int LIZJ;
        public final int LIZLLL;

        /* renamed from: LJ */
        public final int f26405LJ;

        static {
            Covode.recordClassIndex(28888);
        }

        public C4723b(int i, int i2, int i3, int i4, int i5) {
            this.LIZ = i;
            this.LIZJ = i3;
            this.LIZLLL = i4;
            this.f26405LJ = i5;
        }
    }
}
