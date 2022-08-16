package com.bytedance.android.live.liveinteract.digitavatar.videoavatar;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.effect.api.AbstractC4169j;
import com.bytedance.android.live.effect.api.C4173o;
import com.bytedance.android.live.effect.api.LiveEffectContextFactory;
import com.bytedance.android.live.liveinteract.digitavatar.AvatarGender;
import com.bytedance.android.live.liveinteract.digitavatar.C4382d;
import com.bytedance.android.live.liveinteract.digitavatar.C4383i;
import com.bytedance.android.live.liveinteract.digitavatar.C4385u;
import com.bytedance.android.live.liveinteract.digitavatar.DigitAvatarMsgController;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4766ag;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4767ah;
import com.bytedance.android.live.pushstream.AbstractC5436a;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.p517u.AbstractC6302f;
import com.bytedance.android.livesdk.chatroom.p517u.C6307m;
import com.bytedance.android.livesdk.chatroom.widget.RoomWidget;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.message.model.C8874fl;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.depend.model.Sticker;
import com.bytedance.android.livesdkapi.depend.model.live.linker.C9542o;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.live.datacontext.C13491f;
import com.p1594ss.ugc.live.sdk.message.data.IMessage;
import com.p1594ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC413392Xt;
import p003X.AbstractC413402Xu;
import p003X.AbstractC426192th;
import p003X.AbstractC4569445g;
import p003X.AbstractC80293Hkt;
import p003X.C2WC;
import p003X.C30K;
import p003X.C409882Kg;
import p003X.C436983Qm;
import p003X.C78729H1v;
import p003X.C78904H8o;
import p003X.C79046HEa;
import p003X.C79242HLo;
import p003X.C80388HmQ;
import p003X.C80390HmS;
import p003X.C80391HmT;
import p003X.C80393HmV;
import p003X.C80394HmW;
import p003X.C80398Hma;
import p003X.C80399Hmb;
import p003X.C80401Hmd;
import p003X.C80416Hms;
import p003X.C80430Hn6;
import p003X.C80432Hn8;
import p003X.C87308Kak;
import p003X.C88440Kt0;
import p003X.H99;
import p003X.HG5;
import p003X.HH8;
import p003X.HHV;
import p003X.IQV;
import p003X.IQX;
import p003X.QB4;

/* loaded from: classes3.dex */
public final class VideoDigitAvatarWidget extends RoomWidget implements AbstractC4569445g, OnMessageListener {
    public static ChangeQuickRedirect LIZ;
    public C80388HmQ LIZJ;
    public DigitAvatarMsgController LIZLLL;
    public boolean LJFF;
    public C80399Hmb LJI;
    public final CompositeDisposable LIZIZ = new CompositeDisposable();

    /* renamed from: LJ */
    public final C80430Hn6 f26311LJ = new C80430Hn6(null, 1);
    public final C30K<Integer> LJII = new C80391HmT(this);

    static {
        Covode.recordClassIndex(26718);
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 13).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    private final AbstractC4169j LIZIZ() {
        AbstractC413402Xu<Boolean> LJIILJJIL;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 8);
        if (proxy.isSupported) {
            return (AbstractC4169j) proxy.result;
        }
        C5923dp LJJJI = LJJJI();
        if (LJJJI != null && (LJIILJJIL = LJJJI.LJIILJJIL()) != null && LJIILJJIL.LIZIZ().booleanValue()) {
            return C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJII();
        }
        return C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.LINK).LJII();
    }

    public final void LIZ() {
        AvatarGender LIZ2;
        C2WC<C4383i> LIZIZ;
        C4383i LIZ3;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported && this.isViewValid) {
            C80388HmQ c80388HmQ = this.LIZJ;
            if (c80388HmQ == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            if (!PatchProxy.proxy(new Object[0], c80388HmQ, C80388HmQ.LIZ, false, 7).isSupported) {
                ALogger.m15797i("KtvDigitAvatar", "effect initiated");
                if (c80388HmQ.LJIILJJIL && c80388HmQ.LJIILIIL == VideoShowMode.DIGIT_AVATAR && c80388HmQ.LJIILLIIL.LIZIZ("livedigitavatar").isEmpty()) {
                    C4382d LIZ4 = C4382d.LIZLLL.LIZ();
                    if (LIZ4 == null || (LIZIZ = LIZ4.LIZIZ()) == null || (LIZ3 = LIZIZ.LIZ()) == null || (LIZ2 = LIZ3.LIZJ) == null) {
                        LIZ2 = H99.LIZ();
                    }
                    Sticker sticker = C80432Hn8.LIZ().get(LIZ2);
                    if (sticker != null) {
                        c80388HmQ.LJIILLIIL.LIZ("livedigitavatar", sticker);
                        c80388HmQ.LIZ();
                        c80388HmQ.LIZ(LIZ2, true);
                        c80388HmQ.LJIILL.LIZ(true);
                    }
                }
            }
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        C2WC<VideoShowMode> LIZJ;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        super.onDestroy();
        C4382d LIZ2 = C4382d.LIZLLL.LIZ();
        if (LIZ2 != null && (LIZJ = LIZ2.LIZJ()) != null) {
            C87308Kak<Integer> c87308Kak = AbstractC80293Hkt.f7153dV;
            Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
            c87308Kak.LIZ(Integer.valueOf(LIZJ.LIZ().type));
        }
        this.dataCenter.put("data_self_is_camera_on", Boolean.FALSE);
        C4382d LIZ3 = C4382d.LIZLLL.LIZ();
        if (LIZ3 != null) {
            LIZ3.LJIILIIL();
        }
        DigitAvatarMsgController digitAvatarMsgController = this.LIZLLL;
        if (digitAvatarMsgController == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        digitAvatarMsgController.LIZIZ = null;
        this.f26311LJ.LIZJ = null;
        this.LIZIZ.clear();
        DigitAvatarMsgController digitAvatarMsgController2 = this.LIZLLL;
        if (digitAvatarMsgController2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        digitAvatarMsgController2.LIZIZ();
        C80388HmQ c80388HmQ = this.LIZJ;
        if (c80388HmQ == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (!PatchProxy.proxy(new Object[0], c80388HmQ, C80388HmQ.LIZ, false, 4).isSupported) {
            if (!c80388HmQ.LJIIL) {
                C79046HEa.LIZ().LIZ((C30K) c80388HmQ.LJIIJ);
            }
            c80388HmQ.LJFF.LIZIZ();
            C80394HmW c80394HmW = c80388HmQ.LJI;
            if (!PatchProxy.proxy(new Object[0], c80394HmW, C80394HmW.LIZ, false, 3).isSupported) {
                c80394HmW.LIZIZ.clear();
            }
            c80388HmQ.LIZIZ.clear();
            c80388HmQ.LIZIZ();
        }
        if (this.LJI == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        C79046HEa.LIZ().LIZ((C30K) this.LJII);
        LIZIZ().LIZJ("livedigitavatar");
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        boolean z;
        AbstractC413402Xu<Boolean> LJIILJJIL;
        C2WC<VideoShowMode> LIZJ;
        Observable<VideoShowMode> LIZIZ;
        Disposable subscribe;
        AbstractC413392Xt<IMessageManager> LJIILLIIL;
        IMessageManager LIZIZ2;
        VideoShowMode videoShowMode;
        C2WC<VideoShowMode> LIZJ2;
        C5923dp LIZ2;
        AbstractC413392Xt<AbstractC6302f> LJJZZIII;
        AbstractC6302f LIZIZ3;
        Observable<C6307m> mo15536LJ;
        Disposable subscribe2;
        AbstractC426192th<C4385u> LJIIJJI;
        Observable<C4385u> LIZIZ4;
        Disposable subscribe3;
        AbstractC426192th<C4387c> LIZLLL;
        Observable<C4387c> LIZIZ5;
        Disposable subscribe4;
        C2WC<VideoShowMode> LIZJ3;
        Observable<VideoShowMode> LIZIZ6;
        Disposable subscribe5;
        VideoShowMode videoShowMode2;
        C2WC<VideoShowMode> LIZJ4;
        AbstractC413392Xt<AbstractC6302f> LJJZZIII2;
        AbstractC6302f LIZIZ7;
        Observable<C6307m> mo15536LJ2;
        Disposable subscribe6;
        AbstractC413402Xu<Boolean> LJIILJJIL2;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        super.onCreate();
        C5923dp LJJJI = LJJJI();
        if (LJJJI != null && (LJIILJJIL2 = LJJJI.LJIILJJIL()) != null && LJIILJJIL2.LIZIZ().booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder sb = new StringBuilder("VideoDigitAvatarWidget current scene = ");
        sb.append(C79242HLo.LJIIJ());
        sb.append(", isAnchor=");
        sb.append(z);
        sb.append(", machine score = ");
        sb.append(C436983Qm.LIZ(z));
        sb.append(", anchor limit score=");
        SettingKey<Float> settingKey = LiveConfigSettingKeys.LIVE_VIDEO_AVATAR_PERFORMANCE_LIMIT_ANCHOR;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        sb.append(settingKey.getValue());
        sb.append(", guest limit score=");
        SettingKey<Float> settingKey2 = LiveConfigSettingKeys.LIVE_VIDEO_AVATAR_PERFORMANCE_LIMIT_GUEST;
        Intrinsics.checkNotNullExpressionValue(settingKey2, "");
        sb.append(settingKey2.getValue());
        ALogger.m15797i("KtvDigitAvatar", sb.toString());
        Pair LIZ3 = IQV.LIZ((Function0) new VideoDigitAvatarWidget$onCreate$pair$1(this, z));
        C5923dp LJJJI2 = LJJJI();
        if (LJJJI2 != null && (LJJZZIII2 = LJJJI2.LJJZZIII()) != null && (LIZIZ7 = LJJZZIII2.LIZIZ()) != null && (mo15536LJ2 = LIZIZ7.mo15536LJ()) != null && (subscribe6 = mo15536LJ2.subscribe(new C78729H1v(z))) != null) {
            QB4.LIZ(subscribe6, this.LIZIZ);
        }
        IQX.LIZ((C13491f) LIZ3.getFirst(), C4382d.class);
        this.LIZIZ.add((Disposable) LIZ3.getSecond());
        C80432Hn8.LIZIZ();
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        AbstractC5436a abstractC5436a = null;
        if (proxy.isSupported) {
            abstractC5436a = (AbstractC5436a) proxy.result;
        } else {
            C5923dp LJJJI3 = LJJJI();
            if (LJJJI3 != null && (LJIILJJIL = LJJJI3.LJIILJJIL()) != null && LJIILJJIL.LIZIZ().booleanValue()) {
                AbstractC4766ag LIZ4 = AbstractC4766ag.LIZ.LIZ();
                if (LIZ4 != null) {
                    abstractC5436a = LIZ4.LJIIIZ();
                }
            } else {
                AbstractC4767ah LIZ5 = AbstractC4767ah.LIZIZ.LIZ();
                if (LIZ5 != null) {
                    abstractC5436a = LIZ5.LJIILIIL();
                }
            }
        }
        this.LIZLLL = new DigitAvatarMsgController(abstractC5436a);
        DigitAvatarMsgController digitAvatarMsgController = this.LIZLLL;
        if (digitAvatarMsgController == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        digitAvatarMsgController.LIZ();
        VideoShowMode LIZ6 = ((C4382d) LIZ3.getFirst()).LIZJ().LIZ();
        C79046HEa LIZ7 = C79046HEa.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ7, "");
        boolean LIZJ5 = LIZ7.LIZJ();
        DigitAvatarMsgController digitAvatarMsgController2 = this.LIZLLL;
        if (digitAvatarMsgController2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        this.LIZJ = new C80388HmQ(z, LIZ6, LIZJ5, digitAvatarMsgController2, LIZIZ());
        C80388HmQ c80388HmQ = this.LIZJ;
        if (c80388HmQ == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (!PatchProxy.proxy(new Object[0], c80388HmQ, C80388HmQ.LIZ, false, 2).isSupported) {
            c80388HmQ.LIZIZ(false);
            if (c80388HmQ.LJIIL) {
                c80388HmQ.LJIILJJIL = true;
                C4382d LIZ8 = C4382d.LIZLLL.LIZ();
                if (LIZ8 == null || (LIZJ4 = LIZ8.LIZJ()) == null || (videoShowMode2 = LIZJ4.LIZ()) == null) {
                    videoShowMode2 = VideoShowMode.VIDEO;
                }
                c80388HmQ.LJIILIIL = videoShowMode2;
                c80388HmQ.f7283LJ = VideoShowMode.VIDEO;
            } else {
                C79046HEa LIZ9 = C79046HEa.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ9, "");
                c80388HmQ.LJIILJJIL = LIZ9.LIZJ();
                C4382d LIZ10 = C4382d.LIZLLL.LIZ();
                if (LIZ10 == null || (LIZJ2 = LIZ10.LIZJ()) == null || (videoShowMode = LIZJ2.LIZ()) == null) {
                    videoShowMode = VideoShowMode.VIDEO;
                }
                c80388HmQ.LJIILIIL = videoShowMode;
                c80388HmQ.f7283LJ = VideoShowMode.AUDIO;
                C79046HEa.LIZ().LIZIZ(c80388HmQ.LJIIJ);
            }
            C4382d LIZ11 = C4382d.LIZLLL.LIZ();
            if (LIZ11 != null && (LIZJ3 = LIZ11.LIZJ()) != null && (LIZIZ6 = LIZJ3.LIZIZ()) != null && (subscribe5 = LIZIZ6.subscribe(new HHV(c80388HmQ))) != null) {
                c80388HmQ.LIZ(subscribe5);
            }
            C4382d LIZ12 = C4382d.LIZLLL.LIZ();
            if (LIZ12 != null && (LIZLLL = LIZ12.LIZLLL()) != null && (LIZIZ5 = LIZLLL.LIZIZ()) != null && (subscribe4 = LIZIZ5.subscribe(new HG5(c80388HmQ))) != null) {
                c80388HmQ.LIZ(subscribe4);
            }
            C4382d LIZ13 = C4382d.LIZLLL.LIZ();
            if (LIZ13 != null && (LJIIJJI = LIZ13.LJIIJJI()) != null && (LIZIZ4 = LJIIJJI.LIZIZ()) != null && (subscribe3 = LIZIZ4.subscribe(new C80390HmS(c80388HmQ))) != null) {
                c80388HmQ.LIZ(subscribe3);
            }
            if (c80388HmQ.LJIIL && (LIZ2 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null)) != null && (LJJZZIII = LIZ2.LJJZZIII()) != null && (LIZIZ3 = LJJZZIII.LIZIZ()) != null && (mo15536LJ = LIZIZ3.mo15536LJ()) != null && (subscribe2 = mo15536LJ.subscribe(new C80401Hmd(c80388HmQ), C80416Hms.LIZ)) != null) {
                c80388HmQ.LIZ(subscribe2);
            }
            C80388HmQ.LIZ(c80388HmQ, c80388HmQ.LJIILIIL, true, null, 4, null);
        }
        DigitAvatarMsgController digitAvatarMsgController3 = this.LIZLLL;
        if (digitAvatarMsgController3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        this.LJI = new C80399Hmb(digitAvatarMsgController3, this);
        C79046HEa.LIZ().LIZIZ(this.LJII);
        DigitAvatarMsgController digitAvatarMsgController4 = this.LIZLLL;
        if (digitAvatarMsgController4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        digitAvatarMsgController4.LIZIZ = new C80393HmV(this);
        this.f26311LJ.LIZJ = new C80398Hma(this);
        C5923dp LJJJI4 = LJJJI();
        if (LJJJI4 != null && (LJIILLIIL = LJJJI4.LJIILLIIL()) != null && (LIZIZ2 = LJIILLIIL.LIZIZ()) != null) {
            LIZIZ2.addMessageListener(MessageType.LINKER.LIZ(), this);
        }
        C4382d LIZ14 = C4382d.LIZLLL.LIZ();
        if (LIZ14 != null && (LIZJ = LIZ14.LIZJ()) != null && (LIZIZ = LIZJ.LIZIZ()) != null && (subscribe = LIZIZ.subscribe(new C78904H8o(this))) != null) {
            QB4.LIZ(subscribe, this.LIZIZ);
        }
    }

    public static final /* synthetic */ C80388HmQ LIZ(VideoDigitAvatarWidget videoDigitAvatarWidget) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{videoDigitAvatarWidget}, null, LIZ, true, 12);
        if (proxy.isSupported) {
            return (C80388HmQ) proxy.result;
        }
        C80388HmQ c80388HmQ = videoDigitAvatarWidget.LIZJ;
        if (c80388HmQ == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return c80388HmQ;
    }

    @Override // com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        if (!PatchProxy.proxy(new Object[]{iMessage}, this, LIZ, false, 11).isSupported && (iMessage instanceof C8874fl)) {
            C8874fl c8874fl = (C8874fl) iMessage;
            if (c8874fl.LIZIZ == 20) {
                C9542o c9542o = c8874fl.LJJIIZI;
                if (c9542o != null) {
                    ALogger.m15797i("KtvDigitAvatar", "收到server审核结果消息。auditId=" + c9542o.LIZJ + ", result=" + c9542o.LIZ + ", reason=" + c9542o.LIZIZ + '}');
                    if (c9542o.LIZ == 2) {
                        C88440Kt0.LIZ(2131584629);
                    }
                    LIZ(c9542o.LIZJ, c9542o.LIZ, c9542o.LIZIZ);
                    return;
                }
                ALogger.m15795w("KtvDigitAvatar", "收到server审核结果消息,但是avatarAuditContent=null");
            }
        }
    }

    public final void LIZ(long j, long j2, String str) {
        C4382d LIZ2;
        C2WC<C4383i> LIZIZ;
        C4383i LIZ3;
        C2WC<C4383i> LIZIZ2;
        C4383i LIZ4;
        C2WC<C4383i> LIZIZ3;
        C4383i LIZ5;
        C2WC<C4383i> LIZIZ4;
        C4383i LIZ6;
        C2WC<C4383i> LIZIZ5;
        C4383i LIZ7;
        C2WC<C4383i> LIZIZ6;
        C4383i LIZ8;
        C2WC<C4383i> LIZIZ7;
        C4383i LIZ9;
        if (!PatchProxy.proxy(new Object[]{new Long(j), new Long(j2), str}, this, LIZ, false, 10).isSupported && (LIZ2 = C4382d.LIZLLL.LIZ()) != null && (LIZIZ = LIZ2.LIZIZ()) != null && (LIZ3 = LIZIZ.LIZ()) != null && LIZ3.LIZ() && !LIZ3.LJFF) {
            HH8.LIZIZ.LIZ(j, LIZ3.LJI, j2, str);
            if (j == LIZ3.LJI) {
                if (j2 == 1) {
                    C88440Kt0.LIZ(2131582907);
                    C4382d LIZ10 = C4382d.LIZLLL.LIZ();
                    if (LIZ10 != null && (LIZIZ7 = LIZ10.LIZIZ()) != null && (LIZ9 = LIZIZ7.LIZ()) != null) {
                        LIZ9.LIZLLL = true;
                    }
                    C4382d LIZ11 = C4382d.LIZLLL.LIZ();
                    if (LIZ11 != null && (LIZIZ6 = LIZ11.LIZIZ()) != null && (LIZ8 = LIZIZ6.LIZ()) != null) {
                        LIZ8.LJFF = true;
                    }
                    C80388HmQ c80388HmQ = this.LIZJ;
                    if (c80388HmQ == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                    c80388HmQ.LIZ(true);
                    C4382d LIZ12 = C4382d.LIZLLL.LIZ();
                    if (LIZ12 != null) {
                        LIZ12.LJIILIIL();
                        return;
                    }
                    return;
                } else if (j2 != 2) {
                    return;
                } else {
                    C88440Kt0.LIZ(2131582906);
                    C4382d LIZ13 = C4382d.LIZLLL.LIZ();
                    if (LIZ13 != null && (LIZIZ5 = LIZ13.LIZIZ()) != null && (LIZ7 = LIZIZ5.LIZ()) != null) {
                        LIZ7.LIZLLL = false;
                    }
                    C4382d LIZ14 = C4382d.LIZLLL.LIZ();
                    if (LIZ14 != null && (LIZIZ4 = LIZ14.LIZIZ()) != null && (LIZ6 = LIZIZ4.LIZ()) != null) {
                        LIZ6.LJFF = true;
                    }
                    C80388HmQ c80388HmQ2 = this.LIZJ;
                    if (c80388HmQ2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                    c80388HmQ2.LIZ(false);
                    C4382d LIZ15 = C4382d.LIZLLL.LIZ();
                    if (LIZ15 == null) {
                        return;
                    }
                    LIZ15.LJIILIIL();
                    return;
                }
            }
            ALogger.m15797i("KtvDigitAvatar", "收到的审核auditID(" + j + ")和本地avatar保存的id(" + LIZ3.LJI + ")不一致");
            if (LIZ3.LIZIZ || LIZ3.LJFF) {
                return;
            }
            C88440Kt0.LIZ(2131582906);
            C4382d LIZ16 = C4382d.LIZLLL.LIZ();
            if (LIZ16 != null && (LIZIZ3 = LIZ16.LIZIZ()) != null && (LIZ5 = LIZIZ3.LIZ()) != null) {
                LIZ5.LIZLLL = false;
            }
            C4382d LIZ17 = C4382d.LIZLLL.LIZ();
            if (LIZ17 != null && (LIZIZ2 = LIZ17.LIZIZ()) != null && (LIZ4 = LIZIZ2.LIZ()) != null) {
                LIZ4.LJFF = true;
            }
            C80388HmQ c80388HmQ3 = this.LIZJ;
            if (c80388HmQ3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            c80388HmQ3.LIZ(false);
            C4382d LIZ18 = C4382d.LIZLLL.LIZ();
            if (LIZ18 == null) {
                return;
            }
            LIZ18.LJIILIIL();
        }
    }
}
