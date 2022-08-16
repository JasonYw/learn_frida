package com.bytedance.android.live.base.model.feed;

import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.android.live.base.model.Appointment;
import com.bytedance.android.live.base.model.C2806b;
import com.bytedance.android.live.base.model.banner.C2807a;
import com.bytedance.android.live.base.model.banner.C2808b;
import com.bytedance.android.live.base.model.banner.C2809c;
import com.bytedance.android.live.base.model.feedback.FeedbackCard;
import com.bytedance.android.live.base.model.follow.PlaceHolder;
import com.bytedance.android.live.base.model.follow.ScheduledLiveItem;
import com.bytedance.android.live.base.model.p247ad.AdExtra;
import com.bytedance.android.live.base.model.tab.C2847a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.episode.Episode;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.GsonProtectorUtils;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p003X.AbstractC99942PXs;
import p003X.C100634PkC;
import p003X.C101413Pwl;
import p003X.KM9;

/* loaded from: classes8.dex */
public class FeedItem {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("ad_extra")
    public AdExtra adExtra;
    public transient JSONObject adJSONObject;
    @SerializedName("ad")
    public String adRawString;
    @SerializedName("appointment")
    public Appointment appointment;
    @SerializedName("banner")
    public C2808b bannerContainer;
    public transient List<C2807a> banners;
    @SerializedName("cate_cell")
    public C2806b cateCell;
    @SerializedName(C2521l.LJIIL)
    public JsonObject data;
    @SerializedName("episode")
    public Episode episode;
    @SerializedName("live_feedback_card")
    public FeedbackCard feedbackCard;
    @SerializedName("is_ad")
    public boolean isAd;
    @SerializedName("is_pseudo_living")
    public boolean isPseudoLiving;
    @SerializedName("is_recommend_card")
    public boolean isRecommendCard;
    public transient AbstractC99942PXs item;
    @SerializedName("live_reason")
    public String liveReason;
    public transient String logPb;
    public List<Room> mSkylightList;
    public transient Object object;
    @SerializedName("placeholder")
    public PlaceHolder placeHolder;
    @SerializedName("rank_round_banner")
    public C2809c rankRoundBanner;
    public transient boolean repeatDisable;
    @SerializedName("rid")
    public String resId;
    public transient Room room;
    @SerializedName("UserLiveRecord")
    public ScheduledLiveItem scheduledLive;
    @SerializedName("tabs")
    public List<C2847a> tabs;
    @SerializedName("tags")
    public List<String> tags;
    @SerializedName("type")
    public int type;
    public transient String searchReqId = "";
    public transient String searchId = "";

    static {
        Covode.recordClassIndex(14033);
    }

    public List<Room> getSkylightList() {
        return this.mSkylightList;
    }

    /* renamed from: item */
    public AbstractC99942PXs m25365item() {
        return this.item;
    }

    public String logPb() {
        return this.logPb;
    }

    public String requestId() {
        return this.resId;
    }

    public String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        AbstractC99942PXs abstractC99942PXs = this.item;
        if (abstractC99942PXs == null) {
            return "null";
        }
        return abstractC99942PXs.toString();
    }

    public Room getRoom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (Room) proxy.result;
        }
        Room room = this.room;
        if (room != null) {
            return room;
        }
        this.room = (Room) GsonProtectorUtils.fromJson(KM9.LIZ(), (JsonElement) this.data, (Class<Object>) Room.class);
        return this.room;
    }

    public int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        Object[] objArr = {this.item};
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{objArr}, null, C100634PkC.LIZ, true, 2);
        if (proxy2.isSupported) {
            return ((Integer) proxy2.result).intValue();
        }
        return Arrays.hashCode(objArr);
    }

    public void init() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5).isSupported) {
            return;
        }
        int i = this.type;
        if (i != 1 && i != 2 && i != 4 && i != 5) {
            if (i == 3) {
                try {
                    String str = new String(Base64.decode(this.adRawString, 1));
                    if (!TextUtils.isEmpty(str)) {
                        this.adJSONObject = new JSONObject(str);
                        this.item = (AbstractC99942PXs) GsonProtectorUtils.fromJson(KM9.LIZ(), str, (Class<Object>) C101413Pwl.class);
                        long currentTimeMillis = System.currentTimeMillis();
                        ((C101413Pwl) this.item).LJJIJIL = currentTimeMillis;
                        this.adJSONObject.put("subId", currentTimeMillis);
                        return;
                    }
                    return;
                } catch (JSONException e) {
                    e.printStackTrace();
                    return;
                }
            }
            return;
        }
        this.item = getRoom();
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public void setSkylightList(List<Room> list) {
        this.mSkylightList = list;
    }

    public void setRoomFrom(FeedItem feedItem) {
        this.data = feedItem.data;
        this.room = feedItem.room;
    }

    public boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC99942PXs abstractC99942PXs = this.item;
        AbstractC99942PXs abstractC99942PXs2 = ((FeedItem) obj).item;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{abstractC99942PXs, abstractC99942PXs2}, null, C100634PkC.LIZ, true, 1);
        if (proxy2.isSupported) {
            return ((Boolean) proxy2.result).booleanValue();
        }
        if (abstractC99942PXs == abstractC99942PXs2 || (abstractC99942PXs != null && abstractC99942PXs.equals(abstractC99942PXs2))) {
            return true;
        }
        return false;
    }

    public static FeedItem create(int i, AbstractC99942PXs abstractC99942PXs) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), abstractC99942PXs}, null, changeQuickRedirect, true, 6);
        if (proxy.isSupported) {
            return (FeedItem) proxy.result;
        }
        FeedItem feedItem = new FeedItem();
        feedItem.type = i;
        feedItem.item = abstractC99942PXs;
        return feedItem;
    }

    public static FeedItem create(int i, AbstractC99942PXs abstractC99942PXs, String str, String str2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), abstractC99942PXs, str, str2}, null, changeQuickRedirect, true, 7);
        if (proxy.isSupported) {
            return (FeedItem) proxy.result;
        }
        FeedItem feedItem = new FeedItem();
        feedItem.type = i;
        feedItem.item = abstractC99942PXs;
        feedItem.logPb = str;
        feedItem.resId = str2;
        return feedItem;
    }
}
