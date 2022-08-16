package com.bytedance.android.live.playtogether.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.playtogether.api.PlayTogetherAnchorApi;
import com.bytedance.android.live.playtogether.p409c.C5192a;
import com.bytedance.android.live.playtogether.p409c.C5214n;
import com.bytedance.android.live.playtogether.p409c.C5215o;
import com.bytedance.android.live.playtogether.p409c.C5216p;
import com.bytedance.android.livesdk.message.model.C8913hd;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import io.reactivex.disposables.CompositeDisposable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.internal.Intrinsics;
import p002O.C0002O;
import p003X.C100839PnV;
import p003X.C106862S5w;
import p003X.C88306Kqq;
import p003X.LUE;
import p003X.LUF;
import p003X.LUI;
import p003X.QB4;

/* renamed from: com.bytedance.android.live.playtogether.viewmodel.d */
/* loaded from: classes5.dex */
public final class C5245d extends ViewModel {
    public static ChangeQuickRedirect LIZ;
    public C5192a.C5193a LIZIZ;
    public final Lazy LIZJ = LazyKt__LazyJVMKt.lazy(PlayTogetherInvitedViewModel$audit$2.INSTANCE);
    public final Lazy LIZLLL = LazyKt__LazyJVMKt.lazy(PlayTogetherInvitedViewModel$auditDenyDesc$2.INSTANCE);

    /* renamed from: LJ */
    public final Lazy f26552LJ = LazyKt__LazyJVMKt.lazy(PlayTogetherInvitedViewModel$loading$2.INSTANCE);
    public final Lazy LJFF = LazyKt__LazyJVMKt.lazy(PlayTogetherInvitedViewModel$audiences$2.INSTANCE);
    public final Lazy LJI = LazyKt__LazyJVMKt.lazy(PlayTogetherInvitedViewModel$service$2.INSTANCE);
    public final Lazy LJII = LazyKt__LazyJVMKt.lazy(PlayTogetherInvitedViewModel$gameInfo$2.INSTANCE);
    public final Lazy LJIIIIZZ = LazyKt__LazyJVMKt.lazy(PlayTogetherInvitedViewModel$metaInfo$2.INSTANCE);
    public final Lazy LJIIIZ = LazyKt__LazyJVMKt.lazy(PlayTogetherInvitedViewModel$playId$2.INSTANCE);
    public final Lazy LJIIJ = LazyKt__LazyJVMKt.lazy(PlayTogetherInvitedViewModel$inviteEvent$2.INSTANCE);

    static {
        Covode.recordClassIndex(33200);
    }

    public final MutableLiveData<Integer> LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (MutableLiveData) (proxy.isSupported ? proxy.result : this.LIZJ.mo27335getValue());
    }

    public final MutableLiveData<String> LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return (MutableLiveData) (proxy.isSupported ? proxy.result : this.LIZLLL.mo27335getValue());
    }

    public final MutableLiveData<Boolean> LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return (MutableLiveData) (proxy.isSupported ? proxy.result : this.f26552LJ.mo27335getValue());
    }

    public final MutableLiveData<List<C5244c>> LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return (MutableLiveData) (proxy.isSupported ? proxy.result : this.LJFF.mo27335getValue());
    }

    /* renamed from: LJ */
    public final MutableLiveData<C5216p> m15619LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return (MutableLiveData) (proxy.isSupported ? proxy.result : this.LJI.mo27335getValue());
    }

    public final MutableLiveData<C5214n> LJFF() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return (MutableLiveData) (proxy.isSupported ? proxy.result : this.LJII.mo27335getValue());
    }

    public final MutableLiveData<C5215o> LJI() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        return (MutableLiveData) (proxy.isSupported ? proxy.result : this.LJIIIIZZ.mo27335getValue());
    }

    public final MutableLiveData<Long> LJII() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 8);
        return (MutableLiveData) (proxy.isSupported ? proxy.result : this.LJIIIZ.mo27335getValue());
    }

    public final MutableLiveData<C5243b> LJIIIIZZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 9);
        return (MutableLiveData) (proxy.isSupported ? proxy.result : this.LJIIJ.mo27335getValue());
    }

    public final void LIZ(Integer num, Long l, String str, boolean z) {
        if (PatchProxy.proxy(new Object[]{num, l, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 13).isSupported) {
            return;
        }
        if (!Intrinsics.areEqual(l, LJII().getValue())) {
            ALogger.m15797i("Together#PlayTogetherInvitedViewModel", "[pt_a_team]updateAudit, ignore for play_id not equal (" + l + ", " + LJII().getValue() + LoggerUtil.S_RIGHT_TAG);
            return;
        }
        Integer value = LIZ().getValue();
        Integer LIZ2 = z ? num : LIZ(num);
        LIZ().setValue(LIZ2);
        if (LIZ2 != null && LIZ2.intValue() == 2 && str != null) {
            LIZIZ().setValue(str);
        }
        ALogger.m15797i("Together#PlayTogetherInvitedViewModel", "[pt_a_team]updateAudit, [force=" + z + "] from: " + value + ", to: " + num + ", result: " + LIZ2 + ", auditDenyReason: " + str);
    }

    public final synchronized void LIZ(List<C8913hd> list, Long l, String str) {
        Iterable arrayList;
        Object obj;
        User user;
        Object obj2;
        User user2;
        MethodCollector.m14708i(2179);
        if (PatchProxy.proxy(new Object[]{list, l, str}, this, LIZ, false, 16).isSupported) {
            MethodCollector.m14707o(2179);
            return;
        }
        C106862S5w.LIZ(str);
        if (!Intrinsics.areEqual(l, LJII().getValue())) {
            ALogger.m15797i("Together#PlayTogetherInvitedViewModel", "[pt_a_team]updateTeamMember, playId: " + l + ", from: " + str + ", drop update because play_id not equal (" + l + ", " + LJII().getValue() + LoggerUtil.S_RIGHT_TAG);
            MethodCollector.m14707o(2179);
            return;
        }
        ALogger.m15801d("Together#PlayTogetherInvitedViewModel", "[pt_a_team]updateTeamMember, playId: " + l + ", from: " + str + ", old audiences: " + LIZLLL().getValue());
        if (list == null || list.isEmpty()) {
            LIZLLL().setValue(CollectionsKt__CollectionsKt.emptyList());
        } else {
            List<C5244c> value = LIZLLL().getValue();
            if (value == null || (arrayList = CollectionsKt___CollectionsKt.toMutableList((Collection) value)) == null) {
                arrayList = new ArrayList();
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : arrayList) {
                C5244c c5244c = (C5244c) obj3;
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    C8913hd c8913hd = (C8913hd) obj2;
                    C8913hd value2 = c5244c.LIZ().getValue();
                    Long valueOf = (value2 == null || (user2 = value2.LIZ) == null) ? null : Long.valueOf(user2.getId());
                    User user3 = c8913hd.LIZ;
                    if (Intrinsics.areEqual(valueOf, user3 != null ? Long.valueOf(user3.getId()) : null)) {
                        break;
                    }
                }
                if (((C8913hd) obj2) != null) {
                    arrayList2.add(obj3);
                }
            }
            List<C5244c> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList2);
            for (C8913hd c8913hd2 : list) {
                Iterator<T> it2 = mutableList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    C8913hd value3 = ((C5244c) obj).LIZ().getValue();
                    Long valueOf2 = (value3 == null || (user = value3.LIZ) == null) ? null : Long.valueOf(user.getId());
                    User user4 = c8913hd2.LIZ;
                    if (Intrinsics.areEqual(valueOf2, user4 != null ? Long.valueOf(user4.getId()) : null)) {
                        break;
                    }
                }
                C5244c c5244c2 = (C5244c) obj;
                if (c5244c2 == null) {
                    C5244c c5244c3 = new C5244c();
                    c5244c3.LIZ(c8913hd2);
                    mutableList.add(c5244c3);
                } else {
                    c5244c2.LIZ(c8913hd2);
                }
            }
            LIZLLL().setValue(mutableList);
        }
        ALogger.m15801d("Together#PlayTogetherInvitedViewModel", "[pt_a_team]updateTeamMember, playId: " + l + ", from: " + str + ", new audiences: " + LIZLLL().getValue());
        MethodCollector.m14707o(2179);
    }

    public final Map<String, String> LJIIIZ() {
        String str;
        int i;
        String str2;
        String str3;
        int i2 = 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 20);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        Pair[] pairArr = new Pair[6];
        long value = LJII().getValue();
        if (value == null) {
            value = 0L;
        }
        pairArr[0] = TuplesKt.m137to("squad_id", String.valueOf(value));
        C5216p value2 = m15619LJ().getValue();
        if (value2 == null || (str = value2.LJII) == null) {
            str = "";
        }
        pairArr[1] = TuplesKt.m137to("anchor_introduce", String.valueOf(str));
        List<C5244c> value3 = LIZLLL().getValue();
        if (value3 != null) {
            i = value3.size();
        } else {
            i = 0;
        }
        pairArr[2] = TuplesKt.m137to("squad_number", String.valueOf(i));
        C5216p value4 = m15619LJ().getValue();
        if (value4 == null || (str2 = value4.LJIIIZ) == null) {
            str2 = "";
        }
        pairArr[3] = TuplesKt.m137to("service_describe", String.valueOf(str2));
        C5216p value5 = m15619LJ().getValue();
        if (value5 != null) {
            i2 = value5.LJIIIIZZ;
        }
        pairArr[4] = TuplesKt.m137to("service_price", String.valueOf(i2));
        C5214n value6 = LJFF().getValue();
        if (value6 == null || (str3 = value6.LIZLLL) == null) {
            str3 = "";
        }
        pairArr[5] = TuplesKt.m137to("game_name", String.valueOf(str3));
        return MapsKt__MapsKt.mapOf(pairArr);
    }

    private final Integer LIZ(Integer num) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{num}, this, LIZ, false, 15);
        if (proxy.isSupported) {
            return (Integer) proxy.result;
        }
        Map mapOf = MapsKt__MapsKt.mapOf(TuplesKt.m137to(1, SetsKt__SetsKt.setOf((Object[]) new Integer[]{2, 3, 4})), TuplesKt.m137to(2, SetsKt__SetsJVMKt.setOf(4)), TuplesKt.m137to(3, SetsKt__SetsJVMKt.setOf(4)), TuplesKt.m137to(4, SetsKt__SetsKt.setOf((Object[]) new Integer[]{1, 2, 3})), TuplesKt.m137to(5, SetsKt__SetsJVMKt.setOf(4)));
        Integer value = LIZ().getValue();
        if (value != null) {
            Set set = (Set) mapOf.get(value);
            if (set != null && CollectionsKt___CollectionsKt.contains(set, num)) {
                return num;
            }
            return value;
        }
        return num;
    }

    public final Map<String, String> LIZ(String str) {
        String str2;
        int i;
        String str3;
        int i2 = 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 18);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        C106862S5w.LIZ(str);
        Pair[] pairArr = new Pair[5];
        C5216p value = m15619LJ().getValue();
        if (value == null || (str2 = value.LJII) == null) {
            str2 = "";
        }
        pairArr[0] = TuplesKt.m137to("service_introduce", String.valueOf(str2));
        List<C5244c> value2 = LIZLLL().getValue();
        if (value2 != null) {
            i = value2.size();
        } else {
            i = 0;
        }
        pairArr[1] = TuplesKt.m137to("squad_number", String.valueOf(i));
        C5216p value3 = m15619LJ().getValue();
        if (value3 == null || (str3 = value3.LJIIIZ) == null) {
            str3 = "";
        }
        pairArr[2] = TuplesKt.m137to("service_content", String.valueOf(str3));
        C5216p value4 = m15619LJ().getValue();
        if (value4 != null) {
            i2 = value4.LJIIIIZZ;
        }
        pairArr[3] = TuplesKt.m137to("service_price", String.valueOf(i2));
        pairArr[4] = TuplesKt.m137to("source_type", str);
        return MapsKt__MapsKt.mapOf(pairArr);
    }

    public final synchronized void LIZ(C5244c c5244c) {
        MethodCollector.m14708i(2180);
        if (PatchProxy.proxy(new Object[]{c5244c}, this, LIZ, false, 17).isSupported) {
            MethodCollector.m14707o(2180);
            return;
        }
        C106862S5w.LIZ(c5244c);
        List<C5244c> value = LIZLLL().getValue();
        if (value != null) {
            if (value.contains(c5244c)) {
                ALogger.m15801d("Together#PlayTogetherInvitedViewModel", "[pt_a_team]removeMember: " + c5244c);
                List<C5244c> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) value);
                mutableList.remove(c5244c);
                LIZLLL().setValue(mutableList);
                ALogger.m15801d("Together#PlayTogetherInvitedViewModel", "[pt_a_team]after removeMember audiences: " + LIZLLL().getValue());
            }
            MethodCollector.m14707o(2180);
            return;
        }
        MethodCollector.m14707o(2180);
    }

    public final void LIZ(C5192a.C5193a c5193a, String str) {
        Long l;
        Integer num;
        Long l2;
        String str2;
        if (PatchProxy.proxy(new Object[]{c5193a, str}, this, LIZ, false, 11).isSupported) {
            return;
        }
        C106862S5w.LIZ(c5193a, str);
        ALogger.m15797i("Together#PlayTogetherInvitedViewModel", C0002O.m25086C("[pt_a_team]update, from: ", str));
        this.LIZIZ = c5193a;
        LIZJ().setValue(Boolean.FALSE);
        LJI().setValue(c5193a.LIZLLL);
        LJFF().setValue(c5193a.LIZIZ);
        m15619LJ().setValue(c5193a.LIZJ);
        MutableLiveData<Long> LJII = LJII();
        C5216p c5216p = c5193a.LIZJ;
        Long l3 = null;
        if (c5216p != null) {
            l = Long.valueOf(c5216p.LIZ);
        } else {
            l = null;
        }
        LJII.setValue(l);
        C5216p c5216p2 = c5193a.LIZJ;
        if (c5216p2 != null) {
            num = Integer.valueOf(c5216p2.LJIIJJI);
        } else {
            num = null;
        }
        C5216p c5216p3 = c5193a.LIZJ;
        if (c5216p3 != null) {
            l2 = Long.valueOf(c5216p3.LIZ);
        } else {
            l2 = null;
        }
        C5216p c5216p4 = c5193a.LIZJ;
        if (c5216p4 != null) {
            str2 = c5216p4.LJIJ;
        } else {
            str2 = null;
        }
        LIZ(num, l2, str2, true);
        List<C8913hd> list = c5193a.LIZ;
        C5216p c5216p5 = c5193a.LIZJ;
        if (c5216p5 != null) {
            l3 = Long.valueOf(c5216p5.LIZ);
        }
        LIZ(list, l3, str);
    }

    public static /* synthetic */ Map LIZ(C5245d c5245d, String str, int i, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c5245d, null, 1, null}, null, LIZ, true, 19);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        return c5245d.LIZ("internal_window");
    }

    public final void LIZ(long j, int i, CompositeDisposable compositeDisposable, LUI lui) {
        if (PatchProxy.proxy(new Object[]{new Long(j), Integer.valueOf(i), compositeDisposable, lui}, this, LIZ, false, 10).isSupported) {
            return;
        }
        C106862S5w.LIZ(compositeDisposable);
        ALogger.m15797i("Together#PlayTogetherInvitedViewModel", "closeService, playId: " + j + ", closeType: " + i);
        QB4.LIZ(((PlayTogetherAnchorApi) C88306Kqq.LIZ().LIZ(PlayTogetherAnchorApi.class)).closeTeam(j, i).compose(C100839PnV.LIZJ()).subscribe(new LUE(this, i, j, lui), new LUF<>(i, j, lui)), compositeDisposable);
    }
}
