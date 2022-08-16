package com.bytedance.android.live.core.monitor;

import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p002O.C0002O;
import p003X.AbstractC91212Lwc;
import p003X.C91210Lwa;
import p003X.C91220Lwk;

/* loaded from: classes5.dex */
public final class LiveTracingMonitor {
    public static ChangeQuickRedirect LIZ;
    public static SettingKey<Boolean> LIZIZ = new SettingKey<>("live_sdk_enable_dolphin_platform_test_key", "dolphin平台精准熔断演练", Boolean.FALSE, Boolean.FALSE);

    public static void LIZ(String str, EventModule eventModule, JSONObject jSONObject) {
        if (PatchProxy.proxy(new Object[]{str, eventModule, jSONObject}, null, LIZ, true, 2).isSupported) {
            return;
        }
        LIZ(str, eventModule, EventType.BUSSINESS_API_CALL, (JSONObject) null, (JSONObject) null, jSONObject);
    }

    public static void LIZ(String str, EventModule eventModule, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        if (!PatchProxy.proxy(new Object[]{str, eventModule, jSONObject, jSONObject2, jSONObject3}, null, LIZ, true, 7).isSupported && !C91210Lwa.LIZ(str)) {
            if (jSONObject3 == null) {
                jSONObject3 = new JSONObject();
            }
            LIZ(jSONObject3, "event_module", eventModule.mName);
            LIZ(jSONObject3, "event_type", EventType.BUSSINESS_API_CALL.mName);
            LIZ(str, jSONObject, jSONObject2, jSONObject3);
        }
    }

    public static void LIZ(String str, EventModule eventModule, EventType eventType, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        if (!PatchProxy.proxy(new Object[]{str, eventModule, eventType, jSONObject, jSONObject2, jSONObject3}, null, LIZ, true, 8).isSupported && !C91210Lwa.LIZ(str)) {
            if (jSONObject3 == null) {
                jSONObject3 = new JSONObject();
            }
            LIZ(jSONObject3, "event_module", eventModule.mName);
            LIZ(jSONObject3, "event_type", eventType.mName);
            LIZ(str, jSONObject, jSONObject2, jSONObject3);
        }
    }

    public static void LIZ(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        if (!PatchProxy.proxy(new Object[]{str, jSONObject, jSONObject2, jSONObject3}, null, LIZ, true, 9).isSupported && LIZ() != null) {
            if (jSONObject3 == null) {
                jSONObject3 = new JSONObject();
            }
            if (!str.startsWith("ttlive_")) {
                str = C0002O.m25086C("ttlive_", str);
            }
            JSONObject LIZIZ2 = LIZIZ(LIZ(jSONObject3));
            AbstractC91212Lwc LIZ2 = LIZ();
            if (LIZ2 == null) {
                return;
            }
            LIZ2.LIZ(str, jSONObject, jSONObject2, LIZIZ2);
        }
    }

    public static void LIZ(JSONObject jSONObject, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{jSONObject, str, str2}, null, LIZ, true, 13).isSupported) {
            return;
        }
        try {
            jSONObject.put(str, str2);
        } catch (JSONException unused) {
        }
    }

    public static void LIZ(JSONObject jSONObject, String str, long j) {
        if (PatchProxy.proxy(new Object[]{jSONObject, str, new Long(j)}, null, LIZ, true, 14).isSupported) {
            return;
        }
        try {
            jSONObject.put(str, j);
        } catch (JSONException unused) {
        }
    }

    /* loaded from: classes5.dex */
    public enum EventModule {
        common("common"),
        vs("vs"),
        NETWORK("network"),
        ROOM_APM("room_apm"),
        ENTER_ROOM("enter_room"),
        OPEN_LIVE("anchor_live"),
        PUSH_STREAM("push_stream"),
        PULL_STREAM("pull_stream"),
        INTERACT_STREAM("interact_stream"),
        BEAUTY("beauty"),
        FACE_STICKER("face_sticker"),
        EFFECT_GAME("effect_game"),
        PK(PushConstants.URI_PACKAGE_NAME),
        AUDIENCE_INTERACT("audience_interact"),
        FM_INTERACT("fm_interact"),
        MULTI_AUDIO("multi_audio"),
        BIG_PARTY("big_party"),
        MULTI_LINKER("muti_linker"),
        TEXT_MESSAGE("text_message"),
        INTERACTION_OPT("interaction_opt"),
        REAL_NAME("real_name"),
        ACTIVITY(PushConstants.INTENT_ACTIVITY_NAME),
        KTV("ktv"),
        DIGG("digg"),
        OPEN_PLATFORM("interactive_open_platform"),
        PLAYER("palyer"),
        PREVIEW("preview"),
        GAME_LIVE("game_live"),
        LIVE_MESSAGE("live_message"),
        SETTING("setting"),
        FRIEND_ROOM_BASE("friend_room_base"),
        FRIEND_ROOM_COMMON("friend_room_common"),
        SHORT_VIDEO(UGCMonitor.TYPE_SHORT_VIDEO),
        GAME_PROMOTE("cooperation_partner"),
        GAME_PLAY_TOGETHER("game_play_together"),
        LIVE_CORE("livecore"),
        hybrid("hybrid"),
        LIVE_GIFT("live_gift"),
        ENTER_ANIM("enter_anim"),
        LIVE_PROFIT("live_profit"),
        INNER_DRAW("inner_draw"),
        PCDN("pcdn"),
        LIVE_ROOM_OBSERVER("live_room_observer"),
        STRATEGY("strategy"),
        AUDIO("audio"),
        DRESS("dress"),
        DANMAKU("danmaku"),
        COMMENT(UGCMonitor.EVENT_COMMENT),
        PIN_COMMENT("pin_comment"),
        TEXT_RENDER_ENGINE("text_render_engine"),
        FANS_CLUB("fans_club"),
        SUBSCRIBE_VIP("subscribe_vip"),
        PRIVILEGE_INFO("privilege_info"),
        PRIVILEGE_DANMAKU("privilege_danmaku"),
        RANK("rank"),
        PORTAL("portal"),
        GAME_ORDER("game_order"),
        PREDICTOR_PLAYING("predictor_playing"),
        ROOM_BATTLE("room_battle"),
        TEAM_FIGHT("team_fight"),
        GUEST_BATTLE("guest_battle");
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public String mName;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static EventModule[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            if (proxy.isSupported) {
                return (EventModule[]) proxy.result;
            }
            return (EventModule[]) values().clone();
        }

        static {
            Covode.recordClassIndex(23486);
        }

        public static EventModule valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (EventModule) proxy.result;
            }
            return (EventModule) Enum.valueOf(EventModule.class, str);
        }

        EventModule(String str) {
            this.mName = str;
        }
    }

    /* loaded from: classes3.dex */
    public enum EventType {
        BUSSINESS_API_CALL("bussiness_api_call"),
        SERVER_API_CALL("server_api_call"),
        MESSAGE_RECEIVED("message_received"),
        SDK_INTERFACE_CALL("sdk_interface_call"),
        SDK_CALLBACK("sdk_callback");
        
        public static ChangeQuickRedirect changeQuickRedirect;
        public String mName;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static EventType[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            if (proxy.isSupported) {
                return (EventType[]) proxy.result;
            }
            return (EventType[]) values().clone();
        }

        static {
            Covode.recordClassIndex(23487);
        }

        public static EventType valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (EventType) proxy.result;
            }
            return (EventType) Enum.valueOf(EventType.class, str);
        }

        EventType(String str) {
            this.mName = str;
        }
    }

    static {
        Covode.recordClassIndex(23485);
    }

    public static AbstractC91212Lwc LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, LIZ, true, 12);
        if (proxy.isSupported) {
            return (AbstractC91212Lwc) proxy.result;
        }
        return (AbstractC91212Lwc) C91220Lwk.LIZ(AbstractC91212Lwc.class);
    }

    public static JSONObject LIZ(JSONObject jSONObject) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{jSONObject}, null, LIZ, true, 10);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        if (jSONObject != null) {
            LIZ(jSONObject, "event_source", "live_platform_client");
        }
        return jSONObject;
    }

    public static JSONObject LIZIZ(JSONObject jSONObject) {
        String str;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{jSONObject}, null, LIZ, true, 15);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        JSONObject jSONObject2 = new JSONObject();
        if (jSONObject != null) {
            try {
                JSONArray names = jSONObject.names();
                if (names != null) {
                    int length = names.length();
                    for (int i = 0; i < length; i++) {
                        String string = names.getString(i);
                        if (string == null) {
                            str = "";
                        } else {
                            str = string;
                        }
                        Object obj = jSONObject.get(str);
                        if (!(obj instanceof String)) {
                            jSONObject.put(string, String.valueOf(obj));
                        }
                    }
                }
                jSONObject2.put("extra", jSONObject);
                LIZ(jSONObject2, "tag", "ttlive_sdk");
                LIZ(jSONObject2, "ttlive_sdk_version", "2560");
            } catch (Exception unused) {
            }
        }
        return jSONObject2;
    }

    public static void LIZ(String str, EventModule eventModule, int i, long j) {
        if (PatchProxy.proxy(new Object[]{str, eventModule, Integer.valueOf(i), 0L}, null, LIZ, true, 4).isSupported) {
            return;
        }
        LIZ(str, eventModule, i, 0L, (JSONObject) null);
    }

    public static void LIZIZ(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        if (PatchProxy.proxy(new Object[]{str, jSONObject, jSONObject2, jSONObject3}, null, LIZ, true, 16).isSupported || LIZ() == null || C91210Lwa.LIZ(str)) {
            return;
        }
        if (jSONObject3 == null) {
            jSONObject3 = new JSONObject();
        }
        if (!str.startsWith("ttlive_")) {
            str = C0002O.m25086C("ttlive_", str);
        }
        LIZ(jSONObject3, "tag", "ttlive_sdk");
        LIZ(jSONObject3, "ttlive_sdk_version", "2560");
        AbstractC91212Lwc LIZ2 = LIZ();
        if (LIZ2 != null) {
            LIZ2.LIZ(str, jSONObject, jSONObject2, jSONObject3);
        }
    }

    public static void LIZ(String str, EventModule eventModule, EventType eventType, JSONObject jSONObject) {
        if (PatchProxy.proxy(new Object[]{str, eventModule, eventType, jSONObject}, null, LIZ, true, 1).isSupported) {
            return;
        }
        LIZ(str, eventModule, eventType, (JSONObject) null, (JSONObject) null, jSONObject);
    }

    public static void LIZ(String str, EventModule eventModule, int i, long j, JSONObject jSONObject) {
        if (PatchProxy.proxy(new Object[]{str, eventModule, Integer.valueOf(i), new Long(j), jSONObject}, null, LIZ, true, 5).isSupported || C91210Lwa.LIZ(str)) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        LIZ(jSONObject2, "status_code", i);
        if (j > 0) {
            LIZ(jSONObject3, "latency", j);
        }
        LIZ(str, eventModule, EventType.BUSSINESS_API_CALL, jSONObject2, jSONObject3, jSONObject);
    }

    public static void LIZ(String str, EventModule eventModule, long j, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        if (PatchProxy.proxy(new Object[]{str, eventModule, new Long(j), jSONObject, jSONObject2, jSONObject3}, null, LIZ, true, 6).isSupported || C91210Lwa.LIZ(str)) {
            return;
        }
        if (jSONObject3 == null) {
            jSONObject3 = new JSONObject();
        }
        if (j > 0) {
            LIZ(jSONObject2, "latency", j);
        }
        LIZ(jSONObject3, "event_module", eventModule.mName);
        LIZ(jSONObject3, "event_type", EventType.BUSSINESS_API_CALL.mName);
        LIZ(str, jSONObject, jSONObject2, jSONObject3);
    }

    public static void LIZ(String str, EventModule eventModule, EventType eventType, int i, String str2, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        JSONObject jSONObject4 = jSONObject3;
        if (PatchProxy.proxy(new Object[]{str, eventModule, eventType, Integer.valueOf(i), str2, jSONObject, jSONObject2, jSONObject4}, null, LIZ, true, 3).isSupported || C91210Lwa.LIZ(str)) {
            return;
        }
        if (jSONObject4 == null) {
            jSONObject4 = new JSONObject();
        }
        LIZ(jSONObject4, "status_code", String.valueOf(i));
        LIZ(jSONObject4, "status_msg", String.valueOf(str2));
        LIZ(str, eventModule, eventType, jSONObject, jSONObject2, jSONObject4);
    }
}
