package com.bytedance.android.live.browser.jsbridge.event;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;

/* renamed from: com.bytedance.android.live.browser.jsbridge.event.u */
/* loaded from: classes3.dex */
public final class C3966u {
    public C3967a LIZ;

    /* renamed from: com.bytedance.android.live.browser.jsbridge.event.u$a */
    /* loaded from: classes3.dex */
    public static final class C3967a {
        @SerializedName("enableMotion")
        public int LIZ;
        @SerializedName("schema")
        public String LIZIZ;
        @SerializedName("h5schema")
        public String LIZJ;
        @SerializedName("time")
        public int LIZLLL;

        static {
            Covode.recordClassIndex(22320);
        }
    }

    static {
        Covode.recordClassIndex(22319);
    }

    public C3966u(C3967a c3967a) {
        this.LIZ = c3967a;
    }
}
