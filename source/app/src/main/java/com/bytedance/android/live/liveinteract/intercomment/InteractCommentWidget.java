package com.bytedance.android.live.liveinteract.intercomment;

import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.LinkSubWidget;
import com.bytedance.android.live.liveinteract.multianchor.p368f.C4520a;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4782v;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.live.datacontext.C13491f;
import io.reactivex.disposables.Disposable;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC413402Xu;
import p003X.AbstractC4569445g;
import p003X.C2WC;
import p003X.C391261eS;
import p003X.C79770HcS;
import p003X.C80125HiB;
import p003X.C80126HiC;
import p003X.HQG;
import p003X.IQV;
import p003X.IQX;
import p003X.View$OnClickListenerC80127HiD;

/* loaded from: classes3.dex */
public final class InteractCommentWidget extends LinkSubWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZJ;
    public C4443i LIZLLL;

    /* renamed from: LJ */
    public Disposable f26327LJ;
    public C391261eS LJFF;
    public final C5923dp LJI;
    public final boolean LJII;
    public HQG LJIIIIZZ;
    public int LJIIIZ;
    public C80125HiB LJIIJ;
    public long LJIIJJI;
    public final ViewGroup LJIIL;
    public int LJIILIIL;
    public C79770HcS LJIILJJIL;
    public final Observer<Integer> LJIILL;

    static {
        Covode.recordClassIndex(27423);
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.LinkSubWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZJ, false, 6).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        LiveData<Integer> liveData;
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 5).isSupported) {
            return;
        }
        super.onDestroy();
        ViewGroup viewGroup = this.LJIIL;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        Disposable disposable = this.f26327LJ;
        if (disposable != null) {
            disposable.dispose();
        }
        C4443i c4443i = this.LIZLLL;
        if (c4443i != null && (liveData = c4443i.LJFF) != null) {
            liveData.removeObserver(this.LJIILL);
        }
        HQG hqg = this.LJIIIIZZ;
        if (hqg != null) {
            hqg.LIZIZ(this.LJIILJJIL);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
        if (r0.intValue() == r1) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZ() {
        /*
            r4 = this;
            r2 = 0
            java.lang.Object[] r1 = new java.lang.Object[r2]
            com.bytedance.hotfix.base.ChangeQuickRedirect r0 = com.bytedance.android.live.liveinteract.intercomment.InteractCommentWidget.LIZJ
            r3 = 2
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r1, r4, r0, r2, r3)
            boolean r0 = r0.isSupported
            if (r0 == 0) goto Lf
            return
        Lf:
            boolean r0 = r4.LJII
            if (r0 == 0) goto L5e
            int r0 = r4.LJIILIIL
            boolean r0 = r4.LIZ(r0)
            if (r0 != 0) goto L35
            com.bytedance.android.live.liveinteract.intercomment.i r0 = r4.LIZLLL
            if (r0 == 0) goto L5c
            androidx.lifecycle.LiveData<java.lang.Integer> r0 = r0.LJFF
            if (r0 == 0) goto L5c
            java.lang.Object r0 = r0.getValue()
            java.lang.Integer r0 = (java.lang.Integer) r0
        L29:
            int r1 = p003X.C80153Hid.LIZJ()
            if (r0 == 0) goto L5e
            int r0 = r0.intValue()
            if (r0 != r1) goto L5e
        L35:
            X.HQG r0 = r4.LJIIIIZZ
            if (r0 == 0) goto L45
            java.util.List r0 = r0.LIZLLL()
            if (r0 == 0) goto L45
            int r0 = r0.size()
            if (r0 > r3) goto L5e
        L45:
            android.view.ViewGroup r0 = r4.LJIIL
            if (r0 == 0) goto L4f
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L67
        L4f:
            X.HiB r0 = r4.LJIIJ
            r0.LIZ()
            android.view.ViewGroup r0 = r4.LJIIL
            if (r0 == 0) goto L5b
            r0.setVisibility(r2)
        L5b:
            return
        L5c:
            r0 = 0
            goto L29
        L5e:
            android.view.ViewGroup r1 = r4.LJIIL
            if (r1 == 0) goto L67
            r0 = 8
            r1.setVisibility(r0)
        L67:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.intercomment.InteractCommentWidget.LIZ():void");
    }

    @Override // com.bytedance.android.live.liveinteract.chatroom.chatroom.LinkSubWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        LiveData<Integer> liveData;
        C4520a c4520a;
        MethodCollector.m14708i(1889);
        if (PatchProxy.proxy(new Object[0], this, LIZJ, false, 1).isSupported) {
            MethodCollector.m14707o(1889);
            return;
        }
        super.onCreate();
        Pair LIZ = IQV.LIZ((Function0) new InteractCommentWidget$onCreate$dataPair$1(this));
        this.LIZLLL = (C4443i) LIZ.getFirst();
        IQX.LIZ((C13491f) LIZ.getFirst(), C4443i.LJIIL);
        this.f26327LJ = (Disposable) LIZ.getSecond();
        if (this.LJIILIIL == 7) {
            AbstractC4782v LIZ2 = AbstractC4782v.LJIIL.LIZ();
            if (LIZ2 != null) {
                c4520a = LIZ2.mo15709LJ();
            } else {
                c4520a = null;
            }
            this.LJIIIIZZ = c4520a;
            HQG hqg = this.LJIIIIZZ;
            if (hqg != null) {
                hqg.LIZ(this.LJIILJJIL);
            }
        }
        ViewGroup viewGroup = this.LJIIL;
        if (viewGroup != null) {
            Context context = viewGroup.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            this.LJFF = new C391261eS(context);
            viewGroup.addView(this.LJFF);
        }
        C4443i c4443i = this.LIZLLL;
        if (c4443i != null && (liveData = c4443i.LJFF) != null) {
            liveData.observeForever(this.LJIILL);
        }
        ViewGroup viewGroup2 = this.LJIIL;
        if (viewGroup2 != null) {
            viewGroup2.setOnClickListener(new View$OnClickListenerC80127HiD(this));
        }
        LIZ();
        MethodCollector.m14707o(1889);
    }

    private final boolean LIZ(int i) {
        C5923dp c5923dp;
        C2WC<Room> LIZ;
        Room LIZ2;
        Map<String, String> map;
        C2WC<Room> LIZ3;
        Room LIZ4;
        Map<String, String> map2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZJ, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (i == 1) {
            C5923dp c5923dp2 = this.LJI;
            if (c5923dp2 == null || (LIZ3 = c5923dp2.LIZ()) == null || (LIZ4 = LIZ3.LIZ()) == null || (map2 = LIZ4.anchorAbMap) == null || !map2.containsKey("chat_intercommunicate_pk")) {
                return false;
            }
            return Intrinsics.areEqual(map2.get("chat_intercommunicate_pk"), "2");
        } else if (i != 7 || (c5923dp = this.LJI) == null || (LIZ = c5923dp.LIZ()) == null || (LIZ2 = LIZ.LIZ()) == null || (map = LIZ2.anchorAbMap) == null || !map.containsKey("chat_intercommunicate_multi_anchor")) {
            return false;
        } else {
            return Intrinsics.areEqual(map.get("chat_intercommunicate_multi_anchor"), "2");
        }
    }

    public InteractCommentWidget(ViewGroup viewGroup, ViewGroup viewGroup2, int i) {
        super(viewGroup, viewGroup2);
        boolean z;
        AbstractC413402Xu<Boolean> LJIILJJIL;
        Boolean LIZIZ;
        this.LJIIL = viewGroup;
        this.LJIILIIL = i;
        C13491f LIZ = IQV.LIZ(C5923dp.class);
        this.LJI = (C5923dp) (!(LIZ instanceof C5923dp) ? null : LIZ);
        C5923dp c5923dp = this.LJI;
        if (c5923dp != null && (LJIILJJIL = c5923dp.LJIILJJIL()) != null && (LIZIZ = LJIILJJIL.LIZIZ()) != null) {
            z = LIZIZ.booleanValue();
        } else {
            z = false;
        }
        this.LJII = z;
        this.LJIIJ = new C80125HiB(this.LJIILIIL);
        this.LJIILJJIL = new C79770HcS(this);
        this.LJIILL = new C80126HiC(this);
    }
}
