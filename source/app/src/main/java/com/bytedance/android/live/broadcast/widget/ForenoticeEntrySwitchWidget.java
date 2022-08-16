package com.bytedance.android.live.broadcast.widget;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.broadcast.p274n.C3166a;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.C77347GeT;
import p003X.LK1;
import p003X.LKQ;
import p003X.LKR;
import p003X.LKS;
import p003X.LKT;
import p003X.LKU;
import p003X.LLY;

/* loaded from: classes5.dex */
public final class ForenoticeEntrySwitchWidget extends LiveRecyclableWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public TextView LIZIZ;
    public ImageView LIZJ;
    public TextView LIZLLL;

    /* renamed from: LJ */
    public ImageView f25970LJ;
    public TextView LJFF;
    public final int LJI;
    public final C3166a LJII;
    public ImageView LJIIIIZZ;
    public View LJIIIZ;
    public View LJIIJ;
    public View LJIIJJI;
    public final Lazy LJIIL = C77347GeT.LIZ(new ForenoticeEntrySwitchWidget$mThemeStrategy$2(this));

    static {
        Covode.recordClassIndex(18312);
    }

    private final AbstractC3323y LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (AbstractC3323y) (proxy.isSupported ? proxy.result : this.LJIIL.mo27335getValue());
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131699797;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 5).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onUnload() {
    }

    public final int LIZ(boolean z) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (z) {
            return LIZ().LJIILIIL();
        }
        return LIZ().LJIIL();
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
        if (PatchProxy.proxy(new Object[]{objArr}, this, LIZ, false, 2).isSupported) {
            return;
        }
        this.LJIIIIZZ = (ImageView) findViewById(2131170898);
        this.LIZIZ = (TextView) findViewById(2131170899);
        this.LIZJ = (ImageView) findViewById(2131172135);
        this.LIZLLL = (TextView) findViewById(2131172136);
        this.LJIIJ = findViewById(2131172134);
        this.LJIIIZ = findViewById(2131186609);
        this.LJIIJJI = findViewById(2131170897);
        SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_TIME_SCHEDULE_PROFILE;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (value.booleanValue()) {
            View view = this.LJIIIZ;
            if (view != null) {
                LK1.LIZJ(view);
            }
            this.f25970LJ = (ImageView) findViewById(2131186610);
            this.LJFF = (TextView) findViewById(2131186611);
            LLY.LIZ(this.LJIIIZ, new LKQ(this));
        } else {
            View view2 = this.LJIIIZ;
            if (view2 != null) {
                LK1.LIZ(view2);
            }
        }
        LLY.LIZ(this.LJIIJJI, new LKS(this));
        LLY.LIZ(this.LJIIJ, new LKR(this));
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        if (PatchProxy.proxy(new Object[]{objArr}, this, LIZ, false, 3).isSupported) {
            return;
        }
        TextView textView = this.LIZIZ;
        if (textView != null) {
            textView.setTextColor(LK1.LJFF(LIZ().LIZ()));
        }
        TextView textView2 = this.LIZLLL;
        if (textView2 != null) {
            textView2.setTextColor(LK1.LJFF(LIZ().LIZ()));
        }
        TextView textView3 = this.LJFF;
        if (textView3 != null) {
            textView3.setTextColor(LK1.LJFF(LIZ().LIZ()));
        }
        ImageView imageView = this.LJIIIIZZ;
        if (imageView != null) {
            imageView.setImageResource(LIZ().LJIIJJI());
        }
        ImageView imageView2 = this.LIZJ;
        if (imageView2 != null) {
            imageView2.setImageResource(LIZ(this.LJII.LJIIL));
        }
        ImageView imageView3 = this.f25970LJ;
        if (imageView3 != null) {
            imageView3.setImageResource(LIZ(this.LJII.LJIIJJI));
        }
        View view = this.LJIIJ;
        if (view != null) {
            view.setOnClickListener(new LKT(this));
        }
        View view2 = this.LJIIIZ;
        if (view2 != null) {
            view2.setOnClickListener(new LKU(this));
        }
    }

    public ForenoticeEntrySwitchWidget(int i, C3166a c3166a) {
        C106862S5w.LIZ(c3166a);
        this.LJI = i;
        this.LJII = c3166a;
    }
}
