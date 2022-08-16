package bytekn.foundation.p032io.file;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: bytekn.foundation.io.file.FileManager$buildStats$fileType$1 */
/* loaded from: classes13.dex */
public final class FileManager$buildStats$fileType$1 extends Lambda implements Function0<FileType> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ File $file;

    static {
        Covode.recordClassIndex(2639);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileManager$buildStats$fileType$1(File file) {
        super(0);
        this.$file = file;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, bytekn.foundation.io.file.FileType] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ FileType mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        if (this.$file.isDirectory()) {
            return FileType.Directory;
        }
        if (this.$file.isFile()) {
            return FileType.Regular;
        }
        return FileType.Unknown;
    }
}
