package cn.everphoto.template_panel.view;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.dmt.p1121ui.widget.DoubleColorBallAnimationView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;

/* loaded from: classes28.dex */
public final class CutSameLoadingView extends DoubleColorBallAnimationView {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(3824);
    }

    public CutSameLoadingView(Context context) {
        this(context, null, 0, 6, null);
    }

    public CutSameLoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // com.bytedance.ies.dmt.p1121ui.widget.DoubleColorBallAnimationView, android.view.View
    public final void onAttachedToWindow() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        super.onAttachedToWindow();
        if (getVisibility() == 0) {
            LIZ();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CutSameLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
    }

    public /* synthetic */ CutSameLoadingView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
