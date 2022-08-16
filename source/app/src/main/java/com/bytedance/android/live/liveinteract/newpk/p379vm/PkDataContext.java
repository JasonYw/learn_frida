package com.bytedance.android.live.liveinteract.newpk.p379vm;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.linkpk.AbstractC4255c;
import com.bytedance.android.live.linkpk.AbstractC4256d;
import com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.api.data.C4281b;
import com.bytedance.android.live.liveinteract.newpk.p379vm.AbstractC4690e;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.log.model.C8657j;
import com.bytedance.android.livesdk.message.model.C8843eh;
import com.bytedance.android.livesdk.message.model.C8958ir;
import com.bytedance.android.livesdk.message.model.LinkMicBattleFinishMessage;
import com.bytedance.android.livesdk.message.model.LinkMicBattleInviteMessage;
import com.bytedance.android.livesdk.message.model.p726a.C8718a;
import com.bytedance.android.livesdk.message.model.p726a.C8723g;
import com.bytedance.android.livesdk.message.model.p726a.C8725i;
import com.bytedance.android.livesdk.message.model.p726a.C8726j;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.depend.model.live.BattleOperationalPlay;
import com.bytedance.android.livesdkapi.depend.model.live.BattleUserInfo;
import com.bytedance.android.livesdkapi.depend.model.live.C9558q;
import com.bytedance.android.livesdkapi.depend.model.live.C9560s;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.TeamTask;
import com.bytedance.android.livesdkapi.depend.model.live.TeamTaskItemCardInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.live.datacontext.C13491f;
import com.p1594ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import p003X.AbstractC413392Xt;
import p003X.AbstractC413402Xu;
import p003X.AbstractC426192th;
import p003X.AbstractC449173pf;
import p003X.C106862S5w;
import p003X.C2IN;
import p003X.C2WC;
import p003X.C409882Kg;
import p003X.C449593qL;
import p003X.C451803tu;
import p003X.C4574547f;
import p003X.C79117HGt;
import p003X.C79443HTh;
import p003X.C79447HTl;
import p003X.C79460HTy;
import p003X.C79480HUs;
import p003X.C79503HVp;
import p003X.C81289I2h;
import p003X.C81909IQd;
import p003X.HNS;
import p003X.HSB;
import p003X.HSO;
import p003X.HTZ;
import p003X.HXB;
import p003X.QB4;

/* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkDataContext */
/* loaded from: classes3.dex */
public abstract class PkDataContext extends C13491f implements OnMessageListener {
    public static ChangeQuickRedirect LJFF;
    public static final /* synthetic */ KProperty[] LJI;
    public static final C79447HTl LJJZ = new C79447HTl((byte) 0);
    public C79503HVp LJJIIZI;
    public long LJJIJIIJI;
    public Map<Long, ? extends BattleUserInfo> LJJIJIIJIL;
    public BattleOperationalPlay LJJIJIL;
    public C9560s LJJIJL;
    public C9560s LJJIJLIJ;
    public long LJJIZ;
    public long LJJJ;
    public boolean LJJJI;
    public long LJJJJ;
    public TeamTask LJJJJI;
    public float LJJJJIZL;
    public TeamTaskItemCardInfo LJJJJJ;
    public boolean LJJJJJL;
    public boolean LJJJJL;
    public boolean LJJJJLI;
    public boolean LJJJJLL;
    public boolean LJJJJZ;
    public boolean LJJJLIIL;
    public String LJJJLL;
    public Map<Long, ? extends C9558q> LJJJLZIJ;
    public boolean LJJL;
    public final C79480HUs LJJLIIIIJ;
    public final IMessageManager LJJLIIIJL;
    public final Room LJJLIIIJLJLI;
    public final boolean LJJLIIIJLLLLLLLZ;
    public final HSO LJJLIIJ;
    public final C79443HTh LJJLIL;
    public final DataCenter LJJLJ;
    public final long LJJLJLI;
    public final long LJJLL;
    public final LinkCrossRoomDataHolder LJII = LinkCrossRoomDataHolder.LJII();
    public final MutableLiveData<AbstractC4256d> LJIIIIZZ = new MutableLiveData<>();
    public final LiveData<AbstractC4256d> LJIIIZ = this.LJIIIIZZ;
    public final MutableLiveData<Long> LJIIJ = new MutableLiveData<>();
    public final LiveData<Long> LJIIJJI = this.LJIIJ;
    public final MutableLiveData<C8718a> LJIIL = new MutableLiveData<>();
    public final LiveData<C8718a> LJIILIIL = this.LJIIL;
    public final MutableLiveData<C8718a> LJIILJJIL = new MutableLiveData<>();
    public final LiveData<C8718a> LJIILL = this.LJIILJJIL;
    public final MutableLiveData<List<C8726j.C8727a>> LJIILLIIL = new MutableLiveData<>();
    public final LiveData<List<C8726j.C8727a>> LJIIZILJ = this.LJIILLIIL;
    public final MutableLiveData<List<C8726j.C8727a>> LJIJ = new MutableLiveData<>();
    public final LiveData<List<C8726j.C8727a>> LJIJI = this.LJIJ;
    public final MutableLiveData<AbstractC4255c> LJIJJ = new MutableLiveData<>();
    public final LiveData<AbstractC4255c> LJIJJLI = this.LJIJJ;
    public final MutableLiveData<Long> LJIL = new MutableLiveData<>();
    public final LiveData<Long> LJJ = this.LJIL;
    public final C81289I2h LIZ = C81909IQd.LIZ(this, 2, null, 2, null);
    public final C81289I2h LIZIZ = C81909IQd.LIZ(this, Boolean.FALSE, null, 2, null);
    public final C81289I2h LIZJ = C81909IQd.LIZ(this, 0L, null, 2, null);
    public final C81289I2h LIZLLL = C81909IQd.LIZ(this, 0L, null, 2, null);

    /* renamed from: LJ */
    public final C81289I2h f26380LJ = C81909IQd.LIZ(this, Boolean.FALSE, null, 2, null);
    public final C81289I2h LJJZZIII = C81909IQd.LIZ(this, 0L, null, 2, null);
    public MutableLiveData<User> LJJI = new MutableLiveData<>();
    public MutableLiveData<Boolean> LJJIFFI = new MutableLiveData<>();
    public MutableLiveData<Boolean> LJJII = new MutableLiveData<>();
    public MutableLiveData<Boolean> LJJIII = new MutableLiveData<>();
    public int LJJIIJ = LinkMicBattleInviteMessage.BattleInviteType.BattleInviteType_Again.ordinal();
    public final MutableLiveData<C4281b> LJJIIJZLJL = new MutableLiveData<>();
    public final MutableLiveData<C8723g> LJJIIZ = new MutableLiveData<>();
    public final C81289I2h LJL = HNS.LIZ(this, null, 1, null);
    public final C81289I2h LJLI = HNS.LIZ(this, null, 1, null);
    public final C81289I2h LJLIIIL = HNS.LIZ(this, null, 1, null);
    public final C81289I2h LJLIIL = HNS.LIZ(this, null, 1, null);
    public long LJJIJ = 180;
    public int LJJIL = 300;
    public boolean LJJJIL = true;
    public int LJJJJZI = 1;
    public BattleType LJJJZ = BattleType.NORMAL_PK;
    public boolean LJLIL = true;
    public final HTZ LJJLI = new HTZ();
    public final HXB LJJLIIIJ = new HXB(this.LJIIIZ, this.LJIIJJI, this.LJIJJLI, this.LJJIIJZLJL);
    public final C79460HTy LJJLIIIJILLIZJL = new C79460HTy(this.LJIIIZ, this.LJJIIJZLJL, this.LJJIIZ);
    public final CompositeDisposable LJJLIIIJJI = new CompositeDisposable();
    public final C5923dp LJJLIIIJJIZ = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0, 3, null);

    /* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.PkDataContext$BattleType */
    /* loaded from: classes3.dex */
    public enum BattleType {
        NORMAL_PK,
        AGAIN_PK,
        PLAYBOE3ROUND_PK,
        ACTIVITY_PK;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(28520);
        }

        public static BattleType valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (BattleType) (proxy.isSupported ? proxy.result : Enum.valueOf(BattleType.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static BattleType[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (BattleType[]) (proxy.isSupported ? proxy.result : values().clone());
        }
    }

    static {
        Covode.recordClassIndex(28510);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(PkDataContext.class, "videoShowMode", "getVideoShowMode()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl);
        PropertyReference1Impl propertyReference1Impl2 = new PropertyReference1Impl(PkDataContext.class, "hasAudienceJoin4Pk", "getHasAudienceJoin4Pk()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl2);
        PropertyReference1Impl propertyReference1Impl3 = new PropertyReference1Impl(PkDataContext.class, "hasAudienceOnlineTime4Pk", "getHasAudienceOnlineTime4Pk()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl3);
        PropertyReference1Impl propertyReference1Impl4 = new PropertyReference1Impl(PkDataContext.class, "hasAudienceOnlineTime", "getHasAudienceOnlineTime()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl4);
        PropertyReference1Impl propertyReference1Impl5 = new PropertyReference1Impl(PkDataContext.class, "hasAudienceJoin4Penalty", "getHasAudienceJoin4Penalty()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl5);
        PropertyReference1Impl propertyReference1Impl6 = new PropertyReference1Impl(PkDataContext.class, "hasAudienceOnlineTime4Penalty", "getHasAudienceOnlineTime4Penalty()Lcom/bytedance/live/datacontext/IMutableNonNull;", 0);
        Reflection.property1(propertyReference1Impl6);
        PropertyReference1Impl propertyReference1Impl7 = new PropertyReference1Impl(PkDataContext.class, "resetPkEvent", "getResetPkEvent()Lcom/bytedance/live/datacontext/IEventMember;", 0);
        Reflection.property1(propertyReference1Impl7);
        PropertyReference1Impl propertyReference1Impl8 = new PropertyReference1Impl(PkDataContext.class, "pkScoreForceUpdateEvent", "getPkScoreForceUpdateEvent()Lcom/bytedance/live/datacontext/IEventMember;", 0);
        Reflection.property1(propertyReference1Impl8);
        PropertyReference1Impl propertyReference1Impl9 = new PropertyReference1Impl(PkDataContext.class, "showOperationalPlayInviteDialogEvent", "getShowOperationalPlayInviteDialogEvent()Lcom/bytedance/live/datacontext/IEventMember;", 0);
        Reflection.property1(propertyReference1Impl9);
        PropertyReference1Impl propertyReference1Impl10 = new PropertyReference1Impl(PkDataContext.class, "resetOperationalPlayInviteCountDownEvent", "getResetOperationalPlayInviteCountDownEvent()Lcom/bytedance/live/datacontext/IEventMember;", 0);
        Reflection.property1(propertyReference1Impl10);
        LJI = new KProperty[]{propertyReference1Impl, propertyReference1Impl2, propertyReference1Impl3, propertyReference1Impl4, propertyReference1Impl5, propertyReference1Impl6, propertyReference1Impl7, propertyReference1Impl8, propertyReference1Impl9, propertyReference1Impl10};
    }

    public abstract void LIZLLL();

    public final C2WC<Integer> LJFF() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJFF, false, 1);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LIZ.LIZ(this, LJI[0]));
    }

    public final C2WC<Boolean> LJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJFF, false, 2);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LIZIZ.LIZ(this, LJI[1]));
    }

    public final C2WC<Long> LJII() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJFF, false, 3);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LIZJ.LIZ(this, LJI[2]));
    }

    public final C2WC<Long> LJIIIIZZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJFF, false, 4);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LIZLLL.LIZ(this, LJI[3]));
    }

    public final C2WC<Boolean> LJIIIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJFF, false, 5);
        return (C2WC) (proxy.isSupported ? proxy.result : this.f26380LJ.LIZ(this, LJI[4]));
    }

    public final C2WC<Long> LJIIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJFF, false, 6);
        return (C2WC) (proxy.isSupported ? proxy.result : this.LJJZZIII.LIZ(this, LJI[5]));
    }

    public final AbstractC426192th<Boolean> LJIIJJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJFF, false, 11);
        return (AbstractC426192th) (proxy.isSupported ? proxy.result : this.LJL.LIZ(this, LJI[6]));
    }

    public final AbstractC426192th<Boolean> LJIIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJFF, false, 12);
        return (AbstractC426192th) (proxy.isSupported ? proxy.result : this.LJLI.LIZ(this, LJI[7]));
    }

    public final AbstractC426192th<Integer> LJIILIIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJFF, false, 13);
        return (AbstractC426192th) (proxy.isSupported ? proxy.result : this.LJLIIIL.LIZ(this, LJI[8]));
    }

    public final AbstractC426192th<Boolean> LJIILJJIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LJFF, false, 14);
        return (AbstractC426192th) (proxy.isSupported ? proxy.result : this.LJLIIL.LIZ(this, LJI[9]));
    }

    public final void LIZJ(int i) {
        this.LJJIJIIJI = i;
    }

    public final void LIZ(BattleType battleType) {
        if (PatchProxy.proxy(new Object[]{battleType}, this, LJFF, false, 24).isSupported) {
            return;
        }
        C106862S5w.LIZ(battleType);
        this.LJJJZ = battleType;
    }

    public final void LIZ(LinkMicBattleFinishMessage linkMicBattleFinishMessage) {
        long j;
        IMessageManager iMessageManager;
        if (PatchProxy.proxy(new Object[]{linkMicBattleFinishMessage}, this, LJFF, false, 22).isSupported) {
            return;
        }
        C106862S5w.LIZ(linkMicBattleFinishMessage);
        String str = linkMicBattleFinishMessage.LJI;
        if (str != null && str.length() != 0) {
            Room room = this.LJJLIIIJLJLI;
            if (room != null) {
                j = room.getRoomId();
            } else {
                j = 0;
            }
            C8958ir LIZ = C451803tu.LIZ(j, linkMicBattleFinishMessage.LJI);
            if (LIZ != null && (iMessageManager = this.LJJLIIIJL) != null) {
                iMessageManager.insertMessage(LIZ, true);
            }
        }
    }

    private void LIZ(C8725i c8725i) {
        int ordinal;
        if (PatchProxy.proxy(new Object[]{c8725i}, this, LJFF, false, 21).isSupported) {
            return;
        }
        C106862S5w.LIZ(c8725i);
        C79503HVp c79503HVp = this.LJJIIZI;
        if (c79503HVp != null) {
            ordinal = c79503HVp.LJJI;
        } else {
            ordinal = LinkMicBattleInviteMessage.BattleInviteType.BattleInviteType_Again.ordinal();
        }
        this.LJJIIJ = ordinal;
        this.LJJIIZI = c8725i;
        this.LJII.LJIILIIL = c8725i.LIZLLL;
        this.LJII.LJIIJJI = c8725i.LIZJ;
        this.LJII.LJIIL = c8725i.f6831LJ;
        this.LJII.f26249LJ = c8725i.LJFF;
        this.LJII.LJIJJLI = (int) c8725i.LJI;
        this.LJJIJL = c8725i.LJIIL;
        this.LJJIJLIJ = c8725i.LJIILIIL;
        this.LJJIJ = c8725i.LJIILJJIL;
        this.LJJJLL = c8725i.LJIIJ;
        if (c8725i.LJIIIZ == 0 && !this.LJJJJL) {
            this.LJJIL = c8725i.LIZJ;
        }
    }

    public final void LIZ(C8843eh c8843eh) {
        AbstractC4256d abstractC4256d;
        C2WC<Boolean> LLJIJIL;
        C2WC<Boolean> LLJI;
        if (PatchProxy.proxy(new Object[]{c8843eh}, this, LJFF, false, 20).isSupported) {
            return;
        }
        C106862S5w.LIZ(c8843eh);
        if (c8843eh.LJFF != null && c8843eh.LJFF.LIZ == BattleOperationalPlay.OperationalPlayType.OperationalPlayType_MultipleMatches3.ordinal()) {
            this.LJJJJL = true;
            this.LJJJJZI = (int) c8843eh.LJFF.LIZIZ.LIZIZ;
            LIZ(BattleType.PLAYBOE3ROUND_PK);
        } else {
            this.LJJJJL = false;
            this.LJJJJZI = 1;
        }
        this.LJJLIIIIJ.m23739LJ();
        this.LJJL = false;
        this.LJJIJIL = c8843eh.LJFF;
        C8725i c8725i = c8843eh.LIZ;
        if (c8725i != null) {
            LIZ(c8725i);
        }
        LIZJ(c8843eh.LIZLLL);
        this.LJJLJ.put("data_pk_background_skin_type", Integer.valueOf(c8843eh.LIZLLL));
        Map<Long, BattleUserInfo> map = c8843eh.f27892LJ;
        if (map != null) {
            this.LJJIJIIJIL = map;
            this.LJII.LJJJJI = true;
        }
        LIZ("start pk by message", String.valueOf(c8843eh.getMessageId()));
        C5923dp c5923dp = this.LJJLIIIJJIZ;
        if (c5923dp != null && (LLJI = c5923dp.LLJI()) != null) {
            LLJI.LIZ(Boolean.FALSE);
        }
        C5923dp c5923dp2 = this.LJJLIIIJJIZ;
        if (c5923dp2 != null && (LLJIJIL = c5923dp2.LLJIJIL()) != null) {
            LLJIJIL.LIZ(Boolean.FALSE);
        }
        this.LJJIFFI.postValue(Boolean.FALSE);
        this.LJJJLIIL = false;
        LinkCrossRoomDataHolder linkCrossRoomDataHolder = this.LJII;
        linkCrossRoomDataHolder.LJJL = false;
        this.LJJJJLI = false;
        this.LJJJJI = null;
        this.LJJJI = false;
        linkCrossRoomDataHolder.LJIIJ();
        LJIIJJI().LIZ(Boolean.TRUE);
        LJI().LIZ(Boolean.FALSE);
        LJII().LIZ(0L);
        LJIIIZ().LIZ(Boolean.FALSE);
        LJIIJ().LIZ(0L);
        LJIIIIZZ().LIZ(0L);
        this.LJJLJ.put("cmd_pk_state_change", new HSB(5));
        C79117HGt.LJIIIIZZ.LIZ(this.LJJJZ.ordinal());
        if (this.LJJLIIIJLLLLLLLZ) {
            C79117HGt.LJIIIIZZ.LIZ("live_pk_score_bar_load");
        }
        HSO hso = this.LJJLIIJ;
        LiveData<AbstractC4256d> liveData = this.LJIIIZ;
        if (liveData == null || (abstractC4256d = liveData.getValue()) == null) {
            abstractC4256d = AbstractC4256d.C4257a.LIZIZ;
        }
        hso.LIZ(abstractC4256d, this);
        this.LJJLIL.LIZ();
        this.LJJLIL.LIZ(AbstractC4690e.C4696f.LIZ);
        if (this.LJLIL) {
            HSO hso2 = this.LJJLIIJ;
            if (hso2 != null) {
                hso2.LIZ();
            }
            this.LJLIL = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x0254, code lost:
        if (r1 != null) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x024f  */
    @Override // com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMessage(com.p1594ss.ugc.live.sdk.message.data.IMessage r18) {
        /*
            Method dump skipped, instructions count: 936
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.newpk.p379vm.PkDataContext.onMessage(com.ss.ugc.live.sdk.message.data.IMessage):void");
    }

    public final void LIZ(String str, String str2) {
        String str3;
        long j;
        if (PatchProxy.proxy(new Object[]{str, str2}, this, LJFF, false, 25).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, str2);
        if (this.LJJLIIIJLLLLLLLZ) {
            if (this.LJII.LJIIIZ) {
                str3 = "inviter";
            } else {
                str3 = "invitee";
            }
        } else {
            str3 = "audience";
        }
        HashMap hashMap = new HashMap();
        hashMap.put("event_name", str);
        hashMap.put("role", str3);
        hashMap.put("channel_id", Long.valueOf(this.LJJLJLI));
        Room room = this.LJJLIIIJLJLI;
        if (room != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        hashMap.put("room_id", Long.valueOf(j));
        hashMap.put("guest_uid", Long.valueOf(this.LJJLL));
        hashMap.put("start_time", Long.valueOf(this.LJII.LJIILIIL));
        hashMap.put("duration", Integer.valueOf(this.LJII.LJIIJJI));
        hashMap.put("pk_id", Long.valueOf(this.LJII.f26249LJ));
        hashMap.put("link_mic_id", this.LJII.LJIILL);
        hashMap.put("guest_link_mic_id", this.LJII.LJIIIIZZ);
        hashMap.put("extra", str2);
        C2IN.LIZIZ().LIZ("ttlive_pk", hashMap);
    }

    public PkDataContext(DataCenter dataCenter, long j, long j2) {
        IMessageManager iMessageManager;
        boolean z;
        AbstractC413402Xu<Boolean> LJIILJJIL;
        Boolean LIZIZ;
        C2WC<Room> LIZ;
        AbstractC413392Xt<IMessageManager> LJIILLIIL;
        C106862S5w.LIZ(dataCenter);
        this.LJJLJ = dataCenter;
        this.LJJLJLI = j;
        this.LJJLL = j2;
        Room room = null;
        this.LJJLIIIIJ = new C79480HUs(this.LJIIIZ, this.LJJIIJZLJL, this.LJJIIZ, this.LJJLJLI);
        C5923dp LIZ2 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
        if (LIZ2 != null && (LJIILLIIL = LIZ2.LJIILLIIL()) != null) {
            iMessageManager = LJIILLIIL.LIZIZ();
        } else {
            iMessageManager = null;
        }
        this.LJJLIIIJL = iMessageManager;
        C5923dp LIZ3 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
        if (LIZ3 != null && (LIZ = LIZ3.LIZ()) != null) {
            room = LIZ.LIZ();
        }
        this.LJJLIIIJLJLI = room;
        C5923dp LIZ4 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
        if (LIZ4 != null && (LJIILJJIL = LIZ4.LJIILJJIL()) != null && (LIZIZ = LJIILJJIL.LIZIZ()) != null) {
            z = LIZIZ.booleanValue();
        } else {
            z = false;
        }
        this.LJJLIIIJLLLLLLLZ = z;
        this.LJJLIIJ = new HSO(this.LJJLIIIJLLLLLLLZ, this.LJJLIIIJLJLI, this.LJII);
        this.LJJLIL = new C79443HTh(new PkDataContext$stateMachine$1(this));
        IMessageManager iMessageManager2 = this.LJJLIIIJL;
        if (iMessageManager2 != null) {
            iMessageManager2.addMessageListener(MessageType.LINK_MIC_BATTLE.LIZ(), this);
        }
        IMessageManager iMessageManager3 = this.LJJLIIIJL;
        if (iMessageManager3 != null) {
            iMessageManager3.addMessageListener(MessageType.LINK_MIC_BATTLE_FINISH.LIZ(), this);
        }
        IMessageManager iMessageManager4 = this.LJJLIIIJL;
        if (iMessageManager4 != null) {
            iMessageManager4.addMessageListener(MessageType.LINK_MIC_BATTLE_FRONT_RANK.LIZ(), this);
        }
        QB4.LIZ(LLLLIIIILLL().subscribe(new Action() { // from class: com.bytedance.android.live.liveinteract.newpk.vm.PkDataContext.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(28511);
            }

            @Override // io.reactivex.functions.Action
            public final void run() {
                if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                    return;
                }
                IMessageManager iMessageManager5 = PkDataContext.this.LJJLIIIJL;
                if (iMessageManager5 != null) {
                    iMessageManager5.removeMessageListener(PkDataContext.this);
                }
                HTZ htz = PkDataContext.this.LJJLI;
                if (!PatchProxy.proxy(new Object[0], htz, HTZ.LIZ, false, 3).isSupported) {
                    htz.onCleared();
                }
                C79480HUs c79480HUs = PkDataContext.this.LJJLIIIIJ;
                if (!PatchProxy.proxy(new Object[0], c79480HUs, C79480HUs.LIZ, false, 7).isSupported) {
                    c79480HUs.onCleared();
                }
                HXB hxb = PkDataContext.this.LJJLIIIJ;
                if (!PatchProxy.proxy(new Object[0], hxb, HXB.LIZ, false, 6).isSupported) {
                    hxb.onCleared();
                }
                C79460HTy c79460HTy = PkDataContext.this.LJJLIIIJILLIZJL;
                if (!PatchProxy.proxy(new Object[0], c79460HTy, C79460HTy.LIZ, false, 4).isSupported) {
                    c79460HTy.onCleared();
                }
                PkDataContext.this.LJJLIIIJJI.dispose();
            }
        }), this.LJJLIIIJJI);
        QB4.LIZ(this.LJJLI.LIZ().LIZIZ().subscribe(new Consumer<AbstractC449173pf<? extends Long>>() { // from class: com.bytedance.android.live.liveinteract.newpk.vm.PkDataContext.2
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(28512);
            }

            @Override // io.reactivex.functions.Consumer
            public final /* synthetic */ void accept(AbstractC449173pf<? extends Long> abstractC449173pf) {
                String str;
                AbstractC449173pf<? extends Long> abstractC449173pf2 = abstractC449173pf;
                if (!PatchProxy.proxy(new Object[]{abstractC449173pf2}, this, LIZ, false, 1).isSupported) {
                    Intrinsics.checkNotNullExpressionValue(abstractC449173pf2, "");
                    Long l = (Long) C449593qL.LIZ((AbstractC449173pf<? extends Object>) abstractC449173pf2);
                    if (l != null) {
                        long longValue = l.longValue();
                        PkDataContext.this.LJIIJ.setValue(Long.valueOf(longValue));
                        if (longValue == 0) {
                            AbstractC4256d value = PkDataContext.this.LJIIIZ.getValue();
                            if (Intrinsics.areEqual(value, AbstractC4256d.C4260d.LIZIZ)) {
                                PkDataContext.this.LIZLLL();
                            } else if (Intrinsics.areEqual(value, AbstractC4256d.C4259c.LIZIZ)) {
                                PkDataContext.this.LJJLIL.LIZ(AbstractC4690e.C4692b.LIZ);
                                HSO hso = PkDataContext.this.LJJLIIJ;
                                if (hso != null) {
                                    PkDataContext pkDataContext = PkDataContext.this;
                                    if (!PatchProxy.proxy(new Object[]{pkDataContext}, hso, HSO.LIZ, false, 6).isSupported && hso.LIZJ) {
                                        C8657j c8657j = new C8657j();
                                        if (hso.f6814LJ.LJIIIZ) {
                                            c8657j.LIZIZ(hso.LIZLLL.getOwner().getId());
                                            c8657j.LIZJ(hso.f6814LJ.LJFF);
                                        } else {
                                            c8657j.LIZIZ(hso.f6814LJ.LJFF);
                                            c8657j.LIZJ(hso.LIZLLL.getOwner().getId());
                                        }
                                        if (LinkCrossRoomDataHolder.LJII().LJIJJLI == 0) {
                                            c8657j.LIZ(LinkCrossRoomDataHolder.LJII().LJII);
                                        }
                                        HashMap hashMap = new HashMap();
                                        if (pkDataContext != null) {
                                            if (pkDataContext.LJIIIZ().LIZ().booleanValue()) {
                                                str = "1";
                                            } else {
                                                str = "0";
                                            }
                                            hashMap.put("is_with_audience", str);
                                            long longValue2 = pkDataContext.LJIIJ().LIZ().longValue();
                                            if (longValue2 == 0 && pkDataContext.LJIIIZ().LIZ().booleanValue()) {
                                                longValue2 = (System.currentTimeMillis() - pkDataContext.LJIIIIZZ().LIZ().longValue()) / 1000;
                                            }
                                            hashMap.put("audience_time", String.valueOf(longValue2));
                                        }
                                        C4574547f LIZ5 = C4574547f.LIZ();
                                        c8657j.LIZLLL("time_out");
                                        c8657j.LIZ(String.valueOf((System.currentTimeMillis() - pkDataContext.LJJJ) / 1000));
                                        LIZ5.LIZ("punish_end", hashMap, c8657j, LinkCrossRoomDataHolder.LJII().LJIIIZ(), Room.class);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }), this.LJJLIIIJJI);
        QB4.LIZ(this.LJJLIIIIJ.LIZ().LIZIZ().subscribe(new Consumer<AbstractC449173pf<? extends C8718a>>() { // from class: com.bytedance.android.live.liveinteract.newpk.vm.PkDataContext.3
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(28513);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Consumer
            public final /* synthetic */ void accept(AbstractC449173pf<? extends C8718a> abstractC449173pf) {
                AbstractC449173pf<? extends C8718a> abstractC449173pf2 = abstractC449173pf;
                if (!PatchProxy.proxy(new Object[]{abstractC449173pf2}, this, LIZ, false, 1).isSupported) {
                    MutableLiveData<C8718a> mutableLiveData = PkDataContext.this.LJIIL;
                    Intrinsics.checkNotNullExpressionValue(abstractC449173pf2, "");
                    mutableLiveData.setValue(C449593qL.LIZ((AbstractC449173pf<? extends Object>) abstractC449173pf2));
                }
            }
        }), this.LJJLIIIJJI);
        QB4.LIZ(this.LJJLIIIIJ.LIZIZ().LIZIZ().subscribe(new Consumer<AbstractC449173pf<? extends C8718a>>() { // from class: com.bytedance.android.live.liveinteract.newpk.vm.PkDataContext.4
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(28514);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Consumer
            public final /* synthetic */ void accept(AbstractC449173pf<? extends C8718a> abstractC449173pf) {
                AbstractC449173pf<? extends C8718a> abstractC449173pf2 = abstractC449173pf;
                if (!PatchProxy.proxy(new Object[]{abstractC449173pf2}, this, LIZ, false, 1).isSupported) {
                    MutableLiveData<C8718a> mutableLiveData = PkDataContext.this.LJIILJJIL;
                    Intrinsics.checkNotNullExpressionValue(abstractC449173pf2, "");
                    mutableLiveData.setValue(C449593qL.LIZ((AbstractC449173pf<? extends Object>) abstractC449173pf2));
                }
            }
        }), this.LJJLIIIJJI);
        QB4.LIZ(this.LJJLIIIIJ.LIZJ().LIZIZ().subscribe(new Consumer<AbstractC449173pf<? extends Boolean>>() { // from class: com.bytedance.android.live.liveinteract.newpk.vm.PkDataContext.5
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(28515);
            }

            @Override // io.reactivex.functions.Consumer
            public final /* synthetic */ void accept(AbstractC449173pf<? extends Boolean> abstractC449173pf) {
                AbstractC449173pf<? extends Boolean> abstractC449173pf2 = abstractC449173pf;
                boolean z2 = true;
                if (!PatchProxy.proxy(new Object[]{abstractC449173pf2}, this, LIZ, false, 1).isSupported) {
                    PkDataContext pkDataContext = PkDataContext.this;
                    Intrinsics.checkNotNullExpressionValue(abstractC449173pf2, "");
                    Boolean bool = (Boolean) C449593qL.LIZ((AbstractC449173pf<? extends Object>) abstractC449173pf2);
                    if (bool != null) {
                        z2 = bool.booleanValue();
                    }
                    pkDataContext.LJJJIL = z2;
                }
            }
        }), this.LJJLIIIJJI);
        QB4.LIZ(this.LJJLIIIJ.LIZ().LIZIZ().subscribe(new Consumer<AbstractC449173pf<? extends List<? extends C8726j.C8727a>>>() { // from class: com.bytedance.android.live.liveinteract.newpk.vm.PkDataContext.6
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(28516);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Consumer
            public final /* synthetic */ void accept(AbstractC449173pf<? extends List<? extends C8726j.C8727a>> abstractC449173pf) {
                AbstractC449173pf<? extends List<? extends C8726j.C8727a>> abstractC449173pf2 = abstractC449173pf;
                if (!PatchProxy.proxy(new Object[]{abstractC449173pf2}, this, LIZ, false, 1).isSupported) {
                    MutableLiveData<List<C8726j.C8727a>> mutableLiveData = PkDataContext.this.LJIILLIIL;
                    Intrinsics.checkNotNullExpressionValue(abstractC449173pf2, "");
                    mutableLiveData.setValue(C449593qL.LIZ((AbstractC449173pf<? extends Object>) abstractC449173pf2));
                }
            }
        }), this.LJJLIIIJJI);
        QB4.LIZ(this.LJJLIIIJ.LIZIZ().LIZIZ().subscribe(new Consumer<AbstractC449173pf<? extends List<? extends C8726j.C8727a>>>() { // from class: com.bytedance.android.live.liveinteract.newpk.vm.PkDataContext.7
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(28517);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Consumer
            public final /* synthetic */ void accept(AbstractC449173pf<? extends List<? extends C8726j.C8727a>> abstractC449173pf) {
                AbstractC449173pf<? extends List<? extends C8726j.C8727a>> abstractC449173pf2 = abstractC449173pf;
                if (!PatchProxy.proxy(new Object[]{abstractC449173pf2}, this, LIZ, false, 1).isSupported) {
                    MutableLiveData<List<C8726j.C8727a>> mutableLiveData = PkDataContext.this.LJIJ;
                    Intrinsics.checkNotNullExpressionValue(abstractC449173pf2, "");
                    mutableLiveData.setValue(C449593qL.LIZ((AbstractC449173pf<? extends Object>) abstractC449173pf2));
                }
            }
        }), this.LJJLIIIJJI);
        QB4.LIZ(this.LJJLIIIJILLIZJL.LIZ().LIZIZ().subscribe(new Consumer<AbstractC449173pf<? extends AbstractC4255c>>() { // from class: com.bytedance.android.live.liveinteract.newpk.vm.PkDataContext.8
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(28518);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Consumer
            public final /* synthetic */ void accept(AbstractC449173pf<? extends AbstractC4255c> abstractC449173pf) {
                String str;
                AbstractC449173pf<? extends AbstractC4255c> abstractC449173pf2 = abstractC449173pf;
                if (!PatchProxy.proxy(new Object[]{abstractC449173pf2}, this, LIZ, false, 1).isSupported) {
                    MutableLiveData<AbstractC4255c> mutableLiveData = PkDataContext.this.LJIJJ;
                    Intrinsics.checkNotNullExpressionValue(abstractC449173pf2, "");
                    mutableLiveData.setValue(C449593qL.LIZ((AbstractC449173pf<? extends Object>) abstractC449173pf2));
                    PkDataContext pkDataContext = PkDataContext.this;
                    AbstractC4255c abstractC4255c = (AbstractC4255c) C449593qL.LIZ((AbstractC449173pf<? extends Object>) abstractC449173pf2);
                    if (abstractC4255c == null || (str = abstractC4255c.LIZ) == null) {
                        str = "";
                    }
                    pkDataContext.LIZ("pk result", str);
                }
            }
        }), this.LJJLIIIJJI);
        QB4.LIZ(this.LJJLIIIJILLIZJL.LIZIZ().LIZIZ().subscribe(new Consumer<AbstractC449173pf<? extends Long>>() { // from class: com.bytedance.android.live.liveinteract.newpk.vm.PkDataContext.9
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(28519);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Consumer
            public final /* synthetic */ void accept(AbstractC449173pf<? extends Long> abstractC449173pf) {
                AbstractC449173pf<? extends Long> abstractC449173pf2 = abstractC449173pf;
                if (!PatchProxy.proxy(new Object[]{abstractC449173pf2}, this, LIZ, false, 1).isSupported) {
                    MutableLiveData<Long> mutableLiveData = PkDataContext.this.LJIL;
                    Intrinsics.checkNotNullExpressionValue(abstractC449173pf2, "");
                    mutableLiveData.setValue(C449593qL.LIZ((AbstractC449173pf<? extends Object>) abstractC449173pf2));
                }
            }
        }), this.LJJLIIIJJI);
    }
}
