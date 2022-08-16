package com.bytedance.android.live.network.response;

import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.android.live.base.model.Extra;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes8.dex */
public abstract class ExtraResponse<DATA, EXTRA extends Extra> {
    @SerializedName(C2521l.LJIIL)
    public final DATA LIZIZ;
    @SerializedName("extra")
    public final EXTRA LIZJ;
    public final transient String logId;

    static {
        Covode.recordClassIndex(32724);
    }

    public ExtraResponse(DATA data, EXTRA extra) {
        this.LIZIZ = data;
        this.LIZJ = extra;
        this.logId = "";
    }

    public /* synthetic */ ExtraResponse(Object obj, Extra extra, byte b) {
        this(obj, extra);
    }
}
