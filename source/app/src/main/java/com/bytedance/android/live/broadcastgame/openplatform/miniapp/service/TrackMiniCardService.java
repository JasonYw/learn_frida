package com.bytedance.android.live.broadcastgame.openplatform.miniapp.service;

import android.os.Bundle;
import com.bytedance.android.live.broadcastgame.api.model.C3371aa;
import com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3662k;
import com.bytedance.android.live.broadcastgame.opengame.runtime.C3682x;
import com.bytedance.android.live.broadcastgame.opengame.service.TrackCommonService;
import com.bytedance.android.live.broadcastgame.opengame.service.p297a.AbstractC3717a;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.log.model.C8668v;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.minigame.appbase.base.event.BdpAppEventConstant;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC87170KWm;
import p003X.C106862S5w;
import p003X.C2WC;
import p003X.C2WD;
import p003X.C409882Kg;
import p003X.C423702pg;
import p003X.C4306532d;
import p003X.C4574547f;
import p003X.C87425Kcd;
import p003X.C87804Kik;
import p003X.C87806Kim;
import p003X.C88335KrJ;

/* loaded from: classes5.dex */
public final class TrackMiniCardService extends TrackCommonService implements AbstractC3662k, AbstractC3717a {
    public static ChangeQuickRedirect LIZLLL;
    public static final C87804Kik LJI = new C87804Kik((byte) 0);

    /* renamed from: LJ */
    public final DataCenter f26114LJ = LJIIJJI().f26082LJ;
    public final Room LJFF;
    public long LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public C3682x LJIIJ;

    static {
        Covode.recordClassIndex(21810);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZLLL, false, 24).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3662k
    public final void LIZJ() {
        boolean z = PatchProxy.proxy(new Object[0], this, LIZLLL, false, 26).isSupported;
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    public final void LIZLLL() {
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.service.TrackCommonService
    public final C3682x LJIIJJI() {
        return this.LJIIJ;
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    public final void LJI() {
        if (PatchProxy.proxy(new Object[0], this, LIZLLL, false, 23).isSupported) {
            return;
        }
        LJIIL();
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3662k
    public final void LIZ() {
        if (!PatchProxy.proxy(new Object[0], this, LIZLLL, false, 9).isSupported && LJIIJJI().LJIIJ && !LJIIJJI().LJIIJJI) {
            this.LIZIZ = System.currentTimeMillis();
            this.LJIIIZ = true;
            LJIIJ();
        }
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    /* renamed from: LJ */
    public final void mo15832LJ() {
        if (!PatchProxy.proxy(new Object[0], this, LIZLLL, false, 10).isSupported && !LJIIJJI().LJIIJ && !LJIIJJI().LJIIJJI) {
            this.LIZIZ = System.currentTimeMillis();
            LJIIJ();
        }
    }

    private final void LJIIL() {
        if (PatchProxy.proxy(new Object[0], this, LIZLLL, false, 14).isSupported || !this.LJIIIIZZ) {
            return;
        }
        C4574547f LIZ = C4574547f.LIZ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("duration", String.valueOf(System.currentTimeMillis() - this.LJII));
        linkedHashMap.putAll(LJII());
        LIZIZ(linkedHashMap);
        LIZ.LIZ("livesdk_small_program_close", linkedHashMap, Room.class);
        this.LJIIIIZZ = false;
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    public final void LJFF() {
        if (PatchProxy.proxy(new Object[0], this, LIZLLL, false, 11).isSupported || LJIIJJI().LJIIJJI) {
            return;
        }
        if (LJIIJJI().LJIIJ && this.LJIIIZ) {
            LJIIL();
            LJIIIIZZ();
            LJIIIZ();
        } else if (!LJIIJJI().LJIIJ) {
            LJIIL();
            LJIIIIZZ();
            LJIIIZ();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackMiniCardService(C3682x c3682x) {
        super(c3682x);
        Room room;
        C106862S5w.LIZ(c3682x);
        this.LJIIJ = c3682x;
        DataCenter dataCenter = this.f26114LJ;
        if (dataCenter != null) {
            room = C423702pg.LIZIZ(dataCenter);
        } else {
            room = null;
        }
        this.LJFF = room;
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3662k
    public final void LIZ(Object obj) {
        if (PatchProxy.proxy(new Object[]{obj}, this, LIZLLL, false, 27).isSupported) {
            return;
        }
        C106862S5w.LIZ(obj);
        C87425Kcd.LIZ(this, obj);
    }

    public final Map<String, String> LIZIZ(Bundle bundle) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{bundle}, this, LIZLLL, false, 21);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set<String> keySet = bundle.keySet();
        Intrinsics.checkNotNullExpressionValue(keySet, "");
        for (String str : keySet) {
            Object obj = bundle.get(str);
            if (!(obj instanceof String)) {
                obj = null;
            }
            if (obj == null) {
                obj = "";
            }
            linkedHashMap.put(str, obj);
        }
        return linkedHashMap;
    }

    public final void LIZ(Bundle bundle) {
        Bundle bundle2;
        String str;
        String str2;
        String str3;
        C2WC<Boolean> LLFII;
        C2WD<C3371aa> LJJII;
        C3371aa LIZ;
        if (PatchProxy.proxy(new Object[]{bundle}, this, LIZLLL, false, 18).isSupported) {
            return;
        }
        if (bundle != null) {
            bundle2 = new Bundle(bundle);
        } else {
            bundle2 = new Bundle();
        }
        bundle2.putString("_param_for_special", BdpAppEventConstant.MICRO_APP);
        bundle2.putString("scene", C88335KrJ.LIZ());
        bundle2.putString("launch_from", "live");
        bundle2.putString("location", "in_live_card");
        bundle2.putString("position", "live");
        AbstractC87170KWm LIZ2 = AbstractC87170KWm.LJI.LIZ();
        if (LIZ2 == null || (LJJII = LIZ2.LJJII()) == null || (LIZ = LJJII.LIZ()) == null || (str = LIZ.LIZJ) == null) {
            str = "";
        }
        bundle2.putString("mp_id", str);
        C5923dp LIZ3 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
        if (LIZ3 != null && (LLFII = LIZ3.LLFII()) != null && LLFII.LIZ().booleanValue()) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        bundle2.putString("if_clear_mode", str2);
        bundle2.putString("entrance_form", "live");
        bundle2.putString("enter_position", "live_popup_card");
        bundle2.putString("live_enter_method", C87806Kim.LIZIZ.LIZIZ());
        bundle2.putString("live_action_type", C87806Kim.LIZIZ.LIZJ());
        bundle2.putString("is_ad_channel", C4306532d.m24943LJ(this.f26114LJ));
        DataCenter dataCenter = this.f26114LJ;
        if (dataCenter != null && (str3 = (String) dataCenter.get("data_mini_card_log_extra", (String) null)) != null) {
            bundle2.putString("log_extra", str3);
        }
        C4574547f.LIZ().LIZ("mp_show", false, LIZIZ(bundle2), Room.class, C8668v.class);
    }

    @Override // com.bytedance.android.live.broadcastgame.opengame.runtime.AbstractC3663l
    public final void LIZ(Map<String, String> map) {
        if (PatchProxy.proxy(new Object[]{map}, this, LIZLLL, false, 22).isSupported) {
            return;
        }
        this.LJIIIIZZ = true;
        this.LJII = System.currentTimeMillis();
    }
}
