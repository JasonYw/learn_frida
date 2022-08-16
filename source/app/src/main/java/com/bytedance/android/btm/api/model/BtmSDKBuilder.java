package com.bytedance.android.btm.api.model;

import android.app.Application;
import com.bytedance.android.btm.api.depend.IALogDepend;
import com.bytedance.android.btm.api.depend.IAppLogDepend;
import com.bytedance.android.btm.api.depend.IExecutorDepend;
import com.bytedance.android.btm.api.depend.ILogDepend;
import com.bytedance.android.btm.api.depend.IMonitorDepend;
import com.bytedance.android.btm.api.depend.ISettingDepend;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C106862S5w;

/* loaded from: classes18.dex */
public final class BtmSDKBuilder {
    public static ChangeQuickRedirect changeQuickRedirect;
    public IALogDepend aLogDepend;
    public Application app;
    public IAppLogDepend appLogDepend;
    public boolean debug;
    public boolean enableBtmPageAnnotation;
    public boolean enableErrorDialog;
    public IExecutorDepend executorDepend;
    public boolean hasLancet;
    public ILogDepend logDepend;
    public IMonitorDepend monitorDepend;
    public ISettingDepend settingDepend;
    public String[] appIds = new String[0];
    public String defaultA = "";
    public boolean enableDebugCrash = true;
    public String deviceId = "";

    static {
        Covode.recordClassIndex(11321);
    }

    public final IALogDepend getALogDepend() {
        return this.aLogDepend;
    }

    public final Application getApp() {
        return this.app;
    }

    public final String[] getAppIds() {
        return this.appIds;
    }

    public final IAppLogDepend getAppLogDepend() {
        return this.appLogDepend;
    }

    public final boolean getDebug() {
        return this.debug;
    }

    public final String getDefaultA() {
        return this.defaultA;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final boolean getEnableBtmPageAnnotation() {
        return this.enableBtmPageAnnotation;
    }

    public final boolean getEnableDebugCrash() {
        return this.enableDebugCrash;
    }

    public final boolean getEnableErrorDialog() {
        return this.enableErrorDialog;
    }

    public final IExecutorDepend getExecutorDepend() {
        return this.executorDepend;
    }

    public final boolean getHasLancet() {
        return this.hasLancet;
    }

    public final ILogDepend getLogDepend() {
        return this.logDepend;
    }

    public final IMonitorDepend getMonitorDepend() {
        return this.monitorDepend;
    }

    public final ISettingDepend getSettingDepend() {
        return this.settingDepend;
    }

    public final void setALogDepend(IALogDepend iALogDepend) {
        this.aLogDepend = iALogDepend;
    }

    public final void setApp(Application application) {
        this.app = application;
    }

    public final void setAppLogDepend(IAppLogDepend iAppLogDepend) {
        this.appLogDepend = iAppLogDepend;
    }

    public final void setDebug(boolean z) {
        this.debug = z;
    }

    public final void setEnableBtmPageAnnotation(boolean z) {
        this.enableBtmPageAnnotation = z;
    }

    public final void setEnableDebugCrash(boolean z) {
        this.enableDebugCrash = z;
    }

    public final void setEnableErrorDialog(boolean z) {
        this.enableErrorDialog = z;
    }

    public final void setExecutorDepend(IExecutorDepend iExecutorDepend) {
        this.executorDepend = iExecutorDepend;
    }

    public final void setHasLancet(boolean z) {
        this.hasLancet = z;
    }

    public final void setLogDepend(ILogDepend iLogDepend) {
        this.logDepend = iLogDepend;
    }

    public final void setMonitorDepend(IMonitorDepend iMonitorDepend) {
        this.monitorDepend = iMonitorDepend;
    }

    public final void setSettingDepend(ISettingDepend iSettingDepend) {
        this.settingDepend = iSettingDepend;
    }

    public final void setAppIds(String[] strArr) {
        if (PatchProxy.proxy(new Object[]{strArr}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ((Object) strArr);
        this.appIds = strArr;
    }

    public final void setDefaultA(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.defaultA = str;
    }

    public final void setDeviceId(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.deviceId = str;
    }
}
