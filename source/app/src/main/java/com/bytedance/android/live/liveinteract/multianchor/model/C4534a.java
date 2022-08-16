package com.bytedance.android.live.liveinteract.multianchor.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import com.xiaomi.mipush.sdk.Constants;
import java.util.List;

/* renamed from: com.bytedance.android.live.liveinteract.multianchor.model.a */
/* loaded from: classes3.dex */
public class C4534a {
    public static ChangeQuickRedirect LIZ;
    @SerializedName("fan_ticket")
    public long LIZIZ;
    @SerializedName("host_permission")
    public boolean LIZJ;
    @SerializedName("client_version")
    public long LIZLLL;
    @SerializedName(Constants.APP_ID)

    /* renamed from: LJ */
    public long f26353LJ;
    @SerializedName("device_platform")
    public String LJFF;
    @SerializedName("join_channel_time")
    public long LJI;
    @SerializedName("expected_leave_time")
    public long LJII;
    @SerializedName("current_time")
    public long LJIIIIZZ;
    @SerializedName("list_user_role")
    public int LJIIIZ;
    @SerializedName("fan_ticket_fuzzy_str")
    public String LJIIJ;
    @SerializedName("fan_ticket_real_str")
    public String LJIIJJI;
    @SerializedName("rank_contributor_ids")
    public List<Long> LJIIL;

    static {
        Covode.recordClassIndex(28156);
    }

    public String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "ListUserExtra{fanTicket=" + this.LIZIZ + ", isHost=" + this.LIZJ + ", joinChannelTime=" + this.LJI + ", expectLeaveTime=" + this.LJII + ", currentTime=" + this.LJIIIIZZ + '}';
    }
}
