package cn.com.chinatelecom.account.api;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import cn.com.chinatelecom.account.api.p034a.C0632d;
import cn.com.chinatelecom.account.api.p035b.AbstractC0634a;
import cn.com.chinatelecom.account.api.p035b.C0635b;
import cn.com.chinatelecom.account.api.p036c.C0640a;
import cn.com.chinatelecom.account.api.p037d.C0658c;
import cn.com.chinatelecom.account.api.p038e.C0667b;
import cn.com.chinatelecom.account.api.p038e.C0673h;
import cn.com.chinatelecom.account.api.p038e.C0676k;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class CtAuth {
    public static volatile CtAuth instance;
    public static Context mContext;
    public static TraceLogger mTraceLogger;
    public static final String TAG = CtAuth.class.getSimpleName();
    public static String mAppId = "";
    public static String mAppSecret = "";
    public static boolean isInit = false;
    public static Handler mHandler = new Handler(Looper.getMainLooper());

    static {
        Covode.recordClassIndex(2674);
    }

    public static CtAuth getInstance() {
        MethodCollector.m14708i(168);
        if (instance == null) {
            synchronized (CtAuth.class) {
                try {
                    if (instance == null) {
                        instance = new CtAuth();
                    }
                } catch (Throwable th) {
                    MethodCollector.m14707o(168);
                    throw th;
                }
            }
        }
        CtAuth ctAuth = instance;
        MethodCollector.m14707o(168);
        return ctAuth;
    }

    public static void info(String str, String str2) {
        if (mTraceLogger != null) {
            mTraceLogger.info("CT_".concat(String.valueOf(str)), str2);
        }
    }

    public static void postResultOnMainThread(String str, JSONObject jSONObject, ResultListener resultListener) {
        mHandler.post(new RunnableC0655d(resultListener, str, jSONObject));
    }

    public static void warn(String str, String str2, Throwable th) {
        if (mTraceLogger != null) {
            mTraceLogger.warn("CT_".concat(String.valueOf(str)), str2, th);
        }
    }

    public Context getContext() {
        return mContext;
    }

    public String getOperatorType() {
        Context context = mContext;
        if (context != null) {
            return C0673h.m20596a(context, false);
        }
        throw new IllegalArgumentException("Please call the init method");
    }

    public void getPreCodeParamsByJs(String str, AbstractC0634a abstractC0634a) {
        info(TAG, "called getPreCodeParamsByJs()");
        if (abstractC0634a == null) {
            return;
        }
        if (mContext == null || TextUtils.isEmpty(mAppId) || TextUtils.isEmpty(mAppSecret)) {
            abstractC0634a.callbackPreCodeParams(C0676k.m20571e().toString());
            return;
        }
        new C0635b();
        C0635b.m20728a(str, abstractC0634a);
    }

    public void init(Context context, String str, String str2, TraceLogger traceLogger) {
        if (context != null) {
            if (str == null) {
                throw new IllegalArgumentException("appId must not be null!");
            }
            if (str2 == null) {
                throw new IllegalArgumentException("appSecret must not be null!");
            }
            if (!(context instanceof Application)) {
                context = context.getApplicationContext();
            }
            mContext = context;
            C0658c.m20689a(mContext);
            mAppId = str;
            mAppSecret = str2;
            mTraceLogger = traceLogger;
            return;
        }
        throw new IllegalArgumentException("context must not be null!");
    }

    public boolean isMobileDataEnabled() {
        Context context = mContext;
        if (context != null) {
            return C0673h.m20592c(context);
        }
        throw new IllegalArgumentException("Please call the init method");
    }

    public void requestPreCode(CtSetting ctSetting, ResultListener resultListener) {
        requestPreLogin(ctSetting, resultListener);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void requestPreCodeByJs(java.lang.String r5, cn.com.chinatelecom.account.api.p035b.AbstractC0634a r6) {
        /*
            r4 = this;
            java.lang.String r1 = cn.com.chinatelecom.account.api.CtAuth.TAG
            java.lang.String r0 = "called requestPreCodeByJs()"
            info(r1, r0)
            if (r6 != 0) goto La
            return
        La:
            android.content.Context r0 = cn.com.chinatelecom.account.api.CtAuth.mContext
            if (r0 == 0) goto L80
            java.lang.String r0 = cn.com.chinatelecom.account.api.CtAuth.mAppId
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L80
            java.lang.String r0 = cn.com.chinatelecom.account.api.CtAuth.mAppSecret
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L80
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r3 = 0
            if (r0 != 0) goto L3a
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L37
            r2.<init>(r5)     // Catch: java.lang.Exception -> L37
            java.lang.String r0 = "url"
            java.lang.String r1 = r2.optString(r0)     // Catch: java.lang.Exception -> L37
            java.lang.String r0 = "taskId"
            java.lang.String r3 = r2.optString(r0)     // Catch: java.lang.Exception -> L3c
            goto L40
        L37:
            r0 = move-exception
            r1 = r3
            goto L3d
        L3a:
            r1 = r3
            goto L40
        L3c:
            r0 = move-exception
        L3d:
            r0.printStackTrace()
        L40:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L52
            org.json.JSONObject r0 = cn.com.chinatelecom.account.api.p038e.C0676k.m20570f()
            java.lang.String r0 = r0.toString()
            r6.callbackPreCode(r0)
            return
        L52:
            android.content.Context r0 = cn.com.chinatelecom.account.api.CtAuth.mContext
            boolean r0 = cn.com.chinatelecom.account.api.p038e.C0673h.m20594b(r0)
            if (r0 == 0) goto L63
            cn.com.chinatelecom.account.api.b.b r0 = new cn.com.chinatelecom.account.api.b.b
            r0.<init>()
            r0.m20727a(r3, r1, r6)
            return
        L63:
            android.content.Context r0 = cn.com.chinatelecom.account.api.CtAuth.mContext
            boolean r0 = cn.com.chinatelecom.account.api.p038e.C0673h.m20592c(r0)
            if (r0 == 0) goto L74
            cn.com.chinatelecom.account.api.b.b r0 = new cn.com.chinatelecom.account.api.b.b
            r0.<init>()
            r0.m20726b(r3, r1, r6)
            return
        L74:
            org.json.JSONObject r0 = cn.com.chinatelecom.account.api.p038e.C0676k.m20572d()
            java.lang.String r0 = r0.toString()
            r6.callbackPreCode(r0)
            return
        L80:
            org.json.JSONObject r0 = cn.com.chinatelecom.account.api.p038e.C0676k.m20571e()
            java.lang.String r0 = r0.toString()
            r6.callbackPreCode(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.com.chinatelecom.account.api.CtAuth.requestPreCodeByJs(java.lang.String, cn.com.chinatelecom.account.api.b.a):void");
    }

    public void requestPreLogin(CtSetting ctSetting, int i, ResultListener resultListener) {
        info(TAG, "called requestPreLogin()");
        if (resultListener == null) {
            return;
        }
        if (mContext == null || TextUtils.isEmpty(mAppId) || TextUtils.isEmpty(mAppSecret)) {
            postResultOnMainThread(null, C0676k.m20571e(), resultListener);
        } else if (!C0673h.m20597a(mContext)) {
            postResultOnMainThread(null, C0676k.m20578a(), resultListener);
        } else if (C0673h.m20594b(mContext)) {
            new C0640a(mContext, mAppId, mAppSecret).m20719a(C0632d.m20735a(C0667b.f20990a), ctSetting, i, resultListener);
        } else if (C0673h.m20592c(mContext)) {
            new C0640a(mContext, mAppId, mAppSecret).m20716b(C0632d.m20735a(C0667b.f20990a), ctSetting, i, resultListener);
        } else {
            postResultOnMainThread(null, C0676k.m20572d(), resultListener);
        }
    }

    public void requestPreLogin(CtSetting ctSetting, ResultListener resultListener) {
        requestPreLogin(ctSetting, C0665e.f20988a, resultListener);
    }

    public void setDomainName(String str, String str2, String str3) {
        C0673h.f21026a = str;
        C0673h.f21027b = str2;
        C0673h.f21028c = str3;
    }
}
