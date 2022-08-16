package com.bytedance.android.live.broadcast.bgbroadcast;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.core.monitor.LiveTracingMonitor;
import com.bytedance.android.livesdk.widget.v$a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import org.json.JSONObject;
import p003X.AbstractC4569445g;
import p003X.C440943cO;
import p003X.C91211Lwb;
import p003X.K55;
import p003X.K5W;
import p003X.K5Y;
import p003X.K5Z;
import p003X.LK5;

/* loaded from: classes5.dex */
public class BgBroadcastFragment$3 implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public final /* synthetic */ K55 LIZIZ;

    static {
        Covode.recordClassIndex(14664);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (!PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 3).isSupported && event == Lifecycle.Event.ON_RESUME) {
            onResume();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        String idStr;
        String idStr2;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        K5Y k5y = K5Y.LJIJJLI;
        Room room = this.LIZIZ.LJIIIZ;
        if (!PatchProxy.proxy(new Object[]{room}, k5y, K5Y.LIZ, false, 7).isSupported && room != null && (idStr2 = room.getIdStr()) != null) {
            JSONObject jSONObject = new JSONObject();
            C440943cO.LIZ(jSONObject, "room_id", idStr2);
            C91211Lwb.LIZ("ttlive_anchor_screenshot_track", 202, jSONObject);
        }
        K5Z k5z = K5Z.LJIJI;
        Room room2 = this.LIZIZ.LJIIIZ;
        if (!PatchProxy.proxy(new Object[]{room2}, k5z, K5Z.LIZ, false, 6).isSupported && room2 != null && (idStr = room2.getIdStr()) != null) {
            JSONObject jSONObject2 = new JSONObject();
            C440943cO.LIZ(jSONObject2, "room_id", idStr);
            LiveTracingMonitor.LIZ("ttlive_anchor_gamelive_track", K5Z.LIZIZ, 202, 0L, jSONObject2);
        }
        v$a mo15264LJ = new v$a(this.LIZIZ.getActivity()).mo15264LJ(2131587244);
        mo15264LJ.LIZIZ(LK5.LIZ(2131587242));
        mo15264LJ.LIZIZ(0, 2131587243, K5W.LIZIZ).LIZJ(false);
        this.LIZIZ.mo29786getLifecycle().removeObserver(this);
    }

    public BgBroadcastFragment$3(K55 k55) {
        this.LIZIZ = k55;
    }
}
