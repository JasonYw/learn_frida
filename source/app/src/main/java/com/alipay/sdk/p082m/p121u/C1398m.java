package com.alipay.sdk.p082m.p121u;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import com.alipay.sdk.app.EnvUtils;
import com.alipay.sdk.p082m.p105l.C1313a;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.ActionInvokeEntrance;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import p003X.C116971W2r;

/* renamed from: com.alipay.sdk.m.u.m */
/* loaded from: classes2.dex */
public class C1398m {
    static {
        Covode.recordClassIndex(4898);
    }

    public static Cursor com_alipay_sdk_m_u_m_android_content_ContentResolver_query(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        ActionInvokeEntrance.setEventUuid(240004);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(contentResolver, new Object[]{uri, strArr, str, strArr2, str2}, 240004, "android.database.Cursor", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return (Cursor) actionIntercept.second;
        }
        Cursor LIZ = C116971W2r.LIZ(contentResolver, uri, strArr, str, strArr2, str2);
        ActionInvokeEntrance.actionInvoke(LIZ, contentResolver, new Object[]{uri, strArr, str, strArr2, str2}, 240004, "com_alipay_sdk_m_u_m_android_content_ContentResolver_query(Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;");
        return LIZ;
    }

    /* renamed from: b */
    public static String m18819b(Context context) {
        if (EnvUtils.isSandBox()) {
            return "https://mobilegw.alipaydev.com/mgw.htm";
        }
        if (context == null) {
            return C1313a.f22201a;
        }
        String str = C1313a.f22201a;
        if (TextUtils.isEmpty(str)) {
            return C1313a.f22201a;
        }
        return str;
    }

    /* renamed from: a */
    public static String m18820a(Context context) {
        Cursor com_alipay_sdk_m_u_m_android_content_ContentResolver_query = com_alipay_sdk_m_u_m_android_content_ContentResolver_query(context.getContentResolver(), Uri.parse("content://com.alipay.android.app.settings.data.ServerProvider/current_server"), null, null, null, null);
        String str = null;
        if (com_alipay_sdk_m_u_m_android_content_ContentResolver_query != null && com_alipay_sdk_m_u_m_android_content_ContentResolver_query.getCount() > 0) {
            if (com_alipay_sdk_m_u_m_android_content_ContentResolver_query.moveToFirst()) {
                str = com_alipay_sdk_m_u_m_android_content_ContentResolver_query.getString(com_alipay_sdk_m_u_m_android_content_ContentResolver_query.getColumnIndex(PushConstants.WEB_URL));
            }
            com_alipay_sdk_m_u_m_android_content_ContentResolver_query.close();
        }
        return str;
    }
}
