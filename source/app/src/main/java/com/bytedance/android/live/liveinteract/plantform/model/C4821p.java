package com.bytedance.android.live.liveinteract.plantform.model;

import com.bytedance.android.livesdkapi.message.C9605p;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: com.bytedance.android.live.liveinteract.plantform.model.p */
/* loaded from: classes12.dex */
public final class C4821p {
    @SerializedName("users")
    public List<C4822q> LIZ;
    @SerializedName("has_more")
    public boolean LIZIZ;
    @SerializedName("total_count")
    public int LIZJ;
    @SerializedName("next_cursor")
    public String LIZLLL = "";
    @SerializedName("current")

    /* renamed from: LJ */
    public C4822q f26424LJ;
    @SerializedName("title")
    public C9605p LJFF;
    @SerializedName("now")
    public long LJI;

    static {
        Covode.recordClassIndex(29438);
    }
}
