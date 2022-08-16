package com.bytedance.android.live.liveinteract.plantform.model;

import com.bytedance.android.livesdk.message.model.C9028x;
import com.bytedance.android.livesdk.message.model.C9029y;
import com.bytedance.android.livesdk.message.model.C9030z;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: com.bytedance.android.live.liveinteract.plantform.model.f */
/* loaded from: classes3.dex */
public final class C4812f {
    @SerializedName("status")
    public int LIZ;
    @SerializedName("bid_info")
    public C9028x LIZIZ;
    @SerializedName("deal_info")
    public C9030z LIZJ;
    @SerializedName("bid_records")
    public List<C9029y> LIZLLL;

    static {
        Covode.recordClassIndex(29428);
    }
}
