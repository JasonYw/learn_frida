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

/* renamed from: com.bytedance.android.live.liveinteract.multianchor.ui.ScreenLiveInviteView */
/* loaded from: classes3.dex */
public class ScreenLiveInviteView extends FrameLayout {
    public static ChangeQuickRedirect LIZ;
    public VHeadView LIZIZ;
    public View LIZJ;
    public View LIZLLL;

    /* renamed from: LJ */
    public VHeadView f26368LJ;
    public TextView LJFF;
    public TextView LJI;
    public TextView LJII;
    public TextView LJIIIIZZ;
    public TextView LJIIIZ;

    static {
        Covode.recordClassIndex(28352);
    }

    public View getAnimWave() {
        return this.LIZJ;
    }

    public VHeadView getIvAvatar() {
        return this.LIZIZ;
    }

    public VHeadView getIvGender() {
        return this.f26368LJ;
    }

    public TextView getTvFollowCount() {
        return this.LJIIIIZZ;
    }

    public TextView getTvLabelBottom() {
        return this.LJII;
    }

    public TextView getTvLabelTop() {
        return this.LJFF;
    }

    public TextView getTvNickname() {
        return this.LJI;
    }

    public TextView getTvStatus() {
        return this.LJIIIZ;
    }

    public View getViewWave() {
        return this.LIZLLL;
    }

    private void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        View LIZ2 = C116971W2r.LIZ(LayoutInflater.from(getContext()), 2131700197, (ViewGroup) this, true);
        this.LIZIZ = (VHeadView) LIZ2.findViewById(2131165351);
        this.LIZJ = LIZ2.findViewById(2131166905);
        this.LIZLLL = LIZ2.findViewById(2131197121);
        this.f26368LJ = (VHeadView) LIZ2.findViewById(2131179019);
        this.LJFF = (TextView) LIZ2.findViewById(2131194473);
        this.LJI = (TextView) LIZ2.findViewById(2131194722);
        this.LJII = (TextView) LIZ2.findViewById(2131194468);
        this.LJIIIIZZ = (TextView) LIZ2.findViewById(2131194164);
        this.LJIIIZ = (TextView) LIZ2.findViewById(2131195419);
    }

    public ScreenLiveInviteView(Context context) {
        super(context);
        MethodCollector.m14708i(1942);
        LIZ();
        MethodCollector.m14707o(1942);
    }

    public ScreenLiveInviteView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m14708i(1943);
        LIZ();
        MethodCollector.m14707o(1943);
    }

    public ScreenLiveInviteView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MethodCollector.m14708i(1944);
        LIZ();
        MethodCollector.m14707o(1944);
    }
}
