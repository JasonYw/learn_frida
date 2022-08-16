package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.Map;

/* loaded from: classes11.dex */
public class HonorWallUi {
    @SerializedName("bgs")
    public Map<Integer, HonorWallBg> bgs;

    /* loaded from: classes11.dex */
    public static class HonorWallBg {
        @SerializedName("gradient_end")
        public String gradientEnd;
        @SerializedName("gradient_start")
        public String gradientStart;
        @SerializedName("icon")
        public ImageModel icon;

        static {
            Covode.recordClassIndex(14153);
        }
    }

    static {
        Covode.recordClassIndex(14152);
    }
}
