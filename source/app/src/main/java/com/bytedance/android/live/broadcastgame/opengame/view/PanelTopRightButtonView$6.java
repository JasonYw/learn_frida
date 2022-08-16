package com.bytedance.android.live.broadcastgame.opengame.view;

import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C87993Kln;

/* loaded from: classes5.dex */
public final class PanelTopRightButtonView$6 extends Lambda implements Function1<Boolean, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C87993Kln this$0;

    static {
        Covode.recordClassIndex(21153);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PanelTopRightButtonView$6(C87993Kln c87993Kln) {
        super(1);
        this.this$0 = c87993Kln;
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [kotlin.Unit, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Boolean bool) {
        int i;
        boolean booleanValue = bool.booleanValue();
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Byte.valueOf(booleanValue ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        if (booleanValue) {
            ImageView imageView = this.this$0.LIZIZ;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ImageView imageView2 = this.this$0.LIZJ;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
            View view = this.this$0.LIZLLL;
            if (view != null) {
                view.setVisibility(8);
            }
            ViewParent parent = this.this$0.getParent();
            if (!(parent instanceof View)) {
                parent = null;
            }
            View view2 = (View) parent;
            if (view2 != null) {
                view2.setBackground(null);
            }
            return Unit.INSTANCE;
        }
        ImageView imageView3 = this.this$0.LIZIZ;
        if (imageView3 != null) {
            imageView3.setVisibility(0);
        }
        View view3 = this.this$0.LIZLLL;
        if (view3 != null) {
            view3.setVisibility(0);
        }
        ImageView imageView4 = this.this$0.LIZJ;
        if (imageView4 != null) {
            imageView4.setVisibility(0);
        }
        ViewParent parent2 = this.this$0.getParent();
        if (!(parent2 instanceof View)) {
            parent2 = null;
        }
        View view4 = (View) parent2;
        if (view4 == null) {
            return null;
        }
        if (this.this$0.f8594LJ) {
            i = 2130855869;
        } else {
            i = 2130855868;
        }
        view4.setBackgroundResource(i);
        return Unit.INSTANCE;
    }
}
