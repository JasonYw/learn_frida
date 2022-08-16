package com.bytedance.android.live.liveinteract.newpk.widget;

import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.newpk.p379vm.AbstractC4702i;
import com.bytedance.android.live.liveinteract.newpk.p379vm.PkDataContext;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.widget.RoomWidget;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.disposables.CompositeDisposable;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC413402Xu;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.HTW;
import p003X.HYM;
import p003X.HYN;

/* loaded from: classes3.dex */
public final class PkBo3RoundResultWidget extends RoomWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public HYM LIZIZ;
    public int LIZJ;
    public final PkDataContext LIZLLL;

    /* renamed from: LJ */
    public final LinkCrossRoomDataHolder f26386LJ = LinkCrossRoomDataHolder.LJII();
    public final CompositeDisposable LJFF = new CompositeDisposable();
    public final Observer<AbstractC4702i> LJI = new HYN(this);
    public final HTW LJII;

    static {
        Covode.recordClassIndex(28777);
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
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        super.onDestroy();
        this.LJII.LJFF.removeObserver(this.LJI);
        this.LJFF.clear();
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        AbstractC413402Xu<Boolean> LJIILJJIL;
        Boolean LIZIZ;
        MethodCollector.m14708i(1967);
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            MethodCollector.m14707o(1967);
            return;
        }
        super.onCreate();
        C5923dp LJJJI = LJJJI();
        if (LJJJI != null && (LJIILJJIL = LJJJI.LJIILJJIL()) != null && (LIZIZ = LJIILJJIL.LIZIZ()) != null) {
            LIZIZ.booleanValue();
        }
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "");
        this.LIZIZ = new HYM(context, null, 0, 6);
        ViewGroup viewGroup = this.containerView;
        HYM hym = this.LIZIZ;
        if (hym == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        viewGroup.addView(hym, new ViewGroup.LayoutParams(-1, -1));
        this.LJII.LJFF.observeForever(this.LJI);
        MethodCollector.m14707o(1967);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0397  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZ() {
        /*
            Method dump skipped, instructions count: 1052
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.newpk.widget.PkBo3RoundResultWidget.LIZ():void");
    }

    public PkBo3RoundResultWidget(PkDataContext pkDataContext, HTW htw) {
        C106862S5w.LIZ(pkDataContext, htw);
        this.LIZLLL = pkDataContext;
        this.LJII = htw;
    }
}
