package com.bytedance.android.live.broadcast.preview.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.AssetManager;
import android.view.GestureDetector;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.broadcast.AbstractC2863ai;
import com.bytedance.android.live.broadcast.AbstractC2864aj;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.core.tetris.widgets.LiveWidget;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.effect.api.C4173o;
import com.bytedance.android.live.effect.api.LiveEffectContextFactory;
import com.bytedance.android.live.effect.view.EffectLiveCameraActivityProxy;
import com.bytedance.android.live.pushstream.AbstractC5436a;
import com.bytedance.android.live.pushstream.IPushStreamService;
import com.bytedance.android.live.pushstream.p419f.AbstractC5441a;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.widget.GestureDetectLayout;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.p1594ss.avframework.livestreamv2.core.IPushFrameAfterCapture;
import com.p1594ss.avframework.livestreamv2.core.LiveCore;
import com.p1594ss.avframework.livestreamv2.filter.IFilterManager;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC146443f2z;
import p003X.AbstractC4569445g;
import p003X.AbstractC86658KCu;
import p003X.AbstractC87075KSv;
import p003X.C3VF;
import p003X.C409842Kc;
import p003X.C86568K9i;
import p003X.K70;
import p003X.K71;
import p003X.K7O;
import p003X.K8Q;
import p003X.K9M;
import p003X.K9N;
import p003X.K9O;
import p003X.K9P;
import p003X.K9Q;
import p003X.K9R;
import p003X.K9S;
import p003X.K9T;
import p003X.KE1;
import p003X.M0Q;
import p003X.M0W;

/* loaded from: classes5.dex */
public final class LiveCameraExtraFrameWidget extends LiveWidget implements SurfaceHolder.Callback, AbstractC86658KCu, AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public ValueAnimator LIZIZ;
    public IPushFrameAfterCapture LIZJ;
    public EffectLiveCameraActivityProxy LIZLLL;

    /* renamed from: LJ */
    public GestureDetector f25926LJ;
    public C86568K9i LJFF;
    public int[] LJI;
    public AbstractC5436a LJII;
    public K9P LJIIIIZZ;
    public View LJIIIZ;
    public HSImageView LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public Surface LJIILIIL;
    public boolean LJIILJJIL;
    public AbstractC2864aj LJIILL;
    public AbstractC2863ai LJIILLIIL;
    public final int LJIIZILJ;
    public final int LJIJ;
    public TextView LJIJI;
    public View LJIJJ;
    public KE1 LJIJJLI;
    public boolean LJIL;
    public C409842Kc LJJ;
    public boolean LJJI;
    public final View.OnTouchListener LJJIFFI = new K9T(this);
    public final boolean LJJII;

    static {
        Covode.recordClassIndex(17498);
    }

    @Override // p003X.AbstractC86658KCu
    public final boolean LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 32);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return true;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 33).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        if (this.LJJII) {
            return 2131700806;
        }
        return 2131700805;
    }

    @Override // p003X.AbstractC86658KCu
    public final void LIZIZ() {
        AbstractC5436a abstractC5436a;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 23).isSupported && (abstractC5436a = this.LJII) != null) {
            abstractC5436a.LJI();
        }
    }

    @Override // p003X.AbstractC86658KCu
    public final void LIZJ() {
        AbstractC5436a abstractC5436a;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 22).isSupported && (abstractC5436a = this.LJII) != null) {
            abstractC5436a.LJII();
        }
    }

    /* renamed from: LJ */
    public final void m15888LJ() {
        IFilterManager iFilterManager;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 27).isSupported) {
            return;
        }
        ALogger.m15801d("BroadcastView", "initStream");
        AbstractC5436a LJII = LJII();
        if (LJII == null) {
            return;
        }
        this.LJII = LJII;
        AbstractC5436a abstractC5436a = this.LJII;
        if (abstractC5436a != null) {
            iFilterManager = abstractC5436a.LJIIJ();
        } else {
            iFilterManager = null;
        }
        this.LJFF = new C86568K9i(iFilterManager);
        AbstractC2864aj abstractC2864aj = this.LJIILL;
        if (abstractC2864aj != null) {
            abstractC2864aj.LIZ(new K9O(this));
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            return;
        }
        super.onDestroy();
        K9P k9p = this.LJIIIIZZ;
        if (k9p != null) {
            k9p.LIZ((AbstractC146443f2z) null);
        }
        this.LJIIIIZZ = null;
        IPushFrameAfterCapture iPushFrameAfterCapture = this.LIZJ;
        if (iPushFrameAfterCapture != null) {
            iPushFrameAfterCapture.release();
        }
        this.LIZJ = null;
        AbstractC5436a abstractC5436a = this.LJII;
        if (abstractC5436a != null) {
            abstractC5436a.mo15611LJ();
        }
        this.LJII = null;
        this.LJIILIIL = null;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onPause() {
        LiveCore LJIILL;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        super.onPause();
        this.LJJI = true;
        if (!this.LJIIJJI) {
            return;
        }
        IPushFrameAfterCapture iPushFrameAfterCapture = this.LIZJ;
        if (iPushFrameAfterCapture != null) {
            iPushFrameAfterCapture.stop();
        }
        AbstractC5436a abstractC5436a = this.LJII;
        if (abstractC5436a != null && (LJIILL = abstractC5436a.LJIILL()) != null) {
            LJIILL.stopAudioPlayer();
        }
        AbstractC5436a abstractC5436a2 = this.LJII;
        if (abstractC5436a2 != null) {
            abstractC5436a2.LJII();
        }
    }

    public final void LIZLLL() {
        View view;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 24).isSupported || (view = this.LJIIIZ) == null || this.LJI == null || this.LJJII) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof FrameLayout.LayoutParams)) {
            layoutParams = null;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        if (layoutParams2 == null) {
            return;
        }
        int[] iArr = this.LJI;
        Intrinsics.checkNotNull(iArr);
        int i = iArr[2];
        int[] iArr2 = this.LJI;
        Intrinsics.checkNotNull(iArr2);
        layoutParams2.width = i - iArr2[0];
        int[] iArr3 = this.LJI;
        Intrinsics.checkNotNull(iArr3);
        int i2 = iArr3[3];
        int[] iArr4 = this.LJI;
        Intrinsics.checkNotNull(iArr4);
        layoutParams2.height = i2 - iArr4[1];
        int[] iArr5 = this.LJI;
        Intrinsics.checkNotNull(iArr5);
        layoutParams2.topMargin = iArr5[1];
        int[] iArr6 = this.LJI;
        Intrinsics.checkNotNull(iArr6);
        layoutParams2.leftMargin = iArr6[0];
        View view2 = this.LJIIIZ;
        if (view2 != null) {
            view2.setLayoutParams(layoutParams2);
        }
        ViewGroup viewGroup = this.containerView;
        if (viewGroup != null) {
            viewGroup.invalidate();
        }
    }

    public final void LJFF() {
        SurfaceHolder holder;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 30).isSupported) {
            return;
        }
        ALogger.m15801d("BroadcastView", "addSurfaceCallback");
        if (!this.LJJII || this.LJIL) {
            return;
        }
        ALogger.m15801d("BroadcastView", "addSurfaceCallback liveCoreAddSurfaceCallback check");
        if (this.LIZJ == null) {
            return;
        }
        ALogger.m15801d("BroadcastView", "addSurfaceCallback alterCapture check");
        this.LJIL = true;
        IPushFrameAfterCapture iPushFrameAfterCapture = this.LIZJ;
        if (iPushFrameAfterCapture != null) {
            iPushFrameAfterCapture.toAddSurfaceViewCallback();
        }
        View view = this.LJIIIZ;
        if (!(view instanceof SurfaceView)) {
            view = null;
        }
        SurfaceView surfaceView = (SurfaceView) view;
        if (surfaceView != null && (holder = surfaceView.getHolder()) != null) {
            holder.addCallback(this);
        }
    }

    public final void LJI() {
        SurfaceHolder holder;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 31).isSupported) {
            return;
        }
        ALogger.m15801d("BroadcastView", "removeSurfaceCallback");
        if (this.LJJII && this.LJIL) {
            ALogger.m15801d("BroadcastView", "liveCoreAddSurfaceCallback check");
            if (this.LIZJ == null) {
                return;
            }
            ALogger.m15801d("BroadcastView", "addSurfaceCallback alterCapture check");
            this.LJIL = false;
            IPushFrameAfterCapture iPushFrameAfterCapture = this.LIZJ;
            if (iPushFrameAfterCapture != null) {
                iPushFrameAfterCapture.toRemoveSurfaceViewCallback();
            }
            View view = this.LJIIIZ;
            if (!(view instanceof SurfaceView)) {
                view = null;
            }
            SurfaceView surfaceView = (SurfaceView) view;
            if (surfaceView != null && (holder = surfaceView.getHolder()) != null) {
                holder.removeCallback(this);
            }
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onResume() {
        IPushFrameAfterCapture iPushFrameAfterCapture;
        LiveCore LJIILL;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        super.onResume();
        boolean z = this.LJJI;
        this.LJJI = false;
        if (!z || !this.LJIIJJI) {
            return;
        }
        AbstractC5436a abstractC5436a = this.LJII;
        if (abstractC5436a != null && (LJIILL = abstractC5436a.LJIILL()) != null) {
            LJIILL.startAudioPlayer();
        }
        AbstractC5436a abstractC5436a2 = this.LJII;
        if (abstractC5436a2 != null) {
            abstractC5436a2.LJI();
        }
        LJFF();
        Surface surface = this.LJIILIIL;
        if (surface != null && (iPushFrameAfterCapture = this.LIZJ) != null) {
            iPushFrameAfterCapture.start(surface);
        }
    }

    private final AbstractC5436a LJII() {
        AssetManager assetManager;
        K71 LIZ2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 25);
        if (proxy.isSupported) {
            return (AbstractC5436a) proxy.result;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, LIZ, false, 26);
        if (proxy2.isSupported) {
            LIZ2 = (K71) proxy2.result;
        } else {
            if (this.context != null) {
                K70 k70 = new K70(this.context);
                k70.LIZ((K7O) new K9Q());
                k70.LIZ((AbstractC5441a) new K9S());
                k70.LJI(this.LJIIZILJ);
                k70.LJII(this.LJIJ);
                SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_PREVIEW_ENABLE_AUTO_GL_RECYCLER;
                Intrinsics.checkNotNullExpressionValue(settingKey, "");
                Boolean value = settingKey.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "");
                k70.LJIIJ(value.booleanValue());
                k70.m23509LJ(30);
                k70.LJFF(30);
                k70.LIZ(this.LJIIZILJ, this.LJIJ);
                k70.LIZ((AbstractC87075KSv) K9R.LIZ);
                Context context = this.context;
                if (context != null) {
                    assetManager = context.getAssets();
                } else {
                    assetManager = null;
                }
                k70.LIZ(assetManager);
                k70.LIZJ(C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LIZJ());
                C4173o LIZ3 = C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT);
                Context context2 = this.context;
                Intrinsics.checkNotNull(context2);
                k70.LIZ(LIZ3.LIZ(context2));
                k70.LJIIJJI(0);
                k70.LJIIJ(4);
                k70.LJJJJLI = false;
                SettingKey<Boolean> settingKey2 = LiveSettingKeys.LIVE_ENABLE_EDGE_RENDER_IN_START_LIVE;
                Intrinsics.checkNotNullExpressionValue(settingKey2, "");
                Boolean value2 = settingKey2.getValue();
                Intrinsics.checkNotNullExpressionValue(value2, "");
                k70.LIZ(value2.booleanValue());
                LIZ2 = k70.LIZ();
            }
            return null;
        }
        if (LIZ2 != null) {
            try {
                AbstractC5436a createLiveStreamWithConfig = ((IPushStreamService) ServiceManager.getService(IPushStreamService.class)).createLiveStreamWithConfig(LIZ2);
                if (this.LJJII) {
                    LiveCore LJIILL = createLiveStreamWithConfig.LJIILL();
                    if (LJIILL != null) {
                        LJIILL.setDisplay(this.LJIIIZ, 1L);
                    }
                } else {
                    LiveCore LJIILL2 = createLiveStreamWithConfig.LJIILL();
                    if (LJIILL2 != null) {
                        LJIILL2.setDisplay(this.LJIIIZ);
                    }
                }
                createLiveStreamWithConfig.LJIIJ().enable(true);
                createLiveStreamWithConfig.LJIIJ().composerSetMode(1, 0);
                createLiveStreamWithConfig.LIZ(new K9M(this));
                return createLiveStreamWithConfig;
            } catch (NoClassDefFoundError e) {
                AbstractC2863ai abstractC2863ai = this.LJIILLIIL;
                if (abstractC2863ai == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                abstractC2863ai.LIZ(this.context, "LiveCameraExtraFrameWidget", e);
                return null;
            } catch (UnsatisfiedLinkError e2) {
                AbstractC2863ai abstractC2863ai2 = this.LJIILLIIL;
                if (abstractC2863ai2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                abstractC2863ai2.LIZ(this.context, "LiveCameraExtraFrameWidget", e2);
                return null;
            }
        }
        return null;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        GenericDraweeHierarchy hierarchy;
        C3VF user;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        super.onCreate();
        AbstractC2863ai abstractC2863ai = this.LJIILLIIL;
        if (abstractC2863ai == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        abstractC2863ai.LIZ();
        if (!this.LJJII) {
            this.LJIIIZ = this.contentView.findViewById(2131191092);
        }
        this.LJIIJ = (HSImageView) this.contentView.findViewById(2131167653);
        this.LJIJJ = this.contentView.findViewById(2131174953);
        this.LJIJI = (TextView) this.contentView.findViewById(2131174954);
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported && this.LJIIJ != null) {
            float screenWidth = UIUtils.getScreenWidth(this.context) / UIUtils.getScreenHeight(this.context);
            IUserService iUserService = (IUserService) ServiceManager.getService(IUserService.class);
            if (iUserService != null && (user = iUserService.user()) != null) {
                HSImageView hSImageView = this.LJIIJ;
                IUser LIZ2 = user.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ2, "");
                M0Q.LIZ(hSImageView, LIZ2.getAvatarLarge(), new M0W(5, screenWidth, null));
            } else {
                HSImageView hSImageView2 = this.LJIIJ;
                if (hSImageView2 != null && (hierarchy = hSImageView2.getHierarchy()) != null) {
                    hierarchy.setPlaceholderImage(2130854253);
                }
                M0Q.LIZIZ(this.LJIIJ, new ImageModel(null, ArraysKt___ArraysKt.toMutableList(new String[]{"https://sf1-ttcdn-tos.pstatp.com/obj/ttfe/ttlive/live_bg/live_audio_bg_o.png"})), 2130854253);
            }
        }
        LIZLLL();
        if (this.LIZLLL == null) {
            Context context = this.context;
            if (!(context instanceof FragmentActivity)) {
                context = null;
            }
            FragmentActivity fragmentActivity = (FragmentActivity) context;
            if (fragmentActivity != null) {
                this.LIZLLL = new EffectLiveCameraActivityProxy(fragmentActivity);
            }
        }
        this.LJIJJLI = C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJIIIIZZ().LJFF();
        this.LJJ = new C409842Kc(this.LJIJJLI, this.LJIJI, this.LJIJJ);
        this.f25926LJ = new GestureDetector(this.context, this.LJJ);
        View view = this.contentView;
        if (!(view instanceof GestureDetectLayout)) {
            view = null;
        }
        GestureDetectLayout gestureDetectLayout = (GestureDetectLayout) view;
        if (gestureDetectLayout != null) {
            gestureDetectLayout.LIZ(this.LJJIFFI);
        }
    }

    @Override // p003X.AbstractC86658KCu
    public final void LIZ(int i) {
        K9P k9p;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 11).isSupported && (k9p = this.LJIIIIZZ) != null) {
            k9p.LIZ(i);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        if (PatchProxy.proxy(new Object[]{surfaceHolder}, this, LIZ, false, 29).isSupported) {
            return;
        }
        LJI();
    }

    @Override // p003X.AbstractC86658KCu
    public final int LIZIZ(String[] strArr) {
        IFilterManager LJIIJ;
        int i = 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{strArr}, this, LIZ, false, 14);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        AbstractC5436a abstractC5436a = this.LJII;
        if (abstractC5436a != null && (LJIIJ = abstractC5436a.LJIIJ()) != null) {
            if (strArr != null) {
                i = strArr.length;
            }
            return LJIIJ.composerAppendNodes(strArr, i);
        }
        return -1;
    }

    @Override // p003X.AbstractC86658KCu
    public final int LIZJ(String[] strArr) {
        IFilterManager LJIIJ;
        int i = 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{strArr}, this, LIZ, false, 16);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        AbstractC5436a abstractC5436a = this.LJII;
        if (abstractC5436a != null && (LJIIJ = abstractC5436a.LJIIJ()) != null) {
            if (strArr != null) {
                i = strArr.length;
            }
            return LJIIJ.composerRemoveNodes(strArr, i);
        }
        return -1;
    }

    @Override // p003X.AbstractC86658KCu
    public final int LIZ(String str) {
        IFilterManager LJIIJ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 18);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        AbstractC5436a abstractC5436a = this.LJII;
        if (abstractC5436a != null && (LJIIJ = abstractC5436a.LJIIJ()) != null) {
            return LJIIJ.setEffect(str);
        }
        return -1;
    }

    @Override // p003X.AbstractC86658KCu
    public final int LIZ(String[] strArr) {
        IFilterManager LJIIJ;
        int i = 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{strArr}, this, LIZ, false, 12);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        AbstractC5436a abstractC5436a = this.LJII;
        if (abstractC5436a != null && (LJIIJ = abstractC5436a.LJIIJ()) != null) {
            if (strArr != null) {
                i = strArr.length;
            }
            return LJIIJ.composerSetNodes(strArr, i);
        }
        return -1;
    }

    @Override // p003X.AbstractC86658KCu
    public final void LIZIZ(int i) {
        C409842Kc c409842Kc;
        boolean z = true;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 20).isSupported) {
            return;
        }
        KE1 LJFF = C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJIIIIZZ().LJFF();
        Intrinsics.checkNotNullExpressionValue(LJFF, "");
        int LIZLLL = LJFF.LIZLLL();
        C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DEFAULT).LJIIIIZZ().LJFF().LIZ(i);
        if (LIZLLL != i && (c409842Kc = this.LJJ) != null) {
            if (LIZLLL <= i) {
                z = false;
            }
            c409842Kc.LIZ(z);
        }
    }

    @Override // p003X.AbstractC86658KCu
    public final void LIZ(K9P k9p) {
        if (PatchProxy.proxy(new Object[]{k9p}, this, LIZ, false, 21).isSupported) {
            return;
        }
        if (k9p == null) {
            this.LJIIIIZZ = null;
            return;
        }
        k9p.LIZ(new K9N(this));
        this.LJIIIIZZ = k9p;
    }

    @Override // p003X.AbstractC86658KCu
    public final int LIZ(int i, int i2) {
        IFilterManager LJIIJ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 17);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        AbstractC5436a abstractC5436a = this.LJII;
        if (abstractC5436a != null && (LJIIJ = abstractC5436a.LJIIJ()) != null) {
            return LJIIJ.composerSetMode(1, 0);
        }
        return -1;
    }

    @Override // p003X.AbstractC86658KCu
    public final int LIZIZ(String[] strArr, String[] strArr2) {
        IFilterManager LJIIJ;
        int i = 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{strArr, strArr2}, this, LIZ, false, 15);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        AbstractC5436a abstractC5436a = this.LJII;
        if (abstractC5436a != null && (LJIIJ = abstractC5436a.LJIIJ()) != null) {
            if (strArr != null) {
                i = strArr.length;
            }
            return LJIIJ.composerAppendNodesWithTags(strArr, i, strArr2);
        }
        return -1;
    }

    @Override // p003X.AbstractC86658KCu
    public final int LIZ(String[] strArr, String[] strArr2) {
        IFilterManager LJIIJ;
        int i = 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{strArr, strArr2}, this, LIZ, false, 13);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        AbstractC5436a abstractC5436a = this.LJII;
        if (abstractC5436a != null && (LJIIJ = abstractC5436a.LJIIJ()) != null) {
            if (strArr != null) {
                i = strArr.length;
            }
            return LJIIJ.composerSetNodesWithTags(strArr, i, strArr2);
        }
        return -1;
    }

    public LiveCameraExtraFrameWidget(int i, int i2, boolean z) {
        this.LJIIZILJ = i;
        this.LJIJ = i2;
        this.LJJII = z;
        K8Q.LIZ().LIZIZ().LIZ(this);
    }
}
