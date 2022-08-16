package com.bytedance.android.live.broadcast.gamedetail.block.widget;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.gamedetailv2.pageview.AbstractC3125c;
import com.bytedance.android.live.broadcast.gamedetailv2.widget.BaseGameDetailWidget;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.livesdk.config.C6837at;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.widget.FlowLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sve_list.RecyclerViewItemWidget;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.L3P;
import p003X.L7U;
import p003X.LAB;
import p003X.LK1;

/* loaded from: classes5.dex */
public final class OrderGameDetailInfoItemWidget extends BaseGameDetailWidget<C3094w> implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public TextView LIZIZ;
    public FlowLayout LIZJ;
    public View LIZLLL;

    /* renamed from: LJ */
    public View f25867LJ;
    public View LJFF;

    static {
        Covode.recordClassIndex(16415);
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131698330;
    }

    @Override // com.bytedance.android.live.broadcast.gamedetailv2.widget.BaseGameDetailWidget, com.bytedance.ies.sve_list.RecyclerViewItemWidget, com.bytedance.ies.sve_core.PureWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 7).isSupported) {
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
        ImageView imageView = (ImageView) this.contentView.findViewById(2131175952);
        SettingKey<C6837at> settingKey = LiveSettingKeys.LIVE_GAME_SECURITY_SIGN_PROGRESS_CONFIG;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        if (settingKey.getValue().LIZIZ != 1) {
            Intrinsics.checkNotNullExpressionValue(imageView, "");
            LK1.LIZ(imageView);
        }
        this.LIZIZ = (TextView) this.contentView.findViewById(2131184607);
        this.LIZJ = (FlowLayout) this.contentView.findViewById(2131191526);
        this.LJFF = this.contentView.findViewById(2131196400);
        this.LIZLLL = this.contentView.findViewById(2131196398);
        this.f25867LJ = this.contentView.findViewById(2131170263);
        if (!L3P.LIZ()) {
            View view = this.LJFF;
            if (view != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        View view2 = this.LJFF;
        if (view2 != null) {
            view2.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bytedance.android.live.broadcast.gamedetailv2.widget.BaseGameDetailWidget, p003X.LAL
    public void LIZ(C3094w c3094w) {
        if (PatchProxy.proxy(new Object[]{c3094w}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(c3094w);
        super.LIZ((OrderGameDetailInfoItemWidget) c3094w);
        L7U.LIZ(this, c3094w, OrderGameDetailInfoItemWidget$onUpdate$1.INSTANCE, null, new OrderGameDetailInfoItemWidget$onUpdate$2(this), 2, null);
        L7U.LIZ(this, c3094w, OrderGameDetailInfoItemWidget$onUpdate$3.INSTANCE, null, new OrderGameDetailInfoItemWidget$onUpdate$4(this), 2, null);
        L7U.LIZ(this, c3094w, OrderGameDetailInfoItemWidget$onUpdate$5.INSTANCE, null, new OrderGameDetailInfoItemWidget$onUpdate$6(this), 2, null);
        L7U.LIZ(this, c3094w, OrderGameDetailInfoItemWidget$onUpdate$7.INSTANCE, null, new OrderGameDetailInfoItemWidget$onUpdate$8(this), 2, null);
        L7U.LIZ(this, c3094w, OrderGameDetailInfoItemWidget$onUpdate$9.INSTANCE, null, new OrderGameDetailInfoItemWidget$onUpdate$10(this), 2, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderGameDetailInfoItemWidget(LAB<AbstractC3125c, ?> lab, Function1<? super RecyclerViewItemWidget<C3094w>, ? extends Object> function1) {
        super(lab, function1);
        C106862S5w.LIZ(lab);
    }

    @Override // com.bytedance.android.live.broadcast.gamedetailv2.widget.BaseGameDetailWidget
    public final /* synthetic */ void LIZ(boolean z, C3094w c3094w) {
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), c3094w}, this, LIZ, false, 3).isSupported) {
            C106862S5w.LIZ(c3094w);
        }
    }
}
