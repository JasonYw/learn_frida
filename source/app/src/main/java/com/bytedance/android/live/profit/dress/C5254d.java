package com.bytedance.android.live.profit.dress;

import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.monitor.LiveTracingMonitor;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.GsonProtectorUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p003X.AbstractC80293Hkt;
import p003X.C106862S5w;
import p003X.C2WC;
import p003X.C3VF;
import p003X.C409882Kg;
import p003X.C440943cO;
import p003X.C87308Kak;
import p003X.C91106Luu;
import p003X.C91150Lvc;
import p003X.C91151Lvd;
import p003X.C91153Lvf;
import p003X.KM9;

/* renamed from: com.bytedance.android.live.profit.dress.d */
/* loaded from: classes5.dex */
public final class C5254d {
    public static ChangeQuickRedirect LIZ;
    public String LIZIZ;
    public final Map<String, C5253b> LIZJ;

    /* renamed from: LJ */
    public static final C91153Lvf f26556LJ = new C91153Lvf((byte) 0);
    public static final Lazy LIZLLL = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) DressRepository$Companion$INSTANCE$2.INSTANCE);

    public C5254d() {
        this.LIZIZ = "";
        this.LIZJ = new HashMap();
    }

    static {
        Covode.recordClassIndex(33247);
    }

    public final void LIZ() {
        long j;
        C3VF user;
        C2WC<Room> LIZ2;
        Room LIZ3;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported && this.LIZIZ.length() == 0) {
            C87308Kak<String> c87308Kak = AbstractC80293Hkt.f7251fn;
            Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
            String LIZ4 = c87308Kak.LIZ();
            Intrinsics.checkNotNullExpressionValue(LIZ4, "");
            this.LIZIZ = LIZ4;
            C87308Kak<String> c87308Kak2 = AbstractC80293Hkt.f7250fm;
            Intrinsics.checkNotNullExpressionValue(c87308Kak2, "");
            String LIZ5 = c87308Kak2.LIZ();
            C5923dp LIZ6 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
            long j2 = 0;
            if (LIZ6 != null && (LIZ2 = LIZ6.LIZ()) != null && (LIZ3 = LIZ2.LIZ()) != null) {
                j = LIZ3.getId();
            } else {
                j = 0;
            }
            IUserService iUserService = (IUserService) ServiceManager.getService(IUserService.class);
            if (iUserService != null && (user = iUserService.user()) != null) {
                j2 = user.LIZIZ();
            }
            Intrinsics.checkNotNullExpressionValue(LIZ5, "");
            if (LIZ5.length() > 0) {
                try {
                    Object fromJson = KM9.LIZ().fromJson(LIZ5, new C91150Lvc().getType());
                    Intrinsics.checkNotNullExpressionValue(fromJson, "");
                    LIZ((List) fromJson);
                    return;
                } catch (Exception e) {
                    e.printStackTrace();
                    if (!PatchProxy.proxy(new Object[]{new Long(j2), new Long(j), LIZ5}, C91106Luu.LIZIZ, C91106Luu.LIZ, false, 11).isSupported) {
                        C106862S5w.LIZ(LIZ5);
                        JSONObject jSONObject = new JSONObject();
                        JSONObject jSONObject2 = new JSONObject();
                        JSONObject jSONObject3 = new JSONObject();
                        C440943cO.LIZ(jSONObject3, "user_id", j2);
                        C440943cO.LIZ(jSONObject3, "room_id", j);
                        C440943cO.LIZ(jSONObject3, "json_str", LIZ5);
                        LiveTracingMonitor.LIZ("ttlive_load_dress_cache_error", LiveTracingMonitor.EventModule.DRESS, jSONObject, jSONObject2, jSONObject3);
                        return;
                    }
                    return;
                }
            }
            ALogger.m15797i("DressRepository", "Cannot find dress cache from disk.");
        }
    }

    public /* synthetic */ C5254d(byte b) {
        this();
    }

    public final void LIZ(List<C5253b> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(list);
        for (C5253b c5253b : list) {
            this.LIZJ.put(c5253b.LIZIZ, c5253b);
        }
    }

    public final void LIZIZ(List<C5253b> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(list);
        String json = GsonProtectorUtils.toJson(KM9.LIZ(), list, new C91151Lvd().getType());
        C87308Kak<String> c87308Kak = AbstractC80293Hkt.f7250fm;
        Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
        c87308Kak.LIZ(json);
    }
}
