package com.bytedance.android.annie.service.data;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.PTD;

/* loaded from: classes7.dex */
public final class DataProviderService$preDealProps$1$2 extends Lambda implements Function1<String, Pair<? extends String, ? extends String>> {
    public static final DataProviderService$preDealProps$1$2 INSTANCE = new DataProviderService$preDealProps$1$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(11026);
    }

    public DataProviderService$preDealProps$1$2() {
        super(1);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, kotlin.Pair<? extends java.lang.String, ? extends java.lang.String>] */
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Pair<? extends String, ? extends String> invoke(String str) {
        String str2 = str;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str2}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C106862S5w.LIZ(str2);
        return PTD.LJFF.LIZ(str2);
    }
}
