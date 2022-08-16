package com.bytedance.android.live.core.setting;

import com.bytedance.android.live.core.monitor.SafetyGuard;
import com.bytedance.android.live.core.monitor.p318b.a$a;
import com.bytedance.android.live.core.p312a.C4061a;
import com.bytedance.covode.number.Covode;
import java.util.List;
import p003X.C1XA;

/* loaded from: classes5.dex */
public interface LiveInfraSettingKeys {
    public static final SettingKey<Boolean> LIVE_BPEA_SWITCH = new SettingKey<>("live_bpea_switch", "使用bpea进行权限控制", Boolean.FALSE, Boolean.FALSE);
    public static final SettingKey<Boolean> LIVE_EZPERMISSION_QUERY = new SettingKey<>("live_ezpermission_query", "使用ezpermission查询权限", Boolean.FALSE, Boolean.FALSE);
    public static final SettingKey<Boolean> LIVE_EZPERMISSION_REQUEST = new SettingKey<>("live_ezpermission_request", "使用ezpermission申请权限", Boolean.FALSE, Boolean.FALSE);
    public static final SettingKey<SafetyGuard.C4079a> LIVE_SAFETY_GUARD_CONFIG = new SettingKey<>("live_safety_guard_config", "SafetyGuard配置", new SafetyGuard.C4079a(), new SafetyGuard.C4079a());
    public static final SettingKey<Boolean> LIVE_ENABLE_BY_CHECKER = new SettingKey<>("live_enable_by_checker", "是否开启checker校验", Boolean.TRUE, Boolean.TRUE);
    public static final SettingKey<List<C4061a>> KEVA_REMOTE_CONFIG_SETTING_KEY = new SettingKey<>("keva_remote_config_setting_keys", "keva远程配置key参数信息", C1XA.LIZIZ.LIZ(), C1XA.LIZIZ.LIZ());
    public static final SettingKey<Boolean> LIVE_ENABLE_KEVA_OPT = new SettingKey<>("live_enable_keva_opt", "是否开启keva优化的总开关", Boolean.TRUE, Boolean.TRUE, true);
    public static final SettingKey<Boolean> LIVE_SHOW_NEVER_ASK_DIALOG = new SettingKey<>("live_show_never_ask_dialog", "在使用EzPermission的前提下是否还需要弹权限申请的弹窗", Boolean.TRUE, Boolean.TRUE);
    public static final SettingKey<a$a> LIVE_TRACE_MONITOR_CONFIG = new SettingKey<>("live_trace_upload_config", "LiveTraceMonitor上报配置", new a$a(), new a$a());
    public static final SettingKey<Boolean> LIVE_ENABLE_SETTING_MONITOR = new SettingKey<>("live_enable_setting_guard_monitor", "是否上报setting流程中的异常", Boolean.TRUE, Boolean.TRUE, true);
    public static final SettingKey<Boolean> MOCK_DISABLE_STOP_VIDEO_CAPTURE = new SettingKey<>("mock_disable_stop_video_capture", "禁用关闭视频采集能力，改参数仅在本地测试音视频采集时使用", Boolean.FALSE, Boolean.FALSE);
    public static final SettingKey<Boolean> MOCK_DISABLE_STOP_AUDIO_CAPTURE = new SettingKey<>("mock_disable_stop_audio_capture", "禁用关闭音频采集能力，改参数仅在本地测试音视频采集时使用", Boolean.FALSE, Boolean.FALSE);

    static {
        Covode.recordClassIndex(23614);
    }
}
