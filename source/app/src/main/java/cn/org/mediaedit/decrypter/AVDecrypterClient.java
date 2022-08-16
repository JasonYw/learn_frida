package cn.org.mediaedit.decrypter;

import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.lang.ref.WeakReference;
import p003X.AbstractC143920eOA;
import p003X.AbstractC143927eOH;
import p003X.C116971W2r;
import p003X.C144005ePX;
import p003X.HandlerC143919eO9;

/* loaded from: classes19.dex */
public class AVDecrypterClient extends AbstractC143920eOA {
    public static ChangeQuickRedirect changeQuickRedirect;
    public HandlerC143919eO9 mEventHandler;
    public long mHandle;
    public static final String TAG = AVDecrypterClient.class.getSimpleName();
    public static boolean mLibraryLoaded = false;
    public static AbstractC143927eOH mLibraryLoader = new AbstractC143927eOH() { // from class: cn.org.mediaedit.decrypter.AVDecrypterClient.1
        public static ChangeQuickRedirect LIZ;

        static {
            Covode.recordClassIndex(3875);
        }

        @Override // p003X.AbstractC143927eOH
        public final boolean LIZ(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 1);
            if (proxy.isSupported) {
                return ((Boolean) proxy.result).booleanValue();
            }
            try {
                new StringBuilder("load default decrypter library: ").append(str);
                C116971W2r.LIZIZ(str);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    };

    public static final native void _close(long j);

    private final native long _create(Object obj);

    public static final native int _getIntValue(long j, int i, int i2);

    public static final native long _getLongValue(long j, int i, long j2);

    public static final native int _open(long j, String str, String str2, String str3);

    public static final native void _release(long j);

    public static final native int _setIntValue(long j, int i, int i2);

    public static final native int _setLongValue(long j, int i, long j2);

    public static final native int _start(long j);

    public AVDecrypterClient() {
        this(mLibraryLoader);
    }

    static {
        Covode.recordClassIndex(3874);
    }

    public void close() {
        MethodCollector.m14708i(264);
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5).isSupported) {
            MethodCollector.m14707o(264);
            return;
        }
        long j = this.mHandle;
        if (j != 0) {
            _close(j);
        }
        MethodCollector.m14707o(264);
    }

    public void release() {
        MethodCollector.m14708i(265);
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6).isSupported) {
            MethodCollector.m14707o(265);
            return;
        }
        resetListeners();
        long j = this.mHandle;
        if (j != 0) {
            _release(j);
        }
        MethodCollector.m14707o(265);
    }

    public int start() {
        MethodCollector.m14708i(263);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(263);
            return intValue;
        }
        long j = this.mHandle;
        if (j != 0) {
            int _start = _start(j);
            MethodCollector.m14707o(263);
            return _start;
        }
        MethodCollector.m14707o(263);
        return -1;
    }

    private void create() {
        MethodCollector.m14708i(261);
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2).isSupported) {
            MethodCollector.m14707o(261);
            return;
        }
        this.mHandle = _create(new WeakReference(this));
        if (this.mHandle != 0) {
            new StringBuilder("decrypter create handle: ").append(this.mHandle);
            MethodCollector.m14707o(261);
            return;
        }
        Exception exc = new Exception("create native decrypter is fail.");
        MethodCollector.m14707o(261);
        throw exc;
    }

    public AVDecrypterClient(AbstractC143927eOH abstractC143927eOH) {
        if (!loadLibrarys(abstractC143927eOH)) {
            return;
        }
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            this.mEventHandler = new HandlerC143919eO9(this, myLooper);
        } else {
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper != null) {
                this.mEventHandler = new HandlerC143919eO9(this, mainLooper);
            } else {
                this.mEventHandler = null;
            }
        }
        create();
    }

    public static synchronized boolean loadLibrarys(AbstractC143927eOH abstractC143927eOH) {
        synchronized (AVDecrypterClient.class) {
            MethodCollector.m14708i(260);
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC143927eOH}, null, changeQuickRedirect, true, 1);
            if (proxy.isSupported) {
                boolean booleanValue = ((Boolean) proxy.result).booleanValue();
                MethodCollector.m14707o(260);
                return booleanValue;
            } else if (mLibraryLoaded) {
                MethodCollector.m14707o(260);
                return true;
            } else {
                if (abstractC143927eOH == null) {
                    abstractC143927eOH = mLibraryLoader;
                }
                if (abstractC143927eOH.LIZ(C144005ePX.LIZJ) && abstractC143927eOH.LIZ(C144005ePX.LIZIZ)) {
                    mLibraryLoaded = true;
                    MethodCollector.m14707o(260);
                    return true;
                }
                MethodCollector.m14707o(260);
                return false;
            }
        }
    }

    public int getIntOption(int i, int i2) {
        MethodCollector.m14708i(267);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 8);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(267);
            return intValue;
        }
        int _getIntValue = _getIntValue(this.mHandle, i, i2);
        MethodCollector.m14707o(267);
        return _getIntValue;
    }

    public long getLongOption(int i, long j) {
        MethodCollector.m14708i(269);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), new Long(j)}, this, changeQuickRedirect, false, 10);
        if (proxy.isSupported) {
            long longValue = ((Long) proxy.result).longValue();
            MethodCollector.m14707o(269);
            return longValue;
        }
        long _getLongValue = _getLongValue(this.mHandle, i, j);
        MethodCollector.m14707o(269);
        return _getLongValue;
    }

    public int setIntOption(int i, int i2) {
        MethodCollector.m14708i(266);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 7);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(266);
            return intValue;
        }
        int _setIntValue = _setIntValue(this.mHandle, i, i2);
        MethodCollector.m14707o(266);
        return _setIntValue;
    }

    public int setLongOption(int i, long j) {
        MethodCollector.m14708i(268);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), new Long(j)}, this, changeQuickRedirect, false, 9);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(268);
            return intValue;
        }
        int _setLongValue = _setLongValue(this.mHandle, i, j);
        MethodCollector.m14707o(268);
        return _setLongValue;
    }

    public int open(String str, String str2, String str3) {
        MethodCollector.m14708i(262);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(262);
            return intValue;
        }
        long j = this.mHandle;
        if (j != 0) {
            int _open = _open(j, str, str2, str3);
            MethodCollector.m14707o(262);
            return _open;
        }
        MethodCollector.m14707o(262);
        return -1;
    }

    public static void notify(Object obj, int i, int i2, int i3, String str) {
        AVDecrypterClient aVDecrypterClient;
        HandlerC143919eO9 handlerC143919eO9;
        if (!PatchProxy.proxy(new Object[]{obj, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str}, null, changeQuickRedirect, true, 11).isSupported && obj != null && (aVDecrypterClient = (AVDecrypterClient) ((WeakReference) obj).get()) != null && (handlerC143919eO9 = aVDecrypterClient.mEventHandler) != null) {
            Message obtainMessage = handlerC143919eO9.obtainMessage(i2, i3, i);
            obtainMessage.obj = str;
            aVDecrypterClient.mEventHandler.sendMessage(obtainMessage);
        }
    }
}
