package com.bytedance.android.live.lynx.p397ui;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.lynx.tasm.behavior.LynxContext;
import com.lynx.tasm.behavior.LynxProp;
import com.lynx.tasm.p1544ui.image.FrescoImageView;
import com.lynx.tasm.p1544ui.image.UIImage;
import kotlin.jvm.internal.Intrinsics;
import p003X.T43;

/* renamed from: com.bytedance.android.live.lynx.ui.EcomCustomUIImage */
/* loaded from: classes10.dex */
public final class EcomCustomUIImage extends UIImage<ECCustomFrescoImageView> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(32313);
    }

    public EcomCustomUIImage(LynxContext lynxContext) {
        super(lynxContext);
    }

    @Override // com.lynx.tasm.p1544ui.image.UIImage, com.lynx.tasm.behavior.p1543ui.LynxUI
    /* renamed from: createView  reason: collision with other method in class */
    public final ECCustomFrescoImageView mo29230createView(Context context) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (ECCustomFrescoImageView) proxy.result;
        }
        this.mDraweeControllerBuilder = Fresco.newDraweeControllerBuilder();
        Intrinsics.checkNotNull(context);
        ECCustomFrescoImageView eCCustomFrescoImageView = new ECCustomFrescoImageView(context, this.mDraweeControllerBuilder, null, null);
        eCCustomFrescoImageView.setImageLoaderCallback(new T43(this));
        eCCustomFrescoImageView.setFadeDuration(300);
        return eCCustomFrescoImageView;
    }

    @LynxProp(name = "fade-duration")
    public final void setFadeDuration(int i) {
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 2).isSupported && getView() != 0) {
            ((FrescoImageView) getView()).setFadeDuration(i);
        }
    }
}
