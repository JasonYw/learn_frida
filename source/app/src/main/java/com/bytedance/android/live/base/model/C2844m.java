package com.bytedance.android.live.base.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: com.bytedance.android.live.base.model.m */
/* loaded from: classes5.dex */
public class C2844m {
    public static ChangeQuickRedirect LIZ;
    @SerializedName("uri")
    public String LIZIZ;
    @SerializedName("url_list")
    public List<String> LIZJ;

    static {
        Covode.recordClassIndex(14082);
    }

    public final ImageModel LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (ImageModel) proxy.result;
        }
        return new ImageModel(this.LIZIZ, this.LIZJ);
    }

    public String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "UrlStruct{uri='" + this.LIZIZ + "', urlList=" + this.LIZJ + '}';
    }
}
