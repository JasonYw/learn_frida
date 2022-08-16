package com.android.ttcjpaysdk.base.p135ui.Utils.p136a;

import com.android.ttcjpaysdk.base.p135ui.data.RetainInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C106862S5w;
import p003X.C136655cUc;
import p003X.C136665cUm;

/* renamed from: com.android.ttcjpaysdk.base.ui.Utils.a.c */
/* loaded from: classes17.dex */
public class C2174c {
    public static ChangeQuickRedirect LIZ;
    public static final C136665cUm LJI = new C136665cUm((byte) 0);
    public String LIZIZ;
    public RetainInfo LIZJ;
    public boolean LIZLLL;

    /* renamed from: LJ */
    public boolean f25456LJ;
    public AbstractC2173a LJFF;

    static {
        Covode.recordClassIndex(6612);
    }

    public C2174c() {
        this(null, null, false, false, null, 31);
    }

    public boolean LIZIZ() {
        return false;
    }

    public int LIZJ() {
        return 2131493160;
    }

    public boolean LIZLLL() {
        return false;
    }

    public int LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        RetainInfo retainInfo = this.LIZJ;
        if (retainInfo == null) {
            return 0;
        }
        if (retainInfo.isNewStyle()) {
            if (!this.LIZLLL || !(!retainInfo.retain_msg_bonus_list.isEmpty())) {
                if (retainInfo.isFeatureStyle() || !(!retainInfo.retain_msg_text_list.isEmpty())) {
                    if (!LIZLLL() || this.LIZLLL || !retainInfo.isFeatureStyle() || retainInfo.feature_info == null) {
                        return 0;
                    }
                    return 3;
                }
                return 1;
            }
        } else if (!this.LIZLLL || retainInfo.retain_msg_bonus.length() <= 0) {
            if (retainInfo.retain_msg_text.length() <= 0) {
                return 0;
            }
            return 1;
        }
        return 2;
    }

    public C2174c(String str, RetainInfo retainInfo, boolean z, boolean z2, AbstractC2173a abstractC2173a) {
        C106862S5w.LIZ(str, abstractC2173a);
        this.LIZIZ = str;
        this.LIZJ = retainInfo;
        this.LIZLLL = z;
        this.f25456LJ = z2;
        this.LJFF = abstractC2173a;
    }

    public /* synthetic */ C2174c(String str, RetainInfo retainInfo, boolean z, boolean z2, AbstractC2173a abstractC2173a, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : retainInfo, (i & 4) != 0 ? false : z, false, (i & 16) != 0 ? new C136655cUc() : abstractC2173a);
    }
}
