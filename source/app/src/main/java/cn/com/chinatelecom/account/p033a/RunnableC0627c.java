package cn.com.chinatelecom.account.p033a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: cn.com.chinatelecom.account.a.c */
/* loaded from: classes2.dex */
public final class RunnableC0627c implements Runnable {

    /* renamed from: a */
    public /* synthetic */ Context f20857a;

    /* renamed from: b */
    public /* synthetic */ List f20858b;

    /* renamed from: c */
    public /* synthetic */ int f20859c;

    static {
        Covode.recordClassIndex(2671);
    }

    public RunnableC0627c(Context context, List list, int i) {
        this.f20857a = context;
        this.f20858b = list;
        this.f20859c = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
        if (r3 == null) goto L21;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r6 = this;
            android.content.Context r2 = r6.f20857a     // Catch: java.lang.Throwable -> L46
            java.util.List r1 = r6.f20858b     // Catch: java.lang.Throwable -> L46
            int r0 = r6.f20859c     // Catch: java.lang.Throwable -> L46
            java.util.Queue r5 = cn.com.chinatelecom.account.p033a.C0626b.m20748a(r2, r1, r0)     // Catch: java.lang.Throwable -> L46
            boolean r0 = r5.isEmpty()     // Catch: java.lang.Throwable -> L46
            if (r0 != 0) goto L45
            android.content.Context r0 = r6.f20857a     // Catch: java.lang.Throwable -> L46
            java.lang.String r4 = cn.com.chinatelecom.account.p033a.C0626b.m20747a(r0, r5)     // Catch: java.lang.Throwable -> L46
            r3 = 0
            r1 = -1
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> L2d java.lang.Throwable -> L46
            if (r0 != 0) goto L3e
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L2d java.lang.Throwable -> L46
            r2.<init>(r4)     // Catch: java.lang.Exception -> L2d java.lang.Throwable -> L46
            java.lang.String r0 = "code"
            int r1 = r2.getInt(r0)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L46
            goto L33
        L2a:
            r0 = move-exception
            r3 = r2
            goto L2e
        L2d:
            r0 = move-exception
        L2e:
            r0.printStackTrace()     // Catch: java.lang.Throwable -> L46
            if (r3 == 0) goto L3e
        L33:
            if (r1 != 0) goto L3e
            android.content.Context r0 = r6.f20857a     // Catch: java.lang.Throwable -> L46
            cn.com.chinatelecom.account.p033a.C0626b.m20751a(r0)     // Catch: java.lang.Throwable -> L46
            r5.clear()     // Catch: java.lang.Throwable -> L46
            return
        L3e:
            android.content.Context r1 = r6.f20857a     // Catch: java.lang.Throwable -> L46
            int r0 = r6.f20859c     // Catch: java.lang.Throwable -> L46
            cn.com.chinatelecom.account.p033a.C0626b.m20746a(r1, r5, r0)     // Catch: java.lang.Throwable -> L46
        L45:
            return
        L46:
            r0 = move-exception
            r0.printStackTrace()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.com.chinatelecom.account.p033a.RunnableC0627c.run():void");
    }
}
