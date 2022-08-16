package com.alipay.sdk.p082m.p100i0;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.ActionInvokeEntrance;
import p002O.C0002O;
import p003X.C116971W2r;

/* renamed from: com.alipay.sdk.m.i0.f */
/* loaded from: classes18.dex */
public class C1293f {

    /* renamed from: g */
    public static volatile C1293f f22154g;

    /* renamed from: h */
    public static boolean f22155h;

    /* renamed from: f */
    public BroadcastReceiver f22161f;

    /* renamed from: a */
    public C1288a f22156a = new C1288a("udid");

    /* renamed from: b */
    public C1288a f22157b = new C1288a("oaid");

    /* renamed from: d */
    public C1288a f22159d = new C1288a("vaid");

    /* renamed from: c */
    public C1288a f22158c = new C1288a("aaid");

    /* renamed from: e */
    public C1290c f22160e = new C1290c();

    static {
        Covode.recordClassIndex(4793);
    }

    /* renamed from: a */
    public static C1291d m19250a(Cursor cursor) {
        String str;
        C1291d c1291d = new C1291d(null, 0);
        if (cursor == null) {
            str = "parseValue fail, cursor is null.";
        } else if (!cursor.isClosed()) {
            cursor.moveToFirst();
            int columnIndex = cursor.getColumnIndex("value");
            if (columnIndex >= 0) {
                c1291d.f22151a = cursor.getString(columnIndex);
            } else {
                m19249a("parseValue fail, index < 0.");
            }
            int columnIndex2 = cursor.getColumnIndex(C2521l.LJIIJ);
            if (columnIndex2 >= 0) {
                c1291d.f22152b = cursor.getInt(columnIndex2);
            } else {
                m19249a("parseCode fail, index < 0.");
            }
            int columnIndex3 = cursor.getColumnIndex("expired");
            if (columnIndex3 >= 0) {
                c1291d.f22153c = cursor.getLong(columnIndex3);
                return c1291d;
            }
            m19249a("parseExpired fail, index < 0.");
            return c1291d;
        } else {
            str = "parseValue fail, cursor is closed.";
        }
        m19249a(str);
        return c1291d;
    }

    /* renamed from: a */
    public static final C1293f m19255a() {
        if (f22154g == null) {
            synchronized (C1293f.class) {
                if (f22154g == null) {
                    f22154g = new C1293f();
                }
            }
        }
        return f22154g;
    }

    /* renamed from: a */
    public static String m19251a(PackageManager packageManager, String str) {
        ProviderInfo resolveContentProvider;
        if (packageManager == null || (resolveContentProvider = packageManager.resolveContentProvider(str, 0)) == null || (resolveContentProvider.applicationInfo.flags & 1) == 0) {
            return null;
        }
        return resolveContentProvider.packageName;
    }

    /* renamed from: a */
    public static void m19249a(String str) {
    }

    /* renamed from: a */
    public static void m19248a(boolean z) {
        f22155h = z;
    }

    /* renamed from: a */
    public static boolean m19254a(Context context) {
        m19249a("querySupport version : 1.0.8");
        boolean z = false;
        Cursor cursor = null;
        try {
            try {
                cursor = com_alipay_sdk_m_i0_f_android_content_ContentResolver_query(context.getContentResolver(), Uri.parse("content://com.meizu.flyme.openidsdk/"), null, null, new String[]{"supported"}, null);
                if (cursor != null) {
                    C1291d m19250a = m19250a(cursor);
                    if (1000 == m19250a.f22152b) {
                        if (!"0".equals(m19250a.f22151a)) {
                            cursor.close();
                            return z;
                        }
                    }
                    z = true;
                    cursor.close();
                    return z;
                }
            } catch (Exception e) {
                m19249a(C0002O.m25086C("querySupport, Exception : ", e.getMessage()));
                if (cursor != null) {
                    cursor.close();
                }
            }
            return false;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ac, code lost:
        if (r3 != null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b2  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String m19246b(android.content.Context r12, com.alipay.sdk.p082m.p100i0.C1288a r13) {
        /*
            r11 = this;
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "queryId : "
            r1.<init>(r0)
            java.lang.String r0 = r13.f22146c
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            m19249a(r0)
            java.lang.String r0 = "content://com.meizu.flyme.openidsdk/"
            android.net.Uri r6 = android.net.Uri.parse(r0)
            r3 = 0
            android.content.ContentResolver r5 = r12.getContentResolver()     // Catch: java.lang.Exception -> L95 java.lang.Throwable -> Lb7
            r7 = 0
            r8 = 0
            r2 = 1
            java.lang.String[] r9 = new java.lang.String[r2]     // Catch: java.lang.Exception -> L95 java.lang.Throwable -> Lb7
            java.lang.String r0 = r13.f22146c     // Catch: java.lang.Exception -> L95 java.lang.Throwable -> Lb7
            r4 = 0
            r9[r4] = r0     // Catch: java.lang.Exception -> L95 java.lang.Throwable -> Lb7
            r10 = 0
            android.database.Cursor r6 = com_alipay_sdk_m_i0_f_android_content_ContentResolver_query(r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L95 java.lang.Throwable -> Lb7
            if (r6 == 0) goto L77
            com.alipay.sdk.m.i0.d r5 = m19250a(r6)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91
            java.lang.String r3 = r5.f22151a     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91
            r13.m19269a(r3)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91
            long r0 = r5.f22153c     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91
            r13.m19270a(r0)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91
            int r0 = r5.f22152b     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91
            r13.m19271a(r0)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91
            r1.<init>()     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91
            java.lang.String r0 = r13.f22146c     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91
            r1.append(r0)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91
            java.lang.String r0 = " errorCode : "
            r1.append(r0)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91
            int r0 = r13.f22147d     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91
            r1.append(r0)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91
            m19249a(r0)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91
            int r1 = r5.f22152b     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r1 == r0) goto Laf
            r11.m19247b(r12)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91
            boolean r0 = r11.m19252a(r12, r4)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91
            if (r0 != 0) goto Laf
            boolean r0 = r11.m19252a(r12, r2)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91
            java.lang.String r1 = "not support, forceQuery isSupported: "
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91
            goto L87
        L77:
            boolean r0 = r11.m19252a(r12, r4)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91
            if (r0 == 0) goto Laf
            boolean r0 = r11.m19252a(r12, r2)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91
            java.lang.String r1 = "forceQuery isSupported : "
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91
        L87:
            java.lang.String r0 = r1.concat(r0)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91
            m19249a(r0)     // Catch: java.lang.Throwable -> L8f java.lang.Exception -> L91
            goto Laf
        L8f:
            r0 = move-exception
            goto Lb9
        L91:
            r4 = move-exception
            r2 = r3
            r3 = r6
            goto L97
        L95:
            r4 = move-exception
            r2 = r3
        L97:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r0 = "queryId, Exception : "
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r0 = r4.getMessage()     // Catch: java.lang.Throwable -> Lb7
            r1.append(r0)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> Lb7
            m19249a(r0)     // Catch: java.lang.Throwable -> Lb7
            if (r3 != 0) goto Lb3
        Lae:
            return r2
        Laf:
            r2 = r3
            if (r6 == 0) goto Lae
            r3 = r6
        Lb3:
            r3.close()
            return r2
        Lb7:
            r0 = move-exception
            r6 = r3
        Lb9:
            if (r6 == 0) goto Lbe
            r6.close()
        Lbe:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.p082m.p100i0.C1293f.m19246b(android.content.Context, com.alipay.sdk.m.i0.a):java.lang.String");
    }

    /* renamed from: b */
    public static String m19245b(PackageManager packageManager, String str) {
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            if (packageInfo == null) {
                return null;
            }
            return packageInfo.versionName;
        } catch (Exception e) {
            e.printStackTrace();
            m19249a(C0002O.m25086C("getAppVersion, Exception : ", e.getMessage()));
            return null;
        }
    }

    /* renamed from: b */
    private synchronized void m19247b(Context context) {
        if (this.f22161f != null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.meizu.flyme.openid.ACTION_OPEN_ID_CHANGE");
        C1292e c1292e = new C1292e();
        this.f22161f = c1292e;
        C116971W2r.LIZ(context, c1292e, intentFilter, "com.meizu.flyme.openid.permission.OPEN_ID_CHANGE", (Handler) null);
    }

    public static Cursor com_alipay_sdk_m_i0_f_android_content_ContentResolver_query(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        ActionInvokeEntrance.setEventUuid(240004);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(contentResolver, new Object[]{uri, strArr, str, strArr2, str2}, 240004, "android.database.Cursor", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return (Cursor) actionIntercept.second;
        }
        Cursor LIZ = C116971W2r.LIZ(contentResolver, uri, strArr, str, strArr2, str2);
        ActionInvokeEntrance.actionInvoke(LIZ, contentResolver, new Object[]{uri, strArr, str, strArr2, str2}, 240004, "com_alipay_sdk_m_i0_f_android_content_ContentResolver_query(Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;");
        return LIZ;
    }

    /* renamed from: a */
    public final String m19253a(Context context, C1288a c1288a) {
        String str;
        if (c1288a == null) {
            str = "getId, openId = null.";
        } else if (c1288a.m19272a()) {
            return c1288a.f22145b;
        } else {
            if (m19252a(context, true)) {
                return m19246b(context, c1288a);
            }
            str = "getId, isSupported = false.";
        }
        m19249a(str);
        return null;
    }

    /* renamed from: a */
    public final boolean m19252a(Context context, boolean z) {
        if (!this.f22160e.m19261a() || z) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            String m19251a = m19251a(packageManager, "com.meizu.flyme.openidsdk");
            if (TextUtils.isEmpty(m19251a)) {
                return false;
            }
            String m19245b = m19245b(packageManager, m19251a);
            if (this.f22160e.m19261a() && this.f22160e.m19260a(m19245b)) {
                m19249a("use same version cache, safeVersion : ".concat(String.valueOf(m19245b)));
                return this.f22160e.m19258b();
            }
            this.f22160e.m19257b(m19245b);
            boolean m19254a = m19254a(context);
            m19249a("query support, result : ".concat(String.valueOf(m19254a)));
            this.f22160e.m19259a(m19254a);
            return m19254a;
        }
        return this.f22160e.m19258b();
    }
}
