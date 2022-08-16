package com.bytedance.android.live.browser.jsbridge.newmethods;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.ActionInvokeEntrance;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.web.jsbridge2.AbstractC13049f;
import com.bytedance.ies.web.jsbridge2.C13052h;
import com.xiaomi.mipush.sdk.Constants;
import org.json.JSONException;
import org.json.JSONObject;
import p003X.C116971W2r;
import p003X.C134529bwK;
import p003X.C144451eWj;
import p003X.DialogC138347cw3;
import p003X.L12;
import p003X.L13;

/* renamed from: com.bytedance.android.live.browser.jsbridge.newmethods.br */
/* loaded from: classes5.dex */
public final class C4004br extends AbstractC13049f<JSONObject, Object> {
    public static ChangeQuickRedirect LIZ;
    public Fragment LIZIZ;
    public TokenCert LIZJ = TokenCert.with("bpea-live_getContactMethod_jsb_get_read_contacts");

    static {
        Covode.recordClassIndex(22711);
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC13049f
    public final void onTerminate() {
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        finishWithFailure();
    }

    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        if (this.LIZIZ != null) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.PICK");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setType("vnd.android.cursor.dir/phone_v2");
            this.LIZIZ.startActivityForResult(intent, 998);
            return;
        }
        LIZ();
    }

    public C4004br(Fragment fragment) {
        this.LIZIZ = fragment;
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC13049f
    public final /* synthetic */ void invoke(JSONObject jSONObject, C13052h c13052h) {
        JSONObject jSONObject2 = jSONObject;
        if (!PatchProxy.proxy(new Object[]{jSONObject2, c13052h}, this, LIZ, false, 1).isSupported) {
            if (c13052h != null && (c13052h.LIZIZ instanceof Activity)) {
                String optString = jSONObject2.optString("token", "");
                if (optString != null && !optString.isEmpty()) {
                    this.LIZJ = TokenCert.with(optString);
                }
                Activity activity = (Activity) c13052h.LIZIZ;
                DialogC138347cw3.LIZ(L13.LIZIZ);
                if (Build.VERSION.SDK_INT >= 23) {
                    C134529bwK.LIZ(activity).LIZ(new L12(this), this.LIZJ, "android.permission.READ_CONTACTS");
                    return;
                } else if (C144451eWj.LIZ((Context) activity, "android.permission.READ_CONTACTS")) {
                    LIZIZ();
                    return;
                } else {
                    LIZ();
                    return;
                }
            }
            LIZ();
        }
    }

    public final void LIZ(int i, int i2, Intent intent, Context context) {
        String str;
        Cursor cursor;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent, context}, this, LIZ, false, 5).isSupported && i == 998 && intent != null) {
            try {
                Uri data = intent.getData();
                ContentResolver contentResolver = context.getContentResolver();
                String str2 = null;
                if (data != null) {
                    String[] strArr = {"display_name", "data1"};
                    PatchProxyResult proxy = PatchProxy.proxy(new Object[]{contentResolver, data, strArr, null, null, null}, null, LIZ, true, 6);
                    if (proxy.isSupported) {
                        cursor = (Cursor) proxy.result;
                    } else {
                        ActionInvokeEntrance.setEventUuid(240004);
                        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(contentResolver, new Object[]{data, strArr, null, null, null}, 240004, "android.database.Cursor", false, null, false);
                        if (((Boolean) actionIntercept.first).booleanValue()) {
                            cursor = (Cursor) actionIntercept.second;
                        } else {
                            cursor = C116971W2r.LIZ(contentResolver, data, strArr, (String) null, (String[]) null, (String) null);
                            ActionInvokeEntrance.actionInvoke(cursor, contentResolver, new Object[]{data, strArr, null, null, null}, 240004, "com_bytedance_android_live_browser_jsbridge_newmethods_GetContactMethod_android_content_ContentResolver_query(Landroid/content/ContentResolver;Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;");
                        }
                    }
                    str = null;
                } else {
                    str = null;
                    cursor = null;
                }
                while (cursor.moveToNext()) {
                    str = cursor.getString(cursor.getColumnIndex("display_name"));
                    str2 = cursor.getString(cursor.getColumnIndex("data1"));
                }
                cursor.close();
                if (str2 != null) {
                    str2 = str2.replaceAll(Constants.ACCEPT_TIME_SEPARATOR_SERVER, " ").replaceAll(" ", "");
                }
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                    if (!PatchProxy.proxy(new Object[]{str, str2}, this, LIZ, false, 3).isSupported) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("name", str);
                            jSONObject.put("phone", str2);
                            finishWithResult(jSONObject);
                            return;
                        } catch (JSONException unused) {
                            LIZ();
                            return;
                        }
                    }
                    return;
                }
                LIZ();
            } catch (Exception unused2) {
                LIZ();
            }
        }
    }
}
