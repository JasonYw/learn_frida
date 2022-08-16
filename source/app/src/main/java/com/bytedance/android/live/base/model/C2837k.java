package com.bytedance.android.live.base.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.List;
import p003X.C109391T5d;

/* renamed from: com.bytedance.android.live.base.model.k */
/* loaded from: classes8.dex */
public class C2837k {
    @SerializedName("short_touch_url")
    public String LIZ;
    @SerializedName("short_touch_fallback_url")
    public String LIZIZ;
    @SerializedName("container_type")
    public int LIZJ;
    @SerializedName("width")
    public int LIZLLL;
    @SerializedName(C109391T5d.LJFF)

    /* renamed from: LJ */
    public int f25745LJ;
    @SerializedName("img_url")
    public String LJFF;
    @SerializedName("img_layers")
    public C2838a LJI;
    @SerializedName("jump_schema")
    public String LJII;
    @SerializedName("show_animation")
    public int LJIIIIZZ;
    @SerializedName("animation_type")
    public int LJIIIZ;
    @SerializedName("animation_quota")
    public int LJIIJ;
    @SerializedName("sub_item_list")
    public List<String> LJIIJJI;
    public boolean LJIIL = true;

    /* renamed from: com.bytedance.android.live.base.model.k$a */
    /* loaded from: classes11.dex */
    public static class C2838a {
        @SerializedName("layers")
        public List<C2839a> LIZ;
        @SerializedName("base_width")
        public int LIZIZ;
        @SerializedName("base_height")
        public int LIZJ;

        /* renamed from: com.bytedance.android.live.base.model.k$a$a */
        /* loaded from: classes11.dex */
        public static class C2839a {
            @SerializedName(PushConstants.WEB_URL)
            public String LIZ = "";
            @SerializedName("x")
            public int LIZIZ;
            @SerializedName("y")
            public int LIZJ;
            @SerializedName("width")
            public int LIZLLL;
            @SerializedName(C109391T5d.LJFF)

            /* renamed from: LJ */
            public int f25746LJ;
            @SerializedName("radius")
            public int LJFF;

            static {
                Covode.recordClassIndex(14069);
            }
        }

        static {
            Covode.recordClassIndex(14068);
        }
    }

    static {
        Covode.recordClassIndex(14067);
    }
}
