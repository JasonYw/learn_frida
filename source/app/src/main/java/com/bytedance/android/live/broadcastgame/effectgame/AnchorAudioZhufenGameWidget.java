package com.bytedance.android.live.broadcastgame.effectgame;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.broadcastgame.api.model.C3383p;
import com.bytedance.android.live.broadcastgame.api.model.C3384q;
import com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.C2WC;
import p003X.C442103eG;
import p003X.C4574547f;
import p003X.C87132KVa;

/* loaded from: classes5.dex */
public final class AnchorAudioZhufenGameWidget extends LiveRecyclableWidget implements Observer<KVData>, AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public C87132KVa LIZIZ;
    public C3384q LIZJ;
    public long LIZLLL;

    static {
        Covode.recordClassIndex(19725);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onLoad(Object[] objArr) {
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 9).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onUnload() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        C87132KVa c87132KVa = this.LIZIZ;
        if (c87132KVa != null) {
            c87132KVa.LIZ(0L);
        }
        C87132KVa c87132KVa2 = this.LIZIZ;
        if (c87132KVa2 != null && !PatchProxy.proxy(new Object[0], c87132KVa2, C87132KVa.LIZ, false, 6).isSupported) {
            c87132KVa2.LIZLLL.removeCallbacksAndMessages(null);
            c87132KVa2.LIZJ.dispose();
        }
    }

    public final void LIZ(C3384q c3384q) {
        if (PatchProxy.proxy(new Object[]{c3384q}, this, LIZ, false, 4).isSupported) {
            return;
        }
        this.LIZJ = c3384q;
        C87132KVa c87132KVa = this.LIZIZ;
        if (c87132KVa != null) {
            c87132KVa.LIZJ(c3384q);
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public final void onInit(Object[] objArr) {
        if (PatchProxy.proxy(new Object[]{objArr}, this, LIZ, false, 2).isSupported) {
            return;
        }
        Context context = this.context;
        Intrinsics.checkNotNullExpressionValue(context, "");
        DataCenter dataCenter = this.dataCenter;
        Intrinsics.checkNotNullExpressionValue(dataCenter, "");
        this.LIZIZ = new C87132KVa(context, dataCenter);
        this.dataCenter.observe("CMD_INTERACT_AUDIO_ZHUFEN_CLICK", this);
        this.dataCenter.observe("data_link_state", this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
        if (((java.lang.Boolean) r1.result).booleanValue() != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0104, code lost:
        if (((java.lang.Boolean) r1.result).booleanValue() == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0126, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual(r3, r0) != false) goto L30;
     */
    @Override // androidx.lifecycle.Observer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* synthetic */ void onChanged(com.bytedance.ies.sdk.widgets.KVData r12) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.broadcastgame.effectgame.AnchorAudioZhufenGameWidget.onChanged(java.lang.Object):void");
    }

    private void LIZ(C3384q c3384q, String str) {
        long j;
        String str2;
        String str3;
        C2WC<String> LIZJ;
        if (PatchProxy.proxy(new Object[]{c3384q, str}, this, LIZ, false, 8).isSupported) {
            return;
        }
        C106862S5w.LIZ(c3384q, str);
        C3383p LJFF = c3384q.LJFF();
        if (LJFF != null) {
            j = LJFF.LIZLLL;
        } else {
            j = 0;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("duration_from", String.valueOf((System.currentTimeMillis() - this.LIZLLL) / 1000));
        hashMap.put("game_id", String.valueOf(j));
        hashMap.put("game_name", c3384q.LJFF);
        hashMap.put("game_type", String.valueOf(c3384q.f26027LJ));
        if (this.dataCenter.get("data_live_mode", (String) LiveMode.VIDEO) == LiveMode.AUDIO) {
            str2 = "voice_live";
        } else {
            str2 = "video_live";
        }
        hashMap.put("live_type", str2);
        hashMap.put("interaction_room_type", str);
        C442103eG LIZ2 = C442103eG.LIZJ.LIZ();
        if (LIZ2 == null || (LIZJ = LIZ2.LIZJ()) == null || (str3 = LIZJ.LIZ()) == null) {
            str3 = "all_used";
        }
        hashMap.put("click_position", str3);
        C4574547f.LIZ().LIZ("livesdk_live_game_click", hashMap, Room.class);
    }
}
