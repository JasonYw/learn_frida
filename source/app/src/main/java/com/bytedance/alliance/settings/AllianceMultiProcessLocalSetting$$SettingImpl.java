package com.bytedance.alliance.settings;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.push.settings.IDataChangedListener;
import com.bytedance.push.settings.storage.AbstractC13886i;

/* loaded from: classes2.dex */
public class AllianceMultiProcessLocalSetting$$SettingImpl implements AllianceMultiProcessLocalSetting {
    public static ChangeQuickRedirect LIZ;
    public AbstractC13886i LIZIZ;

    static {
        Covode.recordClassIndex(10007);
    }

    @Override // com.bytedance.alliance.settings.AllianceMultiProcessLocalSetting
    public final String LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        AbstractC13886i abstractC13886i = this.LIZIZ;
        if (abstractC13886i != null && abstractC13886i.LJFF("waked_by_activity_app_list")) {
            return this.LIZIZ.LIZ("waked_by_activity_app_list");
        }
        return "";
    }

    @Override // com.bytedance.alliance.settings.AllianceMultiProcessLocalSetting
    public final String LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        AbstractC13886i abstractC13886i = this.LIZIZ;
        if (abstractC13886i != null && abstractC13886i.LJFF("to_wake_up_by_activity_list")) {
            return this.LIZIZ.LIZ("to_wake_up_by_activity_list");
        }
        return "";
    }

    @Override // com.bytedance.alliance.settings.AllianceMultiProcessLocalSetting
    public final boolean LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        AbstractC13886i abstractC13886i = this.LIZIZ;
        if (abstractC13886i == null || !abstractC13886i.LJFF("enable_hook_start_activity")) {
            return false;
        }
        return this.LIZIZ.mo14285LJ("enable_hook_start_activity");
    }

    @Override // com.bytedance.alliance.settings.AllianceMultiProcessLocalSetting
    public final boolean LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        AbstractC13886i abstractC13886i = this.LIZIZ;
        if (abstractC13886i == null || !abstractC13886i.LJFF("enable_hook_activity_task_manager")) {
            return false;
        }
        return this.LIZIZ.mo14285LJ("enable_hook_activity_task_manager");
    }

    @Override // com.bytedance.push.settings.ILocalSettings
    public void unregisterValChanged(IDataChangedListener iDataChangedListener) {
        AbstractC13886i abstractC13886i;
        if (!PatchProxy.proxy(new Object[]{iDataChangedListener}, this, LIZ, false, 10).isSupported && (abstractC13886i = this.LIZIZ) != null) {
            abstractC13886i.LIZ(iDataChangedListener);
        }
    }

    @Override // com.bytedance.alliance.settings.AllianceMultiProcessLocalSetting
    public final void LIZ(String str) {
        AbstractC13886i abstractC13886i;
        if (!PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 2).isSupported && (abstractC13886i = this.LIZIZ) != null) {
            SharedPreferences.Editor LIZ2 = abstractC13886i.LIZ();
            LIZ2.putString("waked_by_activity_app_list", str);
            LIZ2.apply();
        }
    }

    @Override // com.bytedance.alliance.settings.AllianceMultiProcessLocalSetting
    public final void LIZIZ(String str) {
        AbstractC13886i abstractC13886i;
        if (!PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 4).isSupported && (abstractC13886i = this.LIZIZ) != null) {
            SharedPreferences.Editor LIZ2 = abstractC13886i.LIZ();
            LIZ2.putString("to_wake_up_by_activity_list", str);
            LIZ2.apply();
        }
    }

    @Override // com.bytedance.alliance.settings.AllianceMultiProcessLocalSetting
    public final void LIZ(boolean z) {
        AbstractC13886i abstractC13886i;
        if (!PatchProxy.proxy(new Object[]{(byte) 1}, this, LIZ, false, 6).isSupported && (abstractC13886i = this.LIZIZ) != null) {
            SharedPreferences.Editor LIZ2 = abstractC13886i.LIZ();
            LIZ2.putBoolean("enable_hook_start_activity", true);
            LIZ2.apply();
        }
    }

    @Override // com.bytedance.alliance.settings.AllianceMultiProcessLocalSetting
    public final void LIZIZ(boolean z) {
        AbstractC13886i abstractC13886i;
        if (!PatchProxy.proxy(new Object[]{(byte) 1}, this, LIZ, false, 8).isSupported && (abstractC13886i = this.LIZIZ) != null) {
            SharedPreferences.Editor LIZ2 = abstractC13886i.LIZ();
            LIZ2.putBoolean("enable_hook_activity_task_manager", true);
            LIZ2.apply();
        }
    }

    public AllianceMultiProcessLocalSetting$$SettingImpl(Context context, AbstractC13886i abstractC13886i) {
        this.LIZIZ = abstractC13886i;
    }

    @Override // com.bytedance.push.settings.ILocalSettings
    public void registerValChanged(Context context, String str, String str2, IDataChangedListener iDataChangedListener) {
        AbstractC13886i abstractC13886i;
        if (!PatchProxy.proxy(new Object[]{context, str, str2, iDataChangedListener}, this, LIZ, false, 9).isSupported && (abstractC13886i = this.LIZIZ) != null) {
            abstractC13886i.LIZ(context, str, str2, iDataChangedListener);
        }
    }
}
