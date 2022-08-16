package cn.com.chinatelecom.account.api.p038e;

import android.content.Context;
import cn.com.chinatelecom.account.api.Helper;
import cn.com.chinatelecom.account.api.p034a.C0631c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: cn.com.chinatelecom.account.api.e.l */
/* loaded from: classes2.dex */
public final class C0677l implements AbstractC0675j {
    static {
        Covode.recordClassIndex(2728);
    }

    @Override // cn.com.chinatelecom.account.api.p038e.AbstractC0675j
    /* renamed from: a */
    public final String mo20568a(Context context, long j, String str) {
        MethodCollector.m14708i(197);
        String dnprecobjs = Helper.dnprecobjs(context, j, str);
        MethodCollector.m14707o(197);
        return dnprecobjs;
    }

    @Override // cn.com.chinatelecom.account.api.p038e.AbstractC0675j
    /* renamed from: a */
    public final String mo20567a(Context context, String str, String str2, String str3, long j, boolean z, String str4) {
        MethodCollector.m14708i(195);
        String dnepah = Helper.dnepah(context, str, str2, str3, j, false, z, str4);
        MethodCollector.m14707o(195);
        return dnepah;
    }

    @Override // cn.com.chinatelecom.account.api.p038e.AbstractC0675j
    /* renamed from: a */
    public final String mo20566a(String str, String str2) {
        String str3;
        MethodCollector.m14708i(196);
        try {
            str3 = new String(Helper.dnepmret(C0631c.m20737a(str), str2));
        } catch (Throwable th) {
            th.printStackTrace();
            str3 = "";
        }
        MethodCollector.m14707o(196);
        return str3;
    }

    @Override // cn.com.chinatelecom.account.api.p038e.AbstractC0675j
    /* renamed from: a */
    public final String mo20565a(boolean z) {
        MethodCollector.m14708i(194);
        String cepahsul = Helper.cepahsul(z);
        MethodCollector.m14707o(194);
        return cepahsul;
    }
}
