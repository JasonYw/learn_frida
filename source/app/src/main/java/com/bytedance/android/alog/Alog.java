package com.bytedance.android.alog;

import android.content.Context;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.android.ugc.aweme.experiment.ReDexClinitStringAb;
import java.util.ArrayList;
import p003X.C0IS;
import p003X.C114554V7s;
import p003X.RunnableC115324VaY;
import p003X.VY5;

/* loaded from: classes13.dex */
public class Alog {
    public static ChangeQuickRedirect LIZ;
    public static final int LIZIZ;
    public static final int LIZJ;
    public static final int LIZLLL;

    /* renamed from: LJ */
    public static final int f25610LJ;
    public static final int LJFF;
    public static final int LJI;
    public static final ArrayList<String> LJII;
    public static boolean LJIIIIZZ;
    public Context LJIIIZ;
    public int LJIIJ;
    public String LJIIJJI;
    public String LJIIL;
    public int LJIILIIL;
    public int LJIILJJIL;
    public String LJIILL;
    public String LJIILLIIL;
    public long LJIIZILJ;

    public static native void nativeAsyncFlush(long j);

    public static native long nativeCreate(int i, boolean z, String str, String str2, int i2, int i3, int i4, String str3, int i5, int i6, String str4, int i7, int i8, int i9, int i10, int i11, int i12, String str5);

    public static native void nativeDestroy(long j);

    public static native long nativeGetLegacyFlushFuncAddr();

    public static native long nativeGetLegacyGetLogFileDirFuncAddr();

    public static native long nativeGetLegacyWriteFuncAddr();

    public static native long nativeGetNativeWriteFuncAddr();

    public static native void nativeSetDefaultInstance(long j);

    public static native void nativeSetLevel(long j, int i);

    public static native void nativeSetSyslog(long j, boolean z);

    public static native void nativeSyncFlush(long j);

    public static native void nativeTimedSyncFlush(long j, int i);

    public static native void nativeWrite(long j, int i, String str, String str2);

    public static native void nativeWriteAsyncMsg(long j, int i, String str, String str2, long j2, long j3);

    /* loaded from: classes13.dex */
    public enum AsymCrypt {
        NONE(0),
        EC_SECP256K1(1),
        EC_SECP256R1(2);
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public final int value;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static AsymCrypt[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            if (proxy.isSupported) {
                return (AsymCrypt[]) proxy.result;
            }
            return (AsymCrypt[]) values().clone();
        }

        static {
            Covode.recordClassIndex(10428);
        }

        public static AsymCrypt valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (AsymCrypt) proxy.result;
            }
            return (AsymCrypt) Enum.valueOf(AsymCrypt.class, str);
        }

        AsymCrypt(int i) {
            this.value = i;
        }
    }

    /* loaded from: classes13.dex */
    public enum Compress {
        NONE(0),
        ZLIB(1),
        ZSTD(2);
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public final int value;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static Compress[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            if (proxy.isSupported) {
                return (Compress[]) proxy.result;
            }
            return (Compress[]) values().clone();
        }

        static {
            Covode.recordClassIndex(10429);
        }

        public static Compress valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (Compress) proxy.result;
            }
            return (Compress) Enum.valueOf(Compress.class, str);
        }

        Compress(int i) {
            this.value = i;
        }
    }

    /* loaded from: classes13.dex */
    public enum Mode {
        SPEED(0),
        SAFE(1);
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public final int value;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static Mode[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            if (proxy.isSupported) {
                return (Mode[]) proxy.result;
            }
            return (Mode[]) values().clone();
        }

        static {
            Covode.recordClassIndex(10430);
        }

        public static Mode valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (Mode) proxy.result;
            }
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        Mode(int i) {
            this.value = i;
        }
    }

    /* loaded from: classes13.dex */
    public enum PrefixFormat {
        DEFAULT(0),
        LEGACY(1);
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public final int value;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static PrefixFormat[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            if (proxy.isSupported) {
                return (PrefixFormat[]) proxy.result;
            }
            return (PrefixFormat[]) values().clone();
        }

        static {
            Covode.recordClassIndex(10431);
        }

        public static PrefixFormat valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (PrefixFormat) proxy.result;
            }
            return (PrefixFormat) Enum.valueOf(PrefixFormat.class, str);
        }

        PrefixFormat(int i) {
            this.value = i;
        }
    }

    /* loaded from: classes13.dex */
    public enum SymCrypt {
        NONE(0),
        TEA_16(1),
        TEA_32(2),
        TEA_64(3);
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public final int value;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static SymCrypt[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            if (proxy.isSupported) {
                return (SymCrypt[]) proxy.result;
            }
            return (SymCrypt[]) values().clone();
        }

        static {
            Covode.recordClassIndex(10432);
        }

        public static SymCrypt valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (SymCrypt) proxy.result;
            }
            return (SymCrypt) Enum.valueOf(SymCrypt.class, str);
        }

        SymCrypt(int i) {
            this.value = i;
        }
    }

    /* loaded from: classes13.dex */
    public enum TimeFormat {
        RAW(0),
        ISO_8601(1);
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public final int value;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static TimeFormat[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            if (proxy.isSupported) {
                return (TimeFormat[]) proxy.result;
            }
            return (TimeFormat[]) values().clone();
        }

        static {
            Covode.recordClassIndex(10433);
        }

        public static TimeFormat valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (TimeFormat) proxy.result;
            }
            return (TimeFormat) Enum.valueOf(TimeFormat.class, str);
        }

        TimeFormat(int i) {
            this.value = i;
        }
    }

    public void finalize() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        try {
            super.finalize();
        } finally {
            LIZ();
        }
    }

    static {
        if (ReDexClinitStringAb.abTest >= 3) {
            clinit$r$fake();
            return;
        }
        Covode.recordClassIndex(10426);
        LIZIZ = Mode.SAFE.value;
        LIZJ = TimeFormat.RAW.value;
        LIZLLL = PrefixFormat.DEFAULT.value;
        f25610LJ = Compress.ZSTD.value;
        LJFF = SymCrypt.TEA_16.value;
        LJI = AsymCrypt.EC_SECP256K1.value;
        LJII = new ArrayList<>();
        LJIIIIZZ = false;
    }

    private static void clinit$r$fake() {
        Covode.recordClassIndex(10426);
        LIZIZ = Mode.SAFE.value;
        LIZJ = TimeFormat.RAW.value;
        LIZLLL = PrefixFormat.DEFAULT.value;
        f25610LJ = Compress.ZSTD.value;
        LJFF = SymCrypt.TEA_16.value;
        LJI = AsymCrypt.EC_SECP256K1.value;
        LJII = new ArrayList<>();
        LJIIIIZZ = false;
    }

    public final void LIZIZ() {
        MethodCollector.m14708i(910);
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            MethodCollector.m14707o(910);
            return;
        }
        long j = this.LJIIZILJ;
        if (j != 0) {
            nativeAsyncFlush(j);
        }
        MethodCollector.m14707o(910);
    }

    public final void LIZJ() {
        MethodCollector.m14708i(911);
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            MethodCollector.m14707o(911);
            return;
        }
        long j = this.LJIIZILJ;
        if (j != 0) {
            nativeSyncFlush(j);
        }
        MethodCollector.m14707o(911);
    }

    public final void LIZ() {
        MethodCollector.m14708i(908);
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            MethodCollector.m14707o(908);
            return;
        }
        synchronized (this) {
            try {
                if (this.LJIIZILJ != 0) {
                    this.LJIIIZ = null;
                    this.LJIIJ = 6;
                    nativeDestroy(this.LJIIZILJ);
                    this.LJIIZILJ = 0L;
                }
            } catch (Throwable th) {
                MethodCollector.m14707o(908);
                throw th;
            }
        }
        MethodCollector.m14707o(908);
    }

    public static synchronized void LIZ(VY5 vy5) {
        synchronized (Alog.class) {
            MethodCollector.m14708i(906);
            if (PatchProxy.proxy(new Object[]{vy5}, null, LIZ, true, 2).isSupported) {
                MethodCollector.m14707o(906);
            } else if (LJIIIIZZ) {
                MethodCollector.m14707o(906);
            } else {
                vy5.LIZ("alog");
                LJIIIIZZ = true;
                MethodCollector.m14707o(906);
            }
        }
    }

    public final void LIZIZ(int i) {
        MethodCollector.m14708i(913);
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 10).isSupported) {
            MethodCollector.m14707o(913);
            return;
        }
        long j = this.LJIIZILJ;
        if (j != 0) {
            nativeSetLevel(j, i);
        }
        MethodCollector.m14707o(913);
    }

    public final void LIZ(int i) {
        MethodCollector.m14708i(912);
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 9).isSupported) {
            MethodCollector.m14707o(912);
            return;
        }
        long j = this.LJIIZILJ;
        if (j != 0) {
            nativeTimedSyncFlush(j, i);
        }
        MethodCollector.m14707o(912);
    }

    public final void LIZ(boolean z) {
        MethodCollector.m14708i(914);
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 11).isSupported) {
            MethodCollector.m14707o(914);
            return;
        }
        long j = this.LJIIZILJ;
        if (j != 0) {
            nativeSetSyslog(j, z);
        }
        MethodCollector.m14707o(914);
    }

    private void LJFF(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, LIZ, false, 27).isSupported) {
            return;
        }
        LIZ(3, str, str2);
    }

    private void LJI(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, LIZ, false, 30).isSupported) {
            return;
        }
        LIZ(4, str, str2);
    }

    public final void LIZ(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, LIZ, false, 18).isSupported) {
            return;
        }
        LIZ(0, str, str2);
    }

    public final void LIZIZ(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, LIZ, false, 21).isSupported) {
            return;
        }
        LIZ(1, str, str2);
    }

    public final void LIZJ(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, LIZ, false, 24).isSupported) {
            return;
        }
        LIZ(2, str, str2);
    }

    public final void LIZLLL(String str, String str2) {
        if (!PatchProxy.proxy(new Object[]{str, str2}, this, LIZ, false, 26).isSupported && !PatchProxy.proxy(new Object[]{this, str, str2}, null, LIZ, true, 25).isSupported) {
            if (!C0IS.LIZ()) {
                LJFF(str, str2);
            } else if (Looper.myLooper() != C114554V7s.LIZIZ) {
                LJFF(str, str2);
            } else {
                C114554V7s.LIZ.submit(new RunnableC115324VaY(this, 3, str, str2));
            }
        }
    }

    /* renamed from: LJ */
    public final void m15989LJ(String str, String str2) {
        if (!PatchProxy.proxy(new Object[]{str, str2}, this, LIZ, false, 29).isSupported && !PatchProxy.proxy(new Object[]{this, str, str2}, null, LIZ, true, 28).isSupported) {
            if (!C0IS.LIZ()) {
                LJI(str, str2);
            } else if (Looper.myLooper() != C114554V7s.LIZIZ) {
                LJI(str, str2);
            } else {
                C114554V7s.LIZ.submit(new RunnableC115324VaY(this, 4, str, str2));
            }
        }
    }

    public final void LIZ(int i, String str, String str2) {
        MethodCollector.m14708i(909);
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, str2}, this, LIZ, false, 5).isSupported) {
            MethodCollector.m14707o(909);
            return;
        }
        long j = this.LJIIZILJ;
        if (j != 0 && i >= this.LJIIJ && str != null && str2 != null) {
            nativeWrite(j, i, str, str2);
        }
        MethodCollector.m14707o(909);
    }

    public Alog(Context context, int i, boolean z, String str, String str2, int i2, int i3, int i4, String str3, int i5, int i6, String str4, int i7, int i8, int i9, int i10, int i11, int i12, String str5) {
        MethodCollector.m14708i(907);
        this.LJIIIZ = context;
        this.LJIIJ = i;
        this.LJIIJJI = str2;
        this.LJIIL = str3;
        this.LJIILIIL = i5;
        this.LJIILJJIL = i6 / i5;
        this.LJIILLIIL = str;
        this.LJIIZILJ = nativeCreate(i, z, str, str2, i2, i3, i4, str3, i5, i6, str4, i7, i8, i9, i10, i11, i12, str5);
        MethodCollector.m14707o(907);
    }
}
