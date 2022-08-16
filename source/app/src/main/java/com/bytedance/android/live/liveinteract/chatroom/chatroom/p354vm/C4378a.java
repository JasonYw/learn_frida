package com.bytedance.android.live.liveinteract.chatroom.chatroom.p354vm;

import android.text.TextUtils;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.liveinteract.api.data.C4284f;
import com.bytedance.android.live.liveinteract.multianchor.model.LinkmicPositionItem;
import com.bytedance.android.live.liveinteract.plantform.api.LinkAnchorApi;
import com.bytedance.android.live.liveinteract.plantform.api.LinkApi;
import com.bytedance.android.live.liveinteract.plantform.api.LinkAudienceApi;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4766ag;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4767ah;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.interact.model.C6062s;
import com.bytedance.android.livesdk.message.model.BidPaidLinkmicStatus;
import com.bytedance.android.livesdk.message.model.C9028x;
import com.bytedance.android.livesdk.message.model.C9029y;
import com.bytedance.android.livesdk.message.model.C9030z;
import com.bytedance.android.livesdk.message.model.LinkmicProfitMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.bytedance.live.datacontext.C13491f;
import com.p1594ss.ugc.live.sdk.message.data.IMessage;
import com.p1594ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.internal.functions.Functions;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p003X.AbstractC413392Xt;
import p003X.AbstractC413402Xu;
import p003X.AbstractC80293Hkt;
import p003X.AnonymousClass425;
import p003X.C100839PnV;
import p003X.C2K9;
import p003X.C2KA;
import p003X.C2KB;
import p003X.C2KC;
import p003X.C2WC;
import p003X.C3VF;
import p003X.C409882Kg;
import p003X.C422362nW;
import p003X.C77170Gbc;
import p003X.C77196Gc2;
import p003X.C77587GiL;
import p003X.C78278GtU;
import p003X.C78304Gtu;
import p003X.C78320GuA;
import p003X.C78483Gwn;
import p003X.C78487Gwr;
import p003X.C78498Gx2;
import p003X.C78499Gx3;
import p003X.C78500Gx4;
import p003X.C78529GxX;
import p003X.C78536Gxe;
import p003X.C78832H5u;
import p003X.C78999HCf;
import p003X.C79046HEa;
import p003X.C87308Kak;
import p003X.C88306Kqq;
import p003X.C88440Kt0;
import p003X.C99Y;
import p003X.IQV;
import p003X.LK1;
import p003X.QB4;
import p003X.RunnableC77374Geu;

/* renamed from: com.bytedance.android.live.liveinteract.chatroom.chatroom.vm.a */
/* loaded from: classes3.dex */
public final class C4378a extends ViewModel implements OnMessageListener {
    public static ChangeQuickRedirect LIZ;
    public static boolean LJJIJIIJIL;
    public static final C78320GuA LJJIJIL = new C78320GuA((byte) 0);
    public final C99Y LIZLLL;
    public final Long LJIIJJI;
    public final NextLiveData<Pair<Boolean, String>> LJIIL;
    public int LJIILIIL;
    public final NextLiveData<Integer> LJIILJJIL;
    public final NextLiveData<Pair<String, String>> LJIILL;
    public final NextLiveData<Integer> LJIILLIIL;
    public final NextLiveData<BidPaidLinkmicStatus> LJIIZILJ;
    public final NextLiveData<C6062s> LJIJ;
    public final NextLiveData<C9030z> LJIJI;
    public final NextLiveData<List<LinkmicPositionItem>> LJIJJ;
    public final NextLiveData<C9028x> LJIJJLI;
    public final NextLiveData<List<C9029y>> LJIL;
    public final NextLiveData<LinkmicProfitMessage.C8716c> LJJ;
    public final NextLiveData<Integer> LJJI;
    public final NextLiveData<Boolean> LJJIFFI;
    public final Room LJJII;
    public final CompositeDisposable LJJIII;
    public CompositeDisposable LJJIIJ;
    public boolean LJJIIJZLJL;
    public boolean LJJIIZ;
    public final Observer<KVData> LJJIIZI;
    public DataCenter LJJIJ;
    public final Runnable LJJIJIIJI;
    public final Observer<C9028x> LJJIJL;
    public final Observer<Integer> LJJIJLIJ;
    public final Observer<BidPaidLinkmicStatus> LJJIL;
    public final Observer<C6062s> LJJIZ;
    public final String LIZIZ = AnonymousClass425.LIZ().getString(2131585095);
    public final String LIZJ = AnonymousClass425.LIZ().getString(2131585458);

    /* renamed from: LJ */
    public List<Pair<String, Boolean>> f26297LJ = new ArrayList();
    public AtomicInteger LJFF = new AtomicInteger();
    public final NextLiveData<Boolean> LJI = new NextLiveData<>();
    public final NextLiveData<Integer> LJII = new NextLiveData<>();
    public final NextLiveData<Pair<String, ImageModel>> LJIIIIZZ = new NextLiveData<>();
    public final NextLiveData<String> LJIIIZ = new NextLiveData<>();
    public final NextLiveData<Pair<Integer, String>> LJIIJ = new NextLiveData<>();

    static {
        Covode.recordClassIndex(26461);
    }

    @JvmStatic
    public static final boolean LJIIZILJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, LIZ, true, 54);
        return proxy.isSupported ? ((Boolean) proxy.result).booleanValue() : LJJIJIL.LIZJ();
    }

    public final void LIZ(BidPaidLinkmicStatus bidPaidLinkmicStatus) {
        if (!PatchProxy.proxy(new Object[]{bidPaidLinkmicStatus}, this, LIZ, false, 15).isSupported && this.LJIIZILJ.getValue() != bidPaidLinkmicStatus) {
            this.LJIIZILJ.setValue(bidPaidLinkmicStatus);
        }
    }

    public final void LIZ(boolean z, String str) {
        C78999HCf mo15671LJ;
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), str}, this, LIZ, false, 29).isSupported && z) {
            C79046HEa LIZ2 = C79046HEa.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ2, "");
            if (!LIZ2.LIZLLL()) {
                return;
            }
            AbstractC4767ah LIZ3 = AbstractC4767ah.LIZIZ.LIZ();
            if (LIZ3 != null && (mo15671LJ = LIZ3.mo15671LJ()) != null) {
                mo15671LJ.LIZIZ("paid_change");
            }
            if (!TextUtils.isEmpty(str)) {
                C88440Kt0.LIZ(str);
            }
            AbstractC4767ah LIZ4 = AbstractC4767ah.LIZIZ.LIZ();
            if (LIZ4 == null) {
                return;
            }
            LIZ4.LJFF();
        }
    }

    public final void LJII() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 24).isSupported) {
            return;
        }
        this.LJIILJJIL.setValue(1);
    }

    public final void LJIIIIZZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 25).isSupported) {
            return;
        }
        this.LJIILJJIL.setValue(2);
    }

    public final boolean LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 16);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (C4284f.LJIIIIZZ.LIZ()) {
            C87308Kak<Boolean> c87308Kak = AbstractC80293Hkt.f6971Z;
            Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
            Boolean LIZ2 = c87308Kak.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ2, "");
            return LIZ2.booleanValue();
        } else if (this.LJIILJJIL.getValue() == null) {
            return false;
        } else {
            return true;
        }
    }

    public final boolean LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 17);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        Integer value = this.LJIILJJIL.getValue();
        if (value == null || value.intValue() != 1) {
            return false;
        }
        return true;
    }

    public final boolean LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 18);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!LIZJ() || !this.LJJIIJZLJL || !LJFF()) {
            return false;
        }
        return true;
    }

    /* renamed from: LJ */
    public final boolean m15744LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 19);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this.LJIIZILJ.getValue() != BidPaidLinkmicStatus.BidPaid_Wait) {
            return false;
        }
        return true;
    }

    public final boolean LJFF() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 21);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this.LJIIZILJ.getValue() != BidPaidLinkmicStatus.BidPaid_Bid) {
            return false;
        }
        return true;
    }

    public final boolean LJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 22);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this.LJIIZILJ.getValue() != BidPaidLinkmicStatus.BidPaid_Deal) {
            return false;
        }
        return true;
    }

    public final boolean LJIIL() {
        AbstractC413402Xu<Boolean> LJIILJJIL;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 46);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C5923dp LIZ2 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
        if (LIZ2 == null || (LJIILJJIL = LIZ2.LJIILJJIL()) == null || !LJIILJJIL.LIZIZ().booleanValue()) {
            return false;
        }
        return true;
    }

    public final long LJIILIIL() {
        Long l;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 47);
        if (proxy.isSupported) {
            return ((Long) proxy.result).longValue();
        }
        C6062s value = this.LJIJ.getValue();
        if (value != null && (l = value.LIZLLL) != null) {
            return l.longValue();
        }
        return 0L;
    }

    public final long LJIILJJIL() {
        Long l;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 48);
        if (proxy.isSupported) {
            return ((Long) proxy.result).longValue();
        }
        C6062s value = this.LJIJ.getValue();
        if (value != null && (l = value.LIZJ) != null) {
            return l.longValue();
        }
        return 0L;
    }

    public final long LJIILL() {
        Long l;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 49);
        if (proxy.isSupported) {
            return ((Long) proxy.result).longValue();
        }
        C6062s value = this.LJIJ.getValue();
        if (value != null && (l = value.LIZIZ) != null) {
            return l.longValue();
        }
        return 0L;
    }

    public final long LJIILLIIL() {
        Long l;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 50);
        if (proxy.isSupported) {
            return ((Long) proxy.result).longValue();
        }
        C9028x value = this.LJIJJLI.getValue();
        if (value != null && (l = value.f27960LJ) != null) {
            return l.longValue();
        }
        return 0L;
    }

    public final void LJIIIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 37).isSupported) {
            return;
        }
        if (this.LJJII == null) {
            ALogger.m15800e("LinkBidViewModel", "startBidPaidLinkMic error, room is null");
        } else {
            Intrinsics.checkNotNullExpressionValue(QB4.LIZ(((LinkAnchorApi) C88306Kqq.LIZ().LIZ(LinkAnchorApi.class)).startBidPaidLinkMic(this.LJJII.getRoomId()).compose(C100839PnV.LIZJ()).subscribe(new C78278GtU(this), C2KC.LIZIZ), this.LJJIII), "");
        }
    }

    public final void LJIIJ() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 42).isSupported && this.LJJIIJZLJL && !LJIIL()) {
            C88440Kt0.LIZ("你的竞拍出价已自动取消");
            Room room = this.LJJII;
            if (room != null) {
                ((LinkAudienceApi) C88306Kqq.LIZ().LIZ(LinkAudienceApi.class)).giveUpLinkPaid(room.getRoomId()).compose(C100839PnV.LIZJ()).subscribe(Functions.LIZIZ(), new C422362nW());
            }
        }
    }

    public final HashMap<String, String> LJIIJJI() {
        String str;
        Integer value;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 45);
        if (proxy.isSupported) {
            return (HashMap) proxy.result;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (LIZJ() && (value = this.LJII.getValue()) != null) {
            hashMap.put("recharge_price", String.valueOf(value.intValue()));
            hashMap.put("money", String.valueOf(value.intValue()));
        }
        if (LIZJ()) {
            str = "auction";
        } else {
            str = "normal";
        }
        hashMap.put("recharge_mode", str);
        return hashMap;
    }

    public final void LIZ() {
        Long l;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 14).isSupported) {
            return;
        }
        LIZ(BidPaidLinkmicStatus.BidPaid_Bid);
        this.LJIJJLI.setValue(null);
        C6062s value = this.LJIJ.getValue();
        if (value != null && (l = value.LIZIZ) != null) {
            long longValue = l.longValue();
            this.LIZLLL.LIZ();
            this.LIZLLL.LIZ((int) longValue);
        }
        C78536Gxe.LIZ().LJI();
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        AbstractC413392Xt<IMessageManager> LJIILLIIL;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 41).isSupported) {
            return;
        }
        AbstractC4767ah LIZ2 = AbstractC4767ah.LIZIZ.LIZ();
        if (LIZ2 != null) {
            LIZ2.LJJIFFI();
        }
        AbstractC4766ag LIZ3 = AbstractC4766ag.LIZ.LIZ();
        if (LIZ3 != null) {
            LIZ3.LJIJ();
        }
        super.onCleared();
        this.LJJIIZ = false;
        if (LJJIJIL.LIZJ()) {
            LJIIIIZZ();
        }
        this.LJJIII.dispose();
        this.LJJIIJ.dispose();
        this.LIZLLL.LIZ();
        DataCenter dataCenter = this.LJJIJ;
        if (dataCenter != null) {
            dataCenter.removeObserver("cmd_interact_link_window_change", this.LJJIIZI);
        }
        C13491f LIZ4 = IQV.LIZ(C5923dp.class);
        if (!(LIZ4 instanceof C5923dp)) {
            LIZ4 = null;
        }
        C5923dp c5923dp = (C5923dp) LIZ4;
        if (c5923dp != null && (LJIILLIIL = c5923dp.LJIILLIIL()) != null) {
            LJIILLIIL.LIZ(new LinkBidViewModel$onCleared$1(this));
        }
        this.LJIJJLI.removeObserver(this.LJJIJL);
        this.LJIILJJIL.removeObserver(this.LJJIJLIJ);
        this.LJIIZILJ.removeObserver(this.LJJIL);
        this.LJIJ.removeObserver(this.LJJIZ);
    }

    public C4378a() {
        Long l;
        Room room;
        AbstractC413392Xt<IMessageManager> LJIILLIIL;
        C2WC<Room> LIZ2;
        C3VF user;
        C99Y c99y = new C99Y();
        c99y.LIZJ = new LinkBidViewModel$$special$$inlined$apply$lambda$1(this);
        c99y.LIZLLL = new LinkBidViewModel$$special$$inlined$apply$lambda$2(this);
        c99y.LJI = new LinkBidViewModel$$special$$inlined$apply$lambda$3(this);
        c99y.f2933LJ = new LinkBidViewModel$$special$$inlined$apply$lambda$4(this);
        this.LIZLLL = c99y;
        IUserService iUserService = (IUserService) ServiceManager.getService(IUserService.class);
        if (iUserService != null && (user = iUserService.user()) != null) {
            l = Long.valueOf(user.LIZIZ());
        } else {
            l = null;
        }
        this.LJIIJJI = l;
        this.LJIIL = new NextLiveData<>();
        this.LJIILIIL = C78832H5u.LIZ;
        this.LJIILJJIL = new NextLiveData<>();
        this.LJIILL = new NextLiveData<>();
        this.LJIILLIIL = new NextLiveData<>();
        this.LJIIZILJ = new NextLiveData<>();
        this.LJIJ = new NextLiveData<>();
        this.LJIJI = new NextLiveData<>();
        this.LJIJJ = new NextLiveData<>();
        this.LJIJJLI = new NextLiveData<>();
        this.LJIL = new NextLiveData<>();
        this.LJJ = new NextLiveData<>();
        this.LJJI = new NextLiveData<>();
        this.LJJIFFI = new NextLiveData<>();
        C5923dp LIZ3 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
        if (LIZ3 != null && (LIZ2 = LIZ3.LIZ()) != null) {
            room = LIZ2.LIZ();
        } else {
            room = null;
        }
        this.LJJII = room;
        this.LJJIII = new CompositeDisposable();
        this.LJJIIJ = new CompositeDisposable();
        this.LJJIIZI = new C78304Gtu(this);
        this.LJJIJIIJI = new RunnableC77374Geu(this);
        this.LJJIJL = new C78499Gx3(this);
        this.LJJIJLIJ = new C78487Gwr(this);
        this.LJJIL = new C78498Gx2(this);
        this.LJJIZ = new C78500Gx4(this);
        C13491f LIZ4 = IQV.LIZ(C5923dp.class);
        C5923dp c5923dp = (C5923dp) (!(LIZ4 instanceof C5923dp) ? null : LIZ4);
        if (c5923dp != null && (LJIILLIIL = c5923dp.LJIILLIIL()) != null) {
            LJIILLIIL.LIZ(new LinkBidViewModel$1(this));
        }
        this.LJIJJLI.observeForever(this.LJJIJL);
        this.LJIILJJIL.observeForever(this.LJJIJLIJ);
        this.LJIIZILJ.observeForever(this.LJJIL);
        this.LJIJ.observeForever(this.LJJIZ);
    }

    public final String LIZ(int i) {
        String str;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 10);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        int i2 = i / 60;
        int i3 = i % 60;
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (i2 > 0) {
            str = i2 + "分钟";
        } else {
            str = str2;
        }
        sb.append(str);
        if (i3 > 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i3);
            sb2.append((char) 31186);
            str2 = sb2.toString();
        }
        sb.append(str2);
        return sb.toString();
    }

    @Override // com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        String str;
        BidPaidLinkmicStatus value;
        if (!PatchProxy.proxy(new Object[]{iMessage}, this, LIZ, false, 12).isSupported && (iMessage instanceof LinkmicProfitMessage)) {
            LK1.LIZ(0L, false, false, new LinkBidViewModel$onMessage$1(this, iMessage), 7, null);
            StringBuilder sb = new StringBuilder("message: ");
            sb.append(((LinkmicProfitMessage) iMessage).LIZ);
            sb.append(", status: ");
            NextLiveData<BidPaidLinkmicStatus> nextLiveData = this.LJIIZILJ;
            if (nextLiveData != null && (value = nextLiveData.getValue()) != null) {
                str = value.name();
            } else {
                str = null;
            }
            sb.append(str);
        }
    }

    public final void LIZIZ(int i, int i2) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 43).isSupported) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("scene", 4);
        JSONArray jSONArray = new JSONArray();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("key", 57);
            jSONObject.put("value", 1);
            jSONArray.put(jSONObject);
            hashMap.put("incremental_update", jSONArray);
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("StartPrice", i);
            jSONObject3.put("LinkDuration", i2);
            jSONObject2.put("57", jSONObject3);
            hashMap.put("incremental_update_content", jSONObject2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        CompositeDisposable compositeDisposable = this.LJJIII;
        Room room = this.LJJII;
        Intrinsics.checkNotNull(room);
        compositeDisposable.add(((LinkApi) C88306Kqq.LIZ().LIZ(LinkApi.class)).updateSettingV2(room.getId(), hashMap, 1).compose(C100839PnV.LIZJ()).subscribe(C77587GiL.LIZIZ, C2K9.LIZIZ));
    }

    public final void LIZ(int i, int i2) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 36).isSupported) {
            return;
        }
        if (this.LJJII == null) {
            ALogger.m15800e("LinkBidViewModel", "bidPrice error, room is null");
            return;
        }
        this.LJIIL.setValue(new Pair<>(Boolean.FALSE, "出价中..."));
        QB4.LIZ(((LinkAudienceApi) C88306Kqq.LIZ().LIZ(LinkAudienceApi.class)).sendBidPrice(this.LJJII.getRoomId(), i).compose(C100839PnV.LIZJ()).subscribe(new C78483Gwn(this, i2, i), new C77170Gbc<>(this)), this.LJJIII);
    }

    public final void LIZ(int i, Function0<Unit> function0) {
        long j;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), function0}, this, LIZ, false, 32).isSupported) {
            return;
        }
        LinkAnchorApi linkAnchorApi = (LinkAnchorApi) C88306Kqq.LIZ().LIZ(LinkAnchorApi.class);
        Room room = this.LJJII;
        if (room != null) {
            j = room.getRoomId();
        } else {
            j = 0;
        }
        QB4.LIZ(linkAnchorApi.bidPaidLinkMickTurnOff(j, i).compose(C100839PnV.LIZJ()).subscribe(new C77196Gc2(function0), C2KA.LIZIZ), this.LJJIII);
    }

    public final void LIZ(long j, long j2, long j3, long j4) {
        long j5;
        if (PatchProxy.proxy(new Object[]{new Long(j), new Long(j2), new Long(j3), new Long(j4)}, this, LIZ, false, 31).isSupported) {
            return;
        }
        LinkAnchorApi linkAnchorApi = (LinkAnchorApi) C88306Kqq.LIZ().LIZ(LinkAnchorApi.class);
        Room room = this.LJJII;
        if (room != null) {
            j5 = room.getRoomId();
        } else {
            j5 = 0;
        }
        QB4.LIZ(linkAnchorApi.bidPaidLinkMickTurnOn(j5, j, j2, j3, j4).compose(C100839PnV.LIZJ()).subscribe(new C78529GxX(this), C2KB.LIZIZ), this.LJJIII);
    }

    public static /* synthetic */ void LIZ(C4378a c4378a, int i, Function0 function0, int i2, Object obj) {
        if (PatchProxy.proxy(new Object[]{c4378a, Integer.valueOf(i), null, 2, null}, null, LIZ, true, 33).isSupported) {
            return;
        }
        c4378a.LIZ(i, (Function0<Unit>) null);
    }
}
