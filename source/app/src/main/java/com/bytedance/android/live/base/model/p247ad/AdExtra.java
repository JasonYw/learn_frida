package com.bytedance.android.live.base.model.p247ad;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import p003X.C3LJ;
import p003X.KM9;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.base.model.ad.AdExtra */
/* loaded from: classes6.dex */
public final class AdExtra implements C3LJ {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("raw_data")
    public String rawData;

    static {
        Covode.recordClassIndex(13984);
    }

    public AdExtra() {
    }

    public AdExtra(C10532g c10532g) {
        long LIZ = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                c10532g.LIZ(LIZ);
                return;
            } else if (LIZIZ != 1) {
                QV1.LJII(c10532g);
            } else {
                this.rawData = QV1.LJFF(c10532g);
            }
        }
    }

    public final LiveAdRawData getRawAdData() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (LiveAdRawData) proxy.result;
        }
        if (this.rawData == null) {
            return null;
        }
        try {
            return (LiveAdRawData) KM9.LIZ().fromJson(this.rawData, (Class<Object>) LiveAdRawData.class);
        } catch (Exception unused) {
            return null;
        }
    }
}
