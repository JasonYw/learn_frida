package com.bytedance.android.live.core.resources;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.GsonProtectorUtils;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p003X.C90335LiT;
import p003X.KM9;

/* renamed from: com.bytedance.android.live.core.resources.a */
/* loaded from: classes5.dex */
public class C4085a {
    public static ChangeQuickRedirect LIZ;
    @SerializedName("need_screen_shot")
    public boolean LIZIZ;
    @SerializedName("befViewRenderSize")
    public C90335LiT LIZJ;
    @SerializedName("befViewRenderFPS")
    public int LIZLLL;
    @SerializedName("befViewFitMode")

    /* renamed from: LJ */
    public int f26180LJ;
    @SerializedName("model_names")
    public String LJFF;
    @SerializedName("requirements")
    public List<String> LJI;
    @SerializedName("should_multi_frame")
    public boolean LJII;
    @SerializedName("view_overlay")
    public String LJIIIIZZ;
    @SerializedName("gift_type")
    public String LJIIIZ;
    @SerializedName("gift_duration")
    public long LJIIJ;
    @Expose(deserialize = false, serialize = false)
    public HashMap<String, List<String>> LJIIJJI;

    static {
        Covode.recordClassIndex(23588);
    }

    public final Map<String, List<String>> LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        HashMap<String, List<String>> hashMap = this.LJIIJJI;
        if (hashMap != null) {
            return hashMap;
        }
        if (!TextUtils.isEmpty(this.LJFF)) {
            this.LJIIJJI = (HashMap) GsonProtectorUtils.fromJson(KM9.LIZ(), this.LJFF, (Class<Object>) HashMap.class);
        }
        return this.LJIIJJI;
    }
}
