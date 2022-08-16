package com.alibaba.p052a.p061b.p065d;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

/* renamed from: com.alibaba.a.b.d.w */
/* loaded from: classes2.dex */
public class C0995w implements HostnameVerifier {

    /* renamed from: a */
    public String f21434a;

    static {
        Covode.recordClassIndex(4305);
    }

    public C0995w(String str) {
        this.f21434a = str;
    }

    /* renamed from: a */
    public String m20048a() {
        return this.f21434a;
    }

    public boolean equals(Object obj) {
        if (TextUtils.isEmpty(this.f21434a) || !(obj instanceof C0995w)) {
            return false;
        }
        String str = ((C0995w) obj).f21434a;
        if (!TextUtils.isEmpty(str)) {
            return this.f21434a.equals(str);
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String str, SSLSession sSLSession) {
        return HttpsURLConnection.getDefaultHostnameVerifier().verify(this.f21434a, sSLSession);
    }
}
