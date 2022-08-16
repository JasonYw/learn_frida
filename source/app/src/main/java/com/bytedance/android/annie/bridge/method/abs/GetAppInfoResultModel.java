package com.bytedance.android.annie.bridge.method.abs;

import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import p003X.AbstractC88716KxS;

/* loaded from: classes7.dex */
public final class GetAppInfoResultModel implements AbstractC88716KxS {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("appID")
    public String appID;
    @SerializedName("appName")
    public String appName;
    @SerializedName("appTheme")
    public String appTheme;
    @SerializedName("appVersion")
    public String appVersion;
    @SerializedName("carrier")
    public String carrier;
    @SerializedName("channel")
    public String channel;
    @SerializedName(C2521l.LJIIJ)
    public Number code;
    @SerializedName("deviceID")
    public String deviceID;
    @SerializedName("deviceModel")
    public String deviceModel;
    @SerializedName("devicePlatform")
    public String devicePlatform;
    @SerializedName("idfa")
    public String idfa;
    @SerializedName("installID")
    public String installID;
    @SerializedName("is32Bit")
    public Boolean is32Bit;
    @SerializedName("isTeenMode")
    public Boolean isTeenMode;
    @SerializedName("language")
    public String language;
    @SerializedName("msg")
    public String msg;
    @SerializedName("networkType")
    public String networkType;
    @SerializedName("osVersion")
    public String osVersion;
    @SerializedName("safeArea")
    public GetAppInfoSafeArea safeArea;
    @SerializedName("screenHeight")
    public Number screenHeight;
    @SerializedName("screenOrientation")
    public String screenOrientation;
    @SerializedName("screenWidth")
    public Number screenWidth;
    @SerializedName("statusBarHeight")
    public Number statusBarHeight;
    @SerializedName("updateVersionCode")
    public String updateVersionCode;

    static {
        Covode.recordClassIndex(10545);
    }

    public final String empty() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        return proxy.isSupported ? (String) proxy.result : "";
    }

    /* loaded from: classes7.dex */
    public static final class GetAppInfoSafeArea {
        @SerializedName("marginBottom")
        public Number marginBottom;
        @SerializedName("marginLeft")
        public Number marginLeft;
        @SerializedName("marginRight")
        public Number marginRight;
        @SerializedName("marginTop")
        public Number marginTop;

        static {
            Covode.recordClassIndex(10546);
        }

        public final Number getMarginBottom() {
            return this.marginBottom;
        }

        public final Number getMarginLeft() {
            return this.marginLeft;
        }

        public final Number getMarginRight() {
            return this.marginRight;
        }

        public final Number getMarginTop() {
            return this.marginTop;
        }

        public final void setMarginBottom(Number number) {
            this.marginBottom = number;
        }

        public final void setMarginLeft(Number number) {
            this.marginLeft = number;
        }

        public final void setMarginRight(Number number) {
            this.marginRight = number;
        }

        public final void setMarginTop(Number number) {
            this.marginTop = number;
        }
    }

    public final String getAppID() {
        return this.appID;
    }

    public final String getAppName() {
        return this.appName;
    }

    public final String getAppTheme() {
        return this.appTheme;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final String getCarrier() {
        return this.carrier;
    }

    public final String getChannel() {
        return this.channel;
    }

    public final Number getCode() {
        return this.code;
    }

    public final String getDeviceID() {
        return this.deviceID;
    }

    public final String getDeviceModel() {
        return this.deviceModel;
    }

    public final String getDevicePlatform() {
        return this.devicePlatform;
    }

    public final String getIdfa() {
        return this.idfa;
    }

    public final String getInstallID() {
        return this.installID;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getMsg() {
        return this.msg;
    }

    public final String getNetworkType() {
        return this.networkType;
    }

    public final String getOsVersion() {
        return this.osVersion;
    }

    public final GetAppInfoSafeArea getSafeArea() {
        return this.safeArea;
    }

    public final Number getScreenHeight() {
        return this.screenHeight;
    }

    public final String getScreenOrientation() {
        return this.screenOrientation;
    }

    public final Number getScreenWidth() {
        return this.screenWidth;
    }

    public final Number getStatusBarHeight() {
        return this.statusBarHeight;
    }

    public final String getUpdateVersionCode() {
        return this.updateVersionCode;
    }

    public final Boolean is32Bit() {
        return this.is32Bit;
    }

    public final Boolean isTeenMode() {
        return this.isTeenMode;
    }

    public final void set32Bit(Boolean bool) {
        this.is32Bit = bool;
    }

    public final void setAppID(String str) {
        this.appID = str;
    }

    public final void setAppName(String str) {
        this.appName = str;
    }

    public final void setAppTheme(String str) {
        this.appTheme = str;
    }

    public final void setAppVersion(String str) {
        this.appVersion = str;
    }

    public final void setCarrier(String str) {
        this.carrier = str;
    }

    public final void setChannel(String str) {
        this.channel = str;
    }

    public final void setCode(Number number) {
        this.code = number;
    }

    public final void setDeviceID(String str) {
        this.deviceID = str;
    }

    public final void setDeviceModel(String str) {
        this.deviceModel = str;
    }

    public final void setDevicePlatform(String str) {
        this.devicePlatform = str;
    }

    public final void setIdfa(String str) {
        this.idfa = str;
    }

    public final void setInstallID(String str) {
        this.installID = str;
    }

    public final void setLanguage(String str) {
        this.language = str;
    }

    public final void setMsg(String str) {
        this.msg = str;
    }

    public final void setNetworkType(String str) {
        this.networkType = str;
    }

    public final void setOsVersion(String str) {
        this.osVersion = str;
    }

    public final void setSafeArea(GetAppInfoSafeArea getAppInfoSafeArea) {
        this.safeArea = getAppInfoSafeArea;
    }

    public final void setScreenHeight(Number number) {
        this.screenHeight = number;
    }

    public final void setScreenOrientation(String str) {
        this.screenOrientation = str;
    }

    public final void setScreenWidth(Number number) {
        this.screenWidth = number;
    }

    public final void setStatusBarHeight(Number number) {
        this.statusBarHeight = number;
    }

    public final void setTeenMode(Boolean bool) {
        this.isTeenMode = bool;
    }

    public final void setUpdateVersionCode(String str) {
        this.updateVersionCode = str;
    }
}
