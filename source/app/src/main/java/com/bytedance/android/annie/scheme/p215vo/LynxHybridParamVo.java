package com.bytedance.android.annie.scheme.p215vo;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import com.google.gson.annotations.SerializedName;
import com.p1594ss.ttm.player.MediaPlayer;
import p003X.AbstractC99767PQz;
import p003X.C106862S5w;
import p003X.C99830PTk;

/* renamed from: com.bytedance.android.annie.scheme.vo.LynxHybridParamVo */
/* loaded from: classes7.dex */
public final class LynxHybridParamVo implements Parcelable {
    public static final Parcelable.Creator<LynxHybridParamVo> CREATOR = new C99830PTk();
    public static ChangeQuickRedirect LIZ;
    public transient AbstractC99767PQz LIZIZ;
    @SerializedName("fallback_url")
    public String LIZJ;
    @SerializedName("lynx_thread")
    public int LIZLLL;
    @SerializedName("load_taro")

    /* renamed from: LJ */
    public boolean f25627LJ;
    @SerializedName("preset_width")
    public int LJFF;
    @SerializedName("abandon_coordinate")
    public boolean LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public BaseHybridParamVo LJIIIZ;
    @SerializedName("screen_size_adaptation")
    public boolean LJIIJ;

    static {
        Covode.recordClassIndex(10999);
    }

    public LynxHybridParamVo() {
        this(null, 0, false, 0, false, false, false, null, false, MediaPlayer.MEDIA_PLAYER_OPTION_LICENSE_FILENAME);
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
        parcel.writeString(this.LIZJ);
        parcel.writeInt(this.LIZLLL);
        parcel.writeInt(this.f25627LJ ? 1 : 0);
        parcel.writeInt(this.LJFF);
        parcel.writeInt(this.LJI ? 1 : 0);
        parcel.writeInt(this.LJII ? 1 : 0);
        parcel.writeInt(this.LJIIIIZZ ? 1 : 0);
        BaseHybridParamVo baseHybridParamVo = this.LJIIIZ;
        if (baseHybridParamVo != null) {
            parcel.writeInt(1);
            baseHybridParamVo.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.LJIIJ ? 1 : 0);
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "LynxHybridParamVo(fallbackSchema=" + this.LIZJ + ", lynxThreadStrategy=" + this.LIZLLL + ", loadTaro=" + this.f25627LJ + ", presetWidth=" + this.LJFF + ", abandonCoordinate=" + this.LJI + ", createViewAsync=" + this.LJII + ", sendDataUseString=" + this.LJIIIIZZ + ", commonHybridParam=" + this.LJIIIZ + ", isSetScreenSize=" + this.LJIIJ + LoggerUtil.S_RIGHT_TAG;
    }

    public LynxHybridParamVo(String str, int i, boolean z, int i2, boolean z2, boolean z3, boolean z4, BaseHybridParamVo baseHybridParamVo, boolean z5) {
        this.LIZJ = str;
        this.LIZLLL = i;
        this.f25627LJ = z;
        this.LJFF = i2;
        this.LJI = z2;
        this.LJII = z3;
        this.LJIIIIZZ = z4;
        this.LJIIIZ = baseHybridParamVo;
        this.LJIIJ = z5;
    }

    public /* synthetic */ LynxHybridParamVo(String str, int i, boolean z, int i2, boolean z2, boolean z3, boolean z4, BaseHybridParamVo baseHybridParamVo, boolean z5, int i3) {
        this("", 0, true, 0, false, false, false, null, false);
    }
}
