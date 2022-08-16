package com.bytedance.android.live.network.response;

import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.android.live.base.model.Extra;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(message = "use ExtraResponse<List<T>, R> or ExtraResponse<Set<T>, R>")
/* renamed from: com.bytedance.android.live.network.response.a */
/* loaded from: classes8.dex */
public class C5169a<T, R extends Extra> {
    @SerializedName("status_code")
    public int LIZ;
    @SerializedName(C2521l.LJIIL)
    public List<T> LIZIZ;
    @SerializedName("extra")
    public R LIZJ;
    public transient RequestError LIZLLL;

    static {
        Covode.recordClassIndex(32727);
    }
}
