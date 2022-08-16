package com.bytedance.android.live.liveinteract.multianchor.pklaunch;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.linkpk.AbstractC4254a;
import com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multianchor.pklaunch.p375a.a$a;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4774i;
import com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4781u;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.interact.model.MultiPKModeInfo;
import com.bytedance.android.livesdk.chatroom.widget.RoomWidget;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.live.datacontext.C13491f;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC416582eC;
import p003X.AbstractC4569445g;
import p003X.AbstractC78050Gpo;
import p003X.C106862S5w;
import p003X.C2IN;
import p003X.C3BK;
import p003X.C3FN;
import p003X.C78828H5q;
import p003X.C79169HIt;
import p003X.C79313HOh;
import p003X.C79347HPp;
import p003X.C79644HaQ;
import p003X.C79696HbG;
import p003X.C88440Kt0;
import p003X.H9Z;
import p003X.HNG;
import p003X.HO9;
import p003X.HOA;
import p003X.IQV;
import p003X.IQX;

/* loaded from: classes3.dex */
public final class MultiAnchorPkLaunchControlWidget extends RoomWidget implements a$a, AbstractC4781u, AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public C79644HaQ LIZIZ;
    public final CompositeDisposable LIZJ = new CompositeDisposable();
    public H9Z LIZLLL;

    /* renamed from: LJ */
    public C79696HbG f26363LJ;

    static {
        Covode.recordClassIndex(28318);
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC6416aw
    public final void LIZIZ(Throwable th) {
        if (PatchProxy.proxy(new Object[]{th}, this, LIZ, false, 10).isSupported) {
            return;
        }
        AbstractC416582eC.LIZ(this, th);
    }

    @Override // com.bytedance.android.livesdk.chatroom.viewmodule.AbstractC6416aw
    public final String LJJIJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 9);
        return proxy.isSupported ? (String) proxy.result : AbstractC416582eC.LIZ(this);
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 11).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4781u
    public final boolean LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_MULTI_ANCHOR_TEAM_PK_ONLINE;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        return value.booleanValue();
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4781u
    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            return;
        }
        C79644HaQ c79644HaQ = this.LIZIZ;
        if (c79644HaQ != null) {
            c79644HaQ.dismiss();
        }
        this.LIZIZ = null;
        C79696HbG c79696HbG = this.f26363LJ;
        if (c79696HbG != null) {
            c79696HbG.dismiss();
        }
        this.f26363LJ = null;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        super.onDestroy();
        this.LIZJ.dispose();
        H9Z h9z = this.LIZLLL;
        if (h9z != null) {
            h9z.LIZJ();
        }
        this.LIZLLL = null;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        super.onCreate();
        C5923dp LJJJI = LJJJI();
        if (LJJJI != null) {
            Pair LIZ2 = IQV.LIZ((Function0) new MultiAnchorPkLaunchControlWidget$onCreate$1$dataPair$1(LJJJI));
            LIZ2.getFirst();
            IQX.LIZ((C13491f) LIZ2.getFirst(), HOA.class);
            ((C4566a) LIZ2.getFirst()).LIZ().LIZIZ(this);
            this.LIZJ.add((Disposable) LIZ2.getSecond());
        }
        this.LIZLLL = new H9Z();
        H9Z h9z = this.LIZLLL;
        if (h9z != null) {
            h9z.LIZ((a$a) this);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multianchor.pklaunch.p375a.a$a
    public final void LIZ(MultiPKModeInfo multiPKModeInfo, String str) {
        int i = 0;
        if (PatchProxy.proxy(new Object[]{multiPKModeInfo, str}, this, LIZ, false, 8).isSupported) {
            return;
        }
        C106862S5w.LIZ(multiPKModeInfo, str);
        if (!LIZ()) {
            return;
        }
        AbstractC4774i LIZ2 = AbstractC78050Gpo.LIZ();
        if (LIZ2 != null) {
            i = LIZ2.LJJIFFI();
        }
        if (C79169HIt.LIZIZ(i, 4) || this.LIZIZ != null || C78828H5q.m23788LJ() == 1) {
            return;
        }
        if (multiPKModeInfo.modeTab == 2) {
            LIZ(true, "npk_connect");
        }
        C88440Kt0.LIZ(str);
    }

    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4781u
    public final void LIZIZ(boolean z, String str) {
        if (PatchProxy.proxy(new Object[]{(byte) 0, str}, this, LIZ, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        if (LIZ()) {
            LIZ(false, str);
        } else if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            LIZIZ();
            this.f26363LJ = new C79696HbG();
            C79696HbG c79696HbG = this.f26363LJ;
            if (c79696HbG != null) {
                C3FN.LIZ(c79696HbG, this.context);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Long] */
    @Override // com.bytedance.android.live.liveinteract.plantform.p385a.AbstractC4781u
    public final void LIZ(boolean z, String str) {
        Long l;
        String str2;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), str}, this, LIZ, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        if (!LIZ()) {
            return;
        }
        LIZIZ();
        C79644HaQ c79644HaQ = new C79644HaQ();
        if (z) {
            c79644HaQ.f6867LJ = true;
        }
        if (!PatchProxy.proxy(new Object[]{str}, c79644HaQ, C79644HaQ.LIZ, false, 15).isSupported) {
            C106862S5w.LIZ(str);
            c79644HaQ.LIZIZ = str;
        }
        C3FN.LIZ(c79644HaQ, this.context);
        c79644HaQ.setOnDismissListener(new HO9(this, c79644HaQ));
        this.LIZIZ = c79644HaQ;
        if (C79347HPp.LIZIZ()) {
            IService service = ServiceManager.getService(IInteractService.class);
            String str3 = "";
            Intrinsics.checkNotNullExpressionValue(service, str3);
            C3BK pkService = ((IInteractService) service).getPkService();
            User LJIILJJIL = pkService.LJIILJJIL();
            Room mo23744LJ = pkService.mo23744LJ();
            if (LJIILJJIL == null || LJIILJJIL.getId() == 0 || mo23744LJ == null || mo23744LJ.getId() == 0) {
                C79313HOh c79313HOh = C79313HOh.f6779LJ;
                if (!PatchProxy.proxy(new Object[]{LJIILJJIL, mo23744LJ}, c79313HOh, C79313HOh.LIZLLL, false, 40).isSupported) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("guest_user", String.valueOf(LJIILJJIL));
                    if (mo23744LJ != null) {
                        l = Long.valueOf(mo23744LJ.getId());
                    } else {
                        l = null;
                    }
                    linkedHashMap.put("guest_room", String.valueOf(l));
                    linkedHashMap.put("fallback_user_id", Long.valueOf(LinkCrossRoomDataHolder.LJII().LJFF));
                    User user = LinkCrossRoomDataHolder.LJII().LJJJJL;
                    if (user == null || (str2 = user.toString()) == null) {
                        str2 = "null";
                    }
                    linkedHashMap.put("fallback_user", str2);
                    User user2 = LinkCrossRoomDataHolder.LJII().LJJJJL;
                    String str4 = str3;
                    if (user2 != null) {
                        str4 = Long.valueOf(user2.getLiveRoomId());
                    }
                    linkedHashMap.put("fallback_room_id", str4);
                    c79313HOh.LIZ(linkedHashMap);
                    C2IN LIZIZ = C2IN.LIZIZ();
                    LIZIZ.LIZJ("ttlive_anchor_link", "pk_guest_state_error: " + linkedHashMap);
                    HNG.LIZ("pk_guest_state_error", (Map<String, Object>) linkedHashMap, (AbstractC4254a) LinkCrossRoomDataHolder.LJII(), false);
                }
            }
        }
    }
}
