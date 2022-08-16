package com.bytedance.android.live.network.response;

import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.android.live.base.model.Extra;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import kotlin.Deprecated;

@Deprecated(message = "use ExtraResponse<T, R>")
/* renamed from: com.bytedance.android.live.network.response.b */
/* loaded from: classes3.dex */
public class C5171b<T, R extends Extra> {
    @SerializedName("status_code")
    public int LIZIZ;
    @SerializedName(C2521l.LJIIL)
    public T LIZJ;
    @SerializedName("extra")
    public R LIZLLL;

    /* renamed from: LJ */
    public String f26526LJ;
    public int LJFF;
    public transient RequestError LJI;

    static {
        Covode.recordClassIndex(32730);
    }
}
