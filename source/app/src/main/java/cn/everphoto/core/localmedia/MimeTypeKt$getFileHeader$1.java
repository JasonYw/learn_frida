package cn.everphoto.core.localmedia;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.CharsKt__CharJVMKt;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes8.dex */
public final class MimeTypeKt$getFileHeader$1 extends Lambda implements Function1<Byte, String> {
    public static final MimeTypeKt$getFileHeader$1 INSTANCE = new MimeTypeKt$getFileHeader$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(3612);
    }

    public MimeTypeKt$getFileHeader$1() {
        super(1);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.lang.String] */
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ String invoke(Byte b) {
        byte byteValue = b.byteValue();
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Byte.valueOf(byteValue)}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        CharsKt__CharJVMKt.checkRadix(16);
        CharsKt__CharJVMKt.checkRadix(16);
        String num = Integer.toString(byteValue, 16);
        Intrinsics.checkExpressionValueIsNotNull(num, "");
        return StringsKt__StringsKt.padStart(num, 2, '0');
    }
}
