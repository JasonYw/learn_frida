package cn.com.chinatelecom.account.api.p037d;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import cn.com.chinatelecom.account.api.CtAuth;
import cn.com.chinatelecom.account.api.p036c.C0645f;
import cn.com.chinatelecom.account.api.p038e.C0669d;
import cn.com.chinatelecom.account.api.p038e.C0673h;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.umeng.message.proguard.C34037f;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import p003X.C116971W2r;

/* renamed from: cn.com.chinatelecom.account.api.d.f */
/* loaded from: classes2.dex */
public abstract class AbstractC0661f implements AbstractC0660e {

    /* renamed from: b */
    public static final String f20961b = AbstractC0661f.class.getSimpleName();

    /* renamed from: a */
    public Context f20962a;

    static {
        Covode.recordClassIndex(2712);
    }

    public AbstractC0661f(Context context) {
        this.f20962a = context;
    }

    /* renamed from: a */
    public static void m20680a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (C116971W2r.LIZ(connectivityManager, 5).getState().compareTo(NetworkInfo.State.CONNECTED) != 0) {
                return;
            }
            ((Boolean) C116971W2r.LIZ("android.net.ConnectivityManager").getMethod("requestRouteToHost", Integer.TYPE, Integer.TYPE).invoke(connectivityManager, 5, Integer.valueOf(C0645f.m20705a(C0645f.m20702b(str))))).booleanValue();
        } catch (Throwable th) {
            CtAuth.warn(f20961b, "http doPost > requestUrlToRoute error", th);
        }
    }

    /* renamed from: a */
    public static boolean m20681a() {
        int i = Build.VERSION.SDK_INT;
        return true;
    }

    /* renamed from: b */
    public final HttpURLConnection m20679b(String str, String str2, int i, C0662g c0662g) {
        MethodCollector.m14708i(181);
        URL url = new URL(str);
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((c0662g.f20963a == null || !m20681a()) ? C116971W2r.LIZ(url) : c0662g.f20963a.openConnection(url));
        C116971W2r.LIZ(httpURLConnection, "accept", "*/*");
        if (i == 0) {
            httpURLConnection.setRequestMethod("GET");
        } else {
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setDoInput(true);
        }
        httpURLConnection.setConnectTimeout(c0662g.m20677a());
        httpURLConnection.setReadTimeout(c0662g.m20676b());
        httpURLConnection.setUseCaches(false);
        if (!C0673h.m20594b(this.f20962a) && !m20681a()) {
            httpURLConnection.setInstanceFollowRedirects(false);
        }
        C116971W2r.LIZIZ(httpURLConnection, "Accept-Charset", C34037f.f43302f);
        C116971W2r.LIZIZ(httpURLConnection, "reqId", c0662g.f20966d);
        C116971W2r.LIZIZ(httpURLConnection, "deviceId", C0669d.m20637a(this.f20962a));
        if (!TextUtils.isEmpty(str2)) {
            DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(httpURLConnection.getOutputStream()));
            dataOutputStream.write(str2.getBytes(C34037f.f43302f));
            dataOutputStream.flush();
            dataOutputStream.close();
        } else {
            httpURLConnection.connect();
        }
        MethodCollector.m14707o(181);
        return httpURLConnection;
    }

    /* renamed from: c */
    public final HttpsURLConnection m20678c(String str, String str2, int i, C0662g c0662g) {
        MethodCollector.m14708i(182);
        URL url = new URL(str);
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) ((c0662g.f20963a == null || !m20681a()) ? C116971W2r.LIZ(url) : c0662g.f20963a.openConnection(url));
        C116971W2r.LIZ(httpsURLConnection, "accept", "*/*");
        if (i == 0) {
            httpsURLConnection.setRequestMethod("GET");
        } else {
            httpsURLConnection.setRequestMethod("POST");
            httpsURLConnection.setDoOutput(true);
            httpsURLConnection.setDoInput(true);
        }
        httpsURLConnection.setConnectTimeout(c0662g.m20677a());
        httpsURLConnection.setReadTimeout(c0662g.m20676b());
        httpsURLConnection.setUseCaches(false);
        if (!C0673h.m20594b(this.f20962a) && !m20681a()) {
            httpsURLConnection.setInstanceFollowRedirects(false);
        }
        C116971W2r.LIZIZ(httpsURLConnection, "Accept-Charset", C34037f.f43302f);
        C116971W2r.LIZIZ(httpsURLConnection, "reqId", c0662g.f20966d);
        C116971W2r.LIZIZ(httpsURLConnection, "deviceId", C0669d.m20637a(this.f20962a));
        if (c0662g.f20971i != null && !c0662g.f20971i.isEmpty()) {
            for (Map.Entry entry : c0662g.f20971i.entrySet()) {
                C116971W2r.LIZIZ(httpsURLConnection, (String) entry.getKey(), (String) entry.getValue());
            }
        }
        if (!TextUtils.isEmpty(str2)) {
            DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(httpsURLConnection.getOutputStream()));
            dataOutputStream.write(str2.getBytes(C34037f.f43302f));
            dataOutputStream.flush();
            dataOutputStream.close();
        } else {
            httpsURLConnection.connect();
        }
        MethodCollector.m14707o(182);
        return httpsURLConnection;
    }
}
