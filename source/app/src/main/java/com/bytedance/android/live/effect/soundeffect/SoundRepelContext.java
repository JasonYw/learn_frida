package com.bytedance.android.live.effect.soundeffect;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.live.datacontext.C13491f;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import p003X.C2WC;
import p003X.C81289I2h;
import p003X.C81909IQd;

/* loaded from: classes5.dex */
public final class SoundRepelContext extends C13491f {
    public static ChangeQuickRedirect LIZ;
    public static final /* synthetic */ KProperty[] LIZIZ;
    public final C81289I2h LIZLLL = C81909IQd.LIZ(this, SoundEffectState.ENABLE, null, 2, null);
    public final C81289I2h LIZJ = C81909IQd.LIZ(this, Boolean.FALSE, null, 2, null);

    /* renamed from: LJ */
    public final C81289I2h f26229LJ = C81909IQd.LIZ(this, Boolean.FALSE, null, 2, null);

    /* loaded from: classes5.dex */
    public enum SoundEffectState {
        ENABLE,
        USING,
        DISABLE_CAUSE_KTV,
        DISABLE_CAUSE_SOUNDSTICKER;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(24587);
        }

        public static SoundEffectState valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (SoundEffectState) (proxy.isSupported ? proxy.result : Enum.valueOf(SoundEffectState.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static SoundEffectState[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (SoundEffectState[]) (proxy.isSupported ? proxy.result : values().clone());
        }
    }

    static {
        Covode.recordClassIndex(24586);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(SoundRepelContext.class, "soundEffectState", "getSoundEffectState()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl);
        PropertyReference1Impl propertyReference1Impl2 = new PropertyReference1Impl(SoundRepelContext.class, "ktvState", "getKtvState()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl2);
        PropertyReference1Impl propertyReference1Impl3 = new PropertyReference1Impl(SoundRepelContext.class, "effectGameState", "getEffectGameState()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl3);
        LIZIZ = new KProperty[]{propertyReference1Impl, propertyReference1Impl2, propertyReference1Impl3};
    }

    public final C2WC<SoundEffectState> LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LIZLLL.LIZ(this, LIZIZ[0]));
    }

    public final C2WC<Boolean> LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return (C2WC) (proxy.isSupported ? proxy.result : this.f26229LJ.LIZ(this, LIZIZ[2]));
    }

    public final boolean LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (LIZ().LIZ() != SoundEffectState.USING) {
            return false;
        }
        return true;
    }
}
