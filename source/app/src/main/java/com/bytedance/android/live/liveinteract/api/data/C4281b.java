package com.bytedance.android.live.liveinteract.api.data;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.message.model.p726a.C8720d;
import com.bytedance.android.livesdk.message.model.p726a.C8721e;
import com.bytedance.android.livesdk.message.model.p726a.C8726j;
import com.bytedance.android.livesdkapi.depend.model.live.BattleOperationalPlay;
import com.bytedance.android.livesdkapi.depend.model.live.BattleUserInfo;
import com.bytedance.android.livesdkapi.depend.model.live.C9512j;
import com.bytedance.android.livesdkapi.depend.model.live.C9559r;
import com.bytedance.android.livesdkapi.depend.model.live.C9561t;
import com.bytedance.android.livesdkapi.depend.model.live.TeamTask;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.android.live.liveinteract.api.data.b */
/* loaded from: classes3.dex */
public final class C4281b {
    @SerializedName("channel_id")
    public long LIZ;
    @SerializedName("channel_info")
    public C9561t LIZIZ;
    @SerializedName("battle_settings")
    public C8721e LIZJ;
    @SerializedName("battle_scores")
    public List<C8720d> LIZLLL;
    @SerializedName("battle_mode")

    /* renamed from: LJ */
    public C9512j f26254LJ;
    @SerializedName("battle_task")
    public C9559r LJFF;
    @SerializedName("battle_armies")
    public List<C8726j> LJI;
    @SerializedName("anchors")
    public List<User> LJII;
    @SerializedName("loser_id")
    public long LJIIIIZZ;
    @SerializedName("rival_anchor_id")
    public long LJIIIZ;
    @SerializedName("skin_type")
    public int LJIIJ;
    @SerializedName("user_infos")
    public Map<Long, BattleUserInfo> LJIIJJI;
    @SerializedName("team_task")
    public TeamTask LJIIL;
    @SerializedName("team_task_json")
    public String LJIILIIL;
    @SerializedName("multiple_matches")
    public BattleOperationalPlay LJIILJJIL;
    @SerializedName("end_reason")
    public int LJIILL;
    @SerializedName("cut_short_prompt")
    public String LJIILLIIL;
    @SerializedName("cut_short_toast")
    public String LJIIZILJ;
    @SerializedName("cut_short_win")
    public boolean LJIJ;

    static {
        Covode.recordClassIndex(25159);
    }
}
