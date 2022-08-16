package com.bytedance.android.live.browser.jsbridge.newmethods;

import android.text.TextUtils;
import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livehostapi.business.IHostOCRApiProxy;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.model.C9063e;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.web.jsbridge2.AbstractC13049f;
import com.bytedance.ies.web.jsbridge2.C13052h;
import com.bytedance.p1300mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p003X.AbstractC102107QIz;
import p003X.AbstractC90728Loo;
import p003X.C90722Loi;
import p003X.C90787Lpl;
import p003X.Q2E;
import p003X.QIR;

/* loaded from: classes8.dex */
public class ReadSettingMethod extends AbstractC13049f<C3996a, JsonObject> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* renamed from: com.bytedance.android.live.browser.jsbridge.newmethods.ReadSettingMethod$a */
    /* loaded from: classes8.dex */
    public static final class C3996a {
        @SerializedName("key")
        public String LIZ;
        @SerializedName("type")
        public String LIZIZ;

        static {
            Covode.recordClassIndex(22611);
        }
    }

    static {
        Covode.recordClassIndex(22608);
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC13049f
    public void onTerminate() {
    }

    @Override // com.bytedance.ies.web.jsbridge2.AbstractC13049f
    public void invoke(C3996a c3996a, C13052h c13052h) {
        JsonElement jsonTree;
        String str;
        int i = 0;
        boolean z = true;
        if (PatchProxy.proxy(new Object[]{c3996a, c13052h}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        final JsonObject jsonObject = new JsonObject();
        final JsonObject jsonObject2 = new JsonObject();
        if (TextUtils.isEmpty(c3996a.LIZ)) {
            finishWithResult(jsonObject);
            return;
        }
        final String str2 = c3996a.LIZ;
        if ("live_certification_setting_dic".equals(str2)) {
            if (QIR.LIZJ()) {
                QIR.LIZ(c13052h.LIZIZ, true, new Q2E() { // from class: com.bytedance.android.live.browser.jsbridge.newmethods.ReadSettingMethod.1
                    public static ChangeQuickRedirect LIZ;

                    static {
                        Covode.recordClassIndex(22609);
                    }

                    @Override // p003X.Q2E
                    public final void LIZ(String str3) {
                        String str4;
                        boolean z2 = true;
                        int i2 = 0;
                        if (PatchProxy.proxy(new Object[]{str3}, this, LIZ, false, 1).isSupported) {
                            return;
                        }
                        JsonObject jsonObject3 = new JsonObject();
                        jsonObject3.addProperty("live_certification_setting_face_identify", str3);
                        C9063e value = LiveSettingKeys.LIVE_CERTIFICATION_SETTING_DIC.getValue();
                        if (value != null) {
                            AbstractC102107QIz abstractC102107QIz = (AbstractC102107QIz) ServiceManager.getService(IHostOCRApiProxy.class);
                            if (abstractC102107QIz != null && abstractC102107QIz.LIZ()) {
                                str4 = value.LIZ;
                            } else {
                                z2 = false;
                                str4 = "default";
                            }
                            jsonObject3.addProperty("live_certification_setting_info_input", str4);
                            jsonObject3.addProperty("live_certification_setting_show_artificial_entrance", Boolean.valueOf(value.LIZIZ));
                            if (z2) {
                                i2 = value.LIZJ;
                            }
                            jsonObject3.addProperty("live_certification_setting_manual_use_ocr", Integer.valueOf(i2));
                            jsonObject3.addProperty("live_certification_setting_use_reflection", Boolean.valueOf(value.LIZLLL));
                            jsonObject2.add(str2, jsonObject3);
                            QIR.LIZ((String) C90722Loi.LIZ(AbstractC90728Loo.LIZIZ), str3);
                        }
                        jsonObject.add(C2521l.LJIIL, jsonObject2);
                        ReadSettingMethod.this.finishWithResult(jsonObject);
                    }
                });
                return;
            }
            JsonObject jsonObject3 = new JsonObject();
            String LIZLLL = QIR.LIZLLL();
            jsonObject3.addProperty("live_certification_setting_face_identify", QIR.LIZLLL());
            C9063e value = LiveSettingKeys.LIVE_CERTIFICATION_SETTING_DIC.getValue();
            if (value != null) {
                AbstractC102107QIz abstractC102107QIz = (AbstractC102107QIz) ServiceManager.getService(IHostOCRApiProxy.class);
                if (abstractC102107QIz != null && abstractC102107QIz.LIZ()) {
                    str = value.LIZ;
                } else {
                    z = false;
                    str = "default";
                }
                jsonObject3.addProperty("live_certification_setting_info_input", str);
                jsonObject3.addProperty("live_certification_setting_show_artificial_entrance", Boolean.valueOf(value.LIZIZ));
                if (z) {
                    i = value.LIZJ;
                }
                jsonObject3.addProperty("live_certification_setting_manual_use_ocr", Integer.valueOf(i));
                jsonObject3.addProperty("live_certification_setting_use_reflection", Boolean.valueOf(value.LIZLLL));
                jsonObject2.add(str2, jsonObject3);
                QIR.LIZ((String) C90722Loi.LIZ(AbstractC90728Loo.LIZIZ), LIZLLL);
            }
        } else {
            Gson LIZJ = C90787Lpl.LIZJ();
            Object LIZ = C90787Lpl.LIZ("key_ttlive_sdk_setting", str2);
            if (LIZ != null) {
                if (LIZ instanceof JSONObject) {
                    jsonTree = GsonProtectorUtils.toJsonTree(LIZJ, GsonProtectorUtils.fromJson(LIZJ, ((JSONObject) LIZ).toString(), (Class<Object>) Object.class));
                } else if (LIZ instanceof JSONArray) {
                    jsonTree = GsonProtectorUtils.toJsonTree(LIZJ, GsonProtectorUtils.fromJson(LIZJ, ((JSONArray) LIZ).toString(), new TypeToken<List<Object>>(this) { // from class: com.bytedance.android.live.browser.jsbridge.newmethods.ReadSettingMethod.2
                        static {
                            Covode.recordClassIndex(22610);
                        }
                    }.getType()));
                } else if (LIZ instanceof Boolean) {
                    if (((Boolean) LIZ).booleanValue()) {
                        jsonTree = GsonProtectorUtils.toJsonTree(LIZJ, 1);
                    } else {
                        jsonTree = GsonProtectorUtils.toJsonTree(LIZJ, 0);
                    }
                } else {
                    jsonTree = GsonProtectorUtils.toJsonTree(LIZJ, LIZ);
                }
                jsonObject2.add(str2, jsonTree);
            }
        }
        jsonObject.add(C2521l.LJIIL, jsonObject2);
        finishWithResult(jsonObject);
    }
}
