package com.bytedance.android.live.base.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public class Appointment {
    @SerializedName("anchor_id")
    public long anchorId;
    @SerializedName("anchor_id_str")
    public String anchorIdStr;
    @SerializedName("appointment_id")
    public long appointmentId;
    @SerializedName("appointment_id_str")
    public String appointmentIdStr;
    @SerializedName("appointment_type")
    public int appointmentType;
    @SerializedName("feed_img_url")
    public String coverImgUrl;
    @SerializedName("due_start_time")
    public String dueStartTime;
    @SerializedName("end_time")
    public long endTime;
    @SerializedName("group_id")
    public String groupId;
    @SerializedName("inside_push_text")
    public String insidePushText;
    @SerializedName("inside_push_title")
    public String insidePushTitle;
    @SerializedName("is_living")
    public Boolean isLiving;
    @SerializedName("is_subscribed")
    public Boolean isReserved;
    @SerializedName("live_fragments_map")
    public Map<Long, LiveFragments> liveExtractsMap;
    @SerializedName("operator")
    public String operator;
    @SerializedName("feed_jump_url")
    public String programJumpUrl;
    @SerializedName("room_id")
    public long roomId;
    @SerializedName("room_id_str")
    public String roomIdStr;
    @SerializedName("sec_anchor_id")
    public String secAnchorId;
    @SerializedName("show_status")
    public int showStatus;
    @SerializedName("start_time")
    public long startTime;
    @SerializedName("feed_subtitle")
    public String subTitle;
    @SerializedName("subscriber_count")
    public int subscriberCount;
    @SerializedName("feed_title")
    public String title;

    /* loaded from: classes8.dex */
    public static class LiveFragments {
        @SerializedName("item_ids")
        public List<Long> extractItemIds;

        static {
            Covode.recordClassIndex(13954);
        }
    }

    static {
        Covode.recordClassIndex(13953);
    }
}
