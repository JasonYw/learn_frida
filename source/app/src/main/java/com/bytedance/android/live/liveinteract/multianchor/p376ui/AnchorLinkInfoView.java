package com.bytedance.android.live.liveinteract.multianchor.p376ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.widget.VHeadView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C116971W2r;

/* renamed from: com.bytedance.android.live.liveinteract.multianchor.ui.AnchorLinkInfoView */
/* loaded from: classes3.dex */
public class AnchorLinkInfoView extends FrameLayout {
    public static ChangeQuickRedirect LIZ;
    public VHeadView LIZIZ;
    public VHeadView LIZJ;
    public VHeadView LIZLLL;

    /* renamed from: LJ */
    public TextView f26365LJ;

    static {
        Covode.recordClassIndex(28349);
    }

    public VHeadView getIvAnchorAvatar1() {
        return this.LIZIZ;
    }

    public VHeadView getIvAnchorAvatar2() {
        return this.LIZJ;
    }

    public VHeadView getIvAnchorAvatar3() {
        return this.LIZLLL;
    }

    public TextView getTvAnchorLinkInfo() {
        return this.f26365LJ;
    }

    private void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        View LIZ2 = C116971W2r.LIZ(LayoutInflater.from(getContext()), 2131700307, (ViewGroup) this, true);
        this.LIZIZ = (VHeadView) LIZ2.findViewById(2131178532);
        this.LIZJ = (VHeadView) LIZ2.findViewById(2131178533);
        this.LIZLLL = (VHeadView) LIZ2.findViewById(2131178534);
        this.f26365LJ = (TextView) LIZ2.findViewById(2131193476);
    }

    public AnchorLinkInfoView(Context context) {
        super(context);
        MethodCollector.m14708i(1936);
        LIZ();
        MethodCollector.m14707o(1936);
    }

    public AnchorLinkInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m14708i(1937);
        LIZ();
        MethodCollector.m14707o(1937);
    }

    public AnchorLinkInfoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MethodCollector.m14708i(1938);
        LIZ();
        MethodCollector.m14707o(1938);
    }
}
