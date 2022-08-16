package com.bytedance.android.live.liveinteract.voicechat.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Lazy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;
import p003X.C77347GeT;
import p003X.LK5;

/* loaded from: classes3.dex */
public final class VoiceChatRecyclerView extends RecyclerView {
    public static ChangeQuickRedirect LIZ;
    public boolean LIZIZ;
    public final Lazy LIZJ;
    public final Lazy LIZLLL;

    /* renamed from: LJ */
    public final Lazy f26502LJ;
    public final Lazy LJFF;
    public final Lazy LJI;
    public final int LJII;

    static {
        Covode.recordClassIndex(31845);
    }

    public VoiceChatRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final Drawable getBlueTeamBg() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return (Drawable) (proxy.isSupported ? proxy.result : this.f26502LJ.mo27335getValue());
    }

    private final Rect getBlueTeamRect() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return (Rect) (proxy.isSupported ? proxy.result : this.LJFF.mo27335getValue());
    }

    private final Drawable getRedTeamBg() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (Drawable) (proxy.isSupported ? proxy.result : this.LIZJ.mo27335getValue());
    }

    private final Rect getRedTeamRect() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return (Rect) (proxy.isSupported ? proxy.result : this.LIZLLL.mo27335getValue());
    }

    public final C5138b getTeamFightDecoration() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return (C5138b) (proxy.isSupported ? proxy.result : this.LJI.mo27335getValue());
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, LIZ, false, 8).isSupported) {
            return;
        }
        C106862S5w.LIZ(canvas);
        if (this.LIZIZ) {
            getRedTeamRect().right = (getWidth() / 2) - (this.LJII / 2);
            getRedTeamRect().bottom = getHeight();
            Drawable redTeamBg = getRedTeamBg();
            if (redTeamBg != null) {
                redTeamBg.setBounds(getRedTeamRect());
            }
            Drawable redTeamBg2 = getRedTeamBg();
            if (redTeamBg2 != null) {
                redTeamBg2.draw(canvas);
            }
            getBlueTeamRect().left = (getWidth() / 2) + (this.LJII / 2);
            getBlueTeamRect().right = getWidth();
            getBlueTeamRect().bottom = getHeight();
            Drawable blueTeamBg = getBlueTeamBg();
            if (blueTeamBg != null) {
                blueTeamBg.setBounds(getBlueTeamRect());
            }
            Drawable blueTeamBg2 = getBlueTeamBg();
            if (blueTeamBg2 != null) {
                blueTeamBg2.draw(canvas);
            }
        }
        super.onDraw(canvas);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceChatRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        this.LIZJ = C77347GeT.LIZ(VoiceChatRecyclerView$redTeamBg$2.INSTANCE);
        this.LIZLLL = C77347GeT.LIZ(new VoiceChatRecyclerView$redTeamRect$2(this));
        this.f26502LJ = C77347GeT.LIZ(VoiceChatRecyclerView$blueTeamBg$2.INSTANCE);
        this.LJFF = C77347GeT.LIZ(new VoiceChatRecyclerView$blueTeamRect$2(this));
        this.LJI = C77347GeT.LIZ(VoiceChatRecyclerView$teamFightDecoration$2.INSTANCE);
        this.LJII = LK5.LIZ(1.0f);
    }

    public /* synthetic */ VoiceChatRecyclerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
