package com.bytedance.android.live.liveinteract.videotalk.battle;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC486245Jy;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C82042IVg;

/* loaded from: classes22.dex */
public final class GuestBattleSeatScoreView extends FrameLayout {
    public View LIZ;
    public AbstractC486245Jy LIZIZ;

    static {
        Covode.recordClassIndex(29816);
    }

    public GuestBattleSeatScoreView(Context context) {
        this(context, null, 0, 6, null);
    }

    public GuestBattleSeatScoreView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final AbstractC486245Jy getVisibleCallback() {
        return this.LIZIZ;
    }

    public final void setVisibleCallback(AbstractC486245Jy abstractC486245Jy) {
        this.LIZIZ = abstractC486245Jy;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuestBattleSeatScoreView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(2006);
        C116971W2r.LIZ(LayoutInflater.from(context), 2131699968, (ViewGroup) this, true);
        new C82042IVg(this);
        Intrinsics.checkNotNullExpressionValue(findViewById(2131187107), "");
        Intrinsics.checkNotNullExpressionValue(findViewById(2131187092), "");
        this.LIZ = findViewById(2131176384);
        View findViewById = findViewById(2131176385);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById;
        constraintLayout.setBackground(null);
        constraintLayout.requestLayout();
        View view = this.LIZ;
        if (view != null) {
            view.setBackgroundResource(2130855996);
            MethodCollector.m14707o(2006);
            return;
        }
        MethodCollector.m14707o(2006);
    }

    public /* synthetic */ GuestBattleSeatScoreView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
