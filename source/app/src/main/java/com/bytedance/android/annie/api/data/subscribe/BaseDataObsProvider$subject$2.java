package com.bytedance.android.annie.api.data.subscribe;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.subjects.PublishSubject;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C5852198p;

/* loaded from: classes8.dex */
public final class BaseDataObsProvider$subject$2 extends Lambda implements Function0<PublishSubject<C5852198p<T>>> {
    public static final BaseDataObsProvider$subject$2 INSTANCE = new BaseDataObsProvider$subject$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(10469);
    }

    public BaseDataObsProvider$subject$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Object mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return PublishSubject.create();
    }
}
