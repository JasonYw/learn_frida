package com.bytedance.android.live.core.performance;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.GsonProtectorUtils;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p003X.C91211Lwb;
import p003X.KM9;
import p003X.LOA;

/* loaded from: classes5.dex */
public final class TimeCostUtil {
    public static ChangeQuickRedirect LIZ;
    public static boolean LIZIZ;
    public static String LIZJ = "ttlive_feed_base_performance_monitor_all";
    public static String LIZLLL = "ttlive_create_room_base_performance_monitor_all";

    /* renamed from: LJ */
    public static String f26175LJ = "ttlive_enter_room_base_performance_monitor_all";
    public static String LJFF = "ttlive_pk_watch_room_base_performance_monitor_all";
    public static ConcurrentHashMap<String, Long> LJI = new ConcurrentHashMap<>(200);
    public static ConcurrentHashMap<String, Long> LJII = new ConcurrentHashMap<>(200);

    public static void LIZ(JSONObject jSONObject, String str, long j) {
        if (PatchProxy.proxy(new Object[]{jSONObject, str, new Long(j)}, null, LIZ, true, 11).isSupported) {
            return;
        }
        try {
            jSONObject.put(str, j);
        } catch (JSONException unused) {
        }
    }

    public static void LIZ(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        if (PatchProxy.proxy(new Object[]{jSONObject, str, jSONObject2}, null, LIZ, true, 15).isSupported) {
            return;
        }
        try {
            jSONObject.put(str, jSONObject2);
        } catch (JSONException unused) {
        }
    }

    /* loaded from: classes5.dex */
    public enum Tag {
        LiveFeedInit,
        LiveFeedPreview,
        LiveFeedScroll,
        StartLivePlay,
        ScrollWatchLivePlay,
        CreateStartLivePreview,
        CreateLive,
        ShowBInteractionFirstWidget,
        ShowVideoGift,
        ShowBarrage,
        ShowCInteractionFirstWidget,
        LivePk,
        ShowBEFViewGift;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static Tag[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            if (proxy.isSupported) {
                return (Tag[]) proxy.result;
            }
            return (Tag[]) values().clone();
        }

        static {
            Covode.recordClassIndex(23531);
        }

        public static Tag valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (Tag) proxy.result;
            }
            return (Tag) Enum.valueOf(Tag.class, str);
        }
    }

    static {
        Covode.recordClassIndex(23530);
    }

    public static void LIZJ(Tag tag) {
        if (PatchProxy.proxy(new Object[]{tag}, null, LIZ, true, 5).isSupported || !LIZIZ) {
            return;
        }
        LIZ(tag, (HashMap<String, String>) null);
    }

    public static void LIZIZ(Tag tag) {
        if (PatchProxy.proxy(new Object[]{tag}, null, LIZ, true, 4).isSupported || !LIZIZ) {
            return;
        }
        LJI.put(tag.name(), Long.valueOf(SystemClock.elapsedRealtime()));
    }

    public static void LIZ(Tag tag) {
        if (PatchProxy.proxy(new Object[]{tag}, null, LIZ, true, 2).isSupported || tag == null) {
            return;
        }
        if (LJI.containsKey(tag.name())) {
            LJI.remove(tag.name());
        }
        if (LJII.containsKey(tag.name())) {
            LJII.remove(tag.name());
        }
        LOA.LIZ().LIZIZ(tag.name());
    }

    public static String LIZ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, LIZ, true, 9);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        String str2 = LIZJ;
        if (!TextUtils.equals(str, Tag.LiveFeedInit.name()) && !TextUtils.equals(str, Tag.LiveFeedPreview.name()) && !TextUtils.equals(str, Tag.LiveFeedScroll.name())) {
            if (!TextUtils.equals(str, Tag.CreateStartLivePreview.name()) && !TextUtils.equals(str, Tag.CreateLive.name()) && !TextUtils.equals(str, Tag.CreateStartLivePreview.name()) && !TextUtils.equals(str, Tag.ShowBInteractionFirstWidget.name())) {
                if (!TextUtils.equals(str, Tag.StartLivePlay.name()) && !TextUtils.equals(str, Tag.ScrollWatchLivePlay.name()) && !TextUtils.equals(str, Tag.ShowCInteractionFirstWidget.name()) && !TextUtils.equals(str, Tag.ShowBarrage.name()) && !TextUtils.equals(str, Tag.ShowVideoGift.name())) {
                    if (TextUtils.equals(str, Tag.LivePk.name())) {
                        return LJFF;
                    }
                    return str2;
                }
                return f26175LJ;
            }
            return LIZLLL;
        }
        return LIZJ;
    }

    public static HashMap<String, String> LIZ(String str, String str2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2}, null, LIZ, true, 1);
        if (proxy.isSupported) {
            return (HashMap) proxy.result;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(str, str2);
        return hashMap;
    }

    public static void LIZ(Tag tag, HashMap<String, String> hashMap) {
        if (PatchProxy.proxy(new Object[]{tag, hashMap}, null, LIZ, true, 6).isSupported || !LIZIZ || !LJI.containsKey(tag.name())) {
            return;
        }
        LJII.put(tag.name(), Long.valueOf(SystemClock.elapsedRealtime()));
        LIZ(tag.name(), hashMap);
    }

    public static void LIZ(String str, HashMap<String, String> hashMap) {
        String str2;
        if (!PatchProxy.proxy(new Object[]{str, hashMap}, null, LIZ, true, 7).isSupported && LJII.containsKey(str) && LJI.containsKey(str)) {
            long longValue = LJII.get(str).longValue() - LJI.get(str).longValue();
            if (hashMap != null) {
                str2 = GsonProtectorUtils.toJson(KM9.LIZ(), hashMap);
            } else {
                str2 = "";
            }
            LJII.remove(str);
            LJI.remove(str);
            LIZ(str, longValue, str2);
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

    public static void LIZ(String str, long j, String str2) {
        if (PatchProxy.proxy(new Object[]{str, new Long(j), str2}, null, LIZ, true, 8).isSupported) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        LIZ(jSONObject, "biz", str);
        LIZ(jSONObject, "duration", j);
        if (!TextUtils.isEmpty(str2)) {
            LIZ(jSONObject, "extra", str2);
        }
        C91211Lwb.LIZIZ(LIZ(str), 0, jSONObject);
    }
}
