package com.android.ttcjpaysdk.base.service.bean;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;
import p003X.C106862S5w;

/* loaded from: classes17.dex */
public final class ReuseHostDomain {
    public static final Companion Companion = new Companion(null);
    public static ChangeQuickRedirect changeQuickRedirect;
    public String bd_host_domain;
    public ArrayList<String> h5_path_list;
    public String integrated_host_domain;

    static {
        Covode.recordClassIndex(6549);
    }

    public ReuseHostDomain() {
        this(null, null, null, 7, null);
    }

    @JvmStatic
    public static final ReuseHostDomain fromJson(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 1);
        return proxy.isSupported ? (ReuseHostDomain) proxy.result : Companion.fromJson(str);
    }

    /* loaded from: classes17.dex */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(6550);
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final ReuseHostDomain fromJson(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return (ReuseHostDomain) proxy.result;
            }
            C106862S5w.LIZ(str);
            ReuseHostDomain reuseHostDomain = new ReuseHostDomain(null, null, null, 7, null);
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("bd_host_domain");
                Intrinsics.checkNotNullExpressionValue(optString, "");
                reuseHostDomain.bd_host_domain = optString;
                String optString2 = jSONObject.optString("integrated_host_domain");
                Intrinsics.checkNotNullExpressionValue(optString2, "");
                reuseHostDomain.integrated_host_domain = optString2;
                JSONArray optJSONArray = jSONObject.optJSONArray("h5_path_list");
                Intrinsics.checkNotNullExpressionValue(optJSONArray, "");
                ReuseHostDomainKt.toStringList(optJSONArray, reuseHostDomain.h5_path_list);
                return reuseHostDomain;
            } catch (Exception e) {
                e.printStackTrace();
                return reuseHostDomain;
            }
        }
    }

    public ReuseHostDomain(String str, String str2, ArrayList<String> arrayList) {
        C106862S5w.LIZ(str, str2, arrayList);
        this.bd_host_domain = str;
        this.integrated_host_domain = str2;
        this.h5_path_list = arrayList;
    }

    public /* synthetic */ ReuseHostDomain(String str, String str2, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? new ArrayList() : arrayList);
    }
}
