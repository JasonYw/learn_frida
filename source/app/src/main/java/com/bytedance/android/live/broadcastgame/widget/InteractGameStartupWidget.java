package com.bytedance.android.live.broadcastgame.widget;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.broadcastgame.api.AbstractC3357f;
import com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameMonitorService;
import com.bytedance.android.live.broadcastgame.api.interactgame.IInteractGameService;
import com.bytedance.android.live.broadcastgame.api.model.C3384q;
import com.bytedance.android.live.broadcastgame.api.model.InteractID;
import com.bytedance.android.live.broadcastgame.api.openplatform.AbstractC3398b;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;
import p003X.AbstractC80293Hkt;
import p003X.C443233g5;
import p003X.C87145KVn;
import p003X.C87146KVo;
import p003X.C87308Kak;
import p003X.C88440Kt0;
import p003X.KUB;
import p003X.KXQ;
import p003X.KYP;

/* loaded from: classes5.dex */
public final class InteractGameStartupWidget extends LiveRecyclableWidget implements Observer<KVData>, AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public AbstractC3357f LIZIZ;
    public C87146KVo LIZJ;
    public final AbstractC3398b LIZLLL;

    /* renamed from: LJ */
    public final AbstractC3398b f26117LJ;

    static {
        Covode.recordClassIndex(21827);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 14).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onUnload() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        this.dataCenter.removeObserver("cmd_dismiss_dialog_end", this);
        this.dataCenter.removeObserver("cmd_interact_game_startup", this);
    }

    private final void LIZIZ(C3384q c3384q) {
        AbstractC3398b abstractC3398b;
        if (!PatchProxy.proxy(new Object[]{c3384q}, this, LIZ, false, 8).isSupported && (abstractC3398b = this.LIZLLL) != null) {
            abstractC3398b.LIZ(c3384q);
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
        if (PatchProxy.proxy(new Object[]{objArr}, this, LIZ, false, 3).isSupported) {
            return;
        }
        this.dataCenter.observe("cmd_dismiss_dialog_end", this);
        this.dataCenter.observe("cmd_interact_game_startup", this);
        KYP kyp = KYP.LIZIZ;
        Object obj = this.dataCenter.get("data_room_id", (String) 0L);
        Intrinsics.checkNotNullExpressionValue(obj, "");
        long longValue = ((Number) obj).longValue();
        if (!PatchProxy.proxy(new Object[]{new Long(longValue)}, kyp, KYP.LIZ, false, 1).isSupported) {
            C87308Kak<ConcurrentHashMap<String, String>> c87308Kak = AbstractC80293Hkt.f7093cO;
            Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
            kyp.LIZ("last_room_id", String.valueOf(c87308Kak.LIZ().get("room_id")));
            kyp.LIZ("room_id", String.valueOf(longValue));
        }
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(KVData kVData) {
        String key;
        C3384q c3384q;
        KVData kVData2 = kVData;
        if (!PatchProxy.proxy(new Object[]{kVData2}, this, LIZ, false, 5).isSupported && kVData2 != null && (key = kVData2.getKey()) != null) {
            int hashCode = key.hashCode();
            if (hashCode != -774172322) {
                if (hashCode == -484116140 && key.equals("cmd_interact_game_startup") && (c3384q = (C3384q) kVData2.getData()) != null) {
                    if (c3384q.LJFF() == null && c3384q.f26027LJ != InteractID.Blinked.value) {
                        ALogger.m15801d("InteractGameStartupWidget", "gameExtra 为空，无法启动");
                        C88440Kt0.LIZ(2131583408);
                        return;
                    }
                    Context context = this.context;
                    Intrinsics.checkNotNullExpressionValue(context, "");
                    DataCenter dataCenter = this.dataCenter;
                    Intrinsics.checkNotNullExpressionValue(dataCenter, "");
                    ((IInteractGameService) ServiceManager.getService(IInteractGameService.class)).tryGetSwitchGameConfirmDialog(c3384q, context, dataCenter, new InteractGameStartupWidget$onChanged$$inlined$let$lambda$1(this, c3384q), InteractGameStartupWidget$onChanged$1$2.INSTANCE);
                }
            } else if (key.equals("cmd_dismiss_dialog_end")) {
                C87146KVo c87146KVo = this.LIZJ;
                if (c87146KVo != null && !PatchProxy.proxy(new Object[0], c87146KVo, C87146KVo.LIZ, false, 4).isSupported) {
                    c87146KVo.LIZJ();
                    c87146KVo.LJII = null;
                    c87146KVo.LJIIIIZZ = null;
                    c87146KVo.LJIIIZ = null;
                    c87146KVo.LJIIJ = null;
                }
                this.LIZJ = null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZ(com.bytedance.android.live.broadcastgame.api.model.C3384q r24) {
        /*
            Method dump skipped, instructions count: 666
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcastgame.widget.InteractGameStartupWidget.LIZ(com.bytedance.android.live.broadcastgame.api.model.q):void");
    }

    public InteractGameStartupWidget(AbstractC3398b abstractC3398b, AbstractC3398b abstractC3398b2) {
        this.LIZLLL = abstractC3398b;
        this.f26117LJ = abstractC3398b2;
        KXQ.LIZ().LIZIZ().LIZ(this);
    }

    private final void LIZ(C3384q c3384q, boolean z) {
        if (PatchProxy.proxy(new Object[]{c3384q, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 11).isSupported) {
            return;
        }
        if (C443233g5.LIZIZ.LIZ(c3384q)) {
            C88440Kt0.LIZ(2131583495);
            KUB.LIZ((IInteractGameMonitorService) ServiceManager.getService(IInteractGameMonitorService.class), 1, c3384q, "112", (String) null, (String) null, 24, (Object) null);
            return;
        }
        ((IInteractService) ServiceManager.getService(IInteractService.class)).handleInteractState(this.dataCenter, "small_game", new C87145KVn(this, z, c3384q));
    }
}
