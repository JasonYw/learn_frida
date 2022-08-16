package bytekn.foundation.p032io.file;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import p002O.C0002O;
import p003X.C106862S5w;

/* renamed from: bytekn.foundation.io.file.g */
/* loaded from: classes4.dex */
public final class C0622g {
    public static ChangeQuickRedirect LIZ;
    public final String LIZIZ;
    public final File LIZJ;

    static {
        Covode.recordClassIndex(2651);
    }

    public final String toString() {
        String str;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        String str2 = this.LIZIZ;
        File file = this.LIZJ;
        String str3 = null;
        if (file != null) {
            str = file.getCanonicalPath();
        } else {
            str = null;
        }
        File file2 = this.LIZJ;
        if (file2 != null) {
            str3 = file2.getAbsolutePath();
        }
        return C0002O.m25081C("[component=", str2, ", canonicalPath=", str, ", absolutePath=", str3, Character.valueOf(LoggerUtil.M_RIGHT_TAG));
    }

    public C0622g(String str) {
        File file;
        this.LIZIZ = str;
        String str2 = this.LIZIZ;
        if (str2 != null) {
            file = new File(str2).getAbsoluteFile();
        } else {
            file = null;
        }
        this.LIZJ = file;
    }

    public final C0622g LIZ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (C0622g) proxy.result;
        }
        C106862S5w.LIZ(str);
        File file = this.LIZJ;
        if (file == null) {
            return null;
        }
        File absoluteFile = new File(file.getAbsolutePath(), str).getAbsoluteFile();
        Intrinsics.checkExpressionValueIsNotNull(absoluteFile, "");
        return new C0622g(absoluteFile.getAbsolutePath());
    }
}
