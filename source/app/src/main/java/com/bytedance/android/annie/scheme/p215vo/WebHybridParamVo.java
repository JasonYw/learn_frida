package com.bytedance.android.annie.scheme.p215vo;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import com.google.gson.annotations.SerializedName;
import p003X.C106862S5w;
import p003X.C99831PTl;
import p003X.C99833PTn;

/* renamed from: com.bytedance.android.annie.scheme.vo.WebHybridParamVo */
/* loaded from: classes7.dex */
public final class WebHybridParamVo implements Parcelable {
    public static ChangeQuickRedirect LIZ;
    public int LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;

    /* renamed from: LJ */
    public boolean f25629LJ;
    public String LJFF;
    public boolean LJI;
    public boolean LJII;
    public boolean LJIIIIZZ;
    @SerializedName("referer")
    public String LJIIIZ;
    public final BaseHybridParamVo LJIIJ;
    public static final C99833PTn LJIIJJI = new C99833PTn((byte) 0);
    public static final Parcelable.Creator<WebHybridParamVo> CREATOR = new C99831PTl();

    static {
        Covode.recordClassIndex(11004);
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
        parcel.writeInt(this.LIZJ ? 1 : 0);
        parcel.writeInt(this.LIZLLL ? 1 : 0);
        parcel.writeInt(this.f25629LJ ? 1 : 0);
        parcel.writeString(this.LJFF);
        parcel.writeInt(this.LJI ? 1 : 0);
        parcel.writeInt(this.LJII ? 1 : 0);
        parcel.writeInt(this.LJIIIIZZ ? 1 : 0);
        parcel.writeString(this.LJIIIZ);
        BaseHybridParamVo baseHybridParamVo = this.LJIIJ;
        if (baseHybridParamVo == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        baseHybridParamVo.writeToParcel(parcel, 0);
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "WebHybridParamVo(saleShowStatus=" + this.LIZIZ + ", noHardwareAccelerated=" + this.LIZJ + ", enableAppCache=" + this.LIZLLL + ", useReceivedTitle=" + this.f25629LJ + ", headStr=" + this.LJFF + ", loadNoCache=" + this.LJI + ", offlineEnable=" + this.LJII + ", disableHostJsbMethod=" + this.LJIIIIZZ + ", referer=" + this.LJIIIZ + ", commonHybridParam=" + this.LJIIJ + LoggerUtil.S_RIGHT_TAG;
    }

    public WebHybridParamVo(int i, boolean z, boolean z2, boolean z3, String str, boolean z4, boolean z5, boolean z6, String str2, BaseHybridParamVo baseHybridParamVo) {
        this.LIZIZ = i;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.f25629LJ = z3;
        this.LJFF = str;
        this.LJI = z4;
        this.LJII = z5;
        this.LJIIIIZZ = z6;
        this.LJIIIZ = str2;
        this.LJIIJ = baseHybridParamVo;
    }

    public /* synthetic */ WebHybridParamVo(int i, boolean z, boolean z2, boolean z3, String str, boolean z4, boolean z5, boolean z6, String str2, BaseHybridParamVo baseHybridParamVo, int i2) {
        this(-1, false, false, false, str, false, true, false, "", baseHybridParamVo);
    }
}
