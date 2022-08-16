package com.bytedance.android.live.base.model.banner;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import com.umeng.commonsdk.vchannel.C33968a;
import java.util.List;
import p003X.AbstractC99942PXs;
import p003X.C109391T5d;

/* renamed from: com.bytedance.android.live.base.model.banner.a */
/* loaded from: classes8.dex */
public class C2807a implements AbstractC99942PXs {
    public static ChangeQuickRedirect LIZ;
    @SerializedName(C33968a.f42937f)
    public long LIZIZ;
    @SerializedName("title")
    public String LIZJ;
    @SerializedName("url_list")
    public List<String> LIZLLL;
    @SerializedName("uri")

    /* renamed from: LJ */
    public String f25729LJ;
    @SerializedName(C109391T5d.LJFF)
    public int LJFF;
    @SerializedName("width")
    public int LJI;
    @SerializedName("schema_url")
    public String LJII;
    @SerializedName("text")
    public String LJIIIIZZ;
    @SerializedName("extra")
    public String LJIIIZ;
    @SerializedName("avg_color")
    public String LJIIJ;
    @SerializedName("banner_type")
    public int LJIIJJI;
    public ImageModel LJIIL;

    static {
        Covode.recordClassIndex(13991);
    }

    @Override // p003X.AbstractC99942PXs
    public IUser author() {
        return null;
    }

    @Override // p003X.AbstractC99942PXs
    public long getId() {
        return this.LIZIZ;
    }

    @Override // p003X.AbstractC99942PXs
    public String title() {
        return this.LIZJ;
    }

    @Override // p003X.AbstractC99942PXs
    public String getMixId() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return String.valueOf(getId());
    }

    public final ImageModel LIZ() {
        List<String> list;
        String str;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (ImageModel) proxy.result;
        }
        if (this.LJIIL == null && (list = this.LIZLLL) != null && (str = this.f25729LJ) != null) {
            this.LJIIL = new ImageModel(str, list);
        }
        return this.LJIIL;
    }

    public final boolean LIZ(C2807a c2807a) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c2807a}, this, LIZ, false, 5);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == c2807a) {
            return true;
        }
        if (c2807a == null || this.LIZIZ != c2807a.LIZIZ || !StringUtils.equal(this.LIZJ, c2807a.LIZJ) || !StringUtils.equal(this.f25729LJ, c2807a.f25729LJ) || !StringUtils.equal(this.LJII, c2807a.LJII) || !StringUtils.equal(this.LJIIIIZZ, c2807a.LJIIIIZZ) || this.LJI != c2807a.LJI || this.LJFF != c2807a.LJFF) {
            return false;
        }
        if (this.LIZLLL == null && c2807a.LIZLLL != null) {
            return false;
        }
        if (this.LIZLLL != null && c2807a.LIZLLL == null) {
            return false;
        }
        if (this.LIZLLL == null && c2807a.LIZLLL == null) {
            return true;
        }
        if (this.LIZLLL.size() != c2807a.LIZLLL.size()) {
            return false;
        }
        for (int i = 0; i < this.LIZLLL.size(); i++) {
            if (!StringUtils.equal(this.LIZLLL.get(i), c2807a.LIZLLL.get(i))) {
                return false;
            }
        }
        if (StringUtils.equal(this.LJIIIZ, c2807a.LJIIIZ)) {
            return true;
        }
        return false;
    }
}
