package com.bytedance.android.live.liveinteract.voicechat.dialog;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.viewbinder.C4319a;
import com.bytedance.android.live.liveinteract.p356e.AbstractC4408a;
import com.bytedance.android.live.liveinteract.p356e.AbstractC4409d;
import com.bytedance.android.live.liveinteract.p356e.AbstractC4410g;
import com.bytedance.android.live.liveinteract.plantform.api.LinkApi;
import com.bytedance.android.live.liveinteract.plantform.model.C4815i;
import com.bytedance.android.live.liveinteract.plantform.model.C4824t;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.C9605p;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.live.datacontext.C13491f;
import io.reactivex.disposables.CompositeDisposable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p003X.C100839PnV;
import p003X.C2WC;
import p003X.C409882Kg;
import p003X.C77907GnV;
import p003X.C77909GnX;
import p003X.C78538Gxg;
import p003X.C79007HCn;
import p003X.C88306Kqq;
import p003X.QB4;

/* renamed from: com.bytedance.android.live.liveinteract.voicechat.dialog.e */
/* loaded from: classes3.dex */
public final class C5012e extends C13491f {
    public static ChangeQuickRedirect LIZ;
    public long LJFF;
    public long LJI;
    public MutableLiveData<C9605p> LJIIIIZZ;
    public final Room LJIIIZ;
    public final MutableLiveData<Integer> LJIIJ;
    public final MutableLiveData<C4824t> LJIIJJI;
    public final MutableLiveData<List<Object>> LJIIL;
    public final MutableLiveData<C4815i> LJIILIIL;
    public final CompositeDisposable LJIILJJIL;
    public boolean LJIILL;
    public String LIZIZ = "";
    public final C4319a LIZJ = new C4319a(0);
    public final C4319a LIZLLL = new C4319a(1);

    /* renamed from: LJ */
    public boolean f26481LJ = true;
    public final List<C4824t> LJII = new ArrayList();

    static {
        Covode.recordClassIndex(31074);
    }

    public final LiveData<Integer> LIZ() {
        return this.LJIIJ;
    }

    public final LiveData<C4824t> LIZIZ() {
        return this.LJIIJJI;
    }

    public final LiveData<List<Object>> LIZJ() {
        return this.LJIIL;
    }

    public final LiveData<C4815i> LIZLLL() {
        return this.LJIILIIL;
    }

    public final int LJFF() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 9);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        C4815i value = LIZLLL().getValue();
        if (value != null && ((int) value.f26421LJ) > 0) {
            C4815i value2 = LIZLLL().getValue();
            if (value2 == null) {
                return 0;
            }
            return (int) value2.f26421LJ;
        }
        return ((int) this.LJI) + 1;
    }

    public C5012e() {
        Room room;
        C2WC<Room> LIZ2;
        MutableLiveData<C9605p> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(null);
        this.LJIIIIZZ = mutableLiveData;
        C5923dp LIZ3 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
        if (LIZ3 != null && (LIZ2 = LIZ3.LIZ()) != null) {
            room = LIZ2.LIZ();
        } else {
            room = null;
        }
        this.LJIIIZ = room;
        MutableLiveData<Integer> mutableLiveData2 = new MutableLiveData<>();
        mutableLiveData2.setValue(40);
        this.LJIIJ = mutableLiveData2;
        MutableLiveData<C4824t> mutableLiveData3 = new MutableLiveData<>();
        mutableLiveData3.setValue(null);
        this.LJIIJJI = mutableLiveData3;
        MutableLiveData<List<Object>> mutableLiveData4 = new MutableLiveData<>();
        mutableLiveData4.setValue(null);
        this.LJIIL = mutableLiveData4;
        MutableLiveData<C4815i> mutableLiveData5 = new MutableLiveData<>();
        mutableLiveData5.setValue(null);
        this.LJIILIIL = mutableLiveData5;
        this.LJIILJJIL = new CompositeDisposable();
    }

    /* renamed from: LJ */
    public final boolean m15651LJ() {
        AbstractC4408a audioPaidLinkService;
        AbstractC4409d interactPaidLinkService;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        AbstractC4410g videoPaidLinkService = ((IInteractService) ServiceManager.getService(IInteractService.class)).videoPaidLinkService();
        if ((videoPaidLinkService == null || !videoPaidLinkService.LIZJ()) && (((audioPaidLinkService = ((IInteractService) ServiceManager.getService(IInteractService.class)).audioPaidLinkService()) == null || !audioPaidLinkService.LIZJ()) && ((interactPaidLinkService = ((IInteractService) ServiceManager.getService(IInteractService.class)).interactPaidLinkService()) == null || !interactPaidLinkService.LIZIZ()))) {
            return false;
        }
        return true;
    }

    public final int LJI() {
        AbstractC4409d interactPaidLinkService;
        long LIZJ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 10);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        C4815i value = LIZLLL().getValue();
        if (value != null && ((int) value.LIZIZ) > 0) {
            C4815i value2 = LIZLLL().getValue();
            if (value2 != null) {
                LIZJ = value2.LIZIZ;
                return (int) LIZJ;
            }
            return 0;
        }
        AbstractC4410g videoPaidLinkService = ((IInteractService) ServiceManager.getService(IInteractService.class)).videoPaidLinkService();
        if (videoPaidLinkService != null && videoPaidLinkService.LIZLLL() > 0) {
            AbstractC4410g videoPaidLinkService2 = ((IInteractService) ServiceManager.getService(IInteractService.class)).videoPaidLinkService();
            if (videoPaidLinkService2 != null) {
                LIZJ = videoPaidLinkService2.LIZLLL();
                return (int) LIZJ;
            }
            return 0;
        }
        AbstractC4408a audioPaidLinkService = ((IInteractService) ServiceManager.getService(IInteractService.class)).audioPaidLinkService();
        if (audioPaidLinkService != null && audioPaidLinkService.LIZLLL() > 0) {
            AbstractC4408a audioPaidLinkService2 = ((IInteractService) ServiceManager.getService(IInteractService.class)).audioPaidLinkService();
            if (audioPaidLinkService2 != null) {
                LIZJ = audioPaidLinkService2.LIZLLL();
                return (int) LIZJ;
            }
            return 0;
        }
        AbstractC4409d interactPaidLinkService2 = ((IInteractService) ServiceManager.getService(IInteractService.class)).interactPaidLinkService();
        if (interactPaidLinkService2 != null && interactPaidLinkService2.LIZJ() > 0 && (interactPaidLinkService = ((IInteractService) ServiceManager.getService(IInteractService.class)).interactPaidLinkService()) != null) {
            LIZJ = interactPaidLinkService.LIZJ();
            return (int) LIZJ;
        }
        return 0;
    }

    public final String LJII() {
        Long l;
        C4824t value;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 13);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        C4824t value2 = LIZIZ().getValue();
        Long l2 = null;
        if (value2 != null) {
            l = Long.valueOf(value2.LJIJJLI);
        } else {
            l = null;
        }
        if (l != null && ((value = LIZIZ().getValue()) == null || value.LJIJJLI != 0)) {
            C4824t value3 = LIZIZ().getValue();
            if (value3 != null) {
                l2 = Long.valueOf(value3.LJIJJLI);
            }
            return String.valueOf(l2);
        }
        C79007HCn LJII = C79007HCn.LJII();
        Intrinsics.checkNotNullExpressionValue(LJII, "");
        C4824t c4824t = LJII.LJJIII;
        if (c4824t == null || Long.valueOf(c4824t.LJIJJLI) == null) {
            return null;
        }
        C79007HCn LJII2 = C79007HCn.LJII();
        Intrinsics.checkNotNullExpressionValue(LJII2, "");
        C4824t c4824t2 = LJII2.LJJIII;
        if (c4824t2 != null && c4824t2.LJIJJLI == 0) {
            return null;
        }
        C79007HCn LJII3 = C79007HCn.LJII();
        Intrinsics.checkNotNullExpressionValue(LJII3, "");
        C4824t c4824t3 = LJII3.LJJIII;
        if (c4824t3 != null) {
            l2 = Long.valueOf(c4824t3.LJIJJLI);
        }
        return String.valueOf(l2);
    }

    public final List<Long> LIZ(List<C4824t> list) {
        long j;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 6);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (C4824t c4824t : list) {
                User user = c4824t.LIZIZ;
                if (user != null) {
                    j = user.getId();
                } else {
                    j = 0;
                }
                arrayList.add(Long.valueOf(j));
            }
        }
        return arrayList;
    }

    public final void LIZ(Room room, String str) {
        long j;
        if (PatchProxy.proxy(new Object[]{room, str}, this, LIZ, false, 3).isSupported) {
            return;
        }
        if (C78538Gxg.LIZ(room) && m15651LJ()) {
            if (room == null || this.LJIILL) {
                return;
            }
        } else if (!this.f26481LJ || room == null || this.LJIILL) {
            return;
        }
        this.LJIILL = true;
        LinkApi linkApi = (LinkApi) C88306Kqq.LIZ().LIZ(LinkApi.class);
        if (room != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        QB4.LIZ(linkApi.getWaitingList(j, str, 50).compose(C100839PnV.LIZJ()).subscribe(new C77907GnV(this, room), new C77909GnX<>(this)), this.LJIILJJIL);
    }

    public static /* synthetic */ void LIZ(C5012e c5012e, Room room, String str, int i, Object obj) {
        if (PatchProxy.proxy(new Object[]{c5012e, room, null, 2, null}, null, LIZ, true, 4).isSupported) {
            return;
        }
        c5012e.LIZ(room, "");
    }
}
