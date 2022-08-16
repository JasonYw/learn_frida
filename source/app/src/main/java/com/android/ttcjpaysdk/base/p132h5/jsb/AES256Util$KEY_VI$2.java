package com.android.ttcjpaysdk.base.p132h5.jsb;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.security.SecureRandom;
import javax.crypto.spec.IvParameterSpec;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.android.ttcjpaysdk.base.h5.jsb.AES256Util$KEY_VI$2 */
/* loaded from: classes13.dex */
public final class AES256Util$KEY_VI$2 extends Lambda implements Function0<IvParameterSpec> {
    public static final AES256Util$KEY_VI$2 INSTANCE = new AES256Util$KEY_VI$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(6133);
    }

    public AES256Util$KEY_VI$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [javax.crypto.spec.IvParameterSpec, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ IvParameterSpec mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        return new IvParameterSpec(bArr);
    }
}
