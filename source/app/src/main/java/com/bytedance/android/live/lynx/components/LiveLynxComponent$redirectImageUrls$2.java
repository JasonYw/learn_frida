package com.bytedance.android.live.lynx.components;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class LiveLynxComponent$redirectImageUrls$2 extends Lambda implements Function0<List<Function1<? super String, ? extends String>>> {
    public static final LiveLynxComponent$redirectImageUrls$2 INSTANCE = new LiveLynxComponent$redirectImageUrls$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(32174);
    }

    public LiveLynxComponent$redirectImageUrls$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List<kotlin.jvm.functions.Function1<? super java.lang.String, ? extends java.lang.String>>, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ List<Function1<? super String, ? extends String>> mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new ArrayList();
    }
}
