package com.bef.effectsdk.algorithm;

import android.graphics.Bitmap;
import com.bef.effectsdk.ResourceFinder;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes10.dex */
public class GeneralObjDetector {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final int ModelType_kPureDetect = 1;
    public final int ParamType_kDetectShortSideLen = 1;
    public ResourceFinder mFinder;
    public long mFinderHandle;
    public long mNativeHandle;

    static {
        Covode.recordClassIndex(9545);
    }

    private native long nativeCreate();

    private native int nativeDestroy(long j);

    private native int nativeInit(long j, long j2, int i);

    private native int nativeInitWithPath(long j, String str, int i);

    private native GeneralObjDetectResult nativeProcess(long j, Bitmap bitmap, int i);

    private native int nativeSetParamF(long j, int i, float f);

    private native int nativeSetParamS(long j, int i, String str);

    private boolean isFinderHandleValid() {
        if (0 != this.mFinderHandle) {
            return true;
        }
        return false;
    }

    private boolean isNativeHandleValid() {
        if (0 != this.mNativeHandle) {
            return true;
        }
        return false;
    }

    public boolean create() {
        MethodCollector.m14708i(647);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            boolean booleanValue = ((Boolean) proxy.result).booleanValue();
            MethodCollector.m14707o(647);
            return booleanValue;
        }
        this.mNativeHandle = nativeCreate();
        boolean isNativeHandleValid = isNativeHandleValid();
        MethodCollector.m14707o(647);
        return isNativeHandleValid;
    }

    public void destroy() {
        MethodCollector.m14708i(653);
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 7).isSupported) {
            MethodCollector.m14707o(653);
            return;
        }
        if (isNativeHandleValid()) {
            nativeDestroy(this.mNativeHandle);
            this.mNativeHandle = 0L;
        }
        if (this.mFinder != null && isFinderHandleValid()) {
            this.mFinder.release(this.mFinderHandle);
            this.mFinderHandle = 0L;
        }
        MethodCollector.m14707o(653);
    }

    public boolean setParamS(int i, String str) {
        MethodCollector.m14708i(651);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), str}, this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            boolean booleanValue = ((Boolean) proxy.result).booleanValue();
            MethodCollector.m14707o(651);
            return booleanValue;
        } else if (!isNativeHandleValid()) {
            MethodCollector.m14707o(651);
            return false;
        } else {
            int nativeSetParamS = nativeSetParamS(this.mNativeHandle, i, str);
            MethodCollector.m14707o(651);
            if (nativeSetParamS != 0) {
                return false;
            }
            return true;
        }
    }

    public boolean init(ResourceFinder resourceFinder, int i) {
        MethodCollector.m14708i(648);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{resourceFinder, Integer.valueOf(i)}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            boolean booleanValue = ((Boolean) proxy.result).booleanValue();
            MethodCollector.m14707o(648);
            return booleanValue;
        } else if (resourceFinder != null && isNativeHandleValid()) {
            this.mFinder = resourceFinder;
            this.mFinderHandle = this.mFinder.createNativeResourceFinder(this.mNativeHandle);
            if (!isFinderHandleValid()) {
                destroy();
                MethodCollector.m14707o(648);
                return false;
            }
            int nativeInit = nativeInit(this.mNativeHandle, this.mFinderHandle, i);
            MethodCollector.m14707o(648);
            if (nativeInit != 0) {
                return false;
            }
            return true;
        } else {
            MethodCollector.m14707o(648);
            return false;
        }
    }

    public boolean initWithPath(String str, int i) {
        MethodCollector.m14708i(649);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, Integer.valueOf(i)}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            boolean booleanValue = ((Boolean) proxy.result).booleanValue();
            MethodCollector.m14707o(649);
            return booleanValue;
        } else if (str != null && str.length() != 0 && isNativeHandleValid()) {
            int nativeInitWithPath = nativeInitWithPath(this.mNativeHandle, str, i);
            MethodCollector.m14707o(649);
            if (nativeInitWithPath != 0) {
                return false;
            }
            return true;
        } else {
            MethodCollector.m14707o(649);
            return false;
        }
    }

    public GeneralObjDetectResult process(Bitmap bitmap, int i) {
        MethodCollector.m14708i(652);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{bitmap, Integer.valueOf(i)}, this, changeQuickRedirect, false, 6);
        if (proxy.isSupported) {
            GeneralObjDetectResult generalObjDetectResult = (GeneralObjDetectResult) proxy.result;
            MethodCollector.m14707o(652);
            return generalObjDetectResult;
        } else if (isNativeHandleValid() && bitmap != null) {
            GeneralObjDetectResult nativeProcess = nativeProcess(this.mNativeHandle, bitmap, i);
            nativeProcess.logData();
            MethodCollector.m14707o(652);
            return nativeProcess;
        } else {
            GeneralObjDetectResult generalObjDetectResult2 = new GeneralObjDetectResult();
            MethodCollector.m14707o(652);
            return generalObjDetectResult2;
        }
    }

    public boolean setParamF(int i, float f) {
        MethodCollector.m14708i(650);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), Float.valueOf(f)}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            boolean booleanValue = ((Boolean) proxy.result).booleanValue();
            MethodCollector.m14707o(650);
            return booleanValue;
        } else if (!isNativeHandleValid()) {
            MethodCollector.m14707o(650);
            return false;
        } else {
            int nativeSetParamF = nativeSetParamF(this.mNativeHandle, i, f);
            MethodCollector.m14707o(650);
            if (nativeSetParamF != 0) {
                return false;
            }
            return true;
        }
    }
}
