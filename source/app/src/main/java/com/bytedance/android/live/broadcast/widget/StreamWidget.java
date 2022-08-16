package com.bytedance.android.live.broadcast.widget;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.broadcast.AbstractC2863ai;
import com.bytedance.android.live.broadcast.AbstractC2864aj;
import com.bytedance.android.live.broadcast.AbstractC2928aq;
import com.bytedance.android.live.broadcast.stream.AuthUtils;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.core.tetris.widgets.LiveWidget;
import com.bytedance.android.live.effect.view.EffectLiveBroadcastActivityProxy;
import com.bytedance.android.live.pushstream.AbstractC5436a;
import com.bytedance.android.live.pushstream.p417a.AbstractC5437g;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.interact.AbstractC6070q;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrlExtra;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.p1594ss.avframework.livestreamv2.core.LiveCore;
import com.p1594ss.avframework.livestreamv2.filter.IFilterManager;
import com.xiaomi.mipush.sdk.Constants;
import io.reactivex.android.schedulers.AndroidSchedulers;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC413392Xt;
import p003X.AbstractC439343Zo;
import p003X.AbstractC4569445g;
import p003X.AbstractC81278I1w;
import p003X.AbstractC86398K2u;
import p003X.C106862S5w;
import p003X.C148062fT6;
import p003X.C4306532d;
import p003X.C536537Hj;
import p003X.C86399K2v;
import p003X.C86400K2w;
import p003X.C86665KDb;
import p003X.C88722KxY;
import p003X.HSB;
import p003X.K06;
import p003X.K07;
import p003X.K0D;
import p003X.K3X;
import p003X.K3Y;
import p003X.K3Z;
import p003X.K41;
import p003X.K4D;
import p003X.K4I;
import p003X.K70;
import p003X.K7C;
import p003X.K8Q;

/* loaded from: classes5.dex */
public abstract class StreamWidget extends LiveWidget implements K0D, AbstractC86398K2u, AbstractC4569445g {
    public static ChangeQuickRedirect LIZLLL;
    public C88722KxY LIZ;

    /* renamed from: LJ */
    public AbstractC2928aq f26004LJ;
    public AbstractC2863ai LJFF;
    public AbstractC2864aj LJI;
    public AbstractC5436a LJII;
    public boolean LJIIIIZZ;
    public AbsCaptureWidget LJIIIZ;
    public EffectLiveBroadcastActivityProxy LJIIJ;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public StreamUrlExtra LJIILJJIL;
    public String LJIILL;
    public LiveMode LJIILLIIL;
    public K06 LJIIZILJ;
    public final AbstractC5437g LIZIZ = new K3Y(this);
    public final AbstractC5437g LJIIJJI = new K4I(new WeakReference(this.LIZIZ));

    static {
        Covode.recordClassIndex(18841);
    }

    public abstract K70 LIZ(K70 k70);

    public void LIZ(AbstractC5436a abstractC5436a) {
        if (PatchProxy.proxy(new Object[]{abstractC5436a}, this, LIZLLL, false, 14).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC5436a);
    }

    @Override // p003X.K0D
    public void LJFF() {
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public int getLayoutId() {
        return 2131699208;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZLLL, false, 30).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // p003X.K0D
    /* renamed from: LJ */
    public final EffectLiveBroadcastActivityProxy mo15855LJ() {
        return this.LJIIJ;
    }

    public void LIZ(Room room) {
        if (PatchProxy.proxy(new Object[]{room}, this, LIZLLL, false, 11).isSupported) {
            return;
        }
        C106862S5w.LIZ(room);
        this.LJIIL = true;
        AbstractC5436a abstractC5436a = this.LJII;
        if (abstractC5436a != null) {
            if (C4306532d.LIZ(room, this.dataCenter)) {
                abstractC5436a.LIZ(Constants.ASSEMBLE_PUSH_NETWORK_INTERVAL);
            }
            LiveCore LJIILL = abstractC5436a.LJIILL();
            Intrinsics.checkNotNullExpressionValue(LJIILL, "");
            LiveCore.Builder builder = LJIILL.getBuilder();
            Intrinsics.checkNotNullExpressionValue(builder, "");
            AuthUtils authUtils = AuthUtils.LIZIZ;
            String idStr = room.getIdStr();
            Intrinsics.checkNotNullExpressionValue(idStr, "");
            builder.setLiveAuthString(authUtils.LIZ(idStr));
            if (!PatchProxy.proxy(new Object[]{room}, this, LIZLLL, false, 13).isSupported) {
                SettingKey<Boolean> settingKey = LiveConfigSettingKeys.HEART_BEAT_ENABLE;
                Intrinsics.checkNotNullExpressionValue(settingKey, "");
                if (settingKey.getValue().booleanValue()) {
                    SettingKey<Long> settingKey2 = LiveConfigSettingKeys.HEART_BEAT_RATE;
                    Intrinsics.checkNotNullExpressionValue(settingKey2, "");
                    Long value = settingKey2.getValue();
                    Intrinsics.checkNotNullExpressionValue(value, "");
                    ((AbstractC81278I1w) C536537Hj.LIZ(value.longValue(), TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread()).m151as(C148062fT6.LIZ(this))).LIZ(new K3X(this, room), K3Z.LIZ);
                }
            }
        }
        if (!this.LJIILIIL) {
            return;
        }
        LJIIIIZZ();
    }

    public void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZLLL, false, 24).isSupported) {
            return;
        }
        boolean z = PatchProxy.proxy(new Object[]{this}, null, C86400K2w.LIZ, true, 4).isSupported;
    }

    @Override // p003X.K0D
    public final void LIZJ() {
        AbsCaptureWidget absCaptureWidget;
        if (!PatchProxy.proxy(new Object[0], this, LIZLLL, false, 16).isSupported && (absCaptureWidget = this.LJIIIZ) != null) {
            absCaptureWidget.LIZIZ();
        }
    }

    public final void LJIIIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZLLL, false, 6).isSupported) {
            return;
        }
        this.LJIIZILJ.LIZ();
    }

    @Override // p003X.K0D
    public final List<View> LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZLLL, false, 17);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(findViewById(2131186141));
        arrayList.add(findViewById(2131186183));
        arrayList.add(findViewById(2131186182));
        return arrayList;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZLLL, false, 7).isSupported) {
            return;
        }
        super.onDestroy();
        C88722KxY c88722KxY = this.LIZ;
        if (c88722KxY != null) {
            c88722KxY.LIZJ();
        }
        this.LIZ = null;
        AbstractC5436a abstractC5436a = this.LJII;
        if (abstractC5436a != null) {
            abstractC5436a.mo15611LJ();
        }
    }

    @Override // p003X.K0D
    public final AbstractC6070q LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZLLL, false, 15);
        if (proxy.isSupported) {
            return (AbstractC6070q) proxy.result;
        }
        AbsCaptureWidget absCaptureWidget = this.LJIIIZ;
        if (absCaptureWidget != null) {
            return (AbstractC6070q) absCaptureWidget;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.livesdk.chatroom.interact.LiveVideoClientFactory");
    }

    @Override // p003X.AbstractC86398K2u
    public final void LJII() {
        if (PatchProxy.proxy(new Object[0], this, LIZLLL, false, 18).isSupported) {
            return;
        }
        C86665KDb.LIZIZ("ttlive_on_stop_live_stream", "StreamWidget");
        AbstractC5436a abstractC5436a = this.LJII;
        if (abstractC5436a != null) {
            abstractC5436a.LIZ();
        }
        if (this.LJIILLIIL != LiveMode.AUDIO) {
            SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_END_ENABLESTOP_VIDEO_CAPTURE;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            Boolean value = settingKey.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            if (!value.booleanValue()) {
                return;
            }
        }
        AbstractC5436a abstractC5436a2 = this.LJII;
        if (abstractC5436a2 != null) {
            abstractC5436a2.LJII();
        }
    }

    @Override // p003X.AbstractC86398K2u
    public final void LJIIIIZZ() {
        AbstractC413392Xt<ViewModel> LLJJL;
        ViewModel LIZIZ;
        IFilterManager iFilterManager;
        if (PatchProxy.proxy(new Object[0], this, LIZLLL, false, 19).isSupported) {
            return;
        }
        if (!this.LJIIL) {
            this.LJIILIIL = true;
            return;
        }
        C5923dp LIZ = C5923dp.LJIIJ.LIZ(this.dataCenter, 0L);
        if (LIZ != null && (LLJJL = LIZ.LLJJL()) != null && (LIZIZ = LLJJL.LIZIZ()) != null && (LIZIZ instanceof AbstractC439343Zo)) {
            AbstractC413392Xt<IFilterManager> LJFF = ((AbstractC439343Zo) LIZIZ).LJFF();
            AbstractC5436a abstractC5436a = this.LJII;
            if (abstractC5436a != null) {
                iFilterManager = abstractC5436a.LJIIJ();
            } else {
                iFilterManager = null;
            }
            LJFF.LIZIZ(iFilterManager);
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onCreate() {
        if (PatchProxy.proxy(new Object[0], this, LIZLLL, false, 5).isSupported) {
            return;
        }
        super.onCreate();
        Context context = getContext();
        if (context != null) {
            this.LJIIJ = new EffectLiveBroadcastActivityProxy((FragmentActivity) context);
            this.LJII = LJIIJ();
            if (this.LJII == null) {
                ALogger.m15800e("StreamWidget", "init liveStream Failed !!!!!!! skip onViewCreated");
                if (getContext() instanceof FragmentActivity) {
                    Context context2 = getContext();
                    if (context2 != null) {
                        ((FragmentActivity) context2).finish();
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                    }
                }
            }
            LJI();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0451, code lost:
        if (com.p1594ss.android.common.util.NetworkUtils.isWifi(getContext()) == false) goto L114;
     */
    /* JADX WARN: Removed duplicated region for block: B:129:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03c7 A[Catch: NoClassDefFoundError -> 0x04a0, UnsatisfiedLinkError -> 0x04bc, TryCatch #4 {NoClassDefFoundError -> 0x04a0, UnsatisfiedLinkError -> 0x04bc, blocks: (B:79:0x038a, B:81:0x03c7, B:82:0x03cb, B:84:0x03d2, B:86:0x03d8, B:87:0x03e2, B:89:0x03e6, B:93:0x03f2, B:95:0x0419, B:97:0x0420, B:99:0x0435, B:101:0x0449, B:103:0x0453, B:105:0x046a, B:106:0x046d, B:108:0x0478, B:109:0x047b, B:111:0x047f, B:112:0x0483), top: B:78:0x038a }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03e6 A[Catch: NoClassDefFoundError -> 0x04a0, UnsatisfiedLinkError -> 0x04bc, TryCatch #4 {NoClassDefFoundError -> 0x04a0, UnsatisfiedLinkError -> 0x04bc, blocks: (B:79:0x038a, B:81:0x03c7, B:82:0x03cb, B:84:0x03d2, B:86:0x03d8, B:87:0x03e2, B:89:0x03e6, B:93:0x03f2, B:95:0x0419, B:97:0x0420, B:99:0x0435, B:101:0x0449, B:103:0x0453, B:105:0x046a, B:106:0x046d, B:108:0x0478, B:109:0x047b, B:111:0x047f, B:112:0x0483), top: B:78:0x038a }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x03f2 A[Catch: NoClassDefFoundError -> 0x04a0, UnsatisfiedLinkError -> 0x04bc, TryCatch #4 {NoClassDefFoundError -> 0x04a0, UnsatisfiedLinkError -> 0x04bc, blocks: (B:79:0x038a, B:81:0x03c7, B:82:0x03cb, B:84:0x03d2, B:86:0x03d8, B:87:0x03e2, B:89:0x03e6, B:93:0x03f2, B:95:0x0419, B:97:0x0420, B:99:0x0435, B:101:0x0449, B:103:0x0453, B:105:0x046a, B:106:0x046d, B:108:0x0478, B:109:0x047b, B:111:0x047f, B:112:0x0483), top: B:78:0x038a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.bytedance.android.live.pushstream.AbstractC5436a LJIIJ() {
        /*
            Method dump skipped, instructions count: 1296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.widget.StreamWidget.LJIIJ():com.bytedance.android.live.pushstream.a");
    }

    @Override // com.bytedance.android.live.broadcast.api.AbstractC2883g
    public void LIZ(K41 k41) {
        if (PatchProxy.proxy(new Object[]{k41}, this, LIZLLL, false, 29).isSupported) {
            return;
        }
        boolean z = PatchProxy.proxy(new Object[]{this, k41}, null, C86400K2w.LIZ, true, 1).isSupported;
    }

    public K07 LIZIZ(AbstractC5436a abstractC5436a) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC5436a}, this, LIZLLL, false, 9);
        if (proxy.isSupported) {
            return (K07) proxy.result;
        }
        C106862S5w.LIZ(abstractC5436a);
        LiveMode liveMode = this.LJIILLIIL;
        DataCenter dataCenter = this.dataCenter;
        Intrinsics.checkNotNullExpressionValue(dataCenter, "");
        return new K07(abstractC5436a, liveMode, dataCenter, this.LJIIZILJ, null, this);
    }

    @Override // p003X.K0D
    public final void LIZ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZLLL, false, 20).isSupported) {
            return;
        }
        View findViewById = findViewById(2131171632);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        findViewById.setVisibility(i);
        View findViewById2 = findViewById(2131171634);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        findViewById2.setVisibility(i);
        View findViewById3 = findViewById(2131171631);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "");
        findViewById3.setVisibility(i);
        View findViewById4 = findViewById(2131171633);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "");
        findViewById4.setVisibility(i);
    }

    public void LIZ(HSB hsb) {
        if (PatchProxy.proxy(new Object[]{hsb}, this, LIZLLL, false, 26).isSupported) {
            return;
        }
        C106862S5w.LIZ(hsb);
        if (!PatchProxy.proxy(new Object[]{this, hsb}, null, C86400K2w.LIZ, true, 5).isSupported) {
            C106862S5w.LIZ(hsb);
            if (!PatchProxy.proxy(new Object[]{this, hsb}, null, C86399K2v.LIZ, true, 1).isSupported) {
                C106862S5w.LIZ(hsb);
            }
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.AbstractC2883g
    public void LIZ(K4D k4d) {
        if (PatchProxy.proxy(new Object[]{k4d}, this, LIZLLL, false, 28).isSupported) {
            return;
        }
        boolean z = PatchProxy.proxy(new Object[]{this, k4d}, null, C86400K2w.LIZ, true, 2).isSupported;
    }

    public void LIZ(K7C k7c) {
        if (PatchProxy.proxy(new Object[]{k7c}, this, LIZLLL, false, 25).isSupported) {
            return;
        }
        C106862S5w.LIZ(k7c);
        if (!PatchProxy.proxy(new Object[]{this, k7c}, null, C86400K2w.LIZ, true, 6).isSupported) {
            C106862S5w.LIZ(k7c);
            if (!PatchProxy.proxy(new Object[]{this, k7c}, null, C86399K2v.LIZ, true, 2).isSupported) {
                C106862S5w.LIZ(k7c);
            }
        }
    }

    @Override // com.bytedance.android.live.broadcast.api.AbstractC2883g, com.bytedance.android.live.room.AbstractC5478a
    public void LIZ(FrameLayout frameLayout, FragmentManager fragmentManager) {
        if (PatchProxy.proxy(new Object[]{frameLayout, fragmentManager}, this, LIZLLL, false, 27).isSupported) {
            return;
        }
        boolean z = PatchProxy.proxy(new Object[]{this, frameLayout, fragmentManager}, null, C86400K2w.LIZ, true, 3).isSupported;
    }

    public StreamWidget(StreamUrlExtra streamUrlExtra, String str, LiveMode liveMode, K06 k06) {
        C106862S5w.LIZ(streamUrlExtra, liveMode, k06);
        this.LJIILJJIL = streamUrlExtra;
        this.LJIILL = str;
        this.LJIILLIIL = liveMode;
        this.LJIIZILJ = k06;
        K8Q.LIZ().LJI().LIZ(this);
    }
}
