package com.bytedance.android.annie.card.base;

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
import p003X.AbstractC90724Lok;
import p003X.C90746Lp6;
import p003X.PQT;

/* loaded from: classes8.dex */
public final class HybridDomainUtils$safeHostList$2 extends Lambda implements Function0<ArrayList<String>> {
    public static final HybridDomainUtils$safeHostList$2 INSTANCE = new HybridDomainUtils$safeHostList$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(10675);
    }

    public HybridDomainUtils$safeHostList$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.ArrayList<java.lang.String>, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ ArrayList<String> mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        ArrayList<String> arrayListOf = CollectionsKt__CollectionsKt.arrayListOf("snssdk.com", "toutiao.com", "toutiaoapi.com ", "neihanshequ.com", "youdianyisi.com", "admin.bytedance.com", "bytecdn.cn", "fe.byted.org", "jinritemai.com", "chengzijianzhan.com", "bytedance.net", "amemv.com", "live.bytedance.com", "test-live.bytedance.com", "live.juliangyinqing.com", "huoshan.com", "ixigua.com", "pstatp.com", "bytedance.net", "boe-gateway.byted.org");
        C90746Lp6<List<String>> c90746Lp6 = AbstractC90724Lok.LIZ;
        Intrinsics.checkNotNullExpressionValue(c90746Lp6, "");
        arrayListOf.addAll(c90746Lp6.LIZ());
        arrayListOf.addAll(PQT.LIZIZ.LIZ());
        return arrayListOf;
    }
}
