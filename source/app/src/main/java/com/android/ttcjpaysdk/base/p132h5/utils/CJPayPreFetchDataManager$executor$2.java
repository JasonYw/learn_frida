package com.android.ttcjpaysdk.base.p132h5.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C116971W2r;

/* renamed from: com.android.ttcjpaysdk.base.h5.utils.CJPayPreFetchDataManager$executor$2 */
/* loaded from: classes13.dex */
public final class CJPayPreFetchDataManager$executor$2 extends Lambda implements Function0<ExecutorService> {
    public static final CJPayPreFetchDataManager$executor$2 INSTANCE = new CJPayPreFetchDataManager$executor$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(6181);
    }

    public CJPayPreFetchDataManager$executor$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.concurrent.ExecutorService] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ ExecutorService mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return C116971W2r.LIZLLL();
    }
}
