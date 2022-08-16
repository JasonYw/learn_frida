package com.amap.api.location;

import android.content.Context;
import android.os.Handler;
import com.bytedance.covode.number.Covode;
import com.loc.C15968ej;
import com.loc.C16005n;

/* loaded from: classes19.dex */
public class UmidtokenInfo {

    /* renamed from: d */
    public static AMapLocationClient f22654d;

    /* renamed from: a */
    public static Handler f22651a = new Handler();

    /* renamed from: b */
    public static String f22652b = null;

    /* renamed from: e */
    public static long f22655e = 30000;

    /* renamed from: c */
    public static boolean f22653c = true;

    /* renamed from: com.amap.api.location.UmidtokenInfo$a */
    /* loaded from: classes19.dex */
    public static class C1459a implements AMapLocationListener {
        static {
            Covode.recordClassIndex(5007);
        }

        @Override // com.amap.api.location.AMapLocationListener
        public final void onLocationChanged(AMapLocation aMapLocation) {
            try {
                if (UmidtokenInfo.f22654d == null) {
                    return;
                }
                UmidtokenInfo.f22651a.removeCallbacksAndMessages(null);
                UmidtokenInfo.f22654d.onDestroy();
            } catch (Throwable th) {
                C15968ej.m10694a(th, "UmidListener", "onLocationChanged");
            }
        }
    }

    static {
        Covode.recordClassIndex(5005);
    }

    public static String getUmidtoken() {
        return f22652b;
    }

    public static void setLocAble(boolean z) {
        f22653c = z;
    }

    public static synchronized void setUmidtoken(Context context, String str) {
        synchronized (UmidtokenInfo.class) {
            try {
                f22652b = str;
                C16005n.m10429a(str);
                if (f22654d == null && f22653c) {
                    C1459a c1459a = new C1459a();
                    f22654d = new AMapLocationClient(context);
                    AMapLocationClientOption aMapLocationClientOption = new AMapLocationClientOption();
                    aMapLocationClientOption.setOnceLocation(true);
                    aMapLocationClientOption.setNeedAddress(false);
                    f22654d.setLocationOption(aMapLocationClientOption);
                    f22654d.setLocationListener(c1459a);
                    f22654d.startLocation();
                    f22651a.postDelayed(new Runnable() { // from class: com.amap.api.location.UmidtokenInfo.1
                        static {
                            Covode.recordClassIndex(5006);
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                if (UmidtokenInfo.f22654d == null) {
                                    return;
                                }
                                UmidtokenInfo.f22654d.onDestroy();
                            } catch (Throwable th) {
                                C15968ej.m10694a(th, "UmidListener", "postDelayed");
                            }
                        }
                    }, 30000L);
                }
            } catch (Throwable th) {
                C15968ej.m10694a(th, "UmidListener", "setUmidtoken");
            }
        }
    }
}
