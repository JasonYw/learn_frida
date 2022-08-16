package com.android.ttcjpaysdk.base.p132h5.jsb;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C7D7;

/* renamed from: com.android.ttcjpaysdk.base.h5.jsb.ImageCompressUtil$compressStrictly$seq$1 */
/* loaded from: classes23.dex */
public final class ImageCompressUtil$compressStrictly$seq$1 extends Lambda implements Function1<Integer, byte[]> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Bitmap $bitmap;

    static {
        Covode.recordClassIndex(6134);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageCompressUtil$compressStrictly$seq$1(Bitmap bitmap) {
        super(1);
        this.$bitmap = bitmap;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [byte[], java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ byte[] invoke(Integer num) {
        int intValue = num.intValue();
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(intValue)}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return C7D7.LIZIZ.LIZ(this.$bitmap, intValue);
    }
}
