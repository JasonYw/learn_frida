package com.bytedance.android.live.liveinteract.multianchor.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.android.live.liveinteract.multianchor.constant.PlayMode;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC79608HZq;
import p003X.C106862S5w;

/* loaded from: classes3.dex */
public final class RoundedLabelTitle extends FrameLayout {
    public static ChangeQuickRedirect LIZ;
    public final Map<PlayMode, View> LIZIZ = new HashMap();
    public PlayMode LIZJ;
    public AbstractC79608HZq LIZLLL;

    /* renamed from: LJ */
    public HashMap f26376LJ;

    static {
        Covode.recordClassIndex(28470);
    }

    private View LIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (this.f26376LJ == null) {
            this.f26376LJ = new HashMap();
        }
        View view = (View) this.f26376LJ.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f26376LJ.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final PlayMode getCurrentPlayMode() {
        return this.LIZJ;
    }

    public final AbstractC79608HZq getOnTapPlayModeListener() {
        return this.LIZLLL;
    }

    public final PlayMode getPlayMode() {
        return this.LIZJ;
    }

    public final void setOnTapPlayModeListener(AbstractC79608HZq abstractC79608HZq) {
        this.LIZLLL = abstractC79608HZq;
    }

    public final void LIZ(PlayMode playMode) {
        AbstractC79608HZq abstractC79608HZq;
        if (!PatchProxy.proxy(new Object[]{playMode}, this, LIZ, false, 1).isSupported && (abstractC79608HZq = this.LIZLLL) != null) {
            abstractC79608HZq.LIZ(playMode);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundedLabelTitle(Context context) {
        super(context);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(1959);
        LayoutInflater.from(getContext()).inflate(2131700034, this);
        ((TextView) LIZ(2131185052)).setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.live.liveinteract.multianchor.widget.RoundedLabelTitle.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(28471);
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                RoundedLabelTitle.this.LIZ(PlayMode.PERSONAL_PK);
            }
        });
        ((TextView) LIZ(2131191593)).setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.live.liveinteract.multianchor.widget.RoundedLabelTitle.2
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(28472);
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                RoundedLabelTitle.this.LIZ(PlayMode.TEAM_PK);
            }
        });
        Map<PlayMode, View> map = this.LIZIZ;
        PlayMode playMode = PlayMode.PERSONAL_PK;
        View LIZ2 = LIZ(2131185052);
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        map.put(playMode, LIZ2);
        Map<PlayMode, View> map2 = this.LIZIZ;
        PlayMode playMode2 = PlayMode.TEAM_PK;
        View LIZ3 = LIZ(2131191593);
        Intrinsics.checkNotNullExpressionValue(LIZ3, "");
        map2.put(playMode2, LIZ3);
        MethodCollector.m14707o(1959);
    }

    public final void LIZIZ(PlayMode playMode) {
        boolean z;
        boolean z2 = true;
        if (PatchProxy.proxy(new Object[]{playMode}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(playMode);
        if (this.LIZJ == playMode) {
            return;
        }
        this.LIZJ = playMode;
        TextView textView = (TextView) LIZ(2131185052);
        Intrinsics.checkNotNullExpressionValue(textView, "");
        if (playMode == PlayMode.PERSONAL_PK) {
            z = true;
        } else {
            z = false;
        }
        textView.setSelected(z);
        TextView textView2 = (TextView) LIZ(2131191593);
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        if (playMode != PlayMode.TEAM_PK) {
            z2 = false;
        }
        textView2.setSelected(z2);
        View view = this.LIZIZ.get(playMode);
        if (view != null) {
            view.bringToFront();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundedLabelTitle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(1960);
        LayoutInflater.from(getContext()).inflate(2131700034, this);
        ((TextView) LIZ(2131185052)).setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.live.liveinteract.multianchor.widget.RoundedLabelTitle.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(28471);
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                RoundedLabelTitle.this.LIZ(PlayMode.PERSONAL_PK);
            }
        });
        ((TextView) LIZ(2131191593)).setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.live.liveinteract.multianchor.widget.RoundedLabelTitle.2
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(28472);
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                RoundedLabelTitle.this.LIZ(PlayMode.TEAM_PK);
            }
        });
        Map<PlayMode, View> map = this.LIZIZ;
        PlayMode playMode = PlayMode.PERSONAL_PK;
        View LIZ2 = LIZ(2131185052);
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        map.put(playMode, LIZ2);
        Map<PlayMode, View> map2 = this.LIZIZ;
        PlayMode playMode2 = PlayMode.TEAM_PK;
        View LIZ3 = LIZ(2131191593);
        Intrinsics.checkNotNullExpressionValue(LIZ3, "");
        map2.put(playMode2, LIZ3);
        MethodCollector.m14707o(1960);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoundedLabelTitle(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(1961);
        LayoutInflater.from(getContext()).inflate(2131700034, this);
        ((TextView) LIZ(2131185052)).setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.live.liveinteract.multianchor.widget.RoundedLabelTitle.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(28471);
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                RoundedLabelTitle.this.LIZ(PlayMode.PERSONAL_PK);
            }
        });
        ((TextView) LIZ(2131191593)).setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.live.liveinteract.multianchor.widget.RoundedLabelTitle.2
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(28472);
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                RoundedLabelTitle.this.LIZ(PlayMode.TEAM_PK);
            }
        });
        Map<PlayMode, View> map = this.LIZIZ;
        PlayMode playMode = PlayMode.PERSONAL_PK;
        View LIZ2 = LIZ(2131185052);
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        map.put(playMode, LIZ2);
        Map<PlayMode, View> map2 = this.LIZIZ;
        PlayMode playMode2 = PlayMode.TEAM_PK;
        View LIZ3 = LIZ(2131191593);
        Intrinsics.checkNotNullExpressionValue(LIZ3, "");
        map2.put(playMode2, LIZ3);
        MethodCollector.m14707o(1961);
    }
}
