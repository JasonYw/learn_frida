package com.bytedance.android.live.base.model.dynamic;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.announce.AnnouncementDynamicInfo;
import com.bytedance.android.livesdkapi.depend.model.live.C9501d;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.List;

/* renamed from: com.bytedance.android.live.base.model.dynamic.b */
/* loaded from: classes8.dex */
public class C2817b {
    @SerializedName("max_time")
    public long LIZ;
    @SerializedName("has_more")
    public boolean LIZIZ;
    @SerializedName(PushConstants.MZ_PUSH_MESSAGE_METHOD_ACTION_PUSH_STATUS)
    public long LIZJ;
    @SerializedName("is_announcement_available")
    public boolean LIZLLL;
    @SerializedName("has_video_permission")

    /* renamed from: LJ */
    public boolean f25732LJ;
    @SerializedName("pending_release_count")
    public long LJFF;
    @SerializedName("anchor_nick_name")
    public String LJI = "";
    @SerializedName("anchor_avatar")
    public ImageModel LJII;
    @SerializedName("announcement_data")
    public List<AnnouncementDynamicInfo> LJIIIIZZ;
    @SerializedName("preview_data")
    public List<C2821f> LJIIIZ;
    @SerializedName("history_data")
    public List<C2818c> LJIIJ;
    @SerializedName("hide_all_history")
    public boolean LJIIJJI;
    @SerializedName("banner")
    public List<C9501d> LJIIL;
    @SerializedName("preview_guide_publish_data")
    public C2822g LJIILIIL;

    static {
        Covode.recordClassIndex(14008);
    }
}
