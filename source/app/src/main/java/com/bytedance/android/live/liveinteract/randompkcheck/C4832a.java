package com.bytedance.android.live.liveinteract.randompkcheck;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.live.datacontext.C13491f;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import p003X.AbstractC426192th;
import p003X.C2WC;
import p003X.C79762HcK;
import p003X.C81289I2h;
import p003X.C81909IQd;
import p003X.HNS;

/* renamed from: com.bytedance.android.live.liveinteract.randompkcheck.a */
/* loaded from: classes3.dex */
public final class C4832a extends C13491f {
    public static ChangeQuickRedirect LIZ;
    public static final /* synthetic */ KProperty[] LIZIZ;
    public static final C79762HcK LIZJ = new C79762HcK((byte) 0);
    public final C81289I2h LIZLLL = C81909IQd.LIZ(this, Boolean.FALSE, null, 2, null);

    /* renamed from: LJ */
    public final C81289I2h f26435LJ = HNS.LIZ(this, null, 1, null);

    static {
        Covode.recordClassIndex(29591);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(C4832a.class, "randomChecked", "getRandomChecked()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl);
        PropertyReference1Impl propertyReference1Impl2 = new PropertyReference1Impl(C4832a.class, "startRandomMatch", "getStartRandomMatch()Lcom/bytedance/live/datacontext/IEventMember;", 0);
        Reflection.property1(propertyReference1Impl2);
        LIZIZ = new KProperty[]{propertyReference1Impl, propertyReference1Impl2};
    }

    @JvmStatic
    public static final void LIZ(boolean z, boolean z2) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), (byte) 0}, null, LIZ, true, 5).isSupported) {
            return;
        }
        LIZJ.LIZ(z, false);
    }

    public final C2WC<Boolean> LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LIZLLL.LIZ(this, LIZIZ[0]));
    }

    public final AbstractC426192th<String> LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return (AbstractC426192th) (proxy.isSupported ? proxy.result : this.f26435LJ.LIZ(this, LIZIZ[1]));
    }
}
