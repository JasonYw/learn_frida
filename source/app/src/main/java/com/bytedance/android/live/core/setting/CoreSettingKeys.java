package com.bytedance.android.live.core.setting;

import com.bytedance.android.live.base.model.LoginGuideConfig;
import com.bytedance.android.live.base.model.feed.C2829b;
import com.bytedance.android.live.base.model.p246a.C2805a;
import com.bytedance.covode.number.Covode;
import com.xiaomi.mipush.sdk.Constants;

/* loaded from: classes5.dex */
public interface CoreSettingKeys {
    public static final SettingKey<Boolean> ENABLE_IMAGE_DEFAULT_565 = new SettingKey<>("enable_image_default_565", Boolean.TRUE, "是否默认开启565");
    public static final SettingKey<LoginGuideConfig> LOGIN_GUIDE = new SettingKey<>("login_guide_config", LoginGuideConfig.class);
    public static final SettingKey<Boolean> APPLOG_CORE_V3_ONLY = new SettingKey<>("applog_core_v3_only", Boolean.FALSE, "推荐用核心埋点只发V3", "false:双发", "true:只发V3");
    public static final SettingKey<Integer> PROFILE_DOWNLOAD_STYLE = new SettingKey<>("profile_download_style", 0, "我的 tab 是否显示下载任务", "0: 不显示", "1: 显示");
    public static final SettingKey<Integer> ENABLE_NEW_CHAT_NAME = new SettingKey<>("enable_im_new_name", 0, "私信改名为聊天", "0:私信", "1:聊天");
    public static final SettingKey<Boolean> LIFT_CHAT_RESTRICTION = new SettingKey<>("ichat_restrict_range", Boolean.FALSE, "是否放开私信开关", "true:表示放开限制，关注就能发私信", "false:表示互关才能发私信");
    public static final SettingKey<C2805a[]> COUNTRY_CODE_LIST = new SettingKey<>("country_code_maps", C2805a[].class, "国家码下发");
    public static final SettingKey<String> REGION = new SettingKey<>("region", "");
    public static final SettingKey<Integer> IMAGE_DOWNLOAD_THREAD_SIZE = new SettingKey<>("image_download_thread_size", 8);
    public static final SettingKey<Integer> ENABLE_ALOG = new SettingKey<>("enable_alog", 0, "是否开启ALOG回捞", "0:不开启", "1:开启");
    public static final SettingKey<Integer> ENABLE_MONITOR_TO_ALOG = new SettingKey<>("enable_monitor_to_alog", 0, "是否开启monitor日志输出到ALog", "0:默认开启", "1:不开启");
    public static final SettingKey<Integer> ENABLE_CUSTOM_TTPLAYER = new SettingKey<>("enable_custom_ttplayer", 1, "选择礼物播放器的实现方式", "0:使用TTVideoEngine", "1:使用自定义的TTMediaPlayer");
    public static final SettingKey<Integer> MAX_CACHE_EVICTION_ENTRIES = new SettingKey<>("fresco_mem", 100);
    public static final SettingKey<Integer> MAX_CACHE_ASHM_ENTRIES = new SettingKey<>("MAX_CACHE_ASHM_ENTRIES", 128);
    public static final SettingKey<Integer> MAX_CACHE_ENTRIES = new SettingKey<>("MAX_CACHE_ENTRIES", Integer.valueOf((int) Constants.ASSEMBLE_PUSH_RETRY_INTERVAL));
    public static final SettingKey<String> SHARE_DESC_SUFFIX = new SettingKey<>("share_desc_suffix", "");
    public static final SettingKey<String> SHARE_DESC_SUFFIX_URL = new SettingKey<>("share_desc_suffix_url", "");
    public static final SettingKey<String> TRACKING_CUSTOM_UA = new SettingKey<>("tracking_custom_ua_format", "", "自定义 UA");
    public static final SettingKey<Integer> TEST_FAKE_REGION = new SettingKey<>("fake_regions", 0, "local_test fake国家", "0:中国", "1:摩洛哥", "2:沙特阿拉伯", "3:法国", "4:阿联酋");
    public static final SettingKey<C2829b> LIVE_FEED_PRELOAD = new SettingKey<>("live_feed_preload", "feed load more配置", new C2829b(), new C2829b());

    static {
        Covode.recordClassIndex(23613);
    }
}
