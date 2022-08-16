package com.bytedance.android.live.liveinteract.videotalk.emoji.model;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.liveinteract.videotalk.emoji.model.TalkRoomBaseEmoji;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;

/* renamed from: com.bytedance.android.live.liveinteract.videotalk.emoji.model.c */
/* loaded from: classes3.dex */
public class C4929c extends TalkRoomBaseEmoji {
    public static ChangeQuickRedirect LIZIZ;
    @SerializedName("emoji_id")
    public long LIZJ;
    @SerializedName("emoji_name")
    public String LIZLLL;
    @SerializedName("is_random")

    /* renamed from: LJ */
    public boolean f26444LJ;
    @SerializedName("emoji_image")
    public ImageModel LJFF;
    @SerializedName("emoji_dynamic_image")
    public ImageModel LJI;
    @SerializedName("animation_duration_ms")
    public long LJII = 1000;
    @SerializedName("emoji_result_duration_ms")
    public long LJIIIIZZ = 1000;
    @SerializedName("type")
    public int LJIIIZ;
    @SerializedName("emoji_sound")
    public String LJIIJ;
    @SerializedName("permission")
    public TalkRoomEmojiPermission LJIIJJI;
    @SerializedName("category_type")
    public int LJIIL;
    @SerializedName("interact_resource")
    public TalkRoomInteractEmoji LJIILIIL;
    @SerializedName("avatar_resource")
    public TalkRoomDigitAvatarEmoji LJIILJJIL;
    @SerializedName("need_reverse")
    public boolean LJIILL;

    static {
        Covode.recordClassIndex(30242);
    }

    public C4929c() {
        this.LIZ = TalkRoomBaseEmoji.Type.NormalEmoji;
    }

    public final long LIZ() {
        long j = this.LJII;
        if (j < 1000) {
            return 1000L;
        }
        return j;
    }

    public final boolean LIZIZ() {
        if (this.LJIIIZ == 2) {
            return true;
        }
        return false;
    }

    public final boolean LIZJ() {
        if (this.LJIIIZ == 3) {
            return true;
        }
        return false;
    }

    public final boolean LIZLLL() {
        if (this.LJIIL == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: LJ */
    public final boolean m15686LJ() {
        if (this.LJIIL == 2) {
            return true;
        }
        return false;
    }

    public final boolean LJFF() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZIZ, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (TextUtils.isEmpty(this.LJIIJ)) {
            return false;
        }
        return true;
    }
}
