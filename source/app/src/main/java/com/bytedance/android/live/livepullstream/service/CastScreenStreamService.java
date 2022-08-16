package com.bytedance.android.live.livepullstream.service;

import android.text.TextUtils;
import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.android.live.livepullstream.api.ICastScreenStreamService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p003X.AbstractC450903sS;
import p003X.C106862S5w;

/* loaded from: classes12.dex */
public class CastScreenStreamService implements ICastScreenStreamService {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(32129);
    }

    public CastScreenStreamService() {
        ServiceManager.registerService(ICastScreenStreamService.class, this);
    }

    @Override // com.bytedance.android.live.livepullstream.api.ICastScreenStreamService
    public AbstractC450903sS getLiveStreamWrapper(final JSONObject jSONObject) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{jSONObject}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (AbstractC450903sS) proxy.result;
        }
        C106862S5w.LIZ(jSONObject);
        return new AbstractC450903sS(jSONObject) { // from class: X.3tO
            public static ChangeQuickRedirect LIZ;
            public JSONObject LIZIZ;
            public V1Z LIZJ;

            static {
                Covode.recordClassIndex(59122);
            }

            {
                C106862S5w.LIZ(jSONObject);
                this.LIZIZ = jSONObject;
                this.LIZJ = new V1Z(this.LIZIZ);
            }

            @Override // p003X.AbstractC450903sS
            public final String LIZ(String str, String str2) {
                String LJFF;
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{str, str2}, this, LIZ, false, 3);
                if (proxy2.isSupported) {
                    return (String) proxy2.result;
                }
                C106862S5w.LIZ(str, str2);
                V1Z v1z = this.LIZJ;
                if (v1z == null || (LJFF = v1z.LJFF(str, str2)) == null) {
                    return "";
                }
                return LJFF;
            }

            @Override // p003X.AbstractC450903sS
            public final String LIZ(String str, String str2, String str3) {
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{str, str2, str3}, this, LIZ, false, 1);
                if (proxy2.isSupported) {
                    return (String) proxy2.result;
                }
                C106862S5w.LIZ(str3);
                V1Z v1z = this.LIZJ;
                if (v1z != null) {
                    return v1z.LIZ(str, str2, str3);
                }
                return null;
            }

            @Override // p003X.AbstractC450903sS
            public final String LIZIZ(String str, String str2, String str3) {
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{str, str2, str3}, this, LIZ, false, 2);
                if (proxy2.isSupported) {
                    return (String) proxy2.result;
                }
                C106862S5w.LIZ(str3);
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                    try {
                        JSONObject optJSONObject = this.LIZIZ.getJSONObject(C2521l.LJIIL).optJSONObject(str);
                        if (optJSONObject != null) {
                            String optString = optJSONObject.optJSONObject(str3).optString(str2);
                            Intrinsics.checkNotNullExpressionValue(optString, "");
                            return optString;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        return "";
                    }
                }
                return "";
            }
        };
    }
}
