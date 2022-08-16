package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* renamed from: com.bytedance.android.live.base.model.user.b */
/* loaded from: classes3.dex */
public final class C2849b {
    public static ChangeQuickRedirect LIZ;
    @SerializedName("uid")
    public String LIZIZ;
    @SerializedName("short_id")
    public String LIZJ;
    @SerializedName("sec_uid")
    public String LIZLLL;
    @SerializedName("avatar_thumb")

    /* renamed from: LJ */
    public ImageModel f25764LJ;
    @SerializedName("avatar_medium")
    public ImageModel LJFF;
    @SerializedName("avatar_large")
    public ImageModel LJI;
    @SerializedName("nickname")
    public String LJII;
    @SerializedName("gender")
    public int LJIIIIZZ;
    @SerializedName("signature")
    public String LJIIIZ;
    @SerializedName("custom_verify")
    public String LJIIJ;
    @SerializedName("follow_status")
    public int LJIIJJI;
    @SerializedName("is_block")
    public boolean LJIIL;
    @SerializedName("secret")
    public boolean LJIILIIL;
    @SerializedName("is_blocked")
    public boolean LJIILJJIL;
    @SerializedName("show_favorite_list")
    public boolean LJIILL;
    @SerializedName("following_count")
    public long LJIILLIIL;
    @SerializedName("aweme_count")
    public long LJIIZILJ;
    @SerializedName("follower_count")
    public long LJIJ;
    @SerializedName("favoriting_count")
    public long LJIJI;
    @SerializedName("total_favorited")
    public long LJIJJ;
    @SerializedName("room_id")
    public Long LJIJJLI;
    @SerializedName("school_name")
    public String LJIL;
    @SerializedName("location")
    public String LJJ;
    @SerializedName("birthday")
    public String LJJI;
    @SerializedName("aweme_hotsoon_auth")
    public int LJJIFFI;
    @SerializedName("enterprise_verify_reason")
    public String LJJII;
    @SerializedName("verification_type")
    public int LJJIII;
    @SerializedName("weibo_verify")
    public String LJJIIJ;

    static {
        Covode.recordClassIndex(14269);
    }

    public final boolean LIZ() {
        int i = this.LJIIJJI;
        if (i == 1 || i == 2) {
            return true;
        }
        return false;
    }

    public final int LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (StringUtils.isEmpty(this.LJJI)) {
            return 0;
        }
        try {
            Date parse = new SimpleDateFormat("yyyy-MM-dd").parse(this.LJJI);
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar.setTime(new Date());
            calendar2.setTime(parse);
            if (calendar2.after(calendar)) {
                return 0;
            }
            int i = calendar.get(1) - calendar2.get(1);
            if (calendar.get(6) < calendar2.get(6)) {
                return i - 1;
            }
            return i;
        } catch (Exception unused) {
            return 0;
        }
    }
}
