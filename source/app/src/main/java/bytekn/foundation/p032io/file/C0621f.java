package bytekn.foundation.p032io.file;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.FileOutputStream;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC103423Qo5;
import p003X.C106862S5w;

/* renamed from: bytekn.foundation.io.file.f */
/* loaded from: classes4.dex */
public class C0621f implements AbstractC103423Qo5 {
    public static ChangeQuickRedirect LIZ;
    public FileOutputStream LIZIZ;

    static {
        Covode.recordClassIndex(2650);
    }

    public final FileOutputStream LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (FileOutputStream) proxy.result;
        }
        FileOutputStream fileOutputStream = this.LIZIZ;
        if (fileOutputStream == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return fileOutputStream;
    }

    @Override // p003X.AbstractC103423Qo5
    public void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        FileOutputStream fileOutputStream = this.LIZIZ;
        if (fileOutputStream == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            fileOutputStream.close();
        }
    }

    public void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        FileOutputStream fileOutputStream = this.LIZIZ;
        if (fileOutputStream == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            fileOutputStream.close();
        }
    }

    public final void LIZ(FileOutputStream fileOutputStream) {
        if (PatchProxy.proxy(new Object[]{fileOutputStream}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(fileOutputStream);
        this.LIZIZ = fileOutputStream;
    }

    public void LIZ(byte[] bArr, int i, int i2) {
        MethodCollector.m14708i(162);
        if (PatchProxy.proxy(new Object[]{bArr, Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 5).isSupported) {
            MethodCollector.m14707o(162);
            return;
        }
        C106862S5w.LIZ(bArr);
        FileOutputStream fileOutputStream = this.LIZIZ;
        if (fileOutputStream == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            MethodCollector.m14707o(162);
            return;
        }
        fileOutputStream.write(bArr, i, i2);
        MethodCollector.m14707o(162);
    }
}
