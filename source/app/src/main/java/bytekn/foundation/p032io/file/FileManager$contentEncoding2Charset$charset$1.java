package bytekn.foundation.p032io.file;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.nio.charset.Charset;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import p003X.C104013Qxb;

/* renamed from: bytekn.foundation.io.file.FileManager$contentEncoding2Charset$charset$1 */
/* loaded from: classes8.dex */
public final class FileManager$contentEncoding2Charset$charset$1 extends Lambda implements Function0<Charset> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ ContentEncoding $contentEncoding;

    static {
        Covode.recordClassIndex(2640);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileManager$contentEncoding2Charset$charset$1(ContentEncoding contentEncoding) {
        super(0);
        this.$contentEncoding = contentEncoding;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.nio.charset.Charset, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Charset mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        if (C104013Qxb.LIZJ[this.$contentEncoding.ordinal()] != 1) {
            return Charsets.UTF_8;
        }
        return Charsets.US_ASCII;
    }
}
