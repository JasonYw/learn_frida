package com.bytedance.android.live.browser.jsbridge.newmethods;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.util.Objects;
import p003X.C106862S5w;

/* loaded from: classes8.dex */
public final class aw$a {
    public static ChangeQuickRedirect LIZ;
    @SerializedName("type")
    public final String LIZIZ;
    @SerializedName("title")
    public final String LIZJ;
    @SerializedName("text")
    public final String LIZLLL;
    @SerializedName("left_button_text")

    /* renamed from: LJ */
    public final String f26155LJ;
    @SerializedName("left_button_text_color")
    public final String LJFF;
    @SerializedName("right_button_text")
    public final String LJI;
    @SerializedName("right_button_text_color")
    public final String LJII;
    @SerializedName("corner_radius")
    public final Float LJIIIIZZ;

    static {
        Covode.recordClassIndex(22672);
    }

    private Object[] LIZ() {
        return new Object[]{this.LIZIZ, this.LIZJ, this.LIZLLL, this.f26155LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof aw$a) {
            return C106862S5w.LIZ(((aw$a) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("DialogMethod$Params:%s,%s,%s,%s,%s,%s,%s,%s", LIZ());
    }
}
