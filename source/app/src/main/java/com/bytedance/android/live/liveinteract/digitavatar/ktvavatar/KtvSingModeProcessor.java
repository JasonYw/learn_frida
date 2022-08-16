package com.bytedance.android.live.liveinteract.digitavatar.ktvavatar;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.effect.api.C4173o;
import com.bytedance.android.live.effect.api.LiveEffectContextFactory;
import com.bytedance.android.live.liveinteract.digitavatar.AvatarGender;
import com.bytedance.android.live.liveinteract.digitavatar.C4382d;
import com.bytedance.android.live.liveinteract.digitavatar.C4383i;
import com.bytedance.android.live.liveinteract.digitavatar.DigitAvatarMsgController;
import com.bytedance.android.live.liveinteract.voicechat.AbstractC5003c;
import com.bytedance.android.livesdkapi.depend.model.Sticker;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import p002O.C0002O;
import p003X.AbstractC426192th;
import p003X.AbstractC79061HEp;
import p003X.AbstractC80293Hkt;
import p003X.AbstractC80486Ho0;
import p003X.C106862S5w;
import p003X.C2WC;
import p003X.C78757H2x;
import p003X.C80406Hmi;
import p003X.C80420Hmw;
import p003X.C80421Hmx;
import p003X.C80422Hmy;
import p003X.C80432Hn8;
import p003X.C87308Kak;
import p003X.C88440Kt0;
import p003X.H99;
import p003X.HH8;

/* loaded from: classes3.dex */
public final class KtvSingModeProcessor {
    public static ChangeQuickRedirect LIZ;
    public boolean LIZIZ;
    public String LIZJ;
    public boolean LIZLLL;
    public File LJI;
    public KtvSingMode LJII;
    public final DigitAvatarMsgController LJIIIZ;
    public long LJIIJJI;
    public final boolean LJIIL;
    public boolean LJIIIIZZ = false;
    public final Handler LJIIJ = new Handler(Looper.getMainLooper());

    /* renamed from: LJ */
    public SingModeStartType f26310LJ = SingModeStartType.BeSinger;
    public AvatarGender LJFF = AvatarGender.Male;

    /* loaded from: classes3.dex */
    public enum SingModeStartType {
        BeSinger,
        SingModeChange;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(26672);
        }

        public static SingModeStartType valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (SingModeStartType) (proxy.isSupported ? proxy.result : Enum.valueOf(SingModeStartType.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static SingModeStartType[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (SingModeStartType[]) (proxy.isSupported ? proxy.result : values().clone());
        }
    }

    static {
        Covode.recordClassIndex(26671);
    }

    public final boolean LIZ() {
        AbstractC79061HEp LJIILIIL;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        AbstractC5003c LIZ2 = AbstractC5003c.LIZ.LIZ();
        if (LIZ2 != null && (LJIILIIL = LIZ2.LJIILIIL()) != null) {
            return LJIILIIL.LIZIZ();
        }
        return false;
    }

    public final void LIZ(boolean z) {
        C4382d LIZ2;
        C2WC<C4383i> LIZIZ;
        C4383i LIZ3;
        String str;
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 7).isSupported && z && this.LJIIIIZZ && this.LJII == KtvSingMode.DIGIT_AVATAR && (LIZ2 = C4382d.LIZLLL.LIZ()) != null && (LIZIZ = LIZ2.LIZIZ()) != null && (LIZ3 = LIZIZ.LIZ()) != null && (str = LIZ3.f26308LJ) != null) {
            ALogger.m15797i("KtvDigitAvatar", C0002O.m25086C("收到avatar审核通过的消息，而我正在用avatar唱歌，so 向道具发消息更新形象使用审核过后的形象，avatarData=", str));
            this.LJIIIZ.LIZ(str);
        }
    }

    public final void LIZIZ() {
        AbstractC426192th<Boolean> LJIIIZ;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported && this.LJIIIIZZ && this.LJII == KtvSingMode.DIGIT_AVATAR) {
            File file = this.LJI;
            if (file != null) {
                ALogger.m15797i("KtvDigitAvatar", "向道具发送ktv舞台背景，snippet=" + file);
                this.LJIIIZ.LIZIZ(file);
                return;
            }
            ALogger.m15797i("KtvDigitAvatar", "向道具发送ktv舞台背景时，snippet=null");
            HH8.LIZIZ.LJIIIIZZ();
            C4382d LIZ2 = C4382d.LIZLLL.LIZ();
            if (LIZ2 != null && (LJIIIZ = LIZ2.LJIIIZ()) != null) {
                LJIIIZ.LIZ(Boolean.TRUE);
            }
        }
    }

    private final void LIZ(AbstractC80486Ho0 abstractC80486Ho0) {
        AbstractC5003c LIZ2;
        AbstractC79061HEp LJIILIIL;
        if (PatchProxy.proxy(new Object[]{abstractC80486Ho0}, this, LIZ, false, 19).isSupported) {
            return;
        }
        ALogger.m15797i("KtvDigitAvatar", "停止使用audio模式进行演唱, currentMode=" + H99.LIZIZ());
        if (Intrinsics.areEqual(abstractC80486Ho0, C80421Hmx.LJFF) && (LIZ2 = AbstractC5003c.LIZ.LIZ()) != null && (LJIILIIL = LIZ2.LJIILIIL()) != null) {
            LJIILIIL.LIZ(0);
        }
    }

    private final void LIZIZ(SingModeStartType singModeStartType) {
        AbstractC79061HEp LJIILIIL;
        AbstractC5003c LIZ2;
        AbstractC79061HEp LJIILIIL2;
        if (PatchProxy.proxy(new Object[]{singModeStartType}, this, LIZ, false, 16).isSupported) {
            return;
        }
        ALogger.m15797i("KtvDigitAvatar", "开始使用video模式进行演唱，startType=" + singModeStartType);
        int i = C80406Hmi.LIZLLL[singModeStartType.ordinal()];
        if (i != 1) {
            if (i == 2 && (LIZ2 = AbstractC5003c.LIZ.LIZ()) != null && (LJIILIIL2 = LIZ2.LJIILIIL()) != null) {
                LJIILIIL2.LIZIZ("self_apply");
                return;
            }
            return;
        }
        AbstractC5003c LIZ3 = AbstractC5003c.LIZ.LIZ();
        if (LIZ3 != null && (LJIILIIL = LIZ3.LJIILIIL()) != null) {
            LJIILIIL.LIZ(1, true);
        }
    }

    private final void LIZ(SingModeStartType singModeStartType) {
        AvatarGender LIZ2;
        C2WC<C4383i> LIZIZ;
        C4383i LIZ3;
        if (PatchProxy.proxy(new Object[]{singModeStartType}, this, LIZ, false, 12).isSupported) {
            return;
        }
        C4382d LIZ4 = C4382d.LIZLLL.LIZ();
        if (LIZ4 == null || (LIZIZ = LIZ4.LIZIZ()) == null || (LIZ3 = LIZIZ.LIZ()) == null || (LIZ2 = LIZ3.LIZJ) == null) {
            LIZ2 = H99.LIZ();
        }
        Sticker sticker = C80432Hn8.LIZ().get(LIZ2);
        if (sticker != null) {
            this.LIZLLL = false;
            LIZ(singModeStartType, sticker);
        } else {
            ALogger.m15795w("KtvDigitAvatar", "使用avatar演唱，but形象道具还未下载好, so等待avatar下载完成");
            C88440Kt0.LIZ(2131584636);
            this.LIZLLL = true;
            this.f26310LJ = singModeStartType;
            this.LJFF = LIZ2;
        }
        this.LJIIJJI = System.currentTimeMillis();
    }

    public final void LIZ(KtvSingMode ktvSingMode, SingModeStartType singModeStartType) {
        if (PatchProxy.proxy(new Object[]{ktvSingMode, singModeStartType}, this, LIZ, false, 9).isSupported) {
            return;
        }
        int i = C80406Hmi.LIZ[ktvSingMode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    LIZ(singModeStartType);
                }
            } else {
                LIZIZ(singModeStartType);
            }
        }
        if (ktvSingMode != KtvSingMode.DIGIT_AVATAR) {
            this.LIZLLL = false;
        }
    }

    private final void LIZIZ(AbstractC80486Ho0 abstractC80486Ho0, KtvSingMode ktvSingMode) {
        AbstractC79061HEp LJIILIIL;
        AbstractC79061HEp LJIILIIL2;
        if (PatchProxy.proxy(new Object[]{abstractC80486Ho0, ktvSingMode}, this, LIZ, false, 17).isSupported) {
            return;
        }
        ALogger.m15797i("KtvDigitAvatar", "停止使用video模式进行演唱, currentMode=" + H99.LIZIZ());
        if (Intrinsics.areEqual(abstractC80486Ho0, C80421Hmx.LJFF)) {
            AbstractC5003c LIZ2 = AbstractC5003c.LIZ.LIZ();
            if (LIZ2 != null && (LJIILIIL2 = LIZ2.LJIILIIL()) != null) {
                LJIILIIL2.LIZ(1);
            }
        } else if (Intrinsics.areEqual(abstractC80486Ho0, C80420Hmw.LJFF)) {
            if (ktvSingMode == KtvSingMode.DIGIT_AVATAR) {
                abstractC80486Ho0 = C80422Hmy.LJFF;
            }
            ALogger.m15795w("KtvDigitAvatar", "ttlive_link_camera stopUseVideoMode2Sing newMode=" + ktvSingMode + LoggerUtil.BLANK_TAG + abstractC80486Ho0);
            AbstractC5003c LIZ3 = AbstractC5003c.LIZ.LIZ();
            if (LIZ3 != null && (LJIILIIL = LIZ3.LJIILIIL()) != null) {
                LJIILIIL.LIZ(abstractC80486Ho0);
            }
        }
    }

    private final void LIZ(AbstractC80486Ho0 abstractC80486Ho0, KtvSingMode ktvSingMode) {
        AbstractC79061HEp LJIILIIL;
        AbstractC79061HEp LJIILIIL2;
        if (PatchProxy.proxy(new Object[]{abstractC80486Ho0, ktvSingMode}, this, LIZ, false, 14).isSupported) {
            return;
        }
        ALogger.m15797i("KtvDigitAvatar", "停止使用avatar进行演唱");
        this.LJIIJ.removeCallbacksAndMessages(null);
        if (Intrinsics.areEqual(abstractC80486Ho0, C80421Hmx.LJFF)) {
            AbstractC5003c LIZ2 = AbstractC5003c.LIZ.LIZ();
            if (LIZ2 != null && (LJIILIIL2 = LIZ2.LJIILIIL()) != null) {
                LJIILIIL2.LIZ(2);
            }
        } else if (Intrinsics.areEqual(abstractC80486Ho0, C80420Hmw.LJFF)) {
            if (ktvSingMode == KtvSingMode.VIDEO) {
                abstractC80486Ho0 = C80422Hmy.LJFF;
            }
            ALogger.m15795w("KtvDigitAvatar", "ttlive_link_camera stopUseDigitAvatarMode2Sing newMode=" + ktvSingMode + LoggerUtil.BLANK_TAG + abstractC80486Ho0);
            AbstractC5003c LIZ3 = AbstractC5003c.LIZ.LIZ();
            if (LIZ3 != null && (LJIILIIL = LIZ3.LJIILIIL()) != null) {
                LJIILIIL.LIZ(abstractC80486Ho0);
            }
        }
        C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJII().LIZJ("livedigitavatar");
        this.LIZIZ = false;
        this.LIZJ = null;
        if (this.LJIIJJI > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.LJIIJJI;
            if (currentTimeMillis > 0) {
                C78757H2x.LIZIZ.LIZ(this.LJIIL, currentTimeMillis);
            }
            this.LJIIJJI = 0L;
        }
    }

    public final void LIZ(SingModeStartType singModeStartType, Sticker sticker) {
        AbstractC79061HEp LJIILIIL;
        AbstractC79061HEp LJIILIIL2;
        C2WC<C4383i> LIZIZ;
        C4383i LIZ2;
        AbstractC79061HEp LJIILIIL3;
        AbstractC79061HEp LJIILIIL4;
        if (PatchProxy.proxy(new Object[]{singModeStartType, sticker}, this, LIZ, false, 13).isSupported) {
            return;
        }
        ALogger.m15797i("KtvDigitAvatar", "开始使用avatar进行演唱，startType=" + singModeStartType);
        HH8.LIZIZ.LJII();
        C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJII().LIZ("livedigitavatar", sticker);
        int i = C80406Hmi.LIZJ[singModeStartType.ordinal()];
        if (i != 1) {
            if (i == 2) {
                C87308Kak<Boolean> c87308Kak = AbstractC80293Hkt.f7151dT;
                Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
                Boolean LIZ3 = c87308Kak.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ3, "");
                if (LIZ3.booleanValue() && !LIZ()) {
                    AbstractC5003c LIZ4 = AbstractC5003c.LIZ.LIZ();
                    if (LIZ4 != null && (LJIILIIL4 = LIZ4.LJIILIIL()) != null) {
                        LJIILIIL4.LIZ(2, true, "self_apply");
                    }
                } else {
                    AbstractC5003c LIZ5 = AbstractC5003c.LIZ.LIZ();
                    if (LIZ5 != null && (LJIILIIL3 = LIZ5.LJIILIIL()) != null) {
                        LJIILIIL3.LIZ(2, false, "self_apply");
                    }
                }
            }
        } else {
            C87308Kak<Boolean> c87308Kak2 = AbstractC80293Hkt.f7151dT;
            Intrinsics.checkNotNullExpressionValue(c87308Kak2, "");
            Boolean LIZ6 = c87308Kak2.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ6, "");
            if (LIZ6.booleanValue() && !LIZ()) {
                AbstractC5003c LIZ7 = AbstractC5003c.LIZ.LIZ();
                if (LIZ7 != null && (LJIILIIL2 = LIZ7.LJIILIIL()) != null) {
                    LJIILIIL2.LIZ(2, true);
                }
            } else {
                AbstractC5003c LIZ8 = AbstractC5003c.LIZ.LIZ();
                if (LIZ8 != null && (LJIILIIL = LIZ8.LJIILIIL()) != null) {
                    LJIILIIL.LIZ(2, false);
                }
            }
        }
        C4382d LIZ9 = C4382d.LIZLLL.LIZ();
        if (LIZ9 != null && (LIZIZ = LIZ9.LIZIZ()) != null && (LIZ2 = LIZIZ.LIZ()) != null) {
            ALogger.m15797i("KtvDigitAvatar", "avatar形象审核情况：audited=" + LIZ2.LJFF + ",auditOk=" + LIZ2.LIZLLL + ", avatarData=" + LIZ2.f26308LJ + LoggerUtil.BLANK_TAG);
            String str = LIZ2.f26308LJ;
            if (LIZ2.LIZLLL && str != null && str.length() != 0) {
                ALogger.m15797i("KtvDigitAvatar", "等待avatar演唱道具ready");
                this.LIZIZ = true;
                this.LIZJ = str;
            } else if (LIZ2.LIZIZ || str == null || str.length() == 0 || LIZ2.LJFF) {
            } else {
                C88440Kt0.LIZ(2131584633);
            }
        }
    }

    public final void LIZ(KtvSingMode ktvSingMode, AbstractC80486Ho0 abstractC80486Ho0, KtvSingMode ktvSingMode2) {
        if (PatchProxy.proxy(new Object[]{ktvSingMode, abstractC80486Ho0, ktvSingMode2}, this, LIZ, false, 10).isSupported) {
            return;
        }
        int i = C80406Hmi.LIZIZ[ktvSingMode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    LIZ(abstractC80486Ho0, ktvSingMode2);
                }
            } else {
                LIZIZ(abstractC80486Ho0, ktvSingMode2);
            }
        } else if (Intrinsics.areEqual(abstractC80486Ho0, C80421Hmx.LJFF)) {
            ALogger.m15797i("KtvDigitAvatar", "KtvSingMode.AUDIO song end stopUseAudioMode2Sing");
            LIZ(abstractC80486Ho0);
        }
        if (ktvSingMode == KtvSingMode.DIGIT_AVATAR) {
            this.LIZLLL = false;
        }
    }

    public KtvSingModeProcessor(KtvSingMode ktvSingMode, boolean z, DigitAvatarMsgController digitAvatarMsgController, boolean z2) {
        C106862S5w.LIZ(ktvSingMode, digitAvatarMsgController);
        this.LJII = ktvSingMode;
        this.LJIIIZ = digitAvatarMsgController;
        this.LJIIL = z2;
    }
}
