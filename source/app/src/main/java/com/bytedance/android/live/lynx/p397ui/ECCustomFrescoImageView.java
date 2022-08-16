package com.bytedance.android.live.lynx.p397ui;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.facebook.drawee.controller.AbstractDraweeControllerBuilder;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.facebook.imagepipeline.animated.base.AnimatedImage;
import com.facebook.imagepipeline.image.CloseableAnimatedImage;
import com.facebook.imagepipeline.image.ImageInfo;
import com.lynx.tasm.p1544ui.image.FrescoImageView;
import com.lynx.tasm.p1544ui.image.GlobalImageLoadListener;
import com.lynx.tasm.p1544ui.image.fresco.LoopCountModifyingBackend;
import com.lynx.tasm.p1544ui.image.helper.ByteDanceFrescoUtils;
import java.util.HashMap;
import p003X.C106862S5w;
import p003X.C109454T7o;
import p003X.C499305oK;

/* renamed from: com.bytedance.android.live.lynx.ui.ECCustomFrescoImageView */
/* loaded from: classes10.dex */
public final class ECCustomFrescoImageView extends FrescoImageView {
    public static final C109454T7o Companion = new C109454T7o((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect;
    public HashMap _$_findViewCache;

    static {
        Covode.recordClassIndex(32293);
    }

    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2).isSupported && (hashMap = this._$_findViewCache) != null) {
            hashMap.clear();
        }
    }

    public final View _$_findCachedViewById(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: com_bytedance_android_live_lynx_ui_ECCustomFrescoImageView__onDetachedFromWindow$___twin___ */
    public final void m15633x9f842e3a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5).isSupported) {
            return;
        }
        super.onDetachedFromWindow();
    }

    @Override // com.lynx.tasm.p1544ui.image.FrescoImageView, com.facebook.drawee.view.DraweeView, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4).isSupported) {
            return;
        }
        m15632x1f28a2b2(this);
    }

    /* renamed from: com_bytedance_android_live_lynx_ui_ECCustomFrescoImageView_com_ss_android_ugc_aweme_lancet_ImageStopLossLanect_imageViewOnDetachedFromWindow */
    public static void m15632x1f28a2b2(ECCustomFrescoImageView eCCustomFrescoImageView) {
        if (PatchProxy.proxy(new Object[]{eCCustomFrescoImageView}, null, changeQuickRedirect, true, 3).isSupported) {
            return;
        }
        eCCustomFrescoImageView.m15633x9f842e3a();
        C499305oK.LIZ(eCCustomFrescoImageView);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ECCustomFrescoImageView(Context context, AbstractDraweeControllerBuilder<?, ?, ?, ?> abstractDraweeControllerBuilder, GlobalImageLoadListener globalImageLoadListener, Object obj) {
        super(context, abstractDraweeControllerBuilder, globalImageLoadListener, obj);
        C106862S5w.LIZ(context);
        setControllerListener(new BaseControllerListener<ImageInfo>() { // from class: com.bytedance.android.live.lynx.ui.ECCustomFrescoImageView.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(32294);
            }

            @Override // com.facebook.drawee.controller.BaseControllerListener, com.facebook.drawee.controller.ControllerListener
            public final /* synthetic */ void onFinalImageSet(String str, Object obj2, Animatable animatable) {
                AnimatedImage image;
                ImageInfo imageInfo = (ImageInfo) obj2;
                if (!PatchProxy.proxy(new Object[]{str, imageInfo, animatable}, this, LIZ, false, 1).isSupported && (animatable instanceof AnimatedDrawable2) && (imageInfo instanceof CloseableAnimatedImage) && (image = ((CloseableAnimatedImage) imageInfo).getImage()) != null) {
                    int loopCount = image.getLoopCount();
                    if (ECCustomFrescoImageView.this.getLoopCount() > 0) {
                        loopCount = ECCustomFrescoImageView.this.getLoopCount();
                    }
                    AnimatedDrawable2 animatedDrawable2 = (AnimatedDrawable2) animatable;
                    animatedDrawable2.setAnimationBackend(new LoopCountModifyingBackend(animatedDrawable2.getAnimationBackend(), loopCount));
                    ByteDanceFrescoUtils.fixSlowBug(animatedDrawable2);
                }
            }
        });
    }
}
