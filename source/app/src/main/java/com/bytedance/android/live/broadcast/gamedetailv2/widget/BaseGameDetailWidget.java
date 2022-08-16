package com.bytedance.android.live.broadcast.gamedetailv2.widget;

import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.gamedetailv2.pageview.AbstractC3125c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sve_core.AbstractC12642p;
import com.bytedance.ies.sve_list.RecyclerViewItemWidget;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C3799613e;
import p003X.LAB;

/* loaded from: classes5.dex */
public abstract class BaseGameDetailWidget<T extends AbstractC3125c> extends RecyclerViewItemWidget<T> implements Object<T> {
    public static ChangeQuickRedirect LJIIIIZZ;
    public final /* synthetic */ C3799613e<T> LIZ;

    static {
        Covode.recordClassIndex(16735);
    }

    public abstract void LIZ(boolean z, T t);

    @Override // com.bytedance.ies.sve_list.RecyclerViewItemWidget, com.bytedance.ies.sve_core.PureWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LJIIIIZZ, false, 7).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sve_list.RecyclerViewItemWidget, com.bytedance.ies.sve_core.PureWidget
    public void LIZLLL() {
        if (PatchProxy.proxy(new Object[0], this, LJIIIIZZ, false, 1).isSupported) {
            return;
        }
        super.LIZLLL();
        View view = this.contentView;
        Intrinsics.checkNotNullExpressionValue(view, "");
        BaseGameDetailWidget$onMount$1 baseGameDetailWidget$onMount$1 = new BaseGameDetailWidget$onMount$1(this);
        if (!PatchProxy.proxy(new Object[]{view, baseGameDetailWidget$onMount$1}, this, LJIIIIZZ, false, 4).isSupported) {
            C106862S5w.LIZ(view, baseGameDetailWidget$onMount$1);
            this.LIZ.LIZ(view, baseGameDetailWidget$onMount$1);
        }
    }

    @Override // com.bytedance.ies.sve_list.RecyclerViewItemWidget, com.bytedance.ies.sve_core.PureWidget
    /* renamed from: r_ */
    public void mo14489r_() {
        if (PatchProxy.proxy(new Object[0], this, LJIIIIZZ, false, 3).isSupported) {
            return;
        }
        super.mo14489r_();
        if (!PatchProxy.proxy(new Object[0], this, LJIIIIZZ, false, 5).isSupported) {
            this.LIZ.LIZ();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* bridge */ /* synthetic */ void LIZ(AbstractC12642p abstractC12642p) {
        LIZ((BaseGameDetailWidget<T>) ((AbstractC3125c) abstractC12642p));
    }

    public void LIZ(T t) {
        if (PatchProxy.proxy(new Object[]{t}, this, LJIIIIZZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(t);
        if (!PatchProxy.proxy(new Object[]{t}, this, LJIIIIZZ, false, 6).isSupported) {
            C106862S5w.LIZ(t);
            this.LIZ.LIZ(t);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseGameDetailWidget(LAB<AbstractC3125c, ?> lab, Function1<? super RecyclerViewItemWidget<T>, ? extends Object> function1) {
        super(lab, function1);
        C106862S5w.LIZ(lab);
        this.LIZ = new C3799613e<>();
    }

    public /* synthetic */ BaseGameDetailWidget(LAB lab, Function1 function1, int i) {
        this(lab, null);
    }
}
