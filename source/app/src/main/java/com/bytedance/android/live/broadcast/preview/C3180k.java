package com.bytedance.android.live.broadcast.preview;

import com.bytedance.android.live.base.model.commerce.DouPlusEntry;
import com.bytedance.android.live.broadcast.api.model.C2902ak;
import com.bytedance.android.live.broadcast.api.model.PermissionResult;
import com.bytedance.android.live.broadcast.api.model.PreviewStatusInfo;
import com.bytedance.android.live.broadcast.api.model.RoomCreateInfo;
import com.bytedance.android.live.broadcast.preview.base.AbstractC3177c;
import com.bytedance.android.livesdkapi.depend.model.Sticker;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.p771a.AbstractC9476j;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import p003X.AbstractC426192th;
import p003X.AbstractC449173pf;
import p003X.AbstractC80293Hkt;
import p003X.C106862S5w;
import p003X.C2WC;
import p003X.C2WD;
import p003X.C420422kO;
import p003X.C81289I2h;
import p003X.C81909IQd;
import p003X.C87308Kak;
import p003X.HNS;

/* renamed from: com.bytedance.android.live.broadcast.preview.k */
/* loaded from: classes12.dex */
public final class C3180k extends AbstractC3177c {
    public static ChangeQuickRedirect LIZ;
    public static final /* synthetic */ KProperty[] LIZIZ;
    public static final C420422kO LIZLLL = new C420422kO((byte) 0);
    public final C81289I2h LJIILJJIL;

    /* renamed from: LJ */
    public final C81289I2h f25917LJ = C81909IQd.LIZ(this, LiveMode.VIDEO, null, 2, null);
    public final C81289I2h LJFF = C81909IQd.LIZ(this, null, 1, null);
    public final C81289I2h LJI = C81909IQd.LIZ(this, Boolean.FALSE, null, 2, null);
    public final C81289I2h LJII = C81909IQd.LIZ(this, PreviewWidgetContext$currentSticker$2.INSTANCE);
    public final C81289I2h LJIIJJI = C81909IQd.LIZ(this, new PreviewStatusInfo(), null, 2, null);
    public final C81289I2h LJIIL = C81909IQd.LIZ(this, Boolean.FALSE, null, 2, null);
    public final C81289I2h LJIILIIL = C81909IQd.LIZ(this, new PermissionResult(), null, 2, null);
    public final C81289I2h LJIILL = C81909IQd.LIZ(this, DouPlusEntry.LIZ(), null, 2, null);
    public final C81289I2h LJIILLIIL = C81909IQd.LIZ(this, null, 1, null);
    public final C81289I2h LJIIZILJ = HNS.LIZ(this, null, 1, null);
    public final C81289I2h LIZJ = HNS.LIZ(this, null, 1, null);
    public final C81289I2h LJIJ = C81909IQd.LIZ(this, null, 1, null);
    public final C81289I2h LJIJI = HNS.LIZ(this, null, 1, null);
    public final C81289I2h LJIJJ = HNS.LIZ(this, null, 1, null);
    public final C81289I2h LJIJJLI = C81909IQd.LIZ(this, Boolean.FALSE, null, 2, null);
    public final C81289I2h LJIL = C81909IQd.LIZ(this, Boolean.FALSE, null, 2, null);

    static {
        Covode.recordClassIndex(17272);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(C3180k.class, "liveMode", "getLiveMode()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl);
        PropertyReference1Impl propertyReference1Impl2 = new PropertyReference1Impl(C3180k.class, "roomCreateInfo", "getRoomCreateInfo()Lcom/bytedance/live/datacontext/IMutableNullable;", 0);
        Reflection.property1(propertyReference1Impl2);
        PropertyReference1Impl propertyReference1Impl3 = new PropertyReference1Impl(C3180k.class, "isFragmentStarted", "isFragmentStarted()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl3);
        PropertyReference1Impl propertyReference1Impl4 = new PropertyReference1Impl(C3180k.class, "currentSticker", "getCurrentSticker()Lcom/bytedance/live/datacontext/IMutableNullable;", 0);
        Reflection.property1(propertyReference1Impl4);
        PropertyReference1Impl propertyReference1Impl5 = new PropertyReference1Impl(C3180k.class, "commerceMiniAppStatus", "getCommerceMiniAppStatus()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl5);
        PropertyReference1Impl propertyReference1Impl6 = new PropertyReference1Impl(C3180k.class, "isEntranceObs", "isEntranceObs()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl6);
        PropertyReference1Impl propertyReference1Impl7 = new PropertyReference1Impl(C3180k.class, "userPermission", "getUserPermission()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl7);
        PropertyReference1Impl propertyReference1Impl8 = new PropertyReference1Impl(C3180k.class, "cameraType", "getCameraType()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl8);
        PropertyReference1Impl propertyReference1Impl9 = new PropertyReference1Impl(C3180k.class, "douPlus", "getDouPlus()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl9);
        PropertyReference1Impl propertyReference1Impl10 = new PropertyReference1Impl(C3180k.class, "liveParamsListener", "getLiveParamsListener()Lcom/bytedance/live/datacontext/IMutableNullable;", 0);
        Reflection.property1(propertyReference1Impl10);
        PropertyReference1Impl propertyReference1Impl11 = new PropertyReference1Impl(C3180k.class, "startLiveFragmentShowOrHide", "getStartLiveFragmentShowOrHide()Lcom/bytedance/live/datacontext/IEventMember;", 0);
        Reflection.property1(propertyReference1Impl11);
        PropertyReference1Impl propertyReference1Impl12 = new PropertyReference1Impl(C3180k.class, "previewReverseCameraWidgetEnable", "getPreviewReverseCameraWidgetEnable()Lcom/bytedance/live/datacontext/IEventMember;", 0);
        Reflection.property1(propertyReference1Impl12);
        PropertyReference1Impl propertyReference1Impl13 = new PropertyReference1Impl(C3180k.class, "challengeCreationId", "getChallengeCreationId()Lcom/bytedance/live/datacontext/IMutableNullable;", 0);
        Reflection.property1(propertyReference1Impl13);
        PropertyReference1Impl propertyReference1Impl14 = new PropertyReference1Impl(C3180k.class, "previewNotifyEffect", "getPreviewNotifyEffect()Lcom/bytedance/live/datacontext/IEventMember;", 0);
        Reflection.property1(propertyReference1Impl14);
        PropertyReference1Impl propertyReference1Impl15 = new PropertyReference1Impl(C3180k.class, "startLiveToolAreaPopupEvent", "getStartLiveToolAreaPopupEvent()Lcom/bytedance/live/datacontext/IEventMember;", 0);
        Reflection.property1(propertyReference1Impl15);
        PropertyReference1Impl propertyReference1Impl16 = new PropertyReference1Impl(C3180k.class, "gameDetailCameraOperation", "getGameDetailCameraOperation()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl16);
        PropertyReference1Impl propertyReference1Impl17 = new PropertyReference1Impl(C3180k.class, "isBroadcastActivityStart", "isBroadcastActivityStart()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl17);
        LIZIZ = new KProperty[]{propertyReference1Impl, propertyReference1Impl2, propertyReference1Impl3, propertyReference1Impl4, propertyReference1Impl5, propertyReference1Impl6, propertyReference1Impl7, propertyReference1Impl8, propertyReference1Impl9, propertyReference1Impl10, propertyReference1Impl11, propertyReference1Impl12, propertyReference1Impl13, propertyReference1Impl14, propertyReference1Impl15, propertyReference1Impl16, propertyReference1Impl17};
    }

    public final C2WC<LiveMode> LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (C2WC) (proxy.isSupported ? proxy.result : this.f25917LJ.LIZ(this, LIZIZ[0]));
    }

    public final C2WD<RoomCreateInfo> LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return (C2WD) (proxy.isSupported ? proxy.result : this.LJFF.LIZ(this, LIZIZ[1]));
    }

    public final C2WC<Boolean> LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJI.LIZ(this, LIZIZ[2]));
    }

    public final C2WD<Sticker> LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return (C2WD) (proxy.isSupported ? proxy.result : this.LJII.LIZ(this, LIZIZ[3]));
    }

    /* renamed from: LJ */
    public final C2WC<PreviewStatusInfo> m15893LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJIIJJI.LIZ(this, LIZIZ[4]));
    }

    public final C2WC<Boolean> LJFF() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJIIL.LIZ(this, LIZIZ[5]));
    }

    public final C2WC<PermissionResult> LJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 8);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJIILIIL.LIZ(this, LIZIZ[6]));
    }

    public final C2WC<Integer> LJII() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 9);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJIILJJIL.LIZ(this, LIZIZ[7]));
    }

    public final C2WC<DouPlusEntry> LJIIIIZZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 10);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJIILL.LIZ(this, LIZIZ[8]));
    }

    public final C2WD<AbstractC9476j> LJIIIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 11);
        return (C2WD) (proxy.isSupported ? proxy.result : this.LJIILLIIL.LIZ(this, LIZIZ[9]));
    }

    public final AbstractC426192th<Boolean> LJIIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 12);
        return (AbstractC426192th) (proxy.isSupported ? proxy.result : this.LJIIZILJ.LIZ(this, LIZIZ[10]));
    }

    public final C2WD<String> LJIIJJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 14);
        return (C2WD) (proxy.isSupported ? proxy.result : this.LJIJ.LIZ(this, LIZIZ[12]));
    }

    public final AbstractC426192th<Unit> LJIIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 15);
        return (AbstractC426192th) (proxy.isSupported ? proxy.result : this.LJIJI.LIZ(this, LIZIZ[13]));
    }

    public final AbstractC426192th<C2902ak> LJIILIIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 16);
        return (AbstractC426192th) (proxy.isSupported ? proxy.result : this.LJIJJ.LIZ(this, LIZIZ[14]));
    }

    public final C2WC<Boolean> LJIILJJIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 17);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJIJJLI.LIZ(this, LIZIZ[15]));
    }

    public final C2WC<Boolean> LJIILL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 18);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJIL.LIZ(this, LIZIZ[16]));
    }

    public C3180k() {
        C87308Kak<Integer> c87308Kak = AbstractC80293Hkt.LJII;
        Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
        Integer LIZIZ2 = c87308Kak.LIZIZ();
        Intrinsics.checkNotNullExpressionValue(LIZIZ2, "");
        this.LJIILJJIL = C81909IQd.LIZ(this, LIZIZ2, null, 2, null);
    }

    public final Disposable LIZ(final Function1<? super RoomCreateInfo, Unit> function1) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{function1}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (Disposable) proxy.result;
        }
        C106862S5w.LIZ(function1);
        function1.invoke(LIZIZ().LIZ());
        Disposable subscribe = LIZIZ().LIZIZ().subscribe(new Consumer<AbstractC449173pf<? extends RoomCreateInfo>>() { // from class: X.2sI
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(17274);
            }

            @Override // io.reactivex.functions.Consumer
            public final /* synthetic */ void accept(AbstractC449173pf<? extends RoomCreateInfo> abstractC449173pf) {
                AbstractC449173pf<? extends RoomCreateInfo> abstractC449173pf2 = abstractC449173pf;
                if (!PatchProxy.proxy(new Object[]{abstractC449173pf2}, this, LIZ, false, 1).isSupported) {
                    Function1 function12 = Function1.this;
                    Intrinsics.checkNotNullExpressionValue(abstractC449173pf2, "");
                    function12.invoke(C449593qL.LIZ((AbstractC449173pf<? extends Object>) abstractC449173pf2));
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(subscribe, "");
        return subscribe;
    }
}
