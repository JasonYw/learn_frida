package com.bytedance.android.live.broadcast.api.model;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.gson.BooleanTypeAdapter;
import com.bytedance.android.live.gson.FeedItemTypeAdapter;
import com.bytedance.android.live.gson.RoomTypeAdapter;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.GsonProtectorUtils;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import p003X.C86877KLf;
import p003X.KJT;

/* loaded from: classes5.dex */
public final class PreviewSourceParam implements Serializable {
    public static final KJT Companion = new KJT((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect;
    public static final GsonBuilder gsonBuilder;
    public static final Gson gsonInstance;
    @SerializedName("action")
    @Expose
    public String action;
    @SerializedName("challenge_id")
    @Expose
    public String challengeId;
    @SerializedName("optional_challenge")
    @Expose
    public Boolean challengeTaskOptional;
    @SerializedName(PushConstants.TASK_ID)
    @Expose
    public String commerceTaskId;
    @SerializedName("enable_show_chat_tip")
    @Expose
    public String enableShowChatTip;
    @SerializedName("enter_from")
    @Expose
    public String enterFrom;
    @SerializedName("enter_from_merge")
    @Expose
    public String enterFromMerge;
    @SerializedName("enter_method")
    @Expose
    public String enterMethod;
    @SerializedName("guide_params")
    @Expose
    public String guideParam;
    @SerializedName("guide_toolbar_bubble_tip")
    @Expose
    public C86877KLf guideToolbarBubbleTip;
    @Expose(deserialize = false, serialize = false)
    public boolean hasInit;
    @SerializedName("ktv_type")
    @Expose
    public Integer ktvType;
    @SerializedName("live_game_category")
    @Expose
    public CategoryNode liveGameCategory;
    @SerializedName("live_scene")
    @Expose
    public String liveScene;
    @SerializedName("live_type")
    @Expose
    public String liveType;
    @SerializedName("timor_schema")
    @Expose
    public String miniAppSchema;
    @SerializedName("need_invite")
    @Expose
    public Boolean needInvite;
    @SerializedName("open_paid_live_panel")
    @Expose
    public Boolean openPaidLivePanel;
    @SerializedName("open_panel_type")
    @Expose
    public Integer openPanelType;
    @SerializedName("open_type")
    @Expose
    public String openType;
    @SerializedName("owner_id")
    @Expose
    public String ownerId;
    @SerializedName("payload")
    @Expose(serialize = false)
    public String payLoad;
    @SerializedName("platform_activity_id")
    @Expose
    public String platformActivityId;
    @SerializedName("play_mode")
    @Expose
    public ArrayList<Integer> playMode;
    @SerializedName("props_activity_type")
    @Expose
    public Integer propsActivityType;
    @SerializedName("scene")
    @Expose
    public Integer scene;
    @SerializedName("shoot_way")
    @Expose
    public String shootWay;
    @SerializedName("live_sticker_id")
    @Expose
    public String stickerId;
    @SerializedName("optional_sticker")
    @Expose
    public Boolean stickerTaskOptional;
    @SerializedName("ticket_from_page")
    @Expose
    public String ticketFromPage;
    @SerializedName("ticket_id")
    @Expose
    public String ticketId;
    @SerializedName("uilayout")
    @Expose
    public Integer uiLayout;
    @Expose(deserialize = false, serialize = false)
    public String originalRawString = "";
    public final Lazy payLoadArray$delegate = LazyKt__LazyJVMKt.lazy(new PreviewSourceParam$payLoadArray$2(this));

    public final C2919v LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        return (C2919v) (proxy.isSupported ? proxy.result : this.payLoadArray$delegate.mo27335getValue());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        String json = GsonProtectorUtils.toJson(gsonInstance, this);
        Intrinsics.checkNotNullExpressionValue(json, "");
        return json;
    }

    public final boolean LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!TextUtils.equals(this.action, "add") || TextUtils.isEmpty(this.ticketId)) {
            return false;
        }
        if (!TextUtils.equals(this.ticketFromPage, "invite_page") && !TextUtils.equals(this.ticketFromPage, "sale_manage_page")) {
            return false;
        }
        return true;
    }

    static {
        Covode.recordClassIndex(14502);
        GsonBuilder gsonBuilder2 = new GsonBuilder();
        gsonBuilder2.excludeFieldsWithoutExposeAnnotation();
        gsonBuilder2.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES);
        gsonBuilder2.registerTypeAdapter(Room.class, new RoomTypeAdapter());
        gsonBuilder2.registerTypeAdapter(FeedItem.class, new FeedItemTypeAdapter());
        gsonBuilder2.registerTypeAdapter(Boolean.TYPE, new BooleanTypeAdapter());
        gsonBuilder2.registerTypeAdapter(Boolean.TYPE, new BooleanTypeAdapter());
        gsonBuilder = gsonBuilder2;
        gsonInstance = gsonBuilder2.create();
    }

    public final Map<String, String> LIZIZ() {
        Object obj;
        Object obj2;
        boolean z = false;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            JSONObject jSONObject = new JSONObject(toString());
            Iterator<String> keys = jSONObject.keys();
            Intrinsics.checkNotNullExpressionValue(keys, "");
            while (keys.hasNext()) {
                String next = keys.next();
                if (!Intrinsics.areEqual(next, "pay_load_array$delegate") && (obj2 = jSONObject.get(next)) != null) {
                    Intrinsics.checkNotNullExpressionValue(next, "");
                    linkedHashMap.put(next, obj2.toString());
                }
            }
            if (!LIZ().LIZIZ.isEmpty()) {
                linkedHashMap.put("payload", LIZ().toString());
            }
            if (this.originalRawString.length() > 0) {
                z = true;
            }
            if (z) {
                JSONObject jSONObject2 = new JSONObject(this.originalRawString);
                Iterator<String> keys2 = jSONObject2.keys();
                Intrinsics.checkNotNullExpressionValue(keys2, "");
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    if (!linkedHashMap.containsKey(next2) && (obj = jSONObject2.get(next2)) != null) {
                        Intrinsics.checkNotNullExpressionValue(next2, "");
                        linkedHashMap.put(next2, obj.toString());
                        ALogger.m15795w("PreviewSourceParam", "add key:{" + next2 + "}-value:{" + obj + "} to map which is not deserialized");
                    }
                }
            }
        } catch (JSONException e) {
            ALogger.m15799e("PreviewSourceParam", "sourceParam to Map:" + e.getMessage(), e);
        }
        return linkedHashMap;
    }
}
