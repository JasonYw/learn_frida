package com.bytedance.android.live.liveinteract.p382pk;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4774i;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4784x;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.message.model.C8859ew;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.depend.model.live.C9564y;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.live.datacontext.C13491f;
import com.p1594ss.ugc.live.sdk.message.data.IMessage;
import com.p1594ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import io.reactivex.disposables.CompositeDisposable;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC413392Xt;
import p003X.AbstractC78050Gpo;
import p003X.C106862S5w;
import p003X.C2W3;
import p003X.C2WC;
import p003X.C3BK;
import p003X.C3BL;
import p003X.C409882Kg;
import p003X.C79317HOl;
import p003X.C79615HZx;
import p003X.HOF;
import p003X.HOQ;
import p003X.HOR;
import p003X.HOS;
import p003X.IQV;
import p003X.QB4;

/* renamed from: com.bytedance.android.live.liveinteract.pk.l */
/* loaded from: classes3.dex */
public final class C4734l extends C13491f implements HOF, OnMessageListener {
    public static ChangeQuickRedirect LIZ;
    public final CompositeDisposable LIZIZ = new CompositeDisposable();
    public final IMessageManager LIZJ;
    public final C79317HOl LIZLLL;

    /* renamed from: LJ */
    public Room f26409LJ;
    public final MutableLiveData<C9564y> LJFF;
    public final LiveData<AbstractC4735a> LJI;
    public DataCenter LJII;
    public final C5923dp LJIIIZ;
    public final MutableLiveData<AbstractC4735a> LJIIJ;

    static {
        Covode.recordClassIndex(29026);
    }

    @Override // p003X.HOF
    public final LiveData<AbstractC4735a> LIZIZ() {
        return this.LJI;
    }

    public final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            return;
        }
        this.LJIIJ.setValue(HOR.LIZ);
    }

    @Override // p003X.HOF
    public final String LIZ() {
        String str;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        C9564y value = this.LJFF.getValue();
        if (value == null || (str = value.LIZIZ) == null) {
            return "";
        }
        return str;
    }

    /* renamed from: com.bytedance.android.live.liveinteract.pk.l$a */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC4735a {
        static {
            Covode.recordClassIndex(29028);
        }

        public AbstractC4735a(String str) {
        }

        public /* synthetic */ AbstractC4735a(String str, byte b) {
            this(str);
        }
    }

    public C4734l(DataCenter dataCenter) {
        IMessageManager iMessageManager;
        C79317HOl c79317HOl;
        C2WC<Room> LIZ2;
        AbstractC413392Xt<IMessageManager> LJIILLIIL;
        C106862S5w.LIZ(dataCenter);
        this.LJII = dataCenter;
        C13491f LIZ3 = IQV.LIZ(C5923dp.class);
        Room room = null;
        this.LJIIIZ = (C5923dp) (!(LIZ3 instanceof C5923dp) ? null : LIZ3);
        C5923dp LIZ4 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
        if (LIZ4 != null && (LJIILLIIL = LIZ4.LJIILLIIL()) != null) {
            iMessageManager = LJIILLIIL.LIZIZ();
        } else {
            iMessageManager = null;
        }
        this.LIZJ = iMessageManager;
        AbstractC4784x LIZ5 = AbstractC4784x.LJII.LIZ();
        if (LIZ5 != null) {
            c79317HOl = LIZ5.LIZIZ();
        } else {
            c79317HOl = null;
        }
        this.LIZLLL = c79317HOl;
        this.LJFF = new MutableLiveData<>();
        this.LJIIJ = new MutableLiveData<>();
        this.LJI = this.LJIIJ;
        QB4.LIZ(LLLLIIIILLL().subscribe(new HOQ(this)), this.LIZIZ);
        C5923dp c5923dp = this.LJIIIZ;
        if (c5923dp != null && (LIZ2 = c5923dp.LIZ()) != null) {
            room = LIZ2.LIZ();
        }
        this.f26409LJ = room;
        IMessageManager iMessageManager2 = this.LIZJ;
        if (iMessageManager2 != null) {
            iMessageManager2.addMessageListener(MessageType.LINK_MIC_PK_ACTIVE_PUSH.LIZ(), this);
        }
        this.LJIIJ.setValue(HOR.LIZ);
    }

    @Override // com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        C3BK pkService;
        if (!PatchProxy.proxy(new Object[]{iMessage}, this, LIZ, false, 1).isSupported && (iMessage instanceof C8859ew)) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
            if (proxy.isSupported) {
                if (((Boolean) proxy.result).booleanValue()) {
                    return;
                }
            } else {
                C2W3 c2w3 = (C2W3) this.LJII.get("data_broadcast_pause_state");
                if (c2w3 != null && (c2w3.LIZ == 1 || c2w3.LIZ == 2)) {
                    return;
                }
            }
            Room room = this.f26409LJ;
            if (room != null && room.isPaidLive()) {
                return;
            }
            SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_PK_ENABLE;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            if (!settingKey.getValue().booleanValue()) {
                return;
            }
            Room room2 = this.f26409LJ;
            if (room2 != null && room2.getMosaicStatus() == 1) {
                return;
            }
            IService service = ServiceManager.getService(IBroadcastService.class);
            Intrinsics.checkNotNullExpressionValue(service, "");
            if (((IBroadcastService) service).isInDrawGuessGame()) {
                return;
            }
            IService service2 = ServiceManager.getService(IBroadcastService.class);
            Intrinsics.checkNotNullExpressionValue(service2, "");
            if (((IBroadcastService) service2).isPlayingGame()) {
                return;
            }
            IInteractService iInteractService = (IInteractService) ServiceManager.getService(IInteractService.class);
            if (iInteractService != null && (pkService = iInteractService.getPkService()) != null && pkService.LIZ()) {
                return;
            }
            PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
            if (proxy2.isSupported) {
                if (!((Boolean) proxy2.result).booleanValue()) {
                    return;
                }
            } else {
                AbstractC4774i LIZ2 = AbstractC78050Gpo.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ2, "");
                int LJJIFFI = LIZ2.LJJIFFI();
                if (LJJIFFI != 0) {
                    if (LJJIFFI != 2) {
                        return;
                    }
                    IService service3 = ServiceManager.getService(IInteractService.class);
                    Intrinsics.checkNotNullExpressionValue(service3, "");
                    C3BL interactAudienceService = ((IInteractService) service3).getInteractAudienceService();
                    Intrinsics.checkNotNullExpressionValue(interactAudienceService, "");
                    if (interactAudienceService.LIZIZ()) {
                        return;
                    }
                }
                C79615HZx LIZ3 = C79615HZx.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ3, "");
                if (LIZ3.LIZJ()) {
                    return;
                }
                C79615HZx LIZ4 = C79615HZx.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ4, "");
                if (LIZ4.LIZLLL()) {
                    return;
                }
                Integer num = (Integer) this.LJII.get("data_pk_match_state", (String) 0);
                if (num != null && (num.intValue() == 1 || num.intValue() == 2 || num.intValue() == 5)) {
                    return;
                }
            }
            if (!Intrinsics.areEqual(this.LJIIJ.getValue(), HOS.LIZ) && LinkCrossRoomDataHolder.LJII().LJJJ == null) {
                C79615HZx LIZ5 = C79615HZx.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ5, "");
                if (!LIZ5.LIZJ()) {
                    C8859ew c8859ew = (C8859ew) iMessage;
                    if (c8859ew.LIZ != null) {
                        this.LJIIJ.setValue(HOS.LIZ);
                        this.LJFF.postValue(c8859ew.LIZ);
                    }
                }
            }
        }
    }
}
