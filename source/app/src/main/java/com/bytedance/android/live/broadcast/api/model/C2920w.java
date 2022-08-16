package com.bytedance.android.live.broadcast.api.model;

import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.GsonProtectorUtils;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import java.util.LinkedHashMap;
import java.util.Map;
import p003X.C106862S5w;
import p003X.KM9;

/* renamed from: com.bytedance.android.live.broadcast.api.model.w */
/* loaded from: classes5.dex */
public final class C2920w {
    public static ChangeQuickRedirect LIZ;
    public final String LIZIZ = "PreviewSourcePayLoadContent[" + hashCode() + LoggerUtil.M_RIGHT_TAG;
    public Map<String, String> LIZJ = new LinkedHashMap();

    static {
        Covode.recordClassIndex(14576);
    }

    public final <T> T LIZ(String str, Class<T> cls, T t) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, cls, t}, this, LIZ, false, 7);
        if (proxy.isSupported) {
            return (T) proxy.result;
        }
        C106862S5w.LIZ(str, cls);
        String str2 = this.LIZJ.get(str);
        if (str2 == null) {
            String str3 = this.LIZIZ;
            ALogger.m15801d(str3, "return default value for key:" + str + ", value:" + t + ",caz null content");
            return t;
        }
        T t2 = (T) GsonProtectorUtils.fromJson(KM9.LIZ(), str2, (Class<Object>) cls);
        if (t2 == null) {
            String str4 = this.LIZIZ;
            ALogger.m15801d(str4, "return default value for key:" + str + ", value:" + t + ",caz null value");
            return t;
        }
        String str5 = this.LIZIZ;
        ALogger.m15801d(str5, "get PreviewSourcePayLoadContent for key:" + str + ", value:" + t2);
        return t2;
    }
}
