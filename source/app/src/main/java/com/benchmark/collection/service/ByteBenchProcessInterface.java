package com.benchmark.collection.service;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.RemoteException;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC108897SuB;
import p003X.C108306Ske;
import p003X.C108865Stf;
import p003X.C65726BwW;

/* loaded from: classes10.dex */
public class ByteBenchProcessInterface {
    public static ChangeQuickRedirect changeQuickRedirect;
    public AbstractC108897SuB mCallback;
    public long mHandler;

    private native long nativeInit(String str, String str2, String str3, String str4, AssetManager assetManager);

    private native void native_destory(long j);

    private native String[] native_getResult(long j);

    private native int native_loadByteBench(long j, String str);

    private native void native_release(long j);

    private native int native_startTest(long j, int i, String str);

    private native int native_stopByteBench(long j);

    static {
        Covode.recordClassIndex(9658);
        C65726BwW.LIZ();
        if (!C65726BwW.LIZIZ()) {
            C65726BwW.LIZ();
        }
    }

    public void destroy() {
        MethodCollector.m14708i(775);
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 7).isSupported) {
            MethodCollector.m14707o(775);
            return;
        }
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m14707o(775);
            return;
        }
        native_destory(j);
        this.mHandler = 0L;
        MethodCollector.m14707o(775);
    }

    public String[] getResult() {
        MethodCollector.m14708i(774);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        if (proxy.isSupported) {
            String[] strArr = (String[]) proxy.result;
            MethodCollector.m14707o(774);
            return strArr;
        }
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m14707o(774);
            return null;
        }
        String[] native_getResult = native_getResult(j);
        MethodCollector.m14707o(774);
        return native_getResult;
    }

    public void release() {
        MethodCollector.m14708i(776);
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 8).isSupported) {
            MethodCollector.m14707o(776);
            return;
        }
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m14707o(776);
            return;
        }
        native_release(j);
        MethodCollector.m14707o(776);
    }

    public int stopByteBench() {
        MethodCollector.m14708i(773);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(773);
            return intValue;
        }
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m14707o(773);
            return -108;
        }
        int native_stopByteBench = native_stopByteBench(j);
        MethodCollector.m14707o(773);
        return native_stopByteBench;
    }

    public void setByteBenchCallback(AbstractC108897SuB abstractC108897SuB) {
        this.mCallback = abstractC108897SuB;
    }

    private void initByteMonitor(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        C108865Stf.LIZ(context);
        C108865Stf.LIZ();
    }

    public int loadByteBench(String str) {
        MethodCollector.m14708i(771);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(771);
            return intValue;
        }
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m14707o(771);
            return -108;
        }
        int native_loadByteBench = native_loadByteBench(j, str);
        MethodCollector.m14707o(771);
        return native_loadByteBench;
    }

    public void reportAndQuit(boolean z) {
        MethodCollector.m14708i(777);
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 9).isSupported) {
            MethodCollector.m14707o(777);
            return;
        }
        AbstractC108897SuB abstractC108897SuB = this.mCallback;
        if (abstractC108897SuB == null) {
            MethodCollector.m14707o(777);
            return;
        }
        try {
            abstractC108897SuB.LIZ(105, "report result");
            if (z) {
                this.mCallback.LIZ(104, "quit service");
            }
            MethodCollector.m14707o(777);
        } catch (RemoteException e) {
            C108306Ske.LIZLLL("ByteBenchProcessInterface", e.getMessage());
            MethodCollector.m14707o(777);
        }
    }

    public int startTest(int i, String str) {
        MethodCollector.m14708i(772);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), str}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(772);
            return intValue;
        }
        long j = this.mHandler;
        if (j == 0) {
            MethodCollector.m14707o(772);
            return -108;
        }
        int native_startTest = native_startTest(j, i, str);
        MethodCollector.m14707o(772);
        return native_startTest;
    }

    public int init(String str, String str2, String str3, String str4, Context context) {
        MethodCollector.m14708i(770);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, context}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            int intValue = ((Integer) proxy.result).intValue();
            MethodCollector.m14707o(770);
            return intValue;
        } else if (!C65726BwW.LIZIZ()) {
            MethodCollector.m14707o(770);
            return -3;
        } else {
            if (C65726BwW.LIZIZ()) {
                this.mHandler = nativeInit(str, str2, str3, str4, context.getAssets());
            }
            if (this.mHandler == 0) {
                MethodCollector.m14707o(770);
                return -1;
            }
            initByteMonitor(context);
            MethodCollector.m14707o(770);
            return 0;
        }
    }
}
