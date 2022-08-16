package com.bytedance.android.live.liveinteract.plantform.camera;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.live.datacontext.C13491f;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import p003X.AbstractC413392Xt;
import p003X.C81289I2h;
import p003X.HNU;

/* renamed from: com.bytedance.android.live.liveinteract.plantform.camera.i */
/* loaded from: classes3.dex */
public final class C4795i extends C13491f {
    public static ChangeQuickRedirect LIZ;
    public static final /* synthetic */ KProperty[] LIZIZ;
    public final C81289I2h LIZJ = HNU.LIZ(this, SwitchCameraContext$service$2.INSTANCE);

    static {
        Covode.recordClassIndex(29219);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(C4795i.class, "service", "getService()Lcom/bytedance/live/datacontext/IConstantNullable;", 0);
        Reflection.property1(propertyReference1Impl);
        LIZIZ = new KProperty[]{propertyReference1Impl};
    }

    public final AbstractC413392Xt<AbstractC4793f> LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (AbstractC413392Xt) (proxy.isSupported ? proxy.result : this.LIZJ.LIZ(this, LIZIZ[0]));
    }
}
