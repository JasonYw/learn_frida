package com.bytedance.android.live.liveinteract.newpk.widget;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.newpk.p379vm.C4688b;
import com.bytedance.android.livesdk.chatroom.widget.RoomWidget;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.DialogC79392HRi;
import p003X.HSI;
import p003X.HSJ;
import p003X.HSO;
import p003X.QB4;

/* loaded from: classes3.dex */
public final class PkActivityWidget extends RoomWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public DialogC79392HRi LIZIZ;
    public Disposable LIZJ;
    public final C4688b LIZLLL;

    /* renamed from: LJ */
    public final HSO f26382LJ;
    public final CompositeDisposable LJFF = new CompositeDisposable();

    static {
        Covode.recordClassIndex(28746);
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
        this.LJFF.clear();
        Disposable disposable = this.LIZJ;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        super.onCreate();
        QB4.LIZ(this.LIZLLL.LIZ().LIZIZ().subscribe(new HSJ(this)), this.LJFF);
        QB4.LIZ(this.LIZLLL.LIZJ().LIZIZ().subscribe(new HSI(this)), this.LJFF);
    }

    public PkActivityWidget(C4688b c4688b, HSO hso) {
        C106862S5w.LIZ(c4688b);
        this.LIZLLL = c4688b;
        this.f26382LJ = hso;
    }
}
