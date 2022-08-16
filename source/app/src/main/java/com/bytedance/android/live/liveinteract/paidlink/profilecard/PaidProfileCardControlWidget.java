package com.bytedance.android.live.liveinteract.paidlink.profilecard;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.liveinteract.api.data.C4285g;
import com.bytedance.android.live.liveinteract.paidlink.profilecard.p381a.a$a;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4760aa;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4774i;
import com.bytedance.android.livesdk.chatroom.widget.RoomWidget;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.Widget;
import com.bytedance.live.datacontext.C13491f;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC416582eC;
import p003X.AbstractC4569445g;
import p003X.AbstractC78050Gpo;
import p003X.AbstractC78358Gum;
import p003X.C106862S5w;
import p003X.C2WD;
import p003X.C78361Gup;
import p003X.C78520GxO;
import p003X.C79169HIt;
import p003X.IQV;
import p003X.IQX;

/* loaded from: classes3.dex */
public final class PaidProfileCardControlWidget extends RoomWidget implements Observer<KVData>, a$a, AbstractC4760aa, AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public boolean LIZIZ;
    public Room LIZJ;
    public C78520GxO LIZLLL;

    /* renamed from: LJ */
    public boolean f26403LJ;
    public Disposable LJFF;
    public PaidProfileCardWidget LJI;
    public Disposable LJII;

    static {
        Covode.recordClassIndex(28880);
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC6416aw
    public final void LIZIZ(Throwable th) {
        if (PatchProxy.proxy(new Object[]{th}, this, LIZ, false, 11).isSupported) {
            return;
        }
        AbstractC416582eC.LIZ(this, th);
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC6416aw
    public final String LJJIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 10);
        return proxy.isSupported ? (String) proxy.result : AbstractC416582eC.LIZ(this);
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 12).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4760aa
    public final boolean LIZJ() {
        return this.f26403LJ;
    }

    @Override // com.bytedance.android.live.liveinteract.paidlink.profilecard.p381a.a$a
    public final void LIZLLL() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported && LIZJ()) {
            LIZ();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.paidlink.profilecard.p381a.a$a, com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4760aa
    public final void LIZ() {
        C2WD<C4285g> LIZJ;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported || !this.f26403LJ) {
            return;
        }
        AbstractC4774i LIZ2 = AbstractC78050Gpo.LIZ();
        if (LIZ2 != null) {
            LIZ2.LIZ(this.LJI);
        }
        C4722a LIZ3 = C4722a.LIZJ.LIZ();
        if (LIZ3 != null && (LIZJ = LIZ3.LIZJ()) != null) {
            LIZJ.LIZ(null);
        }
        this.LJI = null;
        this.f26403LJ = false;
        this.LJFF = null;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            return;
        }
        super.onDestroy();
        C78520GxO c78520GxO = this.LIZLLL;
        if (c78520GxO != null) {
            c78520GxO.LIZJ();
        }
        Disposable disposable = this.LJFF;
        if (disposable != null) {
            disposable.dispose();
        }
        Disposable disposable2 = this.LJII;
        if (disposable2 != null) {
            disposable2.dispose();
        }
        this.LJII = null;
        this.dataCenter.removeObserver(this);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4760aa
    public final void LIZIZ() {
        int i;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        if (proxy.isSupported) {
            if (((Boolean) proxy.result).booleanValue()) {
                return;
            }
        } else {
            AbstractC4774i LIZ2 = AbstractC78050Gpo.LIZ();
            if (LIZ2 != null && LIZ2.mo15717LJ()) {
                return;
            }
            AbstractC4774i LIZ3 = AbstractC78050Gpo.LIZ();
            if (LIZ3 != null) {
                i = LIZ3.LJJIFFI();
            } else {
                i = 0;
            }
            if (C79169HIt.LIZIZ(i, 32)) {
                return;
            }
        }
        LIZLLL();
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        boolean z = false;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        super.onCreate();
        Boolean bool = (Boolean) this.dataCenter.get("data_is_anchor");
        if (bool != null) {
            z = bool.booleanValue();
        }
        this.LIZIZ = z;
        Object obj = this.dataCenter.get("data_is_portrait", (String) Boolean.TRUE);
        Intrinsics.checkNotNullExpressionValue(obj, "");
        ((Boolean) obj).booleanValue();
        this.LIZJ = (Room) this.dataCenter.get("data_room", (String) new Room());
        this.LIZLLL = new C78520GxO(this.LIZJ, this.LIZIZ);
        C78520GxO c78520GxO = this.LIZLLL;
        if (c78520GxO != null) {
            c78520GxO.LIZ((a$a) this);
        }
        Pair LIZ2 = IQV.LIZ((Function0) PaidProfileCardControlWidget$onCreate$pair$1.INSTANCE);
        ((C4722a) LIZ2.getFirst()).LIZ().LIZIZ(this);
        IQX.LIZ((C13491f) LIZ2.getFirst(), AbstractC78358Gum.class);
        this.LJII = (Disposable) LIZ2.getSecond();
        this.dataCenter.observe("data_promotion_right_card_container_show", this);
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(KVData kVData) {
        C78520GxO c78520GxO;
        KVData kVData2 = kVData;
        if (!PatchProxy.proxy(new Object[]{kVData2}, this, LIZ, false, 9).isSupported && kVData2 != null) {
            if ((Intrinsics.areEqual(kVData2.getKey(), "data_bottom_right_state") || Intrinsics.areEqual(kVData2.getKey(), "data_promotion_right_card_container_show")) && (c78520GxO = this.LIZLLL) != null && c78520GxO.LIZ()) {
                LIZLLL();
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.paidlink.profilecard.p381a.a$a
    public final void LIZ(C4285g c4285g, long j) {
        Widget widget;
        C2WD<C4285g> LIZJ;
        if (PatchProxy.proxy(new Object[]{c4285g, 10000L}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(c4285g);
        if (this.f26403LJ) {
            return;
        }
        Disposable disposable = this.LJFF;
        if (disposable != null) {
            disposable.dispose();
        }
        if (!PatchProxy.proxy(new Object[]{c4285g}, this, LIZ, false, 3).isSupported) {
            C106862S5w.LIZ(c4285g);
            if (!this.f26403LJ) {
                C4722a LIZ2 = C4722a.LIZJ.LIZ();
                if (LIZ2 != null && (LIZJ = LIZ2.LIZJ()) != null) {
                    LIZJ.LIZ(c4285g);
                }
                AbstractC4774i LIZ3 = AbstractC78050Gpo.LIZ();
                if (LIZ3 != null) {
                    widget = LIZ3.LIZ(9);
                } else {
                    widget = null;
                }
                this.LJI = (PaidProfileCardWidget) widget;
                this.f26403LJ = true;
            }
        }
        this.LJFF = Observable.timer(10000L, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new C78361Gup(this));
    }
}
