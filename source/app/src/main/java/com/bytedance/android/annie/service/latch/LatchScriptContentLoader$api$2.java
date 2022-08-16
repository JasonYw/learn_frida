package com.bytedance.android.annie.service.latch;

import com.bytedance.android.annie.service.latch.LatchScriptContentLoader;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.retrofit2.Retrofit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.QR8;

/* loaded from: classes7.dex */
public final class LatchScriptContentLoader$api$2 extends Lambda implements Function0<LatchScriptContentLoader.ILatchRetrofitApi> {
    public static final LatchScriptContentLoader$api$2 INSTANCE = new LatchScriptContentLoader$api$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(11088);
    }

    public LatchScriptContentLoader$api$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, com.bytedance.android.annie.service.latch.LatchScriptContentLoader$ILatchRetrofitApi] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, com.bytedance.android.annie.service.latch.LatchScriptContentLoader$ILatchRetrofitApi] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ LatchScriptContentLoader.ILatchRetrofitApi mo30099invoke() {
        Retrofit LIZ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        QR8 qr8 = QR8.LIZIZ;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{qr8, "https://your.api.url/", (byte) 0, 2, null}, null, QR8.LIZ, true, 2);
        if (proxy2.isSupported) {
            LIZ = (Retrofit) proxy2.result;
        } else {
            LIZ = qr8.LIZ("https://your.api.url/", false);
        }
        return LIZ.create(LatchScriptContentLoader.ILatchRetrofitApi.class);
    }
}
