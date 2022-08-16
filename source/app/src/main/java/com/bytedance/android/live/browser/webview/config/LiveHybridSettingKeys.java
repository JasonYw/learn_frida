package com.bytedance.android.live.browser.webview.config;

import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public interface LiveHybridSettingKeys {
    public static final SettingKey<Boolean> OPEN_HYBRID_SECLINK_CONFIG = new SettingKey<>("enable_wk_seclink", "开启seclink开关配置", Boolean.FALSE, Boolean.TRUE);
    public static final SettingKey<List<String>> HYBRID_SECLINK_WHITE_LIST = new SettingKey<>("live_hybrid_seclink_allow_list", "seclink通过白名单", new ArrayList(), new ArrayList());
    public static final SettingKey<Boolean> ENABLE_SHARE_COOKIE_URL_TO_HTTPS = new SettingKey<>("share_cookie_url_to_https_enable", "是否开启拦截可共享cookie的http请求，并转换成https", Boolean.TRUE, Boolean.TRUE);
    public static final SettingKey<List<String>> SHARE_COOKIE_URL_TO_HTTPS_LIST = new SettingKey<>("share_cookie_url_to_https_list", "HTTP cookie拦截 请求白名单", new ArrayList(), new ArrayList());
    public static final SettingKey<Boolean> ENABLE_HYBRID_CONTAINER_ORIENTATION_BY_SIZE = new SettingKey<>("hybrid_container_orientation_by_size_enable", "是否开启容器通过尺寸判断横竖屏", Boolean.FALSE, Boolean.TRUE);
    public static final SettingKey<Boolean> ENABLE_BOE_URL_REPLACE = new SettingKey<>("enable_boe_url_replace", "是否开启BOE环境URL替换", Boolean.TRUE, Boolean.TRUE);
    public static final SettingKey<Boolean> ENABLE_AUTO_SHOW_FLOAT_LIVE = new SettingKey<>("enable_auto_show_float_live", "显示浮窗参数是否生效", Boolean.TRUE, Boolean.TRUE);

    static {
        Covode.recordClassIndex(23109);
    }
}
