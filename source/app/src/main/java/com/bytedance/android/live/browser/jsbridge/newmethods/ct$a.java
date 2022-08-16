package com.bytedance.android.live.browser.jsbridge.newmethods;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Objects;
import p003X.C106862S5w;

/* loaded from: classes17.dex */
public final class ct$a {
    public static ChangeQuickRedirect LIZ;
    @SerializedName("content")
    public final String LIZIZ;
    @SerializedName("message_source")
    public final String LIZJ;
    @SerializedName("emoji_display")
    public final Boolean LIZLLL;
    @SerializedName("topic_id")

    /* renamed from: LJ */
    public final List<String> f26159LJ;
    @SerializedName("from_vs_discussion")
    public final int LJFF;
    @SerializedName("reply_user_id")
    public final String LJI;
    @SerializedName("reply_user_name")
    public final String LJII;
    @SerializedName("switch_type")
    public final String LJIIIIZZ;
    @SerializedName("pre_at_user_id")
    public final String LJIIIZ;
    @SerializedName("pre_at_sec_user_id")
    public final String LJIIJ;
    @SerializedName("pre_at_user_name")
    public final String LJIIJJI;
    @SerializedName("comment_id")
    public final String LJIIL;
    @SerializedName("at_info")
    public final String LJIILIIL;
    @SerializedName("vs_event_page")
    public final String LJIILJJIL;
    @SerializedName("to_comment_category")
    public final String LJIILL;
    @SerializedName("vs_reply_click_position")
    public final String LJIILLIIL;

    static {
        Covode.recordClassIndex(22758);
    }

    private Object[] LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{this.LIZIZ, this.LIZJ, this.LIZLLL, this.f26159LJ, Integer.valueOf(this.LJFF), this.LJI, this.LJII, this.LJIIIIZZ, this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, this.LJIILIIL, this.LJIILJJIL, this.LJIILL, this.LJIILLIIL};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof ct$a) {
            return C106862S5w.LIZ(((ct$a) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 6);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("OpenCommentPanelMethod$Params:%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", LIZ());
    }
}
