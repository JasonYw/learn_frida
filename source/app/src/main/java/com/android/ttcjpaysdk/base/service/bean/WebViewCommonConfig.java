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
public final class WebViewCommonConfig {
    public static final Companion Companion = new Companion(null);
    public static ChangeQuickRedirect changeQuickRedirect;
    public ArrayList<String> integrated_host_replace_block_list;

    static {
        Covode.recordClassIndex(6552);
    }

    public WebViewCommonConfig() {
        this(null, 1, null);
    }

    @JvmStatic
    public static final WebViewCommonConfig fromJson(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 1);
        return proxy.isSupported ? (WebViewCommonConfig) proxy.result : Companion.fromJson(str);
    }

    /* loaded from: classes17.dex */
    public static final class Companion {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(6553);
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final WebViewCommonConfig fromJson(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return (WebViewCommonConfig) proxy.result;
            }
            C106862S5w.LIZ(str);
            WebViewCommonConfig webViewCommonConfig = new WebViewCommonConfig(null, 1, null);
            try {
                JSONArray optJSONArray = new JSONObject(str).optJSONArray("integrated_host_replace_block_list");
                Intrinsics.checkNotNullExpressionValue(optJSONArray, "");
                ReuseHostDomainKt.toStringList(optJSONArray, webViewCommonConfig.integrated_host_replace_block_list);
                return webViewCommonConfig;
            } catch (Exception e) {
                e.printStackTrace();
                return webViewCommonConfig;
            }
        }
    }

    public WebViewCommonConfig(ArrayList<String> arrayList) {
        C106862S5w.LIZ(arrayList);
        this.integrated_host_replace_block_list = arrayList;
    }

    public /* synthetic */ WebViewCommonConfig(ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : arrayList);
    }
}
