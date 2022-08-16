package com.bytedance.android.live.broadcast.onestep.widget;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.base.exception.ApiServerException;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.LiveCameraResManager;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.broadcast.api.model.PreviewSourceParam;
import com.bytedance.android.live.broadcast.model.Challenge;
import com.bytedance.android.live.broadcast.preview.C3199v;
import com.bytedance.android.live.broadcast.widget.StartLiveWidgetBase;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.core.utils.NetworkUtils;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livehostapi.business.IHostLiveAd;
import com.bytedance.android.livehostapi.foundation.depend.PluginType;
import com.bytedance.android.livehostapi.platform.IHostAction;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.room.service.ExternalFunctionInjectorService;
import com.bytedance.android.livesdk.widget.v$a;
import com.bytedance.android.livesdkapi.config.FastStartLiveConfig;
import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrl;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import p003X.AbstractC422532nn;
import p003X.AbstractC4569445g;
import p003X.AbstractC80293Hkt;
import p003X.AbstractC88358Krg;
import p003X.C106862S5w;
import p003X.C144451eWj;
import p003X.C2WC;
import p003X.C3VF;
import p003X.C4574547f;
import p003X.C458544Bk;
import p003X.C64646Bf6;
import p003X.C86818KIy;
import p003X.C87308Kak;
import p003X.C88440Kt0;
import p003X.C88613Kvn;
import p003X.C90705LoR;
import p003X.C91211Lwb;
import p003X.DialogC88906L1g;
import p003X.DialogInterface$OnDismissListenerC86819KIz;
import p003X.K5Y;
import p003X.K5Z;
import p003X.KJ0;
import p003X.KJ1;

/* loaded from: classes5.dex */
public final class EnterBroadcastWidget extends StartLiveWidgetBase implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public int LIZJ;
    public int LIZLLL;

    /* renamed from: LJ */
    public DialogC88906L1g f25913LJ;
    public boolean LJFF;
    public boolean LJJI;
    public AbstractC88358Krg LJJIFFI;
    public final FastStartLiveConfig LJJII;
    public final Handler LIZIZ = new Handler(Looper.getMainLooper());
    public final TokenCert LJI = TokenCert.Companion.with("bpea-live_start_live_load_resource_enter_broadcast_widget");

    static {
        Covode.recordClassIndex(17065);
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbstractC3175a
    public final String LIZ() {
        return "EnterBroadcastWidget";
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget
    public final void LIZ(LiveMode liveMode) {
    }

    @Override // com.bytedance.android.live.broadcast.widget.StartLiveWidgetBase
    public final String LJIIIZ() {
        return "h5";
    }

    @Override // com.bytedance.android.live.broadcast.widget.StartLiveWidgetBase, com.bytedance.android.live.broadcast.preview.base.AbsStartLiveWidget, com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 21).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.widget.StartLiveWidgetBase
    public final boolean LJI() {
        return this.LJJII.isAutoEnterBroadcast;
    }

    @Override // com.bytedance.android.live.broadcast.widget.StartLiveWidgetBase
    public final void LIZJ() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported && this.LJJII.isTransparentPageForSchema) {
            Context context = this.context;
            if (context != null) {
                ((FragmentActivity) context).finish();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    @Override // com.bytedance.android.live.broadcast.widget.StartLiveWidgetBase
    public final AbstractC88358Krg LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 8);
        if (proxy.isSupported) {
            return (AbstractC88358Krg) proxy.result;
        }
        this.LJJIFFI = new C86818KIy(this);
        return (AbstractC88358Krg) C64646Bf6.LIZ(this.LJJIFFI);
    }

    @Override // com.bytedance.android.live.broadcast.widget.StartLiveWidgetBase
    public final void LJII() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported) {
            return;
        }
        ((IBroadcastService) ServiceManager.getService(IBroadcastService.class)).startLiveManager().LIZIZ();
        ((IHostAction) ServiceManager.getService(IHostAction.class)).finishLivePlayActivity();
        C458544Bk.LIZ().LIZIZ();
        if (this.LJJII.isAutoFinishOnLiveStarted) {
            super.LJII();
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsStartLiveWidget
    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        IService service = ServiceManager.getService(IHostAction.class);
        Intrinsics.checkNotNullExpressionValue(service, "");
        if (!((IHostAction) service).isLiveInPluginMode() && !C90705LoR.LIZIZ.LIZ() && !m15894LJ()) {
            return;
        }
        if (LiveMode.SCREEN_RECORD == LJIIJJI().LIZ().LIZ()) {
            K5Y.LJIJJLI.LIZIZ();
            K5Z.LJIJI.LIZ();
        }
        C3199v LJIIZILJ = LJIIZILJ();
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "");
        LJIIZILJ.LIZ(context, LJIJ(), null, null);
        LJIIZILJ().LIZ();
        ALogger.m15798e(LIZ(), new Throwable("startLive"));
    }

    public final void LJFF() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported || this.context == null || this.LJFF) {
            return;
        }
        this.LJFF = true;
        PluginType.LiveResource.LIZJ();
        if (this.f25913LJ == null) {
            v$a v_a = new v$a(this.context, 2);
            v_a.LIZ(new DialogInterface$OnDismissListenerC86819KIz(this));
            this.f25913LJ = v_a.LIZJ();
        }
        LiveCameraResManager.INST.isLoadedRes.observe(this, new KJ0(this));
    }

    @Override // com.bytedance.android.live.broadcast.widget.StartLiveWidgetBase
    public final String LJIIIIZZ() {
        LiveMode liveMode;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 16);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        C2WC<LiveMode> c2wc = LJIIZILJ().LIZJ;
        if (c2wc != null) {
            liveMode = c2wc.LIZ();
        } else {
            liveMode = null;
        }
        if (liveMode == LiveMode.ACQUAINTANCE) {
            Context context = this.context;
            Intrinsics.checkNotNullExpressionValue(context, "");
            String string = context.getResources().getString(2131582806);
            Intrinsics.checkNotNullExpressionValue(string, "");
            return string;
        }
        return super.LJIIIIZZ();
    }

    @Override // com.bytedance.android.live.broadcast.widget.StartLiveWidgetBase
    public final String LJIIJ() {
        Integer num;
        int i = 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 19);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_PREVIEW_ENABLE_SOURCEPARAM_OPT;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (value.booleanValue()) {
            PreviewSourceParam LIZIZ = LJIIZILJ().LJIJ().LIZIZ();
            if (LIZIZ != null && (num = LIZIZ.propsActivityType) != null) {
                i = num.intValue();
            }
        } else {
            try {
                i = new JSONObject(LJIIZILJ().LJIIZILJ().LIZ()).optInt("props_activity_type");
            } catch (JSONException unused) {
            }
        }
        if (i == 1) {
            return "正在创建直播间";
        }
        return null;
    }

    /* renamed from: LJ */
    public final boolean m15894LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 10);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        boolean LIZIZ = PluginType.LiveResource.LIZIZ();
        String LIZ2 = LIZ();
        ALogger.m15800e(LIZ2, "isInstalled = " + LIZIZ);
        if (!LIZIZ) {
            C91211Lwb.LIZ("ttlive_anchor_plugin_load_all", 1, (JSONObject) null);
            if (!NetworkUtils.LIZIZ(this.context)) {
                C88613Kvn.LIZ(this.context, 2131582739);
                LIZJ();
                return false;
            } else if (NetworkUtils.LIZJ(this.context, this.LJI) == NetworkUtils.NetworkType.MOBILE_2G) {
                C88613Kvn.LIZ(this.context, 2131586496);
                LIZJ();
                return false;
            } else {
                C4574547f.LIZ().LIZ("livesdk_live_take_page_plugin_load");
                long currentTimeMillis = System.currentTimeMillis();
                ALogger.m15800e(LIZ(), "checkInstall");
                PluginType.LiveResource.LIZ(this.context, new KJ1(this, currentTimeMillis));
                return LIZIZ;
            }
        }
        C91211Lwb.LIZ("ttlive_anchor_plugin_load_all", 0, (JSONObject) null);
        if (LiveCameraResManager.INST.LIZJ()) {
            LiveCameraResManager.INST.LIZIZ();
            return LIZIZ;
        }
        LJFF();
        return false;
    }

    @Override // com.bytedance.android.live.broadcast.widget.StartLiveWidgetBase, com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        IUser iUser;
        C3VF user;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        super.onCreate();
        AbstractC422532nn abstractC422532nn = (AbstractC422532nn) ServiceManager.getService(AbstractC422532nn.class);
        if (abstractC422532nn != null) {
            abstractC422532nn.callInjection();
        }
        ExternalFunctionInjectorService.Companion.LIZ(LIZ());
        if (ServiceManager.getService(IHostLiveAd.class) != null) {
            ((IHostLiveAd) ServiceManager.getService(IHostLiveAd.class)).callInjectMessage();
        }
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            IUserService iUserService = (IUserService) ServiceManager.getService(IUserService.class);
            if (iUserService != null && (user = iUserService.user()) != null) {
                iUser = user.LIZ();
            } else {
                iUser = null;
            }
            if ((iUser instanceof User) && iUser.getSecret() == 1) {
                this.LJJI = true;
            }
            if (C144451eWj.LIZ(this.context, "android.permission.ACCESS_FINE_LOCATION")) {
                C87308Kak<Integer> c87308Kak = AbstractC80293Hkt.LJJLIIIJ;
                Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
                Integer LIZ2 = c87308Kak.LIZ();
                if (LIZ2 != null && LIZ2.intValue() == 1) {
                    LJIIZILJ().LJFF().LIZ(Boolean.valueOf(!this.LJJI));
                    return;
                }
            }
            LJIIZILJ().LJFF().LIZ(Boolean.FALSE);
        }
    }

    public EnterBroadcastWidget(FastStartLiveConfig fastStartLiveConfig) {
        C106862S5w.LIZ(fastStartLiveConfig);
        this.LJJII = fastStartLiveConfig;
    }

    private final boolean LIZ(Room room) {
        LiveCoreSDKData liveCoreSDKData;
        LiveCoreSDKData.Quality defaultQuality;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{room}, this, LIZ, false, 7);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        StreamUrl streamUrl = room.getStreamUrl();
        if (streamUrl != null && (liveCoreSDKData = streamUrl.liveCoreSDKData) != null && (defaultQuality = liveCoreSDKData.getDefaultQuality()) != null && (!TextUtils.isEmpty(defaultQuality.name))) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.broadcast.widget.StartLiveWidgetBase
    public final Bundle LIZIZ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 20);
        if (proxy.isSupported) {
            return (Bundle) proxy.result;
        }
        Bundle LIZIZ = super.LIZIZ(str);
        if (LJIIZILJ().LJJIL().LIZ().intValue() == 1) {
            LIZIZ.putBoolean("is_half_screen", true);
        }
        return LIZIZ;
    }

    private final Map<String, String> LIZJ(String str) {
        String str2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 9);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        if (str == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            Intrinsics.checkNotNullExpressionValue(keys, "");
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                if (obj != null) {
                    str2 = obj.toString();
                } else {
                    str2 = null;
                }
                hashMap.put(next, str2);
            }
        } catch (JSONException unused) {
            ALogger.m15800e(LIZ(), "convertToMap");
        }
        return hashMap;
    }

    @Override // com.bytedance.android.live.broadcast.widget.StartLiveWidgetBase
    public final void LIZ(C3199v c3199v) {
        if (PatchProxy.proxy(new Object[]{c3199v}, this, LIZ, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(c3199v);
        super.LIZ(c3199v);
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "");
        c3199v.LIZ(context, LJIJ(), null, null);
    }

    @Override // com.bytedance.android.live.broadcast.widget.StartLiveWidgetBase
    public final void LIZ(String str) {
        LiveMode liveMode;
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 18).isSupported) {
            return;
        }
        C2WC<LiveMode> c2wc = LJIIZILJ().LIZJ;
        if (c2wc != null) {
            liveMode = c2wc.LIZ();
        } else {
            liveMode = null;
        }
        if (liveMode == LiveMode.ACQUAINTANCE) {
            C88440Kt0.LIZ(str);
        } else {
            LJIIZILJ().LIZJ();
        }
    }

    @Override // com.bytedance.android.live.broadcast.widget.StartLiveWidgetBase
    public final void LIZ(ApiServerException apiServerException, String str) {
        String str2;
        if (PatchProxy.proxy(new Object[]{apiServerException, str}, this, LIZ, false, 14).isSupported) {
            return;
        }
        C106862S5w.LIZ(apiServerException, str);
        if (!this.LJJII.isNeedVerify) {
            return;
        }
        if (LJIIZILJ().LJJIL().LIZ().intValue() == 1) {
            str2 = "t_wave";
        } else {
            str2 = "";
        }
        super.LIZ(apiServerException, str2);
    }

    @Override // com.bytedance.android.live.broadcast.widget.StartLiveWidgetBase
    public final void LIZIZ(ApiServerException apiServerException, String str) {
        if (PatchProxy.proxy(new Object[]{apiServerException, str}, this, LIZ, false, 15).isSupported) {
            return;
        }
        C106862S5w.LIZ(apiServerException, str);
        if (this.LJJII.isNeedVerify) {
            super.LIZIZ(apiServerException, str);
        }
    }

    @Override // com.bytedance.android.live.broadcast.widget.StartLiveWidgetBase
    public final void LIZ(JSONObject jSONObject, Intent intent) {
        boolean z;
        int i;
        int i2;
        int i3 = 0;
        if (PatchProxy.proxy(new Object[]{jSONObject, intent}, this, LIZ, false, 17).isSupported) {
            return;
        }
        C106862S5w.LIZ(jSONObject, intent);
        Bundle bundle = new Bundle();
        SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_PREVIEW_ENABLE_SOURCEPARAM_OPT;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (value.booleanValue()) {
            PreviewSourceParam LIZIZ = LJIIZILJ().LJIJ().LIZIZ();
            if (LIZIZ != null) {
                String str = LIZIZ.enterFrom;
                if (str != null && str.length() > 0) {
                    bundle.putString("enter_from", LIZIZ.enterFrom);
                }
                String str2 = LIZIZ.enterFromMerge;
                if (str2 != null && str2.length() > 0) {
                    bundle.putString("enter_from_merge", LIZIZ.enterFromMerge);
                }
                String str3 = LIZIZ.shootWay;
                if (str3 != null && str3.length() > 0) {
                    bundle.putString("shoot_way", LIZIZ.shootWay);
                }
                Boolean bool = LIZIZ.needInvite;
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    z = false;
                }
                bundle.putBoolean("need_invite", z);
                Integer num = LIZIZ.openPanelType;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 0;
                }
                bundle.putInt("open_panel_type", i);
                String str4 = LIZIZ.platformActivityId;
                if (str4 == null) {
                    str4 = "";
                }
                bundle.putString("platform_activity_id", str4);
                Integer num2 = LIZIZ.ktvType;
                if (num2 != null) {
                    i2 = num2.intValue();
                } else {
                    i2 = 0;
                }
                bundle.putInt("ktv_type", i2);
                Integer num3 = LIZIZ.uiLayout;
                if (num3 != null) {
                    i3 = num3.intValue();
                }
                bundle.putInt("uilayout", i3);
                ArrayList<Integer> arrayList = LIZIZ.playMode;
                if (arrayList != null) {
                    bundle.putIntegerArrayList("play_mode", arrayList);
                }
                String str5 = LIZIZ.enterMethod;
                if (str5 != null) {
                    bundle.putString("enter_method", str5);
                }
            }
        } else {
            String optString = jSONObject.optString("enter_from");
            Intrinsics.checkNotNullExpressionValue(optString, "");
            if (optString.length() > 0) {
                bundle.putString("enter_from", optString);
            }
            String optString2 = jSONObject.optString("enter_from_merge");
            Intrinsics.checkNotNullExpressionValue(optString2, "");
            if (optString2.length() > 0) {
                bundle.putString("enter_from_merge", optString2);
            }
            String optString3 = jSONObject.optString("shoot_way");
            Intrinsics.checkNotNullExpressionValue(optString3, "");
            if (optString3.length() > 0) {
                bundle.putString("shoot_way", optString3);
            }
            bundle.putBoolean("need_invite", jSONObject.optBoolean("need_invite"));
            ArrayList<Integer> LIZ2 = FastStartLiveConfig.Companion.LIZ(jSONObject);
            if (LIZ2 != null) {
                bundle.putIntegerArrayList("play_mode", LIZ2);
            }
            String optString4 = jSONObject.optString("enter_method");
            Intrinsics.checkNotNullExpressionValue(optString4, "");
            if (optString4.length() > 0) {
                bundle.putString("enter_method", optString4);
            }
        }
        intent.putExtra("source_params", bundle);
    }

    @Override // com.bytedance.android.live.broadcast.widget.StartLiveWidgetBase
    public final void LIZ(String str, Room room, LiveMode liveMode, Challenge challenge, String str2) {
        LiveCoreSDKData liveCoreSDKData;
        LiveCoreSDKData.Quality defaultQuality;
        Map<String, String> LIZIZ;
        String str3;
        LiveCoreSDKData liveCoreSDKData2;
        LiveCoreSDKData.Quality defaultQuality2;
        if (PatchProxy.proxy(new Object[]{str, room, liveMode, challenge, str2}, this, LIZ, false, 6).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, room, liveMode, str2);
        SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_PREVIEW_ENABLE_SOURCEPARAM_OPT;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        String str4 = null;
        Map<String, String> map = null;
        str4 = null;
        str4 = null;
        if (value.booleanValue()) {
            if (this.LJJII.liveMode == LiveMode.ACQUAINTANCE) {
                C4574547f LIZ2 = C4574547f.LIZ();
                PreviewSourceParam LIZIZ2 = LJIIZILJ().LJIJ().LIZIZ();
                if (LIZIZ2 != null) {
                    map = LIZIZ2.LIZIZ();
                }
                LIZ2.LIZ("live_take_acquaintance", map, new Object[0]);
                return;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (LIZ(room)) {
                StreamUrl streamUrl = room.getStreamUrl();
                if (streamUrl == null || (liveCoreSDKData2 = streamUrl.liveCoreSDKData) == null || (defaultQuality2 = liveCoreSDKData2.getDefaultQuality()) == null || (str3 = defaultQuality2.name) == null) {
                    str3 = "";
                }
                linkedHashMap.put("resolution", str3);
            }
            PreviewSourceParam LIZIZ3 = LJIIZILJ().LJIJ().LIZIZ();
            if (LIZIZ3 != null && (LIZIZ = LIZIZ3.LIZIZ()) != null) {
                linkedHashMap.putAll(LIZIZ);
            }
            C4574547f.LIZ().LIZ("live_take", linkedHashMap, new Object[0]);
        } else if (this.LJJII.liveMode == LiveMode.ACQUAINTANCE) {
            C4574547f.LIZ().LIZ("live_take_acquaintance", LIZJ(LJIIZILJ().LJIIZILJ().LIZ()), new Object[0]);
        } else {
            Map<String, String> LIZJ = LIZJ(LJIIZILJ().LJIIZILJ().LIZ());
            if (LIZ(room)) {
                if (LIZJ == null) {
                    LIZJ = new LinkedHashMap<>();
                }
                StreamUrl streamUrl2 = room.getStreamUrl();
                if (streamUrl2 != null && (liveCoreSDKData = streamUrl2.liveCoreSDKData) != null && (defaultQuality = liveCoreSDKData.getDefaultQuality()) != null) {
                    str4 = defaultQuality.name;
                }
                LIZJ.put("resolution", str4);
            }
            C4574547f.LIZ().LIZ("live_take", LIZJ, new Object[0]);
        }
    }
}
