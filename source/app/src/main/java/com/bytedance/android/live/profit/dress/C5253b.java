package com.bytedance.android.live.profit.dress;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import p003X.C106862S5w;
import p003X.C452353un;
import p003X.C452363uo;
import p003X.C80311HlB;
import p003X.C91143LvV;
import p003X.C91145LvX;

/* renamed from: com.bytedance.android.live.profit.dress.b */
/* loaded from: classes5.dex */
public final class C5253b {
    public static ChangeQuickRedirect LIZ;
    @SerializedName("dress_id")
    public final String LIZIZ;
    @SerializedName("dress_type")
    public final int LIZJ;
    @SerializedName("dress_name")
    public final String LIZLLL;
    @SerializedName("priority")

    /* renamed from: LJ */
    public final Long f26555LJ;
    @SerializedName("avatar_border_config")
    public final C452353un LJFF;
    @SerializedName("guest_battle_theme_element")
    public final C80311HlB LJI;
    @SerializedName("badge_config")
    public final C91145LvX LJII;

    static {
        Covode.recordClassIndex(33245);
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "DressModel{dress_id=" + this.LIZIZ + ", dress_type=" + this.LIZJ + ", dress_name=" + this.LIZLLL + ", priority=" + this.f26555LJ + ", guest_battle_theme_element=" + this.LJI + '}';
    }

    public final C452363uo LIZ(DressType dressType) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{dressType}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (C452363uo) proxy.result;
        }
        C106862S5w.LIZ(dressType);
        int i = C91143LvV.LIZ[dressType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return null;
                }
                return this.LJI;
            }
            return this.LJII;
        }
        return this.LJFF;
    }
}
