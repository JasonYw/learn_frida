package com.bytedance.android.live.broadcast.gamedetail;

import com.bytedance.android.live.core.monitor.LiveTracingMonitor;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import org.json.JSONObject;
import p003X.C106862S5w;
import p003X.C440033av;

/* loaded from: classes5.dex */
public final class GameDetailMonitor {
    public static ChangeQuickRedirect LIZ;
    public static final GameDetailMonitor LIZIZ = new GameDetailMonitor();

    static {
        Covode.recordClassIndex(16008);
    }

    /* loaded from: classes5.dex */
    public enum Audience {
        DETAIL_REQUEST(300),
        DETAIL_RESPONSE(301);
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public final int status;

        public static Audience valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (Audience) (proxy.isSupported ? proxy.result : Enum.valueOf(Audience.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static Audience[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (Audience[]) (proxy.isSupported ? proxy.result : values().clone());
        }

        static {
            Covode.recordClassIndex(16010);
        }

        Audience(int i) {
            this.status = i;
        }
    }

    /* loaded from: classes5.dex */
    public enum Anchor {
        DETAIL_REQUEST(900),
        DETAIL_RESPONSE(901),
        START_PROMOTE_CLICK(903),
        START_PROMOTE_CLICK_RESPONSE(904),
        CANCEL_PROMOTE_CLICK(905),
        CANCEL_PROMOTE_CLICK_RESPONSE(906),
        RECOMMEND_SAVE(907),
        RECOMMEND_RESPONSE(908),
        ANCHOR_STATUS_RESPONSE(910),
        CONTRACT_AGREE_CLICK(911),
        CONTRACT_AGREE_CLICK_RESPONSE(912),
        JUMP_TO_PROMOTE_MANAGER(913),
        NOTIFY_WEB_UPDATE(914);
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public final int status;

        public static Anchor valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (Anchor) (proxy.isSupported ? proxy.result : Enum.valueOf(Anchor.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static Anchor[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (Anchor[]) (proxy.isSupported ? proxy.result : values().clone());
        }

        static {
            Covode.recordClassIndex(16009);
        }

        Anchor(int i) {
            this.status = i;
        }
    }

    public final void LIZ(int i, LiveTracingMonitor.EventType eventType, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), eventType, jSONObject, jSONObject2, jSONObject3}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(eventType);
        C440033av.LIZIZ.LIZ(i, jSONObject, jSONObject2, jSONObject3, eventType);
    }
}
