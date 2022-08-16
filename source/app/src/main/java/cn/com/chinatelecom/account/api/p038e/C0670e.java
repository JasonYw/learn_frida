package cn.com.chinatelecom.account.api.p038e;

import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import cn.com.chinatelecom.account.api.ClientUtils;
import cn.com.chinatelecom.account.api.CtAuth;
import com.bytedance.covode.number.Covode;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.AppIconSetting;
import com.meizu.cloud.pushsdk.notification.model.BrightRemindSetting;
import com.meizu.cloud.pushsdk.notification.model.NotificationStyle;
import com.umeng.message.common.C34000b;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: cn.com.chinatelecom.account.api.e.e */
/* loaded from: classes2.dex */
public final class C0670e {

    /* renamed from: l */
    public String f21010l;

    /* renamed from: o */
    public int f21013o;

    /* renamed from: q */
    public long f21015q;

    /* renamed from: t */
    public int f21018t;

    /* renamed from: w */
    public long f21021w;

    /* renamed from: r */
    public long f21016r = -1;

    /* renamed from: u */
    public StringBuffer f21019u = new StringBuffer();

    /* renamed from: c */
    public String f21001c = "";

    /* renamed from: e */
    public String f21003e = "";

    /* renamed from: n */
    public String f21012n = "";

    /* renamed from: m */
    public String f21011m = "";

    /* renamed from: p */
    public String f21014p = "";

    /* renamed from: a */
    public String f20999a = "1.2";

    /* renamed from: v */
    public long f21020v = SystemClock.uptimeMillis();

    /* renamed from: b */
    public String f21000b = m20612b(System.currentTimeMillis());

    /* renamed from: d */
    public String f21002d = CtAuth.mAppId;

    /* renamed from: f */
    public String f21004f = "";

    /* renamed from: g */
    public String f21005g = Build.BRAND;

    /* renamed from: h */
    public String f21006h = Build.MODEL;

    /* renamed from: i */
    public String f21007i = C34000b.f43053g;

    /* renamed from: j */
    public String f21008j = Build.VERSION.RELEASE;

    /* renamed from: k */
    public String f21009k = ClientUtils.getSdkVersion();

    /* renamed from: s */
    public String f21017s = "0";

    static {
        Covode.recordClassIndex(2721);
    }

    public C0670e(String str) {
        this.f21010l = str;
    }

    /* renamed from: b */
    public static String m20612b(long j) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.CHINA).format(new Date(j));
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    /* renamed from: a */
    public final C0670e m20617a(int i) {
        this.f21013o = i;
        return this;
    }

    /* renamed from: a */
    public final C0670e m20616a(long j) {
        if (j > 0) {
            this.f21015q = j;
        }
        return this;
    }

    /* renamed from: a */
    public final C0670e m20615a(String str) {
        this.f21003e = str;
        return this;
    }

    /* renamed from: a */
    public final String m20618a() {
        return this.f21010l;
    }

    /* renamed from: b */
    public final C0670e m20613b(int i) {
        this.f21018t = i;
        return this;
    }

    /* renamed from: b */
    public final C0670e m20611b(String str) {
        this.f21004f = str;
        return this;
    }

    /* renamed from: b */
    public final void m20614b() {
        this.f21021w = SystemClock.uptimeMillis();
        if (this.f21016r == -1) {
            this.f21016r = this.f21021w - this.f21020v;
        }
    }

    /* renamed from: c */
    public final C0670e m20610c(String str) {
        this.f21011m = str;
        return this;
    }

    /* renamed from: d */
    public final C0670e m20609d(String str) {
        this.f21012n = str;
        return this;
    }

    /* renamed from: e */
    public final C0670e m20608e(String str) {
        this.f21014p = str;
        return this;
    }

    /* renamed from: f */
    public final C0670e m20607f(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f21017s = str;
        }
        return this;
    }

    /* renamed from: g */
    public final C0670e m20606g(String str) {
        if (!TextUtils.isEmpty(str)) {
            StringBuffer stringBuffer = this.f21019u;
            stringBuffer.append(str);
            stringBuffer.append(";");
        }
        return this;
    }

    public final String toString() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("v", this.f20999a);
            jSONObject.put("t", this.f21000b);
            jSONObject.put("tag", this.f21001c);
            jSONObject.put("ai", this.f21002d);
            jSONObject.put(AppIconSetting.DEFAULT_LARGE_ICON, this.f21003e);
            jSONObject.put(NotificationStyle.NOTIFICATION_STYLE, this.f21004f);
            jSONObject.put(BrightRemindSetting.BRIGHT_REMIND, this.f21005g);
            jSONObject.put("ml", this.f21006h);
            jSONObject.put("os", this.f21007i);
            jSONObject.put("ov", this.f21008j);
            jSONObject.put("sv", this.f21009k);
            jSONObject.put("ri", this.f21010l);
            jSONObject.put("api", this.f21011m);
            jSONObject.put("p", this.f21012n);
            jSONObject.put("rt", this.f21013o);
            jSONObject.put("msg", this.f21014p);
            jSONObject.put("st", this.f21015q);
            jSONObject.put(PushConstants.PUSH_NOTIFICATION_CREATE_TIMES_TAMP, this.f21016r);
            jSONObject.put("ot", this.f21017s);
            jSONObject.put("rec", this.f21018t);
            jSONObject.put("ep", this.f21019u.toString());
            return jSONObject.toString();
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }
}
