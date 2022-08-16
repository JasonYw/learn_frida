package anet.channel.p024c;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.p026e.C0493a;
import anet.channel.strategy.C0551c;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anetwork.channel.http.NetworkSdkSetting;
import com.bytedance.covode.number.Covode;
import com.taobao.orange.OrangeConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p003X.C116073Vmd;
import p003X.C116223Vp3;
import p003X.C116971W2r;
import p003X.GRS;
import p003X.GRT;

/* renamed from: anet.channel.c.a */
/* loaded from: classes2.dex */
public class C0473a implements GRS {

    /* renamed from: a */
    public static boolean f20430a;

    static {
        Covode.recordClassIndex(2165);
        try {
            C116971W2r.LIZ("com.taobao.orange.OrangeConfig");
            f20430a = true;
        } catch (Exception unused) {
            f20430a = false;
        }
    }

    @Override // p003X.GRS
    public void unRegister() {
        if (!f20430a) {
            ALog.m20783w("awcn.OrangeConfigImpl", "no orange sdk", null, new Object[0]);
        } else {
            OrangeConfig.getInstance().unregisterListener(new String[]{"networkSdk"});
        }
    }

    @Override // p003X.GRS
    public void register() {
        if (!f20430a) {
            ALog.m20783w("awcn.OrangeConfigImpl", "no orange sdk", null, new Object[0]);
            return;
        }
        try {
            OrangeConfig.getInstance().registerListener(new String[]{"networkSdk"}, new C0474b(this));
            getConfig("networkSdk", "network_empty_scheme_https_switch", "true");
        } catch (Exception e) {
            ALog.m20787e("awcn.OrangeConfigImpl", "register fail", null, e, new Object[0]);
        }
    }

    public String getConfig(String... strArr) {
        if (!f20430a) {
            ALog.m20783w("awcn.OrangeConfigImpl", "no orange sdk", null, new Object[0]);
            return null;
        }
        try {
            return OrangeConfig.getInstance().getConfig(strArr[0], strArr[1], strArr[2]);
        } catch (Exception e) {
            ALog.m20787e("awcn.OrangeConfigImpl", "get config failed!", null, e, new Object[0]);
            return null;
        }
    }

    public void onConfigUpdate(String str) {
        if ("networkSdk".equals(str)) {
            ALog.m20785i("awcn.OrangeConfigImpl", "onConfigUpdate", null, "namespace", str);
            try {
                C0551c.C0552a.f20738a.m20833a(Boolean.valueOf(getConfig(str, "network_empty_scheme_https_switch", "true")).booleanValue());
            } catch (Exception unused) {
            }
            try {
                boolean booleanValue = Boolean.valueOf(getConfig(str, "network_spdy_enable_switch", "true")).booleanValue();
                ALog.m20785i("anet.NetworkConfigCenter", "[setSpdyEnabled]", null, "enable", Boolean.valueOf(booleanValue));
                GRT.LIZIZ = booleanValue;
            } catch (Exception unused2) {
            }
            try {
                GRT.f6366LJ = Boolean.valueOf(getConfig(str, "network_http_cache_switch", "true")).booleanValue();
            } catch (Exception unused3) {
            }
            try {
                String config = getConfig(str, "network_http_cache_flag", null);
                if (config != null) {
                    long longValue = Long.valueOf(config).longValue();
                    if (longValue != GRT.LJI) {
                        ALog.m20785i("anet.NetworkConfigCenter", "set cache flag", null, "old", Long.valueOf(GRT.LJI), "new", Long.valueOf(longValue));
                        GRT.LJI = longValue;
                        SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.LIZ()).edit();
                        edit.putLong("Cache.Flag", GRT.LJI);
                        edit.apply();
                        C116223Vp3.LIZ();
                    }
                }
            } catch (Exception unused4) {
            }
            try {
                AwcnConfig.setHttpsSniEnable(Boolean.valueOf(getConfig(str, "network_https_sni_enable_switch", "true")).booleanValue());
            } catch (Exception unused5) {
            }
            try {
                AwcnConfig.setAccsSessionCreateForbiddenInBg(Boolean.valueOf(getConfig(str, "network_accs_session_bg_switch", "true")).booleanValue());
            } catch (Exception unused6) {
            }
            try {
                GRT.LJIIJJI = Integer.valueOf(getConfig(str, "network_request_statistic_sample_rate", "10000")).intValue();
            } catch (Exception unused7) {
            }
            try {
                String config2 = getConfig(str, "network_request_forbidden_bg", null);
                if (!TextUtils.isEmpty(config2)) {
                    GRT.LJII = Boolean.valueOf(config2).booleanValue();
                }
            } catch (Exception unused8) {
            }
            try {
                String config3 = getConfig(str, "network_url_white_list_bg", null);
                if (ALog.isPrintLog(2)) {
                    ALog.m20785i("anet.NetworkConfigCenter", "updateWhiteUrlList", null, "White List", config3);
                }
                if (TextUtils.isEmpty(config3)) {
                    GRT.LJIIIIZZ = null;
                } else {
                    ConcurrentHashMap<String, List<String>> concurrentHashMap = new ConcurrentHashMap<>();
                    try {
                        JSONObject jSONObject = new JSONObject(config3);
                        Iterator<String> keys = jSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            Object obj = jSONObject.get(next);
                            try {
                                if ("*".equals(obj)) {
                                    concurrentHashMap.put(next, GRT.LJIIJ);
                                } else if (obj instanceof JSONArray) {
                                    JSONArray jSONArray = (JSONArray) obj;
                                    int length = jSONArray.length();
                                    ArrayList arrayList = new ArrayList(length);
                                    for (int i = 0; i < length; i++) {
                                        Object obj2 = jSONArray.get(i);
                                        if (obj2 instanceof String) {
                                            arrayList.add((String) obj2);
                                        }
                                    }
                                    if (!arrayList.isEmpty()) {
                                        concurrentHashMap.put(next, arrayList);
                                    }
                                }
                            } catch (JSONException unused9) {
                            }
                        }
                    } catch (JSONException e) {
                        ALog.m20787e("anet.NetworkConfigCenter", "parse jsonObject failed", null, e, new Object[0]);
                    }
                    GRT.LJIIIIZZ = concurrentHashMap;
                }
            } catch (Exception unused10) {
            }
            try {
                String config4 = getConfig(str, "network_biz_white_list_bg", null);
                if (!TextUtils.isEmpty(config4)) {
                    GRT.LIZ(config4);
                }
            } catch (Exception unused11) {
            }
            try {
                String config5 = getConfig(str, "network_amdc_preset_hosts", null);
                if (!TextUtils.isEmpty(config5)) {
                    GRT.LIZIZ(config5);
                }
            } catch (Exception unused12) {
            }
            try {
                AwcnConfig.setHorseRaceEnable(Boolean.valueOf(getConfig(str, "network_horse_race_switch", "true")).booleanValue());
            } catch (Exception unused13) {
            }
            try {
                AwcnConfig.setTnetHeaderCacheEnable(Boolean.valueOf(getConfig(str, "tnet_enable_header_cache", "true")).booleanValue());
            } catch (Exception unused14) {
            }
            try {
                String config6 = getConfig(str, "network_http3_enable_switch", null);
                if (!TextUtils.isEmpty(config6)) {
                    boolean booleanValue2 = Boolean.valueOf(config6).booleanValue();
                    SharedPreferences.Editor edit2 = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.LIZ()).edit();
                    edit2.putBoolean("HTTP3_ENABLE", booleanValue2);
                    edit2.apply();
                    AwcnConfig.setHttp3OrangeEnable(booleanValue2);
                    if (!booleanValue2) {
                        AwcnConfig.setHttp3Enable(false);
                    }
                }
            } catch (Exception unused15) {
            }
            try {
                GRT.LJIIL = Boolean.valueOf(getConfig(str, "network_response_buffer_switch", "true")).booleanValue();
            } catch (Exception unused16) {
            }
            try {
                String config7 = getConfig(str, "network_get_session_async_switch", null);
                if (!TextUtils.isEmpty(config7)) {
                    boolean booleanValue3 = Boolean.valueOf(config7).booleanValue();
                    SharedPreferences.Editor edit3 = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.LIZ()).edit();
                    edit3.putBoolean("SESSION_ASYNC_OPTIMIZE", booleanValue3);
                    edit3.apply();
                }
            } catch (Exception unused17) {
            }
            try {
                String config8 = getConfig(str, "network_bg_forbid_request_threshold", null);
                if (!TextUtils.isEmpty(config8)) {
                    int intValue = Integer.valueOf(config8).intValue();
                    if (intValue < 0) {
                        intValue = 0;
                    }
                    GRT.LJIILJJIL = intValue;
                }
            } catch (Exception unused18) {
            }
            try {
                String config9 = getConfig(str, "network_normal_thread_pool_executor_size", null);
                if (!TextUtils.isEmpty(config9)) {
                    ThreadPoolExecutorFactory.setNormalExecutorPoolSize(Integer.valueOf(config9).intValue());
                }
            } catch (Exception unused19) {
            }
            try {
                String config10 = getConfig(str, "network_idle_session_close_switch", null);
                if (!TextUtils.isEmpty(config10)) {
                    AwcnConfig.setIdleSessionCloseEnable(Boolean.valueOf(config10).booleanValue());
                }
            } catch (Exception unused20) {
            }
            try {
                String config11 = getConfig(str, "network_monitor_requests", null);
                if (!TextUtils.isEmpty(config11)) {
                    GRT.LIZJ(config11);
                }
            } catch (Exception unused21) {
            }
            try {
                String config12 = getConfig(str, "network_session_preset_hosts", null);
                if (!TextUtils.isEmpty(config12)) {
                    AwcnConfig.registerPresetSessions(config12);
                }
            } catch (Exception unused22) {
            }
            try {
                String config13 = getConfig(str, "network_ipv6_blacklist_switch", null);
                if (!TextUtils.isEmpty(config13)) {
                    AwcnConfig.setIpv6BlackListEnable(Boolean.valueOf(config13).booleanValue());
                }
            } catch (Exception unused23) {
            }
            try {
                String config14 = getConfig(str, "network_ipv6_blacklist_ttl", null);
                if (!TextUtils.isEmpty(config14)) {
                    AwcnConfig.setIpv6BlackListTtl(Long.valueOf(config14).longValue());
                }
            } catch (Exception unused24) {
            }
            try {
                String config15 = getConfig(str, "network_url_degrade_list", null);
                if (!TextUtils.isEmpty(config15)) {
                    GRT.LIZLLL(config15);
                }
            } catch (Exception unused25) {
            }
            try {
                String config16 = getConfig(str, "network_delay_retry_request_no_network", null);
                if (!TextUtils.isEmpty(config16)) {
                    GRT.LJIILL = Boolean.valueOf(config16).booleanValue();
                }
            } catch (Exception unused26) {
            }
            try {
                String config17 = getConfig(str, "network_bind_service_optimize", null);
                if (!TextUtils.isEmpty(config17)) {
                    boolean booleanValue4 = Boolean.valueOf(config17).booleanValue();
                    SharedPreferences.Editor edit4 = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.LIZ()).edit();
                    edit4.putBoolean("SERVICE_OPTIMIZE", booleanValue4);
                    edit4.apply();
                }
            } catch (Exception unused27) {
            }
            try {
                String config18 = getConfig(str, "network_forbid_next_launch_optimize", null);
                if (!TextUtils.isEmpty(config18)) {
                    boolean booleanValue5 = Boolean.valueOf(config18).booleanValue();
                    SharedPreferences.Editor edit5 = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.LIZ()).edit();
                    edit5.putBoolean("NEXT_LAUNCH_FORBID", booleanValue5);
                    edit5.apply();
                }
            } catch (Exception unused28) {
            }
            try {
                String config19 = getConfig(str, "network_detect_enable_switch", null);
                if (!TextUtils.isEmpty(config19)) {
                    AwcnConfig.setNetworkDetectEnable(Boolean.valueOf(config19).booleanValue());
                }
            } catch (Exception unused29) {
            }
            try {
                String config20 = getConfig(str, "network_ping6_enable_switch", null);
                if (!TextUtils.isEmpty(config20)) {
                    AwcnConfig.setPing6Enable(Boolean.valueOf(config20).booleanValue());
                }
            } catch (Exception unused30) {
            }
            try {
                String config21 = getConfig(str, "network_ipv6_global_enable_swtich", null);
                if (!TextUtils.isEmpty(config21)) {
                    AwcnConfig.setIpv6Enable(Boolean.valueOf(config21).booleanValue());
                }
            } catch (Exception unused31) {
            }
            try {
                String config22 = getConfig(str, "network_xquic_cong_control", null);
                if (!TextUtils.isEmpty(config22)) {
                    AwcnConfig.setXquicCongControl(Integer.valueOf(config22).intValue());
                }
            } catch (Exception unused32) {
            }
            try {
                String config23 = getConfig(str, "network_http3_detect_valid_time", null);
                if (!TextUtils.isEmpty(config23)) {
                    C0493a.m21012a(Long.valueOf(config23).longValue());
                }
            } catch (Exception unused33) {
            }
            try {
                String config24 = getConfig(str, "network_ip_stack_detect_by_udp_connect_enable_switch", null);
                if (!TextUtils.isEmpty(config24)) {
                    AwcnConfig.setIpStackDetectByUdpConnect(Boolean.valueOf(config24).booleanValue());
                }
            } catch (Exception unused34) {
            }
            try {
                String config25 = getConfig(str, "network_cookie_monitor", null);
                if (!TextUtils.isEmpty(config25) && config25 != null && C116073Vmd.LIZIZ != null) {
                    C116073Vmd.LIZIZ.edit().putString("networksdk_target_cookie_name", config25).apply();
                }
            } catch (Exception unused35) {
            }
            try {
                String config26 = getConfig(str, "network_cookie_header_redundant_fix", null);
                if (!TextUtils.isEmpty(config26)) {
                    AwcnConfig.setCookieHeaderRedundantFix(Boolean.valueOf(config26).booleanValue());
                }
            } catch (Exception unused36) {
            }
            try {
                String config27 = getConfig(str, "network_channel_local_instance_enable_switch", null);
                if (!TextUtils.isEmpty(config27)) {
                    GRT.LJIIZILJ = Boolean.valueOf(config27).booleanValue();
                    SharedPreferences.Editor edit6 = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.LIZ()).edit();
                    edit6.putBoolean("CHANNEL_LOCAL_INSTANCE_ENABLE", GRT.LJIIZILJ);
                    edit6.apply();
                }
            } catch (Exception unused37) {
            }
            try {
                String config28 = getConfig(str, "network_allow_spdy_when_bind_service_failed", null);
                if (!TextUtils.isEmpty(config28)) {
                    GRT.LJIJ = Boolean.valueOf(config28).booleanValue();
                    SharedPreferences.Editor edit7 = PreferenceManager.getDefaultSharedPreferences(NetworkSdkSetting.LIZ()).edit();
                    edit7.putBoolean("ALLOW_SPDY_WHEN_BIND_SERVICE_FAILED", GRT.LJIJ);
                    edit7.apply();
                }
            } catch (Exception unused38) {
            }
            try {
                String config29 = getConfig(str, "network_send_connect_info_by_service", null);
                if (!TextUtils.isEmpty(config29)) {
                    AwcnConfig.setSendConnectInfoByService(Boolean.valueOf(config29).booleanValue());
                }
            } catch (Exception unused39) {
            }
            try {
                String config30 = getConfig(str, "network_http_dns_notify_white_list", null);
                if (!TextUtils.isEmpty(config30)) {
                    AwcnConfig.setHttpDnsNotifyWhiteList(config30);
                }
            } catch (Exception unused40) {
            }
        }
    }
}
