package com.bef.effectsdk;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLDebugHelper;
import android.opengl.GLSurfaceView;
import android.os.Build;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.Writer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;
import javax.microedition.khronos.opengles.GL10;
import p002O.C0002O;

/* loaded from: classes10.dex */
public class GLTextureView extends TextureView implements TextureView.SurfaceTextureListener {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static final GLThreadManager sGLThreadManager = new GLThreadManager(null);
    public int mDebugFlags;
    public boolean mDetached;
    public EGLConfigChooser mEGLConfigChooser;
    public int mEGLContextClientVersion;
    public EGLContextFactory mEGLContextFactory;
    public EGLWindowSurfaceFactory mEGLWindowSurfaceFactory;
    public GLThread mGLThread;
    public GLWrapper mGLWrapper;
    public boolean mPreserveEGLContextOnPause;
    public SurfaceTexture mPrevSurfaceTexture;
    public GLSurfaceView.Renderer mRenderer;
    public final WeakReference<GLTextureView> mThisWeakRef = new WeakReference<>(this);

    /* renamed from: com.bef.effectsdk.GLTextureView$1 */
    /* loaded from: classes10.dex */
    public static /* synthetic */ class C24701 {
        static {
            Covode.recordClassIndex(9518);
        }
    }

    /* loaded from: classes10.dex */
    public interface EGLConfigChooser {
        static {
            Covode.recordClassIndex(9523);
        }

        EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay);
    }

    /* loaded from: classes10.dex */
    public interface EGLContextFactory {
        static {
            Covode.recordClassIndex(9524);
        }

        EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig);

        void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext);
    }

    /* loaded from: classes10.dex */
    public interface EGLWindowSurfaceFactory {
        static {
            Covode.recordClassIndex(9525);
        }

        EGLSurface createWindowSurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj);

        void destroySurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface);
    }

    /* loaded from: classes10.dex */
    public interface GLWrapper {
        static {
            Covode.recordClassIndex(9529);
        }

        GL wrap(GL gl);
    }

    public void onExitContext() {
    }

    /* loaded from: classes10.dex */
    public static class DefaultWindowSurfaceFactory implements EGLWindowSurfaceFactory {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(9522);
        }

        public DefaultWindowSurfaceFactory() {
        }

        public /* synthetic */ DefaultWindowSurfaceFactory(C24701 c24701) {
            this();
        }

        @Override // com.bef.effectsdk.GLTextureView.EGLWindowSurfaceFactory
        public void destroySurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
            if (PatchProxy.proxy(new Object[]{egl10, eGLDisplay, eGLSurface}, this, changeQuickRedirect, false, 2).isSupported) {
                return;
            }
            egl10.eglDestroySurface(eGLDisplay, eGLSurface);
        }

        @Override // com.bef.effectsdk.GLTextureView.EGLWindowSurfaceFactory
        public EGLSurface createWindowSurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{egl10, eGLDisplay, eGLConfig, obj}, this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return (EGLSurface) proxy.result;
            }
            try {
                return egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, obj, null);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    /* loaded from: classes10.dex */
    public static class GLThreadManager {
        public static String TAG = "GLThreadManager";
        public static ChangeQuickRedirect changeQuickRedirect;
        public GLThread mEglOwner;
        public boolean mGLESDriverCheckComplete;
        public int mGLESVersion;
        public boolean mGLESVersionCheckComplete;
        public boolean mLimitedGLESContexts;
        public boolean mMultipleGLESContextsAllowed;

        public GLThreadManager() {
        }

        static {
            Covode.recordClassIndex(9528);
        }

        private void checkGLESVersion() {
            if (!this.mGLESVersionCheckComplete) {
                this.mMultipleGLESContextsAllowed = true;
                this.mGLESVersionCheckComplete = true;
            }
        }

        public synchronized boolean shouldReleaseEGLContextWhenPausing() {
            boolean z;
            MethodCollector.m14708i(631);
            z = this.mLimitedGLESContexts;
            MethodCollector.m14707o(631);
            return z;
        }

        public synchronized boolean shouldTerminateEGLWhenPausing() {
            MethodCollector.m14708i(632);
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
            if (proxy.isSupported) {
                boolean booleanValue = ((Boolean) proxy.result).booleanValue();
                MethodCollector.m14707o(632);
                return booleanValue;
            }
            checkGLESVersion();
            if (!this.mMultipleGLESContextsAllowed) {
                MethodCollector.m14707o(632);
                return true;
            }
            MethodCollector.m14707o(632);
            return false;
        }

        public /* synthetic */ GLThreadManager(C24701 c24701) {
            this();
        }

        public void releaseEglContextLocked(GLThread gLThread) {
            if (PatchProxy.proxy(new Object[]{gLThread}, this, changeQuickRedirect, false, 3).isSupported) {
                return;
            }
            if (this.mEglOwner == gLThread) {
                this.mEglOwner = null;
            }
            notifyAll();
        }

        public synchronized void threadExiting(GLThread gLThread) {
            MethodCollector.m14708i(630);
            if (PatchProxy.proxy(new Object[]{gLThread}, this, changeQuickRedirect, false, 1).isSupported) {
                MethodCollector.m14707o(630);
                return;
            }
            gLThread.mExited = true;
            if (this.mEglOwner == gLThread) {
                this.mEglOwner = null;
            }
            notifyAll();
            MethodCollector.m14707o(630);
        }

        public boolean tryAcquireEglContextLocked(GLThread gLThread) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{gLThread}, this, changeQuickRedirect, false, 2);
            if (proxy.isSupported) {
                return ((Boolean) proxy.result).booleanValue();
            }
            GLThread gLThread2 = this.mEglOwner;
            if (gLThread2 != gLThread && gLThread2 != null) {
                checkGLESVersion();
                if (this.mMultipleGLESContextsAllowed) {
                    return true;
                }
                GLThread gLThread3 = this.mEglOwner;
                if (gLThread3 != null) {
                    gLThread3.requestReleaseEglContextLocked();
                }
                return false;
            }
            this.mEglOwner = gLThread;
            notifyAll();
            return true;
        }

        public synchronized void checkGLDriver(GL10 gl10) {
            boolean z;
            MethodCollector.m14708i(633);
            boolean z2 = false;
            if (PatchProxy.proxy(new Object[]{gl10}, this, changeQuickRedirect, false, 5).isSupported) {
                MethodCollector.m14707o(633);
                return;
            }
            if (!this.mGLESDriverCheckComplete) {
                checkGLESVersion();
                String glGetString = gl10.glGetString(7937);
                if (this.mGLESVersion < 131072) {
                    if (!glGetString.startsWith("Q3Dimension MSM7500 ")) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.mMultipleGLESContextsAllowed = z;
                    notifyAll();
                }
                if (!this.mMultipleGLESContextsAllowed) {
                    z2 = true;
                }
                this.mLimitedGLESContexts = z2;
                this.mGLESDriverCheckComplete = true;
            }
            MethodCollector.m14707o(633);
        }
    }

    public int getDebugFlags() {
        return this.mDebugFlags;
    }

    public int getEGLContextClientVersion() {
        return this.mEGLContextClientVersion;
    }

    public boolean getPreserveEGLContextOnPause() {
        return this.mPreserveEGLContextOnPause;
    }

    static {
        Covode.recordClassIndex(9517);
    }

    /* loaded from: classes10.dex */
    public static class EglHelper {
        public static ChangeQuickRedirect changeQuickRedirect;
        public EGL10 mEgl;
        public EGLConfig mEglConfig;
        public EGLContext mEglContext;
        public EGLDisplay mEglDisplay;
        public EGLSurface mEglSurface;
        public WeakReference<GLTextureView> mGLTextureViewWeakRef;

        static {
            Covode.recordClassIndex(9526);
        }

        public static void logEglErrorAsWarning(String str, String str2, int i) {
        }

        public void destroySurface() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5).isSupported) {
                return;
            }
            destroySurfaceImp();
        }

        private void destroySurfaceImp() {
            EGLSurface eGLSurface;
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6).isSupported && (eGLSurface = this.mEglSurface) != null && eGLSurface != EGL10.EGL_NO_SURFACE) {
                EGL10 egl10 = this.mEgl;
                EGLDisplay eGLDisplay = this.mEglDisplay;
                EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
                egl10.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface2, EGL10.EGL_NO_CONTEXT);
                GLTextureView gLTextureView = this.mGLTextureViewWeakRef.get();
                if (gLTextureView != null) {
                    gLTextureView.mEGLWindowSurfaceFactory.destroySurface(this.mEgl, this.mEglDisplay, this.mEglSurface);
                }
                this.mEglSurface = null;
            }
        }

        public void finish() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 7).isSupported) {
                return;
            }
            if (this.mEglContext != null) {
                GLTextureView gLTextureView = this.mGLTextureViewWeakRef.get();
                if (gLTextureView != null) {
                    gLTextureView.mEGLContextFactory.destroyContext(this.mEgl, this.mEglDisplay, this.mEglContext);
                }
                this.mEglContext = null;
            }
            EGLDisplay eGLDisplay = this.mEglDisplay;
            if (eGLDisplay != null) {
                this.mEgl.eglTerminate(eGLDisplay);
                this.mEglDisplay = null;
            }
        }

        public int swap() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
            if (proxy.isSupported) {
                return ((Integer) proxy.result).intValue();
            }
            if (!this.mEgl.eglSwapBuffers(this.mEglDisplay, this.mEglSurface)) {
                return this.mEgl.eglGetError();
            }
            return 12288;
        }

        public GL createGL() {
            int i = 0;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
            if (proxy.isSupported) {
                return (GL) proxy.result;
            }
            GL gl = this.mEglContext.getGL();
            GLTextureView gLTextureView = this.mGLTextureViewWeakRef.get();
            if (gLTextureView != null) {
                if (gLTextureView.mGLWrapper != null) {
                    gl = gLTextureView.mGLWrapper.wrap(gl);
                }
                if ((3 & gLTextureView.mDebugFlags) != 0) {
                    LogWriter logWriter = null;
                    if ((gLTextureView.mDebugFlags & 1) != 0) {
                        i = 1;
                    }
                    if ((gLTextureView.mDebugFlags & 2) != 0) {
                        logWriter = new LogWriter();
                    }
                    return GLDebugHelper.wrap(gl, i, logWriter);
                }
                return gl;
            }
            return gl;
        }

        public void start() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
                return;
            }
            this.mEgl = (EGL10) EGLContext.getEGL();
            this.mEglDisplay = this.mEgl.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            if (this.mEglDisplay != EGL10.EGL_NO_DISPLAY) {
                if (this.mEgl.eglInitialize(this.mEglDisplay, new int[2])) {
                    GLTextureView gLTextureView = this.mGLTextureViewWeakRef.get();
                    if (gLTextureView == null) {
                        this.mEglConfig = null;
                        this.mEglContext = null;
                    } else {
                        this.mEglConfig = gLTextureView.mEGLConfigChooser.chooseConfig(this.mEgl, this.mEglDisplay);
                        this.mEglContext = gLTextureView.mEGLContextFactory.createContext(this.mEgl, this.mEglDisplay, this.mEglConfig);
                    }
                    EGLContext eGLContext = this.mEglContext;
                    if (eGLContext == null || eGLContext == EGL10.EGL_NO_CONTEXT) {
                        this.mEglContext = null;
                        throwEglException("createContext");
                    }
                    this.mEglSurface = null;
                    return;
                }
                throw new RuntimeException("eglInitialize failed");
            }
            throw new RuntimeException("eglGetDisplay failed");
        }

        public boolean createSurface() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
            if (proxy.isSupported) {
                return ((Boolean) proxy.result).booleanValue();
            }
            if (this.mEgl != null) {
                if (this.mEglDisplay != null) {
                    if (this.mEglConfig != null) {
                        destroySurfaceImp();
                        GLTextureView gLTextureView = this.mGLTextureViewWeakRef.get();
                        if (gLTextureView != null) {
                            this.mEglSurface = gLTextureView.mEGLWindowSurfaceFactory.createWindowSurface(this.mEgl, this.mEglDisplay, this.mEglConfig, gLTextureView.getSurfaceTexture());
                        } else {
                            this.mEglSurface = null;
                        }
                        EGLSurface eGLSurface = this.mEglSurface;
                        if (eGLSurface != null && eGLSurface != EGL10.EGL_NO_SURFACE) {
                            EGL10 egl10 = this.mEgl;
                            EGLDisplay eGLDisplay = this.mEglDisplay;
                            EGLSurface eGLSurface2 = this.mEglSurface;
                            if (!egl10.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface2, this.mEglContext)) {
                                logEglErrorAsWarning("EGLHelper", "eglMakeCurrent", this.mEgl.eglGetError());
                                return false;
                            }
                            return true;
                        }
                        this.mEgl.eglGetError();
                        return false;
                    }
                    throw new RuntimeException("mEglConfig not initialized");
                }
                throw new RuntimeException("eglDisplay not initialized");
            }
            throw new RuntimeException("egl not initialized");
        }

        public EglHelper(WeakReference<GLTextureView> weakReference) {
            this.mGLTextureViewWeakRef = weakReference;
        }

        private void throwEglException(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 8).isSupported) {
                return;
            }
            throwEglException(str, this.mEgl.eglGetError());
        }

        public static String formatEglError(String str, int i) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, Integer.valueOf(i)}, null, changeQuickRedirect, true, 10);
            if (proxy.isSupported) {
                return (String) proxy.result;
            }
            new StringBuilder();
            return C0002O.m25086C(str, " failed");
        }

        public static void throwEglException(String str, int i) {
            if (PatchProxy.proxy(new Object[]{str, Integer.valueOf(i)}, null, changeQuickRedirect, true, 9).isSupported) {
                return;
            }
            throw new RuntimeException(formatEglError(str, i));
        }
    }

    /* loaded from: classes10.dex */
    public static class GLThread extends Thread {
        public static ChangeQuickRedirect changeQuickRedirect;
        public EglHelper mEglHelper;
        public boolean mExited;
        public boolean mFinishedCreatingEglSurface;
        public WeakReference<GLTextureView> mGLTextureViewWeakRef;
        public boolean mHasSurface;
        public boolean mHaveEglContext;
        public boolean mHaveEglSurface;
        public boolean mPaused;
        public boolean mRenderComplete;
        public boolean mRequestPaused;
        public boolean mShouldExit;
        public boolean mShouldReleaseEglContext;
        public boolean mSurfaceIsBad;
        public boolean mWaitingForSurface;
        public ArrayList<Runnable> mEventQueue = new ArrayList<>();
        public boolean mSizeChanged = true;
        public int mWidth = 0;
        public int mHeight = 0;
        public boolean mRequestRender = true;
        public int mRenderMode = 1;

        static {
            Covode.recordClassIndex(9527);
        }

        private boolean readyToDraw() {
            if (!this.mPaused && this.mHasSurface && !this.mSurfaceIsBad && this.mWidth > 0 && this.mHeight > 0) {
                if (this.mRequestRender || this.mRenderMode == 1) {
                    return true;
                }
                return false;
            }
            return false;
        }

        private void stopEglContextLocked() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3).isSupported && this.mHaveEglContext) {
                this.mEglHelper.finish();
                this.mHaveEglContext = false;
                GLTextureView.sGLThreadManager.releaseEglContextLocked(this);
            }
        }

        private void stopEglSurfaceLocked() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2).isSupported && this.mHaveEglSurface) {
                this.mHaveEglSurface = false;
                this.mEglHelper.destroySurface();
            }
        }

        public int getRenderMode() {
            int i;
            MethodCollector.m14708i(621);
            synchronized (GLTextureView.sGLThreadManager) {
                try {
                    i = this.mRenderMode;
                } catch (Throwable th) {
                    MethodCollector.m14707o(621);
                    throw th;
                }
            }
            MethodCollector.m14707o(621);
            return i;
        }

        public void requestReleaseEglContextLocked() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14).isSupported) {
                return;
            }
            this.mShouldReleaseEglContext = true;
            GLTextureView.sGLThreadManager.notifyAll();
        }

        public boolean ableToDraw() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5);
            if (proxy.isSupported) {
                return ((Boolean) proxy.result).booleanValue();
            }
            if (!this.mHaveEglContext || !this.mHaveEglSurface || !readyToDraw()) {
                return false;
            }
            return true;
        }

        public void requestExitAndWait() {
            MethodCollector.m14708i(628);
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 13).isSupported) {
                MethodCollector.m14707o(628);
                return;
            }
            synchronized (GLTextureView.sGLThreadManager) {
                try {
                    this.mShouldExit = true;
                    GLTextureView.sGLThreadManager.notifyAll();
                    while (!this.mExited) {
                        try {
                            GLTextureView.sGLThreadManager.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.m14707o(628);
                    throw th;
                }
            }
            MethodCollector.m14707o(628);
        }

        public void requestRender() {
            MethodCollector.m14708i(622);
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 7).isSupported) {
                MethodCollector.m14707o(622);
                return;
            }
            synchronized (GLTextureView.sGLThreadManager) {
                try {
                    this.mRequestRender = true;
                    GLTextureView.sGLThreadManager.notifyAll();
                } catch (Throwable th) {
                    MethodCollector.m14707o(622);
                    throw th;
                }
            }
            MethodCollector.m14707o(622);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
                return;
            }
            setName("GLThread " + getId());
            try {
                guardedRun();
            } catch (InterruptedException | RuntimeException unused) {
            } catch (Throwable th) {
                GLTextureView.sGLThreadManager.threadExiting(this);
                throw th;
            }
            GLTextureView.sGLThreadManager.threadExiting(this);
        }

        public void onPause() {
            MethodCollector.m14708i(625);
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 10).isSupported) {
                MethodCollector.m14707o(625);
                return;
            }
            synchronized (GLTextureView.sGLThreadManager) {
                try {
                    this.mRequestPaused = true;
                    GLTextureView.sGLThreadManager.notifyAll();
                    while (!this.mExited && !this.mPaused) {
                        try {
                            GLTextureView.sGLThreadManager.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.m14707o(625);
                    throw th;
                }
            }
            MethodCollector.m14707o(625);
        }

        public void onResume() {
            MethodCollector.m14708i(626);
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 11).isSupported) {
                MethodCollector.m14707o(626);
                return;
            }
            synchronized (GLTextureView.sGLThreadManager) {
                try {
                    this.mRequestPaused = false;
                    this.mRequestRender = true;
                    this.mRenderComplete = false;
                    GLTextureView.sGLThreadManager.notifyAll();
                    while (!this.mExited && this.mPaused && !this.mRenderComplete) {
                        try {
                            GLTextureView.sGLThreadManager.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.m14707o(626);
                    throw th;
                }
            }
            MethodCollector.m14707o(626);
        }

        public void surfaceCreated() {
            MethodCollector.m14708i(623);
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 8).isSupported) {
                MethodCollector.m14707o(623);
                return;
            }
            synchronized (GLTextureView.sGLThreadManager) {
                try {
                    this.mHasSurface = true;
                    this.mFinishedCreatingEglSurface = false;
                    GLTextureView.sGLThreadManager.notifyAll();
                    while (this.mWaitingForSurface && !this.mFinishedCreatingEglSurface && !this.mExited) {
                        try {
                            GLTextureView.sGLThreadManager.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.m14707o(623);
                    throw th;
                }
            }
            MethodCollector.m14707o(623);
        }

        public void surfaceDestroyed() {
            MethodCollector.m14708i(624);
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 9).isSupported) {
                MethodCollector.m14707o(624);
                return;
            }
            synchronized (GLTextureView.sGLThreadManager) {
                try {
                    this.mHasSurface = false;
                    GLTextureView.sGLThreadManager.notifyAll();
                    while (!this.mWaitingForSurface && !this.mExited) {
                        try {
                            GLTextureView.sGLThreadManager.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.m14707o(624);
                    throw th;
                }
            }
            MethodCollector.m14707o(624);
        }

        /* JADX WARN: Finally extract failed */
        private void guardedRun() {
            boolean z;
            GLTextureView gLTextureView;
            MethodCollector.m14708i(619);
            boolean z2 = false;
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4).isSupported) {
                MethodCollector.m14707o(619);
                return;
            }
            this.mEglHelper = new EglHelper(this.mGLTextureViewWeakRef);
            this.mHaveEglContext = false;
            this.mHaveEglSurface = false;
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            GL10 gl10 = null;
            boolean z6 = false;
            boolean z7 = false;
            boolean z8 = false;
            boolean z9 = false;
            int i = 0;
            int i2 = 0;
            Runnable runnable = null;
            boolean z10 = false;
            while (true) {
                try {
                    synchronized (GLTextureView.sGLThreadManager) {
                        while (true) {
                            if (this.mHaveEglContext && !this.mEventQueue.isEmpty()) {
                                ArrayList<Runnable> arrayList = this.mEventQueue;
                                int i3 = z2 ? 1 : 0;
                                int i4 = z2 ? 1 : 0;
                                int i5 = z2 ? 1 : 0;
                                int i6 = z2 ? 1 : 0;
                                int i7 = z2 ? 1 : 0;
                                runnable = arrayList.remove(i3);
                                break;
                            } else if (this.mShouldExit) {
                                this.mGLTextureViewWeakRef.get().onExitContext();
                                synchronized (GLTextureView.sGLThreadManager) {
                                    try {
                                        stopEglSurfaceLocked();
                                        stopEglContextLocked();
                                    } catch (Throwable th) {
                                        th = th;
                                        while (true) {
                                            try {
                                                break;
                                            } catch (Throwable th2) {
                                                th = th2;
                                            }
                                        }
                                        MethodCollector.m14707o(619);
                                        throw th;
                                    }
                                }
                                MethodCollector.m14707o(619);
                                return;
                            } else {
                                if (this.mPaused != this.mRequestPaused) {
                                    z = this.mRequestPaused;
                                    this.mPaused = this.mRequestPaused;
                                    GLTextureView.sGLThreadManager.notifyAll();
                                } else {
                                    z = false;
                                }
                                if (this.mShouldReleaseEglContext) {
                                    this.mGLTextureViewWeakRef.get().onExitContext();
                                    stopEglSurfaceLocked();
                                    stopEglContextLocked();
                                    this.mShouldReleaseEglContext = z2;
                                    z5 = true;
                                }
                                if (z3) {
                                    this.mGLTextureViewWeakRef.get().onExitContext();
                                    stopEglSurfaceLocked();
                                    stopEglContextLocked();
                                    z3 = false;
                                }
                                if (z) {
                                    if (this.mHaveEglSurface) {
                                        stopEglSurfaceLocked();
                                    }
                                    if (this.mHaveEglContext && ((gLTextureView = this.mGLTextureViewWeakRef.get()) == null || !gLTextureView.mPreserveEGLContextOnPause || GLTextureView.sGLThreadManager.shouldReleaseEGLContextWhenPausing())) {
                                        stopEglContextLocked();
                                    }
                                    if (GLTextureView.sGLThreadManager.shouldTerminateEGLWhenPausing()) {
                                        this.mEglHelper.finish();
                                    }
                                }
                                if (!this.mHasSurface && !this.mWaitingForSurface) {
                                    if (this.mHaveEglSurface) {
                                        stopEglSurfaceLocked();
                                    }
                                    this.mWaitingForSurface = true;
                                    this.mSurfaceIsBad = z2;
                                    GLTextureView.sGLThreadManager.notifyAll();
                                }
                                if (this.mHasSurface && this.mWaitingForSurface) {
                                    this.mWaitingForSurface = z2;
                                    GLTextureView.sGLThreadManager.notifyAll();
                                }
                                if (z4) {
                                    this.mRenderComplete = true;
                                    GLTextureView.sGLThreadManager.notifyAll();
                                    z4 = false;
                                    z10 = false;
                                }
                                if (readyToDraw()) {
                                    if (!this.mHaveEglContext) {
                                        if (z5) {
                                            z5 = false;
                                        } else if (GLTextureView.sGLThreadManager.tryAcquireEglContextLocked(this)) {
                                            try {
                                                this.mEglHelper.start();
                                                this.mHaveEglContext = true;
                                                GLTextureView.sGLThreadManager.notifyAll();
                                                z6 = true;
                                            } catch (RuntimeException e) {
                                                GLTextureView.sGLThreadManager.releaseEglContextLocked(this);
                                                MethodCollector.m14707o(619);
                                                throw e;
                                            }
                                        }
                                    }
                                    if (this.mHaveEglContext && !this.mHaveEglSurface) {
                                        this.mHaveEglSurface = true;
                                        z7 = true;
                                        z8 = true;
                                        z9 = true;
                                    }
                                    if (this.mHaveEglSurface) {
                                        if (this.mSizeChanged) {
                                            i = this.mWidth;
                                            i2 = this.mHeight;
                                            this.mSizeChanged = z2;
                                            z7 = true;
                                            z9 = true;
                                            z10 = true;
                                        }
                                        this.mRequestRender = z2;
                                        GLTextureView.sGLThreadManager.notifyAll();
                                    }
                                }
                                GLTextureView.sGLThreadManager.wait();
                                z2 = false;
                            }
                        }
                    }
                    if (z7) {
                        if (this.mEglHelper.createSurface()) {
                            synchronized (GLTextureView.sGLThreadManager) {
                                this.mFinishedCreatingEglSurface = true;
                                GLTextureView.sGLThreadManager.notifyAll();
                            }
                            z7 = false;
                        } else {
                            synchronized (GLTextureView.sGLThreadManager) {
                                this.mFinishedCreatingEglSurface = true;
                                this.mSurfaceIsBad = true;
                                GLTextureView.sGLThreadManager.notifyAll();
                            }
                        }
                    }
                    if (z8) {
                        gl10 = (GL10) this.mEglHelper.createGL();
                        GLTextureView.sGLThreadManager.checkGLDriver(gl10);
                        z8 = false;
                    }
                    if (z6) {
                        GLTextureView gLTextureView2 = this.mGLTextureViewWeakRef.get();
                        if (gLTextureView2 != null) {
                            gLTextureView2.mRenderer.onSurfaceCreated(gl10, this.mEglHelper.mEglConfig);
                        }
                        z6 = false;
                    }
                    if (runnable != null) {
                        runnable.run();
                        runnable = null;
                    } else {
                        if (z9) {
                            GLTextureView gLTextureView3 = this.mGLTextureViewWeakRef.get();
                            if (gLTextureView3 != null) {
                                gLTextureView3.mRenderer.onSurfaceChanged(gl10, i, i2);
                            }
                            z9 = false;
                        }
                        GLTextureView gLTextureView4 = this.mGLTextureViewWeakRef.get();
                        if (gLTextureView4 != null) {
                            gLTextureView4.mRenderer.onDrawFrame(gl10);
                        }
                        int swap = this.mEglHelper.swap();
                        if (swap != 12288) {
                            if (swap != 12302) {
                                EglHelper.logEglErrorAsWarning("GLThread", "eglSwapBuffers", swap);
                                synchronized (GLTextureView.sGLThreadManager) {
                                    this.mSurfaceIsBad = true;
                                    GLTextureView.sGLThreadManager.notifyAll();
                                }
                            } else {
                                z3 = true;
                            }
                        }
                        if (z10) {
                            z4 = true;
                        }
                        z2 = false;
                    }
                } catch (Throwable th3) {
                    synchronized (GLTextureView.sGLThreadManager) {
                        try {
                            stopEglSurfaceLocked();
                            stopEglContextLocked();
                            MethodCollector.m14707o(619);
                            throw th3;
                        } catch (Throwable th4) {
                            th = th4;
                            while (true) {
                                try {
                                    break;
                                } catch (Throwable th5) {
                                    th = th5;
                                }
                            }
                            MethodCollector.m14707o(619);
                            throw th;
                        }
                    }
                }
            }
        }

        public GLThread(WeakReference<GLTextureView> weakReference) {
            this.mGLTextureViewWeakRef = weakReference;
        }

        public void queueEvent(Runnable runnable) {
            MethodCollector.m14708i(629);
            if (PatchProxy.proxy(new Object[]{runnable}, this, changeQuickRedirect, false, 15).isSupported) {
                MethodCollector.m14707o(629);
            } else if (runnable != null) {
                synchronized (GLTextureView.sGLThreadManager) {
                    try {
                        this.mEventQueue.add(runnable);
                        GLTextureView.sGLThreadManager.notifyAll();
                    } catch (Throwable th) {
                        MethodCollector.m14707o(629);
                        throw th;
                    }
                }
                MethodCollector.m14707o(629);
            } else {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("r must not be null");
                MethodCollector.m14707o(629);
                throw illegalArgumentException;
            }
        }

        public void setRenderMode(int i) {
            MethodCollector.m14708i(620);
            if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 6).isSupported) {
                MethodCollector.m14707o(620);
            } else if (i >= 0 && i <= 1) {
                synchronized (GLTextureView.sGLThreadManager) {
                    try {
                        this.mRenderMode = i;
                        GLTextureView.sGLThreadManager.notifyAll();
                    } catch (Throwable th) {
                        MethodCollector.m14707o(620);
                        throw th;
                    }
                }
                MethodCollector.m14707o(620);
            } else {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("renderMode");
                MethodCollector.m14707o(620);
                throw illegalArgumentException;
            }
        }

        public void onWindowResize(int i, int i2) {
            MethodCollector.m14708i(627);
            if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 12).isSupported) {
                MethodCollector.m14707o(627);
                return;
            }
            synchronized (GLTextureView.sGLThreadManager) {
                try {
                    this.mWidth = i;
                    this.mHeight = i2;
                    this.mSizeChanged = true;
                    this.mRequestRender = true;
                    this.mRenderComplete = false;
                    GLTextureView.sGLThreadManager.notifyAll();
                    while (!this.mExited && !this.mPaused && !this.mRenderComplete && ableToDraw()) {
                        try {
                            GLTextureView.sGLThreadManager.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.m14707o(627);
                    throw th;
                }
            }
            MethodCollector.m14707o(627);
        }
    }

    /* loaded from: classes10.dex */
    public static class LogWriter extends Writer {
        public static ChangeQuickRedirect changeQuickRedirect;
        public StringBuilder mBuilder = new StringBuilder();

        static {
            Covode.recordClassIndex(9530);
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
                return;
            }
            flushBuilder();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2).isSupported) {
                return;
            }
            flushBuilder();
        }

        private void flushBuilder() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4).isSupported && this.mBuilder.length() > 0) {
                StringBuilder sb = this.mBuilder;
                sb.delete(0, sb.length());
            }
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) {
            if (PatchProxy.proxy(new Object[]{cArr, Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 3).isSupported) {
                return;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                char c = cArr[i + i3];
                if (c == '\n') {
                    flushBuilder();
                } else {
                    this.mBuilder.append(c);
                }
            }
        }
    }

    private void checkRenderThreadState() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 25).isSupported || this.mGLThread == null) {
            return;
        }
        throw new IllegalStateException("setRenderer has already been called for this instance.");
    }

    private void init() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        setSurfaceTextureListener(this);
    }

    public int getRenderMode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 11);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        return this.mGLThread.getRenderMode();
    }

    public void onDestroy() {
        SurfaceTexture surfaceTexture;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21).isSupported && (surfaceTexture = this.mPrevSurfaceTexture) != null) {
            surfaceTexture.release();
        }
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 24).isSupported) {
            return;
        }
        GLThread gLThread = this.mGLThread;
        if (gLThread != null) {
            gLThread.requestExitAndWait();
        }
        this.mDetached = true;
        super.onDetachedFromWindow();
    }

    public void onPause() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19).isSupported) {
            return;
        }
        this.mGLThread.onPause();
    }

    public void requestRender() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 12).isSupported) {
            return;
        }
        this.mGLThread.requestRender();
    }

    public void finalize() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        try {
            if (this.mGLThread != null) {
                this.mGLThread.requestExitAndWait();
            }
        } finally {
            super.finalize();
        }
    }

    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20).isSupported) {
            return;
        }
        if (this.mPrevSurfaceTexture != null && getSurfaceTexture() != this.mPrevSurfaceTexture) {
            int i = Build.VERSION.SDK_INT;
            setSurfaceTexture(this.mPrevSurfaceTexture);
            this.mGLThread.surfaceCreated();
        }
        this.mGLThread.onResume();
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        int i;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 23).isSupported) {
            return;
        }
        super.onAttachedToWindow();
        if (this.mDetached && this.mRenderer != null) {
            GLThread gLThread = this.mGLThread;
            if (gLThread != null) {
                i = gLThread.getRenderMode();
            } else {
                i = 1;
            }
            this.mGLThread = new GLThread(this.mThisWeakRef);
            if (i != 1) {
                this.mGLThread.setRenderMode(i);
            }
            this.mGLThread.onWindowResize(getWidth(), getHeight());
            this.mGLThread.start();
        }
        this.mDetached = false;
    }

    public void setDebugFlags(int i) {
        this.mDebugFlags = i;
    }

    public void setGLWrapper(GLWrapper gLWrapper) {
        this.mGLWrapper = gLWrapper;
    }

    public void setPreserveEGLContextOnPause(boolean z) {
        this.mPreserveEGLContextOnPause = z;
    }

    /* loaded from: classes10.dex */
    public class DefaultContextFactory implements EGLContextFactory {
        public static ChangeQuickRedirect changeQuickRedirect;
        public int EGL_CONTEXT_CLIENT_VERSION;

        static {
            Covode.recordClassIndex(9521);
        }

        public DefaultContextFactory() {
            this.EGL_CONTEXT_CLIENT_VERSION = 12440;
        }

        public /* synthetic */ DefaultContextFactory(GLTextureView gLTextureView, C24701 c24701) {
            this();
        }

        @Override // com.bef.effectsdk.GLTextureView.EGLContextFactory
        public void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
            if (!PatchProxy.proxy(new Object[]{egl10, eGLDisplay, eGLContext}, this, changeQuickRedirect, false, 2).isSupported && !egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                EglHelper.throwEglException("eglDestroyContex", egl10.eglGetError());
            }
        }

        @Override // com.bef.effectsdk.GLTextureView.EGLContextFactory
        public EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{egl10, eGLDisplay, eGLConfig}, this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return (EGLContext) proxy.result;
            }
            EGLContext eglCreateContext = egl10.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{this.EGL_CONTEXT_CLIENT_VERSION, 3, 12344});
            GLTextureView.this.mEGLContextClientVersion = 3;
            if (eglCreateContext == EGL10.EGL_NO_CONTEXT) {
                eglCreateContext = egl10.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{this.EGL_CONTEXT_CLIENT_VERSION, 2, 12344});
                GLTextureView.this.mEGLContextClientVersion = 2;
                if (eglCreateContext == EGL10.EGL_NO_CONTEXT) {
                    GLTextureView.this.mEGLContextClientVersion = 0;
                }
            }
            return eglCreateContext;
        }
    }

    public GLTextureView(Context context) {
        super(context);
        MethodCollector.m14708i(634);
        init();
        MethodCollector.m14707o(634);
    }

    /* renamed from: on */
    public void m16004on(SurfaceHolder surfaceHolder) {
        if (PatchProxy.proxy(new Object[]{surfaceHolder}, this, changeQuickRedirect, false, 18).isSupported) {
            return;
        }
        this.mGLThread.surfaceCreated();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (!PatchProxy.proxy(new Object[]{surfaceTexture}, this, changeQuickRedirect, false, 17).isSupported && getRenderMode() != 0) {
            requestRender();
        }
    }

    public void queueEvent(Runnable runnable) {
        if (PatchProxy.proxy(new Object[]{runnable}, this, changeQuickRedirect, false, 22).isSupported) {
            return;
        }
        this.mGLThread.queueEvent(runnable);
    }

    public void setEGLConfigChooser(EGLConfigChooser eGLConfigChooser) {
        if (PatchProxy.proxy(new Object[]{eGLConfigChooser}, this, changeQuickRedirect, false, 6).isSupported) {
            return;
        }
        checkRenderThreadState();
        this.mEGLConfigChooser = eGLConfigChooser;
    }

    public void setEGLContextClientVersion(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 9).isSupported) {
            return;
        }
        checkRenderThreadState();
        this.mEGLContextClientVersion = i;
    }

    public void setEGLContextFactory(EGLContextFactory eGLContextFactory) {
        if (PatchProxy.proxy(new Object[]{eGLContextFactory}, this, changeQuickRedirect, false, 4).isSupported) {
            return;
        }
        checkRenderThreadState();
        this.mEGLContextFactory = eGLContextFactory;
    }

    public void setEGLWindowSurfaceFactory(EGLWindowSurfaceFactory eGLWindowSurfaceFactory) {
        if (PatchProxy.proxy(new Object[]{eGLWindowSurfaceFactory}, this, changeQuickRedirect, false, 5).isSupported) {
            return;
        }
        checkRenderThreadState();
        this.mEGLWindowSurfaceFactory = eGLWindowSurfaceFactory;
    }

    public void setRenderMode(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 10).isSupported) {
            return;
        }
        this.mGLThread.setRenderMode(i);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{surfaceTexture}, this, changeQuickRedirect, false, 16);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        GLThread gLThread = this.mGLThread;
        if (gLThread != null) {
            gLThread.surfaceDestroyed();
        }
        return false;
    }

    public void setEGLConfigChooser(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 7).isSupported) {
            return;
        }
        setEGLConfigChooser(new SimpleEGLConfigChooser(z));
    }

    /* loaded from: classes10.dex */
    public abstract class BaseConfigChooser implements EGLConfigChooser {
        public static ChangeQuickRedirect changeQuickRedirect;
        public int[] mConfigSpec;

        static {
            Covode.recordClassIndex(9519);
        }

        public abstract EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr);

        private int[] filterConfigSpec(int[] iArr) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{iArr}, this, changeQuickRedirect, false, 2);
            if (proxy.isSupported) {
                return (int[]) proxy.result;
            }
            if (GLTextureView.this.mEGLContextClientVersion == 2) {
                int length = iArr.length;
                int[] iArr2 = new int[length + 2];
                int i = length - 1;
                System.arraycopy(iArr, 0, iArr2, 0, i);
                iArr2[i] = 12352;
                iArr2[length] = 4;
                iArr2[length + 1] = 12344;
                return iArr2;
            } else if (GLTextureView.this.mEGLContextClientVersion == 3) {
                int length2 = iArr.length;
                int[] iArr3 = new int[length2 + 2];
                int i2 = length2 - 1;
                System.arraycopy(iArr, 0, iArr3, 0, i2);
                iArr3[i2] = 12352;
                iArr3[length2] = 64;
                iArr3[length2 + 1] = 12344;
                return iArr3;
            } else {
                return iArr;
            }
        }

        public BaseConfigChooser(int[] iArr) {
            this.mConfigSpec = filterConfigSpec(iArr);
        }

        @Override // com.bef.effectsdk.GLTextureView.EGLConfigChooser
        public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{egl10, eGLDisplay}, this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return (EGLConfig) proxy.result;
            }
            int[] iArr = new int[1];
            if (egl10.eglChooseConfig(eGLDisplay, this.mConfigSpec, null, 0, iArr)) {
                int i = iArr[0];
                if (i > 0) {
                    EGLConfig[] eGLConfigArr = new EGLConfig[i];
                    if (egl10.eglChooseConfig(eGLDisplay, this.mConfigSpec, eGLConfigArr, i, iArr)) {
                        EGLConfig chooseConfig = chooseConfig(egl10, eGLDisplay, eGLConfigArr);
                        if (chooseConfig != null) {
                            return chooseConfig;
                        }
                        throw new IllegalArgumentException("No config chosen");
                    }
                    throw new IllegalArgumentException("eglChooseConfig#2 failed");
                }
                throw new IllegalArgumentException("No configs match configSpec");
            }
            throw new IllegalArgumentException("eglChooseConfig failed");
        }
    }

    public void setRenderer(GLSurfaceView.Renderer renderer) {
        if (PatchProxy.proxy(new Object[]{renderer}, this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        checkRenderThreadState();
        if (this.mEGLConfigChooser == null) {
            this.mEGLConfigChooser = new SimpleEGLConfigChooser(true);
        }
        if (this.mEGLContextFactory == null) {
            this.mEGLContextFactory = new DefaultContextFactory(this, null);
        }
        if (this.mEGLWindowSurfaceFactory == null) {
            this.mEGLWindowSurfaceFactory = new DefaultWindowSurfaceFactory(null);
        }
        this.mRenderer = renderer;
        this.mGLThread = new GLThread(this.mThisWeakRef);
        this.mGLThread.start();
    }

    /* loaded from: classes10.dex */
    public class SimpleEGLConfigChooser extends ComponentSizeChooser {
        static {
            Covode.recordClassIndex(9531);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public SimpleEGLConfigChooser(boolean r10) {
            /*
                r8 = this;
                r1 = r9
                com.bef.effectsdk.GLTextureView.this = r1
                if (r10 == 0) goto L16
                r0 = 16
                r6 = 16
            L9:
                r7 = 0
                r2 = 8
                r3 = 8
                r4 = 8
                r5 = 0
                r0 = r8
                r0.<init>(r2, r3, r4, r5, r6, r7)
                return
            L16:
                r0 = 0
                r6 = 0
                goto L9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bef.effectsdk.GLTextureView.SimpleEGLConfigChooser.<init>(com.bef.effectsdk.GLTextureView, boolean):void");
        }
    }

    public GLTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m14708i(635);
        init();
        MethodCollector.m14707o(635);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (PatchProxy.proxy(new Object[]{surfaceTexture, Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 13).isSupported) {
            return;
        }
        this.mPrevSurfaceTexture = surfaceTexture;
        GLThread gLThread = this.mGLThread;
        if (gLThread != null) {
            gLThread.surfaceCreated();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        if (PatchProxy.proxy(new Object[]{surfaceTexture, Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 14).isSupported) {
            return;
        }
        this.mGLThread.onWindowResize(i, i2);
    }

    /* loaded from: classes10.dex */
    public class ComponentSizeChooser extends BaseConfigChooser {
        public static ChangeQuickRedirect changeQuickRedirect;
        public int mAlphaSize;
        public int mBlueSize;
        public int mDepthSize;
        public int mGreenSize;
        public int mRedSize;
        public int mStencilSize;
        public int[] mValue = new int[1];

        static {
            Covode.recordClassIndex(9520);
        }

        @Override // com.bef.effectsdk.GLTextureView.BaseConfigChooser
        public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{egl10, eGLDisplay, eGLConfigArr}, this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return (EGLConfig) proxy.result;
            }
            for (EGLConfig eGLConfig : eGLConfigArr) {
                int findConfigAttrib = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12325, 0);
                int findConfigAttrib2 = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12326, 0);
                if (findConfigAttrib >= this.mDepthSize && findConfigAttrib2 >= this.mStencilSize) {
                    int findConfigAttrib3 = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12324, 0);
                    int findConfigAttrib4 = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12323, 0);
                    int findConfigAttrib5 = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12322, 0);
                    int findConfigAttrib6 = findConfigAttrib(egl10, eGLDisplay, eGLConfig, 12321, 0);
                    if (findConfigAttrib3 == this.mRedSize && findConfigAttrib4 == this.mGreenSize && findConfigAttrib5 == this.mBlueSize && findConfigAttrib6 == this.mAlphaSize) {
                        return eGLConfig;
                    }
                }
            }
            return null;
        }

        private int findConfigAttrib(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i, int i2) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{egl10, eGLDisplay, eGLConfig, Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 2);
            if (proxy.isSupported) {
                return ((Integer) proxy.result).intValue();
            }
            if (egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i, this.mValue)) {
                return this.mValue[0];
            }
            return i2;
        }

        public ComponentSizeChooser(int i, int i2, int i3, int i4, int i5, int i6) {
            super(new int[]{12324, i, 12323, i2, 12322, i3, 12321, i4, 12325, i5, 12326, i6, 12344});
            this.mRedSize = i;
            this.mGreenSize = i2;
            this.mBlueSize = i3;
            this.mAlphaSize = i4;
            this.mDepthSize = i5;
            this.mStencilSize = i6;
        }
    }

    @Override // android.view.TextureView, android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, changeQuickRedirect, false, 15).isSupported) {
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        GLThread gLThread = this.mGLThread;
        if (gLThread != null) {
            gLThread.onWindowResize(i, i2);
        }
    }

    public void setEGLConfigChooser(int i, int i2, int i3, int i4, int i5, int i6) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)}, this, changeQuickRedirect, false, 8).isSupported) {
            return;
        }
        setEGLConfigChooser(new ComponentSizeChooser(i, i2, i3, i4, i5, i6));
    }
}
