package com.byted.mgl.service.api.privacy.device;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import android.webkit.CookieManager;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* loaded from: classes26.dex */
public interface IPrivacyDeviceInfo {
    static {
        Covode.recordClassIndex(9801);
    }

    String getBSSID(WifiInfo wifiInfo, String str);

    List<WifiConfiguration> getConfiguredNetworks(WifiManager wifiManager, String str);

    WifiInfo getConnectionInfo(WifiManager wifiManager, String str);

    String getCookie(CookieManager cookieManager, String str, String str2);

    Sensor getDefaultSensor(SensorManager sensorManager, int i, String str);

    String getExtraInfo(NetworkInfo networkInfo, String str);

    String getNetworkOperator(TelephonyManager telephonyManager, String str);

    String getNetworkOperatorName(TelephonyManager telephonyManager, String str);

    int getNetworkType(TelephonyManager telephonyManager, String str);

    String getSSID(WifiInfo wifiInfo, String str);

    List<ScanResult> getScanResults(WifiManager wifiManager, String str);

    void setCookie(CookieManager cookieManager, String str, String str2, String str3);

    boolean startScan(WifiManager wifiManager, String str);
}
