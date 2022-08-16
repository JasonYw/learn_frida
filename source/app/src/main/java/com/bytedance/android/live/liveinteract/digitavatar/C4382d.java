package com.bytedance.android.live.liveinteract.digitavatar;

import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.liveinteract.digitavatar.ktvavatar.KtvSingMode;
import com.bytedance.android.live.liveinteract.digitavatar.videoavatar.C4387c;
import com.bytedance.android.live.liveinteract.digitavatar.videoavatar.C4388d;
import com.bytedance.android.live.liveinteract.digitavatar.videoavatar.VideoShowMode;
import com.bytedance.android.live.liveinteract.videotalk.emoji.model.C4929c;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.live.datacontext.C13491f;
import com.bytedance.p1300mt.protector.impl.GsonProtectorUtils;
import com.p3021tt.miniapp.audio.background.BgAudioManagerClient;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import p003X.AbstractC426192th;
import p003X.AbstractC80293Hkt;
import p003X.C106862S5w;
import p003X.C2WC;
import p003X.C2WD;
import p003X.C409882Kg;
import p003X.C78730H1w;
import p003X.C78744H2k;
import p003X.C79242HLo;
import p003X.C81289I2h;
import p003X.C81909IQd;
import p003X.C87308Kak;
import p003X.H30;
import p003X.H99;
import p003X.HH8;
import p003X.HNS;
import p003X.KM9;

/* renamed from: com.bytedance.android.live.liveinteract.digitavatar.d */
/* loaded from: classes3.dex */
public final class C4382d extends C13491f {
    public static ChangeQuickRedirect LIZ;
    public static final /* synthetic */ KProperty[] LIZIZ;
    public static final C78744H2k LIZLLL = new C78744H2k((byte) 0);
    public boolean LIZJ;

    /* renamed from: LJ */
    public final C81289I2h f26307LJ = C81909IQd.LIZ(this, KtvSingMode.AUDIO, null, 2, null);
    public final C81289I2h LJFF = C81909IQd.LIZ(this, new C4383i(false, null, false, null, false, 0, 63), null, 2, null);
    public final C81289I2h LJI = C81909IQd.LIZ(this, VideoShowMode.AUDIO, null, 2, null);
    public final C81289I2h LJII = HNS.LIZ(this, null, 1, null);
    public final C81289I2h LJIIIIZZ = HNS.LIZ(this, null, 1, null);
    public final C81289I2h LJIIIZ = C81909IQd.LIZ(this, Boolean.FALSE, null, 2, null);
    public final C81289I2h LJIIJ = C81909IQd.LIZ(this, Boolean.FALSE, null, 2, null);
    public final C81289I2h LJIIJJI = C81909IQd.LIZ(this, 0, null, 2, null);
    public final C81289I2h LJIIL = C81909IQd.LIZ(this, null, 1, null);
    public final C81289I2h LJIILIIL = HNS.LIZ(this, null, 1, null);
    public final C81289I2h LJIILJJIL = HNS.LIZ(this, null, 1, null);
    public final C81289I2h LJIILL = HNS.LIZ(this, null, 1, null);
    public final C81289I2h LJIILLIIL = C81909IQd.LIZ(this, Boolean.FALSE, null, 2, null);
    public final C81289I2h LJIIZILJ = C81909IQd.LIZ(this, Boolean.FALSE, null, 2, null);

    static {
        Covode.recordClassIndex(26621);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(C4382d.class, "singMode", "getSingMode()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl);
        PropertyReference1Impl propertyReference1Impl2 = new PropertyReference1Impl(C4382d.class, "digitAvatar", "getDigitAvatar()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl2);
        PropertyReference1Impl propertyReference1Impl3 = new PropertyReference1Impl(C4382d.class, "videoShowMode", "getVideoShowMode()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl3);
        PropertyReference1Impl propertyReference1Impl4 = new PropertyReference1Impl(C4382d.class, "setVideoShowModeEvent", "getSetVideoShowModeEvent()Lcom/bytedance/live/datacontext/IEventMember;", 0);
        Reflection.property1(propertyReference1Impl4);
        PropertyReference1Impl propertyReference1Impl5 = new PropertyReference1Impl(C4382d.class, "setVideoShowModeResult", "getSetVideoShowModeResult()Lcom/bytedance/live/datacontext/IEventMember;", 0);
        Reflection.property1(propertyReference1Impl5);
        PropertyReference1Impl propertyReference1Impl6 = new PropertyReference1Impl(C4382d.class, "usedAvatarThisLinkRound", "getUsedAvatarThisLinkRound()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl6);
        PropertyReference1Impl propertyReference1Impl7 = new PropertyReference1Impl(C4382d.class, "currentUsingDigitAvatarInVideoTalkRoom", "getCurrentUsingDigitAvatarInVideoTalkRoom()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl7);
        PropertyReference1Impl propertyReference1Impl8 = new PropertyReference1Impl(C4382d.class, "stageBgColor", "getStageBgColor()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl8);
        PropertyReference1Impl propertyReference1Impl9 = new PropertyReference1Impl(C4382d.class, "stageBgSnippet", "getStageBgSnippet()Lcom/bytedance/live/datacontext/IMutableNullable;", 0);
        Reflection.property1(propertyReference1Impl9);
        PropertyReference1Impl propertyReference1Impl10 = new PropertyReference1Impl(C4382d.class, "requestStageBgSnippet", "getRequestStageBgSnippet()Lcom/bytedance/live/datacontext/IEventMember;", 0);
        Reflection.property1(propertyReference1Impl10);
        PropertyReference1Impl propertyReference1Impl11 = new PropertyReference1Impl(C4382d.class, "sendAvatarEmoji", "getSendAvatarEmoji()Lcom/bytedance/live/datacontext/IEventMember;", 0);
        Reflection.property1(propertyReference1Impl11);
        PropertyReference1Impl propertyReference1Impl12 = new PropertyReference1Impl(C4382d.class, "requestUpdateAvatar", "getRequestUpdateAvatar()Lcom/bytedance/live/datacontext/IEventMember;", 0);
        Reflection.property1(propertyReference1Impl12);
        PropertyReference1Impl propertyReference1Impl13 = new PropertyReference1Impl(C4382d.class, "isPickImageWithGallery", "isPickImageWithGallery()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl13);
        PropertyReference1Impl propertyReference1Impl14 = new PropertyReference1Impl(C4382d.class, "isPickImageWidthCamera", "isPickImageWidthCamera()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl14);
        LIZIZ = new KProperty[]{propertyReference1Impl, propertyReference1Impl2, propertyReference1Impl3, propertyReference1Impl4, propertyReference1Impl5, propertyReference1Impl6, propertyReference1Impl7, propertyReference1Impl8, propertyReference1Impl9, propertyReference1Impl10, propertyReference1Impl11, propertyReference1Impl12, propertyReference1Impl13, propertyReference1Impl14};
    }

    public final C2WC<KtvSingMode> LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (C2WC) (proxy.isSupported ? proxy.result : this.f26307LJ.LIZ(this, LIZIZ[0]));
    }

    public final C2WC<C4383i> LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJFF.LIZ(this, LIZIZ[1]));
    }

    public final C2WC<VideoShowMode> LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJI.LIZ(this, LIZIZ[2]));
    }

    public final AbstractC426192th<C4387c> LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return (AbstractC426192th) (proxy.isSupported ? proxy.result : this.LJII.LIZ(this, LIZIZ[3]));
    }

    /* renamed from: LJ */
    public final AbstractC426192th<C4388d> m15741LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return (AbstractC426192th) (proxy.isSupported ? proxy.result : this.LJIIIIZZ.LIZ(this, LIZIZ[4]));
    }

    public final C2WC<Boolean> LJFF() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJIIIZ.LIZ(this, LIZIZ[5]));
    }

    public final C2WC<Boolean> LJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJIIJ.LIZ(this, LIZIZ[6]));
    }

    public final C2WC<Integer> LJII() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 8);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJIIJJI.LIZ(this, LIZIZ[7]));
    }

    public final C2WD<File> LJIIIIZZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 9);
        return (C2WD) (proxy.isSupported ? proxy.result : this.LJIIL.LIZ(this, LIZIZ[8]));
    }

    public final AbstractC426192th<Boolean> LJIIIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 10);
        return (AbstractC426192th) (proxy.isSupported ? proxy.result : this.LJIILIIL.LIZ(this, LIZIZ[9]));
    }

    public final AbstractC426192th<C4929c> LJIIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 11);
        return (AbstractC426192th) (proxy.isSupported ? proxy.result : this.LJIILJJIL.LIZ(this, LIZIZ[10]));
    }

    public final AbstractC426192th<C4385u> LJIIJJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 12);
        return (AbstractC426192th) (proxy.isSupported ? proxy.result : this.LJIILL.LIZ(this, LIZIZ[11]));
    }

    public final boolean LJIIL() {
        boolean z = this.LIZJ;
        this.LIZJ = false;
        return z;
    }

    public final void LJIILIIL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 15).isSupported) {
            return;
        }
        String json = GsonProtectorUtils.toJson(KM9.LIZ(), LIZIZ().LIZ());
        C87308Kak<Map<String, String>> c87308Kak = AbstractC80293Hkt.f7149dR;
        Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
        Map<String, String> LIZ2 = c87308Kak.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        Map<String, String> map = LIZ2;
        String valueOf = String.valueOf(C79242HLo.LIZ());
        Intrinsics.checkNotNullExpressionValue(json, "");
        map.put(valueOf, json);
        C87308Kak<Map<String, String>> c87308Kak2 = AbstractC80293Hkt.f7149dR;
        Intrinsics.checkNotNullExpressionValue(c87308Kak2, "");
        c87308Kak2.LIZ(map);
    }

    public final void LJIILLIIL() {
        C5923dp LIZ2;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 18).isSupported && (LIZ2 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null)) != null && !C78730H1w.LIZ(LIZ2.LJIILJJIL().LIZIZ().booleanValue(), LIZ2.LIZ().LIZ(), false, 4, null).contains(LIZJ().LIZ())) {
            ALogger.m15797i("KtvDigitAvatar", "checkEnsureVideoShowMode: 当前showMode为" + LIZJ().LIZ() + "，但是房间/用户不支持该showMode，so校正为AUDIO");
            LIZJ().LIZ(VideoShowMode.AUDIO);
        }
    }

    public final void LJIILJJIL() {
        String str = "";
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 16).isSupported) {
            return;
        }
        C4383i LIZ2 = LIZIZ().LIZ();
        try {
            C87308Kak<Map<String, String>> c87308Kak = AbstractC80293Hkt.f7149dR;
            Intrinsics.checkNotNullExpressionValue(c87308Kak, str);
            Map<String, String> LIZ3 = c87308Kak.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ3, str);
            String str2 = LIZ3.get(String.valueOf(C79242HLo.LIZ()));
            if (str2 == null) {
                str = "{}";
            } else {
                str = str2;
            }
            C4383i c4383i = (C4383i) KM9.LIZ().fromJson(str, (Class<Object>) C4383i.class);
            if (c4383i != null && !PatchProxy.proxy(new Object[]{c4383i}, LIZ2, C4383i.LIZ, false, 4).isSupported) {
                C106862S5w.LIZ(c4383i);
                LIZ2.LIZIZ = c4383i.LIZIZ;
                LIZ2.LIZLLL = c4383i.LIZLLL;
                LIZ2.f26308LJ = c4383i.f26308LJ;
                LIZ2.LJFF = c4383i.LJFF;
                LIZ2.LIZJ = c4383i.LIZJ;
                LIZ2.LJI = c4383i.LJI;
            }
        } catch (Throwable th) {
            ALogger.m15799e("KtvDigitAvatar", "从sp中读取avatar数据出错. avatarData=" + str, th);
            if (!PatchProxy.proxy(new Object[]{th, str}, HH8.LIZIZ, HH8.LIZ, false, 192).isSupported) {
                C106862S5w.LIZ(th, str);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put(BgAudioManagerClient.API_CALLBACK_EXCEPTION, th.toString());
                linkedHashMap.put("avatar_data", str);
                HH8.LIZ("avatar_deserialize_from_sp_exception", (Map) linkedHashMap, false, 4, (Object) null);
            }
        }
        if (LIZ2.LIZIZ) {
            String str3 = LIZ2.f26308LJ;
            if (str3 == null || str3.length() == 0) {
                ALogger.m15797i("KtvDigitAvatar", "初始化avatar性别为用户性别：gender=" + H99.LIZ());
                AvatarGender LIZ4 = H99.LIZ();
                if (!PatchProxy.proxy(new Object[]{LIZ4}, LIZ2, C4383i.LIZ, false, 5).isSupported) {
                    C106862S5w.LIZ(LIZ4);
                    LIZ2.LIZJ = LIZ4;
                }
            }
        }
    }

    public final void LJIILL() {
        C5923dp LIZ2;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 17).isSupported || (LIZ2 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null)) == null) {
            return;
        }
        int i = H30.LIZ[LIZ().LIZ().ordinal()];
        if (i != 1) {
            if (i == 2 && !C79242HLo.LIZ(LIZ2.LIZ().LIZ())) {
                ALogger.m15797i("KtvDigitAvatar", "checkEnsureSingMode: 当前演唱模式为DIGIT_AVATAR，但是房间/用户不支持avatar演唱，so校正为AUDIO");
                LIZ().LIZ(KtvSingMode.AUDIO);
            }
        } else if (C79242HLo.LIZ(LIZ2.LJIILJJIL().LIZIZ().booleanValue(), LIZ2.LIZ().LIZ(), 1)) {
        } else {
            ALogger.m15797i("KtvDigitAvatar", "checkEnsureSingMode: 当前演唱模式为VIDEO，但是房间/用户不支持视频演唱，so校正为AUDIO");
            LIZ().LIZ(KtvSingMode.AUDIO);
        }
    }
}
