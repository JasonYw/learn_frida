package com.bytedance.android.live.p238ai.api;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;
import p003X.C106862S5w;
import p003X.PZT;

/* renamed from: com.bytedance.android.live.ai.api.c */
/* loaded from: classes8.dex */
public abstract class AbstractC2789c {
    public String LIZ;
    public PZT LIZIZ;
    public final String LIZJ;
    public final JSONObject LIZLLL;

    /* renamed from: LJ */
    public boolean f25725LJ;

    static {
        Covode.recordClassIndex(13831);
    }

    public AbstractC2789c(String str, PZT pzt, String str2, JSONObject jSONObject, boolean z) {
        C106862S5w.LIZ(str, str2, jSONObject);
        this.LIZ = str;
        this.LIZIZ = pzt;
        this.LIZJ = str2;
        this.LIZLLL = jSONObject;
        this.f25725LJ = z;
    }

    public /* synthetic */ AbstractC2789c(String str, PZT pzt, String str2, JSONObject jSONObject, boolean z, int i) {
        this(str, pzt, str2, jSONObject, true);
    }
}
