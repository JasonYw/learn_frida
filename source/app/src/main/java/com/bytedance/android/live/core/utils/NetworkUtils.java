package com.bytedance.android.live.core.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import androidx.core.view.MotionEventCompat;
import com.bytedance.android.live.core.setting.LiveInfraSettingKeys;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.bpea.entry.api.device.info.TelephonyManagerEntry;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.Intrinsics;
import p003X.AnonymousClass425;
import p003X.C116971W2r;
import p003X.C76536GFm;

/* loaded from: classes8.dex */
public final class NetworkUtils {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(23817);
        TokenCert.with("bpea-live_networkutils_get_network_type");
        TokenCert.with("bpea-live_networkutils_get_network_operator");
    }

    /* loaded from: classes5.dex */
    public enum NetworkType {
        NONE(0),
        MOBILE(1),
        MOBILE_2G(2),
        MOBILE_3G(3),
        WIFI(4),
        MOBILE_4G(5),
        MOBILE_5G(6);
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public final int nativeInt;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static NetworkType[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            if (proxy.isSupported) {
                return (NetworkType[]) proxy.result;
            }
            return (NetworkType[]) values().clone();
        }

        static {
            Covode.recordClassIndex(23819);
        }

        public static NetworkType valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (NetworkType) proxy.result;
            }
            return (NetworkType) Enum.valueOf(NetworkType.class, str);
        }

        NetworkType(int i) {
            this.nativeInt = i;
        }
    }

    public static boolean LIZ(Context context) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context}, null, LIZ, true, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        try {
            NetworkInfo LIZ2 = C116971W2r.LIZ((ConnectivityManager) context.getSystemService("connectivity"));
            if (LIZ2 != null && LIZ2.isAvailable()) {
                if (1 == LIZ2.getType()) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static String LIZ(NetworkType networkType) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{networkType}, null, LIZ, true, 6);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        try {
            switch (networkType) {
                case WIFI:
                    return "wifi";
                case MOBILE_2G:
                    return "2g";
                case MOBILE_3G:
                    return "3g";
                case MOBILE_4G:
                    return "4g";
                case MOBILE_5G:
                    return "5g";
                case MOBILE:
                    return "mobile";
                default:
                    return "";
            }
        } catch (Exception unused) {
            return "";
        }
    }

    public static boolean LIZIZ(Context context) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context}, null, LIZ, true, 7);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        try {
            NetworkInfo LIZ2 = C116971W2r.LIZ((ConnectivityManager) context.getSystemService("connectivity"));
            if (LIZ2 != null) {
                if (LIZ2.isAvailable()) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static String LIZIZ(Context context, Cert cert) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, cert}, null, LIZ, true, 3);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return LIZ(LIZJ(context, cert));
    }

    public static boolean LIZ(Context context, Cert cert) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, cert}, null, LIZ, true, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        NetworkType LIZJ = LIZJ(context, cert);
        if (NetworkType.MOBILE_2G != LIZJ && NetworkType.MOBILE_3G != LIZJ && NetworkType.MOBILE_4G != LIZJ && NetworkType.MOBILE_5G != LIZJ && NetworkType.MOBILE != LIZJ) {
            return false;
        }
        return true;
    }

    public static NetworkType LIZJ(Context context, Cert cert) {
        Integer valueOf;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, cert}, null, LIZ, true, 4);
        if (proxy.isSupported) {
            return (NetworkType) proxy.result;
        }
        try {
            NetworkInfo LIZ2 = C116971W2r.LIZ((ConnectivityManager) context.getSystemService("connectivity"));
            if (LIZ2 != null && LIZ2.isAvailable()) {
                int type = LIZ2.getType();
                if (1 == type) {
                    return NetworkType.WIFI;
                }
                if (type == 0) {
                    PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{cert}, null, C76536GFm.LIZ, true, 1);
                    if (proxy2.isSupported) {
                        valueOf = (Integer) proxy2.result;
                    } else {
                        Object systemService = AnonymousClass425.LIZ().getSystemService("phone");
                        if (systemService != null) {
                            TelephonyManager telephonyManager = (TelephonyManager) systemService;
                            SettingKey<Boolean> settingKey = LiveInfraSettingKeys.LIVE_BPEA_SWITCH;
                            Intrinsics.checkNotNullExpressionValue(settingKey, "");
                            Boolean value = settingKey.getValue();
                            Intrinsics.checkNotNullExpressionValue(value, "");
                            if (value.booleanValue()) {
                                valueOf = TelephonyManagerEntry.Companion.getNetworkType(telephonyManager, cert);
                            } else {
                                valueOf = Integer.valueOf(C116971W2r.LIZ(telephonyManager));
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.telephony.TelephonyManager");
                        }
                    }
                    if (valueOf == null) {
                        return NetworkType.MOBILE;
                    }
                    int intValue = valueOf.intValue();
                    if (intValue != 20) {
                        switch (intValue) {
                            case 1:
                            case 2:
                            case 4:
                            case 7:
                            case 11:
                                return NetworkType.MOBILE_2G;
                            case 3:
                            case 5:
                            case 6:
                            case 8:
                            case 9:
                            case 10:
                            case 12:
                            case 14:
                            case MotionEventCompat.AXIS_HAT_X /* 15 */:
                                return NetworkType.MOBILE_3G;
                            case 13:
                                return NetworkType.MOBILE_4G;
                            default:
                                return NetworkType.MOBILE;
                        }
                    }
                    return NetworkType.MOBILE_5G;
                }
                return NetworkType.MOBILE;
            }
            return NetworkType.NONE;
        } catch (Throwable unused) {
            return NetworkType.MOBILE;
        }
    }
}
