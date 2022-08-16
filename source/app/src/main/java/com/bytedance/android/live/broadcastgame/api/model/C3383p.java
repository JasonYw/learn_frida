package com.bytedance.android.live.broadcastgame.api.model;

import com.bytedance.android.livesdkapi.depend.model.Sticker;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import com.xiaomi.mipush.sdk.Constants;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import kotlin.text.StringsKt__StringsJVMKt;
import p002O.C0002O;
import p003X.C106862S5w;
import p003X.C376110v7;
import p003X.C443243g6;
import p003X.C88143KoD;
import p003X.C88144KoE;
import p003X.C88145KoF;

/* renamed from: com.bytedance.android.live.broadcastgame.api.model.p */
/* loaded from: classes5.dex */
public final class C3383p {
    public static ChangeQuickRedirect LIZ;
    public transient Sticker LIZIZ;
    @SerializedName("game_type")
    public final int LIZJ;
    @SerializedName("game_id")
    public final long LIZLLL;
    @SerializedName("game_name")

    /* renamed from: LJ */
    public final String f26026LJ;
    @SerializedName("open_type")
    public final String LJFF;
    @SerializedName("support_players")
    public final int LJI;
    @SerializedName("orientation")
    public final int LJII;
    @SerializedName("need_game_desc")
    public final boolean LJIIIIZZ;
    @SerializedName("game_description_snippet")
    public final String LJIIIZ;
    @SerializedName("game_cover")
    public final String LJIIJ;
    @SerializedName("game_video")
    public final String LJIIJJI;
    @SerializedName("game_package")
    public final String LJIIL;
    @SerializedName("autodownload")
    public final boolean LJIILIIL;
    @SerializedName("loading_time")
    public final int LJIILJJIL;
    @SerializedName("loading_text")
    public final String LJIILL;
    @SerializedName("ab_param_key")
    public final String LJIILLIIL;
    @SerializedName("url_prefix")
    public final List<String> LJIIZILJ;
    @SerializedName("RepelPanel")
    public final int LJIJ;
    @SerializedName("support_live_scene")
    public final List<Integer> LJIJI;
    @SerializedName("support_chatroom_type")
    public final List<Integer> LJIJJ;
    @SerializedName("support_live_mode")
    public final List<Integer> LJIJJLI;
    @SerializedName("support_live_role")
    public final int LJIL;
    @SerializedName("support_live_role_v2")
    public final List<Integer> LJJ;
    @SerializedName("support_pk_end_cover")
    public final String LJJI;
    @SerializedName("audience_show_loading")
    public final boolean LJJIFFI;
    @SerializedName("audience_loading_text")
    public final String LJJII;
    @SerializedName("need_show_rematch_entrance")
    public final boolean LJJIII;
    @SerializedName("need_local_mix_stream")
    public final boolean LJJIIJ;
    @SerializedName("bubble_config")
    public final C88143KoD LJJIIJZLJL;
    @SerializedName("breathing_light_config")
    public final C88144KoE LJJIIZ;
    @SerializedName("red_dot_config")
    public final C88145KoF LJJIIZI;
    @SerializedName("game_identifier")
    public String LJJIJ;
    @SerializedName("effect_id")
    public final long LJJIJIIJI;
    @SerializedName("guide_name")
    public final String LJJIJIIJIL;
    @SerializedName("guide_show_count")
    public final int LJJIJIL;
    @SerializedName("loadgame_when_guide")
    public final boolean LJJIJL;
    @SerializedName("need_beat")
    public final boolean LJJIJLIJ;
    @SerializedName("need_bgmusic")
    public final boolean LJJIL;
    @SerializedName("support_mode")
    public final int LJJIZ;
    @SerializedName("support_effect_mix_stream")
    public final boolean LJJJ;
    @SerializedName("wtimor_game_ttid")
    public final long LJJJI;
    @SerializedName("wtimor_game_id")
    public final String LJJJIL;
    @SerializedName("loading_bg_url")
    public final String LJJJJ;
    @SerializedName("wtimor_game_matching_players")
    public final int LJJJJI;
    @SerializedName("wtimor_game_type")
    public final int LJJJJIZL;
    @SerializedName("wtimor_game_repel_panel")
    public final int LJJJJJ;
    @SerializedName("wtimor_game_window_threshold")
    public final float LJJJJJL;
    @SerializedName("wtimor_delete_start_request")
    public final boolean LJJJJL;
    @SerializedName("to_audience_game_start_channel")
    public final long LJJJJLI;
    @SerializedName("show_anchor_float_entrance")
    public final boolean LJJJJLL;
    @SerializedName("show_audience_float_entrance")
    public final boolean LJJJJZ;
    @SerializedName("allow_auto_show_anchor_panel")
    public final boolean LJJJJZI;
    @SerializedName("allow_auto_show_audience_panel")
    public final boolean LJJJLIIL;
    @SerializedName("anchor_panel_limit_frequency")
    public final int LJJJLL;
    @SerializedName("audience_panel_limit_frequency")
    public final int LJJJLZIJ;
    @SerializedName("allow_panel_transparency")
    public final boolean LJJJZ;
    @SerializedName("float_entrance_style")
    public final FloatEntranceStyle LJJL;
    @SerializedName("lynx_channel")
    public final String LJJLI;
    @SerializedName("effect_channel")
    public final String LJJLIIIIJ;
    @SerializedName("anchor_effect_resource_url")
    public final String LJJLIIIJ;
    @SerializedName("audience_effect_resource_url")
    public final String LJJLIIIJILLIZJL;
    @SerializedName("effect_resource_version")
    public final String LJJLIIIJJI;
    @SerializedName("lynx_resource_business_version")
    public final String LJJLIIIJJIZ;
    @SerializedName("anchor_lynx_resource_url")
    public final String LJJLIIIJL;
    @SerializedName("audience_lynx_resource_url")
    public final String LJJLIIIJLJLI;
    @SerializedName("min_support_version")
    public final C443243g6 LJJLIIIJLLLLLLLZ;
    @SerializedName("lynx_fallback_url")
    public final C376110v7 LJJLIIJ;
    @SerializedName("resource_access_key")
    public final String LJJLIL;
    @SerializedName("float_entrance_channel")
    public final String LJJLJ;
    @SerializedName("schema")
    public final String LJJLJLI;
    @SerializedName("game_dynamic_prefab_resource")
    public final HashMap<String, String> LJJLL;
    @SerializedName("use_sz_live_game_framework")
    public final int LJJZ;
    @SerializedName("link_mic_tag_images")
    public final HashMap<String, String> LJJZZI;
    @SerializedName("interact_game_title")
    public final String LJJZZIII;
    @SerializedName("interact_game_image")
    public final String LJL;
    @SerializedName("inner_game")
    public final int LJLI;
    @SerializedName(Constants.APP_ID)
    public final String LJLIIIL;
    @SerializedName("text_intro")
    public final String LJLIIL;
    @SerializedName("developer")
    public final String LJLIL;
    @SerializedName("app_version")
    public final String LJLILLLLZI;
    @SerializedName("sensitivity_tip")
    public final List<String> LJLJI;
    @SerializedName("media_intro")
    public final List<C3386t> LJLJJI;
    @SerializedName("business_type")
    public final int LJLJJL;
    @SerializedName("anchor_ratio")
    public final int LJLJJLL;
    @SerializedName("support_live_entrance")
    public List<Long> LJLJL;
    @SerializedName("game_card_extra")
    public final String LJLJLJ;

    static {
        Covode.recordClassIndex(19203);
    }

    private Object[] LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 8);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{Integer.valueOf(this.LIZJ), Long.valueOf(this.LIZLLL), this.f26026LJ, this.LJFF, Integer.valueOf(this.LJI), Integer.valueOf(this.LJII), Boolean.valueOf(this.LJIIIIZZ), this.LJIIIZ, this.LJIIJ, this.LJIIJJI, this.LJIIL, Boolean.valueOf(this.LJIILIIL), Integer.valueOf(this.LJIILJJIL), this.LJIILL, this.LJIILLIIL, this.LJIIZILJ, Integer.valueOf(this.LJIJ), this.LJIJI, this.LJIJJ, this.LJIJJLI, Integer.valueOf(this.LJIL), this.LJJ, this.LJJI, Boolean.valueOf(this.LJJIFFI), this.LJJII, Boolean.valueOf(this.LJJIII), Boolean.valueOf(this.LJJIIJ), this.LJJIIJZLJL, this.LJJIIZ, this.LJJIIZI, this.LJJIJ, Long.valueOf(this.LJJIJIIJI), this.LJJIJIIJIL, Integer.valueOf(this.LJJIJIL), Boolean.valueOf(this.LJJIJL), Boolean.valueOf(this.LJJIJLIJ), Boolean.valueOf(this.LJJIL), Integer.valueOf(this.LJJIZ), Boolean.valueOf(this.LJJJ), Long.valueOf(this.LJJJI), this.LJJJIL, this.LJJJJ, Integer.valueOf(this.LJJJJI), Integer.valueOf(this.LJJJJIZL), Integer.valueOf(this.LJJJJJ), Float.valueOf(this.LJJJJJL), Boolean.valueOf(this.LJJJJL), Long.valueOf(this.LJJJJLI), Boolean.valueOf(this.LJJJJLL), Boolean.valueOf(this.LJJJJZ), Boolean.valueOf(this.LJJJJZI), Boolean.valueOf(this.LJJJLIIL), Integer.valueOf(this.LJJJLL), Integer.valueOf(this.LJJJLZIJ), Boolean.valueOf(this.LJJJZ), this.LJJL, this.LJJLI, this.LJJLIIIIJ, this.LJJLIIIJ, this.LJJLIIIJILLIZJL, this.LJJLIIIJJI, this.LJJLIIIJJIZ, this.LJJLIIIJL, this.LJJLIIIJLJLI, this.LJJLIIIJLLLLLLLZ, this.LJJLIIJ, this.LJJLIL, this.LJJLJ, this.LJJLJLI, this.LJJLL, Integer.valueOf(this.LJJZ), this.LJJZZI, this.LJJZZIII, this.LJL, Integer.valueOf(this.LJLI), this.LJLIIIL, this.LJLIIL, this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, Integer.valueOf(this.LJLJJL), Integer.valueOf(this.LJLJJLL), this.LJLJL, this.LJLJLJ};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 9);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3383p) {
            return C106862S5w.LIZ(((C3383p) obj).LIZIZ(), LIZIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 10);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 11);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("InteractGameExtra:%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", LIZIZ());
    }

    public final String LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return LIZ(this.LJIIJJI);
    }

    public final String LIZ(String str) {
        List<String> list;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 5);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (str != null && !StringsKt__StringsJVMKt.isBlank(str) && (list = this.LJIIZILJ) != null && !list.isEmpty()) {
            new StringBuilder();
            return C0002O.m25086C(this.LJIIZILJ.get(0), str);
        }
        return null;
    }
}
