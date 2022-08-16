package com.android.ttcjpaysdk.ocr.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.hardware.Camera;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import com.android.ttcjpaysdk.base.service.CJPayServiceManager;
import com.android.ttcjpaysdk.base.service.ICJPayBPEAService;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.ActionInvokeEntrance;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.CastProtectorUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import p003X.AbstractC108356SlS;
import p003X.AbstractC472484mA;
import p003X.C108442Smq;
import p003X.C116971W2r;
import p003X.SurfaceHolder$CallbackC108348SlK;

/* loaded from: classes10.dex */
public class OCRCodeView extends RelativeLayout implements Camera.PreviewCallback {
    public static ChangeQuickRedirect LIZ;
    public Camera LIZIZ;
    public SurfaceHolder$CallbackC108348SlK LIZJ;
    public AbstractC472484mA LIZLLL;

    /* renamed from: LJ */
    public AbstractC108356SlS f25508LJ;
    public Handler LJFF;
    public boolean LJI;
    public byte[] LJII;
    public HandlerThread LJIIIIZZ;
    public Handler LJIIIZ;
    public AtomicBoolean LJIIJ;
    public Runnable LJIIJJI;

    static {
        Covode.recordClassIndex(7914);
    }

    public static Camera LIZJ(int i) {
        Object obj;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, null, LIZ, true, 21);
        if (proxy.isSupported) {
            obj = proxy.result;
        } else {
            ActionInvokeEntrance.setEventUuid(100100);
            Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(Camera.class, new Object[]{Integer.valueOf(i)}, 100100, "android.hardware.Camera", false, null, false);
            if (!((Boolean) actionIntercept.first).booleanValue()) {
                Camera open = Camera.open(i);
                ActionInvokeEntrance.actionInvoke(open, Camera.class, new Object[]{Integer.valueOf(i)}, 100100, "com_android_ttcjpaysdk_ocr_view_OCRCodeView_android_hardware_Camera_open(I)Landroid/hardware/Camera;");
                return open;
            }
            obj = actionIntercept.second;
        }
        return (Camera) obj;
    }

    public Camera getCamera() {
        return this.LIZIZ;
    }

    public SurfaceHolder$CallbackC108348SlK getCameraPreview() {
        return this.LIZJ;
    }

    public final void LIZ() {
        AbstractC472484mA abstractC472484mA;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported && (abstractC472484mA = this.LIZLLL) != null) {
            abstractC472484mA.setVisibility(0);
        }
    }

    public final void LIZIZ() {
        AbstractC472484mA abstractC472484mA;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported && (abstractC472484mA = this.LIZLLL) != null) {
            abstractC472484mA.setVisibility(8);
        }
    }

    public final void LIZLLL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
            return;
        }
        LIZIZ(200);
    }

    public final void LJFF() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 14).isSupported) {
            return;
        }
        this.LIZJ.LIZJ();
    }

    public final void LJI() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 15).isSupported) {
            return;
        }
        this.LIZJ.LIZLLL();
    }

    /* renamed from: LJ */
    public final void m16043LJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported) {
            return;
        }
        this.LJI = false;
        Camera camera = this.LIZIZ;
        if (camera != null) {
            try {
                camera.setOneShotPreviewCallback(null);
            } catch (Exception unused) {
            }
        }
        Handler handler = this.LJFF;
        if (handler != null) {
            handler.removeCallbacks(this.LJIIJJI);
        }
    }

    private void LJII() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported && !PatchProxy.proxy(new Object[]{0}, this, LIZ, false, 6).isSupported && this.LIZIZ == null) {
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            for (int i = 0; i < Camera.getNumberOfCameras(); i++) {
                try {
                    Camera.getCameraInfo(i, cameraInfo);
                } catch (Exception unused) {
                }
                if (cameraInfo.facing == 0) {
                    LIZ(i);
                    return;
                }
            }
        }
    }

    public final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            return;
        }
        try {
            if (this.LIZIZ != null) {
                this.LIZJ.LIZIZ();
                this.LIZJ.setCamera(null);
                ICJPayBPEAService iCJPayBPEAService = (ICJPayBPEAService) CJPayServiceManager.getInstance().getIService(ICJPayBPEAService.class);
                if (iCJPayBPEAService != null) {
                    iCJPayBPEAService.releaseCamera(this.LIZIZ, "bpea-cjpay_android_ocr_release_camera");
                } else {
                    Camera camera = this.LIZIZ;
                    if (!PatchProxy.proxy(new Object[]{camera}, null, LIZ, true, 22).isSupported) {
                        ActionInvokeEntrance.setEventUuid(100101);
                        if (!((Boolean) ActionInvokeEntrance.actionIntercept(camera, new Object[0], 100101, "void", false, null, false).first).booleanValue()) {
                            ActionInvokeEntrance.actionInvoke(null, camera, new Object[0], 100106, "com_android_ttcjpaysdk_ocr_view_OCRCodeView_android_hardware_Camera_release(Landroid/hardware/Camera;)V");
                            camera.release();
                            ActionInvokeEntrance.actionInvoke(null, camera, new Object[0], 100101, "com_android_ttcjpaysdk_ocr_view_OCRCodeView_android_hardware_Camera_release(Landroid/hardware/Camera;)V");
                        }
                    }
                }
                this.LIZIZ = null;
            }
        } catch (Exception unused) {
        }
    }

    public void setImageCollectionListener(AbstractC108356SlS abstractC108356SlS) {
        this.f25508LJ = abstractC108356SlS;
    }

    private void LIZIZ(int i) {
        if (PatchProxy.proxy(new Object[]{200}, this, LIZ, false, 10).isSupported) {
            return;
        }
        this.LJI = true;
        this.LJIIJ.set(false);
        LJII();
        this.LJFF.removeCallbacks(this.LJIIJJI);
        this.LJFF.postDelayed(this.LJIIJJI, 200L);
    }

    public final void LIZ(boolean z) {
        AbstractC472484mA abstractC472484mA;
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 19).isSupported && (abstractC472484mA = this.LIZLLL) != null) {
            abstractC472484mA.LIZ(z);
        }
    }

    private void LIZ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 7).isSupported) {
            return;
        }
        try {
            ICJPayBPEAService iCJPayBPEAService = (ICJPayBPEAService) CJPayServiceManager.getInstance().getIService(ICJPayBPEAService.class);
            if (iCJPayBPEAService != null) {
                this.LIZIZ = iCJPayBPEAService.openCamera(i, "bpea-cjpay_android_ocr_camera");
            } else {
                this.LIZIZ = LIZJ(i);
            }
            if (this.LIZIZ == null && this.f25508LJ != null) {
                this.f25508LJ.LIZ();
            }
            this.LIZJ.setCamera(this.LIZIZ);
        } catch (Exception unused) {
            AbstractC108356SlS abstractC108356SlS = this.f25508LJ;
            if (abstractC108356SlS != null) {
                abstractC108356SlS.LIZ();
            }
        }
    }

    public final void LIZIZ(boolean z) {
        AbstractC472484mA abstractC472484mA;
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 20).isSupported && (abstractC472484mA = this.LIZLLL) != null) {
            abstractC472484mA.LIZIZ(z);
            this.LIZLLL.invalidate();
        }
    }

    public OCRCodeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, Camera camera) {
        Camera camera2;
        if (!PatchProxy.proxy(new Object[]{bArr, camera}, this, LIZ, false, 18).isSupported && this.LJI) {
            this.LIZJ.setBackgroundColor(CastProtectorUtils.parseColor("#80000000"));
            this.LJII = bArr;
            if (!this.LJIIJ.get() && (camera2 = this.LIZIZ) != null) {
                camera2.setOneShotPreviewCallback(this);
            }
        }
    }

    public OCRCodeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MethodCollector.m14708i(490);
        this.LJFF = new Handler();
        this.LJI = false;
        this.LJIIJ = new AtomicBoolean(false);
        this.LJIIJJI = new Runnable() { // from class: com.android.ttcjpaysdk.ocr.view.OCRCodeView.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(7915);
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported && OCRCodeView.this.LIZIZ != null && OCRCodeView.this.LJI) {
                    try {
                        OCRCodeView.this.LIZIZ.setOneShotPreviewCallback(OCRCodeView.this);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        if (!PatchProxy.proxy(new Object[]{context, attributeSet}, this, LIZ, false, 1).isSupported) {
            this.LIZJ = new SurfaceHolder$CallbackC108348SlK(getContext());
            this.LIZJ.setVisibility(4);
            setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{2130772092});
            try {
                int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                obtainStyledAttributes.recycle();
                this.LIZLLL = (AbstractC472484mA) C116971W2r.LIZ(LayoutInflater.from(context), resourceId, (ViewGroup) null, false);
                if (this.LIZLLL instanceof DefaultScanBoxView) {
                    int screenWidth = CJPayBasicUtils.getScreenWidth(context) - (C108442Smq.LIZ(context, 24.0f) * 2);
                    int i2 = (int) ((screenWidth * 212.0d) / 327.0d);
                    ((DefaultScanBoxView) this.LIZLLL).setRectWidth(screenWidth);
                    ((DefaultScanBoxView) this.LIZLLL).setRectHeight(i2);
                    ((DefaultScanBoxView) this.LIZLLL).setTopOffset(((CJPayBasicUtils.getScreenHeight(context) - C108442Smq.LIZ(context, 44.0f)) - i2) / 2);
                }
                this.LIZJ.setBackgroundColor(CastProtectorUtils.parseColor("#80000000"));
                this.LIZJ.setId(2131169730);
                addView(this.LIZJ);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(context, attributeSet);
                layoutParams.addRule(6, this.LIZJ.getId());
                layoutParams.addRule(8, this.LIZJ.getId());
                View view = this.LIZLLL;
                if (view != null) {
                    addView(view, layoutParams);
                }
                this.LIZJ.setAutoFocusCallback(new Camera.AutoFocusCallback() { // from class: com.android.ttcjpaysdk.ocr.view.OCRCodeView.2
                    public static ChangeQuickRedirect LIZ;

                    static {
                        Covode.recordClassIndex(7916);
                    }

                    @Override // android.hardware.Camera.AutoFocusCallback
                    public final void onAutoFocus(boolean z, Camera camera) {
                        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), camera}, this, LIZ, false, 1).isSupported && OCRCodeView.this.LJI && z) {
                            try {
                                Camera.Size previewSize = camera.getParameters().getPreviewSize();
                                final OCRCodeView oCRCodeView = OCRCodeView.this;
                                final byte[] bArr = OCRCodeView.this.LJII;
                                final int i3 = previewSize.width;
                                final int i4 = previewSize.height;
                                if (!PatchProxy.proxy(new Object[]{bArr, Integer.valueOf(i3), Integer.valueOf(i4)}, oCRCodeView, OCRCodeView.LIZ, false, 2).isSupported) {
                                    oCRCodeView.LJIIIZ.post(new Runnable() { // from class: com.android.ttcjpaysdk.ocr.view.OCRCodeView.3
                                        public static ChangeQuickRedirect LIZ;

                                        static {
                                            Covode.recordClassIndex(7917);
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                                                return;
                                            }
                                            final byte[] LIZ2 = C108442Smq.LIZ(bArr, i3, i4, 720);
                                            OCRCodeView.this.LJFF.post(new Runnable() { // from class: com.android.ttcjpaysdk.ocr.view.OCRCodeView.3.1
                                                public static ChangeQuickRedirect LIZ;

                                                static {
                                                    Covode.recordClassIndex(7918);
                                                }

                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported && OCRCodeView.this.f25508LJ != null && LIZ2 != null) {
                                                        OCRCodeView.this.f25508LJ.LIZ(LIZ2);
                                                    }
                                                }
                                            });
                                        }
                                    });
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                });
                this.LJIIIIZZ = new HandlerThread("Image Processing Thread");
                this.LJIIIIZZ.start();
                this.LJIIIZ = new Handler(this.LJIIIIZZ.getLooper());
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                MethodCollector.m14707o(490);
                throw th;
            }
        }
        MethodCollector.m14707o(490);
    }
}
