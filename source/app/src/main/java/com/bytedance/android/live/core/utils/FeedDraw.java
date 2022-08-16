package com.bytedance.android.live.core.utils;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.HashMap;
import java.util.Map;
import p002O.C0002O;

/* loaded from: classes8.dex */
public class FeedDraw {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("city_url")
    public String cityFeedUrl;
    @SerializedName("more_live_url")
    public String followDrawerUrl;
    @SerializedName("pk_url")
    public String pkUrl;
    @SerializedName("settings")
    public Map<String, Integer> settings = new HashMap();
    @SerializedName(PushConstants.WEB_URL)
    public String url;

    static {
        Covode.recordClassIndex(23814);
    }

    public String getFollowDrawerUrl() {
        return this.followDrawerUrl;
    }

    public String getPkUrl() {
        return this.pkUrl;
    }

    public Map<String, Integer> getSettings() {
        return this.settings;
    }

    public String getUrl() {
        return this.url;
    }

    public void setPkUrl(String str) {
        this.pkUrl = str;
    }

    public static FeedDraw defaultInstance(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return (FeedDraw) proxy.result;
        }
        FeedDraw feedDraw = new FeedDraw();
        feedDraw.url = C0002O.m25085C("https://", str, "/webcast/feed/?content_type=0&channel_id=25&is_draw=1");
        return feedDraw;
    }

    public static boolean needCollectUnRead(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 5);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!StringUtils.isEmpty(str) && !str.startsWith("homepage_follow_stream")) {
            return true;
        }
        return false;
    }

    public String getInnerUrl(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.equals(PushConstants.URI_PACKAGE_NAME)) {
            return this.pkUrl;
        }
        if (str.equals("city_feed")) {
            return this.cityFeedUrl;
        }
        return this.url;
    }

    public boolean isSupportedRequestFrom(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        Integer num = this.settings.get(str);
        if (num != null && num.intValue() == 1) {
            return true;
        }
        if (str.equals(PushConstants.URI_PACKAGE_NAME)) {
            if (!TextUtils.isEmpty(this.pkUrl)) {
                return true;
            }
            return false;
        } else if (str.equals("city_feed") && !TextUtils.isEmpty(this.cityFeedUrl)) {
            return true;
        } else {
            return false;
        }
    }

    public static String conventRequestFrom(String str, String str2, Bundle bundle) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2, bundle}, null, changeQuickRedirect, true, 4);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (str == null) {
            return "";
        }
        if ("live_merge".equals(str)) {
            if (!"live_cover".equals(str2)) {
                return "";
            }
            return "feed_draw";
        } else if ("discover_page".equals(str)) {
            if (!"draw_more".equals(str2) && !"living_icon".equals(str2)) {
                return "";
            }
            return "from_discover";
        } else if ("live_merge_activity".equals(str)) {
            if (!"live_k_activity".equals(str2) && !"live_d3_activity".equals(str2)) {
                return "";
            }
            return "feed_draw";
        } else if (str.equals("homepage_hot")) {
            if ("live_cell".equals(str2)) {
                return "homepage_hot_draw";
            }
            if (!"video_head".equals(str2)) {
                return "";
            }
            return "homepage_hot_head";
        } else if (str.equals("homepage_fresh")) {
            return "homepage_fresh_head";
        } else {
            if (str.equals("homepage_follow")) {
                if (!str2.equals("live_cell_cover") && !str2.equals("live_cell")) {
                    return "";
                }
                return "homepage_follow_stream";
            } else if (str.equals("others_homepage")) {
                if (str2 == null) {
                    return "";
                }
                if (str2.equals("others_photo")) {
                    return "others_homepage_photo";
                }
                if (!str2.equals("video_head")) {
                    return "";
                }
                return "others_homepage_head";
            } else if (str.equals("general_search")) {
                if (str2 == null) {
                    return "";
                }
                if (str2.equals("others_photo")) {
                    return "general_search_photo";
                }
                if (str2.equals("video_head")) {
                    return "general_search_head";
                }
                if (!str2.equals("drawer_cover")) {
                    return "";
                }
                return "feed_draw";
            } else if (str.equals("live_detail")) {
                if ("right_anchor".equals(str2)) {
                    return "live_detail_pk";
                }
                if ("top_message".equals(str2)) {
                    return "live_detail_top_message";
                }
                return "live_detail_hourly_rank";
            } else if (str.equals("live_end")) {
                return "live_end_cover";
            } else {
                if (str.equals("push")) {
                    return "push";
                }
                if (!str.equals("h5")) {
                    return "";
                }
                return "h5";
            }
        }
    }
}
