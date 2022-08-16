package com.bytedance.android.live.liveinteract.multianchor.widget;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.multianchor.model.AnchorLinkUser;
import com.bytedance.android.live.liveinteract.multianchor.p368f.C4520a;
import com.bytedance.android.live.liveinteract.multianchor.p374pk.C4536j;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.widget.RoomWidget;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC413402Xu;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.C79379HQv;
import p003X.C79547HXh;
import p003X.C79548HXi;
import p003X.C79549HXj;

/* loaded from: classes3.dex */
public final class MultiPKLastResultWidget extends RoomWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public final C4536j LIZJ;
    public final C4520a LIZLLL;

    /* renamed from: LJ */
    public final C79379HQv f26374LJ;
    public List<AnchorLinkUser> LIZIZ = new ArrayList();
    public final Observer<Integer> LJFF = new C79548HXi(this);
    public final C79549HXj LJI = new C79549HXj(this);
    public final Observer<Boolean> LJII = new C79547HXh(this);

    static {
        Covode.recordClassIndex(28459);
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 5).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        NextLiveData<Boolean> nextLiveData;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        super.onDestroy();
        NextLiveData<Integer> nextLiveData2 = this.LIZJ.LJI;
        if (nextLiveData2 != null) {
            nextLiveData2.removeObserver(this.LJFF);
        }
        C4520a c4520a = this.LIZLLL;
        if (c4520a != null) {
            c4520a.LIZIZ(this.LJI);
        }
        C4520a c4520a2 = this.LIZLLL;
        if (c4520a2 != null && (nextLiveData = c4520a2.LJII) != null) {
            nextLiveData.removeObserver(this.LJII);
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        AbstractC413402Xu<Boolean> LJIILJJIL;
        C4520a c4520a;
        NextLiveData<Boolean> nextLiveData;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        super.onCreate();
        NextLiveData<Integer> nextLiveData2 = this.LIZJ.LJI;
        if (nextLiveData2 != null) {
            nextLiveData2.observeForever(this.LJFF);
        }
        C4520a c4520a2 = this.LIZLLL;
        if (c4520a2 != null) {
            c4520a2.LIZ(this.LJI);
        }
        C5923dp LJJJI = LJJJI();
        if (LJJJI != null && (LJIILJJIL = LJJJI.LJIILJJIL()) != null && !LJIILJJIL.LIZIZ().booleanValue() && (c4520a = this.LIZLLL) != null && (nextLiveData = c4520a.LJII) != null) {
            nextLiveData.observeForever(this.LJII, true);
        }
    }

    public final boolean LIZ(List<? extends AnchorLinkUser> list) {
        Long l;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        List<AnchorLinkUser> list2 = this.LIZIZ;
        if (list == null || list2.size() != list.size()) {
            return true;
        }
        for (AnchorLinkUser anchorLinkUser : list2) {
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (AnchorLinkUser anchorLinkUser2 : list) {
                    User LIZ2 = anchorLinkUser2.LIZ();
                    Long l2 = null;
                    if (LIZ2 != null) {
                        l = Long.valueOf(LIZ2.getId());
                    } else {
                        l = null;
                    }
                    User LIZ3 = anchorLinkUser.LIZ();
                    if (LIZ3 != null) {
                        l2 = Long.valueOf(LIZ3.getId());
                    }
                    if (Intrinsics.areEqual(l, l2)) {
                        break;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public MultiPKLastResultWidget(C4536j c4536j, C4520a c4520a, C79379HQv c79379HQv) {
        C106862S5w.LIZ(c4536j, c79379HQv);
        this.LIZJ = c4536j;
        this.LIZLLL = c4520a;
        this.f26374LJ = c79379HQv;
    }
}
