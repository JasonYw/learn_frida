package com.alibaba.p052a.p053a;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.alibaba.p052a.p053a.p054a.EnumC0877f;
import com.alibaba.p052a.p053a.p057d.C0907j;
import com.alibaba.p052a.p061b.C0941a;
import com.alibaba.p052a.p061b.p065d.C0960b;
import com.alibaba.p052a.p061b.p065d.C0974i;
import com.alibaba.p052a.p061b.p065d.C0989s;
import com.bytedance.covode.number.Covode;
import com.xiaomi.mipush.sdk.Constants;

/* renamed from: com.alibaba.a.a.i */
/* loaded from: classes13.dex */
public class RunnableC0937i implements Runnable {

    /* renamed from: a */
    public static boolean f21259a;

    /* renamed from: d */
    public static boolean f21260d;

    /* renamed from: b */
    public Application f21261b;

    /* renamed from: c */
    public boolean f21262c = true;

    /* renamed from: com.alibaba.a.a.i$a */
    /* loaded from: classes13.dex */
    public class C0938a implements Application.ActivityLifecycleCallbacks {

        /* renamed from: b */
        public Runnable f21264b;

        static {
            Covode.recordClassIndex(4248);
        }

        public C0938a(Runnable runnable) {
            this.f21264b = runnable;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            C0989s.m20062a().m20061a(4);
            C0989s.m20062a().m20059a(4, this.f21264b, 60000L);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            C0989s.m20062a().m20061a(4);
            C0989s.m20062a().m20059a(4, this.f21264b, 60000L);
        }
    }

    static {
        Covode.recordClassIndex(4247);
    }

    public RunnableC0937i(Application application) {
        this.f21261b = application;
    }

    /* renamed from: a */
    public static void m20248a(Application application) {
        if (!f21259a) {
            C0974i.m20098a("BackgroundTrigger", "init BackgroundTrigger");
            f21260d = m20247a(application.getApplicationContext());
            RunnableC0937i runnableC0937i = new RunnableC0937i(application);
            if (f21260d) {
                C0989s.m20062a().m20059a(4, runnableC0937i, 60000L);
            } else {
                int i = Build.VERSION.SDK_INT;
                runnableC0937i.getClass();
                application.registerActivityLifecycleCallbacks(new C0938a(runnableC0937i));
            }
            f21259a = true;
        }
    }

    /* renamed from: a */
    public static boolean m20247a(Context context) {
        String m20138b = C0960b.m20138b(context);
        C0974i.m20098a("BackgroundTrigger", "[checkRuningProcess]:", m20138b);
        return !TextUtils.isEmpty(m20138b) && m20138b.indexOf(Constants.COLON_SEPARATOR) != -1;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i = 0;
        C0974i.m20098a("BackgroundTrigger", "[bg check]");
        boolean m20141a = C0960b.m20141a(this.f21261b.getApplicationContext());
        if (this.f21262c != m20141a) {
            this.f21262c = m20141a;
            if (m20141a) {
                C0907j.m20393a().m20386b();
                EnumC0877f[] values = EnumC0877f.values();
                int length = values.length;
                while (i < length) {
                    EnumC0877f enumC0877f = values[i];
                    C0881b.m20460a(enumC0877f, enumC0877f.m20476e());
                    i++;
                }
                C0941a.m20234b();
            } else {
                EnumC0877f[] values2 = EnumC0877f.values();
                int length2 = values2.length;
                while (i < length2) {
                    EnumC0877f enumC0877f2 = values2[i];
                    C0881b.m20460a(enumC0877f2, enumC0877f2.m20475f());
                    i++;
                }
                C0881b.m20451b();
                C0941a.m20239a();
            }
        }
        if (f21260d) {
            C0989s.m20062a().m20059a(4, this, 60000L);
        }
    }
}
