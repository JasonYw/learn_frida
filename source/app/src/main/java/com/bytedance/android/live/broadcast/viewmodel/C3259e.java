package com.bytedance.android.live.broadcast.viewmodel;

import com.bytedance.android.live.broadcast.model.StartLiveStyle;
import com.bytedance.android.live.broadcast.preview.base.AbstractC3177c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import p003X.C2WC;
import p003X.C81289I2h;
import p003X.C81909IQd;

/* renamed from: com.bytedance.android.live.broadcast.viewmodel.e */
/* loaded from: classes12.dex */
public final class C3259e extends AbstractC3177c {
    public static ChangeQuickRedirect LIZ;
    public static final /* synthetic */ KProperty[] LIZIZ;
    public final C81289I2h LIZJ = C81909IQd.LIZ(this, 0, null, 2, null);
    public final C81289I2h LIZLLL = C81909IQd.LIZ(this, StartLiveStyle.CLASSICAL, null, 2, null);

    static {
        Covode.recordClassIndex(18146);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(C3259e.class, "isShowChallengeBubble", "isShowChallengeBubble()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl);
        PropertyReference1Impl propertyReference1Impl2 = new PropertyReference1Impl(C3259e.class, "currShowBubble", "getCurrShowBubble()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl2);
        PropertyReference1Impl propertyReference1Impl3 = new PropertyReference1Impl(C3259e.class, "currentStartLiveStyle", "getCurrentStartLiveStyle()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl3);
        LIZIZ = new KProperty[]{propertyReference1Impl, propertyReference1Impl2, propertyReference1Impl3};
    }

    public final C2WC<Integer> LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LIZJ.LIZ(this, LIZIZ[1]));
    }

    public final C2WC<StartLiveStyle> LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LIZLLL.LIZ(this, LIZIZ[2]));
    }

    public C3259e() {
        C81909IQd.LIZ(this, Boolean.FALSE, null, 2, null);
    }
}
