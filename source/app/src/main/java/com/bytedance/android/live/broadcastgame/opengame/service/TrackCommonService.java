package com.bytedance.android.live.broadcastgame.opengame.service;

import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.broadcastgame.opengame.runtime.C3682x;
import com.bytedance.android.live.broadcastgame.opengame.service.p297a.AbstractC3719c;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.log.model.C8668v;
import com.bytedance.android.livesdk.log.p723a.AbstractC8644i;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC441803dm;
import p003X.C106862S5w;
import p003X.C4574547f;
import p003X.C87790KiW;

/* loaded from: classes5.dex */
public class TrackCommonService implements AbstractC3719c {
    public static ChangeQuickRedirect LIZ;
    public static final C87790KiW LIZJ = new C87790KiW((byte) 0);
    public long LIZIZ;
    public final Lazy LIZLLL = LazyKt__LazyJVMKt.lazy(new TrackCommonService$commonParams$2(this));

    /* renamed from: LJ */
    public C3682x f26091LJ;

    static {
        Covode.recordClassIndex(21069);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.service.p297a.AbstractC3719c
    public final void LIZIZ() {
        boolean z = PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported;
    }

    public final Map<String, String> LJII() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (Map) (proxy.isSupported ? proxy.result : this.LIZLLL.mo27335getValue());
    }

    public C3682x LJIIJJI() {
        return this.f26091LJ;
    }

    public final void LJIIIIZZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        C4574547f LIZ2 = C4574547f.LIZ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LJII());
        LIZIZ(linkedHashMap);
        LIZ2.LIZ("livesdk_live_small_program_end", linkedHashMap, Room.class);
    }

    public final void LJIIIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        C4574547f LIZ2 = C4574547f.LIZ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LJII());
        linkedHashMap.put("duration", String.valueOf(System.currentTimeMillis() - this.LIZIZ));
        LIZIZ(linkedHashMap);
        LIZ2.LIZ("livesdk_small_program_duration", linkedHashMap, Room.class);
    }

    public final void LJIIJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        C4574547f LIZ2 = C4574547f.LIZ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(LJII());
        LIZIZ(linkedHashMap);
        LIZ2.LIZ("livesdk_live_small_program_start", linkedHashMap, Room.class);
    }

    public TrackCommonService(C3682x c3682x) {
        C106862S5w.LIZ(c3682x);
        this.f26091LJ = c3682x;
    }

    public final void LIZIZ(Map<String, String> map) {
        String str;
        String str2;
        int i = 0;
        if (PatchProxy.proxy(new Object[]{map}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(map);
        if (LJIIJJI().LJIIJ) {
            str = "anchor";
        } else {
            str = "user";
        }
        map.put("user_type", str);
        IUser LIZ2 = ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        long id = LIZ2.getId();
        if (LJIIJJI().LJIIJ) {
            map.put("anchor_id", String.valueOf(id));
            return;
        }
        map.put("user_id", String.valueOf(id));
        String[] strArr = {"enter_from_merge", "enter_method"};
        if (!PatchProxy.proxy(new Object[]{map, strArr}, LIZJ, C87790KiW.LIZ, false, 1).isSupported) {
            C106862S5w.LIZ(map, strArr);
            AbstractC8644i LIZ3 = C4574547f.LIZ().LIZ(C8668v.class);
            if (LIZ3 != null) {
                AbstractC441803dm abstractC441803dm = (AbstractC441803dm) LIZ3;
                do {
                    String str3 = strArr[i];
                    if (abstractC441803dm.LIZ().containsKey(str3) && (str2 = abstractC441803dm.LIZ().get(str3)) != null) {
                        map.put(str3, str2);
                    }
                    i++;
                } while (i < 2);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.bytedance.android.livesdk.log.filter.PageSourceFilter");
        }
    }
}
