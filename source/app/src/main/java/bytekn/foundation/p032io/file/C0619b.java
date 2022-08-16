package bytekn.foundation.p032io.file;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC103423Qo5;
import p003X.C106862S5w;

/* renamed from: bytekn.foundation.io.file.b */
/* loaded from: classes4.dex */
public class C0619b implements AbstractC103423Qo5 {
    public static ChangeQuickRedirect LIZ;
    public InputStream LIZIZ;

    static {
        Covode.recordClassIndex(2646);
    }

    public final InputStream LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (InputStream) proxy.result;
        }
        InputStream inputStream = this.LIZIZ;
        if (inputStream == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return inputStream;
    }

    @Override // p003X.AbstractC103423Qo5
    public void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        InputStream inputStream = this.LIZIZ;
        if (inputStream == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        inputStream.close();
    }

    public final void LIZ(InputStream inputStream) {
        if (PatchProxy.proxy(new Object[]{inputStream}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(inputStream);
        this.LIZIZ = inputStream;
    }

    public int LIZ(byte[] bArr, int i, int i2) {
        MethodCollector.m14708i(154);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{bArr, 0, Integer.valueOf(i2)}, this, LIZ, false, 5);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(154);
            return intValue;
        }
        C106862S5w.LIZ(bArr);
        InputStream inputStream = this.LIZIZ;
        if (inputStream == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        int read = inputStream.read(bArr, 0, i2);
        MethodCollector.m14707o(154);
        return read;
    }
}
