package com.bytedance.android.live.core.setting;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.android.live.core.setting.TTLiveSettingUtil;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.JsonObject;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import java.util.Collections;
import java.util.concurrent.Callable;
import p002O.C0002O;
import p003X.AbstractC90734Lou;
import p003X.C1X9;
import p003X.C90730Loq;
import p003X.C90731Lor;
import p003X.C90878LrE;
import p003X.C90880LrG;
import p003X.C99783PRp;
import p003X.G4Y;

/* loaded from: classes5.dex */
public class TTLiveSettingUtil {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(23616);
    }

    public static void setLocalTest(boolean z) {
    }

    public static final /* synthetic */ void lambda$updateSettings$2$TTLiveSettingUtil(Throwable th) {
        if (PatchProxy.proxy(new Object[]{th}, null, changeQuickRedirect, true, 4).isSupported) {
            return;
        }
        C90880LrG.LIZIZ("updateSettings failed", th);
    }

    public static void saveToKeva(JsonObject jsonObject) {
        if (PatchProxy.proxy(new Object[]{jsonObject}, null, changeQuickRedirect, true, 2).isSupported) {
            return;
        }
        C1X9.LIZ(jsonObject);
    }

    public static final /* synthetic */ void lambda$updateSettings$1$TTLiveSettingUtil(Boolean bool) {
        if (PatchProxy.proxy(new Object[]{bool}, null, changeQuickRedirect, true, 5).isSupported) {
            return;
        }
        C90878LrE.LIZIZ.onNext(bool);
        C90880LrG.LIZ(C0002O.m25086C("updateSettings finish; result=", String.valueOf(bool)));
    }

    public static final /* synthetic */ Boolean lambda$updateSettings$0$TTLiveSettingUtil(SharedPreferences sharedPreferences, JsonObject jsonObject) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{sharedPreferences, jsonObject}, null, changeQuickRedirect, true, 6);
        if (proxy.isSupported) {
            return (Boolean) proxy.result;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        try {
            String jsonElement = jsonObject.toString();
            edit.putString("key_ttlive_sdk_setting", jsonObject.toString());
            C90880LrG.LIZ("put setting called; setting_key_count=" + jsonObject.size() + ", value_size=" + jsonElement.length());
            copySetingToOuter(edit, jsonObject);
            saveToKeva(jsonObject);
            C90880LrG.LIZ("updateSettings; copy to outer finish;");
        } catch (Exception e) {
            C90880LrG.LIZIZ("callable_inner_failed", e);
        }
        return Boolean.valueOf(edit.commit());
    }

    public static void updateSettings(Context context, final JsonObject jsonObject) {
        if (PatchProxy.proxy(new Object[]{context, jsonObject}, null, changeQuickRedirect, true, 1).isSupported) {
            return;
        }
        if (context != null && jsonObject != null) {
            C90880LrG.LIZ("update_settings_start_in_live", null, Collections.singletonMap("server_setting_key_count", Integer.valueOf(jsonObject.size())));
            try {
                ((AbstractC90734Lou) C99783PRp.LJIIJ.LIZ(AbstractC90734Lou.class)).LIZ(context, jsonObject);
            } catch (Exception e) {
                C90880LrG.LIZIZ("update_annie_failed", e);
            }
            final SharedPreferences LIZ = G4Y.LIZ(context, "ttlive_sdk_shared_pref_cache", 0);
            if (LIZ != null) {
                C90880LrG.LIZ("updateSettings start fromCallable");
                Observable.fromCallable(new Callable(LIZ, jsonObject) { // from class: X.Lop
                    public static ChangeQuickRedirect LIZ;
                    public final SharedPreferences LIZIZ;
                    public final JsonObject LIZJ;

                    static {
                        Covode.recordClassIndex(23632);
                    }

                    {
                        this.LIZIZ = LIZ;
                        this.LIZJ = jsonObject;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
                        return proxy.isSupported ? proxy.result : TTLiveSettingUtil.lambda$updateSettings$0$TTLiveSettingUtil(this.LIZIZ, this.LIZJ);
                    }
                }).subscribeOn(Schedulers.m138io()).observeOn(AndroidSchedulers.mainThread()).subscribe(C90731Lor.LIZIZ, C90730Loq.LIZIZ);
                return;
            }
            C90880LrG.LIZIZ("updateSettings; sharedPreferences is null", null);
            return;
        }
        C90880LrG.LIZIZ("updateSettings; context or setting is empty", null);
    }

    public static void copySetingToOuter(SharedPreferences.Editor editor, JsonObject jsonObject) {
        if (!PatchProxy.proxy(new Object[]{editor, jsonObject}, null, changeQuickRedirect, true, 3).isSupported && editor != null && jsonObject != null) {
            if (jsonObject.get("live_fresco_config_key") != null) {
                editor.putString("live_fresco_config_key", jsonObject.get("live_fresco_config_key").toString());
            } else {
                editor.remove("live_fresco_config_key");
            }
            if (jsonObject.get("live_fresco_webp_frame_align_opt") != null) {
                editor.putInt("live_fresco_webp_frame_align_opt", jsonObject.get("live_fresco_webp_frame_align_opt").getAsInt());
            } else {
                editor.remove("live_fresco_webp_frame_align_opt");
            }
            if (jsonObject.get("live_sdk_init_duration_opt") != null) {
                editor.putString("live_sdk_init_duration_opt", jsonObject.get("live_sdk_init_duration_opt").toString());
            } else {
                editor.remove("live_sdk_init_duration_opt");
            }
            if (jsonObject.get("live_equal_talk_room_top_margin_ratio") != null) {
                editor.putFloat("live_equal_talk_room_top_margin_ratio", jsonObject.get("live_equal_talk_room_top_margin_ratio").getAsFloat());
            } else {
                editor.remove("live_equal_talk_room_top_margin_ratio");
            }
            if (jsonObject.get("webcast_monitor_config") != null) {
                editor.putString("webcast_monitor_config", jsonObject.get("webcast_monitor_config").toString());
            } else {
                editor.remove("webcast_monitor_config");
            }
            if (jsonObject.get("live_webview_use_monitor") != null) {
                editor.putBoolean("live_webview_use_monitor", jsonObject.get("live_webview_use_monitor").getAsBoolean());
            } else {
                editor.remove("live_webview_use_monitor");
            }
            if (jsonObject.get("tt_live_webview_monitor_config_slardar_android") != null) {
                editor.putString("tt_live_webview_monitor_config_slardar_android", jsonObject.get("tt_live_webview_monitor_config_slardar_android").toString());
            } else {
                editor.remove("tt_live_webview_monitor_config_slardar_android");
            }
            if (jsonObject.get("cj_schema_risk_info_hosts") != null) {
                editor.putString("cj_schema_risk_info_hosts", jsonObject.get("cj_schema_risk_info_hosts").toString());
            } else {
                editor.remove("cj_schema_risk_info_hosts");
            }
            if (jsonObject.get("live_performance_setting") != null) {
                editor.putString("live_performance_setting", jsonObject.get("live_performance_setting").toString());
            } else {
                editor.remove("live_performance_setting");
            }
            if (jsonObject.get("ttlive_pad_setting_mock") != null) {
                editor.putInt("ttlive_pad_setting_mock", jsonObject.get("ttlive_pad_setting_mock").getAsInt());
            } else {
                editor.remove("ttlive_pad_setting_mock");
            }
            if (jsonObject.get("ttlive_pad_opt_disable_control") != null) {
                editor.putBoolean("ttlive_pad_opt_disable_control", jsonObject.get("ttlive_pad_opt_disable_control").getAsBoolean());
            } else {
                editor.remove("ttlive_pad_opt_disable_control");
            }
            if (jsonObject.get("live_gift_panel_style") != null) {
                editor.putInt("live_gift_panel_style", jsonObject.get("live_gift_panel_style").getAsInt());
            } else {
                editor.remove("live_gift_panel_style");
            }
            if (jsonObject.get("enable_record_download_info") != null) {
                editor.putBoolean("enable_record_download_info", jsonObject.get("enable_record_download_info").getAsBoolean());
            } else {
                editor.remove("enable_record_download_info");
            }
            if (jsonObject.get("live_enable_pull_stream_so_plugin") != null) {
                editor.putBoolean("live_enable_pull_stream_so_plugin", jsonObject.get("live_enable_pull_stream_so_plugin").getAsBoolean());
            } else {
                editor.remove("live_enable_pull_stream_so_plugin");
            }
            if (jsonObject.get("live_skin_pull_times_every_day") != null) {
                editor.putInt("live_skin_pull_times_every_day", jsonObject.get("live_skin_pull_times_every_day").getAsInt());
            } else {
                editor.remove("live_skin_pull_times_every_day");
            }
            if (jsonObject.get("live_ai_config") != null) {
                editor.putString("live_ai_config", jsonObject.get("live_ai_config").toString());
            } else {
                editor.remove("live_ai_config");
            }
            if (jsonObject.get("live_feature_config") != null) {
                editor.putString("live_feature_config", jsonObject.get("live_feature_config").toString());
            } else {
                editor.remove("live_feature_config");
            }
            if (jsonObject.get("live_enable_setting_monitor") != null) {
                editor.putBoolean("live_enable_setting_monitor", jsonObject.get("live_enable_setting_monitor").getAsBoolean());
            } else {
                editor.remove("live_enable_setting_monitor");
            }
            if (jsonObject.get("live_logsdk_config") != null) {
                editor.putString("live_logsdk_config", jsonObject.get("live_logsdk_config").toString());
            } else {
                editor.remove("live_logsdk_config");
            }
            if (jsonObject.get("live_log_sdk_spm_black_list") != null) {
                editor.putString("live_log_sdk_spm_black_list", jsonObject.get("live_log_sdk_spm_black_list").toString());
            } else {
                editor.remove("live_log_sdk_spm_black_list");
            }
            if (jsonObject.get("live_io_pre_start") != null) {
                editor.putBoolean("live_io_pre_start", jsonObject.get("live_io_pre_start").getAsBoolean());
            } else {
                editor.remove("live_io_pre_start");
            }
            if (jsonObject.get("live_enable_jsb_init_opt") != null) {
                editor.putBoolean("live_enable_jsb_init_opt", jsonObject.get("live_enable_jsb_init_opt").getAsBoolean());
            } else {
                editor.remove("live_enable_jsb_init_opt");
            }
            if (jsonObject.get("live_enable_host_reflect_opt") != null) {
                editor.putBoolean("live_enable_host_reflect_opt", jsonObject.get("live_enable_host_reflect_opt").getAsBoolean());
            } else {
                editor.remove("live_enable_host_reflect_opt");
            }
            if (jsonObject.get("live_audio_and_video_privacy_config") != null) {
                editor.putString("live_audio_and_video_privacy_config", jsonObject.get("live_audio_and_video_privacy_config").toString());
            } else {
                editor.remove("live_audio_and_video_privacy_config");
            }
            if (jsonObject.get("live_enable_infrastructure_module_sdk_switch") != null) {
                editor.putBoolean("live_enable_infrastructure_module_sdk_switch", jsonObject.get("live_enable_infrastructure_module_sdk_switch").getAsBoolean());
            } else {
                editor.remove("live_enable_infrastructure_module_sdk_switch");
            }
        }
    }
}
