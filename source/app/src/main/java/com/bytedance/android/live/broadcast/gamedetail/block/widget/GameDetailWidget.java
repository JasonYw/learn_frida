package com.bytedance.android.live.broadcast.gamedetail.block.widget;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.livesdk.config.C6837at;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.widget.FlowLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sve_core.AbstractC12642p;
import com.bytedance.ies.sve_core.PureWidget;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.L7U;
import p003X.LK1;

/* loaded from: classes5.dex */
public final class GameDetailWidget extends PureWidget<C3089o> implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public TextView LIZIZ;
    public FlowLayout LIZJ;
    public final boolean LIZLLL;

    static {
        Covode.recordClassIndex(16374);
    }

    public GameDetailWidget() {
        this(false, 1);
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131698330;
    }

    @Override // com.bytedance.ies.sve_core.PureWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 6).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.ies.sve_core.PureWidget
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
        if (this.LIZLLL) {
            TextView textView = this.LIZIZ;
            if (textView != null) {
                textView.setVisibility(8);
            }
            View findViewById = this.contentView.findViewById(2131170263);
            Intrinsics.checkNotNullExpressionValue(findViewById, "");
            findViewById.setBackground(null);
        }
    }

    public GameDetailWidget(boolean z) {
        super(null, 1);
        this.LIZLLL = z;
    }

    @Override // p003X.LAL
    public final /* synthetic */ void LIZ(AbstractC12642p abstractC12642p) {
        if (!PatchProxy.proxy(new Object[]{abstractC12642p}, this, LIZ, false, 2).isSupported) {
            C106862S5w.LIZ(abstractC12642p);
            L7U.LIZ(this, abstractC12642p, GameDetailWidget$onUpdate$1.INSTANCE, null, new GameDetailWidget$onUpdate$2(this), 2, null);
            L7U.LIZ(this, abstractC12642p, GameDetailWidget$onUpdate$3.INSTANCE, null, new GameDetailWidget$onUpdate$4(this), 2, null);
            if (!this.LIZLLL) {
                L7U.LIZ(this, abstractC12642p, GameDetailWidget$onUpdate$5.INSTANCE, null, new GameDetailWidget$onUpdate$6(this), 2, null);
            }
            L7U.LIZ(this, abstractC12642p, GameDetailWidget$onUpdate$7.INSTANCE, null, new GameDetailWidget$onUpdate$8(this), 2, null);
        }
    }

    public /* synthetic */ GameDetailWidget(boolean z, int i) {
        this(false);
    }
}
