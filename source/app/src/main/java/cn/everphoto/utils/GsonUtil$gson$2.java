package cn.everphoto.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.Gson;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes9.dex */
public final class GsonUtil$gson$2 extends Lambda implements Function0<Gson> {
    public static final GsonUtil$gson$2 INSTANCE = new GsonUtil$gson$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(3854);
    }

    public GsonUtil$gson$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.gson.Gson, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Gson mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new Gson();
    }
}
