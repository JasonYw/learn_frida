package com.bytedance.android.live.liveinteract.newpk.widget;

import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.linkpk.AbstractC4256d;
import com.bytedance.android.live.liveinteract.newpk.p379vm.PkDataContext;
import com.bytedance.android.live.liveinteract.widget.widget.PKLastBattleResultLayout;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.widget.RoomWidget;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.KVData;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.C2WC;
import p003X.C409882Kg;
import p003X.C79359HQb;
import p003X.C79503HVp;
import p003X.HV1;
import p003X.HV2;
import p003X.LK5;
import p003X.QB4;

/* loaded from: classes3.dex */
public final class PkLastBattleResultWidget extends RoomWidget implements Observer<KVData>, AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public boolean LIZIZ;
    public final PkDataContext LIZJ;
    public PKLastBattleResultLayout LIZLLL;

    /* renamed from: LJ */
    public CompositeDisposable f26391LJ = new CompositeDisposable();
    public Observer<AbstractC4256d> LJFF = new HV1(this);

    static {
        Covode.recordClassIndex(28804);
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 6).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        this.LIZJ.LJIIIZ.removeObserver(this.LJFF);
        this.f26391LJ.clear();
        super.onDestroy();
    }

    public final void LIZ() {
        C79503HVp c79503HVp;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        if (Intrinsics.areEqual(this.LIZJ.LJIIIZ.getValue(), AbstractC4256d.C4258b.LIZIZ) && (c79503HVp = this.LIZJ.LJJIIZI) != null && c79503HVp.LJFF() && !C79359HQb.LIZIZ.LIZ()) {
            ViewGroup viewGroup = this.containerView;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
            if (this.LIZIZ) {
                PKLastBattleResultLayout pKLastBattleResultLayout = this.LIZLLL;
                if (pKLastBattleResultLayout != null) {
                    pKLastBattleResultLayout.LIZ();
                }
                this.LIZIZ = false;
                return;
            }
            return;
        }
        ViewGroup viewGroup2 = this.containerView;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZIZ() {
        /*
            r8 = this;
            r5 = 0
            java.lang.Object[] r2 = new java.lang.Object[r5]
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.liveinteract.newpk.widget.PkLastBattleResultWidget.LIZ
            r0 = 4
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r2, r8, r1, r5, r0)
            boolean r0 = r0.isSupported
            if (r0 == 0) goto Lf
            return
        Lf:
            com.bytedance.ies.sdk.widgets.DataCenter r1 = r8.dataCenter
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            java.lang.String r2 = "cmd_what_audience_join_self_link"
            java.lang.Object r7 = r1.get(r2, r0)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            com.bytedance.ies.sdk.widgets.DataCenter r1 = r8.dataCenter
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            java.lang.Object r0 = r1.get(r2, r0)
            java.lang.String r6 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L91
            com.bytedance.ies.sdk.widgets.DataCenter r2 = r8.dataCenter
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            java.lang.String r0 = "cmd_what_audience_join_guest_link"
            java.lang.Object r0 = r2.get(r0, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L91
            r4 = 0
        L46:
            android.view.ViewGroup r0 = r8.containerView
            r2 = 0
            if (r0 == 0) goto L8f
            android.view.ViewParent r1 = r0.getParent()
        L4f:
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 != 0) goto L54
            r1 = r2
        L54:
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            if (r1 == 0) goto L8e
            int r2 = r1.getWidth()
            r0 = -1
            if (r2 != r0) goto L63
            int r2 = p003X.LK5.LIZJ()
        L63:
            int r1 = r2 / 4
            r0 = 1092616192(0x41200000, float:10.0)
            int r3 = p003X.LK5.LIZ(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r6)
            boolean r0 = r7.booleanValue()
            if (r0 != 0) goto L75
            r1 = 0
        L75:
            int r3 = r3 + r1
            r0 = 1117782016(0x42a00000, float:80.0)
            int r0 = p003X.LK5.LIZ(r0)
            int r2 = r2 - r0
            int r2 = r2 / 2
            if (r4 == 0) goto L87
            r0 = 1112014848(0x42480000, float:50.0)
            int r5 = p003X.LK5.LIZ(r0)
        L87:
            int r2 = r2 + r5
            android.view.ViewGroup r1 = r8.containerView
            r0 = -3
            com.bytedance.common.utility.UIUtils.updateLayoutMargin(r1, r0, r0, r2, r3)
        L8e:
            return
        L8f:
            r1 = r2
            goto L4f
        L91:
            r4 = 1
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.newpk.widget.PkLastBattleResultWidget.LIZIZ():void");
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        C2WC<Integer> LLFFF;
        Observable<Integer> LIZIZ;
        Disposable subscribe;
        MethodCollector.m14708i(1973);
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            MethodCollector.m14707o(1973);
            return;
        }
        super.onCreate();
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "");
        this.LIZLLL = new PKLastBattleResultLayout(context, null, 0, 6, null);
        PKLastBattleResultLayout pKLastBattleResultLayout = this.LIZLLL;
        if (pKLastBattleResultLayout != null) {
            pKLastBattleResultLayout.setBackgroundAlpha(127);
        }
        this.containerView.addView(this.LIZLLL, new ViewGroup.LayoutParams(LK5.LIZ(80.0f), LK5.LIZ(24.0f)));
        this.LIZJ.LJIIIZ.observeForever(this.LJFF);
        this.dataCenter.observeForever("cmd_what_audience_join_self_link", this).observeForever("cmd_what_audience_join_guest_link", this);
        LIZIZ();
        C5923dp LIZ2 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
        if (LIZ2 != null && (LLFFF = LIZ2.LLFFF()) != null && (LIZIZ = LLFFF.LIZIZ()) != null && (subscribe = LIZIZ.subscribe(new HV2(this))) != null) {
            QB4.LIZ(subscribe, this.f26391LJ);
            MethodCollector.m14707o(1973);
            return;
        }
        MethodCollector.m14707o(1973);
    }

    public PkLastBattleResultWidget(PkDataContext pkDataContext) {
        C106862S5w.LIZ(pkDataContext);
        this.LIZJ = pkDataContext;
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(KVData kVData) {
        String str;
        KVData kVData2 = kVData;
        if (!PatchProxy.proxy(new Object[]{kVData2}, this, LIZ, false, 5).isSupported) {
            String str2 = null;
            if (kVData2 != null) {
                str = kVData2.getKey();
            } else {
                str = null;
            }
            if (!Intrinsics.areEqual(str, "cmd_what_audience_join_self_link")) {
                if (kVData2 != null) {
                    str2 = kVData2.getKey();
                }
                if (!Intrinsics.areEqual(str2, "cmd_what_audience_join_guest_link")) {
                    return;
                }
            }
            LIZIZ();
        }
    }
}
