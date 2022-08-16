package com.bytedance.android.annie.container.fragment;

import com.bytedance.android.annie.api.bridge.ShareInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class AnnieFragment$mShareInfo$2 extends Lambda implements Function0<ShareInfo> {
    public static final AnnieFragment$mShareInfo$2 INSTANCE = new AnnieFragment$mShareInfo$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(10752);
    }

    public AnnieFragment$mShareInfo$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.annie.api.bridge.ShareInfo, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ ShareInfo mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new ShareInfo();
    }
}
