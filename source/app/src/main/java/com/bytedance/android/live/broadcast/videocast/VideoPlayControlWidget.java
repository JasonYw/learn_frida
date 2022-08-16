package com.bytedance.android.live.broadcast.videocast;

import android.graphics.drawable.Drawable;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.tetris.layer.core.event.LayerEventDispatcher;
import com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget;
import com.bytedance.android.live.pushstream.AbstractC5436a;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.C5929dx;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.ToolbarButton;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.live.datacontext.C13491f;
import com.p1594ss.avframework.mixer.VideoMixer;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import java.util.List;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import p002O.C0002O;
import p003X.AbstractC413392Xt;
import p003X.AbstractC4569445g;
import p003X.AnonymousClass383;
import p003X.C108494Sng;
import p003X.C2WC;
import p003X.C2WD;
import p003X.C409882Kg;
import p003X.C411622Qy;
import p003X.C413202Xa;
import p003X.C413602Yo;
import p003X.C437493Sl;
import p003X.C77347GeT;
import p003X.C81868IOo;
import p003X.C81872IOs;
import p003X.IP1;
import p003X.IP2;
import p003X.IP4;
import p003X.IP5;
import p003X.IP7;
import p003X.IQV;
import p003X.LK1;
import p003X.LK5;
import p003X.QB4;

/* loaded from: classes3.dex */
public final class VideoPlayControlWidget extends LiveRecyclableWidget implements View.OnClickListener, AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public static final C81872IOs LIZLLL = new C81872IOs((byte) 0);
    public C108494Sng LIZIZ;
    public boolean LJIIJ;
    public CompositeDisposable LJIILIIL;

    /* renamed from: LJ */
    public final Lazy f25951LJ = C77347GeT.LIZ(new VideoPlayControlWidget$viewHolder$2(this));
    public final Lazy LJFF = C77347GeT.LIZ(new VideoPlayControlWidget$actionNextVideoCast$2(this));
    public final Lazy LJI = C77347GeT.LIZ(new VideoPlayControlWidget$actionExitCast$2(this));
    public final Lazy LJII = C77347GeT.LIZ(new VideoPlayControlWidget$actionMoreVideos$2(this));
    public final Lazy LJIIIIZZ = C77347GeT.LIZ(new VideoPlayControlWidget$actionSound$2(this));
    public final Lazy LJIIIZ = C77347GeT.LIZ(new VideoPlayControlWidget$videoCastContainer$2(this));
    public final AnonymousClass383 LJIIJJI = new AnonymousClass383(null, 1);
    public final AnonymousClass383 LJIIL = new AnonymousClass383(null, 1);
    public ViewState LIZJ = ViewState.GONE;
    public final IP2 LJIILJJIL = new IP2();

    /* loaded from: classes3.dex */
    public enum ViewState {
        PLAYING,
        GONE,
        PLAY_FINISHED;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(18057);
        }

        public static ViewState valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (ViewState) (proxy.isSupported ? proxy.result : Enum.valueOf(ViewState.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static ViewState[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (ViewState[]) (proxy.isSupported ? proxy.result : values().clone());
        }
    }

    static {
        Covode.recordClassIndex(18056);
    }

    private final TextView LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return (TextView) (proxy.isSupported ? proxy.result : this.LJFF.mo27335getValue());
    }

    /* renamed from: LJ */
    private final TextView m15877LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return (TextView) (proxy.isSupported ? proxy.result : this.LJI.mo27335getValue());
    }

    private final TextView LJFF() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return (TextView) (proxy.isSupported ? proxy.result : this.LJII.mo27335getValue());
    }

    private final TextView LJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return (TextView) (proxy.isSupported ? proxy.result : this.LJIIIIZZ.mo27335getValue());
    }

    public final C3251d LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (C3251d) (proxy.isSupported ? proxy.result : this.f25951LJ.mo27335getValue());
    }

    public final ViewGroup LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return (ViewGroup) (proxy.isSupported ? proxy.result : this.LJIIIZ.mo27335getValue());
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131700867;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 23).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    private final FrameLayout LJIIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 20);
        if (proxy.isSupported) {
            return (FrameLayout) proxy.result;
        }
        View view = this.contentView;
        Intrinsics.checkNotNullExpressionValue(view, "");
        return (FrameLayout) view.getRootView().findViewById(2131186182);
    }

    public final C5929dx LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 21);
        if (proxy.isSupported) {
            return (C5929dx) proxy.result;
        }
        C13491f LIZ2 = IQV.LIZ("VideoPlay");
        if (!(LIZ2 instanceof C5929dx)) {
            LIZ2 = null;
        }
        return (C5929dx) LIZ2;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onUnload() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
            return;
        }
        LIZ(ViewState.GONE);
        this.LJIIJJI.dispose();
        this.LJIIL.dispose();
        CompositeDisposable compositeDisposable = this.LJIILIIL;
        if (compositeDisposable == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        compositeDisposable.dispose();
    }

    private final void LJII() {
        C5923dp LIZ2;
        AbstractC413392Xt<AbstractC5436a> LJJLIIIJL;
        AbstractC5436a LIZIZ;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported && this.LIZIZ == null && (LIZ2 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null)) != null && (LJJLIIIJL = LIZ2.LJJLIIIJL()) != null && (LIZIZ = LJJLIIIJL.LIZIZ()) != null) {
            C108494Sng c108494Sng = new C108494Sng(LIZIZ.LJIILL(), new IP1(this, this.context));
            c108494Sng.LIZIZ(false);
            this.LIZIZ = c108494Sng;
            this.LJIILJJIL.LIZ(LIZIZ);
        }
    }

    private final void LJIIIIZZ() {
        MethodCollector.m14708i(1338);
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 15).isSupported) {
            MethodCollector.m14707o(1338);
            return;
        }
        ViewGroup LIZIZ = LIZIZ();
        Intrinsics.checkNotNullExpressionValue(LIZIZ, "");
        if (LIZIZ.getChildCount() <= 0 && this.context != null) {
            SurfaceView surfaceView = new SurfaceView(this.context);
            surfaceView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            surfaceView.setTag(this);
            C108494Sng c108494Sng = this.LIZIZ;
            if (c108494Sng == null) {
                MethodCollector.m14707o(1338);
                return;
            }
            c108494Sng.LIZ(1, VideoMixer.VideoMixerDescription.FILL());
            c108494Sng.LIZ(surfaceView);
            LIZIZ().addView(surfaceView);
            ViewGroup LIZIZ2 = LIZIZ();
            Intrinsics.checkNotNullExpressionValue(LIZIZ2, "");
            LIZIZ2.setVisibility(8);
            MethodCollector.m14707o(1338);
            return;
        }
        MethodCollector.m14707o(1338);
    }

    private final void LJIIIZ() {
        AbstractC413392Xt<AbstractC5436a> LJJLIIIJL;
        MethodCollector.m14708i(1339);
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 18).isSupported) {
            MethodCollector.m14707o(1339);
            return;
        }
        C108494Sng c108494Sng = this.LIZIZ;
        if (c108494Sng == null) {
            MethodCollector.m14707o(1339);
            return;
        }
        AbstractC5436a abstractC5436a = null;
        c108494Sng.LIZ((View) null);
        C108494Sng c108494Sng2 = this.LIZIZ;
        if (c108494Sng2 != null) {
            c108494Sng2.LJI();
        }
        this.LIZIZ = null;
        IP2 ip2 = this.LJIILJJIL;
        C5923dp LIZ2 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
        if (LIZ2 != null && (LJJLIIIJL = LIZ2.LJJLIIIJL()) != null) {
            abstractC5436a = LJJLIIIJL.LIZIZ();
        }
        ip2.LIZIZ(abstractC5436a);
        LIZIZ().removeAllViews();
        MethodCollector.m14707o(1339);
    }

    private final void LIZIZ(boolean z) {
        String str;
        int i;
        C2WC<Boolean> LIZLLL2;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 19).isSupported) {
            return;
        }
        TextView LJI = LJI();
        Intrinsics.checkNotNullExpressionValue(LJI, "");
        if (z) {
            str = "关";
        } else {
            str = "开";
        }
        LJI.setText(C0002O.m25086C("声音", str));
        TextView LJI2 = LJI();
        Intrinsics.checkNotNullExpressionValue(LJI2, "");
        if (z) {
            i = 2130856562;
        } else {
            i = 2130856809;
        }
        LIZ(LJI2, i);
        C108494Sng c108494Sng = this.LIZIZ;
        if (c108494Sng != null) {
            c108494Sng.LIZ(z);
        }
        C5929dx LIZJ = LIZJ();
        if (LIZJ != null && (LIZLLL2 = LIZJ.LIZLLL()) != null) {
            LIZLLL2.LIZ(Boolean.valueOf(z));
        }
    }

    public final void LIZ(C5929dx.C5930b c5930b) {
        if (PatchProxy.proxy(new Object[]{c5930b}, this, LIZ, false, 12).isSupported) {
            return;
        }
        LJII();
        LJIIIIZZ();
        ALogger.m15801d("VideoPlay", "starting " + c5930b + " with " + this.LIZIZ);
        C108494Sng c108494Sng = this.LIZIZ;
        if (c108494Sng == null) {
            return;
        }
        c108494Sng.LIZ(c5930b.LIZJ);
        c108494Sng.LIZJ(true);
        c108494Sng.LJII();
        c108494Sng.LJFF();
        C5929dx LIZJ = LIZJ();
        if (LIZJ != null) {
            LIZJ.LIZJ().LIZ(c5930b);
        }
    }

    private final void LIZ(boolean z) {
        SurfaceView surfaceView;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 16).isSupported || this.LJIIJ == z) {
            return;
        }
        FrameLayout LJIIJ = LJIIJ();
        if (LJIIJ != null && (surfaceView = (SurfaceView) LJIIJ.findViewById(2131186181)) != null) {
            surfaceView.setZOrderMediaOverlay(z);
            if (z) {
                LIZ().LIZ(LJIIJ);
                int width = LJIIJ.getWidth();
                int height = LJIIJ.getHeight();
                float f = width;
                float LIZJ = ((f - LK1.LIZJ(108)) - LK1.LIZJ(13)) / f;
                float LIZJ2 = (f - LK1.LIZJ(13)) / f;
                float f2 = height;
                float LIZJ3 = ((f2 - LK1.LIZJ(201)) - LK1.LIZJ(85)) / f2;
                float LIZJ4 = (f2 - LK1.LIZJ(85)) / f2;
                C108494Sng c108494Sng = this.LIZIZ;
                Intrinsics.checkNotNull(c108494Sng);
                VideoMixer.VideoMixerDescription FILL = VideoMixer.VideoMixerDescription.FILL();
                FILL.setLeft(LIZJ);
                FILL.setRight(LIZJ2);
                FILL.setTop(LIZJ3);
                FILL.setBottom(LIZJ4);
                FILL.setzOrder(100);
                FILL.setMode(2);
                c108494Sng.LIZ(0, FILL);
            } else {
                C108494Sng c108494Sng2 = this.LIZIZ;
                if (c108494Sng2 != null) {
                    c108494Sng2.LIZ(0, VideoMixer.VideoMixerDescription.FILL());
                }
                LIZ().LIZIZ(LJIIJ);
            }
            this.LJIIJ = z;
            return;
        }
        ALogger.m15800e("VideoPlay", "camera surface is null");
        LJIIIZ();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
        if (r0 != true) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0084, code lost:
        if (((java.lang.Boolean) r1.result).booleanValue() != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ac, code lost:
        r1 = LIZJ();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b0, code lost:
        if (r1 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b2, code lost:
        r1.LIZ(r6.context);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b7, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b8, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a9, code lost:
        if (r1 >= r0.intValue()) goto L29;
     */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onClick(android.view.View r7) {
        /*
            r6 = this;
            r4 = 1
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r5 = 0
            r2[r5] = r7
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.broadcast.videocast.VideoPlayControlWidget.LIZ
            r0 = 8
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r2, r6, r1, r5, r0)
            boolean r0 = r0.isSupported
            if (r0 == 0) goto L13
            return
        L13:
            p003X.C106862S5w.LIZ(r7)
            int r1 = r7.getId()
            android.widget.TextView r0 = r6.LJI()
            java.lang.String r2 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            int r0 = r0.getId()
            if (r1 != r0) goto L54
            X.Sng r3 = r6.LIZIZ
            if (r3 == 0) goto L45
            java.lang.Object[] r2 = new java.lang.Object[r5]
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = p003X.C108494Sng.LIZ
            r0 = 21
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r2, r3, r1, r5, r0)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L49
            java.lang.Object r0 = r1.result
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
        L43:
            if (r0 == r4) goto L52
        L45:
            r6.LIZIZ(r4)
            return
        L49:
            com.ss.avframework.engine.AudioDeviceModule$AudioRenderSink r0 = r3.LIZLLL
            if (r0 == 0) goto L52
            boolean r0 = r0.isMute()
            goto L43
        L52:
            r4 = 0
            goto L45
        L54:
            android.widget.TextView r0 = r6.LIZLLL()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            int r0 = r0.getId()
            if (r1 != r0) goto Lb9
            X.IOp r0 = com.bytedance.android.livesdk.chatroom.C5929dx.LIZLLL
            com.bytedance.android.livesdk.chatroom.dx$b r0 = r0.LIZIZ()
            if (r0 == 0) goto L6d
            r6.LIZ(r0)
            return
        L6d:
            X.IOp r4 = com.bytedance.android.livesdk.chatroom.C5929dx.LIZLLL
            java.lang.Object[] r3 = new java.lang.Object[r5]
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = p003X.C81869IOp.LIZ
            r0 = 5
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r3, r4, r1, r5, r0)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L8c
            java.lang.Object r0 = r1.result
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lac
        L86:
            java.lang.String r0 = "当前已经是最后一个视频"
            p003X.C88440Kt0.LIZ(r0)
            return
        L8c:
            com.bytedance.android.livesdk.chatroom.dx r0 = r4.LIZ()
            if (r0 == 0) goto L86
            X.2WC r0 = r0.LIZ()
            java.lang.Object r0 = r0.LIZ()
            java.util.List r0 = (java.util.List) r0
            int r1 = r0.size()
            java.lang.Integer r0 = com.bytedance.android.livesdk.chatroom.C5929dx.LIZJ
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            int r0 = r0.intValue()
            if (r1 < r0) goto Lac
            goto L86
        Lac:
            com.bytedance.android.livesdk.chatroom.dx r1 = r6.LIZJ()
            if (r1 == 0) goto Lb8
            android.content.Context r0 = r6.context
            r1.LIZ(r0)
            return
        Lb8:
            return
        Lb9:
            android.widget.TextView r0 = r6.LJFF()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            int r0 = r0.getId()
            if (r1 != r0) goto Ld2
            com.bytedance.android.livesdk.chatroom.dx r1 = r6.LIZJ()
            if (r1 == 0) goto Ld1
            android.content.Context r0 = r6.context
            r1.LIZ(r0)
        Ld1:
            return
        Ld2:
            android.widget.TextView r0 = r6.m15877LJ()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            int r0 = r0.getId()
            if (r1 != r0) goto Lef
            X.IOs r1 = com.bytedance.android.live.broadcast.videocast.VideoPlayControlWidget.LIZLLL
            android.content.Context r0 = r7.getContext()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            X.IOu r0 = r1.LIZ(r0)
            p003X.C116971W2r.LIZJ(r0)
        Lef:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcast.videocast.VideoPlayControlWidget.onClick(android.view.View):void");
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        C5929dx LIZJ;
        Disposable subscribe;
        if (PatchProxy.proxy(new Object[]{objArr}, this, LIZ, false, 7).isSupported) {
            return;
        }
        Pair LIZ2 = IQV.LIZ((Function0) VideoPlayControlWidget$onLoad$1.INSTANCE);
        IQV.LIZ((C5929dx) LIZ2.component1(), "VideoPlay");
        this.LJIILIIL = new CompositeDisposable();
        this.LJIIJJI.LIZ((Disposable) LIZ2.component2());
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported && (LIZJ = LIZJ()) != null) {
            Disposable LIZ3 = C413602Yo.LIZ(LIZJ.LIZ(), new VideoPlayControlWidget$setupObserverCallbacks$1(this));
            CompositeDisposable compositeDisposable = this.LJIILIIL;
            if (compositeDisposable == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            compositeDisposable.add(LIZ3);
            Disposable subscribe2 = LIZJ.LIZIZ().LIZIZ().subscribe(new IP5(this));
            CompositeDisposable compositeDisposable2 = this.LJIILIIL;
            if (compositeDisposable2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            compositeDisposable2.add(subscribe2);
            C5923dp LIZ4 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
            if (LIZ4 != null && (subscribe = LIZ4.LJJ().LIZIZ().subscribe(new IP4(this))) != null) {
                CompositeDisposable compositeDisposable3 = this.LJIILIIL;
                if (compositeDisposable3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                compositeDisposable3.add(subscribe);
            }
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported) {
            Disposable subscribe3 = ((IBrowserService) ServiceManager.getService(IBrowserService.class)).registerExternalMethodFactory(new C81868IOo()).subscribe();
            CompositeDisposable compositeDisposable4 = this.LJIILIIL;
            if (compositeDisposable4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            QB4.LIZ(subscribe3, compositeDisposable4);
        }
        LJI().setOnClickListener(this);
        LIZLLL().setOnClickListener(this);
        LJFF().setOnClickListener(this);
        m15877LJ().setOnClickListener(this);
    }

    public final void LIZ(ViewState viewState) {
        C2WC<List<C5929dx.C5930b>> LIZ2;
        C2WC<Integer> LIZIZ;
        C2WD<C5929dx.C5930b> LIZJ;
        C2WC<List<C5929dx.C5930b>> LIZ3;
        boolean z;
        if (PatchProxy.proxy(new Object[]{viewState}, this, LIZ, false, 14).isSupported || viewState == this.LIZJ) {
            return;
        }
        if (viewState != ViewState.GONE) {
            if (viewState == ViewState.PLAY_FINISHED) {
                z = true;
            } else {
                z = false;
            }
            TextView LJFF = LJFF();
            Intrinsics.checkNotNullExpressionValue(LJFF, "");
            LK1.LIZ(LJFF, z);
            TextView LIZLLL2 = LIZLLL();
            Intrinsics.checkNotNullExpressionValue(LIZLLL2, "");
            LK1.LIZ(LIZLLL2, !z);
        }
        int i = IP7.LIZ[viewState.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    C5929dx LIZJ2 = LIZJ();
                    if (LIZJ2 != null && (LIZ3 = LIZJ2.LIZ()) != null) {
                        LIZ3.LIZ(CollectionsKt__CollectionsKt.emptyList());
                    }
                    C5929dx LIZJ3 = LIZJ();
                    if (LIZJ3 != null && (LIZJ = LIZJ3.LIZJ()) != null) {
                        LIZJ.LIZ(null);
                    }
                    C5929dx LIZJ4 = LIZJ();
                    if (LIZJ4 != null && (LIZIZ = LIZJ4.LIZIZ()) != null) {
                        LIZIZ.LIZ(2);
                    }
                    LIZ(false);
                    LIZ(false, this.LIZJ);
                    LIZIZ(false);
                    LJIIIZ();
                }
            } else {
                C5929dx LIZJ5 = LIZJ();
                if (LIZJ5 != null && (LIZ2 = LIZJ5.LIZ()) != null) {
                    LIZ2.LIZ(CollectionsKt__CollectionsKt.emptyList());
                }
            }
        } else {
            LIZ(true);
            LIZ(true, this.LIZJ);
        }
        ALogger.m15801d("VideoPlay", "view state " + this.LIZJ + " -> " + viewState);
        this.LIZJ = viewState;
    }

    private final void LIZ(TextView textView, int i) {
        if (PatchProxy.proxy(new Object[]{textView, Integer.valueOf(i)}, this, LIZ, false, 22).isSupported) {
            return;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, LK5.LIZJ(i), (Drawable) null, (Drawable) null);
    }

    private final void LIZ(boolean z, ViewState viewState) {
        Integer num;
        int i;
        C2WC<Boolean> LLILL;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), viewState}, this, LIZ, false, 17).isSupported) {
            return;
        }
        C5923dp LIZ2 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
        if (LIZ2 != null && (LLILL = LIZ2.LLILL()) != null) {
            LLILL.LIZ(Boolean.valueOf(z));
        }
        DataCenter dataCenter = this.dataCenter;
        if (dataCenter != null) {
            num = Integer.valueOf(dataCenter.hashCode());
        } else {
            num = null;
        }
        LayerEventDispatcher LIZ3 = C411622Qy.LIZ(num);
        C437493Sl c437493Sl = new C437493Sl(true, false, "VideoPlay");
        if (LIZ3 != null) {
            LIZ3.LIZ(c437493Sl);
        }
        if (z) {
            C413202Xa.LIZ().LIZ(ToolbarButton.f27007PK.extended(), "放映时不可使用");
            C413202Xa.LIZ().LIZ(ToolbarButton.INTERACTION.extended(), "放映时不可使用");
            C413202Xa.LIZ().LIZ(ToolbarButton.INTERACT_GAME.extended(), "放映时不可使用");
            C413202Xa.LIZIZ().LIZ(ToolbarButton.KTV.extended(), "放映时不可使用");
            i = 7;
        } else {
            C413202Xa.LIZ().LIZJ(ToolbarButton.f27007PK.extended());
            C413202Xa.LIZ().LIZJ(ToolbarButton.INTERACTION.extended());
            C413202Xa.LIZ().LIZJ(ToolbarButton.INTERACT_GAME.extended());
            C413202Xa.LIZIZ().LIZJ(ToolbarButton.KTV.extended());
            i = 8;
        }
        long nextLong = Random.Default.nextLong();
        if (z && viewState == ViewState.GONE) {
            ((IBroadcastService) ServiceManager.getService(IBroadcastService.class)).justReportRoomEvent(7, nextLong, i, "");
        }
    }
}
