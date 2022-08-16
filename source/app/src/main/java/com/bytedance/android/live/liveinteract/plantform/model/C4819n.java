package com.bytedance.android.live.liveinteract.plantform.model;

import com.bytedance.android.live.liveinteract.multianchor.model.AnchorLinkUser;
import com.bytedance.android.live.liveinteract.multianchor.model.LinkmicPositionItem;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.android.live.liveinteract.plantform.model.n */
/* loaded from: classes3.dex */
public final class C4819n {
    @SerializedName("user")
    public List<AnchorLinkUser> LIZ;
    @SerializedName("locked_positions")
    public List<LinkmicPositionItem> LIZIZ;
    @SerializedName("has_more")
    public boolean LIZJ;
    @SerializedName("total_count")
    public int LIZLLL;
    @SerializedName("next_cursor")

    /* renamed from: LJ */
    public String f26423LJ;
    @SerializedName("pre_link_users")
    public List<AnchorLinkUser> LJFF;
    @SerializedName("positions")
    public List<LinkmicPositionItem> LJI;
    @SerializedName("linker_content_map")
    public Map<Long, RoomLinkerContent> LJII;
    @SerializedName("version")
    public long LJIIIIZZ;

    static {
        Covode.recordClassIndex(29436);
    }
}
