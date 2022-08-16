package com.bef.effectsdk.message;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public class MessageCenter {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static HandlerThread sMessageCenterThread;
    public static Handler sMessageHandler;
    public static final Object sMessageCenterThreadLock = new Object();
    public static final List<Listener> sListeners = new ArrayList();

    /* loaded from: classes10.dex */
    public interface Listener {
        static {
            Covode.recordClassIndex(9573);
        }

        void onMessageReceived(int i, int i2, int i3, String str);
    }

    static {
        Covode.recordClassIndex(9572);
    }

    public static void removeAllListener() {
        MethodCollector.m14708i(685);
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 4).isSupported) {
            MethodCollector.m14707o(685);
            return;
        }
        synchronized (sListeners) {
            try {
                sListeners.clear();
                destroy();
            } catch (Throwable th) {
                MethodCollector.m14707o(685);
                throw th;
            }
        }
        MethodCollector.m14707o(685);
    }

    public static void destroy() {
        MethodCollector.m14708i(687);
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 6).isSupported) {
            MethodCollector.m14707o(687);
            return;
        }
        synchronized (sListeners) {
            try {
                if (!sListeners.isEmpty()) {
                    MethodCollector.m14707o(687);
                    return;
                }
                synchronized (sMessageCenterThreadLock) {
                    if (sMessageHandler != null) {
                        sMessageHandler.removeCallbacksAndMessages(null);
                        sMessageHandler = null;
                    }
                    if (sMessageCenterThread != null) {
                        sMessageCenterThread.quit();
                        sMessageCenterThread = null;
                    }
                }
                sListeners.clear();
                MethodCollector.m14707o(687);
            } catch (Throwable th) {
                MethodCollector.m14707o(687);
                throw th;
            }
        }
    }

    public static void init() {
        MethodCollector.m14708i(686);
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 5).isSupported) {
            MethodCollector.m14707o(686);
            return;
        }
        synchronized (sMessageCenterThreadLock) {
            try {
                if (sMessageCenterThread == null || !sMessageCenterThread.isAlive() || sMessageCenterThread.getLooper() == null) {
                    HandlerThread handlerThread = new HandlerThread("MessageCenter");
                    sMessageCenterThread = handlerThread;
                    handlerThread.start();
                    sMessageHandler = new MessageHandler(sMessageCenterThread.getLooper());
                }
            } catch (Throwable th) {
                MethodCollector.m14707o(686);
                throw th;
            }
        }
        MethodCollector.m14707o(686);
    }

    /* loaded from: classes10.dex */
    public static class MessageHandler extends Handler {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(9574);
        }

        public MessageHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (PatchProxy.proxy(new Object[]{message}, this, changeQuickRedirect, false, 1).isSupported) {
                return;
            }
            MessageCenter.handleMessage(message);
        }
    }

    public static void addListener(Listener listener) {
        MethodCollector.m14708i(683);
        if (PatchProxy.proxy(new Object[]{listener}, null, changeQuickRedirect, true, 2).isSupported) {
            MethodCollector.m14707o(683);
            return;
        }
        synchronized (sListeners) {
            try {
                if (sListeners.isEmpty()) {
                    init();
                }
                sListeners.add(listener);
            } catch (Throwable th) {
                MethodCollector.m14707o(683);
                throw th;
            }
        }
        MethodCollector.m14707o(683);
    }

    public static void removeListener(Listener listener) {
        MethodCollector.m14708i(684);
        if (PatchProxy.proxy(new Object[]{listener}, null, changeQuickRedirect, true, 3).isSupported) {
            MethodCollector.m14707o(684);
            return;
        }
        synchronized (sListeners) {
            try {
                sListeners.remove(listener);
                if (sListeners.isEmpty()) {
                    destroy();
                }
            } catch (Throwable th) {
                MethodCollector.m14707o(684);
                throw th;
            }
        }
        MethodCollector.m14707o(684);
    }

    public static void setListener(Listener listener) {
        MethodCollector.m14708i(682);
        if (PatchProxy.proxy(new Object[]{listener}, null, changeQuickRedirect, true, 1).isSupported) {
            MethodCollector.m14707o(682);
            return;
        }
        synchronized (sListeners) {
            try {
                addListener(listener);
            } catch (Throwable th) {
                MethodCollector.m14707o(682);
                throw th;
            }
        }
        MethodCollector.m14707o(682);
    }

    public static void handleMessage(Message message) {
        MethodCollector.m14708i(689);
        if (PatchProxy.proxy(new Object[]{message}, null, changeQuickRedirect, true, 8).isSupported) {
            MethodCollector.m14707o(689);
            return;
        }
        synchronized (sListeners) {
            try {
                for (Listener listener : sListeners) {
                    listener.onMessageReceived(message.what, message.arg1, message.arg2, (String) message.obj);
                }
            } catch (Throwable th) {
                MethodCollector.m14707o(689);
                throw th;
            }
        }
        MethodCollector.m14707o(689);
    }

    public static void postMessage(int i, int i2, int i3, String str) {
        MethodCollector.m14708i(688);
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str}, null, changeQuickRedirect, true, 7).isSupported) {
            MethodCollector.m14707o(688);
            return;
        }
        synchronized (sMessageCenterThreadLock) {
            try {
                if (sMessageHandler == null) {
                    MethodCollector.m14707o(688);
                    return;
                }
                Message.obtain(sMessageHandler, i, i2, i3, str).sendToTarget();
                MethodCollector.m14707o(688);
            } catch (Throwable th) {
                MethodCollector.m14707o(688);
                throw th;
            }
        }
    }
}
