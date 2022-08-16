package com.amap.api.mapcore2d;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Proxy;
import android.net.Uri;
import android.os.Build;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.ActionInvokeEntrance;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.util.List;
import p003X.C116971W2r;

/* renamed from: com.amap.api.mapcore2d.cy */
/* loaded from: classes19.dex */
public class C1595cy {
    static {
        Covode.recordClassIndex(5143);
    }

    public static Cursor com_amap_api_mapcore2d_cy_android_content_ContentResolver_query(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        ActionInvokeEntrance.setEventUuid(240004);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(contentResolver, new Object[]{uri, strArr, str, strArr2, str2}, 240004, "android.database.Cursor", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return (Cursor) actionIntercept.second;
        }
        Cursor LIZ = C116971W2r.LIZ(contentResolver, uri, strArr, str, strArr2, str2);
        ActionInvokeEntrance.actionInvoke(LIZ, contentResolver, new Object[]{uri, strArr, str, strArr2, str2}, 240004, "com_amap_api_mapcore2d_cy_android_content_ContentResolver_query(Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;");
        return LIZ;
    }

    /* renamed from: b */
    public static int m17979b() {
        try {
            return Proxy.getDefaultPort();
        } catch (Throwable th) {
            C1616do.m17866c(th, "pu", "gdp");
            return -1;
        }
    }

    /* renamed from: a */
    public static String m17984a() {
        String str;
        try {
            str = Proxy.getDefaultHost();
        } catch (Throwable th) {
            C1616do.m17866c(th, "pu", "gdh");
            str = null;
        }
        if (str == null) {
            return "null";
        }
        return str;
    }

    /* renamed from: a */
    public static String m17981a(String str) {
        return C1602db.m17930c(str);
    }

    /* renamed from: c */
    public static boolean m17977c(Context context) {
        if (C1587cu.m18035r(context) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static java.net.Proxy m17983a(Context context) {
        try {
            int i = Build.VERSION.SDK_INT;
            return m17982a(context, new URI("http://restapi.amap.com"));
        } catch (Throwable th) {
            C1616do.m17866c(th, "pu", "gp");
            return null;
        }
    }

    /* JADX WARN: Not initialized variable reg: 10, insn: 0x009d: MOVE  (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r10 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:97:0x009d */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x00a3: MOVE  (r4 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r10 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:91:0x00a2 */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x0147: IF  (r8 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:112:0x0151, block:B:111:0x0147 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x013a A[Catch: all -> 0x0152, TryCatch #2 {all -> 0x0152, blocks: (B:11:0x0134, B:13:0x013a), top: B:10:0x0134 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b9 A[Catch: all -> 0x0130, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0130, blocks: (B:19:0x00b9, B:94:0x00c7, B:76:0x012c), top: B:5:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00da A[Catch: all -> 0x0146, TryCatch #4 {all -> 0x0146, blocks: (B:92:0x00c0, B:61:0x00cf, B:63:0x00da, B:65:0x00ee, B:67:0x00f4, B:71:0x00ff, B:79:0x0104, B:81:0x010a, B:83:0x0110, B:87:0x011b), top: B:4:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x012c A[Catch: all -> 0x0130, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0130, blocks: (B:19:0x00b9, B:94:0x00c7, B:76:0x012c), top: B:5:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00c7 A[Catch: all -> 0x0130, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0130, blocks: (B:19:0x00b9, B:94:0x00c7, B:76:0x012c), top: B:5:0x002a }] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.net.Proxy m17978b(android.content.Context r21) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.C1595cy.m17978b(android.content.Context):java.net.Proxy");
    }

    /* renamed from: a */
    public static boolean m17980a(String str, int i) {
        if (str != null && str.length() > 0 && i != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static java.net.Proxy m17982a(Context context, URI uri) {
        java.net.Proxy proxy;
        if (m17977c(context)) {
            try {
                List<java.net.Proxy> select = ProxySelector.getDefault().select(uri);
                if (select != null && !select.isEmpty() && (proxy = select.get(0)) != null) {
                    if (proxy.type() != Proxy.Type.DIRECT) {
                        return proxy;
                    }
                }
                return null;
            } catch (Throwable th) {
                C1616do.m17866c(th, "pu", "gpsc");
            }
        }
        return null;
    }
}
