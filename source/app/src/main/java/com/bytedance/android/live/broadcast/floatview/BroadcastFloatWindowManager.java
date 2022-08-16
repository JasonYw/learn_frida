package com.bytedance.android.live.broadcast.floatview;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.core.app.NotificationManagerCompat;
import com.bytedance.android.live.broadcast.floatview.datacontext.BroadcastFloatContext;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livehostapi.foundation.IHostApp;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.disposables.Disposable;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC426222tk;
import p003X.AbstractC80293Hkt;
import p003X.C106862S5w;
import p003X.C2WC;
import p003X.C87308Kak;
import p003X.C88826KzE;
import p003X.C88856Kzi;
import p003X.C88858Kzk;
import p003X.C88866Kzs;
import p003X.C88867Kzt;
import p003X.C88868Kzu;
import p003X.C88869Kzv;
import p003X.C88871Kzx;
import p003X.G39;
import p003X.LK5;

/* loaded from: classes5.dex */
public final class BroadcastFloatWindowManager implements AbstractC426222tk {
    public static ChangeQuickRedirect LIZ;
    public NotificationManagerCompat LIZIZ;
    public NotificationManager LIZJ;
    public Notification LIZLLL;

    /* renamed from: LJ */
    public View f25828LJ;
    public BroadcastFloatMessageView LJFF;
    public Disposable LJI;
    public ValueAnimator LJII;
    public int LJIIIIZZ;
    public Boolean LJIIJJI;
    public Boolean LJIIL;
    public static final Companion LJIIJ = new Companion((byte) 0);
    public static final Lazy LJIIIZ = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) BroadcastFloatWindowManager$Companion$inst$2.INSTANCE);

    /* loaded from: classes5.dex */
    public static final class Companion {
        public static ChangeQuickRedirect LIZ;

        static {
            Covode.recordClassIndex(15846);
        }

        public final BroadcastFloatWindowManager LIZ() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
            return (BroadcastFloatWindowManager) (proxy.isSupported ? proxy.result : BroadcastFloatWindowManager.LJIIIZ.mo27335getValue());
        }

        public Companion() {
        }

        /* loaded from: classes5.dex */
        public enum BroadcastAudioFloatViewConfig {
            TAG_BROADCAST_FLOAT_VIEW("broadcast_video_float_view", LK5.LIZJ() - LK5.LIZ(72.0f), LK5.LIZIZ() - LK5.LIZ(200.0f), LK5.LIZ(60.0f), LK5.LIZ(60.0f), 3, true),
            TAG_BROADCAST_FLOAT_TIP_VIEW("broadcast_video_float_tip_view", LK5.LIZJ() - LK5.LIZ(214.0f), LK5.LIZIZ() - LK5.LIZ(191.0f), LK5.LIZ(134.0f), LK5.LIZ(42.0f), 5, false),
            TAG_BROADCAST_FLOAT_MSG_VIEW("broadcast_video_float_msg_view", LK5.LIZJ() - LK5.LIZ(275.0f), LK5.LIZIZ() - LK5.LIZ(200.0f), LK5.LIZ(195.0f), LK5.LIZ(60.0f), 5, false);
            
            public static ChangeQuickRedirect changeQuickRedirect;
            public final int height;
            public final int moveType;
            public final boolean showEnter;
            public final String tag;
            public final int width;

            /* renamed from: x */
            public final int f25829x;

            /* renamed from: y */
            public final int f25830y;

            public static BroadcastAudioFloatViewConfig valueOf(String str) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
                return (BroadcastAudioFloatViewConfig) (proxy.isSupported ? proxy.result : Enum.valueOf(BroadcastAudioFloatViewConfig.class, str));
            }

            /* renamed from: values  reason: to resolve conflict with enum method */
            public static BroadcastAudioFloatViewConfig[] valuesCustom() {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
                return (BroadcastAudioFloatViewConfig[]) (proxy.isSupported ? proxy.result : values().clone());
            }

            static {
                Covode.recordClassIndex(15847);
            }

            BroadcastAudioFloatViewConfig(String str, int i, int i2, int i3, int i4, int i5, boolean z) {
                this.tag = str;
                this.f25829x = i;
                this.f25830y = i2;
                this.width = i3;
                this.height = i4;
                this.moveType = i5;
                this.showEnter = z;
            }
        }

        public /* synthetic */ Companion(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(15845);
    }

    @Override // p003X.AbstractC426222tk
    public final boolean LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C88856Kzi LIZIZ = LIZIZ(Companion.BroadcastAudioFloatViewConfig.TAG_BROADCAST_FLOAT_VIEW);
        if (LIZIZ == null || !LIZIZ.m23443LJ()) {
            return false;
        }
        return true;
    }

    @Override // p003X.AbstractC426222tk
    public final int LIZJ() {
        C2WC<Integer> LIZ2;
        Integer LIZ3;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 23);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        BroadcastFloatContext LIZ4 = C88868Kzu.LIZ();
        if (LIZ4 == null || (LIZ2 = LIZ4.LIZ()) == null || (LIZ3 = LIZ2.LIZ()) == null) {
            return 0;
        }
        return LIZ3.intValue();
    }

    @Override // p003X.AbstractC426222tk
    public final long LIZLLL() {
        C2WC<Long> LIZLLL;
        Long LIZ2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 24);
        if (proxy.isSupported) {
            return ((Long) proxy.result).longValue();
        }
        BroadcastFloatContext LIZ3 = C88868Kzu.LIZ();
        if (LIZ3 != null && (LIZLLL = LIZ3.LIZLLL()) != null && (LIZ2 = LIZLLL.LIZ()) != null) {
            return LIZ2.longValue();
        }
        return 0L;
    }

    /* renamed from: LJ */
    public final void m15903LJ() {
        Disposable disposable;
        C2WC<BroadcastFloatContext.FloatStatus> LJIIIIZZ;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        BroadcastFloatContext LIZ2 = C88868Kzu.LIZ();
        if (LIZ2 != null && (LJIIIIZZ = LIZ2.LJIIIIZZ()) != null) {
            LJIIIIZZ.LIZ(BroadcastFloatContext.FloatStatus.HIDDEN);
        }
        LIZ(Companion.BroadcastAudioFloatViewConfig.TAG_BROADCAST_FLOAT_VIEW);
        LIZ(Companion.BroadcastAudioFloatViewConfig.TAG_BROADCAST_FLOAT_MSG_VIEW);
        LIZ(Companion.BroadcastAudioFloatViewConfig.TAG_BROADCAST_FLOAT_TIP_VIEW);
        Disposable disposable2 = this.LJI;
        if (disposable2 != null && !disposable2.isDisposed() && (disposable = this.LJI) != null) {
            disposable.dispose();
        }
        NotificationManagerCompat notificationManagerCompat = this.LIZIZ;
        if (notificationManagerCompat != null) {
            notificationManagerCompat.cancel(2131181110);
        }
    }

    @Override // p003X.AbstractC426222tk
    public final boolean LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return G39.LIZ(LK5.LJIIJ());
    }

    @Override // p003X.AbstractC426222tk
    public final void LIZ(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, LIZ, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(context);
        G39.LIZJ(context);
    }

    public final C88856Kzi LIZIZ(Companion.BroadcastAudioFloatViewConfig broadcastAudioFloatViewConfig) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{broadcastAudioFloatViewConfig}, this, LIZ, false, 13);
        if (proxy.isSupported) {
            return (C88856Kzi) proxy.result;
        }
        return (C88856Kzi) C88826KzE.LIZIZ(broadcastAudioFloatViewConfig.tag);
    }

    public final void LIZ(Companion.BroadcastAudioFloatViewConfig broadcastAudioFloatViewConfig) {
        C88856Kzi LIZIZ;
        C88856Kzi LIZIZ2;
        if (!PatchProxy.proxy(new Object[]{broadcastAudioFloatViewConfig}, this, LIZ, false, 11).isSupported && (LIZIZ = LIZIZ(broadcastAudioFloatViewConfig)) != null && LIZIZ.m23443LJ() && (LIZIZ2 = LIZIZ(broadcastAudioFloatViewConfig)) != null) {
            LIZIZ2.LIZJ();
        }
    }

    public final PendingIntent LIZIZ(Context context) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context}, this, LIZ, false, 22);
        if (proxy.isSupported) {
            return (PendingIntent) proxy.result;
        }
        Intent intent = new Intent(context, ((IHostApp) ServiceManager.getService(IHostApp.class)).getHostActivity(5));
        intent.addFlags(536870912);
        SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_ANCHOR_FLOAT_WINDOW_CLEAR_TOP_ENABLE;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (value.booleanValue()) {
            intent.addFlags(67108864);
        }
        return PendingIntent.getActivity(context, 0, intent, 0);
    }

    @Override // p003X.AbstractC426222tk
    public final boolean LIZ(Room room) {
        LiveMode liveMode;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{room}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (G39.LIZ(LK5.LJIIJ()) && C88868Kzu.LIZIZ() != BroadcastFloatContext.FloatStatus.DESTROY && C88868Kzu.LIZIZ() != BroadcastFloatContext.FloatStatus.NONE) {
            SettingKey<Boolean> settingKey = LiveSettingKeys.LIVE_BROADCAST_AUDIO_FLOAT_WINDOW;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            Boolean value = settingKey.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            if (value.booleanValue()) {
                C87308Kak<Boolean> c87308Kak = AbstractC80293Hkt.f7106cb;
                Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
                Boolean LIZ2 = c87308Kak.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ2, "");
                if (LIZ2.booleanValue()) {
                    if (room != null) {
                        liveMode = room.getStreamType();
                    } else {
                        liveMode = null;
                    }
                    if (liveMode == LiveMode.AUDIO) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private final void LIZ(Companion.BroadcastAudioFloatViewConfig broadcastAudioFloatViewConfig, C88858Kzk c88858Kzk) {
        C88856Kzi LIZIZ;
        if (PatchProxy.proxy(new Object[]{broadcastAudioFloatViewConfig, c88858Kzk}, this, LIZ, false, 12).isSupported) {
            return;
        }
        C88856Kzi LIZIZ2 = LIZIZ(broadcastAudioFloatViewConfig);
        if (LIZIZ2 != null && LIZIZ2.m23443LJ() && (LIZIZ = LIZIZ(broadcastAudioFloatViewConfig)) != null) {
            LIZIZ.LIZLLL();
        }
        c88858Kzk.LIZ();
    }

    private final C88858Kzk LIZIZ(Companion.BroadcastAudioFloatViewConfig broadcastAudioFloatViewConfig, View view) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{broadcastAudioFloatViewConfig, view}, this, LIZ, false, 14);
        if (proxy.isSupported) {
            return (C88858Kzk) proxy.result;
        }
        C88858Kzk LIZ2 = C88826KzE.LIZ(LK5.LJIIJ());
        LIZ2.LIZ(view);
        LIZ2.LIZ(broadcastAudioFloatViewConfig.width);
        LIZ2.LIZIZ(broadcastAudioFloatViewConfig.height);
        LIZ2.LIZ(broadcastAudioFloatViewConfig.tag);
        LIZ2.LIZJ(broadcastAudioFloatViewConfig.moveType);
        LIZ2.LIZ(LK5.LIZ(12.0f), LK5.LIZ(12.0f), LK5.LIZ(12.0f), LK5.LIZ(200.0f));
        LIZ2.LIZ(300L, new AccelerateDecelerateInterpolator());
        LIZ2.LIZIZ(true);
        LIZ2.LIZLLL(broadcastAudioFloatViewConfig.f25829x);
        LIZ2.m23442LJ(broadcastAudioFloatViewConfig.f25830y);
        LIZ2.LIZ(new C88866Kzs(this, broadcastAudioFloatViewConfig, view));
        if (broadcastAudioFloatViewConfig.showEnter) {
            LIZ2.LIZIZ(300L, new AccelerateDecelerateInterpolator());
        }
        return LIZ2;
    }

    public final void LIZ(Companion.BroadcastAudioFloatViewConfig broadcastAudioFloatViewConfig, View view) {
        if (PatchProxy.proxy(new Object[]{broadcastAudioFloatViewConfig, view}, this, LIZ, false, 10).isSupported) {
            return;
        }
        C88856Kzi LIZIZ = LIZIZ(broadcastAudioFloatViewConfig);
        if ((LIZIZ == null || !LIZIZ.m23443LJ()) && G39.LIZ(LK5.LJIIJ())) {
            if (C88826KzE.LIZIZ(broadcastAudioFloatViewConfig.tag) == null) {
                LIZ(broadcastAudioFloatViewConfig, LIZIZ(broadcastAudioFloatViewConfig, view));
            }
            C88856Kzi LIZIZ2 = LIZIZ(broadcastAudioFloatViewConfig);
            if (LIZIZ2 != null) {
                LIZIZ2.LIZIZ();
            }
        }
    }

    public final void LIZ(Companion.BroadcastAudioFloatViewConfig broadcastAudioFloatViewConfig, int i, int i2) {
        boolean areEqual;
        int LIZ2;
        C88856Kzi LIZIZ;
        ValueAnimator valueAnimator;
        if (PatchProxy.proxy(new Object[]{broadcastAudioFloatViewConfig, Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 15).isSupported) {
            return;
        }
        if (C88871Kzx.LIZ[broadcastAudioFloatViewConfig.ordinal()] == 1 && !PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 16).isSupported) {
            if (i > (LK5.LIZJ() - LK5.LIZ(60.0f)) / 2) {
                areEqual = Intrinsics.areEqual(this.LJIIL, Boolean.FALSE);
                this.LJIIL = Boolean.TRUE;
                LIZ2 = i - LK5.LIZ(203.0f);
            } else {
                areEqual = Intrinsics.areEqual(this.LJIIL, Boolean.TRUE);
                this.LJIIL = Boolean.FALSE;
                LIZ2 = i + LK5.LIZ(68.0f);
            }
            this.LJIIIIZZ = LIZ2;
            if (areEqual) {
                BroadcastFloatMessageView broadcastFloatMessageView = this.LJFF;
                if (broadcastFloatMessageView != null) {
                    broadcastFloatMessageView.LIZ(Intrinsics.areEqual(this.LJIIL, Boolean.FALSE));
                }
                boolean areEqual2 = Intrinsics.areEqual(this.LJIIL, Boolean.FALSE);
                if (!PatchProxy.proxy(new Object[]{Byte.valueOf(areEqual2 ? (byte) 1 : (byte) 0)}, this, LIZ, false, 17).isSupported && !Intrinsics.areEqual(this.LJIIJJI, Boolean.valueOf(areEqual2))) {
                    ValueAnimator valueAnimator2 = this.LJII;
                    if (valueAnimator2 != null && valueAnimator2.isRunning() && (valueAnimator = this.LJII) != null) {
                        valueAnimator.cancel();
                    }
                    C88856Kzi LIZIZ2 = LIZIZ(Companion.BroadcastAudioFloatViewConfig.TAG_BROADCAST_FLOAT_MSG_VIEW);
                    if (LIZIZ2 != null) {
                        int LJI = LIZIZ2.LJI();
                        this.LJII = ObjectAnimator.ofFloat(0.0f, 1.0f);
                        ValueAnimator valueAnimator3 = this.LJII;
                        if (valueAnimator3 != null) {
                            valueAnimator3.addUpdateListener(new C88867Kzt(this, LJI));
                        }
                        ValueAnimator valueAnimator4 = this.LJII;
                        if (valueAnimator4 != null) {
                            valueAnimator4.addListener(new C88869Kzv(this));
                        }
                        ValueAnimator valueAnimator5 = this.LJII;
                        if (valueAnimator5 != null) {
                            valueAnimator5.setDuration(300L);
                        }
                        ValueAnimator valueAnimator6 = this.LJII;
                        if (valueAnimator6 != null) {
                            valueAnimator6.setInterpolator(new AccelerateDecelerateInterpolator());
                        }
                        ValueAnimator valueAnimator7 = this.LJII;
                        if (valueAnimator7 != null) {
                            valueAnimator7.start();
                        }
                    }
                }
            } else {
                ValueAnimator valueAnimator8 = this.LJII;
                if ((valueAnimator8 == null || !valueAnimator8.isRunning()) && (LIZIZ = LIZIZ(Companion.BroadcastAudioFloatViewConfig.TAG_BROADCAST_FLOAT_MSG_VIEW)) != null) {
                    LIZIZ.LIZ(LIZ2);
                }
            }
            int LIZ3 = i2 + LK5.LIZ(0.0f);
            C88856Kzi LIZIZ3 = LIZIZ(Companion.BroadcastAudioFloatViewConfig.TAG_BROADCAST_FLOAT_MSG_VIEW);
            if (LIZIZ3 != null && !PatchProxy.proxy(new Object[]{Integer.valueOf(LIZ3)}, LIZIZ3, C88856Kzi.LIZ, false, 13).isSupported) {
                LIZIZ3.LJIIIIZZ();
                LIZIZ3.LIZJ.LJIIIIZZ = LIZ3;
                LIZIZ3.LIZIZ.LIZIZ(LIZ3);
            }
        }
        LIZ(Companion.BroadcastAudioFloatViewConfig.TAG_BROADCAST_FLOAT_TIP_VIEW);
    }
}
