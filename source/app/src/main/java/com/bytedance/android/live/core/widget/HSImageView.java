package com.bytedance.android.live.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.view.SimpleDraweeView;

/* loaded from: classes10.dex */
public class HSImageView extends SimpleDraweeView {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(24226);
    }

    public final boolean LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (getController() == null || getController().getAnimatable() == null) {
            return false;
        }
        return getController().getAnimatable().isRunning();
    }

    public HSImageView(Context context) {
        super(context);
    }

    public HSImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HSImageView(Context context, GenericDraweeHierarchy genericDraweeHierarchy) {
        super(context, genericDraweeHierarchy);
    }

    public HSImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public HSImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
