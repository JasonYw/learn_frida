package com.bytedance.android.live.playtogether.reportpanel;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C89627LSz;

/* loaded from: classes5.dex */
public final class ImagePickerController$context$2 extends Lambda implements Function0<Context> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C89627LSz this$0;

    static {
        Covode.recordClassIndex(33085);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImagePickerController$context$2(C89627LSz c89627LSz) {
        super(0);
        this.this$0 = c89627LSz;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [android.content.Context, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Context mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return this.this$0.LIZJ.getContext();
    }
}
