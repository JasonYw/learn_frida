package com.bytedance.android.live.liveinteract.videotalk.battle;

import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.livesdk.chatroom.model.interact.C6165i;
import com.bytedance.android.livesdk.chatroom.model.interact.C6166j;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.live.datacontext.C13491f;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import p003X.AbstractC413392Xt;
import p003X.AbstractC80293Hkt;
import p003X.AbstractC81976ISs;
import p003X.C106862S5w;
import p003X.C2WC;
import p003X.C2WD;
import p003X.C77592GiQ;
import p003X.C79242HLo;
import p003X.C81289I2h;
import p003X.C81909IQd;
import p003X.C87308Kak;
import p003X.HNU;

/* renamed from: com.bytedance.android.live.liveinteract.videotalk.battle.b */
/* loaded from: classes3.dex */
public final class C4891b extends C13491f implements AbstractC81976ISs {
    public static ChangeQuickRedirect LIZ;
    public static final /* synthetic */ KProperty[] LIZIZ;
    public static final C77592GiQ LIZJ = new C77592GiQ((byte) 0);
    public final C81289I2h LIZLLL = HNU.LIZ(this, null, 1, null);

    /* renamed from: LJ */
    public final C81289I2h f26440LJ = C81909IQd.LIZ(this, 0, null, 2, null);
    public final C81289I2h LJFF = C81909IQd.LIZ(this, 0L, null, 2, null);
    public final C81289I2h LJI = C81909IQd.LIZ(this, null, 1, null);
    public final C81289I2h LJII = C81909IQd.LIZ(this, null, 1, null);
    public final C81289I2h LJIIIIZZ;
    public final C81289I2h LJIIIZ;
    public final C81289I2h LJIIJ;

    static {
        Covode.recordClassIndex(29897);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(C4891b.class, "service", "getService()Lcom/bytedance/live/datacontext/IConstantNullable;", 0);
        Reflection.property1(propertyReference1Impl);
        PropertyReference1Impl propertyReference1Impl2 = new PropertyReference1Impl(C4891b.class, "battleState", "getBattleState()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl2);
        PropertyReference1Impl propertyReference1Impl3 = new PropertyReference1Impl(C4891b.class, "battleStartTime", "getBattleStartTime()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl3);
        PropertyReference1Impl propertyReference1Impl4 = new PropertyReference1Impl(C4891b.class, "battleInfo", "getBattleInfo()Lcom/bytedance/live/datacontext/IMutableNullable;", 0);
        Reflection.property1(propertyReference1Impl4);
        PropertyReference1Impl propertyReference1Impl5 = new PropertyReference1Impl(C4891b.class, "serverConfig", "getServerConfig()Lcom/bytedance/live/datacontext/IMutableNullable;", 0);
        Reflection.property1(propertyReference1Impl5);
        PropertyReference1Impl propertyReference1Impl6 = new PropertyReference1Impl(C4891b.class, "configLoserNum", "getConfigLoserNum()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl6);
        PropertyReference1Impl propertyReference1Impl7 = new PropertyReference1Impl(C4891b.class, "onlineLoserNum", "getOnlineLoserNum()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl7);
        PropertyReference1Impl propertyReference1Impl8 = new PropertyReference1Impl(C4891b.class, "dressId", "getDressId()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl8);
        LIZIZ = new KProperty[]{propertyReference1Impl, propertyReference1Impl2, propertyReference1Impl3, propertyReference1Impl4, propertyReference1Impl5, propertyReference1Impl6, propertyReference1Impl7, propertyReference1Impl8};
    }

    @JvmStatic
    public static final C4891b LJIIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, LIZ, true, 14);
        return proxy.isSupported ? (C4891b) proxy.result : LIZJ.LIZ();
    }

    public final AbstractC413392Xt<AbstractC4909l> LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (AbstractC413392Xt) (proxy.isSupported ? proxy.result : this.LIZLLL.LIZ(this, LIZIZ[0]));
    }

    /* renamed from: LJ */
    public final C2WC<Integer> m15690LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return (C2WC) (proxy.isSupported ? proxy.result : this.f26440LJ.LIZ(this, LIZIZ[1]));
    }

    public final C2WC<Long> LJFF() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJFF.LIZ(this, LIZIZ[2]));
    }

    public final C2WD<C6166j> LJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return (C2WD) (proxy.isSupported ? proxy.result : this.LJI.LIZ(this, LIZIZ[3]));
    }

    public final C2WD<C6165i> LJII() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return (C2WD) (proxy.isSupported ? proxy.result : this.LJII.LIZ(this, LIZIZ[4]));
    }

    public final C2WC<Integer> LJIIIIZZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJIIIIZZ.LIZ(this, LIZIZ[5]));
    }

    public final C2WC<Integer> LJIIIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJIIIZ.LIZ(this, LIZIZ[6]));
    }

    public final C2WC<String> LJIIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 8);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJIIJ.LIZ(this, LIZIZ[7]));
    }

    @Override // p003X.AbstractC81976ISs
    public final boolean LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 9);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return LIZJ.LIZJ();
    }

    @Override // p003X.AbstractC81976ISs
    public final boolean LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 10);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return LIZJ.m23816LJ();
    }

    @Override // p003X.AbstractC81976ISs
    public final C6166j LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 12);
        if (proxy.isSupported) {
            return (C6166j) proxy.result;
        }
        return LJI().LIZ();
    }

    public final int LJIIJJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 11);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        return m15690LJ().LIZ().intValue();
    }

    public C4891b() {
        Integer LIZ2;
        C87308Kak<Integer> c87308Kak = AbstractC80293Hkt.f7133dB;
        Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
        Integer LIZ3 = c87308Kak.LIZ();
        if (LIZ3 != null && LIZ3.intValue() == 0) {
            LIZ2 = 1;
        } else {
            C87308Kak<Integer> c87308Kak2 = AbstractC80293Hkt.f7133dB;
            Intrinsics.checkNotNullExpressionValue(c87308Kak2, "");
            LIZ2 = c87308Kak2.LIZ();
        }
        this.LJIIIIZZ = C81909IQd.LIZ(this, LIZ2, null, 2, null);
        this.LJIIIZ = C81909IQd.LIZ(this, 1, null, 2, null);
        this.LJIIJ = C81909IQd.LIZ(this, "0", null, 2, null);
    }

    @Override // p003X.AbstractC81976ISs
    public final boolean LIZ(DataCenter dataCenter) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{dataCenter}, this, LIZ, false, 13);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(dataCenter);
        SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_VIDEO_GUEST_BATTLE_OPEN;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        if (!settingKey.getValue().booleanValue()) {
            return false;
        }
        SettingKey<Integer[]> settingKey2 = LiveConfigSettingKeys.LINK_GUEST_BATTLE_SUPPORT_SCENE;
        Intrinsics.checkNotNullExpressionValue(settingKey2, "");
        Integer[] value = settingKey2.getValue();
        if (value == null) {
            return false;
        }
        return ArraysKt___ArraysKt.contains(value, Integer.valueOf(C79242HLo.LJIIJ()));
    }
}
