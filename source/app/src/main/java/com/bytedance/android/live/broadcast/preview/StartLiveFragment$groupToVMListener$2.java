package com.bytedance.android.live.broadcast.preview;

import com.bytedance.android.live.broadcast.preview.externalframework.p276b.C3179b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.KJV;

/* loaded from: classes5.dex */
public final class StartLiveFragment$groupToVMListener$2 extends Lambda implements Function0<C3179b> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ KJV this$0;

    static {
        Covode.recordClassIndex(17116);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartLiveFragment$groupToVMListener$2(KJV kjv) {
        super(0);
        this.this$0 = kjv;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, com.bytedance.android.live.broadcast.preview.externalframework.b.b] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C3179b mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C3179b(this.this$0.LIZJ());
    }
}
