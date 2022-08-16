package com.android.ttcjpaysdk.base.p132h5.jsb;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.android.ttcjpaysdk.base.h5.jsb.JSBMediaUtil$uploadMedia$1$1$file$2 */
/* loaded from: classes13.dex */
public final class JSBMediaUtil$uploadMedia$1$1$file$2 extends Lambda implements Function0<File> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ String $path;

    static {
        Covode.recordClassIndex(6146);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JSBMediaUtil$uploadMedia$1$1$file$2(String str) {
        super(0);
        this.$path = str;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.io.File] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ File mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        String str = this.$path;
        if (str == null) {
            str = "";
        }
        return new File(str);
    }
}
