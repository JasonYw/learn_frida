package com.bytedance.android.annie.scheme.p215vo;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import com.google.gson.annotations.SerializedName;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import p003X.C106862S5w;
import p003X.PUY;

/* renamed from: com.bytedance.android.annie.scheme.vo.BaseHybridParamVo */
/* loaded from: classes7.dex */
public final class BaseHybridParamVo implements Parcelable {
    public static final Parcelable.Creator<BaseHybridParamVo> CREATOR = new PUY();
    public static ChangeQuickRedirect LIZ;
    @SerializedName("hide_status_bar")
    public boolean LIZIZ;
    public HybridType LIZJ;
    public String LIZLLL;

    /* renamed from: LJ */
    public String f25625LJ;
    @SerializedName("pull_down_close")
    public boolean LJFF;
    @SerializedName("pull_down_height")
    public int LJI;
    @SerializedName("pull_down_indicator_not_show")
    public boolean LJII;
    @SerializedName("pull_down_indicator_color")
    public String LJIIIIZZ;
    @SerializedName("hide_poster")
    public boolean LJIIIZ;
    @SerializedName("show_close")
    public boolean LJIIJ;
    @SerializedName("show_back")
    public boolean LJIIJJI;
    @SerializedName("enable_share")
    public boolean LJIIL;
    @SerializedName("forbid_right_back")
    public boolean LJIILIIL;
    @SerializedName("enable_font_scale")
    public String LJIILJJIL;
    public Integer LJIILL;
    public boolean LJIILLIIL;
    @SerializedName("hide_nav_bar")
    public boolean LJIIZILJ;
    public String LJIJ;
    public boolean LJIJI;
    public boolean LJIJJ;
    public boolean LJIJJLI;
    @SerializedName("trans_status_bar")
    public boolean LJIL;
    @SerializedName("status_bar_color")
    public String LJJ;
    @SerializedName("status_bar_bg_color")
    public String LJJI;
    public Boolean LJJIFFI;
    public String LJJII;
    @SerializedName("title")
    public String LJJIII;
    public int LJJIIJ;
    @SerializedName("web_bg_color")
    public String LJJIIJZLJL;
    @SerializedName("hide_loading")
    public boolean LJJIIZ;
    public int LJJIIZI;
    @SerializedName("support_exchange_theme")
    public boolean LJJIJ;
    public String LJJIJIIJI;
    @SerializedName(PushConstants.WEB_URL)
    public String LJJIJIIJIL;
    public String LJJIJIL;
    @SerializedName("close_position_right")
    public boolean LJJIJL;
    @SerializedName("icon_theme")
    public int LJJIJLIJ;
    @SerializedName("auto_show_nav_bar")
    public boolean LJJIL;
    @SerializedName("show_float_live")
    public boolean LJJIZ;
    @SerializedName("disable_input_scroll")
    public boolean LJJJ;
    @SerializedName("android_soft_input_mode")
    public int LJJJI;
    @SerializedName("enable_pad_adapter")
    public boolean LJJJIL;
    @SerializedName("pad_ratio")
    public float LJJJJ;
    @SerializedName("container_bg_color")
    public String LJJJJI;
    public boolean LJJJJIZL;
    public boolean LJJJJJ;

    /* renamed from: com.bytedance.android.annie.scheme.vo.BaseHybridParamVo$HybridType */
    /* loaded from: classes7.dex */
    public enum HybridType {
        H5,
        LYNX,
        HOST_H5;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(10993);
        }

        public static HybridType valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (HybridType) (proxy.isSupported ? proxy.result : Enum.valueOf(HybridType.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static HybridType[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (HybridType[]) (proxy.isSupported ? proxy.result : values().clone());
        }
    }

    static {
        Covode.recordClassIndex(10992);
    }

    public BaseHybridParamVo() {
        this(false, null, null, null, false, 0, false, null, false, false, false, false, false, null, null, false, false, null, false, false, false, false, null, null, null, null, null, 0, null, false, 0, false, null, null, null, false, 0, false, false, false, 0, false, 0.0f, null, false, false, -1, 16383);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (PatchProxy.proxy(new Object[]{parcel, Integer.valueOf(i)}, this, LIZ, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(parcel);
        parcel.writeInt(this.LIZIZ ? 1 : 0);
        parcel.writeString(this.LIZJ.name());
        parcel.writeString(this.LIZLLL);
        parcel.writeString(this.f25625LJ);
        parcel.writeInt(this.LJFF ? 1 : 0);
        parcel.writeInt(this.LJI);
        parcel.writeInt(this.LJII ? 1 : 0);
        parcel.writeString(this.LJIIIIZZ);
        parcel.writeInt(this.LJIIIZ ? 1 : 0);
        parcel.writeInt(this.LJIIJ ? 1 : 0);
        parcel.writeInt(this.LJIIJJI ? 1 : 0);
        parcel.writeInt(this.LJIIL ? 1 : 0);
        parcel.writeInt(this.LJIILIIL ? 1 : 0);
        parcel.writeString(this.LJIILJJIL);
        Integer num = this.LJIILL;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.LJIILLIIL ? 1 : 0);
        parcel.writeInt(this.LJIIZILJ ? 1 : 0);
        parcel.writeString(this.LJIJ);
        parcel.writeInt(this.LJIJI ? 1 : 0);
        parcel.writeInt(this.LJIJJ ? 1 : 0);
        parcel.writeInt(this.LJIJJLI ? 1 : 0);
        parcel.writeInt(this.LJIL ? 1 : 0);
        parcel.writeString(this.LJJ);
        parcel.writeString(this.LJJI);
        Boolean bool = this.LJJIFFI;
        if (bool != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.LJJII);
        parcel.writeString(this.LJJIII);
        parcel.writeInt(this.LJJIIJ);
        parcel.writeString(this.LJJIIJZLJL);
        parcel.writeInt(this.LJJIIZ ? 1 : 0);
        parcel.writeInt(this.LJJIIZI);
        parcel.writeInt(this.LJJIJ ? 1 : 0);
        parcel.writeString(this.LJJIJIIJI);
        parcel.writeString(this.LJJIJIIJIL);
        parcel.writeString(this.LJJIJIL);
        parcel.writeInt(this.LJJIJL ? 1 : 0);
        parcel.writeInt(this.LJJIJLIJ);
        parcel.writeInt(this.LJJIL ? 1 : 0);
        parcel.writeInt(this.LJJIZ ? 1 : 0);
        parcel.writeInt(this.LJJJ ? 1 : 0);
        parcel.writeInt(this.LJJJI);
        parcel.writeInt(this.LJJJIL ? 1 : 0);
        parcel.writeFloat(this.LJJJJ);
        parcel.writeString(this.LJJJJI);
        parcel.writeInt(this.LJJJJIZL ? 1 : 0);
        parcel.writeInt(this.LJJJJJ ? 1 : 0);
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "BaseHybridParamVo(hideStatusBar=" + this.LIZIZ + ", hybridType=" + this.LIZJ + ", monitorPageService=" + this.LIZLLL + ", fromLabel=" + this.f25625LJ + ", pullDownClose=" + this.LJFF + ", pullDownHeight=" + this.LJI + ", pullDownIndicatorNotShow=" + this.LJII + ", indicatorColor=" + this.LJIIIIZZ + ", hidePoster=" + this.LJIIIZ + ", showClose=" + this.LJIIJ + ",showBack=" + this.LJIIJJI + ", enableShare=" + this.LJIIL + ", forbidRightBack=" + this.LJIILIIL + ", backgroundRes=" + this.LJIILL + ", userWebViewTitle=" + this.LJIILLIIL + ", hideNavBar=" + this.LJIIZILJ + ", fromContainer=" + this.LJIJ + ", isPopUp=" + this.LJIJI + ", hideMore=" + this.LJIJJ + ", isFullScreen=" + this.LJIJJLI + ", transStatusBar=" + this.LJIL + ", statusBarColor=" + this.LJJ + ", statusBarBgColor=" + this.LJJI + ", isOutUrl=" + this.LJJIFFI + ", scene=" + this.LJJII + ", title=" + this.LJJIII + ", bundleWebBgColor=" + this.LJJIIJ + ", webBgColor=" + this.LJJIIJZLJL + ", hideLoading=" + this.LJJIIZ + ", requestCode=" + this.LJJIIZI + ", supportExchangeTheme=" + this.LJJIJ + ", injectJsonUrl=" + this.LJJIJIIJI + ", url=" + this.LJJIJIIJIL + ", originSchema=" + this.LJJIJIL + LoggerUtil.S_RIGHT_TAG;
    }

    public final void LIZ(HybridType hybridType) {
        if (PatchProxy.proxy(new Object[]{hybridType}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(hybridType);
        this.LIZJ = hybridType;
    }

    public BaseHybridParamVo(boolean z, HybridType hybridType, String str, String str2, boolean z2, int i, boolean z3, String str3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, String str4, Integer num, boolean z9, boolean z10, String str5, boolean z11, boolean z12, boolean z13, boolean z14, String str6, String str7, Boolean bool, String str8, String str9, int i2, String str10, boolean z15, int i3, boolean z16, String str11, String str12, String str13, boolean z17, int i4, boolean z18, boolean z19, boolean z20, int i5, boolean z21, float f, String str14, boolean z22, boolean z23) {
        C106862S5w.LIZ(hybridType, str11, str14);
        this.LIZIZ = z;
        this.LIZJ = hybridType;
        this.LIZLLL = str;
        this.f25625LJ = str2;
        this.LJFF = z2;
        this.LJI = i;
        this.LJII = z3;
        this.LJIIIIZZ = str3;
        this.LJIIIZ = z4;
        this.LJIIJ = z5;
        this.LJIIJJI = z6;
        this.LJIIL = z7;
        this.LJIILIIL = z8;
        this.LJIILJJIL = str4;
        this.LJIILL = num;
        this.LJIILLIIL = z9;
        this.LJIIZILJ = z10;
        this.LJIJ = str5;
        this.LJIJI = z11;
        this.LJIJJ = z12;
        this.LJIJJLI = z13;
        this.LJIL = z14;
        this.LJJ = str6;
        this.LJJI = str7;
        this.LJJIFFI = bool;
        this.LJJII = str8;
        this.LJJIII = str9;
        this.LJJIIJ = i2;
        this.LJJIIJZLJL = str10;
        this.LJJIIZ = z15;
        this.LJJIIZI = i3;
        this.LJJIJ = z16;
        this.LJJIJIIJI = str11;
        this.LJJIJIIJIL = str12;
        this.LJJIJIL = str13;
        this.LJJIJL = z17;
        this.LJJIJLIJ = i4;
        this.LJJIL = z18;
        this.LJJIZ = z19;
        this.LJJJ = z20;
        this.LJJJI = i5;
        this.LJJJIL = z21;
        this.LJJJJ = f;
        this.LJJJJI = str14;
        this.LJJJJIZL = z22;
        this.LJJJJJ = z23;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ BaseHybridParamVo(boolean r49, com.bytedance.android.annie.scheme.p215vo.BaseHybridParamVo.HybridType r50, java.lang.String r51, java.lang.String r52, boolean r53, int r54, boolean r55, java.lang.String r56, boolean r57, boolean r58, boolean r59, boolean r60, boolean r61, java.lang.String r62, java.lang.Integer r63, boolean r64, boolean r65, java.lang.String r66, boolean r67, boolean r68, boolean r69, boolean r70, java.lang.String r71, java.lang.String r72, java.lang.Boolean r73, java.lang.String r74, java.lang.String r75, int r76, java.lang.String r77, boolean r78, int r79, boolean r80, java.lang.String r81, java.lang.String r82, java.lang.String r83, boolean r84, int r85, boolean r86, boolean r87, boolean r88, int r89, boolean r90, float r91, java.lang.String r92, boolean r93, boolean r94, int r95, int r96) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.annie.scheme.p215vo.BaseHybridParamVo.<init>(boolean, com.bytedance.android.annie.scheme.vo.BaseHybridParamVo$HybridType, java.lang.String, java.lang.String, boolean, int, boolean, java.lang.String, boolean, boolean, boolean, boolean, boolean, java.lang.String, java.lang.Integer, boolean, boolean, java.lang.String, boolean, boolean, boolean, boolean, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, int, java.lang.String, boolean, int, boolean, java.lang.String, java.lang.String, java.lang.String, boolean, int, boolean, boolean, boolean, int, boolean, float, java.lang.String, boolean, boolean, int, int):void");
    }
}
