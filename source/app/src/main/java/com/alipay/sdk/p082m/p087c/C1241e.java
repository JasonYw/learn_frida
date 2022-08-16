package com.alipay.sdk.p082m.p087c;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Pair;
import com.alipay.sdk.p082m.p085b.AbstractC1226b;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.ActionInvokeEntrance;
import p003X.C116971W2r;

/* renamed from: com.alipay.sdk.m.c.e */
/* loaded from: classes26.dex */
public class C1241e implements AbstractC1226b {
    static {
        Covode.recordClassIndex(4741);
    }

    public static Cursor com_alipay_sdk_m_c_e_android_content_ContentResolver_query(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        ActionInvokeEntrance.setEventUuid(240004);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(contentResolver, new Object[]{uri, strArr, str, strArr2, str2}, 240004, "android.database.Cursor", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return (Cursor) actionIntercept.second;
        }
        Cursor LIZ = C116971W2r.LIZ(contentResolver, uri, strArr, str, strArr2, str2);
        ActionInvokeEntrance.actionInvoke(LIZ, contentResolver, new Object[]{uri, strArr, str, strArr2, str2}, 240004, "com_alipay_sdk_m_c_e_android_content_ContentResolver_query(Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;");
        return LIZ;
    }

    @Override // com.alipay.sdk.p082m.p085b.AbstractC1226b
    /* renamed from: a */
    public String mo19338a(Context context) {
        String str = null;
        if (context == null) {
            return null;
        }
        Cursor com_alipay_sdk_m_c_e_android_content_ContentResolver_query = com_alipay_sdk_m_c_e_android_content_ContentResolver_query(context.getContentResolver(), Uri.parse("content://cn.nubia.provider.deviceid.dataid/oaid"), null, null, null, null);
        if (com_alipay_sdk_m_c_e_android_content_ContentResolver_query != null) {
            if (com_alipay_sdk_m_c_e_android_content_ContentResolver_query.moveToNext()) {
                str = com_alipay_sdk_m_c_e_android_content_ContentResolver_query.getString(com_alipay_sdk_m_c_e_android_content_ContentResolver_query.getColumnIndex("device_ids_grndid"));
            }
            com_alipay_sdk_m_c_e_android_content_ContentResolver_query.close();
        }
        return str;
    }
}
