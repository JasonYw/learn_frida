package cn.ever.cloud.network_impl;

import cn.ever.cloud.network.entity.NUploadChunkRequest;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;

/* loaded from: classes12.dex */
public final class DataConverterKt {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(3259);
    }

    public static final Map<String, String> toQueryMap(NUploadChunkRequest nUploadChunkRequest) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{nUploadChunkRequest}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        C106862S5w.LIZ(nUploadChunkRequest);
        HashMap hashMap = new HashMap();
        JsonElement jsonTree = GsonProtectorUtils.toJsonTree(new Gson(), nUploadChunkRequest);
        Intrinsics.checkNotNullExpressionValue(jsonTree, "");
        for (Map.Entry<String, JsonElement> entry : jsonTree.getAsJsonObject().entrySet()) {
            String key = entry.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "");
            JsonElement value = entry.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            String asString = value.getAsString();
            Intrinsics.checkNotNullExpressionValue(asString, "");
            hashMap.put(key, asString);
        }
        return hashMap;
    }
}
