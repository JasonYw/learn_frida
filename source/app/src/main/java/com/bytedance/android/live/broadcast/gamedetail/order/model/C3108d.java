package com.bytedance.android.live.broadcast.gamedetail.order.model;

import com.bytedance.android.tools.p859a.p860a.C10532g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import com.xiaomi.mipush.sdk.Constants;
import kotlin.jvm.internal.Intrinsics;
import p003X.C3LJ;
import p003X.QV1;

/* renamed from: com.bytedance.android.live.broadcast.gamedetail.order.model.d */
/* loaded from: classes5.dex */
public final class C3108d implements C3LJ {
    public static ChangeQuickRedirect LIZ;
    @SerializedName(Constants.APP_ID)
    public int LIZIZ;
    @SerializedName("user_id")
    public long LIZJ;
    @SerializedName("nick_name")
    public String LIZLLL;
    @SerializedName("avatar_uri")

    /* renamed from: LJ */
    public String f25879LJ;
    @SerializedName("sec_uid")
    public String LJFF;
    @SerializedName("fans_num")
    public String LJI;
    @SerializedName("is_follow")
    public boolean LJII;

    static {
        Covode.recordClassIndex(16518);
    }

    public C3108d() {
        this.LIZIZ = 0;
        this.LIZJ = 0L;
        this.LIZLLL = "";
        this.f25879LJ = "";
        this.LJFF = null;
        this.LJI = "";
        this.LJII = false;
    }

    public C3108d(C10532g c10532g) {
        long LIZ2 = c10532g.LIZ();
        while (true) {
            int LIZIZ = c10532g.LIZIZ();
            if (LIZIZ == -1) {
                c10532g.LIZ(LIZ2);
                if (this.LIZIZ == 0) {
                    this.LIZIZ = 0;
                }
                if (this.LIZJ == 0) {
                    this.LIZJ = 0L;
                }
                if (this.LIZLLL == null) {
                    this.LIZLLL = "";
                }
                if (this.f25879LJ == null) {
                    this.f25879LJ = "";
                }
                if (this.LJFF == null) {
                    this.LJFF = null;
                }
                if (this.LJI == null) {
                    this.LJI = "";
                }
                if (this.LJII) {
                    return;
                }
                this.LJII = false;
                return;
            }
            switch (LIZIZ) {
                case 1:
                    this.LIZIZ = QV1.LIZIZ(c10532g);
                    break;
                case 2:
                    this.LIZJ = QV1.LIZJ(c10532g);
                    break;
                case 3:
                    this.LIZLLL = QV1.LJFF(c10532g);
                    break;
                case 4:
                    this.f25879LJ = QV1.LJFF(c10532g);
                    break;
                case 5:
                    this.LJFF = QV1.LJFF(c10532g);
                    break;
                case 6:
                    this.LJI = QV1.LJFF(c10532g);
                    break;
                case 7:
                    this.LJII = QV1.LIZ(c10532g);
                    break;
                default:
                    QV1.LJII(c10532g);
                    break;
            }
        }
    }

    public final String LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        String str = this.LIZLLL;
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public final String LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        String str = this.f25879LJ;
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }

    public final String LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        String str = this.LJI;
        Intrinsics.checkNotNullExpressionValue(str, "");
        return str;
    }
}
