package com.android.ttcjpaysdk.base.p132h5.jsb;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.android.ttcjpaysdk.base.h5.jsb.AES256Util$DEFAULT_SECRET_KEY$2 */
/* loaded from: classes19.dex */
public final class AES256Util$DEFAULT_SECRET_KEY$2 extends Lambda implements Function0<byte[]> {
    public static final AES256Util$DEFAULT_SECRET_KEY$2 INSTANCE = new AES256Util$DEFAULT_SECRET_KEY$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(6132);
    }

    public AES256Util$DEFAULT_SECRET_KEY$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [byte[], java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ byte[] mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(256);
        SecretKey generateKey = keyGenerator.generateKey();
        Intrinsics.checkNotNullExpressionValue(generateKey, "");
        return generateKey.getEncoded();
    }
}
