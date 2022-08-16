package com.alipay.sdk.p082m.p114p0;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.ActionInvokeEntrance;
import p002O.C0002O;
import p003X.C116971W2r;

/* renamed from: com.alipay.sdk.m.p0.b */
/* loaded from: classes2.dex */
public class C1356b {

    /* renamed from: f */
    public static final String f22319f = "AAID";

    /* renamed from: g */
    public static final String f22320g = "VAID";

    /* renamed from: a */
    public Context f22321a;

    static {
        Covode.recordClassIndex(4856);
    }

    public static Cursor com_alipay_sdk_m_p0_b_android_content_ContentResolver_query(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        ActionInvokeEntrance.setEventUuid(240004);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(contentResolver, new Object[]{uri, strArr, str, strArr2, str2}, 240004, "android.database.Cursor", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return (Cursor) actionIntercept.second;
        }
        Cursor LIZ = C116971W2r.LIZ(contentResolver, uri, strArr, str, strArr2, str2);
        ActionInvokeEntrance.actionInvoke(LIZ, contentResolver, new Object[]{uri, strArr, str, strArr2, str2}, 240004, "com_alipay_sdk_m_p0_b_android_content_ContentResolver_query(Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;");
        return LIZ;
    }

    public C1356b(Context context) {
        this.f22321a = context;
    }

    /* renamed from: a */
    public String m19001a(int i, String str) {
        Uri parse;
        String str2 = null;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 4) {
                        parse = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAIDSTATUS");
                    } else {
                        parse = null;
                    }
                } else {
                    parse = Uri.parse(C0002O.m25086C("content://com.vivo.vms.IdProvider/IdentifierId/AAID_", str));
                }
            } else {
                parse = Uri.parse(C0002O.m25086C("content://com.vivo.vms.IdProvider/IdentifierId/VAID_", str));
            }
        } else {
            parse = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/OAID");
        }
        Cursor com_alipay_sdk_m_p0_b_android_content_ContentResolver_query = com_alipay_sdk_m_p0_b_android_content_ContentResolver_query(this.f22321a.getContentResolver(), parse, null, null, null, null);
        if (com_alipay_sdk_m_p0_b_android_content_ContentResolver_query != null) {
            if (com_alipay_sdk_m_p0_b_android_content_ContentResolver_query.moveToNext()) {
                str2 = com_alipay_sdk_m_p0_b_android_content_ContentResolver_query.getString(com_alipay_sdk_m_p0_b_android_content_ContentResolver_query.getColumnIndex("value"));
            }
            com_alipay_sdk_m_p0_b_android_content_ContentResolver_query.close();
        }
        return str2;
    }
}
