package com.bytedance.android.live.liveinteract.multianchor.pklaunch;

import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4781u;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.live.datacontext.C13491f;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import p003X.AbstractC413392Xt;
import p003X.C106862S5w;
import p003X.C81289I2h;
import p003X.HNU;
import p003X.HO8;
import p003X.HOA;

/* renamed from: com.bytedance.android.live.liveinteract.multianchor.pklaunch.a */
/* loaded from: classes3.dex */
public final class C4566a extends C13491f implements HOA {
    public static ChangeQuickRedirect LIZ;
    public static final /* synthetic */ KProperty[] LIZIZ;
    public static final HO8 LIZJ = new HO8((byte) 0);
    public final C81289I2h LIZLLL = HNU.LIZ(this, null, 1, null);

    static {
        Covode.recordClassIndex(28321);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(C4566a.class, "service", "getService()Lcom/bytedance/live/datacontext/IConstantNullable;", 0);
        Reflection.property1(propertyReference1Impl);
        LIZIZ = new KProperty[]{propertyReference1Impl};
    }

    public final AbstractC413392Xt<AbstractC4781u> LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (AbstractC413392Xt) (proxy.isSupported ? proxy.result : this.LIZLLL.LIZ(this, LIZIZ[0]));
    }

    public C4566a(C5923dp c5923dp) {
        C106862S5w.LIZ(c5923dp);
    }
}
