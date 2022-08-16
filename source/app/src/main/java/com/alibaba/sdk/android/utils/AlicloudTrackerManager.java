package com.alibaba.sdk.android.utils;

import android.app.Application;
import android.text.TextUtils;
import com.alibaba.sdk.android.utils.crashdefend.C1111b;
import com.alibaba.sdk.android.utils.crashdefend.C1113c;
import com.alibaba.sdk.android.utils.crashdefend.SDKMessageCallback;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import p002O.C0002O;

/* loaded from: classes13.dex */
public class AlicloudTrackerManager {

    /* renamed from: a */
    public static AlicloudTrackerManager f21710a;

    /* renamed from: a */
    public C1111b f21712a;

    /* renamed from: a */
    public C1109c f21711a = new C1109c();

    /* renamed from: c */
    public Map<String, AlicloudTracker> f21713c = new HashMap();

    static {
        Covode.recordClassIndex(4522);
    }

    public static synchronized AlicloudTrackerManager getInstance(Application application) {
        synchronized (AlicloudTrackerManager.class) {
            if (application == null) {
                return null;
            }
            if (f21710a == null) {
                f21710a = new AlicloudTrackerManager(application);
            }
            return f21710a;
        }
    }

    public AlicloudTrackerManager(Application application) {
        HashMap hashMap = new HashMap(4);
        hashMap.put("kVersion", "1.1.5");
        hashMap.put("packageName", application.getPackageName());
        this.f21711a.m19799a(application, hashMap);
        this.f21712a = C1111b.m19797a(application, this.f21711a);
    }

    public void unregisterCrashDefend(String str, String str2) {
        this.f21712a.m19783d(str, str2);
    }

    public AlicloudTracker getTracker(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            new StringBuilder();
            String m25086C = C0002O.m25086C(str, str2);
            if (this.f21713c.containsKey(m25086C)) {
                return this.f21713c.get(m25086C);
            }
            AlicloudTracker alicloudTracker = new AlicloudTracker(this.f21711a, str, str2);
            this.f21713c.put(m25086C, alicloudTracker);
            return alicloudTracker;
        }
        return null;
    }

    public boolean registerCrashDefend(String str, String str2, int i, int i2, SDKMessageCallback sDKMessageCallback) {
        if (this.f21712a != null) {
            C1113c c1113c = new C1113c();
            c1113c.f21730a = str;
            c1113c.f21733b = str2;
            c1113c.f21727a = i;
            c1113c.f21731b = i2;
            return this.f21712a.m19789a(c1113c, sDKMessageCallback);
        }
        return false;
    }
}
