package com.bytedance.android.live.network.response;

import com.bytedance.android.live.liveinteract.multianchor.model.AnchorLinkUser;
import com.bytedance.android.live.liveinteract.plantform.model.LinkPlayerInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: com.bytedance.android.live.network.response.e */
/* loaded from: classes3.dex */
public final class C5173e {
    public static ChangeQuickRedirect LIZ;
    @SerializedName("user")
    public List<? extends AnchorLinkUser> LIZIZ;
    @SerializedName("scene")
    public int LIZJ;
    @SerializedName("ui_layout")
    public int LIZLLL;
    @SerializedName("play_modes")

    /* renamed from: LJ */
    public List<Integer> f26527LJ;
    @SerializedName("room_id")
    public long LJFF;
    public List<? extends LinkPlayerInfo> LJI;

    static {
        Covode.recordClassIndex(32735);
    }
}
