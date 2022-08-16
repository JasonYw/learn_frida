package com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.viewholder;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.list.AbstractC4357d;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.LinkedList;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import p003X.AbstractC413402Xu;
import p003X.C106862S5w;
import p003X.C409882Kg;

/* renamed from: com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.viewholder.an */
/* loaded from: classes3.dex */
public final class C4339an extends RecyclerView.ViewHolder {
    public static ChangeQuickRedirect LIZ;
    public boolean LIZIZ;
    public final AbstractC4357d LIZJ;
    public final LinkedList<?> LIZLLL;

    /* renamed from: LJ */
    public final Lazy f26281LJ;
    public final Lazy LJFF;
    public final Lazy LJI;
    public final Lazy LJII;

    static {
        Covode.recordClassIndex(26109);
    }

    public final TextView LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return (TextView) (proxy.isSupported ? proxy.result : this.f26281LJ.mo27335getValue());
    }

    public final FrameLayout LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return (FrameLayout) (proxy.isSupported ? proxy.result : this.LJFF.mo27335getValue());
    }

    public final TextView LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return (TextView) (proxy.isSupported ? proxy.result : this.LJI.mo27335getValue());
    }

    public final ImageView LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return (ImageView) (proxy.isSupported ? proxy.result : this.LJII.mo27335getValue());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4339an(View view, AbstractC4357d abstractC4357d, LinkedList<?> linkedList) {
        super(view);
        boolean z;
        AbstractC413402Xu<Boolean> LJIILJJIL;
        Boolean LIZIZ;
        C106862S5w.LIZ(view);
        this.LIZJ = abstractC4357d;
        this.LIZLLL = linkedList;
        LazyKt__LazyJVMKt.lazy(new TalkRoomNormalApplyTitleViewHolder$sortViewLayout$2(view));
        this.f26281LJ = LazyKt__LazyJVMKt.lazy(new TalkRoomNormalApplyTitleViewHolder$currentOrder$2(view));
        this.LJFF = LazyKt__LazyJVMKt.lazy(new TalkRoomNormalApplyTitleViewHolder$switchSortLayout$2(view));
        this.LJI = LazyKt__LazyJVMKt.lazy(new TalkRoomNormalApplyTitleViewHolder$tvSortType$2(view));
        this.LJII = LazyKt__LazyJVMKt.lazy(new TalkRoomNormalApplyTitleViewHolder$ivSwitcher$2(view));
        C5923dp LIZ2 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
        if (LIZ2 != null && (LJIILJJIL = LIZ2.LJIILJJIL()) != null && (LIZIZ = LJIILJJIL.LIZIZ()) != null) {
            z = LIZIZ.booleanValue();
        } else {
            z = false;
        }
        this.LIZIZ = z;
        ((IUserService) ServiceManager.getService(IUserService.class)).user().LJI();
    }
}
