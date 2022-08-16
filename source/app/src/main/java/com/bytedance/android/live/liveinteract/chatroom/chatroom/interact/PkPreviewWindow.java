package com.bytedance.android.live.liveinteract.chatroom.chatroom.interact;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.android.livesdk.widget.roundcorner.RoundCornerFrameLayout;
import com.bytedance.android.livesdkapi.roomplayer.ILivePlayerClient;
import com.bytedance.android.livesdkapi.roomplayer.LivePlayerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.AbstractC80102Hho;
import p003X.C106862S5w;

/* loaded from: classes3.dex */
public final class PkPreviewWindow extends RoundCornerFrameLayout {
    public static ChangeQuickRedirect LIZ;
    public AbstractC80102Hho LIZIZ;
    public LivePlayerView LIZJ;
    public HashMap LIZLLL;

    static {
        Covode.recordClassIndex(25625);
    }

    public PkPreviewWindow(Context context) {
        this(context, null, 0, 6, null);
    }

    public PkPreviewWindow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // com.bytedance.android.livesdk.widget.roundcorner.RoundCornerFrameLayout
    public final View LIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 5);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (this.LIZLLL == null) {
            this.LIZLLL = new HashMap();
        }
        View view = (View) this.LIZLLL.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.LIZLLL.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        super.onDetachedFromWindow();
        LIZ();
    }

    public final void LIZ() {
        MethodCollector.m14708i(1734);
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            MethodCollector.m14707o(1734);
            return;
        }
        LivePlayerView livePlayerView = this.LIZJ;
        if (livePlayerView != null) {
            ILivePlayerClient client = livePlayerView.getClient();
            if (client != null) {
                client.stopAndRelease(getContext());
            }
            livePlayerView.setVisibility(8);
            ViewParent parent = livePlayerView.getParent();
            if (!(parent instanceof ViewGroup)) {
                parent = null;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup != null) {
                viewGroup.removeView(this.LIZJ);
            }
            this.LIZJ = null;
            MethodCollector.m14707o(1734);
            return;
        }
        MethodCollector.m14707o(1734);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PkPreviewWindow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(1735);
        LayoutInflater.from(context).inflate(2131700084, this);
        MethodCollector.m14707o(1735);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZ(com.bytedance.android.livesdkapi.depend.model.live.Room r13, android.widget.FrameLayout.LayoutParams r14, p003X.AbstractC80102Hho r15) {
        /*
            Method dump skipped, instructions count: 519
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.PkPreviewWindow.LIZ(com.bytedance.android.livesdkapi.depend.model.live.Room, android.widget.FrameLayout$LayoutParams, X.Hho):void");
    }

    public /* synthetic */ PkPreviewWindow(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
