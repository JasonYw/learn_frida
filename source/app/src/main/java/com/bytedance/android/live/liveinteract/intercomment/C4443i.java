package com.bytedance.android.live.liveinteract.intercomment;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.plantform.api.LinkInteractCommentApi;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.message.model.C8834eb;
import com.bytedance.android.livesdk.message.model.C8835ec;
import com.bytedance.android.livesdk.wrds.syncdata.C9421b;
import com.bytedance.android.livesdk.wrds.syncdata.IntercomChangeSyncData;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.live.datacontext.C13491f;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.p1594ss.ugc.live.sdk.message.data.IMessage;
import com.p1594ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC413392Xt;
import p003X.AbstractC413402Xu;
import p003X.AbstractC80160Hik;
import p003X.C100839PnV;
import p003X.C102885QfP;
import p003X.C2WC;
import p003X.C439353Zp;
import p003X.C4574547f;
import p003X.C80125HiB;
import p003X.C80144HiU;
import p003X.C80145HiV;
import p003X.C80146HiW;
import p003X.C80151Hib;
import p003X.C80153Hid;
import p003X.C80154Hie;
import p003X.C80156Hig;
import p003X.C80158Hii;
import p003X.C80159Hij;
import p003X.C88306Kqq;
import p003X.C88440Kt0;
import p003X.IOD;
import p003X.IQV;
import p003X.QB4;

/* renamed from: com.bytedance.android.live.liveinteract.intercomment.i */
/* loaded from: classes3.dex */
public final class C4443i extends C13491f implements OnMessageListener {
    public static ChangeQuickRedirect LIZ;
    public final C5923dp LIZIZ;
    public Disposable LIZJ;
    public final CompositeDisposable LIZLLL;

    /* renamed from: LJ */
    public boolean f26328LJ;
    public final LiveData<Integer> LJFF;
    public C80125HiB LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public long LJIIJ;
    public int LJIIJJI;
    public final MutableLiveData<Integer> LJIILJJIL;
    public static final C80156Hig LJIILIIL = new C80156Hig((byte) 0);
    public static final String LJIIL = "InteractCommentDataContext";

    static {
        Covode.recordClassIndex(27446);
    }

    public final void LIZ() {
        long j;
        C2WC<Room> LIZ2;
        Room LIZ3;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        this.LJII = true;
        if (this.LJIIIIZZ) {
            return;
        }
        this.LJIIIIZZ = true;
        LinkInteractCommentApi linkInteractCommentApi = (LinkInteractCommentApi) C88306Kqq.LIZ().LIZ(LinkInteractCommentApi.class);
        C5923dp c5923dp = this.LIZIZ;
        if (c5923dp != null && (LIZ2 = c5923dp.LIZ()) != null && (LIZ3 = LIZ2.LIZ()) != null) {
            j = LIZ3.getRoomId();
        } else {
            j = 0;
        }
        this.LIZLLL.add(linkInteractCommentApi.intercomInvite(j, LinkCrossRoomDataHolder.LJII().LIZLLL).compose(C100839PnV.LIZJ()).subscribe(new C80146HiW(this), new C80151Hib<>(this)));
    }

    public C4443i(int i) {
        boolean z;
        C102885QfP<IntercomChangeSyncData> LIZ2;
        Observable<IOD<IntercomChangeSyncData>> LIZJ;
        Disposable subscribe;
        C102885QfP<IntercomChangeSyncData> LIZ3;
        IntercomChangeSyncData LIZ4;
        AbstractC413392Xt<IMessageManager> LJIILLIIL;
        IMessageManager LIZIZ;
        AbstractC413402Xu<Boolean> LJIILJJIL;
        Boolean LIZIZ2;
        this.LJIIJJI = i;
        C13491f LIZ5 = IQV.LIZ(C5923dp.class);
        this.LIZIZ = (C5923dp) (!(LIZ5 instanceof C5923dp) ? null : LIZ5);
        this.LIZLLL = new CompositeDisposable();
        C5923dp c5923dp = this.LIZIZ;
        if (c5923dp != null && (LJIILJJIL = c5923dp.LJIILJJIL()) != null && (LIZIZ2 = LJIILJJIL.LIZIZ()) != null) {
            z = LIZIZ2.booleanValue();
        } else {
            z = false;
        }
        this.f26328LJ = z;
        this.LJIILJJIL = new MutableLiveData<>();
        this.LJFF = this.LJIILJJIL;
        this.LJI = new C80125HiB(this.LJIIJJI);
        QB4.LIZ(LLLLIIIILLL().subscribe(new C80144HiU(this)), this.LIZLLL);
        C5923dp c5923dp2 = this.LIZIZ;
        if (c5923dp2 != null && (LJIILLIIL = c5923dp2.LJIILLIIL()) != null && (LIZIZ = LJIILLIIL.LIZIZ()) != null) {
            LIZIZ.addMessageListener(MessageType.INTER_COM_INVITE.LIZ(), this);
            LIZIZ.addMessageListener(MessageType.INTER_COM_REPLY.LIZ(), this);
        }
        C9421b LIZJ2 = C439353Zp.LIZJ();
        if (LIZJ2 != null && (LIZ3 = LIZJ2.LIZ()) != null && (LIZ4 = LIZ3.LIZ()) != null) {
            if (LIZ4.isInIntercom()) {
                LIZ(new C80159Hij());
            } else {
                LIZ(new C80158Hii());
            }
        }
        C9421b LIZJ3 = C439353Zp.LIZJ();
        if (LIZJ3 != null && (LIZ2 = LIZJ3.LIZ()) != null && (LIZJ = LIZ2.LIZJ()) != null && (subscribe = LIZJ.subscribe(new C80145HiV(this))) != null) {
            this.LIZLLL.add(subscribe);
        }
    }

    public final void LIZ(AbstractC80160Hik abstractC80160Hik) {
        if (PatchProxy.proxy(new Object[]{abstractC80160Hik}, this, LIZ, false, 3).isSupported) {
            return;
        }
        Integer value = this.LJIILJJIL.getValue();
        Integer value2 = this.LJIILJJIL.getValue();
        if (value2 == null) {
            value2 = Integer.valueOf(C80153Hid.LIZ());
        }
        Intrinsics.checkNotNullExpressionValue(value2, "");
        int LIZ2 = C80153Hid.LIZ(value2.intValue(), abstractC80160Hik);
        if (value != null && value.intValue() == LIZ2) {
            return;
        }
        this.LJIILJJIL.setValue(Integer.valueOf(LIZ2));
    }

    @Override // com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        String str;
        if (PatchProxy.proxy(new Object[]{iMessage}, this, LIZ, false, 2).isSupported) {
            return;
        }
        if (iMessage instanceof C8834eb) {
            this.LJII = false;
            LIZ(new C80154Hie(false));
        } else if (iMessage instanceof C8835ec) {
            C8835ec c8835ec = (C8835ec) iMessage;
            String str2 = c8835ec.LIZJ;
            if (str2 != null && str2.length() != 0) {
                C88440Kt0.LIZ(c8835ec.LIZJ);
            }
            Disposable disposable = this.LIZJ;
            if (disposable != null) {
                disposable.dispose();
            }
            if (c8835ec.LIZIZ == 1) {
                LIZ(new C80159Hij());
                return;
            }
            if (this.f26328LJ) {
                C80125HiB c80125HiB = this.LJI;
                if (!PatchProxy.proxy(new Object[0], c80125HiB, C80125HiB.LIZ, false, 6).isSupported) {
                    HashMap hashMap = new HashMap();
                    if (c80125HiB.LIZIZ == 1) {
                        str = PushConstants.URI_PACKAGE_NAME;
                    } else {
                        str = "connection";
                    }
                    hashMap.put("connection_scene", str);
                    hashMap.put("channel_id", String.valueOf(LinkCrossRoomDataHolder.LJII().LIZLLL));
                    hashMap.put("pk_id", String.valueOf(LinkCrossRoomDataHolder.LJII().f26249LJ));
                    if (LinkCrossRoomDataHolder.LJII().LJIIIZ) {
                        Room room = LinkCrossRoomDataHolder.LJII().LJJJ;
                        if (room != null) {
                            hashMap.put("other_anchor_id", String.valueOf(room.ownerUserId));
                            hashMap.put("other_room_id", String.valueOf(room.getRoomId()));
                        }
                    } else {
                        Room room2 = LinkCrossRoomDataHolder.LJII().LJJJJIZL;
                        if (room2 != null) {
                            hashMap.put("other_anchor_id", String.valueOf(room2.ownerUserId));
                            hashMap.put("other_room_id", String.valueOf(room2.getRoomId()));
                        }
                    }
                    C4574547f.LIZ().LIZ("livesdk_refuse_feedback", hashMap, Room.class);
                }
            }
            LIZ(new C80158Hii());
        }
    }
}
