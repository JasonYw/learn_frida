package com.bytedance.android.live.playtogether.p409c;

import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C116971W2r;

/* renamed from: com.bytedance.android.live.playtogether.c.l */
/* loaded from: classes5.dex */
public final class C5212l {
    public static ChangeQuickRedirect LIZ;
    public final ImageModel LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    /* renamed from: LJ */
    public final String f26535LJ;
    public final String LJFF;
    public final String LJI;
    public final String LJII;
    public final ImageModel LJIIIIZZ;
    public final int LJIIIZ;
    public final String LJIIJ;
    public final long LJIIJJI;
    public final int LJIIL;
    public final int LJIILIIL;
    public final MutableLiveData<Integer> LJIILJJIL;
    public final MutableLiveData<Integer> LJIILL;
    public final MutableLiveData<Integer> LJIILLIIL;
    public final MutableLiveData<Integer> LJIIZILJ;

    static {
        Covode.recordClassIndex(32916);
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 5);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this != obj) {
            if (obj instanceof C5212l) {
                C5212l c5212l = (C5212l) obj;
                if (!Intrinsics.areEqual(this.LIZIZ, c5212l.LIZIZ) || !Intrinsics.areEqual(this.LIZJ, c5212l.LIZJ) || !Intrinsics.areEqual(this.LIZLLL, c5212l.LIZLLL) || !Intrinsics.areEqual(this.f26535LJ, c5212l.f26535LJ) || !Intrinsics.areEqual(this.LJFF, c5212l.LJFF) || !Intrinsics.areEqual(this.LJI, c5212l.LJI) || !Intrinsics.areEqual(this.LJII, c5212l.LJII) || !Intrinsics.areEqual(this.LJIIIIZZ, c5212l.LJIIIIZZ) || this.LJIIIZ != c5212l.LJIIIZ || !Intrinsics.areEqual(this.LJIIJ, c5212l.LJIIJ) || this.LJIIJJI != c5212l.LJIIJJI || this.LJIIL != c5212l.LJIIL || this.LJIILIIL != c5212l.LJIILIIL || !Intrinsics.areEqual(this.LJIILJJIL, c5212l.LJIILJJIL) || !Intrinsics.areEqual(this.LJIILL, c5212l.LJIILL) || !Intrinsics.areEqual(this.LJIILLIIL, c5212l.LJIILLIIL) || !Intrinsics.areEqual(this.LJIIZILJ, c5212l.LJIIZILJ)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        ImageModel imageModel = this.LIZIZ;
        int hashCode = (imageModel != null ? imageModel.hashCode() : 0) * 31;
        String str = this.LIZJ;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.LIZLLL;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f26535LJ;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.LJFF;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.LJI;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.LJII;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        ImageModel imageModel2 = this.LJIIIIZZ;
        int hashCode8 = imageModel2 != null ? imageModel2.hashCode() : 0;
        int i2 = this.LJIIIZ;
        C116971W2r.LIZ(i2);
        int i3 = (((hashCode7 + hashCode8) * 31) + i2) * 31;
        String str7 = this.LJIIJ;
        int hashCode9 = str7 != null ? str7.hashCode() : 0;
        int i4 = this.LJIIL;
        C116971W2r.LIZ(i4);
        int i5 = this.LJIILIIL;
        C116971W2r.LIZ(i5);
        int LIZ2 = (((((((i3 + hashCode9) * 31) + C116971W2r.LIZ(this.LJIIJJI)) * 31) + i4) * 31) + i5) * 31;
        MutableLiveData<Integer> mutableLiveData = this.LJIILJJIL;
        int hashCode10 = (LIZ2 + (mutableLiveData != null ? mutableLiveData.hashCode() : 0)) * 31;
        MutableLiveData<Integer> mutableLiveData2 = this.LJIILL;
        int hashCode11 = (hashCode10 + (mutableLiveData2 != null ? mutableLiveData2.hashCode() : 0)) * 31;
        MutableLiveData<Integer> mutableLiveData3 = this.LJIILLIIL;
        int hashCode12 = (hashCode11 + (mutableLiveData3 != null ? mutableLiveData3.hashCode() : 0)) * 31;
        MutableLiveData<Integer> mutableLiveData4 = this.LJIIZILJ;
        if (mutableLiveData4 != null) {
            i = mutableLiveData4.hashCode();
        }
        return hashCode12 + i;
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "OrderInfo(orderId='" + this.LJIIJ + "', playId=" + this.LJIIJJI + ", playType=" + this.LJIIL + ", auditStatus=" + this.LJIILJJIL.getValue() + ", refundStatus=" + this.LJIILL.getValue() + ", orderStatus=" + this.LJIILLIIL.getValue() + ", recordStatus=" + this.LJIIZILJ.getValue() + LoggerUtil.S_RIGHT_TAG;
    }

    public C5212l(ImageModel imageModel, String str, String str2, String str3, String str4, String str5, String str6, ImageModel imageModel2, int i, String str7, long j, int i2, int i3, MutableLiveData<Integer> mutableLiveData, MutableLiveData<Integer> mutableLiveData2, MutableLiveData<Integer> mutableLiveData3, MutableLiveData<Integer> mutableLiveData4) {
        C106862S5w.LIZ(str2, str3, str7, mutableLiveData, mutableLiveData2, mutableLiveData3, mutableLiveData4);
        this.LIZIZ = imageModel;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.f26535LJ = str3;
        this.LJFF = str4;
        this.LJI = str5;
        this.LJII = str6;
        this.LJIIIIZZ = imageModel2;
        this.LJIIIZ = i;
        this.LJIIJ = str7;
        this.LJIIJJI = j;
        this.LJIIL = i2;
        this.LJIILIIL = i3;
        this.LJIILJJIL = mutableLiveData;
        this.LJIILL = mutableLiveData2;
        this.LJIILLIIL = mutableLiveData3;
        this.LJIIZILJ = mutableLiveData4;
    }
}
