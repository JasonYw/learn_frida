package com.bytedance.android.live.liveinteract.multianchor.p374pk;

import android.util.LongSparseArray;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.multianchor.constant.PlayMode;
import com.bytedance.android.live.liveinteract.multianchor.model.AnchorLinkUser;
import com.bytedance.android.live.liveinteract.multianchor.p367e.C4518a;
import com.bytedance.android.live.liveinteract.multianchor.p368f.C4520a;
import com.bytedance.android.live.liveinteract.multianchor.p374pk.statemachine.MultiPKStateMachine;
import com.bytedance.android.live.liveinteract.plantform.api.LinkAnchorApi;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4782v;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.message.linker.C8684d;
import com.bytedance.android.livesdk.message.linker.C8692q;
import com.bytedance.android.livesdk.message.model.C8874fl;
import com.bytedance.android.livesdk.message.model.LinkMicBattleInviteMessage;
import com.bytedance.android.livesdk.message.model.p726a.C8718a;
import com.bytedance.android.livesdk.message.model.p726a.C8721e;
import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.android.livesdkapi.depend.model.live.BattleUserInfo;
import com.bytedance.android.livesdkapi.depend.model.live.C9560s;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.linker.C9519ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.bytedance.live.datacontext.C13491f;
import com.p1594ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import p002O.C0002O;
import p003X.AbstractC413392Xt;
import p003X.AbstractC426192th;
import p003X.AbstractC80164Hio;
import p003X.C100839PnV;
import p003X.C106862S5w;
import p003X.C2WC;
import p003X.C2WD;
import p003X.C79242HLo;
import p003X.C79410HSa;
import p003X.C79413HSd;
import p003X.C79503HVp;
import p003X.C79506HVs;
import p003X.C79507HVt;
import p003X.C79509HVv;
import p003X.C79510HVw;
import p003X.C79511HVx;
import p003X.C79513HVz;
import p003X.C81289I2h;
import p003X.C81294I2m;
import p003X.C81909IQd;
import p003X.C88306Kqq;
import p003X.C88440Kt0;
import p003X.HNS;
import p003X.HSN;
import p003X.HV0;
import p003X.HVP;
import p003X.HW0;
import p003X.HW1;
import p003X.HW4;
import p003X.HW5;
import p003X.HW6;
import p003X.HWE;
import p003X.HWF;
import p003X.HWM;
import p003X.HWQ;
import p003X.HWS;
import p003X.HWT;
import p003X.HWU;
import p003X.LK5;
import p003X.QB4;

/* renamed from: com.bytedance.android.live.liveinteract.multianchor.pk.j */
/* loaded from: classes3.dex */
public final class C4536j extends C13491f implements AbstractC80164Hio, HWF, OnMessageListener {
    public static ChangeQuickRedirect LIZ;
    public static final /* synthetic */ KProperty[] LIZIZ;
    public static final boolean LJJIJ;
    public boolean LIZLLL;
    public final PublishSubject<Boolean> LJFF;
    public NextLiveData<Long> LJII;
    public Map<Long, Long> LJIIJ;
    public Disposable LJIIJJI;
    public Disposable LJIIL;
    public HWQ LJIILIIL;
    public C4518a LJIILJJIL;
    public long LJIILL;
    public C79503HVp LJIILLIIL;
    public final C4520a LJIJ;
    public int LJIJI;
    public boolean LJIJJ;
    public boolean LJIJJLI;
    public final List<AbstractC4537s> LJIL;
    public final HW6 LJJ;
    public int LJJI;
    public final HVP LJJIFFI;
    public final Observer<Integer> LJJII;
    public final C5923dp LJJIII;
    public boolean LJJIJIIJIL;
    public boolean LJJIJIL;
    public final HSN LJJIJL;
    public final C81289I2h LJJIJLIJ;
    public final C81289I2h LJJIL;
    public static final HW5 LJJIJIIJI = new HW5((byte) 0);
    public static final String LJJIIJ = "MultiAnchorPkDataContext";
    public static final int LJJIIJZLJL = 1;
    public static final int LJJIIZ = 2;
    public static final int LJJIIZI = 3;
    public final CompositeDisposable LIZJ = new CompositeDisposable();

    /* renamed from: LJ */
    public final NextLiveData<PlayMode> f26358LJ = new NextLiveData<>();
    public final NextLiveData<Integer> LJI = new NextLiveData<>();
    public final NextLiveData<List<C8718a>> LJIIIIZZ = new NextLiveData<>();
    public final NextLiveData<LongSparseArray<Integer>> LJIIIZ = new NextLiveData<>();
    public HashMap<Long, Integer> LJIIZILJ = new HashMap<>();

    /* renamed from: LJ */
    public final AbstractC426192th<Boolean> m15724LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return (AbstractC426192th) (proxy.isSupported ? proxy.result : this.LJJIJLIJ.LIZ(this, LIZIZ[0]));
    }

    public final C2WD<Boolean> LJFF() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return (C2WD) (proxy.isSupported ? proxy.result : this.LJJIL.LIZ(this, LIZIZ[1]));
    }

    @Override // p003X.AbstractC80164Hio
    public final boolean LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        Integer value = this.LJI.getValue();
        int LIZIZ2 = C79506HVs.LIZIZ();
        if (value == null || value.intValue() != LIZIZ2) {
            Integer value2 = this.LJI.getValue();
            int LIZJ = C79506HVs.LIZJ();
            if (value2 == null || value2.intValue() != LIZJ) {
                return false;
            }
        }
        return true;
    }

    public final void LIZ(C9560s c9560s, C9560s c9560s2) {
        if (PatchProxy.proxy(new Object[]{c9560s, c9560s2}, this, LIZ, false, 7).isSupported) {
            return;
        }
        HWQ hwq = new HWQ();
        hwq.LIZ = c9560s;
        hwq.LIZIZ = c9560s2;
        this.LJIILIIL = hwq;
    }

    public final void LIZ(Map<Long, ? extends C8692q> map) {
        if (PatchProxy.proxy(new Object[]{map}, this, LIZ, false, 8).isSupported) {
            return;
        }
        if (map != null && (!map.isEmpty())) {
            HashMap hashMap = new HashMap();
            for (Map.Entry<Long, ? extends C8692q> entry : map.entrySet()) {
                long longValue = entry.getKey().longValue();
                List<Long> list = entry.getValue().LIZIZ;
                if (list != null) {
                    for (Long l : list) {
                        Intrinsics.checkNotNullExpressionValue(l, "");
                        hashMap.put(l, Long.valueOf(longValue));
                    }
                }
            }
            this.LJIIJ = hashMap;
            this.f26358LJ.setValue(PlayMode.TEAM_PK);
            return;
        }
        this.f26358LJ.setValue(PlayMode.PERSONAL_PK);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.util.LongSparseArray] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    public final void LIZ(List<? extends C8718a> list) {
        ?? longSparseArray;
        if (PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 9).isSupported) {
            return;
        }
        C106862S5w.LIZ(list);
        if (this.f26358LJ.getValue() == PlayMode.PERSONAL_PK) {
            MutableLiveData mutableLiveData = this.LJIIIZ;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list}, HV0.LIZIZ, HV0.LIZ, false, 1);
            if (proxy.isSupported) {
                longSparseArray = proxy.result;
            } else {
                C106862S5w.LIZ(list);
                longSparseArray = new LongSparseArray();
                long j = 0;
                for (C8718a c8718a : list) {
                    if (c8718a.LJI == 1) {
                        j = c8718a.LIZ;
                    }
                }
                for (C8718a c8718a2 : list) {
                    if (j == 0) {
                        longSparseArray.put(c8718a2.LIZ, Integer.valueOf(HW5.LIZLLL()));
                    } else if (j == c8718a2.LIZ) {
                        longSparseArray.put(c8718a2.LIZ, Integer.valueOf(HW5.LIZIZ()));
                    } else {
                        longSparseArray.put(c8718a2.LIZ, Integer.valueOf(HW5.LIZJ()));
                    }
                }
            }
            mutableLiveData.setValue(longSparseArray);
        }
        if (this.f26358LJ.getValue() != PlayMode.TEAM_PK) {
            return;
        }
        this.LJIIIZ.setValue(HV0.LIZIZ.LIZ(list));
    }

    public final void LIZ(HWU hwu) {
        C79503HVp c79503HVp;
        C79503HVp c79503HVp2;
        if (PatchProxy.proxy(new Object[]{hwu}, this, LIZ, false, 11).isSupported) {
            return;
        }
        Integer value = this.LJI.getValue();
        Integer value2 = this.LJI.getValue();
        if (value2 == null) {
            value2 = Integer.valueOf(C79506HVs.LIZ());
        }
        Intrinsics.checkNotNullExpressionValue(value2, "");
        int intValue = value2.intValue();
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(intValue), hwu}, null, C79506HVs.LIZ, true, 1);
        if (proxy.isSupported) {
            intValue = ((Integer) proxy.result).intValue();
        } else {
            C106862S5w.LIZ(hwu);
            if (intValue == C79506HVs.LIZIZ) {
                if ((hwu instanceof HWE) && (c79503HVp2 = ((HWE) hwu).LIZIZ) != null) {
                    if (c79503HVp2.LJFF == 0) {
                        intValue = C79506HVs.LIZIZ;
                    } else {
                        if (c79503HVp2 instanceof C8721e) {
                            C8721e c8721e = (C8721e) c79503HVp2;
                            if (c8721e.LJJII > 0) {
                                if (C79506HVs.LIZ(c8721e, C81294I2m.LIZ())) {
                                    intValue = C79506HVs.LIZIZ;
                                } else {
                                    intValue = C79506HVs.LIZLLL;
                                }
                            }
                        }
                        intValue = C79506HVs.LIZJ;
                    }
                }
            } else if (intValue == C79506HVs.LIZJ) {
                if (hwu instanceof HWS) {
                    intValue = C79506HVs.LIZLLL;
                } else if (hwu instanceof HWT) {
                    intValue = C79506HVs.LIZIZ;
                } else if (hwu instanceof HWE) {
                    intValue = C79506HVs.LIZJ;
                }
            } else if (intValue == C79506HVs.LIZLLL) {
                if (hwu instanceof HWT) {
                    intValue = C79506HVs.LIZIZ;
                } else if ((hwu instanceof HWE) && (c79503HVp = ((HWE) hwu).LIZIZ) != null) {
                    if (c79503HVp instanceof C8721e) {
                        C8721e c8721e2 = (C8721e) c79503HVp;
                        if (c8721e2.LJJII > 0) {
                            if (C79506HVs.LIZ(c8721e2, C81294I2m.LIZ())) {
                                intValue = C79506HVs.LIZIZ;
                            } else {
                                intValue = C79506HVs.LIZLLL;
                            }
                        }
                    }
                    intValue = C79506HVs.LIZJ;
                }
            }
        }
        ALogger.m15800e("ttlive_multi_pk", C0002O.m25080C("send ", hwu.getClass().getSimpleName(), " from:", hwu.LIZ(), " state:", value != null ? C79506HVs.LIZ(value.intValue()) : null, " -> ", C79506HVs.LIZ(intValue)));
        if (value != null && value.intValue() == intValue) {
            return;
        }
        this.LJI.setValue(Integer.valueOf(intValue));
        if (intValue != C79506HVs.LIZ()) {
            return;
        }
        Disposable disposable = this.LJIIJJI;
        if (disposable != null) {
            disposable.dispose();
        }
        this.LJIIJJI = null;
    }

    public final void LIZ(String str) {
        C2WC<Room> LIZ2;
        Room LIZ3;
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 16).isSupported) {
            return;
        }
        ALogger.m15797i("ttlive_multi_pk", C0002O.m25086C("getBattleStats from ", str));
        long j = LinkCrossRoomDataHolder.LJII().LIZLLL;
        C5923dp c5923dp = this.LJJIII;
        this.LIZJ.add(((LinkAnchorApi) C88306Kqq.LIZ().LIZ(LinkAnchorApi.class)).getLinkAnchorList(j, 2L, 0L, -1L, 7, !this.LIZLLL, "finish_pk", ((c5923dp == null || (LIZ2 = c5923dp.LIZ()) == null || (LIZ3 = LIZ2.LIZ()) == null) ? null : Long.valueOf(LIZ3.getRoomId())).longValue()).compose(C100839PnV.LIZJ()).subscribe(new C79509HVv(this, str), new HW1<>(this, str)));
    }

    public final boolean LIZ(long j) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZ, false, 24);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        Integer num = this.LJIIZILJ.get(Long.valueOf(j));
        if (num == null) {
            num = 0;
        }
        Intrinsics.checkNotNullExpressionValue(num, "");
        return C79410HSa.LIZ(num.intValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p003X.HWF
    public final void LIZ(boolean z, C79511HVx c79511HVx) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), c79511HVx}, this, LIZ, false, 33).isSupported) {
            return;
        }
        if (z && c79511HVx != null) {
            ALogger.m15800e("ttlive_multi_pk", "skip peanl " + c79511HVx.LIZIZ);
            List<? extends C8718a> list = c79511HVx.LIZLLL;
            if (list == null) {
                list = new ArrayList<>();
            }
            LIZ(list);
            this.LJIIIIZZ.setValue(c79511HVx.LIZLLL);
            m15724LJ().LIZ(Boolean.TRUE);
        }
        if (PatchProxy.proxy(new Object[]{this, (byte) 0, 1, null}, null, LIZ, true, 35).isSupported) {
            return;
        }
        LIZ(false);
    }

    @Override // p003X.HWF
    public final void LIZ(C8874fl c8874fl) {
        C4520a mo15709LJ;
        List<AnchorLinkUser> LIZLLL;
        Integer num;
        AnchorLinkUser next;
        CharSequence subSequence;
        C9519ad c9519ad;
        User LIZ2;
        if (PatchProxy.proxy(new Object[]{c8874fl}, this, LIZ, false, 36).isSupported) {
            return;
        }
        C106862S5w.LIZ(c8874fl);
        AbstractC4782v LIZ3 = AbstractC4782v.LJIIL.LIZ();
        if (LIZ3 == null || (mo15709LJ = LIZ3.mo15709LJ()) == null || (LIZLLL = mo15709LJ.LIZLLL()) == null) {
            return;
        }
        Iterator<AnchorLinkUser> it = LIZLLL.iterator();
        do {
            num = null;
            if (!it.hasNext()) {
                return;
            }
            next = it.next();
        } while (!Intrinsics.areEqual((next == null || (LIZ2 = next.LIZ()) == null) ? null : Long.valueOf(LIZ2.getId()), (c8874fl == null || (c9519ad = c8874fl.LJIIIZ) == null) ? null : Long.valueOf(c9519ad.LIZJ)));
        User LIZ4 = next.LIZ();
        if (LIZ4 == null) {
            return;
        }
        NextLiveData<Integer> nextLiveData = this.LJI;
        if (nextLiveData != null && nextLiveData.getValue() != null) {
            NextLiveData<Integer> nextLiveData2 = this.LJI;
            if (nextLiveData2 != null) {
                num = nextLiveData2.getValue();
            }
            int LIZ5 = C79506HVs.LIZ();
            if (num == null || num.intValue() != LIZ5) {
                if (LIZ4.getNickName().length() <= 4) {
                    subSequence = LIZ4.getNickName();
                } else {
                    subSequence = LIZ4.getNickName().subSequence(0, 4);
                }
                C88440Kt0.LIZ(LK5.LIZ(2131581990, subSequence));
                return;
            }
        }
        C88440Kt0.LIZ(LK5.LIZ(2131581989, LIZ4.getNickName()));
    }

    public final long LIZLLL() {
        C79503HVp c79503HVp = this.LJIILLIIL;
        if (c79503HVp != null) {
            return c79503HVp.LJFF;
        }
        return 0L;
    }

    public final void LJI() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 20).isSupported) {
            return;
        }
        this.LJJIJIIJIL = true;
        this.LJJIJL.LIZ(1, 0, this.LJJIJIL, this.LJIIZILJ);
    }

    public final Map<String, String> LJII() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 22);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        return this.LJJIJL.LIZ(this.LJIIZILJ);
    }

    public final int LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        Integer value = this.LJI.getValue();
        if (value != null) {
            return value.intValue();
        }
        return C79506HVs.LIZ();
    }

    public final Pair<List<Long>, List<Long>> LJIIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 27);
        if (proxy.isSupported) {
            return (Pair) proxy.result;
        }
        if (this.f26358LJ.getValue() == PlayMode.TEAM_PK) {
            HV0 hv0 = HV0.LIZIZ;
            long LIZ2 = C79242HLo.LIZ();
            Map<Long, Long> map = this.LJIIJ;
            if (map == null) {
                map = MapsKt__MapsKt.emptyMap();
            }
            return hv0.LIZ(LIZ2, map);
        }
        return TuplesKt.m137to(CollectionsKt__CollectionsKt.emptyList(), CollectionsKt__CollectionsKt.emptyList());
    }

    public final String LJIIJJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 28);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        PlayMode value = this.f26358LJ.getValue();
        if (value != null) {
            int i = HWM.LIZ[value.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return "team_pk";
                }
                return "";
            }
            return "individual_pk";
        }
        return "";
    }

    static {
        Covode.recordClassIndex(28187);
        boolean z = false;
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(C4536j.class, "showExtraResultAnim", "getShowExtraResultAnim()Lcom/bytedance/live/datacontext/IEventMember;", 0);
        Reflection.property1(propertyReference1Impl);
        PropertyReference1Impl propertyReference1Impl2 = new PropertyReference1Impl(C4536j.class, "lastBattleResultVisible", "getLastBattleResultVisible()Lcom/bytedance/live/datacontext/IMutableNullable;", 0);
        Reflection.property1(propertyReference1Impl2);
        LIZIZ = new KProperty[]{propertyReference1Impl, propertyReference1Impl2};
        SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_MULTI_NEW_PK_STATEMACHINE;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        if (value != null) {
            z = value.booleanValue();
        }
        LJJIJ = z;
    }

    @Override // p003X.AbstractC80164Hio
    public final int LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        PlayMode value = this.f26358LJ.getValue();
        if (value == null) {
            return 0;
        }
        if (value == PlayMode.PERSONAL_PK) {
            return 1;
        }
        if (value != PlayMode.TEAM_PK) {
            return 0;
        }
        return 2;
    }

    public final int LJIIIIZZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 23);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        int i = 0;
        for (Long l : this.LJIIZILJ.keySet()) {
            Integer num = this.LJIIZILJ.get(l);
            if (num == null) {
                num = 0;
            }
            Intrinsics.checkNotNullExpressionValue(num, "");
            if (!C79410HSa.LIZ(num.intValue())) {
                i++;
            }
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
        if (r7.LIZLLL == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
        if (((java.lang.Boolean) r1.result).booleanValue() == false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
        r7.LJIJJ = false;
        r7.LJIJJLI = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LJIIIZ() {
        /*
            r7 = this;
            r6 = 0
            java.lang.Object[] r2 = new java.lang.Object[r6]
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.liveinteract.multianchor.p374pk.C4536j.LIZ
            r0 = 25
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r2, r7, r1, r6, r0)
            boolean r0 = r0.isSupported
            if (r0 == 0) goto L10
            return
        L10:
            java.lang.Object[] r2 = new java.lang.Object[r6]
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.liveinteract.multianchor.p374pk.C4536j.LIZ
            r0 = 26
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r2, r7, r1, r6, r0)
            boolean r0 = r1.isSupported
            r5 = 1
            if (r0 == 0) goto L2e
            java.lang.Object r0 = r1.result
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L48
        L29:
            r7.LJIJJ = r6
            r7.LJIJJLI = r6
            return
        L2e:
            com.bytedance.android.live.core.setting.SettingKey<java.lang.Boolean> r0 = com.bytedance.android.livesdk.config.LiveSettingKeys.LIVE_ENABLE_MULTI_PK_AUDIENCE_ENHANCEMENT
            java.lang.String r1 = ""
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.Object r0 = r0.getValue()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L48
            boolean r0 = r7.LIZLLL
            if (r0 == 0) goto L29
        L48:
            boolean r0 = r7.LJIJJ
            if (r0 == 0) goto L4f
            r7.LJIJJLI = r5
            return
        L4f:
            com.bytedance.ies.sdk.widgets.NextLiveData<java.util.List<com.bytedance.android.livesdk.message.model.a.a>> r0 = r7.LJIIIIZZ
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            r3 = 0
            if (r0 == 0) goto L9d
            X.HWL r2 = new X.HWL
            r2.<init>(r0, r3)
            java.util.List<com.bytedance.android.live.liveinteract.multianchor.pk.s> r0 = r7.LJIL
            java.util.Iterator r1 = r0.iterator()
        L66:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L76
            java.lang.Object r0 = r1.next()
            com.bytedance.android.live.liveinteract.multianchor.pk.s r0 = (com.bytedance.android.live.liveinteract.multianchor.p374pk.AbstractC4537s) r0
            r0.LIZ(r2)
            goto L66
        L76:
            long r1 = r2.LIZIZ
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L9d
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            io.reactivex.Observable r1 = io.reactivex.Observable.timer(r1, r0)
            io.reactivex.Scheduler r0 = io.reactivex.android.schedulers.AndroidSchedulers.mainThread()
            io.reactivex.Observable r1 = r1.observeOn(r0)
            X.HWH r0 = new X.HWH
            r0.<init>(r7)
            io.reactivex.disposables.Disposable r1 = r1.subscribe(r0)
            io.reactivex.disposables.CompositeDisposable r0 = r7.LIZJ
            r0.add(r1)
            r7.LJIJJ = r5
            r7.LJIJJLI = r6
            return
        L9d:
            r7.LJIJJ = r6
            r7.LJIJJLI = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multianchor.p374pk.C4536j.LJIIIZ():void");
    }

    private final void LIZIZ(Map<Long, ? extends BattleUserInfo> map) {
        if (PatchProxy.proxy(new Object[]{map}, this, LIZ, false, 13).isSupported) {
            return;
        }
        Map<Long, Long> LIZ2 = HV0.LIZIZ.LIZ(map);
        if (LIZ2.isEmpty()) {
            this.f26358LJ.setValue(PlayMode.PERSONAL_PK);
            this.LJFF.onNext(Boolean.TRUE);
            return;
        }
        this.LJIIJ = LIZ2;
        this.f26358LJ.setValue(PlayMode.TEAM_PK);
        this.LJFF.onNext(Boolean.TRUE);
    }

    public final void LIZ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 21).isSupported) {
            return;
        }
        if (this.LIZLLL) {
            LIZ(LinkCrossRoomDataHolder.LJII().LIZLLL, i);
            return;
        }
        LIZ("audienceFinish" + i);
    }

    private final void LIZJ(Map<Long, ? extends BattleUserInfo> map) {
        int i;
        if (PatchProxy.proxy(new Object[]{map}, this, LIZ, false, 14).isSupported) {
            return;
        }
        this.LJIIZILJ.clear();
        if (map != null) {
            for (Long l : map.keySet()) {
                long longValue = l.longValue();
                HashMap<Long, Integer> hashMap = this.LJIIZILJ;
                Long valueOf = Long.valueOf(longValue);
                BattleUserInfo battleUserInfo = map.get(Long.valueOf(longValue));
                if (battleUserInfo != null) {
                    i = battleUserInfo.LJI;
                } else {
                    i = 0;
                }
                hashMap.put(valueOf, Integer.valueOf(i));
            }
        }
    }

    private final void LIZ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 34).isSupported) {
            return;
        }
        if (!z) {
            this.f26358LJ.setValue(null);
        }
        this.LJI.setValue(Integer.valueOf(C79506HVs.LIZ()));
        this.LJII.setValue(-1L);
        this.LJIIIZ.setValue(new LongSparseArray<>());
        this.LJIIIIZZ.setValue(new ArrayList());
        this.LJIILLIIL = null;
        this.LJIIZILJ.clear();
    }

    public C4536j(C5923dp c5923dp) {
        C4520a c4520a;
        C4520a c4520a2;
        NextLiveData<C8684d> nextLiveData;
        C4520a c4520a3;
        NextLiveData<C8684d> nextLiveData2;
        AbstractC413392Xt<IMessageManager> LJIILLIIL;
        IMessageManager LIZIZ2;
        C106862S5w.LIZ(c5923dp);
        this.LJJIII = c5923dp;
        this.LIZLLL = this.LJJIII.LJIILJJIL().LIZIZ().booleanValue();
        PublishSubject<Boolean> create = PublishSubject.create();
        Intrinsics.checkNotNullExpressionValue(create, "");
        this.LJFF = create;
        this.LJII = new NextLiveData<>();
        AbstractC4782v LIZ2 = AbstractC4782v.LJIIL.LIZ();
        if (LIZ2 != null) {
            c4520a = LIZ2.mo15709LJ();
        } else {
            c4520a = null;
        }
        this.LJIJ = c4520a;
        this.LJIL = new ArrayList();
        this.LJJ = new HW6(this, this.LJJIII, this.LJIJ);
        this.LJJIJL = new HSN(this, this.LIZLLL);
        this.LJJI = LinkMicBattleInviteMessage.BattleInviteType.BattleInviteType_Unknown.ordinal();
        this.LJJIJLIJ = HNS.LIZ(this, MultiAnchorPkDataContext$showExtraResultAnim$2.INSTANCE);
        this.LJJIL = C81909IQd.LIZ(this, MultiAnchorPkDataContext$lastBattleResultVisible$2.INSTANCE);
        this.LJJIFFI = new HVP(this);
        this.LJJII = new C79507HVt(this);
        QB4.LIZ(LLLLIIIILLL().subscribe(new C79513HVz(this)), this.LIZJ);
        IMessageManager LIZIZ3 = this.LJJIII.LJIILLIIL().LIZIZ();
        if (LIZIZ3 != null) {
            LIZIZ3.addMessageListener(MessageType.LINK_MIC.LIZ(), this);
            LIZIZ3.addMessageListener(MessageType.LINK_MIC_BATTLE_TEAM_TASK.LIZ(), this);
            if (!LJJIJ) {
                LIZIZ3.addMessageListener(MessageType.LINKER.LIZ(), this);
                LIZIZ3.addMessageListener(MessageType.LINK_MIC_BATTLE.LIZ(), this);
                LIZIZ3.addMessageListener(MessageType.LINK_MIC_BATTLE_FINISH.LIZ(), this);
            }
        }
        if (LJJIJ) {
            this.LJII = this.LJJ.LJI;
            HW6 hw6 = this.LJJ;
            if (!PatchProxy.proxy(new Object[0], hw6, HW6.LIZ, false, 4).isSupported) {
                C5923dp c5923dp2 = hw6.LJIIJJI;
                if (c5923dp2 != null && (LJIILLIIL = c5923dp2.LJIILLIIL()) != null && (LIZIZ2 = LJIILLIIL.LIZIZ()) != null) {
                    LIZIZ2.addMessageListener(MessageType.LINKER.LIZ(), hw6);
                    LIZIZ2.addMessageListener(MessageType.LINK_MIC_BATTLE.LIZ(), hw6);
                    LIZIZ2.addMessageListener(MessageType.LINK_MIC_BATTLE_FINISH.LIZ(), hw6);
                }
                if (!hw6.LJFF && (c4520a3 = hw6.LJIIL) != null && (nextLiveData2 = c4520a3.LJI) != null) {
                    nextLiveData2.observeForever(hw6.LJII, true);
                }
            }
        }
        this.LJJIJIIJIL = false;
        C4520a c4520a4 = this.LJIJ;
        if (c4520a4 != null) {
            c4520a4.LIZ(this.LJJIFFI);
        }
        this.LJI.observeForever(this.LJJII);
        if (!this.LIZLLL && !LJJIJ && (c4520a2 = this.LJIJ) != null && (nextLiveData = c4520a2.LJI) != null) {
            nextLiveData.observeForever(new C79510HVw(this), true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f3, code lost:
        if (r0.intValue() == r1) goto L52;
     */
    @Override // com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMessage(com.p1594ss.ugc.live.sdk.message.data.IMessage r9) {
        /*
            Method dump skipped, instructions count: 692
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multianchor.p374pk.C4536j.onMessage(com.ss.ugc.live.sdk.message.data.IMessage):void");
    }

    private final void LIZ(long j, int i) {
        if (PatchProxy.proxy(new Object[]{new Long(j), Integer.valueOf(i)}, this, LIZ, false, 15).isSupported) {
            return;
        }
        this.LIZJ.add(((MultiAnchorPkApi) C88306Kqq.LIZ().LIZ(MultiAnchorPkApi.class)).battleFinish(j, i).compose(C100839PnV.LIZJ()).subscribe(new HW0(this, j, i), new HW4<>(this, j, i)));
    }

    @Override // p003X.HWF
    public final void LIZ(int i, int i2) {
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, LIZ, false, 37).isSupported && !this.LJJIJIIJIL) {
            this.LJJIJL.LIZ(i, i2, this.LJJIJIL, this.LJIIZILJ);
        }
    }

    @Override // p003X.HWF
    public final void LIZ(C79511HVx c79511HVx, MultiPKStateMachine.Source source) {
        C9560s c9560s;
        long j;
        if (PatchProxy.proxy(new Object[]{c79511HVx, source}, this, LIZ, false, 32).isSupported) {
            return;
        }
        C106862S5w.LIZ(c79511HVx, source);
        this.LJIILL = c79511HVx.LJI;
        this.LJIILLIIL = c79511HVx.LIZIZ;
        if (source == MultiPKStateMachine.Source.MetaUpdate) {
            LIZ(c79511HVx.f6833LJ);
        }
        C79503HVp c79503HVp = this.LJIILLIIL;
        C9560s c9560s2 = null;
        if (c79503HVp != null) {
            c9560s = c79503HVp.LJIIL;
        } else {
            c9560s = null;
        }
        C79503HVp c79503HVp2 = this.LJIILLIIL;
        if (c79503HVp2 != null) {
            c9560s2 = c79503HVp2.LJIILIIL;
        }
        LIZ(c9560s, c9560s2);
        LinkCrossRoomDataHolder LJII = LinkCrossRoomDataHolder.LJII();
        C79503HVp c79503HVp3 = this.LJIILLIIL;
        if (c79503HVp3 != null) {
            j = c79503HVp3.LJFF;
        } else {
            j = 0;
        }
        LJII.f26249LJ = j;
        List<? extends C8718a> list = c79511HVx.LIZLLL;
        if (list == null) {
            list = new ArrayList<>();
        }
        LIZ(list);
        this.LJIIIIZZ.setValue(c79511HVx.LIZLLL);
        this.LJI.setValue(Integer.valueOf(C79506HVs.LIZJ()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p003X.HWF
    public final void LIZ(C79511HVx c79511HVx, MultiPKStateMachine.Source source, boolean z) {
        int ordinal;
        long j;
        C9560s c9560s;
        int ordinal2;
        if (PatchProxy.proxy(new Object[]{c79511HVx, source, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 31).isSupported) {
            return;
        }
        C106862S5w.LIZ(c79511HVx, source);
        C79503HVp c79503HVp = c79511HVx.LIZIZ;
        if (c79503HVp != null) {
            ordinal = c79503HVp.LJJI;
        } else {
            ordinal = LinkMicBattleInviteMessage.BattleInviteType.BattleInviteType_Unknown.ordinal();
        }
        this.LJJI = ordinal;
        if (z) {
            LIZ(z);
        }
        this.LJIILL = c79511HVx.LJI;
        this.LJIILLIIL = c79511HVx.LIZIZ;
        LinkCrossRoomDataHolder LJII = LinkCrossRoomDataHolder.LJII();
        C79503HVp c79503HVp2 = this.LJIILLIIL;
        if (c79503HVp2 != null) {
            j = c79503HVp2.LJFF;
        } else {
            j = 0;
        }
        LJII.f26249LJ = j;
        LIZJ(c79511HVx.LIZJ);
        this.LJIIIZ.setValue(new LongSparseArray<>());
        this.LJIIIIZZ.setValue(new ArrayList());
        this.LJIJI++;
        this.LJJIJIL = false;
        C79503HVp c79503HVp3 = this.LJIILLIIL;
        C9560s c9560s2 = null;
        if (c79503HVp3 != null) {
            c9560s = c79503HVp3.LJIIL;
        } else {
            c9560s = null;
        }
        C79503HVp c79503HVp4 = this.LJIILLIIL;
        if (c79503HVp4 != null) {
            c9560s2 = c79503HVp4.LJIILIIL;
        }
        LIZ(c9560s, c9560s2);
        if (source == MultiPKStateMachine.Source.MetaUpdate) {
            LIZ(c79511HVx.f6833LJ);
            this.LJIIIIZZ.setValue(c79511HVx.LIZLLL);
        } else {
            LIZIZ(c79511HVx.LIZJ);
        }
        if (this.LIZLLL) {
            C79413HSd.LIZIZ.LIZ(z);
            HSN hsn = this.LJJIJL;
            HashMap<Long, Integer> hashMap = this.LJIIZILJ;
            C4518a c4518a = this.LJIILJJIL;
            C79503HVp c79503HVp5 = this.LJIILLIIL;
            if (c79503HVp5 != null) {
                ordinal2 = c79503HVp5.LJJI;
            } else {
                ordinal2 = LinkMicBattleInviteMessage.BattleInviteType.BattleInviteType_Multiple_Again.ordinal();
            }
            hsn.LIZ(z, hashMap, c4518a, ordinal2);
        }
        ALogger.m15800e(LJJIIJ, "message start");
        LinkCrossRoomDataHolder.LJII().LJIJJLI = 100;
        this.LJI.setValue(Integer.valueOf(C79506HVs.LIZIZ()));
    }
}
