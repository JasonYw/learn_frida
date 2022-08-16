package com.amap.api.location;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.loc.C15909d;
import com.loc.C15968ej;
import com.loc.C15972en;
import com.loc.C16005n;
import org.json.JSONObject;

/* loaded from: classes19.dex */
public class AMapLocationClient {

    /* renamed from: a */
    public Context f22586a;

    /* renamed from: b */
    public C15909d f22587b;

    static {
        Covode.recordClassIndex(4988);
    }

    public AMapLocationClient(Context context) {
        try {
            if (context == null) {
                throw new IllegalArgumentException("Context参数不能为null");
            }
            this.f22586a = context.getApplicationContext();
            this.f22587b = new C15909d(context, null, null);
        } catch (Throwable th) {
            C15968ej.m10694a(th, "AMClt", "ne1");
        }
    }

    public AMapLocationClient(Context context, Intent intent) {
        try {
            if (context == null) {
                throw new IllegalArgumentException("Context参数不能为null");
            }
            this.f22586a = context.getApplicationContext();
            this.f22587b = new C15909d(this.f22586a, intent, null);
        } catch (Throwable th) {
            C15968ej.m10694a(th, "AMClt", "ne2");
        }
    }

    public AMapLocationClient(Looper looper, Context context) {
        try {
            if (context == null) {
                throw new IllegalArgumentException("Context参数不能为null");
            }
            this.f22586a = context.getApplicationContext();
            this.f22587b = new C15909d(this.f22586a, null, looper);
        } catch (Throwable th) {
            C15968ej.m10694a(th, "AMClt", "ne3");
        }
    }

    public static String getDeviceId(Context context) {
        return C16005n.m10396y(context);
    }

    public static void setApiKey(String str) {
        try {
            AMapLocationClientOption.f22588a = str;
        } catch (Throwable th) {
            C15968ej.m10694a(th, "AMClt", "sKey");
        }
    }

    public void disableBackgroundLocation(boolean z) {
        try {
            if (this.f22587b == null) {
                return;
            }
            this.f22587b.m11101a(z);
        } catch (Throwable th) {
            C15968ej.m10694a(th, "AMClt", "dBackL");
        }
    }

    public void enableBackgroundLocation(int i, Notification notification) {
        try {
            if (this.f22587b == null) {
                return;
            }
            this.f22587b.m11120a(i, notification);
        } catch (Throwable th) {
            C15968ej.m10694a(th, "AMClt", "eBackL");
        }
    }

    public AMapLocation getLastKnownLocation() {
        try {
            if (this.f22587b == null) {
                return null;
            }
            return this.f22587b.m11086e();
        } catch (Throwable th) {
            C15968ej.m10694a(th, "AMClt", "gLastL");
            return null;
        }
    }

    public String getVersion() {
        return "5.2.0";
    }

    public boolean isStarted() {
        try {
            if (this.f22587b == null) {
                return false;
            }
            return this.f22587b.m11122a();
        } catch (Throwable th) {
            C15968ej.m10694a(th, "AMClt", "isS");
            return false;
        }
    }

    public void onDestroy() {
        try {
            if (this.f22587b == null) {
                return;
            }
            this.f22587b.m11089d();
        } catch (Throwable th) {
            C15968ej.m10694a(th, "AMClt", "onDy");
        }
    }

    public void setLocationListener(AMapLocationListener aMapLocationListener) {
        try {
            if (aMapLocationListener == null) {
                throw new IllegalArgumentException("listener参数不能为null");
            }
            if (this.f22587b == null) {
                return;
            }
            this.f22587b.m11111a(aMapLocationListener);
        } catch (Throwable th) {
            C15968ej.m10694a(th, "AMClt", "sLocL");
        }
    }

    public void setLocationOption(AMapLocationClientOption aMapLocationClientOption) {
        try {
            if (aMapLocationClientOption == null) {
                throw new IllegalArgumentException("LocationManagerOption参数不能为null");
            }
            if (this.f22587b != null) {
                this.f22587b.m11112a(aMapLocationClientOption);
            }
            if (!aMapLocationClientOption.f22596b) {
                return;
            }
            aMapLocationClientOption.f22596b = false;
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(aMapLocationClientOption.f22597c)) {
                jSONObject.put("amap_loc_scenes_type", aMapLocationClientOption.f22597c);
            }
            C15972en.m10662a(this.f22586a, "O019", jSONObject);
        } catch (Throwable th) {
            C15968ej.m10694a(th, "AMClt", "sLocnO");
        }
    }

    public void startAssistantLocation() {
        try {
            if (this.f22587b == null) {
                return;
            }
            this.f22587b.m11084f();
        } catch (Throwable th) {
            C15968ej.m10694a(th, "AMClt", "stAssLo");
        }
    }

    public void startAssistantLocation(WebView webView) {
        try {
            if (this.f22587b == null) {
                return;
            }
            this.f22587b.m11114a(webView);
        } catch (Throwable th) {
            C15968ej.m10694a(th, "AMClt", "sttAssL1");
        }
    }

    public void startLocation() {
        try {
            if (this.f22587b == null) {
                return;
            }
            this.f22587b.m11100b();
        } catch (Throwable th) {
            C15968ej.m10694a(th, "AMClt", "stl");
        }
    }

    public void stopAssistantLocation() {
        try {
            if (this.f22587b == null) {
                return;
            }
            this.f22587b.m11082g();
        } catch (Throwable th) {
            C15968ej.m10694a(th, "AMClt", "stAssL");
        }
    }

    public void stopLocation() {
        try {
            if (this.f22587b == null) {
                return;
            }
            this.f22587b.m11092c();
        } catch (Throwable th) {
            C15968ej.m10694a(th, "AMClt", "stl");
        }
    }

    public void unRegisterLocationListener(AMapLocationListener aMapLocationListener) {
        try {
            if (this.f22587b == null) {
                return;
            }
            this.f22587b.m11099b(aMapLocationListener);
        } catch (Throwable th) {
            C15968ej.m10694a(th, "AMClt", "unRL");
        }
    }
}
