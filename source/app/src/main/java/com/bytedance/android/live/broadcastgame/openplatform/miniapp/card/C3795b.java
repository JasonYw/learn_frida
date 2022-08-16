package com.bytedance.android.live.broadcastgame.openplatform.miniapp.card;

import android.os.Bundle;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcastgame.api.util.OpenPlatformTimeTracer;
import com.bytedance.android.live.broadcastgame.opengame.message.C3511ae;
import com.bytedance.android.live.broadcastgame.opengame.network.C3561g;
import com.bytedance.android.live.broadcastgame.opengame.runtime.C3682x;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar_behavior.p528a.C6532d;
import com.bytedance.android.livesdk.log.model.C8668v;
import com.bytedance.android.livesdk.log.p723a.AbstractC8644i;
import com.bytedance.android.livesdk.message.model.C8733af;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import io.reactivex.disposables.Disposable;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p003X.AbstractC413392Xt;
import p003X.AbstractC88224KpW;
import p003X.C106862S5w;
import p003X.C409882Kg;
import p003X.C423702pg;
import p003X.C426132tb;
import p003X.C4574547f;
import p003X.C87418KcW;
import p003X.C87427Kcf;
import p003X.C87767Ki9;
import p003X.C87811Kir;
import p003X.C87814Kiu;
import p003X.C87911KkT;
import p003X.C88098KnU;
import p003X.View$OnClickListenerC87803Kij;
import p003X.View$OnClickListenerC87815Kiv;

/* renamed from: com.bytedance.android.live.broadcastgame.openplatform.miniapp.card.b */
/* loaded from: classes5.dex */
public final class C3795b {
    public static ChangeQuickRedirect LIZ;
    public C88098KnU<C3561g> LIZIZ;
    public Disposable LIZJ;
    public final DataCenter LIZLLL;

    /* renamed from: LJ */
    public final Room f26109LJ;
    public final C3682x LJFF;
    public final C3799p LJI = new C3799p();

    static {
        Covode.recordClassIndex(21605);
    }

    private final boolean LIZ() {
        Object obj;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 8);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        DataCenter dataCenter = this.LIZLLL;
        if (dataCenter != null) {
            obj = dataCenter.get("cmd_commerce_ad_show", (String) Boolean.FALSE);
        } else {
            obj = null;
        }
        return Intrinsics.areEqual(obj, Boolean.TRUE);
    }

    private final C88098KnU<C3561g> LIZIZ(C8733af c8733af) {
        int i = 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c8733af}, this, LIZ, false, 9);
        if (proxy.isSupported) {
            return (C88098KnU) proxy.result;
        }
        C88098KnU<C3561g> c88098KnU = new C88098KnU<>(this.LJFF.LIZLLL, this.LJFF.LJIIIIZZ());
        if (c8733af != null) {
            i = c8733af.LIZLLL;
        }
        c88098KnU.LIZ(i, (int) C87811Kir.LJI.LIZ(c8733af));
        c88098KnU.LIZ(new View$OnClickListenerC87815Kiv(this, c8733af));
        c88098KnU.LIZIZ(new View$OnClickListenerC87803Kij(this, c8733af));
        return c88098KnU;
    }

    public final Bundle LIZ(C8733af c8733af) {
        String str;
        String str2;
        Map<String, String> LIZ2;
        User owner;
        Map<String, String> LIZ3;
        String str3;
        String str4;
        String idStr;
        String str5 = "1";
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c8733af}, this, LIZ, false, 10);
        if (proxy.isSupported) {
            return (Bundle) proxy.result;
        }
        Bundle bundle = new Bundle();
        Room room = this.f26109LJ;
        String str6 = null;
        if (room != null) {
            str = String.valueOf(room.ownerUserId);
        } else {
            str = null;
        }
        bundle.putString("anchor_id", str);
        Room room2 = this.f26109LJ;
        if (room2 != null && (idStr = room2.getIdStr()) != null) {
            bundle.putString("room_id", idStr);
        }
        bundle.putString("_param_live_platform", "live");
        bundle.putString("enter_from", "live");
        if (c8733af != null) {
            str2 = c8733af.LJI;
        } else {
            str2 = null;
        }
        bundle.putString("mp_id", str2);
        bundle.putString("mp_name", this.LJFF.LJIIIIZZ.LIZ(false));
        try {
            if (c8733af != null) {
                str6 = c8733af.LJFF;
            }
            JSONObject jSONObject = new JSONObject(str6);
            jSONObject.getInt("review_status");
            if (jSONObject.getInt("review_status") != 1) {
                str4 = "0";
            } else {
                str4 = str5;
            }
            bundle.putString("is_change_cover", str4);
        } catch (Exception unused) {
        }
        AbstractC8644i LIZ4 = C4574547f.LIZ().LIZ(Room.class);
        if (LIZ4 != null && (LIZ3 = LIZ4.LIZ()) != null && (str3 = LIZ3.get("request_id")) != null) {
            bundle.putString("request_id", str3);
        }
        Room room3 = this.f26109LJ;
        if (room3 == null || (owner = room3.getOwner()) == null || !owner.isFollowing()) {
            str5 = "0";
        }
        bundle.putString("follow_status", str5);
        AbstractC8644i LIZ5 = C4574547f.LIZ().LIZ(C8668v.class);
        if (LIZ5 != null && (LIZ2 = LIZ5.LIZ()) != null) {
            if (LIZ2.containsKey("enter_from_merge")) {
                bundle.putString("enter_from_merge", LIZ2.get("enter_from_merge"));
            }
            if (LIZ2.containsKey("enter_method")) {
                bundle.putString("enter_method", LIZ2.get("enter_method"));
            }
        }
        return bundle;
    }

    private void LIZ(boolean z, C88098KnU<C3561g> c88098KnU) {
        AbstractC413392Xt<AbstractC88224KpW<C6532d>> LJJIIJ;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), c88098KnU}, this, LIZ, false, 5).isSupported) {
            return;
        }
        if (c88098KnU != null && c88098KnU.LIZJ) {
            this.LJI.LIZ("隐藏卡片动画", new AudienceMiniCardHelper$hideCard$1(c88098KnU)).LIZ("dismiss widget", new AudienceMiniCardHelper$hideCard$2(c88098KnU));
            C5923dp LIZ2 = C409882Kg.LIZ(C5923dp.LJIIJ, this.LIZLLL, 0L, 2, null);
            if (LIZ2 != null && (LJJIIJ = LIZ2.LJJIIJ()) != null) {
                LJJIIJ.LIZ(new AudienceMiniCardHelper$hideCard$3(this));
            }
        }
        if (z) {
            this.LJI.LIZ("unload widget", new AudienceMiniCardHelper$hideCard$4(c88098KnU));
        }
    }

    public final void LIZ(C8733af c8733af, boolean z) {
        Object obj;
        Room room;
        boolean z2;
        C88098KnU<C3561g> c88098KnU;
        AbstractC413392Xt<AbstractC88224KpW<C6532d>> LJJIIJ;
        int i = 0;
        if (PatchProxy.proxy(new Object[]{c8733af, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 3).isSupported) {
            return;
        }
        DataCenter dataCenter = this.LIZLLL;
        if (dataCenter != null) {
            obj = dataCenter.get("data_is_anchor", (String) Boolean.FALSE);
        } else {
            obj = null;
        }
        if (Intrinsics.areEqual(obj, Boolean.TRUE) || LIZ()) {
            return;
        }
        DataCenter dataCenter2 = this.LIZLLL;
        if (dataCenter2 != null) {
            room = C423702pg.LIZIZ(dataCenter2);
        } else {
            room = null;
        }
        if (!C426132tb.LIZIZ(room)) {
            return;
        }
        if (z) {
            C87767Ki9.LIZ().LIZ(OpenPlatformTimeTracer.EventName.show_card_time);
        }
        C88098KnU<C3561g> c88098KnU2 = this.LIZIZ;
        if (c88098KnU2 != null && !c88098KnU2.LIZ(c8733af)) {
            C87911KkT.LIZ(C87911KkT.LIZIZ, "不同的讲解卡类型，需要把之前的隐藏了", null, 2, null);
            LIZ(true, this.LIZIZ);
            z2 = true;
        } else {
            z2 = false;
        }
        C5923dp LIZ2 = C409882Kg.LIZ(C5923dp.LJIIJ, this.LIZLLL, 0L, 2, null);
        if (LIZ2 != null && (LJJIIJ = LIZ2.LJJIIJ()) != null) {
            LJJIIJ.LIZ(new AudienceMiniCardHelper$doShowCard$1(this));
        }
        if (this.LIZIZ == null || z2) {
            this.LIZIZ = LIZIZ(c8733af);
        }
        if (LIZ() || (c88098KnU = this.LIZIZ) == null) {
            return;
        }
        if (c8733af != null) {
            i = c8733af.LIZLLL;
        }
        C3799p.LIZ(this.LJI, 0L, 1, null);
        this.LJI.LIZ("load", new AudienceMiniCardHelper$doShowCard$2(this, c88098KnU, c8733af, i));
    }

    public C3795b(DataCenter dataCenter, Room room, C3682x c3682x) {
        C106862S5w.LIZ(c3682x);
        this.LIZLLL = dataCenter;
        this.f26109LJ = room;
        this.LJFF = c3682x;
    }

    public final void LIZ(C8733af c8733af, boolean z, boolean z2) {
        Room room;
        Disposable subscribe;
        if (!PatchProxy.proxy(new Object[]{c8733af, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, this, LIZ, false, 1).isSupported && (room = this.f26109LJ) != null && c8733af != null) {
            if (z2) {
                long roomId = room.getRoomId();
                String str = c8733af.LJI;
                String str2 = c8733af.LJIIIZ;
                AudienceMiniCardHelper$showCard$1 audienceMiniCardHelper$showCard$1 = new AudienceMiniCardHelper$showCard$1(this, c8733af, z);
                if (!PatchProxy.proxy(new Object[]{new Long(roomId), str, str2, audienceMiniCardHelper$showCard$1}, this, LIZ, false, 4).isSupported && (subscribe = C87418KcW.LIZIZ.LIZ(new C3511ae(roomId, str, str2)).subscribe(new C87427Kcf(this, audienceMiniCardHelper$showCard$1), C87814Kiu.LIZ)) != null) {
                    this.LIZJ = subscribe;
                    return;
                }
                return;
            }
            LIZ(c8733af, z);
        }
    }

    public static /* synthetic */ void LIZ(C3795b c3795b, boolean z, C88098KnU c88098KnU, int i, Object obj) {
        byte b = z ? (byte) 1 : (byte) 0;
        byte b2 = z ? (byte) 1 : (byte) 0;
        if (PatchProxy.proxy(new Object[]{c3795b, Byte.valueOf(b), null, Integer.valueOf(i), null}, null, LIZ, true, 6).isSupported) {
            return;
        }
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            c88098KnU = c3795b.LIZIZ;
        }
        c3795b.LIZ(z, c88098KnU);
    }
}
