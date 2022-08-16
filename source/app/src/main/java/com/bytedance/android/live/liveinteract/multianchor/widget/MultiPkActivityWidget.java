package com.bytedance.android.live.liveinteract.multianchor.widget;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.multianchor.p367e.C4518a;
import com.bytedance.android.live.liveinteract.multianchor.p374pk.C4536j;
import com.bytedance.android.livesdk.chatroom.widget.RoomWidget;
import com.bytedance.android.livesdk.message.model.LinkMicBattleInviteMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import java.util.LinkedHashMap;
import p003X.AbstractC4569445g;
import p003X.C4574547f;
import p003X.DialogC79392HRi;
import p003X.HQJ;

/* loaded from: classes3.dex */
public final class MultiPkActivityWidget extends RoomWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public DialogC79392HRi LIZIZ;
    public Disposable LIZJ;
    public final CompositeDisposable LIZLLL = new CompositeDisposable();

    static {
        Covode.recordClassIndex(28463);
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 7).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        super.onCreate();
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        super.onDestroy();
        this.LIZLLL.clear();
        Disposable disposable = this.LIZJ;
        if (disposable != null) {
            disposable.dispose();
        }
    }

    public final void LIZ(String str) {
        String str2;
        String str3;
        C4518a c4518a;
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 6).isSupported) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("channel_id", String.valueOf(LinkCrossRoomDataHolder.LJII().LIZLLL));
        C4536j m23737LJ = C4536j.LJJIJIIJI.m23737LJ();
        if (m23737LJ == null || (c4518a = m23737LJ.LJIILJJIL) == null || (str2 = c4518a.LJIIIIZZ) == null) {
            str2 = "anchor";
        }
        linkedHashMap.put("connection_type", str2);
        if (HQJ.LIZIZ.LIZ(LinkMicBattleInviteMessage.BattleInviteType.BattleInviteType_Multiple_Activity.ordinal())) {
            str3 = "1";
        } else {
            str3 = "0";
        }
        linkedHashMap.put("is_oncemore", str3);
        linkedHashMap.put("pk_description", PushConstants.INTENT_ACTIVITY_NAME);
        linkedHashMap.put("pk_activity_type", "chinese_valentine");
        linkedHashMap.put("selection", str);
        C4574547f.LIZ().LIZ("livesdk_connection_invited", linkedHashMap, Room.class);
    }
}
