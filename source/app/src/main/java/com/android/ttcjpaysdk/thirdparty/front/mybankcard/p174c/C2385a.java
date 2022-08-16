package com.android.ttcjpaysdk.thirdparty.front.mybankcard.p174c;

import android.os.CountDownTimer;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.CJPayPageLoadTrace;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.android.ttcjpaysdk.thirdparty.front.mybankcard.p173b.C2384b;
import com.android.ttcjpaysdk.thirdparty.front.mybankcard.p175e.AbstractC2386a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.android.ugc.aweme.lego.experiment.LegoCommitOptExperiment;
import org.json.JSONObject;
import p003X.C135543cCg;
import p003X.C135626cE1;
import p003X.CountDownTimerC135628cE3;

/* renamed from: com.android.ttcjpaysdk.thirdparty.front.mybankcard.c.a */
/* loaded from: classes17.dex */
public final class C2385a extends C135543cCg<C2384b, AbstractC2386a> {
    public static ChangeQuickRedirect LIZ;
    public boolean LIZIZ;
    public JSONObject LIZJ;
    public int LIZLLL = -1;

    /* renamed from: LJ */
    public long f25539LJ;
    public final long LJFF;
    public final CountDownTimer LJI;
    public boolean LJII;

    static {
        Covode.recordClassIndex(8733);
    }

    public C2385a() {
        long j;
        if (2 == CJPayHostInfo.serverType) {
            j = LegoCommitOptExperiment.BOOT_FINISH_DELAY_TIME;
        } else {
            j = 1000;
        }
        this.LJFF = j;
        long j2 = this.LJFF;
        this.LJI = new CountDownTimerC135628cE3(this, j2, j2);
    }

    public boolean LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (getContext() == null) {
            return false;
        }
        return CJPayBasicUtils.isNetworkAvailable(getContext());
    }

    public final void LIZ(JSONObject jSONObject) {
        if (!PatchProxy.proxy(new Object[]{jSONObject}, this, LIZ, false, 2).isSupported && jSONObject != null && !this.LJII) {
            this.LJII = true;
            if (this.mView != 0) {
                ((AbstractC2386a) this.mView).LIZ(jSONObject, this.LJII);
            }
        }
    }

    public final void LIZ(boolean z) {
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 5).isSupported && LIZ()) {
            C135626cE1 c135626cE1 = new C135626cE1(this, z);
            if (this.mModel != 0) {
                CJPayPageLoadTrace.LIZ().LIZ(CJPayPageLoadTrace.Page.MY_CARD, CJPayPageLoadTrace.Section.NETWORK);
                ((C2384b) this.mModel).LIZ("SmchId", c135626cE1);
            }
        }
    }
}
