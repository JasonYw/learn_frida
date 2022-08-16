package com.bytedance.android.live.liveinteract.plantform.model;

import com.bytedance.android.livesdkapi.message.C9605p;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.live.liveinteract.plantform.model.s */
/* loaded from: classes3.dex */
public final class C4823s {
    @SerializedName("has_more")
    public boolean LIZIZ;
    @SerializedName("total_count")
    public long LIZJ;
    @SerializedName("display_text")

    /* renamed from: LJ */
    public C9605p f26426LJ;
    @SerializedName("waiting_user")
    public C4824t LJFF;
    @SerializedName("now")
    public long LJII;
    @SerializedName("add_price_audience_num")
    public long LJIIIIZZ;
    @SerializedName("show_paid_linkmic_guide")
    public boolean LJIIIZ;
    @SerializedName("has_prepare_apply")
    public boolean LJIIJ;
    @SerializedName("user")
    public List<C4824t> LIZ = new ArrayList();
    @SerializedName("next_cursor")
    public String LIZLLL = "";
    @SerializedName("sort_strategy")
    public int LJI = 40;

    static {
        Covode.recordClassIndex(29441);
    }
}
