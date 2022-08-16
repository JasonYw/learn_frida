package com.bytedance.android.live.lynx.p397ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.android.livesdkapi.roomplayer.LivePlayerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.lynx.ui.e */
/* loaded from: classes19.dex */
public final class C5162e extends FrameLayout {
    public static ChangeQuickRedirect LIZ;
    public LivePlayerView LIZIZ;

    static {
        Covode.recordClassIndex(32398);
    }

    public final LivePlayerView getPlayerView$livehybrid_impl_cnDouyinRelease() {
        return this.LIZIZ;
    }

    public final void setPlayerView$livehybrid_impl_cnDouyinRelease(LivePlayerView livePlayerView) {
        this.LIZIZ = livePlayerView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5162e(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(2128);
        MethodCollector.m14707o(2128);
    }

    public /* synthetic */ C5162e(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, null, 0);
    }
}
