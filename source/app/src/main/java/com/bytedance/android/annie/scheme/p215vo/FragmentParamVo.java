package com.bytedance.android.annie.scheme.p215vo;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C106862S5w;
import p003X.C99832PTm;

/* renamed from: com.bytedance.android.annie.scheme.vo.FragmentParamVo */
/* loaded from: classes7.dex */
public final class FragmentParamVo implements Parcelable {
    public static final Parcelable.Creator<FragmentParamVo> CREATOR = new C99832PTm();
    public static ChangeQuickRedirect LIZ;
    public LynxHybridParamVo LIZIZ;
    public WebHybridParamVo LIZJ;
    public BaseHybridParamVo LIZLLL;

    static {
        Covode.recordClassIndex(10997);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (PatchProxy.proxy(new Object[]{parcel, Integer.valueOf(i)}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(parcel);
        LynxHybridParamVo lynxHybridParamVo = this.LIZIZ;
        if (lynxHybridParamVo != null) {
            parcel.writeInt(1);
            lynxHybridParamVo.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        WebHybridParamVo webHybridParamVo = this.LIZJ;
        if (webHybridParamVo != null) {
            parcel.writeInt(1);
            webHybridParamVo.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        BaseHybridParamVo baseHybridParamVo = this.LIZLLL;
        if (baseHybridParamVo == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        baseHybridParamVo.writeToParcel(parcel, 0);
    }

    public FragmentParamVo(LynxHybridParamVo lynxHybridParamVo, WebHybridParamVo webHybridParamVo, BaseHybridParamVo baseHybridParamVo) {
        this.LIZIZ = lynxHybridParamVo;
        this.LIZJ = webHybridParamVo;
        this.LIZLLL = baseHybridParamVo;
    }
}
