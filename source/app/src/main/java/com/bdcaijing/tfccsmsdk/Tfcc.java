package com.bdcaijing.tfccsmsdk;

import android.os.Looper;
import com.bytedance.bdp.service.plug.map.BuildConfig;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes17.dex */
public class Tfcc {
    public static ChangeQuickRedirect LIZ;
    public static int LIZLLL;
    public int LIZIZ;
    public int LIZJ;

    private native String tfccDecrypt(int i, int i2, String str, String str2);

    private native String tfccDecryptSymmetric(int i, String str, String str2, int i2, int i3, String str3);

    private native String tfccDecryptWithSM(int i, int i2, String str, String str2);

    private native void tfccDestory(int i);

    private native String tfccEncrypt(int i, int i2, String str, String str2);

    private native String tfccEncryptSymmetric(int i, String str, String str2, int i2, int i3, String str3);

    private native String tfccEncryptWithSM(int i, int i2, String str, String str2);

    /* loaded from: classes17.dex */
    public enum VXErrorCode {
        VXERR_OK(0),
        VXERR_INVAL_ARGS(-1),
        VXERR_DEC_RESPONSE(-3),
        VXERR_OUTOFMEMORY(-4),
        VXERR_NO_SYMKEY(-5),
        VXERR_SYMKEY_EXPIRED(-6),
        VXERR_CANCELED(-7),
        VXERR_NETQUERY(-8),
        VXERR_ENC_REQUEST_ASYMM(-9),
        VXERR_ENC_REQUEST_SYMM(-10),
        VXERR_DEC_DATA_FORMAT(-11),
        VXERR_ENC_REQUEST_PENDING(-12),
        VXERR_WRONG_THREAD(-13),
        VXERR_COMPRESS_DATA_FAILED(-20),
        VXERR_UNCOMPRESS_DATA_FAILED(-21),
        VXERR_UNKNOWN_EXCEPTION(-100);
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public int mCode;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static VXErrorCode[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            if (proxy.isSupported) {
                return (VXErrorCode[]) proxy.result;
            }
            return (VXErrorCode[]) values().clone();
        }

        @Override // java.lang.Enum
        public final String toString() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
            if (proxy.isSupported) {
                return (String) proxy.result;
            }
            return String.valueOf(this.mCode);
        }

        static {
            Covode.recordClassIndex(9498);
        }

        public static VXErrorCode valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (VXErrorCode) proxy.result;
            }
            return (VXErrorCode) Enum.valueOf(VXErrorCode.class, str);
        }

        VXErrorCode(int i) {
            this.mCode = i;
        }
    }

    static {
        Covode.recordClassIndex(9497);
        if (!PatchProxy.proxy(new Object[]{"cjtfccsm"}, null, C2461a.LIZ, true, 1).isSupported) {
            C2461a.LIZIZ.LIZ("cjtfccsm");
        }
    }

    public Tfcc() {
        MethodCollector.m14708i(589);
        synchronized (Tfcc.class) {
            try {
                int i = LIZLLL;
                LIZLLL = i + 1;
                this.LIZJ = i;
            } catch (Throwable th) {
                MethodCollector.m14707o(589);
                throw th;
            }
        }
        MethodCollector.m14707o(589);
    }

    public static boolean LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, LIZ, true, 11);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return false;
        }
        return true;
    }

    public void finalize() {
        MethodCollector.m14708i(592);
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported) {
            MethodCollector.m14707o(592);
            return;
        }
        tfccDestory(this.LIZJ);
        super.finalize();
        MethodCollector.m14707o(592);
    }

    public final String LIZ(String str, String str2, int[] iArr) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2, iArr}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return LIZ(1, str, str2, iArr);
    }

    public final String LIZIZ(String str, String str2, int[] iArr) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2, iArr}, this, LIZ, false, 7);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return LIZIZ(1, str, str2, iArr);
    }

    private String LIZ(int i, String str, String str2, int[] iArr) {
        String tfccEncryptWithSM;
        MethodCollector.m14708i(BuildConfig.VERSION_CODE);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{1, str, str2, iArr}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            String str3 = (String) proxy.result;
            MethodCollector.m14707o(BuildConfig.VERSION_CODE);
            return str3;
        } else if (str != null && !str.isEmpty()) {
            if (!LIZ()) {
                iArr[0] = VXErrorCode.VXERR_WRONG_THREAD.mCode;
                MethodCollector.m14707o(BuildConfig.VERSION_CODE);
                return null;
            }
            if (str2 != null) {
                try {
                    tfccEncryptWithSM = tfccEncryptWithSM(this.LIZJ, 1, str, str2);
                } catch (Throwable unused) {
                    iArr[0] = VXErrorCode.VXERR_UNKNOWN_EXCEPTION.mCode;
                    MethodCollector.m14707o(BuildConfig.VERSION_CODE);
                    return null;
                }
            } else {
                tfccEncryptWithSM = null;
            }
            if (iArr != null && iArr.length > 0) {
                iArr[0] = this.LIZIZ;
            }
            this.LIZIZ = 0;
            MethodCollector.m14707o(BuildConfig.VERSION_CODE);
            return tfccEncryptWithSM;
        } else {
            iArr[0] = VXErrorCode.VXERR_INVAL_ARGS.mCode;
            MethodCollector.m14707o(BuildConfig.VERSION_CODE);
            return null;
        }
    }

    private String LIZIZ(int i, String str, String str2, int[] iArr) {
        String tfccDecryptWithSM;
        MethodCollector.m14708i(591);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{1, str, str2, iArr}, this, LIZ, false, 9);
        if (proxy.isSupported) {
            String str3 = (String) proxy.result;
            MethodCollector.m14707o(591);
            return str3;
        } else if (str != null && !str.isEmpty()) {
            if (!LIZ()) {
                iArr[0] = VXErrorCode.VXERR_WRONG_THREAD.mCode;
                MethodCollector.m14707o(591);
                return null;
            }
            if (str2 != null) {
                try {
                    tfccDecryptWithSM = tfccDecryptWithSM(this.LIZJ, 1, str, str2);
                } catch (Throwable unused) {
                    iArr[0] = VXErrorCode.VXERR_UNKNOWN_EXCEPTION.mCode;
                    MethodCollector.m14707o(591);
                    return null;
                }
            } else {
                tfccDecryptWithSM = null;
            }
            if (iArr != null && iArr.length > 0) {
                iArr[0] = this.LIZIZ;
            }
            this.LIZIZ = 0;
            MethodCollector.m14707o(591);
            return tfccDecryptWithSM;
        } else {
            iArr[0] = VXErrorCode.VXERR_INVAL_ARGS.mCode;
            MethodCollector.m14707o(591);
            return null;
        }
    }
}
