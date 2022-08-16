package com.bytedance.android.live.liveinteract.videotalk.paid;

import com.bytedance.android.live.liveinteract.p356e.AbstractC4410g;
import com.bytedance.android.livesdk.chatroom.model.interact.C6180u;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.live.datacontext.C13491f;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import p003X.AbstractC413392Xt;
import p003X.AbstractC78550Gxs;
import p003X.C2WC;
import p003X.C2WD;
import p003X.C78545Gxn;
import p003X.C81289I2h;
import p003X.C81909IQd;
import p003X.HNU;

/* renamed from: com.bytedance.android.live.liveinteract.videotalk.paid.a */
/* loaded from: classes3.dex */
public final class C4935a extends C13491f implements AbstractC78550Gxs {
    public static ChangeQuickRedirect LIZ;
    public static final /* synthetic */ KProperty[] LIZIZ;
    public static final C78545Gxn LIZJ = new C78545Gxn((byte) 0);
    public final C81289I2h LIZLLL = HNU.LIZ(this, null, 1, null);

    /* renamed from: LJ */
    public final C81289I2h f26446LJ = C81909IQd.LIZ(this, Boolean.FALSE, null, 2, null);
    public final C81289I2h LJFF = C81909IQd.LIZ(this, null, 1, null);

    static {
        Covode.recordClassIndex(30320);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(C4935a.class, "service", "getService()Lcom/bytedance/live/datacontext/IConstantNullable;", 0);
        Reflection.property1(propertyReference1Impl);
        PropertyReference1Impl propertyReference1Impl2 = new PropertyReference1Impl(C4935a.class, "refreshWaitingUserList", "getRefreshWaitingUserList()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl2);
        PropertyReference1Impl propertyReference1Impl3 = new PropertyReference1Impl(C4935a.class, "normalPaidLinkMicInfo", "getNormalPaidLinkMicInfo()Lcom/bytedance/live/datacontext/IMutableNullable;", 0);
        Reflection.property1(propertyReference1Impl3);
        LIZIZ = new KProperty[]{propertyReference1Impl, propertyReference1Impl2, propertyReference1Impl3};
    }

    public final AbstractC413392Xt<AbstractC4410g> LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (AbstractC413392Xt) (proxy.isSupported ? proxy.result : this.LIZLLL.LIZ(this, LIZIZ[0]));
    }

    public final C2WC<Boolean> LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return (C2WC) (proxy.isSupported ? proxy.result : this.f26446LJ.LIZ(this, LIZIZ[1]));
    }

    public final C2WD<C6180u> LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return (C2WD) (proxy.isSupported ? proxy.result : this.LJFF.LIZ(this, LIZIZ[2]));
    }
}
