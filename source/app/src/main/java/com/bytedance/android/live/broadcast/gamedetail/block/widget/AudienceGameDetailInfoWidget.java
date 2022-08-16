package com.bytedance.android.live.broadcast.gamedetail.block.widget;

import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.gamedetailv2.pageview.AbstractC3125c;
import com.bytedance.android.live.broadcast.gamedetailv2.widget.BaseGameDetailWidget;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.config.C6837at;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.widget.FlowLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sve_list.RecyclerViewItemWidget;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;
import p003X.AnonymousClass479;
import p003X.C106862S5w;
import p003X.L7U;
import p003X.LAB;
import p003X.LK5;

/* loaded from: classes5.dex */
public final class AudienceGameDetailInfoWidget extends BaseGameDetailWidget<C3084e> implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public final boolean LIZIZ = !AnonymousClass479.LIZJ();
    public View LIZJ;
    public ConstraintLayout LIZLLL;

    /* renamed from: LJ */
    public HSImageView f25862LJ;
    public TextView LJFF;
    public FlowLayout LJI;
    public TextView LJII;
    public View LJIIJJI;

    static {
        Covode.recordClassIndex(16325);
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131699251;
    }

    @Override // com.bytedance.android.live.broadcast.gamedetailv2.widget.BaseGameDetailWidget, com.bytedance.ies.sve_list.RecyclerViewItemWidget, com.bytedance.ies.sve_core.PureWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 7).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LIZJ() {
        MethodCollector.m14708i(1269);
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            MethodCollector.m14707o(1269);
            return;
        }
        FlowLayout flowLayout = this.LJI;
        if (flowLayout != null) {
            flowLayout.removeAllViews();
        }
        SettingKey<C6837at> settingKey = LiveSettingKeys.LIVE_GAME_SECURITY_SIGN_PROGRESS_CONFIG;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        if (settingKey.getValue().LIZIZ == 1) {
            TextView textView = new TextView(new ContextThemeWrapper(this.context, 2131494878));
            textView.setText(LK5.LIZ(2131583398));
            Drawable LIZJ = LK5.LIZJ(2130857037);
            Intrinsics.checkNotNullExpressionValue(LIZJ, "");
            LIZJ.setBounds(0, 0, LIZJ.getMinimumWidth(), LIZJ.getMinimumHeight());
            textView.setCompoundDrawables(LIZJ, null, null, null);
            textView.setCompoundDrawablePadding(LK5.LIZ(2.0f));
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
            marginLayoutParams.rightMargin = LK5.LIZ(5.0f);
            FlowLayout flowLayout2 = this.LJI;
            if (flowLayout2 != null) {
                flowLayout2.addView(textView, marginLayoutParams);
                MethodCollector.m14707o(1269);
                return;
            }
        }
        MethodCollector.m14707o(1269);
    }

    @Override // com.bytedance.android.live.broadcast.gamedetailv2.widget.BaseGameDetailWidget, com.bytedance.ies.sve_list.RecyclerViewItemWidget, com.bytedance.ies.sve_core.PureWidget
    public final void LIZLLL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        super.LIZLLL();
        this.LIZJ = this.contentView.findViewById(2131196398);
        this.LIZLLL = (ConstraintLayout) this.contentView.findViewById(2131170263);
        this.f25862LJ = (HSImageView) this.contentView.findViewById(2131179014);
        this.LJFF = (TextView) this.contentView.findViewById(2131194202);
        this.LJI = (FlowLayout) this.contentView.findViewById(2131175205);
        this.LJII = (TextView) this.contentView.findViewById(2131194203);
        this.LJIIJJI = this.contentView.findViewById(2131196400);
        if (!this.LIZIZ) {
            View view = this.LJIIJJI;
            if (view != null) {
                view.setVisibility(8);
            }
        } else {
            View view2 = this.LJIIJJI;
            if (view2 != null) {
                view2.setVisibility(0);
            }
        }
        LIZJ();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.bytedance.android.live.broadcast.gamedetailv2.widget.BaseGameDetailWidget, p003X.LAL
    public void LIZ(C3084e c3084e) {
        if (PatchProxy.proxy(new Object[]{c3084e}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(c3084e);
        super.LIZ((AudienceGameDetailInfoWidget) c3084e);
        L7U.LIZ(this, c3084e, AudienceGameDetailInfoWidget$onUpdate$1.INSTANCE, null, new AudienceGameDetailInfoWidget$onUpdate$2(this), 2, null);
        L7U.LIZ(this, c3084e, AudienceGameDetailInfoWidget$onUpdate$3.INSTANCE, null, new AudienceGameDetailInfoWidget$onUpdate$4(this), 2, null);
        L7U.LIZ(this, c3084e, AudienceGameDetailInfoWidget$onUpdate$5.INSTANCE, null, new AudienceGameDetailInfoWidget$onUpdate$6(this), 2, null);
        L7U.LIZ(this, c3084e, AudienceGameDetailInfoWidget$onUpdate$7.INSTANCE, null, new AudienceGameDetailInfoWidget$onUpdate$8(this), 2, null);
        L7U.LIZ(this, c3084e, AudienceGameDetailInfoWidget$onUpdate$9.INSTANCE, null, new AudienceGameDetailInfoWidget$onUpdate$10(this), 2, null);
        L7U.LIZ(this, c3084e, AudienceGameDetailInfoWidget$onUpdate$11.INSTANCE, null, new AudienceGameDetailInfoWidget$onUpdate$12(this, c3084e), 2, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudienceGameDetailInfoWidget(LAB<AbstractC3125c, ?> lab, Function1<? super RecyclerViewItemWidget<C3084e>, ? extends Object> function1) {
        super(lab, function1);
        C106862S5w.LIZ(lab);
    }

    @Override // com.bytedance.android.live.broadcast.gamedetailv2.widget.BaseGameDetailWidget
    public final /* synthetic */ void LIZ(boolean z, C3084e c3084e) {
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), c3084e}, this, LIZ, false, 3).isSupported) {
            C106862S5w.LIZ(c3084e);
        }
    }
}
