package com.bytedance.android.live.broadcast.api.model;

import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.GsonProtectorUtils;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.KJC;
import p003X.KM9;

/* renamed from: com.bytedance.android.live.broadcast.api.model.v */
/* loaded from: classes5.dex */
public final class C2919v {
    public static ChangeQuickRedirect LIZ;
    public static final KJC LIZJ = new KJC((byte) 0);
    public Map<String, C2920w> LIZIZ = new LinkedHashMap();

    static {
        Covode.recordClassIndex(14573);
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 8);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, C2920w> entry : this.LIZIZ.entrySet()) {
            for (Map.Entry<String, String> entry2 : entry.getValue().LIZJ.entrySet()) {
                arrayList.add(CollectionsKt__CollectionsKt.arrayListOf(entry.getKey(), entry2.getKey(), entry2.getValue()));
            }
        }
        String json = GsonProtectorUtils.toJson(KM9.LIZ(), arrayList);
        ALogger.m15801d("PreviewSourcePayLoad", "to String Cost:" + (System.currentTimeMillis() - currentTimeMillis));
        Intrinsics.checkNotNullExpressionValue(json, "");
        return json;
    }

    public final <T> void LIZ(String str, String str2, T t) {
        if (PatchProxy.proxy(new Object[]{str, str2, t}, this, LIZ, false, 7).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, str2, t);
        PreviewSourcePayLoad$putPayLoad$1 previewSourcePayLoad$putPayLoad$1 = new PreviewSourcePayLoad$putPayLoad$1(t, str2);
        C2920w c2920w = this.LIZIZ.get(str);
        if (c2920w != null) {
            previewSourcePayLoad$putPayLoad$1.LIZ(c2920w);
            ALogger.m15801d("PreviewSourcePayLoad", "put payload for " + str + '-' + str2 + '-' + t + " success");
            return;
        }
        C2920w c2920w2 = new C2920w();
        previewSourcePayLoad$putPayLoad$1.LIZ(c2920w2);
        this.LIZIZ.put(str, c2920w2);
        ALogger.m15801d("PreviewSourcePayLoad", "create payload for " + str + '-' + str2 + '-' + t + " success");
    }
}
