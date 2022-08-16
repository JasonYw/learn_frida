package com.bef.effectsdk.algorithm;

import android.graphics.Bitmap;
import com.bef.effectsdk.ResourceFinder;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes10.dex */
public class RectDocDet {
    public static ChangeQuickRedirect changeQuickRedirect;
    public ResourceFinder mFinder;
    public long mFinderHandle;
    public long mNativeHandle;

    static {
        Covode.recordClassIndex(9547);
    }

    private native long nativeCreate();

    private native int nativeDestroy(long j);

    private native int nativeInit(long j, long j2, int i);

    private native int nativeInitWithPath(long j, String str, int i);

    private native RectDocDetResult nativeProcess(long j, Bitmap bitmap, int i);

    private native int nativeSetParamF(long j, int i, float f);

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
        MethodCollector.m14708i(654);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            boolean booleanValue = ((Boolean) proxy.result).booleanValue();
            MethodCollector.m14707o(654);
            return booleanValue;
        }
        this.mNativeHandle = nativeCreate();
        boolean isNativeHandleValid = isNativeHandleValid();
        MethodCollector.m14707o(654);
        return isNativeHandleValid;
    }

    public void destroy() {
        MethodCollector.m14708i(659);
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6).isSupported) {
            MethodCollector.m14707o(659);
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
        MethodCollector.m14707o(659);
    }

    public RectDocDetResult process(Bitmap bitmap, int i) {
        MethodCollector.m14708i(658);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{bitmap, Integer.valueOf(i)}, this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            RectDocDetResult rectDocDetResult = (RectDocDetResult) proxy.result;
            MethodCollector.m14707o(658);
            return rectDocDetResult;
        } else if (isNativeHandleValid() && bitmap != null) {
            RectDocDetResult nativeProcess = nativeProcess(this.mNativeHandle, bitmap, i);
            MethodCollector.m14707o(658);
            return nativeProcess;
        } else {
            RectDocDetResult rectDocDetResult2 = new RectDocDetResult();
            MethodCollector.m14707o(658);
            return rectDocDetResult2;
        }
    }

    public boolean init(ResourceFinder resourceFinder, int i) {
        MethodCollector.m14708i(655);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{resourceFinder, Integer.valueOf(i)}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            boolean booleanValue = ((Boolean) proxy.result).booleanValue();
            MethodCollector.m14707o(655);
            return booleanValue;
        } else if (resourceFinder != null && isNativeHandleValid()) {
            this.mFinder = resourceFinder;
            this.mFinderHandle = this.mFinder.createNativeResourceFinder(this.mNativeHandle);
            if (!isFinderHandleValid()) {
                destroy();
                MethodCollector.m14707o(655);
                return false;
            }
            int nativeInit = nativeInit(this.mNativeHandle, this.mFinderHandle, i);
            MethodCollector.m14707o(655);
            if (nativeInit != 0) {
                return false;
            }
            return true;
        } else {
            MethodCollector.m14707o(655);
            return false;
        }
    }

    public boolean initWithPath(String str, int i) {
        MethodCollector.m14708i(656);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, Integer.valueOf(i)}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            boolean booleanValue = ((Boolean) proxy.result).booleanValue();
            MethodCollector.m14707o(656);
            return booleanValue;
        } else if (str != null && str.length() != 0 && isNativeHandleValid()) {
            int nativeInitWithPath = nativeInitWithPath(this.mNativeHandle, str, i);
            MethodCollector.m14707o(656);
            if (nativeInitWithPath != 0) {
                return false;
            }
            return true;
        } else {
            MethodCollector.m14707o(656);
            return false;
        }
    }

    public boolean setParamF(int i, float f) {
        MethodCollector.m14708i(657);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), Float.valueOf(f)}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            boolean booleanValue = ((Boolean) proxy.result).booleanValue();
            MethodCollector.m14707o(657);
            return booleanValue;
        } else if (!isNativeHandleValid()) {
            MethodCollector.m14707o(657);
            return false;
        } else {
            int nativeSetParamF = nativeSetParamF(this.mNativeHandle, i, f);
            MethodCollector.m14707o(657);
            if (nativeSetParamF != 0) {
                return false;
            }
            return true;
        }
    }
}
