package com.bytedance.android.annie.scheme.p215vo;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import p003X.C106862S5w;
import p003X.C109391T5d;
import p003X.C99838PTs;

/* renamed from: com.bytedance.android.annie.scheme.vo.PopupHybridParamVo */
/* loaded from: classes7.dex */
public final class PopupHybridParamVo implements Parcelable {
    public static final Parcelable.Creator<PopupHybridParamVo> CREATOR = new C99838PTs();
    public static ChangeQuickRedirect LIZ;
    @SerializedName("width")
    public int LIZIZ;
    @SerializedName(C109391T5d.LJFF)
    public int LIZJ;
    @SerializedName("horizontal_width")
    public int LIZLLL;
    @SerializedName("horizontal_height")

    /* renamed from: LJ */
    public int f25628LJ;
    @SerializedName("horizontal_height_percent")
    public int LJFF;
    @SerializedName("horizontal_width_percent")
    public int LJI;
    @SerializedName("margin")
    public int LJII;
    @SerializedName("margin_bottom")
    public int LJIIIIZZ;
    @SerializedName("margin_right")
    public int LJIIIZ;
    @SerializedName("radius")
    public int LJIIJ;
    @SerializedName("radius_top_left")
    public int LJIIJJI;
    @SerializedName("radius_top_right")
    public int LJIIL;
    @SerializedName("radius_bottom_right")
    public int LJIILIIL;
    @SerializedName("radius_bottom_left")
    public int LJIILJJIL;
    @SerializedName("gravity")
    public int LJIILL;
    @SerializedName("use_bottom_close")
    public boolean LJIILLIIL;
    @SerializedName("landscape_custom_height")
    public boolean LJIIZILJ;
    @SerializedName("landScape_custom_width")
    public boolean LJIJ;
    @SerializedName("landScape_custom_gravity")
    public boolean LJIJI;
    @SerializedName("show_dim")
    public boolean LJIJJ;
    public boolean LJIJJLI;
    @SerializedName("mask_click_disable")
    public boolean LJIL;
    @SerializedName("height_percent")
    public int LJJ;
    @SerializedName("width_percent")
    public int LJJI;
    @SerializedName("rate_height")
    public int LJJIFFI;
    @SerializedName("use_real_screen_height")
    public boolean LJJII;
    @SerializedName("up_full_screen")
    public boolean LJJIII;
    @SerializedName("disable_nested_child_scroll")
    public boolean LJJIIJ;
    @SerializedName("up_offset_height")
    public int LJJIIJZLJL;
    @SerializedName("use_player_bottom_height")
    public int LJJIIZ;
    public String LJJIIZI;
    @SerializedName("up_status_bar_bg_color")
    public String LJJIJ;
    @SerializedName("is_already_adaptation_ui")
    public int LJJIJIIJI;
    public String LJJIJIIJIL;
    public String LJJIJIL;
    @SerializedName("open_animate")
    public boolean LJJIJL;
    public boolean LJJIJLIJ;
    public boolean LJJIL;
    @SerializedName("mask_alpha")
    public float LJJIZ;
    public int LJJJ;
    public boolean LJJJI;
    @SerializedName("close_icon_position")
    public int LJJJIL;
    public LynxHybridParamVo LJJJJ;
    public BaseHybridParamVo LJJJJI;
    public String LJJJJIZL;
    @SerializedName("up_height_percent")
    public int LJJJJJ;
    @SerializedName("up_trans_status_bar")
    public boolean LJJJJJL;
    public int LJJJJL;
    public int LJJJJLI;

    static {
        Covode.recordClassIndex(11002);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (PatchProxy.proxy(new Object[]{parcel, Integer.valueOf(i)}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(parcel);
        parcel.writeInt(this.LIZIZ);
        parcel.writeInt(this.LIZJ);
        parcel.writeInt(this.LIZLLL);
        parcel.writeInt(this.f25628LJ);
        parcel.writeInt(this.LJFF);
        parcel.writeInt(this.LJI);
        parcel.writeInt(this.LJII);
        parcel.writeInt(this.LJIIIIZZ);
        parcel.writeInt(this.LJIIIZ);
        parcel.writeInt(this.LJIIJ);
        parcel.writeInt(this.LJIIJJI);
        parcel.writeInt(this.LJIIL);
        parcel.writeInt(this.LJIILIIL);
        parcel.writeInt(this.LJIILJJIL);
        parcel.writeInt(this.LJIILL);
        parcel.writeInt(this.LJIILLIIL ? 1 : 0);
        parcel.writeInt(this.LJIIZILJ ? 1 : 0);
        parcel.writeInt(this.LJIJ ? 1 : 0);
        parcel.writeInt(this.LJIJI ? 1 : 0);
        parcel.writeInt(this.LJIJJ ? 1 : 0);
        parcel.writeInt(this.LJIJJLI ? 1 : 0);
        parcel.writeInt(this.LJIL ? 1 : 0);
        parcel.writeInt(this.LJJ);
        parcel.writeInt(this.LJJI);
        parcel.writeInt(this.LJJIFFI);
        parcel.writeInt(this.LJJII ? 1 : 0);
        parcel.writeInt(this.LJJIII ? 1 : 0);
        parcel.writeInt(this.LJJIIJ ? 1 : 0);
        parcel.writeInt(this.LJJIIJZLJL);
        parcel.writeInt(this.LJJIIZ);
        parcel.writeString(this.LJJIIZI);
        parcel.writeString(this.LJJIJ);
        parcel.writeInt(this.LJJIJIIJI);
        parcel.writeString(this.LJJIJIIJIL);
        parcel.writeString(this.LJJIJIL);
        parcel.writeInt(this.LJJIJL ? 1 : 0);
        parcel.writeInt(this.LJJIJLIJ ? 1 : 0);
        parcel.writeInt(this.LJJIL ? 1 : 0);
        parcel.writeFloat(this.LJJIZ);
        parcel.writeInt(this.LJJJ);
        parcel.writeInt(this.LJJJI ? 1 : 0);
        parcel.writeInt(this.LJJJIL);
        LynxHybridParamVo lynxHybridParamVo = this.LJJJJ;
        if (lynxHybridParamVo != null) {
            parcel.writeInt(1);
            lynxHybridParamVo.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        BaseHybridParamVo baseHybridParamVo = this.LJJJJI;
        if (baseHybridParamVo != null) {
            parcel.writeInt(1);
            baseHybridParamVo.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.LJJJJIZL);
        parcel.writeInt(this.LJJJJJ);
        parcel.writeInt(this.LJJJJJL ? 1 : 0);
        parcel.writeInt(this.LJJJJL);
        parcel.writeInt(this.LJJJJLI);
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "PopupHybridParamVo(width=" + this.LIZIZ + ", height=" + this.LIZJ + ", horizontalWidth=" + this.LIZLLL + ", horizontalHeight=" + this.f25628LJ + ",horizontalHeightPercent=" + this.LJFF + ", horizontalWidthPercent=" + this.LJI + ", margin=" + this.LJII + ", radius=" + this.LJIIJ + ", radiusTopLeft=" + this.LJIIJJI + ", radiusTopRight=" + this.LJIIL + ", radiusBottomRight=" + this.LJIILIIL + ", radiusBottomLeft=" + this.LJIILJJIL + ", gravity=" + this.LJIILL + ", useBottomClose=" + this.LJIILLIIL + ", landScapeCustomHeight=" + this.LJIIZILJ + ", landScapeCustomWidth=" + this.LJIJ + ", landScapeCustomGravity=" + this.LJIJI + ", showDim=" + this.LJIJJ + ", showDimForce=" + this.LJIJJLI + ", canceledOnTouchOutside=" + this.LJIL + ", heightPercent=" + this.LJJ + ", widthPercent=" + this.LJJI + ", rateHeight=" + this.LJJIFFI + ", enablePullUp=" + this.LJJIII + ", upOffsetHeight=" + this.LJJIIJZLJL + ", upStatusBarColor=" + this.LJJIIZI + ", upStatusBarBgColor=" + this.LJJIJ + ", extraData=" + this.LJJIJIIJIL + ", popUpType=" + this.LJJIJIL + ", needAnimation=" + this.LJJIJL + ", windowFloating=" + this.LJJIJLIJ + ", abandonCoordinate=" + this.LJJIL + ", maskAlpha=" + this.LJJIZ + ", closeType=" + this.LJJJ + ", closeIconPositionRight=" + this.LJJJI + ", upCloseIconPosition=" + this.LJJJIL + ", lynxHybridParamVo=" + this.LJJJJ + ", commonHybridParam=" + this.LJJJJI + "),showAnimationType=" + this.LJJJJIZL + ",is_already_adaptation_ui=" + this.LJJIJIIJI + ",disable_nested_child_scroll=" + this.LJJIIJ;
    }

    public PopupHybridParamVo(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i16, int i17, int i18, boolean z8, boolean z9, boolean z10, int i19, int i20, String str, String str2, int i21, String str3, String str4, boolean z11, boolean z12, boolean z13, float f, int i22, boolean z14, int i23, LynxHybridParamVo lynxHybridParamVo, BaseHybridParamVo baseHybridParamVo, String str5, int i24, boolean z15, int i25, int i26) {
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = i3;
        this.f25628LJ = i4;
        this.LJFF = i5;
        this.LJI = i6;
        this.LJII = i7;
        this.LJIIIIZZ = i8;
        this.LJIIIZ = i9;
        this.LJIIJ = i10;
        this.LJIIJJI = i11;
        this.LJIIL = i12;
        this.LJIILIIL = i13;
        this.LJIILJJIL = i14;
        this.LJIILL = i15;
        this.LJIILLIIL = z;
        this.LJIIZILJ = z2;
        this.LJIJ = z3;
        this.LJIJI = z4;
        this.LJIJJ = z5;
        this.LJIJJLI = z6;
        this.LJIL = z7;
        this.LJJ = i16;
        this.LJJI = i17;
        this.LJJIFFI = i18;
        this.LJJII = z8;
        this.LJJIII = z9;
        this.LJJIIJ = z10;
        this.LJJIIJZLJL = i19;
        this.LJJIIZ = i20;
        this.LJJIIZI = str;
        this.LJJIJ = str2;
        this.LJJIJIIJI = i21;
        this.LJJIJIIJIL = str3;
        this.LJJIJIL = str4;
        this.LJJIJL = z11;
        this.LJJIJLIJ = z12;
        this.LJJIL = z13;
        this.LJJIZ = f;
        this.LJJJ = i22;
        this.LJJJI = z14;
        this.LJJJIL = i23;
        this.LJJJJ = lynxHybridParamVo;
        this.LJJJJI = baseHybridParamVo;
        this.LJJJJIZL = str5;
        this.LJJJJJ = i24;
        this.LJJJJJL = z15;
        this.LJJJJL = i25;
        this.LJJJJLI = i26;
    }

    public /* synthetic */ PopupHybridParamVo(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i16, int i17, int i18, boolean z8, boolean z9, boolean z10, int i19, int i20, String str, String str2, int i21, String str3, String str4, boolean z11, boolean z12, boolean z13, float f, int i22, boolean z14, int i23, LynxHybridParamVo lynxHybridParamVo, BaseHybridParamVo baseHybridParamVo, String str5, int i24, boolean z15, int i25, int i26, int i27, int i28) {
        this(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, 0, 0, 0, 0, 17, false, z2, z3, z4, z5, z6, z7, i16, i17, i18, z8, z9, z10, i19, 0, null, str2, i21, null, "", z11, z12, false, f, i22, z14, i23, null, baseHybridParamVo, str5, i24, z15, 0, 0);
    }
}
