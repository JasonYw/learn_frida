package com.bytedance.android.live.broadcastgame.opengame.view;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.broadcastgame.opengame.C3607p;
import com.bytedance.android.live.broadcastgame.opengame.message.C3518at;
import com.bytedance.android.live.broadcastgame.opengame.panel.AbstractC3609d;
import com.bytedance.android.live.broadcastgame.opengame.runtime.C3682x;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.android.ugc.aweme.lego.experiment.LegoCommitOptExperiment;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC88005Klz;
import p003X.AbstractC88051Kmj;
import p003X.C106862S5w;
import p003X.C146239ezh;
import p003X.C4574547f;
import p003X.C461154Ll;
import p003X.C468104f6;
import p003X.C87793KiZ;
import p003X.RunnableC88050Kmi;
import p003X.RunnableC88052Kmk;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.view.ad */
/* loaded from: classes5.dex */
public final class C3731ad extends FrameLayout {
    public static ChangeQuickRedirect LIZ;
    public AbstractC88005Klz LIZIZ;
    public C3607p LIZJ;
    public AbstractC3609d LIZLLL;

    /* renamed from: LJ */
    public View f26096LJ;
    public final View LJFF;
    public View LJI;
    public Runnable LJII;

    static {
        Covode.recordClassIndex(21179);
    }

    public final void LIZIZ() {
        AbstractC88005Klz abstractC88005Klz;
        C3518at LIZ2;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported && (abstractC88005Klz = this.LIZIZ) != null && (LIZ2 = abstractC88005Klz.LIZ()) != null) {
            LIZ(LIZ2);
        }
    }

    public final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
            return;
        }
        postDelayed(new RunnableC88052Kmk(this), 2000L);
    }

    /* renamed from: LJ */
    public final void m15838LJ() {
        Runnable runnable;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported && (runnable = this.LJII) != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported) {
            return;
        }
        super.onDetachedFromWindow();
        m15838LJ();
    }

    public final boolean LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this.f26096LJ.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public final void LIZLLL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported) {
            return;
        }
        if (this.LJII == null) {
            this.LJII = new RunnableC88050Kmi(this);
        }
        postDelayed(this.LJII, LegoCommitOptExperiment.BOOT_FINISH_DELAY_TIME);
    }

    private final void LIZ(C3518at c3518at) {
        if (PatchProxy.proxy(new Object[]{c3518at}, this, LIZ, false, 7).isSupported) {
            return;
        }
        if (LIZ()) {
            View view = this.f26096LJ;
            if (view != null) {
                ((AbstractC88051Kmj) view).LIZLLL(new RewardMsgContainer$onNewMsg$3(this));
                View view2 = this.LJI;
                if (view2 != null) {
                    ((AbstractC88051Kmj) view2).setReward(c3518at);
                    View view3 = this.LJI;
                    if (view3 != null) {
                        ((AbstractC88051Kmj) view3).LIZIZ(new RewardMsgContainer$onNewMsg$4(this, c3518at));
                        View view4 = this.f26096LJ;
                        this.f26096LJ = this.LJI;
                        this.LJI = view4;
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.broadcastgame.opengame.view.IRewardItemView");
                }
                throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.broadcastgame.opengame.view.IRewardItemView");
            }
            throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.broadcastgame.opengame.view.IRewardItemView");
        }
        AbstractC3609d abstractC3609d = this.LIZLLL;
        if (abstractC3609d != null) {
            abstractC3609d.LIZIZ(0);
        }
        C461154Ll.LIZ(this.LJFF, 250L, 0.0f, null, 8, null);
        View view5 = this.f26096LJ;
        if (view5 != null) {
            ((AbstractC88051Kmj) view5).setReward(c3518at);
            View view6 = this.f26096LJ;
            if (view6 != null) {
                ((AbstractC88051Kmj) view6).LIZ(new RewardMsgContainer$onNewMsg$7(this, c3518at));
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.broadcastgame.opengame.view.IRewardItemView");
        }
        throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.live.broadcastgame.opengame.view.IRewardItemView");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3731ad(C3682x c3682x) {
        super(c3682x.LIZLLL);
        C106862S5w.LIZ(c3682x);
        MethodCollector.m14708i(1481);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        this.f26096LJ = new C468104f6(context, new RewardMsgContainer$oldItem$1(c3682x));
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        this.LJI = new C468104f6(context2, new RewardMsgContainer$newItem$1(c3682x));
        View inflate = View.inflate(getContext(), 2131700069, this);
        Intrinsics.checkNotNullExpressionValue(inflate, "");
        this.LJFF = inflate;
        setBackground(getResources().getDrawable(2130855007));
        int i = Build.VERSION.SDK_INT;
        ConstraintLayout constraintLayout = (ConstraintLayout) this.LJFF.findViewById(2131182932);
        C146239ezh c146239ezh = new C146239ezh();
        c146239ezh.LIZ(constraintLayout);
        this.f26096LJ.setId(View.generateViewId());
        ((ConstraintLayout) this.LJFF.findViewById(2131182932)).addView(this.f26096LJ);
        int id = this.f26096LJ.getId();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        c146239ezh.LIZ(id, 6, constraintLayout.getId(), 6);
        c146239ezh.LIZ(this.f26096LJ.getId(), 3, constraintLayout.getId(), 3);
        c146239ezh.LIZ(this.f26096LJ.getId(), 4, constraintLayout.getId(), 4);
        c146239ezh.LIZ(this.f26096LJ.getId(), 7, constraintLayout.getId(), 7);
        c146239ezh.LIZIZ(constraintLayout);
        this.LJI.setId(View.generateViewId());
        ((ConstraintLayout) this.LJFF.findViewById(2131182932)).addView(this.LJI);
        c146239ezh.LIZ(this.LJI.getId(), 6, constraintLayout.getId(), 6);
        c146239ezh.LIZ(this.LJI.getId(), 3, constraintLayout.getId(), 3);
        c146239ezh.LIZ(this.LJI.getId(), 4, constraintLayout.getId(), 4);
        c146239ezh.LIZ(this.LJI.getId(), 7, constraintLayout.getId(), 7);
        c146239ezh.LIZIZ(constraintLayout);
        this.LJFF.setVisibility(4);
        this.f26096LJ.setVisibility(4);
        this.LJI.setVisibility(4);
        MethodCollector.m14707o(1481);
    }

    public final void LIZ(int i) {
        String str;
        String valueOf;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 8).isSupported) {
            return;
        }
        C87793KiZ c87793KiZ = C87793KiZ.LIZIZ;
        C3607p c3607p = this.LIZJ;
        String str2 = "";
        if (c3607p == null || (str = c3607p.LIZ(false)) == null) {
            str = str2;
        }
        C3607p c3607p2 = this.LIZJ;
        if (c3607p2 != null && (valueOf = String.valueOf(c3607p2.LJI)) != null) {
            str2 = valueOf;
        }
        String valueOf2 = String.valueOf(((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ());
        String valueOf3 = String.valueOf(i);
        if (!PatchProxy.proxy(new Object[]{str, str2, valueOf2, valueOf3}, c87793KiZ, C87793KiZ.LIZ, false, 14).isSupported) {
            C106862S5w.LIZ(str, str2, valueOf2, valueOf3);
            C4574547f.LIZ().LIZ("livesdk_live_program_prop_message_show", MapsKt__MapsKt.mutableMapOf(TuplesKt.m137to("program_id", str2), TuplesKt.m137to("program_name", str), TuplesKt.m137to("user_id", valueOf2), TuplesKt.m137to("prop_amount", valueOf3)), Room.class);
        }
    }
}
