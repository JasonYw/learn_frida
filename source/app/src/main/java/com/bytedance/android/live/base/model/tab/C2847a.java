package com.bytedance.android.live.base.model.tab;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.bridge.p1355js.delegate.JsBridgeDelegate;
import com.google.gson.annotations.SerializedName;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.umeng.commonsdk.vchannel.C33968a;

/* renamed from: com.bytedance.android.live.base.model.tab.a */
/* loaded from: classes8.dex */
public class C2847a {
    @SerializedName(C33968a.f42937f)
    public int LIZ;
    @SerializedName(PushConstants.WEB_URL)
    public String LIZIZ;
    @SerializedName("name")
    public String LIZJ;
    @SerializedName("style")
    public long LIZLLL;
    @SerializedName("umeng_event")

    /* renamed from: LJ */
    public String f25753LJ;
    @SerializedName(JsBridgeDelegate.TYPE_EVENT)
    public String LJFF;
    @SerializedName("umeng_source")
    public long LJI;
    @SerializedName("enable_dislike")
    public long LJII;
    @SerializedName("enable_draw_stream")
    public long LJIIIIZZ;
    @SerializedName("inter_url")
    public String LJIIIZ;
    @SerializedName("icon")
    public ImageModel LJIIJ;
    @SerializedName("xigua_old_tab_data")
    public String LJIIJJI;

    static {
        Covode.recordClassIndex(14124);
    }
}
