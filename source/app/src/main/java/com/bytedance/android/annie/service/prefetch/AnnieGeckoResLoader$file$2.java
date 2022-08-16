package com.bytedance.android.annie.service.prefetch;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.PLJ;

/* loaded from: classes7.dex */
public final class AnnieGeckoResLoader$file$2 extends Lambda implements Function0<File> {
    public static final AnnieGeckoResLoader$file$2 INSTANCE = new AnnieGeckoResLoader$file$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(11149);
    }

    public AnnieGeckoResLoader$file$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.io.File] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ File mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new File(PLJ.LIZ());
    }
}
