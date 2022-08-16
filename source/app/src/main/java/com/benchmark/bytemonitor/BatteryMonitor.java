package com.benchmark.bytemonitor;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C116971W2r;

/* loaded from: classes26.dex */
public class BatteryMonitor {
    public static ChangeQuickRedirect changeQuickRedirect;
    public Context mContext;
    public int temperature = -1;
    public double batteryLevel = -1.0d;

    static {
        Covode.recordClassIndex(9630);
    }

    public double getBatteryLevel() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return ((Double) proxy.result).doubleValue();
        }
        getBattery();
        return this.batteryLevel;
    }

    public double getTemperature() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return ((Double) proxy.result).doubleValue();
        }
        getBattery();
        return this.temperature / 10.0d;
    }

    private void getBattery() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        try {
            Intent LIZ = C116971W2r.LIZ(this.mContext, (BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (LIZ != null) {
                int intExtra = LIZ.getIntExtra("level", -1);
                int intExtra2 = LIZ.getIntExtra("scale", -1);
                if (intExtra != -1 && intExtra2 != -1) {
                    if (intExtra2 != 0) {
                        this.batteryLevel = (intExtra / intExtra2) * 100.0d;
                    } else {
                        this.batteryLevel = 0.0d;
                    }
                }
                this.temperature = LIZ.getIntExtra("temperature", -1);
            }
        } catch (Exception unused) {
        }
    }

    public BatteryMonitor(Context context) {
        this.mContext = context;
    }
}
