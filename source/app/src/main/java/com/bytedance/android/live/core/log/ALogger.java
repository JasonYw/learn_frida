package com.bytedance.android.live.core.log;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC103410Qns;
import p003X.C103414Qnw;

/* loaded from: classes8.dex */
public class ALogger {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static boolean mAsyncALogger;
    public static HandlerThread mPrintThread;
    public static Handler mPrintThreadHandle;

    static {
        Covode.recordClassIndex(23476);
    }

    public static boolean onHookLoggerStart() {
        return false;
    }

    public static void configAsyncReport() {
        if (!PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1).isSupported && mAsyncALogger && mPrintThread == null) {
            HandlerThread handlerThread = new HandlerThread("asyncPrintThread");
            mPrintThread = handlerThread;
            handlerThread.start();
            if (mPrintThread.getLooper() != null) {
                mPrintThreadHandle = new Handler(mPrintThread.getLooper());
            }
        }
    }

    /* renamed from: d */
    public static void m15801d(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, 6).isSupported) {
            return;
        }
        print(3, str, str2);
    }

    /* renamed from: e */
    public static void m15800e(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, 9).isSupported) {
            return;
        }
        print(6, str, str2);
    }

    /* renamed from: i */
    public static void m15797i(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, 7).isSupported) {
            return;
        }
        print(4, str, str2);
    }

    /* renamed from: v */
    public static void m15796v(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, 5).isSupported) {
            return;
        }
        print(2, str, str2);
    }

    /* renamed from: w */
    public static void m15795w(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, 8).isSupported) {
            return;
        }
        print(5, str, str2);
    }

    /* renamed from: e */
    public static void m15798e(String str, Throwable th) {
        if (PatchProxy.proxy(new Object[]{str, th}, null, changeQuickRedirect, true, 11).isSupported) {
            return;
        }
        throwable(6, str, null, th);
    }

    /* renamed from: w */
    public static void m15793w(String str, Throwable th) {
        if (PatchProxy.proxy(new Object[]{str, th}, null, changeQuickRedirect, true, 10).isSupported) {
            return;
        }
        throwable(5, str, null, th);
    }

    public static void bundle(int i, String str, Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, bundle}, null, changeQuickRedirect, true, 17).isSupported || onHookLoggerStart()) {
            return;
        }
        AbstractC103410Qns.LIZ(i, str, bundle);
    }

    /* renamed from: e */
    public static void m15799e(String str, String str2, Throwable th) {
        if (PatchProxy.proxy(new Object[]{str, str2, th}, null, changeQuickRedirect, true, 13).isSupported) {
            return;
        }
        throwable(6, str, str2, th);
    }

    public static void header(int i, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, str2}, null, changeQuickRedirect, true, 15).isSupported || onHookLoggerStart()) {
            return;
        }
        AbstractC103410Qns.LIZ(i, str, str2);
    }

    public static void intent(int i, String str, Intent intent) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, intent}, null, changeQuickRedirect, true, 18).isSupported || onHookLoggerStart()) {
            return;
        }
        AbstractC103410Qns.LIZ(i, str, intent);
    }

    public static void json(int i, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, str2}, null, changeQuickRedirect, true, 16).isSupported || onHookLoggerStart()) {
            return;
        }
        AbstractC103410Qns.LIZIZ(i, str, str2);
    }

    public static void realPrint(int i, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, str2}, null, changeQuickRedirect, true, 3).isSupported) {
            return;
        }
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        if (i == 6) {
                            AbstractC103410Qns.m22868LJ(str, str2);
                            return;
                        }
                        return;
                    }
                    AbstractC103410Qns.LIZLLL(str, str2);
                    return;
                }
                AbstractC103410Qns.LIZJ(str, str2);
                return;
            }
            AbstractC103410Qns.LIZIZ(str, str2);
            return;
        }
        AbstractC103410Qns.LIZ(str, str2);
    }

    public static void stacktrace(int i, String str, StackTraceElement[] stackTraceElementArr) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, stackTraceElementArr}, null, changeQuickRedirect, true, 20).isSupported || onHookLoggerStart()) {
            return;
        }
        AbstractC103410Qns.LIZ(i, str, stackTraceElementArr);
    }

    public static void thread(int i, String str, Thread thread) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, thread}, null, changeQuickRedirect, true, 19).isSupported || onHookLoggerStart()) {
            return;
        }
        AbstractC103410Qns.LIZ(i, str, thread);
    }

    /* renamed from: w */
    public static void m15794w(String str, String str2, Throwable th) {
        if (PatchProxy.proxy(new Object[]{str, str2, th}, null, changeQuickRedirect, true, 12).isSupported) {
            return;
        }
        throwable(5, str, str2, th);
    }

    public static void print(final int i, final String str, final String str2) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, str2}, null, changeQuickRedirect, true, 2).isSupported || onHookLoggerStart()) {
            return;
        }
        boolean z = PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, str2}, C103414Qnw.LIZIZ, C103414Qnw.LIZ, false, 3).isSupported;
        if (mAsyncALogger) {
            if (mPrintThreadHandle == null) {
                if (mPrintThread == null) {
                    HandlerThread handlerThread = new HandlerThread("asyncPrintThread");
                    mPrintThread = handlerThread;
                    handlerThread.start();
                }
                if (mPrintThread.getLooper() != null) {
                    mPrintThreadHandle = new Handler(mPrintThread.getLooper());
                }
            }
            Handler handler = mPrintThreadHandle;
            if (handler != null) {
                handler.post(new Runnable() { // from class: com.bytedance.android.live.core.log.ALogger.1
                    public static ChangeQuickRedirect LIZ;

                    static {
                        Covode.recordClassIndex(23477);
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                            return;
                        }
                        ALogger.realPrint(i, str, str2);
                    }
                });
                return;
            } else {
                realPrint(i, str, str2);
                return;
            }
        }
        realPrint(i, str, str2);
    }

    public static void throwable(int i, String str, String str2, Throwable th) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, str2, th}, null, changeQuickRedirect, true, 14).isSupported) {
            return;
        }
        print(i, str, str2, th);
    }

    public static void print(int i, String str, String str2, Throwable th) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, str2, th}, null, changeQuickRedirect, true, 4).isSupported || onHookLoggerStart()) {
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(str2);
        if (i != 5) {
            if (i == 6) {
                if (isEmpty) {
                    AbstractC103410Qns.LIZIZ(str, th);
                } else {
                    AbstractC103410Qns.LIZIZ(str, str2, th);
                }
            }
        } else if (isEmpty) {
            AbstractC103410Qns.LIZ(str, th);
        } else {
            AbstractC103410Qns.LIZ(str, str2, th);
        }
    }
}
