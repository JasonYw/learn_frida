package com.bytedance.android.live.broadcast.widget;

import android.widget.ImageView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.broadcast.api.AbstractC2891l;
import com.bytedance.android.live.broadcast.preview.C3199v;
import com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.browser.jsbridge.AbstractC3885b;
import com.bytedance.android.live.core.monitor.LiveTracingMonitor;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.room.IRoomService;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.config.C6833ap;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.popup.C9162c;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.covode.number.Covode;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitor;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ott.sourceui.api.utils.ImmersedStatusBarUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import java.util.LinkedHashMap;
import kotlin.Lazy;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.json.JSONObject;
import p003X.AbstractC445813kF;
import p003X.AbstractC4569445g;
import p003X.C440943cO;
import p003X.C442873fV;
import p003X.C4574547f;
import p003X.C86874KLc;
import p003X.C86875KLd;
import p003X.C86878KLg;
import p003X.C86879KLh;
import p003X.C86885KLn;
import p003X.C88950L2y;
import p003X.IQV;
import p003X.K8Q;
import p003X.KE0;
import p003X.KZ3;
import p003X.KZ5;
import p003X.QB4;

@AbstractC445813kF(LIZ = "GAME_PROMOTE")
/* loaded from: classes5.dex */
public final class PreviewGamePromoteWidget extends AbsPreviewWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public static final /* synthetic */ KProperty[] LIZIZ;
    public AbstractC2891l LIZJ;
    public ImageView LIZLLL;

    /* renamed from: LJ */
    public C9162c f25986LJ;
    public Disposable LJIILIIL;
    public final Lazy LJI = LIZ(C86879KLh.class);
    public final Lazy LJIIL = LIZ(C3199v.class);
    public AbstractC3885b LJIILJJIL = new KZ3(this);
    public KZ5 LJIILL = new KZ5(this);
    public int LJFF = 8;
    public final CompositeDisposable LJIILLIIL = new CompositeDisposable();

    static {
        Covode.recordClassIndex(18507);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(PreviewGamePromoteWidget.class, "mViewModel", "getMViewModel()Lcom/bytedance/android/live/broadcast/viewmodel/PreviewGamePromoteViewModel;", 0);
        Reflection.property1(propertyReference1Impl);
        PropertyReference1Impl propertyReference1Impl2 = new PropertyReference1Impl(PreviewGamePromoteWidget.class, "mStartLiveViewModel", "getMStartLiveViewModel()Lcom/bytedance/android/live/broadcast/preview/StartLiveViewModel;", 0);
        Reflection.property1(propertyReference1Impl2);
        LIZIZ = new KProperty[]{propertyReference1Impl, propertyReference1Impl2};
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbstractC3175a
    public final String LIZ() {
        return "PreviewGamePromoteWidget";
    }

    public final C86879KLh LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (C86879KLh) (proxy.isSupported ? proxy.result : LIZ(this.LJI, this, LIZIZ[0]));
    }

    public final C3199v LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return (C3199v) (proxy.isSupported ? proxy.result : LIZ(this.LJIIL, this, LIZIZ[1]));
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131698443;
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 27).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    private final void LJFF() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported) {
            return;
        }
        LJIIIZ();
    }

    private final void LJI() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported) {
            return;
        }
        LJIIJ();
    }

    private final void LJIIIIZZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 14).isSupported) {
            return;
        }
        LJIIJ();
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            return;
        }
        super.onDestroy();
        if (!this.LJIILLIIL.isDisposed()) {
            this.LJIILLIIL.dispose();
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onPause() {
        Disposable disposable;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        super.onPause();
        Disposable disposable2 = this.LJIILIIL;
        if (disposable2 != null && !disposable2.isDisposed() && (disposable = this.LJIILIIL) != null) {
            disposable.dispose();
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        super.onResume();
        Disposable disposable = this.LJIILIIL;
        if (disposable != null) {
            CompositeDisposable compositeDisposable = this.LJIILLIIL;
            Intrinsics.checkNotNull(disposable);
            compositeDisposable.remove(disposable);
        }
        this.LJIILIIL = ((IBrowserService) ServiceManager.getService(IBrowserService.class)).registerExternalMethodFactory(this.LJIILL).subscribe();
        CompositeDisposable compositeDisposable2 = this.LJIILLIIL;
        Disposable disposable2 = this.LJIILIIL;
        Intrinsics.checkNotNull(disposable2);
        compositeDisposable2.add(disposable2);
    }

    public final void LIZLLL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported) {
            return;
        }
        String LIZ2 = LIZIZ().LIZ().LIZ();
        switch (LIZ2.hashCode()) {
            case 50:
                if (!LIZ2.equals("2")) {
                    return;
                }
                LJI();
                return;
            case ImmersedStatusBarUtils.STATUS_BAR_ALPHA_20:
                if (!LIZ2.equals(PushConstants.PUSH_FLYME_3_CHANGE_VERSION_START)) {
                    return;
                }
                LJFF();
                return;
            case 52:
                if (!LIZ2.equals("4")) {
                    return;
                }
                LJIIIIZZ();
                return;
            case 53:
                if (!LIZ2.equals("5")) {
                    return;
                }
                LJII();
                return;
            default:
                return;
        }
    }

    /* renamed from: LJ */
    public final String m15870LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 17);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        int i = C86875KLd.LIZIZ[LJIIJJI().LIZ().LIZ().ordinal()];
        if (i == 1) {
            return "video";
        }
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    return "video";
                }
                return "third_party";
            }
            return "audio";
        }
        return "screen_record";
    }

    private final void LJII() {
        AbstractC2891l abstractC2891l;
        String str;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported && (abstractC2891l = this.LIZJ) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("anchor_id", LIZIZ().LJI());
            int i = C86875KLd.LIZ[LJIIJJI().LIZ().LIZ().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            str = "others";
                        } else {
                            str = "third_party";
                        }
                    } else {
                        str = "game";
                    }
                } else {
                    str = "video_live";
                }
            } else {
                str = "voice_live";
            }
            linkedHashMap.put("live_type", str);
            linkedHashMap.put("anchor_status", LIZIZ().LIZ().LIZ());
            abstractC2891l.LIZ(getContext(), linkedHashMap);
            LIZIZ().LIZ("1");
            LIZIZ().LIZ().LIZ("4");
        }
    }

    private final void LJIIIZ() {
        Long l;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 16).isSupported) {
            return;
        }
        IUser LIZ2 = ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        String valueOf = String.valueOf(LIZ2.getId());
        String str = null;
        if (LJIIJJI().LIZ().LIZ() == LiveMode.SCREEN_RECORD && (l = LIZJ().LJIILL().LIZ().categoryId) != null) {
            str = String.valueOf(l.longValue());
        }
        C88950L2y c88950L2y = new C88950L2y(false, m15870LJ(), valueOf, "live_start", valueOf, null, null, null, str, null, 704);
        SettingKey<C6833ap> settingKey = LiveSettingKeys.LIVE_GAME_PROMOTE_RES_CONFIG;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        ((IRoomService) ServiceManager.getService(IRoomService.class)).actionHandler().handle(this.context, settingKey.getValue().LIZIZ(c88950L2y));
    }

    private final void LJIIJ() {
        Long l;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 18).isSupported) {
            return;
        }
        IUser LIZ2 = ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        String valueOf = String.valueOf(LIZ2.getId());
        String str = null;
        if (LJIIJJI().LIZ().LIZ() == LiveMode.SCREEN_RECORD && (l = LIZJ().LJIILL().LIZ().categoryId) != null) {
            str = String.valueOf(l.longValue());
        }
        C88950L2y c88950L2y = new C88950L2y(false, m15870LJ(), valueOf, "live_start", valueOf, null, null, null, str, null, 704);
        SettingKey<C6833ap> settingKey = LiveSettingKeys.LIVE_GAME_PROMOTE_RES_CONFIG;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        ((IRoomService) ServiceManager.getService(IRoomService.class)).actionHandler().handle(this.context, settingKey.getValue().LIZ(c88950L2y));
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        AbstractC3885b abstractC3885b;
        Disposable subscribe;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        super.onCreate();
        LJIILL();
        K8Q.LIZ().LJIIIIZZ().LIZ(this);
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 19).isSupported && (subscribe = LIZIZ().LIZ().LIZIZ().subscribe(new C86874KLc(this))) != null) {
            LIZ(subscribe);
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 20).isSupported) {
            Disposable subscribe2 = LIZIZ().LIZLLL().LIZIZ().subscribe(new C86885KLn(this));
            if (subscribe2 != null) {
                QB4.LIZ(subscribe2, this.LJIILLIIL);
            }
            Disposable subscribe3 = LIZIZ().m23487LJ().LIZIZ().subscribe(new C86878KLg(this));
            if (subscribe3 != null) {
                QB4.LIZ(subscribe3, this.LJIILLIIL);
            }
            Disposable subscribe4 = LIZIZ().LJFF().LIZIZ().subscribe(new KE0(this));
            if (subscribe4 != null) {
                QB4.LIZ(subscribe4, this.LJIILLIIL);
            }
        }
        IQV.LIZ(LIZIZ(), (Object) C86879KLh.class);
        this.LIZLLL = (ImageView) this.contentView.findViewById(2131175938);
        LIZJ(new PreviewGamePromoteWidget$onCreate$1(this));
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported && (abstractC3885b = this.LJIILJJIL) != null) {
            QB4.LIZ(((IBrowserService) ServiceManager.getService(IBrowserService.class)).registerExternalMethodFactory(abstractC3885b).subscribe(), this.LJIILLIIL);
        }
        LIZIZ().LJII();
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget
    public final void LIZ(LiveMode liveMode) {
        if (PatchProxy.proxy(new Object[]{liveMode}, this, LIZ, false, 8).isSupported) {
            return;
        }
        super.LIZ(liveMode);
        if (liveMode != null && LJIILIIL() == 0) {
            if (liveMode == LiveMode.AUDIO || liveMode == LiveMode.SCREEN_RECORD || liveMode == LiveMode.VIDEO || liveMode == LiveMode.THIRD_PARTY) {
                LIZ("livesdk_game_promote_anchor_promote_icon_show");
                LIZIZ().LIZLLL = liveMode;
            }
        }
    }

    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 23).isSupported) {
            return;
        }
        C4574547f.LIZ().LIZ(str, MapsKt__MapsKt.mapOf(TuplesKt.m137to("anchor_id", LIZIZ().LJI()), TuplesKt.m137to("live_type", C442873fV.LIZ.LIZ(LJIIJJI().LIZ().LIZ())), TuplesKt.m137to("enter_from", "live_start")), new Object[0]);
        int hashCode = str.hashCode();
        if (hashCode != -619816272) {
            if (hashCode == -296615723 && str.equals("livesdk_game_promote_anchor_promote_icon_show")) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("live_type", C442873fV.LIZ.LIZ(LJIIJJI().LIZ().LIZ()));
                jSONObject.put("anchor_status", LIZIZ().LIZ().LIZ());
                LIZ(this, SDKMonitor.SDK_VERSION, jSONObject, null, 4, null);
            }
        } else if (str.equals("livesdk_game_promote_anchor_promote_icon_click")) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("live_type", C442873fV.LIZ.LIZ(LJIIJJI().LIZ().LIZ()));
            jSONObject2.put("anchor_status", LIZIZ().LIZ().LIZ());
            LIZ(this, 401, jSONObject2, null, 4, null);
        }
    }

    private final void LIZ(int i, JSONObject jSONObject, LiveTracingMonitor.EventType eventType) {
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), jSONObject2, eventType}, this, LIZ, false, 24).isSupported) {
            return;
        }
        JSONObject jSONObject3 = new JSONObject();
        C440943cO.LIZ(jSONObject3, "status", i);
        LiveTracingMonitor.EventModule eventModule = LiveTracingMonitor.EventModule.GAME_PROMOTE;
        JSONObject jSONObject4 = new JSONObject();
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        LiveTracingMonitor.LIZ("ttlive_cooperation_partner_track", eventModule, eventType, jSONObject3, jSONObject4, jSONObject2);
    }

    public static /* synthetic */ void LIZ(PreviewGamePromoteWidget previewGamePromoteWidget, int i, JSONObject jSONObject, LiveTracingMonitor.EventType eventType, int i2, Object obj) {
        if (PatchProxy.proxy(new Object[]{previewGamePromoteWidget, Integer.valueOf(i), jSONObject, null, 4, null}, null, LIZ, true, 25).isSupported) {
            return;
        }
        previewGamePromoteWidget.LIZ(i, jSONObject, LiveTracingMonitor.EventType.BUSSINESS_API_CALL);
    }
}
