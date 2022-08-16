package com.bytedance.android.live.lynx.p397ui;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.facebook.drawee.controller.ControllerListener;
import com.lynx.tasm.behavior.LynxContext;
import com.lynx.tasm.behavior.LynxProp;
import com.lynx.tasm.behavior.LynxUIMethod;
import com.lynx.tasm.behavior.p1543ui.LynxUI;
import p003X.C109653TFf;
import p003X.M0R;

/* renamed from: com.bytedance.android.live.lynx.ui.WebcastImage */
/* loaded from: classes10.dex */
public class WebcastImage extends LynxUI<ImageView> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public Animatable mAnim;
    public boolean mAutoPlayTemp;
    public int mDurationTemp = 300;
    public String mSrcTemp = "";

    static {
        Covode.recordClassIndex(32390);
    }

    @LynxUIMethod
    public void startAnim() {
        Animatable animatable;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5).isSupported && (animatable = this.mAnim) != null && !animatable.isRunning()) {
            this.mAnim.start();
        }
    }

    @LynxUIMethod
    public void stopAnim() {
        Animatable animatable;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6).isSupported && (animatable = this.mAnim) != null && animatable.isRunning()) {
            this.mAnim.stop();
        }
    }

    private void handleImage() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 7).isSupported || TextUtils.isEmpty(this.mSrcTemp) || getView() == null || !M0R.LIZ(getView().getContext())) {
            return;
        }
        Animatable animatable = this.mAnim;
        if (animatable != null && animatable.isRunning()) {
            this.mAnim.stop();
        }
        this.mAnim = null;
        C109653TFf LIZ = C109653TFf.LIZ(getView().getContext()).LIZ(this.mSrcTemp).LIZ(ImageView.ScaleType.CENTER_CROP);
        LIZ.LIZIZ(this.mAutoPlayTemp);
        LIZ.LIZJ = this.mDurationTemp;
        LIZ.LIZ(new ControllerListener() { // from class: com.bytedance.android.live.lynx.ui.WebcastImage.1
            static {
                Covode.recordClassIndex(32393);
            }

            @Override // com.facebook.drawee.controller.ControllerListener
            public final void onFailure(String str, Throwable th) {
            }

            @Override // com.facebook.drawee.controller.ControllerListener
            public final void onIntermediateImageFailed(String str, Throwable th) {
            }

            @Override // com.facebook.drawee.controller.ControllerListener
            public final void onIntermediateImageSet(String str, Object obj) {
            }

            @Override // com.facebook.drawee.controller.ControllerListener
            public final void onRelease(String str) {
            }

            @Override // com.facebook.drawee.controller.ControllerListener
            public final void onSubmit(String str, Object obj) {
            }

            @Override // com.facebook.drawee.controller.ControllerListener
            public final void onFinalImageSet(String str, Object obj, Animatable animatable2) {
                WebcastImage.this.mAnim = animatable2;
            }
        });
        LIZ.LIZ(getView());
    }

    public WebcastImage(LynxContext lynxContext) {
        super(lynxContext);
    }

    @LynxProp(name = "auto-play")
    public void setAutoPlay(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        this.mAutoPlayTemp = z;
        handleImage();
    }

    @LynxProp(name = "fade-duration")
    public void setFadeDuration(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 4).isSupported) {
            return;
        }
        this.mDurationTemp = i;
        handleImage();
    }

    @Override // com.lynx.tasm.behavior.p1543ui.LynxUI
    /* renamed from: createView  reason: collision with other method in class */
    public ImageView mo29230createView(Context context) {
        MethodCollector.m14708i(2127);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            ImageView imageView = (ImageView) proxy.result;
            MethodCollector.m14707o(2127);
            return imageView;
        }
        ImageView imageView2 = new ImageView(context);
        MethodCollector.m14707o(2127);
        return imageView2;
    }

    @LynxProp(name = "src")
    public void setSrc(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        this.mSrcTemp = str;
        if (getView() != null) {
            if (TextUtils.isEmpty(this.mSrcTemp)) {
                getView().setVisibility(8);
            } else {
                getView().setVisibility(0);
            }
        }
        handleImage();
    }
}
