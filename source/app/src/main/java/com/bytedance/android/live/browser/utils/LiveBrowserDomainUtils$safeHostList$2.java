package com.bytedance.android.live.browser.utils;

import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC88741Kxr;

/* loaded from: classes8.dex */
public final class LiveBrowserDomainUtils$safeHostList$2 extends Lambda implements Function0<ArrayList<String>> {
    public static final LiveBrowserDomainUtils$safeHostList$2 INSTANCE = new LiveBrowserDomainUtils$safeHostList$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(23079);
    }

    public LiveBrowserDomainUtils$safeHostList$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.ArrayList<java.lang.String>, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ ArrayList<String> mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        ArrayList<String> arrayListOf = CollectionsKt__CollectionsKt.arrayListOf("snssdk.com", "toutiao.com", "toutiaoapi.com ", "neihanshequ.com", "youdianyisi.com", "admin.bytedance.com", "bytecdn.cn", "fe.byted.org", "jinritemai.com", "chengzijianzhan.com", "bytedance.net", "amemv.com", "live.bytedance.com", "test-live.bytedance.com", "live.juliangyinqing.com", "huoshan.com", "ixigua.com", "pstatp.com", "bytedance.net", "boe-gateway.byted.org");
        IService service = ServiceManager.getService(AbstractC88741Kxr.class);
        Intrinsics.checkNotNullExpressionValue(service, "");
        arrayListOf.addAll(((AbstractC88741Kxr) service).LIZ());
        SettingKey<List<String>> settingKey = LiveConfigSettingKeys.LIVE_JS_WHITE_LIST;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        arrayListOf.addAll(settingKey.getValue());
        return arrayListOf;
    }
}
