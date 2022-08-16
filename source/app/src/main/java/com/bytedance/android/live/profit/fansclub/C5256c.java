package com.bytedance.android.live.profit.fansclub;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import java.util.Objects;
import p003X.C106862S5w;
import p003X.C4324038w;

/* renamed from: com.bytedance.android.live.profit.fansclub.c */
/* loaded from: classes12.dex */
public final class C5256c {
    public static ChangeQuickRedirect LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final FansClubUserStatus LIZLLL;

    /* renamed from: LJ */
    public final C4324038w f26558LJ;

    static {
        Covode.recordClassIndex(33273);
    }

    private Object[] LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? (Object[]) proxy.result : new Object[]{this.LIZIZ, Integer.valueOf(this.LIZJ), this.LIZLLL, this.f26558LJ};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 6);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5256c) {
            return C106862S5w.LIZ(((C5256c) obj).LIZJ(), LIZJ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZJ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 8);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("FansClubData:%s,%s,%s,%s", LIZJ());
    }

    public final boolean LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (TextUtils.isEmpty(this.LIZIZ)) {
            return false;
        }
        return true;
    }

    public final ImageModel LIZIZ() {
        ImageModel imageModel;
        List<String> urls;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (ImageModel) proxy.result;
        }
        C4324038w c4324038w = this.f26558LJ;
        if (c4324038w != null && (imageModel = c4324038w.LIZJ) != null && (urls = imageModel.getUrls()) != null && (!urls.isEmpty())) {
            return this.f26558LJ.LIZJ;
        }
        return null;
    }

    public C5256c(String str, int i, FansClubUserStatus fansClubUserStatus, C4324038w c4324038w) {
        C106862S5w.LIZ(str, fansClubUserStatus);
        this.LIZIZ = str;
        this.LIZJ = i;
        this.LIZLLL = fansClubUserStatus;
        this.f26558LJ = c4324038w;
    }
}
