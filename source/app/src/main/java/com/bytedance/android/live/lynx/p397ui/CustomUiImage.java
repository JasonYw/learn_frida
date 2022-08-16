package com.bytedance.android.live.lynx.p397ui;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.lynx.tasm.behavior.LynxContext;
import com.lynx.tasm.behavior.LynxProp;
import com.lynx.tasm.p1544ui.image.FrescoImageView;
import com.lynx.tasm.p1544ui.image.UIImage;

/* renamed from: com.bytedance.android.live.lynx.ui.CustomUiImage */
/* loaded from: classes10.dex */
public class CustomUiImage extends UIImage<FrescoImageView> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(32290);
    }

    public CustomUiImage(LynxContext lynxContext) {
        super(lynxContext);
    }

    @Override // com.lynx.tasm.p1544ui.image.UIImage, com.lynx.tasm.behavior.p1543ui.LynxUI
    /* renamed from: createView */
    public /* bridge */ /* synthetic */ View mo29230createView(Context context) {
        return mo29230createView(context);
    }

    @Override // com.lynx.tasm.p1544ui.image.UIImage, com.lynx.tasm.behavior.p1543ui.LynxUI
    /* renamed from: createView  reason: collision with other method in class */
    public FrescoImageView mo29230createView(Context context) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (FrescoImageView) proxy.result;
        }
        FrescoImageView mo29230createView = super.mo29230createView(context);
        mo29230createView.setFadeDuration(300);
        return mo29230createView;
    }

    @LynxProp(name = "fade-duration")
    public void setFadeDuration(int i) {
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 2).isSupported && getView() != 0) {
            ((FrescoImageView) getView()).setFadeDuration(i);
        }
    }
}
