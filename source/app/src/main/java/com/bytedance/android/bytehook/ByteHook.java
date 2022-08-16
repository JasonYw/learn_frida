package com.bytedance.android.bytehook;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC149997fyP;
import p003X.C116971W2r;
import p003X.C149995fyN;
import p003X.C149996fyO;

/* loaded from: classes20.dex */
public class ByteHook {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static final AbstractC149997fyP defaultLibLoader = null;
    public static boolean inited;
    public static int initStatus = 1;
    public static final int defaultMode = Mode.AUTOMATIC.value;

    public static native String nativeGetRecords();

    public static native int nativeInit(int i, boolean z);

    public static native void nativeSetDebug(boolean z);

    static {
        Covode.recordClassIndex(11528);
    }

    /* loaded from: classes2.dex */
    public enum Mode {
        AUTOMATIC(0),
        MANUAL(1);
        
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
            Covode.recordClassIndex(11529);
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

    public static String getRecords() {
        MethodCollector.m14708i(975);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 4);
        if (proxy.isSupported) {
            String str = (String) proxy.result;
            MethodCollector.m14707o(975);
            return str;
        } else if (initStatus == 0) {
            String nativeGetRecords = nativeGetRecords();
            MethodCollector.m14707o(975);
            return nativeGetRecords;
        } else {
            MethodCollector.m14707o(975);
            return null;
        }
    }

    public static int init() {
        C149996fyO c149996fyO;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (inited) {
            return initStatus;
        }
        C149995fyN c149995fyN = new C149995fyN();
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], c149995fyN, C149995fyN.LIZ, false, 1);
        if (proxy2.isSupported) {
            c149996fyO = (C149996fyO) proxy2.result;
        } else {
            c149996fyO = new C149996fyO();
            c149996fyO.LIZ = c149995fyN.LIZIZ;
            c149996fyO.LIZIZ = c149995fyN.LIZJ;
            c149996fyO.LIZJ = c149995fyN.LIZLLL;
        }
        return init(c149996fyO);
    }

    public static void setDebug(boolean z) {
        MethodCollector.m14708i(974);
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 3).isSupported) {
            MethodCollector.m14707o(974);
            return;
        }
        if (initStatus == 0) {
            nativeSetDebug(z);
        }
        MethodCollector.m14707o(974);
    }

    public static synchronized int init(C149996fyO c149996fyO) {
        synchronized (ByteHook.class) {
            MethodCollector.m14708i(973);
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c149996fyO}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                int intValue = ((Integer) proxy.result).intValue();
                MethodCollector.m14707o(973);
                return intValue;
            } else if (inited) {
                int i = initStatus;
                MethodCollector.m14707o(973);
                return i;
            } else {
                inited = true;
                if (c149996fyO.LIZ == null) {
                    C116971W2r.LIZIZ("bytehook");
                }
                initStatus = nativeInit(c149996fyO.LIZIZ, c149996fyO.LIZJ);
                int i2 = initStatus;
                MethodCollector.m14707o(973);
                return i2;
            }
        }
    }
}
