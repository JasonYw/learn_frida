package com.bytedance.android.live.liveinteract.multianchor.p368f;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.multianchor.model.AnchorLinkUser;
import com.bytedance.android.live.liveinteract.plantform.api.LinkAnchorApi;
import com.bytedance.android.live.liveinteract.plantform.api.LinkApi;
import com.bytedance.android.live.liveinteract.plantform.p385a.c$b;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.interact.model.MultiPKModeInfo;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.message.linker.C8684d;
import com.bytedance.android.livesdk.message.model.C8874fl;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.linker.C9519ad;
import com.bytedance.android.livesdkapi.depend.model.live.linker.C9520ae;
import com.bytedance.android.livesdkapi.depend.model.live.linker.C9549v;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.bytedance.p1300mt.protector.impl.GsonProtectorUtils;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import com.p1594ss.android.ugc.aweme.lego.experiment.LegoCommitOptExperiment;
import com.p1594ss.ugc.live.sdk.message.data.IMessage;
import com.p1594ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import io.reactivex.disposables.CompositeDisposable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import p003X.C100839PnV;
import p003X.C106862S5w;
import p003X.C1W3;
import p003X.C1W4;
import p003X.C515486Yk;
import p003X.C515496Yl;
import p003X.C79313HOh;
import p003X.C79347HPp;
import p003X.C88306Kqq;
import p003X.HMP;
import p003X.HO6;
import p003X.HO7;
import p003X.HOB;
import p003X.HPD;
import p003X.HQG;
import p003X.HQL;
import p003X.KM9;

/* renamed from: com.bytedance.android.live.liveinteract.multianchor.f.a */
/* loaded from: classes3.dex */
public final class C4520a implements HQG, OnMessageListener {
    public static ChangeQuickRedirect LIZ;
    public MultiPKModeInfo LIZIZ;
    public Long LJIIIIZZ;
    public long LJIIIZ;
    public long LJIIJ;
    public DataCenter LJIIJJI;
    public final int LJIIL;
    public IMessageManager LJIIZILJ;
    public boolean LJIJ;
    public Room LJIJI;
    public final ArrayList<AnchorLinkUser> LIZJ = new ArrayList<>();
    public final ArrayList<AnchorLinkUser> LIZLLL = new ArrayList<>();
    public final CopyOnWriteArrayList<User> LJIILIIL = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<User> LJIILJJIL = new CopyOnWriteArrayList<>();

    /* renamed from: LJ */
    public final ArrayList<AnchorLinkUser> f26341LJ = new ArrayList<>();
    public final ArrayList<AnchorLinkUser> LJIILL = new ArrayList<>();
    public final CompositeDisposable LJIILLIIL = new CompositeDisposable();
    public final ArrayList<c$b> LJFF = new ArrayList<>();
    public final NextLiveData<C8684d> LJI = new NextLiveData<>();
    public final NextLiveData<Boolean> LJII = new NextLiveData<>();

    static {
        Covode.recordClassIndex(27999);
    }

    @Override // p003X.HQG
    public final List<AnchorLinkUser> LIZLLL() {
        return this.LIZJ;
    }

    /* renamed from: LJ */
    public final List<AnchorLinkUser> m15728LJ() {
        return this.LIZLLL;
    }

    public final List<User> LJIIIIZZ() {
        return this.LJIILIIL;
    }

    public final List<User> LJIIIZ() {
        return this.LJIILJJIL;
    }

    public final List<AnchorLinkUser> LJIIJ() {
        return this.f26341LJ;
    }

    public final void LIZ(Long l) {
        if (PatchProxy.proxy(new Object[]{l}, this, LIZ, false, 2).isSupported) {
            return;
        }
        this.LJIIIIZZ = l;
        Iterator<c$b> it = this.LJFF.iterator();
        while (it.hasNext()) {
            it.next().LIZ(l != null ? l.longValue() : 0L);
        }
    }

    public final void LIZ(MultiPKModeInfo multiPKModeInfo) {
        if (multiPKModeInfo == null) {
            return;
        }
        MultiPKModeInfo multiPKModeInfo2 = this.LIZIZ;
        if (multiPKModeInfo2 == null) {
            this.LIZIZ = multiPKModeInfo;
            return;
        }
        if (multiPKModeInfo.version < multiPKModeInfo2.version) {
            multiPKModeInfo = multiPKModeInfo2;
        }
        this.LIZIZ = multiPKModeInfo;
    }

    public final void LIZ(User user) {
        if (PatchProxy.proxy(new Object[]{user}, this, LIZ, false, 16).isSupported) {
            return;
        }
        C106862S5w.LIZ(user);
        Iterator<User> it = this.LJIILIIL.iterator();
        while (it.hasNext()) {
            User next = it.next();
            if (!TextUtils.isEmpty(user.getSecUid())) {
                Intrinsics.checkNotNullExpressionValue(next, "");
                if (TextUtils.equals(next.getSecUid(), user.getSecUid())) {
                    return;
                }
            }
            if (user.getId() != 0) {
                Intrinsics.checkNotNullExpressionValue(next, "");
                if (next.getId() == user.getId()) {
                    return;
                }
            }
        }
        this.LJIILIIL.add(user);
        ALogger.m15797i("ttlive_anchor_link_users", "scene=" + this.LJIIL + " addInvitee " + user);
        Iterator<c$b> it2 = this.LJFF.iterator();
        while (it2.hasNext()) {
            c$b next2 = it2.next();
            if (next2 != null) {
                next2.LIZIZ(this.LJIIL, this.LJIILIIL);
            }
        }
    }

    public final long LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return ((Long) proxy.result).longValue();
        }
        return LinkCrossRoomDataHolder.LJII().mo15779LJ();
    }

    @Override // p003X.HQG
    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        IMessageManager iMessageManager = this.LJIIZILJ;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(MessageType.LINKER.LIZ(), this);
        }
        IMessageManager iMessageManager2 = this.LJIIZILJ;
        if (iMessageManager2 != null) {
            iMessageManager2.addMessageListener(MessageType.PIX_ACTIVITY_MESSAGE.LIZ(), this);
        }
    }

    public final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        IMessageManager iMessageManager = this.LJIIZILJ;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        this.LJIILLIIL.dispose();
        this.LJFF.clear();
        this.LIZJ.clear();
        this.LIZLLL.clear();
        this.f26341LJ.clear();
        this.LJIILIIL.clear();
        this.LJIILJJIL.clear();
    }

    public final void LJIIJJI() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 23).isSupported) {
            return;
        }
        this.f26341LJ.clear();
        this.LJIILJJIL.clear();
        this.LIZJ.clear();
        this.LJIILIIL.clear();
    }

    public final int LJIIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 25);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (!this.LIZJ.isEmpty()) {
            LinkCrossRoomDataHolder.LJII().LJJJJZI = this.LIZJ.size();
        } else {
            LinkCrossRoomDataHolder.LJII().LJJJJZI = 1;
        }
        return LinkCrossRoomDataHolder.LJII().LJJJJZI;
    }

    public final void LJFF() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported) {
            return;
        }
        this.LIZLLL.clear();
        this.LIZJ.clear();
        this.f26341LJ.clear();
        Iterator<c$b> it = this.LJFF.iterator();
        while (it.hasNext()) {
            c$b next = it.next();
            next.LIZ(this.LJIIL, this.LIZLLL, 0);
            next.LIZ(this.LJIIL, this.LIZJ);
            next.LIZJ(this.LJIIL, this.f26341LJ);
        }
    }

    public final boolean LJIILIIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 26);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!this.LJIJ || this.LJIIL != 7 || C79347HPp.LIZ() || LIZ() != 0) {
            return false;
        }
        SettingKey<Boolean> settingKey = LiveConfigSettingKeys.MULTI_ANCHOR_LINK_LIST_CONSUME_OPT_ENABLE;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (!value.booleanValue()) {
            return false;
        }
        return true;
    }

    @Override // p003X.HQG
    public final void LJI() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 11).isSupported) {
            return;
        }
        ALogger.m15800e("ttlive_anchor_link_users", "onEnterBackground channelId=" + LinkCrossRoomDataHolder.LJII().LIZLLL);
        HMP hmp = new HMP();
        LinkCrossRoomDataHolder LJII = LinkCrossRoomDataHolder.LJII();
        if (LJII.LIZLLL == 0) {
            return;
        }
        hmp.LJIIIIZZ = 100101;
        hmp.f6763LJ = String.valueOf(((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ());
        hmp.LJI = LJII.LIZIZ();
        hmp.LIZIZ = "0";
        hmp.LIZJ = "0";
        hmp.LIZLLL = "0";
        this.LJIILLIIL.add(((LinkApi) C88306Kqq.LIZ().LIZ(LinkApi.class)).sendSignalV3(LJII.LIZLLL, GsonProtectorUtils.toJson(KM9.LIZ(), hmp), null, this.LJIIL).compose(C100839PnV.LIZJ()).subscribe(C1W3.LIZ, C515486Yk.LIZIZ));
    }

    @Override // p003X.HQG
    public final void LJII() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported) {
            return;
        }
        ALogger.m15800e("ttlive_anchor_link_users", "onEnterForeground channelId=" + LinkCrossRoomDataHolder.LJII().LIZLLL);
        HMP hmp = new HMP();
        LinkCrossRoomDataHolder LJII = LinkCrossRoomDataHolder.LJII();
        if (LJII.LIZLLL == 0) {
            return;
        }
        hmp.LJIIIIZZ = 100102;
        hmp.f6763LJ = String.valueOf(((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ());
        hmp.LJI = LJII.LIZIZ();
        hmp.LIZIZ = "0";
        hmp.LIZJ = "0";
        hmp.LIZLLL = "0";
        this.LJIILLIIL.add(((LinkApi) C88306Kqq.LIZ().LIZ(LinkApi.class)).sendSignalV3(LJII.LIZLLL, GsonProtectorUtils.toJson(KM9.LIZ(), hmp), null, this.LJIIL).compose(C100839PnV.LIZJ()).subscribe(C1W4.LIZ, C515496Yl.LIZIZ));
    }

    @Override // p003X.HQG
    public final void LIZ(c$b c_b) {
        if (PatchProxy.proxy(new Object[]{c_b}, this, LIZ, false, 8).isSupported) {
            return;
        }
        C106862S5w.LIZ(c_b);
        this.LJFF.add(c_b);
    }

    public final void LIZLLL(User user) {
        if (PatchProxy.proxy(new Object[]{user}, this, LIZ, false, 22).isSupported) {
            return;
        }
        C106862S5w.LIZ(user);
        this.LJIILJJIL.remove(user);
        Iterator<c$b> it = this.LJFF.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    public final AnchorLinkUser LIZ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 13);
        if (proxy.isSupported) {
            return (AnchorLinkUser) proxy.result;
        }
        Iterator<AnchorLinkUser> it = this.LIZJ.iterator();
        while (it.hasNext()) {
            AnchorLinkUser next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            if (TextUtils.equals(str, next.LIZIZ())) {
                return next;
            }
        }
        Iterator<AnchorLinkUser> it2 = this.LIZLLL.iterator();
        while (it2.hasNext()) {
            AnchorLinkUser next2 = it2.next();
            Intrinsics.checkNotNullExpressionValue(next2, "");
            if (TextUtils.equals(str, next2.LIZIZ())) {
                return next2;
            }
        }
        return null;
    }

    public final void LIZIZ(User user) {
        if (PatchProxy.proxy(new Object[]{user}, this, LIZ, false, 17).isSupported) {
            return;
        }
        C106862S5w.LIZ(user);
        this.LJIILIIL.remove(user);
        Iterator<c$b> it = this.LJFF.iterator();
        while (it.hasNext()) {
            c$b next = it.next();
            if (next != null) {
                next.LIZIZ(this.LJIIL, this.LJIILIIL);
            }
        }
    }

    public final void LIZJ(User user) {
        if (PatchProxy.proxy(new Object[]{user}, this, LIZ, false, 21).isSupported) {
            return;
        }
        C106862S5w.LIZ(user);
        Iterator<User> it = this.LJIILJJIL.iterator();
        while (it.hasNext()) {
            User next = it.next();
            if (!TextUtils.isEmpty(user.getSecUid())) {
                Intrinsics.checkNotNullExpressionValue(next, "");
                if (TextUtils.equals(next.getSecUid(), user.getSecUid())) {
                    return;
                }
            }
            if (user.getId() != 0) {
                Intrinsics.checkNotNullExpressionValue(next, "");
                if (next.getId() == user.getId()) {
                    return;
                }
            }
        }
        this.LJIILJJIL.add(user);
        Iterator<c$b> it2 = this.LJFF.iterator();
        while (it2.hasNext()) {
            it2.next();
        }
    }

    private final void LIZ(List<? extends AnchorLinkUser> list) {
        List<AnchorLinkUser> arrayList;
        Long l;
        Long l2;
        if (PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 6).isSupported) {
            return;
        }
        this.LIZJ.clear();
        if (list != null) {
            this.LIZJ.addAll(list);
        }
        Iterator<c$b> it = this.LJFF.iterator();
        while (it.hasNext()) {
            it.next().LIZ(this.LJIIL, this.LIZJ);
        }
        ArrayList<AnchorLinkUser> arrayList2 = this.LIZJ;
        ArrayList<AnchorLinkUser> arrayList3 = this.f26341LJ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{arrayList2, arrayList3}, this, LIZ, false, 7);
        if (proxy.isSupported) {
            arrayList = (List) proxy.result;
        } else {
            arrayList = new ArrayList(arrayList2);
            for (AnchorLinkUser anchorLinkUser : arrayList3) {
                User LIZ2 = anchorLinkUser.LIZ();
                if (LIZ2 != null && Long.valueOf(LIZ2.getId()) != null) {
                    if (!arrayList.isEmpty()) {
                        for (AnchorLinkUser anchorLinkUser2 : arrayList) {
                            User user = anchorLinkUser2.LIZIZ;
                            if (user != null) {
                                l = Long.valueOf(user.getId());
                            } else {
                                l = null;
                            }
                            User LIZ3 = anchorLinkUser.LIZ();
                            if (LIZ3 != null) {
                                l2 = Long.valueOf(LIZ3.getId());
                            } else {
                                l2 = null;
                            }
                            if (Intrinsics.areEqual(l, l2)) {
                                break;
                            }
                        }
                    }
                    arrayList.add(anchorLinkUser);
                }
            }
        }
        this.f26341LJ.clear();
        this.f26341LJ.addAll(arrayList);
        Iterator<c$b> it2 = this.LJFF.iterator();
        while (it2.hasNext()) {
            it2.next().LIZJ(this.LJIIL, this.f26341LJ);
        }
    }

    @Override // p003X.HQG
    public final void LIZIZ(c$b c_b) {
        if (PatchProxy.proxy(new Object[]{c_b}, this, LIZ, false, 9).isSupported) {
            return;
        }
        ArrayList<c$b> arrayList = this.LJFF;
        if (arrayList != null) {
            TypeIntrinsics.asMutableCollection(arrayList).remove(c_b);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
    }

    public final void LIZIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 18).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        Iterator<User> it = this.LJIILIIL.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            User next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            if (TextUtils.equals(next.getSecUid(), str)) {
                this.LJIILIIL.remove(next);
                break;
            }
        }
        Iterator<c$b> it2 = this.LJFF.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ(this.LJIIL, this.LJIILIIL);
        }
    }

    @Override // com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        String str;
        Long l;
        List<AnchorLinkUser> list;
        List<AnchorLinkUser> list2;
        if (!PatchProxy.proxy(new Object[]{iMessage}, this, LIZ, false, 5).isSupported && iMessage != null && (iMessage instanceof C8874fl)) {
            if (this.LJIIL == 7) {
                C8874fl c8874fl = (C8874fl) iMessage;
                if (c8874fl.LIZLLL != 2 && c8874fl.LIZLLL != 7) {
                    return;
                }
            }
            C8874fl c8874fl2 = (C8874fl) iMessage;
            if (c8874fl2.LIZLLL != this.LJIIL) {
                return;
            }
            if (this.LJIJ && c8874fl2.LIZJ != LIZ() && !PatchProxy.proxy(new Object[]{c8874fl2}, this, LIZ, false, 27).isSupported && (c8874fl2.LIZIZ == 6 || c8874fl2.LIZIZ == 7 || c8874fl2.LIZIZ == 11 || c8874fl2.LIZIZ == 10)) {
                if (LIZ() != 0 && c8874fl2.LIZJ != 0) {
                    HOB hob = HQL.LJI;
                    long LIZ2 = LIZ();
                    if (!PatchProxy.proxy(new Object[]{c8874fl2, new Long(LIZ2)}, hob, HOB.LIZ, false, 1).isSupported) {
                        C106862S5w.LIZ(c8874fl2);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.put("msg_id", Long.valueOf(c8874fl2.getMessageId()));
                        linkedHashMap.put("msg_scene", Integer.valueOf(c8874fl2.LIZLLL));
                        linkedHashMap.put("msg_linker_id", Long.valueOf(c8874fl2.LIZJ));
                        linkedHashMap.put("msg_type", Integer.valueOf(c8874fl2.LIZIZ));
                        linkedHashMap.put("local_channel_Id", Long.valueOf(LIZ2));
                        hob.LIZ("list_msg_channel_id_diff_from_local", linkedHashMap);
                    }
                } else if (LIZ() == 0) {
                    if (!C79347HPp.LIZ() && !C79347HPp.LIZIZ()) {
                        if (c8874fl2.LIZJ == this.LJIIIZ) {
                            HOB hob2 = HQL.LJI;
                            long LIZ3 = LIZ();
                            long j = this.LJIIJ;
                            if (!PatchProxy.proxy(new Object[]{c8874fl2, new Long(LIZ3), new Long(j)}, hob2, HOB.LIZ, false, 3).isSupported) {
                                C106862S5w.LIZ(c8874fl2);
                                long currentTimeMillis = System.currentTimeMillis() - j;
                                if (currentTimeMillis > LegoCommitOptExperiment.BOOT_FINISH_DELAY_TIME && currentTimeMillis < 3600000) {
                                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                    linkedHashMap2.put("msg_id", Long.valueOf(c8874fl2.getMessageId()));
                                    linkedHashMap2.put("msg_scene", Integer.valueOf(c8874fl2.LIZLLL));
                                    linkedHashMap2.put("msg_linker_id", Long.valueOf(c8874fl2.LIZJ));
                                    linkedHashMap2.put("msg_type", Integer.valueOf(c8874fl2.LIZIZ));
                                    linkedHashMap2.put("local_channel_Id", Long.valueOf(LIZ3));
                                    linkedHashMap2.put("gap_time", Long.valueOf(currentTimeMillis));
                                    hob2.LIZ("receive_list_msg_when_not_link", linkedHashMap2);
                                }
                            }
                        }
                    } else {
                        HOB hob3 = HQL.LJI;
                        long LIZ4 = LIZ();
                        if (!PatchProxy.proxy(new Object[]{c8874fl2, new Long(LIZ4)}, hob3, HOB.LIZ, false, 2).isSupported) {
                            C106862S5w.LIZ(c8874fl2);
                            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                            linkedHashMap3.put("msg_id", Long.valueOf(c8874fl2.getMessageId()));
                            linkedHashMap3.put("msg_scene", Integer.valueOf(c8874fl2.LIZLLL));
                            linkedHashMap3.put("msg_linker_id", Long.valueOf(c8874fl2.LIZJ));
                            linkedHashMap3.put("msg_type", Integer.valueOf(c8874fl2.LIZIZ));
                            linkedHashMap3.put("local_channel_Id", Long.valueOf(LIZ4));
                            hob3.LIZ("invalid_channel_id_during_link", linkedHashMap3);
                        }
                    }
                }
            }
            int i = c8874fl2.LIZIZ;
            List<AnchorLinkUser> list3 = null;
            r3 = null;
            String str2 = null;
            List<AnchorLinkUser> list4 = null;
            if (i != 6) {
                if (i != 7) {
                    if (i != 10) {
                        if (i == 11) {
                            C9520ae c9520ae = c8874fl2.LJIILIIL;
                            StringBuilder sb = new StringBuilder("receive LINKER_LINKED_CHANGE ");
                            sb.append(C79347HPp.LIZ(c8874fl2));
                            sb.append(" list=");
                            if (c9520ae != null && (list2 = c9520ae.LIZLLL) != null) {
                                str2 = C79347HPp.LIZ(list2);
                            }
                            sb.append(str2);
                            sb.append(LoggerUtil.BLANK_TAG);
                            sb.append(HPD.LIZJ.LIZ());
                            ALogger.m15795w("ttlive_anchor_link_users", sb.toString());
                            this.LIZJ.clear();
                            if (c9520ae != null && (list = c9520ae.LIZLLL) != null) {
                                this.LIZJ.addAll(list);
                            }
                            ArrayList<AnchorLinkUser> arrayList = this.LIZJ;
                            if (arrayList.size() > 1) {
                                CollectionsKt__MutableCollectionsJVMKt.sortWith(arrayList, new Comparator<T>() { // from class: X.1jk
                                    public static ChangeQuickRedirect LIZ;

                                    static {
                                        Covode.recordClassIndex(28004);
                                    }

                                    @Override // java.util.Comparator
                                    public final int compare(T t, T t2) {
                                        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{t, t2}, this, LIZ, false, 1);
                                        if (proxy.isSupported) {
                                            return ((Integer) proxy.result).intValue();
                                        }
                                        return ComparisonsKt__ComparisonsKt.compareValues(Long.valueOf(((AnchorLinkUser) t).LIZJ), Long.valueOf(((AnchorLinkUser) t2).LIZJ));
                                    }
                                });
                            }
                            Iterator<c$b> it = this.LJFF.iterator();
                            while (it.hasNext()) {
                                it.next().LIZ(this.LJIIL, this.LIZJ);
                            }
                            if (this.LJIJ) {
                                LIZ(4, "receive_link_message_11");
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    ALogger.m15795w("ttlive_anchor_link_users", "receive LINKER_WAITING_CHANGE " + C79347HPp.LIZ(c8874fl2) + LoggerUtil.BLANK_TAG + HPD.LIZJ.LIZ());
                    if (this.LJIJ) {
                        LIZ(4, "receive_link_message_10");
                        return;
                    }
                    return;
                }
                StringBuilder sb2 = new StringBuilder("receive LINKER_LEAVE ");
                sb2.append(C79347HPp.LIZ(c8874fl2));
                sb2.append(" uid=");
                C9519ad c9519ad = c8874fl2.LJIIIZ;
                if (c9519ad != null) {
                    l = Long.valueOf(c9519ad.LIZJ);
                } else {
                    l = null;
                }
                sb2.append(l);
                sb2.append(LoggerUtil.BLANK_TAG);
                sb2.append(HPD.LIZJ.LIZ());
                ALogger.m15795w("ttlive_anchor_link_users", sb2.toString());
                this.LJIILL.clear();
                this.LJIILL.addAll(this.LIZJ);
                if (this.LJIJ) {
                    if (LJIILIIL()) {
                        ALogger.m15800e("ttlive_anchor_link_users", "intercept LINKER_LEAVE queryLinkList");
                    } else {
                        LIZ(4, "receive_link_message_7");
                    }
                }
                if (!this.LJIJ) {
                    SettingKey<Boolean> settingKey = LiveConfigSettingKeys.MULTI_ANCHOR_AUDIENCE_INTERCEPT_REQUEST_LIST_WHEN_LINKER_LEAVE;
                    Intrinsics.checkNotNullExpressionValue(settingKey, "");
                    Boolean value = settingKey.getValue();
                    Intrinsics.checkNotNullExpressionValue(value, "");
                    if (value.booleanValue()) {
                        C9519ad c9519ad2 = c8874fl2.LJIIIZ;
                        if (c9519ad2 != null) {
                            list4 = c9519ad2.LIZLLL;
                        }
                        LIZ(list4);
                        return;
                    }
                    LIZ(4, "receive_link_message_7");
                    return;
                }
                return;
            }
            C79313HOh c79313HOh = C79313HOh.f6779LJ;
            if (!PatchProxy.proxy(new Object[]{c8874fl2}, c79313HOh, C79313HOh.LIZLLL, false, 11).isSupported) {
                C106862S5w.LIZ(c8874fl2);
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                linkedHashMap4.put("msg_id", Long.valueOf(c8874fl2.getMessageId()));
                linkedHashMap4.put("msg_scene", Integer.valueOf(c8874fl2.LIZLLL));
                linkedHashMap4.put("msg_linker_id", Long.valueOf(c8874fl2.LIZJ));
                C9549v c9549v = c8874fl2.LJIIIIZZ;
                if (c9549v != null) {
                    linkedHashMap4.put("enter_uid", Long.valueOf(c9549v.LIZLLL));
                    List<AnchorLinkUser> list5 = c9549v.LIZJ;
                    if (list5 == null || (str = C79347HPp.LIZ(list5)) == null) {
                        str = "null";
                    }
                    linkedHashMap4.put("list_user", str);
                }
                c79313HOh.LIZ("receive_linker_enter_msg", linkedHashMap4);
            }
            C9549v c9549v2 = c8874fl2.LJIIIIZZ;
            if (c9549v2 != null) {
                list3 = c9549v2.LIZJ;
            }
            LIZ(list3);
        }
    }

    public final void LIZ(long j) {
        if (PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZ, false, 19).isSupported) {
            return;
        }
        Iterator<User> it = this.LJIILIIL.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            User next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            if (next.getId() == j) {
                this.LJIILIIL.remove(next);
                break;
            }
        }
        Iterator<c$b> it2 = this.LJFF.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ(this.LJIIL, this.LJIILIIL);
        }
    }

    public C4520a(DataCenter dataCenter, int i) {
        C106862S5w.LIZ(dataCenter);
        this.LJIIJJI = dataCenter;
        this.LJIIL = i;
        LinkCrossRoomDataHolder.LJII().mo15779LJ();
        this.LJIIZILJ = (IMessageManager) this.LJIIJJI.get("data_message_manager");
        Object obj = this.LJIIJJI.get("data_is_anchor", (String) Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(obj, "");
        this.LJIJ = ((Boolean) obj).booleanValue();
        this.LJIJI = (Room) this.LJIIJJI.get("data_room", (String) null);
    }

    public final AnchorLinkUser LIZ(long j, String str) {
        User user;
        User user2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j), str}, this, LIZ, false, 24);
        if (proxy.isSupported) {
            return (AnchorLinkUser) proxy.result;
        }
        Iterator<AnchorLinkUser> it = this.LIZJ.iterator();
        while (true) {
            User user3 = null;
            if (it.hasNext()) {
                AnchorLinkUser next = it.next();
                if (!TextUtils.isEmpty(str)) {
                    Intrinsics.checkNotNullExpressionValue(next, "");
                    if (TextUtils.equals(str, next.LIZIZ())) {
                        return next;
                    }
                }
                if (j != 0) {
                    if (next != null) {
                        user3 = next.LIZ();
                    }
                    Intrinsics.checkNotNullExpressionValue(user3, "");
                    if (j == user3.getId()) {
                        return next;
                    }
                }
            } else {
                Iterator<AnchorLinkUser> it2 = this.LIZLLL.iterator();
                while (it2.hasNext()) {
                    AnchorLinkUser next2 = it2.next();
                    if (!TextUtils.isEmpty(str)) {
                        Intrinsics.checkNotNullExpressionValue(next2, "");
                        if (TextUtils.equals(str, next2.LIZIZ())) {
                            return next2;
                        }
                    }
                    if (j != 0) {
                        if (next2 != null) {
                            user2 = next2.LIZ();
                        } else {
                            user2 = null;
                        }
                        Intrinsics.checkNotNullExpressionValue(user2, "");
                        if (j == user2.getId()) {
                            return next2;
                        }
                    }
                }
                Iterator<AnchorLinkUser> it3 = this.LJIILL.iterator();
                while (it3.hasNext()) {
                    AnchorLinkUser next3 = it3.next();
                    if (!TextUtils.isEmpty(str)) {
                        Intrinsics.checkNotNullExpressionValue(next3, "");
                        if (TextUtils.equals(str, next3.LIZIZ())) {
                            return next3;
                        }
                    }
                    if (j != 0) {
                        if (next3 != null) {
                            user = next3.LIZ();
                        } else {
                            user = null;
                        }
                        Intrinsics.checkNotNullExpressionValue(user, "");
                        if (j == user.getId()) {
                            return next3;
                        }
                    }
                }
                return null;
            }
        }
    }

    public final void LIZ(int i, String str) {
        long j;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), str}, this, LIZ, false, 15).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        ALogger.m15797i("ttlive_anchor_link_users", "queryLinkList channelId:" + LIZ() + " status:" + i + " reqSrc:" + str + " scene=" + this.LJIIL);
        if (LIZ() == 0) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        LinkAnchorApi linkAnchorApi = (LinkAnchorApi) C88306Kqq.LIZ().LIZ(LinkAnchorApi.class);
        long LIZ2 = LIZ();
        long j2 = i;
        int i2 = this.LJIIL;
        boolean z = true ^ this.LJIJ;
        Room room = this.LJIJI;
        if (room != null) {
            j = room.getId();
        } else {
            j = 0;
        }
        this.LJIILLIIL.add(linkAnchorApi.getLinkAnchorList(LIZ2, j2, 0L, -1L, i2, z, str, j).compose(C100839PnV.LIZJ()).subscribe(new HO6(this, str, currentTimeMillis, i), new HO7<>(this, str, currentTimeMillis)));
    }
}
