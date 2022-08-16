package com.bytedance.android.annie.card;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.JsonObject;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class ContainerInitialPropsManager$mInitialProps$2 extends Lambda implements Function0<HashMap<String, JsonObject>> {
    public static final ContainerInitialPropsManager$mInitialProps$2 INSTANCE = new ContainerInitialPropsManager$mInitialProps$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(10664);
    }

    public ContainerInitialPropsManager$mInitialProps$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.HashMap<java.lang.String, com.google.gson.JsonObject>, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ HashMap<String, JsonObject> mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new HashMap<>();
    }
}
