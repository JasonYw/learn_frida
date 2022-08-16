package com.bytedance.android.live.liveinteract.p382pk;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.core.tetris.widgets.LiveWidget;
import com.bytedance.android.live.linkpk.AbstractC4261e;
import com.bytedance.android.live.linkpk.AbstractC4262f;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multianchor.p368f.C4520a;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4784x;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.message.model.C8845ej;
import com.bytedance.android.livesdk.message.model.C8874fl;
import com.bytedance.android.livesdkapi.depend.model.live.C9564y;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.live.datacontext.C13491f;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC416582eC;
import p003X.AbstractC4569445g;
import p003X.AbstractC79150HIa;
import p003X.C106862S5w;
import p003X.C3BK;
import p003X.C79142HHs;
import p003X.C79220HKs;
import p003X.C79232HLe;
import p003X.C79308HOc;
import p003X.C79317HOl;
import p003X.C79626Ha8;
import p003X.HIZ;
import p003X.HKK;
import p003X.HOO;
import p003X.HOV;
import p003X.HOW;
import p003X.HOX;
import p003X.HOY;
import p003X.HOZ;
import p003X.HPC;
import p003X.IQV;
import p003X.IQX;
import p003X.QB4;

/* renamed from: com.bytedance.android.live.liveinteract.pk.PkControlWidget */
/* loaded from: classes3.dex */
public final class PkControlWidget extends LiveWidget implements AbstractC4726b, AbstractC4784x, AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public Room LIZIZ;
    public C79308HOc LIZJ;
    public C79220HKs LIZLLL;

    /* renamed from: LJ */
    public C4733k f26407LJ;
    public HIZ LJFF;
    public AbstractC79150HIa LJI;
    public CompositeDisposable LJIIIIZZ;
    public HPC LJIIIZ;
    public C79232HLe LJIIJ;
    public C79626Ha8 LJIIJJI;
    public HOO LJIIL;
    public final Observer<AbstractC4261e> LJIILIIL;
    public final Observer<C8874fl> LJIILJJIL;

    static {
        Covode.recordClassIndex(28904);
    }

    public PkControlWidget() {
        this(null, null, 3);
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC6416aw
    public final void LIZIZ(Throwable th) {
        if (PatchProxy.proxy(new Object[]{th}, this, LIZ, false, 17).isSupported) {
            return;
        }
        AbstractC416582eC.LIZ(this, th);
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC6416aw
    public final String LJJIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 16);
        return proxy.isSupported ? (String) proxy.result : AbstractC416582eC.LIZ(this);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.android.logsdk.collect.p785a.AbstractC9727b
    public final String getSpm() {
        return "a100.a100.a114";
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 18).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.liveinteract.p382pk.AbstractC4726b
    public final void LIZ() {
        C79220HKs c79220HKs;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported && (c79220HKs = this.LIZLLL) != null && c79220HKs.isVisible()) {
            c79220HKs.dismiss();
        }
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4784x
    public final C4520a LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 15);
        if (proxy.isSupported) {
            return (C4520a) proxy.result;
        }
        C4733k c4733k = this.f26407LJ;
        if (c4733k == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return c4733k.LJIJI;
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4784x
    public final C79317HOl LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 13);
        if (proxy.isSupported) {
            return (C79317HOl) proxy.result;
        }
        C4733k c4733k = this.f26407LJ;
        if (c4733k == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return c4733k.LIZ();
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            return;
        }
        super.onCreate();
        Object obj = this.dataCenter.get("data_room", (String) new Room());
        Intrinsics.checkNotNullExpressionValue(obj, "");
        this.LIZIZ = (Room) obj;
        Room room = this.LIZIZ;
        if (room == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        this.LIZJ = new C79308HOc(room);
        C79308HOc c79308HOc = this.LIZJ;
        if (c79308HOc == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        c79308HOc.LIZ((AbstractC4726b) this);
        Pair LIZ2 = IQV.LIZ((Function0) PkControlWidget$onCreate$pair$1.INSTANCE);
        ((C4732f) LIZ2.getFirst()).LIZ().LIZIZ(this);
        IQX.LIZ((C13491f) LIZ2.getFirst(), "IPKControlService");
        this.LJIIIIZZ.add((Disposable) LIZ2.getSecond());
        Pair LIZ3 = IQV.LIZ((Function0) new PkControlWidget$onCreate$linkDataPair$1(this));
        this.f26407LJ = (C4733k) LIZ3.getFirst();
        C4733k c4733k = this.f26407LJ;
        if (c4733k == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        c4733k.LJIIIZ = this.LJFF;
        C4733k c4733k2 = this.f26407LJ;
        if (c4733k2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        c4733k2.LJIIJ = this.LJI;
        C4733k c4733k3 = this.f26407LJ;
        if (c4733k3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        IQX.LIZ(c4733k3, "IPKLinkDataService");
        C4733k c4733k4 = this.f26407LJ;
        if (c4733k4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        IQX.LIZ(c4733k4, "IPKLinkBizDataService");
        this.LJIIIIZZ.add((Disposable) LIZ3.getSecond());
        if (this.LJIIIZ == null) {
            Room room2 = this.LIZIZ;
            if (room2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            DataCenter dataCenter = this.dataCenter;
            C4733k c4733k5 = this.f26407LJ;
            if (c4733k5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            this.LJIIIZ = new HPC(room2, dataCenter, true, c4733k5);
        }
        SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_PK_PRECISION_MATCH_OPT_ENABLE;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (value.booleanValue()) {
            DataCenter dataCenter2 = this.dataCenter;
            Intrinsics.checkNotNullExpressionValue(dataCenter2, "");
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            C4733k c4733k6 = this.f26407LJ;
            if (c4733k6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            this.LJIIJ = new C79232HLe(dataCenter2, context, c4733k6, this);
        }
        DataCenter dataCenter3 = this.dataCenter;
        Intrinsics.checkNotNullExpressionValue(dataCenter3, "");
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "");
        C4733k c4733k7 = this.f26407LJ;
        if (c4733k7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        this.LJIIJJI = new C79626Ha8(dataCenter3, context2, c4733k7);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        DataCenter dataCenter4 = this.dataCenter;
        Intrinsics.checkNotNullExpressionValue(dataCenter4, "");
        this.LJIIL = new HOO(context3, dataCenter4);
        C4733k c4733k8 = this.f26407LJ;
        if (c4733k8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        c4733k8.LJIIIZ().observeForever(this.LJIILIIL);
        C4733k c4733k9 = this.f26407LJ;
        if (c4733k9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        c4733k9.LJJIIJZLJL.observeForever(this.LJIILJJIL);
        C4733k c4733k10 = this.f26407LJ;
        if (c4733k10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        Disposable subscribe = c4733k10.LJI().LIZIZ().subscribe(new HOY(this));
        if (subscribe != null) {
            QB4.LIZ(subscribe, this.LJIIIIZZ);
        }
        C4733k c4733k11 = this.f26407LJ;
        if (c4733k11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        Disposable subscribe2 = c4733k11.LJII().LIZIZ().subscribe(new HOX(this));
        if (subscribe2 != null) {
            QB4.LIZ(subscribe2, this.LJIIIIZZ);
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        MutableLiveData<C9564y> mutableLiveData;
        LiveData<AbstractC4262f> liveData;
        LiveData<Long> liveData2;
        LiveData<Long> liveData3;
        MutableLiveData<C8845ej> mutableLiveData2;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
            return;
        }
        super.onDestroy();
        C79308HOc c79308HOc = this.LIZJ;
        if (c79308HOc == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        c79308HOc.LIZJ();
        HPC hpc = this.LJIIIZ;
        if (hpc != null && !PatchProxy.proxy(new Object[0], hpc, HPC.LIZ, false, 14).isSupported) {
            HKK hkk = hpc.LJIIJJI;
            if (hkk != null) {
                hkk.LIZ();
            }
            Disposable disposable = hpc.LJII;
            if (disposable != null) {
                disposable.dispose();
            }
            Disposable disposable2 = hpc.LJI;
            if (disposable2 != null) {
                disposable2.dispose();
            }
            hpc.LJIIIZ.dispose();
            Disposable disposable3 = hpc.LJIIIIZZ;
            if (disposable3 != null) {
                disposable3.dispose();
            }
            Disposable disposable4 = hpc.LJIIJ;
            if (disposable4 != null) {
                disposable4.dispose();
            }
            hpc.LIZIZ();
            IService service = ServiceManager.getService(IInteractService.class);
            Intrinsics.checkNotNullExpressionValue(service, "");
            C3BK pkService = ((IInteractService) service).getPkService();
            if (pkService != null) {
                pkService.LIZIZ(hpc.LJIILIIL);
            }
            hpc.LJIIZILJ.LJIILJJIL.removeObserver(hpc.LJIIL);
        }
        C79232HLe c79232HLe = this.LJIIJ;
        if (c79232HLe != null && !PatchProxy.proxy(new Object[0], c79232HLe, C79232HLe.LIZ, false, 1).isSupported) {
            c79232HLe.LIZIZ.dispose();
            C4736n c4736n = c79232HLe.LIZLLL;
            if (c4736n != null && !PatchProxy.proxy(new Object[0], c4736n, C4736n.LIZ, false, 6).isSupported) {
                c4736n.onCleared();
            }
            C4736n c4736n2 = c79232HLe.LIZLLL;
            if (c4736n2 != null && (mutableLiveData2 = c4736n2.LIZLLL) != null) {
                mutableLiveData2.removeObserver(c79232HLe.f6757LJ);
            }
        }
        C79626Ha8 c79626Ha8 = this.LJIIJJI;
        if (c79626Ha8 != null && !PatchProxy.proxy(new Object[0], c79626Ha8, C79626Ha8.LIZ, false, 1).isSupported) {
            c79626Ha8.LIZIZ.dispose();
            PkAutoMatchDataContext pkAutoMatchDataContext = c79626Ha8.LIZJ;
            if (pkAutoMatchDataContext != null && (liveData3 = pkAutoMatchDataContext.LJIL) != null) {
                liveData3.removeObserver(c79626Ha8.LJI);
            }
            PkAutoMatchDataContext pkAutoMatchDataContext2 = c79626Ha8.LIZJ;
            if (pkAutoMatchDataContext2 != null && (liveData2 = pkAutoMatchDataContext2.LJIJJ) != null) {
                liveData2.removeObserver(c79626Ha8.LJII);
            }
            PkAutoMatchDataContext pkAutoMatchDataContext3 = c79626Ha8.LIZJ;
            if (pkAutoMatchDataContext3 != null && (liveData = pkAutoMatchDataContext3.LJIJ) != null) {
                liveData.removeObserver(c79626Ha8.LJIIIIZZ);
            }
            PkAutoMatchDataContext pkAutoMatchDataContext4 = c79626Ha8.LIZJ;
            if (pkAutoMatchDataContext4 != null && !PatchProxy.proxy(new Object[0], pkAutoMatchDataContext4, PkAutoMatchDataContext.LIZ, false, 7).isSupported) {
                pkAutoMatchDataContext4.onCleared();
            }
        }
        HOO hoo = this.LJIIL;
        if (hoo != null && !PatchProxy.proxy(new Object[0], hoo, HOO.LIZ, false, 1).isSupported) {
            C4734l c4734l = hoo.LIZJ;
            if (c4734l != null && (mutableLiveData = c4734l.LJFF) != null) {
                mutableLiveData.removeObserver(hoo.LIZLLL);
            }
            C4734l c4734l2 = hoo.LIZJ;
            if (c4734l2 != null && !PatchProxy.proxy(new Object[0], c4734l2, C4734l.LIZ, false, 4).isSupported) {
                c4734l2.onCleared();
            }
            hoo.LIZIZ.dispose();
        }
        this.LJIIIIZZ.dispose();
        C4733k c4733k = this.f26407LJ;
        if (c4733k == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        c4733k.LJIIIZ().removeObserver(this.LJIILIIL);
        C4733k c4733k2 = this.f26407LJ;
        if (c4733k2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        c4733k2.LJJIIJZLJL.removeObserver(this.LJIILJJIL);
    }

    public PkControlWidget(HIZ hiz, AbstractC79150HIa abstractC79150HIa) {
        this.LJFF = hiz;
        this.LJI = abstractC79150HIa;
        this.LJIIIIZZ = new CompositeDisposable();
        this.LJIILIIL = new HOV(this);
        this.LJIILJJIL = new HOW(this);
    }

    public final void LIZ(Room room, C8874fl c8874fl) {
        C79220HKs LIZIZ;
        if (PatchProxy.proxy(new Object[]{room, c8874fl}, this, LIZ, false, 8).isSupported) {
            return;
        }
        C106862S5w.LIZ(c8874fl);
        if (room == null || c8874fl.LIZJ == 0) {
            return;
        }
        LIZ();
        C79142HHs LIZ2 = C79220HKs.LIZ(this.dataCenter, this);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{room, c8874fl}, LIZ2, C79142HHs.LIZ, false, 13);
        if (proxy.isSupported) {
            LIZIZ = (C79220HKs) proxy.result;
        } else {
            LIZIZ = LIZ2.LIZIZ(1);
            LIZ2.LIZIZ = room;
            room.getOwner();
            LIZ2.LIZLLL = c8874fl;
        }
        this.LIZLLL = LIZIZ;
        C79220HKs c79220HKs = this.LIZLLL;
        if (c79220HKs != null) {
            c79220HKs.setOnDismissListener(new HOZ(this));
        }
        C79220HKs c79220HKs2 = this.LIZLLL;
        if (c79220HKs2 != null) {
            Context context = this.context;
            if (context != null) {
                c79220HKs2.show(((FragmentActivity) context).getSupportFragmentManager(), "LinkDialog");
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
    }

    public /* synthetic */ PkControlWidget(HIZ hiz, AbstractC79150HIa abstractC79150HIa, int i) {
        this(null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0083, code lost:
        if (((java.lang.Boolean) r7.result).booleanValue() == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b8, code lost:
        if (r0.LIZIZ() == false) goto L16;
     */
    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4784x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZ(long r25, java.lang.String r27, long r28, java.lang.String r30, p003X.AbstractC79306HOa r31) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.p382pk.PkControlWidget.LIZ(long, java.lang.String, long, java.lang.String, X.HOa):void");
    }
}
