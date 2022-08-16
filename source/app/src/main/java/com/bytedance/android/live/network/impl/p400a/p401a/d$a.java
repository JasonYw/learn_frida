package com.bytedance.android.live.network.impl.p400a.p401a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* renamed from: com.bytedance.android.live.network.impl.a.a.d$a */
/* loaded from: classes8.dex */
public class d$a {
    public static ChangeQuickRedirect LIZ;
    public String LIZIZ;
    public String LIZJ;
    public String LIZLLL;

    /* renamed from: LJ */
    public String f26522LJ;
    public long LJFF;
    public long LJI;

    static {
        Covode.recordClassIndex(32646);
    }

    public d$a() {
    }

    public final String toString() {
        String str;
        String str2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        StringBuilder sb = new StringBuilder("{\"path\":\"");
        sb.append(this.LIZIZ);
        String str3 = "";
        if ("0".equals(this.LIZJ)) {
            str = str3;
        } else {
            str = "\", \"code\":\"" + this.LIZJ;
        }
        sb.append(str);
        if (TextUtils.isEmpty(this.LIZLLL)) {
            str2 = str3;
        } else {
            str2 = "\", \"msg\":\"" + this.LIZLLL;
        }
        sb.append(str2);
        if (this.LJI != 0) {
            str3 = "\", \"time\":\"" + this.LJI;
        }
        sb.append(str3);
        sb.append("\", \"latency\":\"");
        sb.append(this.LJFF);
        sb.append("\", \"id\":\"");
        sb.append(this.f26522LJ);
        sb.append("\"}");
        return sb.toString();
    }

    public /* synthetic */ d$a(byte b) {
        this();
    }
}
