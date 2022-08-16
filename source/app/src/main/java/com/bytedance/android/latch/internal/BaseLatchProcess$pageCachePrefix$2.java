package com.bytedance.android.latch.internal;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC137655ckl;

/* loaded from: classes7.dex */
public final class BaseLatchProcess$pageCachePrefix$2 extends Lambda implements Function0<String> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ AbstractC137655ckl this$0;

    static {
        Covode.recordClassIndex(13708);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseLatchProcess$pageCachePrefix$2(AbstractC137655ckl abstractC137655ckl) {
        super(0);
        this.this$0 = abstractC137655ckl;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.Object, java.lang.String] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ String mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        Uri parse = Uri.parse(this.this$0.LJIIIZ);
        Uri.Builder builder = new Uri.Builder();
        Intrinsics.checkExpressionValueIsNotNull(parse, "");
        return builder.scheme(parse.getScheme()).authority(parse.getAuthority()).path(parse.getPath()).build().toString();
    }
}
