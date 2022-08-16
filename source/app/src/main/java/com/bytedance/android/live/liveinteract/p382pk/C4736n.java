package com.bytedance.android.live.liveinteract.p382pk;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.linkpk.AbstractC4263g;
import com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.api.LinkPKApi;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.p349c.m$a;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.message.model.C8845ej;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.live.datacontext.C13491f;
import com.p1594ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import p003X.AbstractC413392Xt;
import p003X.AbstractC413402Xu;
import p003X.C100839PnV;
import p003X.C106862S5w;
import p003X.C2WC;
import p003X.C3811617u;
import p003X.C409882Kg;
import p003X.C79309HOd;
import p003X.C79317HOl;
import p003X.C79492HVe;
import p003X.C80012HgM;
import p003X.C88306Kqq;
import p003X.HJ7;
import p003X.HJ8;
import p003X.IQV;
import p003X.QB4;

/* renamed from: com.bytedance.android.live.liveinteract.pk.n */
/* loaded from: classes3.dex */
public final class C4736n extends C13491f implements OnMessageListener {
    public static ChangeQuickRedirect LIZ;
    public final CompositeDisposable LIZIZ = new CompositeDisposable();
    public final IMessageManager LIZJ;
    public final MutableLiveData<C8845ej> LIZLLL;

    /* renamed from: LJ */
    public final MutableLiveData<AbstractC4263g> f26410LJ;
    public final m$a LJFF;
    public DataCenter LJI;
    public C79309HOd LJII;
    public final C5923dp LJIIIIZZ;
    public boolean LJIIIZ;
    public Room LJIIJ;
    public final LinkCrossRoomDataHolder LJIIJJI;
    public final C79317HOl LJIIL;
    public Disposable LJIILIIL;
    public Disposable LJIILJJIL;

    static {
        Covode.recordClassIndex(29033);
    }

    private final void LIZ() {
        Disposable disposable;
        Disposable disposable2;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported && (disposable = this.LJIILIIL) != null && !disposable.isDisposed() && (disposable2 = this.LJIILIIL) != null) {
            disposable2.dispose();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:134:0x02cd, code lost:
        if (((java.lang.Boolean) r1.result).booleanValue() == false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0372, code lost:
        com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder.LJII().LJJLIIIJLJLI = r6.LIZ.f28181LJ;
        com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder.LJII().LJJJZ = true;
        com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder.LJII().LJJL = false;
        r28.LIZLLL.postValue(r6);
        p003X.HJ8.LIZ().LIZ(r6);
        LIZ();
        r1 = io.reactivex.Observable.timer(20, java.util.concurrent.TimeUnit.SECONDS).compose(p003X.C100839PnV.LIZJ()).subscribe(p003X.C79147HHx.LIZIZ);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x03ae, code lost:
        if (r1 == null) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x03b0, code lost:
        r0 = p003X.QB4.LIZ(r1, r28.LIZIZ);
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x03b6, code lost:
        r28.LJIILIIL = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x03b8, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x03b9, code lost:
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0328, code lost:
        if (p003X.C79179HJd.LIZIZ.LIZJ() == false) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x036d, code lost:
        if (r0.LIZJ() == 0) goto L140;
     */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0371 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:168:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x020e  */
    @Override // com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMessage(com.p1594ss.ugc.live.sdk.message.data.IMessage r29) {
        /*
            Method dump skipped, instructions count: 955
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.p382pk.C4736n.onMessage(com.ss.ugc.live.sdk.message.data.IMessage):void");
    }

    public C4736n(DataCenter dataCenter, C79309HOd c79309HOd) {
        IMessageManager iMessageManager;
        boolean z;
        Room room;
        long j;
        C2WC<Room> LIZ2;
        AbstractC413402Xu<Boolean> LJIILJJIL;
        Boolean LIZIZ;
        AbstractC413392Xt<IMessageManager> LJIILLIIL;
        C106862S5w.LIZ(dataCenter, c79309HOd);
        this.LJI = dataCenter;
        this.LJII = c79309HOd;
        C5923dp LIZ3 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
        Room room2 = null;
        if (LIZ3 != null && (LJIILLIIL = LIZ3.LJIILLIIL()) != null) {
            iMessageManager = LJIILLIIL.LIZIZ();
        } else {
            iMessageManager = null;
        }
        this.LIZJ = iMessageManager;
        this.LJIIIIZZ = (C5923dp) IQV.LIZ(C5923dp.class);
        this.LJIIJJI = LinkCrossRoomDataHolder.LJII();
        this.LJIIL = this.LJII.LIZ();
        this.LIZLLL = new MutableLiveData<>();
        this.f26410LJ = new MutableLiveData<>();
        this.LJFF = new C79492HVe(this);
        QB4.LIZ(LLLLIIIILLL().subscribe(new HJ7(this)), this.LIZIZ);
        C5923dp c5923dp = this.LJIIIIZZ;
        if (c5923dp != null && (LJIILJJIL = c5923dp.LJIILJJIL()) != null && (LIZIZ = LJIILJJIL.LIZIZ()) != null) {
            z = LIZIZ.booleanValue();
        } else {
            z = false;
        }
        this.LJIIIZ = z;
        C5923dp c5923dp2 = this.LJIIIIZZ;
        if (c5923dp2 != null && (LIZ2 = c5923dp2.LIZ()) != null) {
            room2 = LIZ2.LIZ();
        }
        this.LJIIJ = room2;
        IMessageManager iMessageManager2 = this.LIZJ;
        if (iMessageManager2 != null) {
            iMessageManager2.addMessageListener(MessageType.LINK_MIC_BATTLE_PRECISION_MATCH.LIZ(), this);
        }
        HJ8 LIZ4 = HJ8.LIZ();
        m$a m_a = this.LJFF;
        if (!PatchProxy.proxy(new Object[]{m_a}, LIZ4, HJ8.LIZ, false, 5).isSupported && m_a != null) {
            LIZ4.LIZIZ.add(m_a);
        }
        if (this.LJIIIZ && (room = this.LJIIJ) != null) {
            LinkPKApi linkPKApi = (LinkPKApi) C88306Kqq.LIZ().LIZ(LinkPKApi.class);
            long id = room.getId();
            User owner = room.getOwner();
            String str = (owner == null || (str = owner.getSecUid()) == null) ? "" : str;
            User owner2 = room.getOwner();
            if (owner2 != null) {
                j = owner2.getId();
            } else {
                j = 0;
            }
            QB4.LIZ(linkPKApi.getAnchorBattleSetting(id, str, j, 1).compose(C100839PnV.LIZJ()).subscribe(C80012HgM.LIZIZ, C3811617u.LIZIZ), this.LIZIZ);
        }
    }
}
