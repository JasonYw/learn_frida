package com.bytedance.android.live.broadcast.gamedetail.block.widget;

import android.widget.Button;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.gamedetailv2.pageview.AbstractC3125c;
import com.bytedance.android.live.broadcast.gamedetailv2.widget.BaseGameDetailWidget;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sve_list.RecyclerViewItemWidget;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.C5LE;
import p003X.L7U;
import p003X.LAB;
import p003X.LK5;

/* loaded from: classes5.dex */
public final class AudiencePlayGroupWidget extends BaseGameDetailWidget<C3085f> implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public Button LIZIZ;
    public TextView LIZJ;
    public TextView LIZLLL;

    /* renamed from: LJ */
    public TextView f25864LJ;
    public HSImageView LJFF;

    static {
        Covode.recordClassIndex(16359);
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131698335;
    }

    @Override // com.bytedance.android.live.broadcast.gamedetailv2.widget.BaseGameDetailWidget, com.bytedance.ies.sve_list.RecyclerViewItemWidget, com.bytedance.ies.sve_core.PureWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 6).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.broadcast.gamedetailv2.widget.BaseGameDetailWidget, com.bytedance.ies.sve_list.RecyclerViewItemWidget, com.bytedance.ies.sve_core.PureWidget
    public final void LIZLLL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        super.LIZLLL();
        this.LIZIZ = (Button) this.contentView.findViewById(2131165405);
        this.LIZJ = (TextView) this.contentView.findViewById(2131194280);
        this.LIZLLL = (TextView) this.contentView.findViewById(2131194276);
        this.f25864LJ = (TextView) this.contentView.findViewById(2131194283);
        this.LJFF = (HSImageView) this.containerView.findViewById(2131176317);
        TextView textView = (TextView) this.contentView.findViewById(2131194456);
        C5LE c5le = C5LE.LIZIZ;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        c5le.LIZ(textView, 600);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bytedance.android.live.broadcast.gamedetailv2.widget.BaseGameDetailWidget, p003X.LAL
    public void LIZ(C3085f c3085f) {
        String LIZ2;
        if (PatchProxy.proxy(new Object[]{c3085f}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(c3085f);
        TextView textView = this.LIZJ;
        if (textView != null) {
            textView.setText(c3085f.LIZLLL);
        }
        TextView textView2 = this.f25864LJ;
        if (textView2 != null) {
            textView2.setText("(" + c3085f.LJFF + LoggerUtil.S_RIGHT_TAG);
        }
        TextView textView3 = this.LIZLLL;
        if (textView3 != null) {
            String str = c3085f.LJI;
            if (str != null && !StringsKt__StringsJVMKt.isBlank(str)) {
                LIZ2 = c3085f.LJI;
            } else {
                LIZ2 = LK5.LIZ(2131583607);
            }
            textView3.setText(LIZ2);
        }
        L7U.LIZ(this, c3085f, AudiencePlayGroupWidget$onUpdate$1.INSTANCE, null, new AudiencePlayGroupWidget$onUpdate$2(this, c3085f), 2, null);
        L7U.LIZ(this, c3085f, AudiencePlayGroupWidget$onUpdate$3.INSTANCE, null, new AudiencePlayGroupWidget$onUpdate$4(this), 2, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudiencePlayGroupWidget(LAB<AbstractC3125c, ?> lab, Function1<? super RecyclerViewItemWidget<C3085f>, ? extends Object> function1) {
        super(lab, function1);
        C106862S5w.LIZ(lab);
    }

    @Override // com.bytedance.android.live.broadcast.gamedetailv2.widget.BaseGameDetailWidget
    public final /* synthetic */ void LIZ(boolean z, C3085f c3085f) {
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), c3085f}, this, LIZ, false, 5).isSupported) {
            C106862S5w.LIZ(c3085f);
        }
    }
}
