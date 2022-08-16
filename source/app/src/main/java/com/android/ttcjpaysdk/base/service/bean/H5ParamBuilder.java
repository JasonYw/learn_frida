package com.android.ttcjpaysdk.base.service.bean;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public class H5ParamBuilder {
    public static ChangeQuickRedirect changeQuickRedirect;
    public int canvasMode;
    public String cashdeskScene;
    public JSONObject channelInfo;
    public Context context;
    public int disableClose;
    public boolean disableH5History;
    public boolean enableAnim;
    public String enterFrom;
    public String formData;
    public JSONObject hostInfo;
    public boolean isFromBanner;
    public boolean isFromDouPlus;
    public boolean isFromWxIndependentSign;
    public Boolean isHideWebView;
    public boolean isNeedTransparentActivity;
    public String modalViewBgcolor;
    public String navigationBarColor;
    public JSONObject orderInfo;
    public String referer;
    public String requestType;
    public JSONObject riskInfo;
    public int screenType;
    public String statusBarTextStyle;
    public String titleBarBgColor;
    public String titleTextColor;
    public String url;
    public String title = "";
    public boolean isShowTitle = true;
    public boolean isShowTitleBar = true;
    public String isTransTitleBar = "0";
    public String statusBarColor = "";
    public String backButtonColor = "";
    public String backButtonIcon = "arrow";
    public boolean showLoading = true;
    public int timeout = -1;
    public String hideLoading = "";
    public boolean isPreFetchData = true;
    public String hostBackUrl = "";
    public Map<String, String> extendParams = new HashMap();
    public int callbackId = -1;

    static {
        Covode.recordClassIndex(6546);
    }

    public String getBackButtonColor() {
        return this.backButtonColor;
    }

    public String getBackButtonIcon() {
        return this.backButtonIcon;
    }

    public int getCallbackId() {
        return this.callbackId;
    }

    public int getCanvasMode() {
        return this.canvasMode;
    }

    public String getCashdeskScene() {
        return this.cashdeskScene;
    }

    public JSONObject getChannelInfo() {
        return this.channelInfo;
    }

    public Context getContext() {
        return this.context;
    }

    public int getDisableClose() {
        return this.disableClose;
    }

    public String getEnterFrom() {
        return this.enterFrom;
    }

    public String getFormData() {
        return this.formData;
    }

    public String getHideLoading() {
        return this.hideLoading;
    }

    public Boolean getHideWebView() {
        return this.isHideWebView;
    }

    public String getHostBackUrl() {
        return this.hostBackUrl;
    }

    public JSONObject getHostInfo() {
        return this.hostInfo;
    }

    public String getIsTransTitleBar() {
        return this.isTransTitleBar;
    }

    public String getModalViewBgcolor() {
        return this.modalViewBgcolor;
    }

    public String getNavigationBarColor() {
        return this.navigationBarColor;
    }

    public JSONObject getOrderInfo() {
        return this.orderInfo;
    }

    public String getReferer() {
        return this.referer;
    }

    public String getRequestType() {
        return this.requestType;
    }

    public JSONObject getRiskInfo() {
        return this.riskInfo;
    }

    public int getScreenType() {
        return this.screenType;
    }

    public String getStatusBarTextStyle() {
        return this.statusBarTextStyle;
    }

    public int getTimeout() {
        return this.timeout;
    }

    public String getTitleBarBgColor() {
        return this.titleBarBgColor;
    }

    public String getTitleTextColor() {
        return this.titleTextColor;
    }

    public String getUrl() {
        return this.url;
    }

    public boolean isDisableH5History() {
        return this.disableH5History;
    }

    public boolean isEnableAnim() {
        return this.enableAnim;
    }

    public boolean isFromBanner() {
        return this.isFromBanner;
    }

    public boolean isFromDouPlus() {
        return this.isFromDouPlus;
    }

    public boolean isFromWxIndependentSign() {
        return this.isFromWxIndependentSign;
    }

    public boolean isNeedTransparentActivity() {
        return this.isNeedTransparentActivity;
    }

    public boolean isPreFetchData() {
        return this.isPreFetchData;
    }

    public boolean isShowLoading() {
        return this.showLoading;
    }

    public boolean isShowTitleBar() {
        return this.isShowTitleBar;
    }

    public String isTransTitleBar() {
        return this.isTransTitleBar;
    }

    public String getExtendParams() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (!this.extendParams.isEmpty()) {
            try {
                return new JSONObject(this.extendParams).toString();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return "";
    }

    public String getStatusBarColor() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (TextUtils.isEmpty(this.statusBarColor)) {
            return "#ffffff";
        }
        return this.statusBarColor;
    }

    public String getTitle() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if ("0".equals(this.isTransTitleBar)) {
            return this.title;
        }
        return "";
    }

    public boolean isShowTitle() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!"0".equals(this.isTransTitleBar)) {
            return false;
        }
        return true;
    }

    public H5ParamBuilder setBackButtonColor(String str) {
        this.backButtonColor = str;
        return this;
    }

    public H5ParamBuilder setBackButtonIcon(String str) {
        this.backButtonIcon = str;
        return this;
    }

    public H5ParamBuilder setCallbackId(int i) {
        this.callbackId = i;
        return this;
    }

    public H5ParamBuilder setCanvasMode(int i) {
        this.canvasMode = i;
        return this;
    }

    public H5ParamBuilder setCashDeskScene(String str) {
        this.cashdeskScene = str;
        return this;
    }

    public H5ParamBuilder setChannelInfo(JSONObject jSONObject) {
        this.channelInfo = jSONObject;
        return this;
    }

    public H5ParamBuilder setContext(Context context) {
        this.context = context;
        return this;
    }

    public H5ParamBuilder setDisableClose(int i) {
        this.disableClose = i;
        return this;
    }

    public H5ParamBuilder setDisableH5History(boolean z) {
        this.disableH5History = z;
        return this;
    }

    public H5ParamBuilder setEnableAnim(boolean z) {
        this.enableAnim = z;
        return this;
    }

    public H5ParamBuilder setEnterFrom(String str) {
        this.enterFrom = str;
        return this;
    }

    public H5ParamBuilder setExtendParams(Map<String, String> map) {
        this.extendParams = map;
        return this;
    }

    public H5ParamBuilder setFormData(String str) {
        this.formData = str;
        return this;
    }

    public H5ParamBuilder setFromBanner(boolean z) {
        this.isFromBanner = z;
        return this;
    }

    public H5ParamBuilder setFromDouPlus(boolean z) {
        this.isFromDouPlus = z;
        return this;
    }

    public H5ParamBuilder setFromWxIndependentSign(boolean z) {
        this.isFromWxIndependentSign = z;
        return this;
    }

    public H5ParamBuilder setHideLoading(String str) {
        this.hideLoading = str;
        return this;
    }

    public H5ParamBuilder setHideWebView(Boolean bool) {
        this.isHideWebView = bool;
        return this;
    }

    public H5ParamBuilder setHostBackUrl(String str) {
        this.hostBackUrl = str;
        return this;
    }

    public H5ParamBuilder setHostInfo(JSONObject jSONObject) {
        this.hostInfo = jSONObject;
        return this;
    }

    public H5ParamBuilder setIsTransTitleBar(String str) {
        this.isTransTitleBar = str;
        return this;
    }

    public H5ParamBuilder setModalViewBgcolor(String str) {
        this.modalViewBgcolor = str;
        return this;
    }

    public H5ParamBuilder setNavigationBarColor(String str) {
        this.navigationBarColor = str;
        return this;
    }

    public H5ParamBuilder setNeedTransparentActivity(boolean z) {
        this.isNeedTransparentActivity = z;
        return this;
    }

    public H5ParamBuilder setOrderInfo(JSONObject jSONObject) {
        this.orderInfo = jSONObject;
        return this;
    }

    public H5ParamBuilder setPreFetchData(boolean z) {
        this.isPreFetchData = z;
        return this;
    }

    public H5ParamBuilder setReferer(String str) {
        this.referer = str;
        return this;
    }

    public H5ParamBuilder setRequestType(String str) {
        this.requestType = str;
        return this;
    }

    public H5ParamBuilder setRiskInfo(JSONObject jSONObject) {
        this.riskInfo = jSONObject;
        return this;
    }

    public H5ParamBuilder setScreenType(int i) {
        this.screenType = i;
        return this;
    }

    public H5ParamBuilder setShowLoading(boolean z) {
        this.showLoading = z;
        return this;
    }

    public H5ParamBuilder setShowTitle(boolean z) {
        this.isShowTitle = z;
        return this;
    }

    public H5ParamBuilder setShowTitleBar(boolean z) {
        this.isShowTitleBar = z;
        return this;
    }

    public H5ParamBuilder setStatusBarColor(String str) {
        this.statusBarColor = str;
        return this;
    }

    public H5ParamBuilder setStatusBarTextStyle(String str) {
        this.statusBarTextStyle = str;
        return this;
    }

    public H5ParamBuilder setTimeout(int i) {
        this.timeout = i;
        return this;
    }

    public H5ParamBuilder setTitle(String str) {
        this.title = str;
        return this;
    }

    public H5ParamBuilder setTitleBarBgColor(String str) {
        this.titleBarBgColor = str;
        return this;
    }

    public H5ParamBuilder setTitleTextColor(String str) {
        this.titleTextColor = str;
        return this;
    }

    public H5ParamBuilder setUrl(String str) {
        this.url = str;
        return this;
    }
}
