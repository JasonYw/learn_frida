package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* renamed from: com.bytedance.android.live.base.model.user.d */
/* loaded from: classes12.dex */
public class C2851d {
    public static ChangeQuickRedirect LIZ;
    public Object LIZIZ;
    public int LIZJ;
    public boolean LIZLLL;

    /* renamed from: LJ */
    public String f25765LJ;
    public ImageModel LJFF;
    public String LJI;

    static {
        Covode.recordClassIndex(14271);
    }

    public String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "ContactUser{mBase=" + this.LIZIZ + ", mType=" + this.LIZJ + ", isStickTop=" + this.LIZLLL + ", mDisplayName='" + this.f25765LJ + "', mDisplayAvatar=" + this.LJFF + ", mUidString='" + this.LJI + "'}";
    }

    public C2851d(Object obj, int i, boolean z, String str, ImageModel imageModel, String str2) {
        this.LIZJ = i;
        this.LIZIZ = obj;
        this.LIZLLL = z;
        this.f25765LJ = str;
        this.LJFF = imageModel;
        this.LJI = str2;
    }
}
