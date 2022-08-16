package com.android.ttcjpaysdk.integrated.counter.outerpay;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;

/* loaded from: classes17.dex */
public final class CJOuterPayManager {
    public static ChangeQuickRedirect LIZ;
    public static final CJOuterPayManager LIZIZ = new CJOuterPayManager();

    static {
        Covode.recordClassIndex(7822);
    }

    /* loaded from: classes17.dex */
    public enum OuterType {
        TYPE_THIRD_APP,
        TYPE_BROWSER,
        TYPE_UNKNOWN;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        public static OuterType valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (OuterType) (proxy.isSupported ? proxy.result : Enum.valueOf(OuterType.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static OuterType[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (OuterType[]) (proxy.isSupported ? proxy.result : values().clone());
        }

        static {
            Covode.recordClassIndex(7823);
        }
    }

    public final OuterType LIZ(Map<?, ?> map) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{map}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (OuterType) proxy.result;
        }
        if (map != null) {
            if (map.containsKey("payInfo")) {
                return OuterType.TYPE_THIRD_APP;
            }
            if (map.containsKey("token")) {
                return OuterType.TYPE_BROWSER;
            }
            return OuterType.TYPE_UNKNOWN;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<K, *>");
    }

    public final Map<String, String> LIZ(Uri uri) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{uri}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        C106862S5w.LIZ(uri);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            for (String str : uri.getQueryParameterNames()) {
                Intrinsics.checkNotNullExpressionValue(str, "");
                linkedHashMap.put(str, uri.getQueryParameter(str));
            }
        } catch (Exception unused) {
        }
        return linkedHashMap;
    }
}
