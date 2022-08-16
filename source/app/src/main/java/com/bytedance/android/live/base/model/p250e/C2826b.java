package com.bytedance.android.live.base.model.p250e;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.KRJ;

/* renamed from: com.bytedance.android.live.base.model.e.b */
/* loaded from: classes5.dex */
public final class C2826b extends KRJ {
    @SerializedName("is_adult")
    public boolean LIZ;
    @SerializedName("use_manual_verify")
    public boolean LIZIZ;
    @SerializedName("prompts_type")
    public int LIZJ;
    @SerializedName("cert_status")
    public int LIZLLL;
    @SerializedName("phone")

    /* renamed from: LJ */
    public String f25737LJ;
    @SerializedName("need_verify_type")
    public int LJFF;
    @SerializedName("verify_status")
    public int LJI;

    static {
        Covode.recordClassIndex(14017);
    }

    public final boolean LIZ() {
        if (this.LJII) {
            int i = this.LJI;
            if (i == 2 || i == 3) {
                return true;
            }
            return false;
        }
        return false;
    }
}
