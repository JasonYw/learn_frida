package com.android.ttcjpaysdk.base.p132h5.bean;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.Serializable;
import java.net.URLDecoder;
import java.util.Map;
import p003X.C1DR;

/* renamed from: com.android.ttcjpaysdk.base.h5.bean.CJWebviewInfoBean */
/* loaded from: classes17.dex */
public class CJWebviewInfoBean implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String backButtonColor;
    public String backButtonIcon;
    public String backgroundColor;
    public int callbackId;
    public int canvasMode;
    public int disableClose;
    public int enableAnimation;
    public int enableFontScale;
    public int fullPage;
    public String hideStatusBar;
    public String hideTitleBar;
    public String hostBackUrl;
    public boolean isFromBanner;
    public boolean isNeedTransparant;
    public int showLoading;
    public String statusBarTextStyle;
    public int timeout;
    public String title;
    public String titleBarBgColor;
    public String titleTextColor;
    public String url;

    static {
        Covode.recordClassIndex(6118);
    }

    public final boolean LIZ() {
        if (this.fullPage == -1) {
            return false;
        }
        return true;
    }

    public CJWebviewInfoBean() {
        this.timeout = -1;
        this.hostBackUrl = "";
        this.enableFontScale = 1;
        this.fullPage = -1;
        this.callbackId = -1;
    }

    public CJWebviewInfoBean(Uri uri) {
        String str;
        String str2;
        this.timeout = -1;
        this.hostBackUrl = "";
        this.enableFontScale = 1;
        this.fullPage = -1;
        this.callbackId = -1;
        this.url = LIZ(uri, PushConstants.WEB_URL);
        this.title = LIZ(uri, "title");
        this.titleTextColor = LIZ(uri, "title_text_color");
        this.titleBarBgColor = LIZ(uri, "title_bar_bg_color");
        this.backButtonColor = LIZ(uri, "back_button_color");
        this.backButtonIcon = LIZ(uri, "back_button_icon");
        if (TextUtils.isEmpty(this.backButtonIcon)) {
            str = "arrow";
        } else {
            str = this.backButtonIcon;
        }
        this.backButtonIcon = str;
        this.hideStatusBar = LIZ(uri, "hide_status_bar");
        String str3 = "0";
        if (TextUtils.isEmpty(this.hideStatusBar)) {
            str2 = str3;
        } else {
            str2 = this.hideStatusBar;
        }
        this.hideStatusBar = str2;
        this.statusBarTextStyle = LIZ(uri, "status_bar_text_style");
        this.backgroundColor = LIZ(uri, "background_color");
        this.hideTitleBar = LIZ(uri, "hide_title_bar");
        this.hideTitleBar = !TextUtils.isEmpty(this.hideTitleBar) ? this.hideTitleBar : str3;
        try {
            this.timeout = Integer.parseInt(LIZ(uri, "cj_timeout"));
        } catch (Exception unused) {
            this.timeout = -1;
        }
        try {
            this.disableClose = Integer.parseInt(LIZ(uri, "cj_disable_close"));
        } catch (Exception unused2) {
            this.disableClose = 0;
        }
        try {
            this.canvasMode = Integer.parseInt(LIZ(uri, "canvas_mode"));
        } catch (Exception unused3) {
            this.canvasMode = 0;
        }
        try {
            this.fullPage = Integer.valueOf(LIZ(uri, "fullpage")).intValue();
        } catch (Exception unused4) {
            this.fullPage = -1;
        }
        if (this.fullPage != -1) {
            this.isNeedTransparant = true;
        }
        try {
            this.enableAnimation = Integer.valueOf(LIZ(uri, "enable_animation")).intValue();
        } catch (Exception unused5) {
            this.enableAnimation = 1;
        }
        try {
            this.showLoading = Integer.valueOf(LIZ(uri, "show_loading")).intValue();
        } catch (Exception unused6) {
            this.showLoading = 1;
        }
        try {
            this.enableFontScale = Integer.parseInt(LIZ(uri, "enable_font_scale"));
        } catch (Exception unused7) {
            this.enableFontScale = 1;
        }
        this.hostBackUrl = LIZ(uri, "host_back_url");
    }

    public CJWebviewInfoBean(Uri uri, Map<String, String> map) {
        this(uri);
        if (map != null) {
            this.url = C1DR.LIZ(this.url, map);
        }
    }

    private String LIZ(Uri uri, String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{uri, str}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (TextUtils.isEmpty(uri.getQueryParameter(str))) {
            return "";
        }
        return URLDecoder.decode(uri.getQueryParameter(str));
    }
}
