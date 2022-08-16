package com.bytedance.android.live.liveinteract.voicechat.fight.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.TextSwitcher;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.CastProtectorUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C116971W2r;

/* loaded from: classes22.dex */
public final class TeamFightScoreView extends FrameLayout {
    public static ChangeQuickRedirect LIZ;
    public final TextSwitcher LIZIZ;
    public final FrameLayout LIZJ;
    public final Animation LIZLLL;

    /* renamed from: LJ */
    public final Animation f26488LJ;

    static {
        Covode.recordClassIndex(31399);
    }

    public TeamFightScoreView(Context context) {
        this(context, null, 0, 6, null);
    }

    public TeamFightScoreView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void setTeamBackground(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 1).isSupported) {
            return;
        }
        if (i == 2) {
            this.LIZJ.setBackgroundResource(2130855303);
        } else {
            this.LIZJ.setBackgroundResource(2130855309);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TeamFightScoreView(final Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(2084);
        this.LIZLLL = AnimationUtils.loadAnimation(context, 2130969146);
        this.f26488LJ = AnimationUtils.loadAnimation(context, 2130969147);
        C116971W2r.LIZ(LayoutInflater.from(context), 2131700249, (ViewGroup) this, true);
        View findViewById = findViewById(2131188770);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.LIZIZ = (TextSwitcher) findViewById;
        TextSwitcher textSwitcher = this.LIZIZ;
        textSwitcher.setMeasureAllChildren(false);
        textSwitcher.setInAnimation(this.LIZLLL);
        textSwitcher.setOutAnimation(this.f26488LJ);
        textSwitcher.setFactory(new ViewSwitcher.ViewFactory(this) { // from class: X.5S2
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(31400);
            }

            @Override // android.widget.ViewSwitcher.ViewFactory
            public final View makeView() {
                MethodCollector.m14708i(2083);
                PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
                if (proxy.isSupported) {
                    View view = (View) proxy.result;
                    MethodCollector.m14707o(2083);
                    return view;
                }
                TextView textView = new TextView(context);
                textView.setGravity(17);
                textView.setTextSize(1, 9.0f);
                textView.setTextColor(CastProtectorUtils.parseColor("#FFFFFFFF"));
                textView.setSingleLine();
                textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 17));
                MethodCollector.m14707o(2083);
                return textView;
            }
        });
        View findViewById2 = findViewById(2131174887);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        this.LIZJ = (FrameLayout) findViewById2;
        MethodCollector.m14707o(2084);
    }

    public /* synthetic */ TeamFightScoreView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
