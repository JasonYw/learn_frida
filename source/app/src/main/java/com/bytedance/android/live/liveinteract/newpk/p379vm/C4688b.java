package com.bytedance.android.live.liveinteract.newpk.p379vm;

import android.os.SystemClock;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.api.LinkPKApi;
import com.bytedance.android.live.liveinteract.multianchor.model.AnchorLinkUser;
import com.bytedance.android.live.liveinteract.newpk.p379vm.p380a.C4687a;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.message.model.C8843eh;
import com.bytedance.android.livesdk.message.model.C8847el;
import com.bytedance.android.livesdk.message.model.C8874fl;
import com.bytedance.android.livesdk.message.model.LinkMicBattleInviteMessage;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.depend.model.live.linker.C9520ae;
import com.bytedance.android.livesdkapi.depend.model.live.linker.C9549v;
import com.bytedance.common.utility.DigestUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.p1594ss.ugc.live.sdk.message.data.IMessage;
import com.p1594ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import p003X.AbstractC426192th;
import p003X.C100839PnV;
import p003X.C106862S5w;
import p003X.C79407HRx;
import p003X.C79408HRy;
import p003X.C79503HVp;
import p003X.C79584HYs;
import p003X.C81289I2h;
import p003X.C88306Kqq;
import p003X.HNH;
import p003X.HNS;
import p003X.HP1;
import p003X.HS4;
import p003X.HST;
import p003X.HTY;
import p003X.QB4;

/* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.b */
/* loaded from: classes3.dex */
public final class C4688b extends PkDataContext implements OnMessageListener {
    public static ChangeQuickRedirect LIZ;
    public static final /* synthetic */ KProperty[] LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;

    /* renamed from: LJ */
    public boolean f26381LJ;
    public final C81289I2h LJJZZIII = HNS.LIZ(this, null, 1, null);
    public final C81289I2h LJL = HNS.LIZ(this, null, 1, null);
    public final C81289I2h LJLI = HNS.LIZ(this, null, 1, null);

    static {
        Covode.recordClassIndex(28632);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(C4688b.class, "pkAgainInviteEvent", "getPkAgainInviteEvent()Lcom/bytedance/live/datacontext/IEventMember;", 0);
        Reflection.property1(propertyReference1Impl);
        PropertyReference1Impl propertyReference1Impl2 = new PropertyReference1Impl(C4688b.class, "pkAgainRejectEvent", "getPkAgainRejectEvent()Lcom/bytedance/live/datacontext/IEventMember;", 0);
        Reflection.property1(propertyReference1Impl2);
        PropertyReference1Impl propertyReference1Impl3 = new PropertyReference1Impl(C4688b.class, "pkActivityInviteEvent", "getPkActivityInviteEvent()Lcom/bytedance/live/datacontext/IEventMember;", 0);
        Reflection.property1(propertyReference1Impl3);
        LIZIZ = new KProperty[]{propertyReference1Impl, propertyReference1Impl2, propertyReference1Impl3};
    }

    public final AbstractC426192th<Unit> LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (AbstractC426192th) (proxy.isSupported ? proxy.result : this.LJJZZIII.LIZ(this, LIZIZ[0]));
    }

    public final AbstractC426192th<Unit> LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return (AbstractC426192th) (proxy.isSupported ? proxy.result : this.LJL.LIZ(this, LIZIZ[1]));
    }

    public final AbstractC426192th<C4687a> LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return (AbstractC426192th) (proxy.isSupported ? proxy.result : this.LJLI.LIZ(this, LIZIZ[2]));
    }

    @Override // com.bytedance.android.live.liveinteract.newpk.p379vm.PkDataContext
    public final void LIZLLL() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported && !PatchProxy.proxy(new Object[]{this, (byte) 0, 0, 3, null}, null, LIZ, true, 8).isSupported) {
            LIZ(false, 0);
        }
    }

    /* renamed from: LJ */
    public final void m15722LJ() {
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 17).isSupported && this.LJII.LJJZZIII && this.LJII.LJL) {
            if (!this.LIZJ) {
                LIZ(this, 0, 1, null);
                this.LIZJ = true;
            }
            this.LJII.LJL = false;
            this.LJII.LJJZZIII = false;
        }
    }

    public final void LIZIZ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 11).isSupported) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        QB4.LIZ(((LinkPKApi) C88306Kqq.LIZ().LIZ(LinkPKApi.class)).battleReject(this.LJII.LIZLLL, i).compose(C100839PnV.LIZJ()).subscribe(new C79407HRx(currentTimeMillis), new C79408HRy<>(currentTimeMillis)), this.LJJLIIIJJI);
    }

    public final void LIZ(int i) {
        long j;
        String str;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 5).isSupported) {
            return;
        }
        this.LIZJ = true;
        long uptimeMillis = SystemClock.uptimeMillis();
        C79503HVp c79503HVp = this.LJJIIZI;
        if (c79503HVp != null) {
            j = c79503HVp.LJIIIZ;
        } else {
            j = 0;
        }
        SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_PK_API_TOKEN_ENABLE;
        String str2 = "";
        Intrinsics.checkNotNullExpressionValue(settingKey, str2);
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, str2);
        if (value.booleanValue()) {
            str = DigestUtils.md5Hex(String.valueOf(this.LJII.LIZLLL) + this.LJII.LJIIJJI + j + i);
        } else {
            str = str2;
        }
        if (this.LJII.LJLJJI.get(this.LJII.LJFF) != null) {
            str2 = this.LJII.LJLJJI.get(this.LJII.LJFF);
        }
        QB4.LIZ(((LinkPKApi) C88306Kqq.LIZ().LIZ(LinkPKApi.class)).openBattle(this.LJII.LIZLLL, this.LJII.LJIIJJI, this.LJII.LJIIL, j, "", i, str, "", str2).compose(C100839PnV.LIZJ()).subscribe(new HNH(uptimeMillis), new HP1<>(uptimeMillis)), this.LJJLIIIJJI);
    }

    @Override // com.bytedance.android.live.liveinteract.newpk.p379vm.PkDataContext, com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        List<AnchorLinkUser> list;
        C9520ae c9520ae;
        List<AnchorLinkUser> list2;
        if (PatchProxy.proxy(new Object[]{iMessage}, this, LIZ, false, 13).isSupported) {
            return;
        }
        super.onMessage(iMessage);
        if (iMessage == null) {
            return;
        }
        if (iMessage instanceof LinkMicBattleInviteMessage) {
            LinkMicBattleInviteMessage linkMicBattleInviteMessage = (LinkMicBattleInviteMessage) iMessage;
            if (!PatchProxy.proxy(new Object[]{linkMicBattleInviteMessage}, this, LIZ, false, 14).isSupported && linkMicBattleInviteMessage.LIZIZ == this.LJII.LIZLLL) {
                if (linkMicBattleInviteMessage.LIZ != LinkMicBattleInviteMessage.BattleInviteType.BattleInviteType_Again.ordinal() && linkMicBattleInviteMessage.LIZ != LinkMicBattleInviteMessage.BattleInviteType.BattleInviteType_Normal_Activity.ordinal()) {
                    return;
                }
                this.LJII.LJLJJI.put(this.LJII.LJFF, linkMicBattleInviteMessage.LJFF);
                int i = linkMicBattleInviteMessage.LIZ;
                if (i == LinkMicBattleInviteMessage.BattleInviteType.BattleInviteType_Again.ordinal()) {
                    LIZ().LIZ(Unit.INSTANCE);
                } else if (i == LinkMicBattleInviteMessage.BattleInviteType.BattleInviteType_Normal_Activity.ordinal()) {
                    LIZJ().LIZ(new C4687a(linkMicBattleInviteMessage.LJI));
                }
            }
        } else if (iMessage instanceof C8847el) {
            C8847el c8847el = (C8847el) iMessage;
            if (PatchProxy.proxy(new Object[]{c8847el}, this, LIZ, false, 15).isSupported || c8847el.LIZ != this.LJII.LIZLLL || !this.LJJJLIIL) {
                return;
            }
            LIZIZ().LIZ(Unit.INSTANCE);
        } else if (iMessage instanceof C8874fl) {
            C8874fl c8874fl = (C8874fl) iMessage;
            if (!PatchProxy.proxy(new Object[]{c8874fl}, this, LIZ, false, 16).isSupported && !this.LJII.LJIIIZ && this.LJII.LJJZ) {
                int i2 = c8874fl.LIZIZ;
                if (i2 != 6) {
                    if (i2 == 11 && (c9520ae = c8874fl.LJIILIIL) != null && (list2 = c9520ae.LIZLLL) != null && list2.size() == 2) {
                        this.LJII.LJJZZIII = true;
                        m15722LJ();
                        return;
                    }
                    return;
                }
                C9549v c9549v = c8874fl.LJIIIIZZ;
                if (c9549v != null && (list = c9549v.LIZJ) != null && list.size() == 2) {
                    this.LJII.LJJZZIII = true;
                    m15722LJ();
                }
            }
        } else if (!(iMessage instanceof C8843eh)) {
        } else {
            this.f26381LJ = ((C8843eh) iMessage).LJI;
        }
    }

    public final void LIZ(boolean z, int i) {
        long j;
        String str;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)}, this, LIZ, false, 7).isSupported) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (z && this.LJII.LJIIIZ) {
            C79584HYs.LIZ();
        }
        SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_PK_API_TOKEN_ENABLE;
        String str2 = "";
        Intrinsics.checkNotNullExpressionValue(settingKey, str2);
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, str2);
        if (value.booleanValue()) {
            StringBuilder sb = new StringBuilder();
            sb.append(String.valueOf(this.LJII.LIZLLL));
            if (z) {
                str = "1";
            } else {
                str = "0" + this.LJII.LJIJJLI + i;
            }
            sb.append(str);
            str2 = DigestUtils.md5Hex(sb.toString());
        }
        C79503HVp c79503HVp = this.LJJIIZI;
        if (c79503HVp != null) {
            j = c79503HVp.LJIIIZ;
        } else {
            j = 0;
        }
        QB4.LIZ(((LinkPKApi) C88306Kqq.LIZ().LIZ(LinkPKApi.class)).finish(this.LJII.LIZLLL, this.LJII.LJIJJLI, z ? 1 : 0, this.LJII.LJIL, j, i, str2).compose(C100839PnV.LIZJ()).subscribe(new HTY(this, currentTimeMillis, z, i), new HST<>(this, currentTimeMillis, z)), this.LJJLIIIJJI);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4688b(DataCenter dataCenter, long j, long j2) {
        super(dataCenter, j, j2);
        C106862S5w.LIZ(dataCenter);
        IMessageManager iMessageManager = this.LJJLIIIJL;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(MessageType.LINK_MIC_BATTLE_INVITE.LIZ(), this);
        }
        IMessageManager iMessageManager2 = this.LJJLIIIJL;
        if (iMessageManager2 != null) {
            iMessageManager2.addMessageListener(MessageType.LINK_MIC_BATTLE_REJECT.LIZ(), this);
        }
        IMessageManager iMessageManager3 = this.LJJLIIIJL;
        if (iMessageManager3 != null) {
            iMessageManager3.addMessageListener(MessageType.LINKER.LIZ(), this);
        }
        QB4.LIZ(LLLLIIIILLL().subscribe(new HS4(this)), this.LJJLIIIJJI);
        if (!this.LJII.LJIIIZ && !this.LJII.LJJZ) {
            LIZ(LinkMicBattleInviteMessage.BattleInviteType.BattleInviteType_Unknown.ordinal());
        }
    }

    public static /* synthetic */ void LIZ(C4688b c4688b, int i, int i2, Object obj) {
        if (PatchProxy.proxy(new Object[]{c4688b, 0, 1, null}, null, LIZ, true, 6).isSupported) {
            return;
        }
        c4688b.LIZ(0);
    }
}
