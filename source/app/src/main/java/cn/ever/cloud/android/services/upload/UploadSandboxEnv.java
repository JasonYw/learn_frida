package cn.ever.cloud.android.services.upload;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Objects;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class UploadSandboxEnv {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final boolean copyToSandbox;
    public final long crc;
    public final String md5;
    public final String sandboxPath;
    public final long size;
    public boolean uploadPass;

    static {
        Covode.recordClassIndex(3143);
    }

    public static /* synthetic */ UploadSandboxEnv copy$default(UploadSandboxEnv uploadSandboxEnv, String str, String str2, long j, long j2, boolean z, int i, Object obj) {
        byte b = z ? (byte) 1 : (byte) 0;
        byte b2 = z ? (byte) 1 : (byte) 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{uploadSandboxEnv, str, str2, new Long(j), new Long(j2), Byte.valueOf(b), Integer.valueOf(i), obj}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (UploadSandboxEnv) proxy.result;
        }
        if ((i & 1) != 0) {
            str = uploadSandboxEnv.sandboxPath;
        }
        if ((i & 2) != 0) {
            str2 = uploadSandboxEnv.md5;
        }
        if ((i & 4) != 0) {
            j = uploadSandboxEnv.crc;
        }
        if ((i & 8) != 0) {
            j2 = uploadSandboxEnv.size;
        }
        if ((i & 16) != 0) {
            z = uploadSandboxEnv.copyToSandbox;
        }
        return uploadSandboxEnv.copy(str, str2, j, j2, z);
    }

    private Object[] getObjects() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{this.sandboxPath, this.md5, Long.valueOf(this.crc), Long.valueOf(this.size), Boolean.valueOf(this.copyToSandbox)};
    }

    public final String component1() {
        return this.sandboxPath;
    }

    public final String component2() {
        return this.md5;
    }

    public final long component3() {
        return this.crc;
    }

    public final long component4() {
        return this.size;
    }

    public final boolean component5() {
        return this.copyToSandbox;
    }

    public final UploadSandboxEnv copy(String str, String str2, long j, long j2, boolean z) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2, new Long(j), new Long(j2), Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (UploadSandboxEnv) proxy.result;
        }
        C106862S5w.LIZ(str, str2);
        return new UploadSandboxEnv(str, str2, j, j2, z);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof UploadSandboxEnv) {
            return C106862S5w.LIZ(((UploadSandboxEnv) obj).getObjects(), getObjects());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(getObjects());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("UploadSandboxEnv:%s,%s,%s,%s,%s", getObjects());
    }

    public final boolean getCopyToSandbox() {
        return this.copyToSandbox;
    }

    public final long getCrc() {
        return this.crc;
    }

    public final String getMd5() {
        return this.md5;
    }

    public final String getSandboxPath() {
        return this.sandboxPath;
    }

    public final long getSize() {
        return this.size;
    }

    public final boolean getUploadPass() {
        return this.uploadPass;
    }

    public final void setUploadPass(boolean z) {
        this.uploadPass = z;
    }

    public UploadSandboxEnv(String str, String str2, long j, long j2, boolean z) {
        C106862S5w.LIZ(str, str2);
        this.sandboxPath = str;
        this.md5 = str2;
        this.crc = j;
        this.size = j2;
        this.copyToSandbox = z;
    }
}
