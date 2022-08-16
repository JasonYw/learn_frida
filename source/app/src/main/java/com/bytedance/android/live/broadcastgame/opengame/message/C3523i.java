package com.bytedance.android.live.broadcastgame.opengame.message;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import org.json.JSONObject;
import p003X.C106862S5w;
import p003X.C87463KdF;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.message.i */
/* loaded from: classes5.dex */
public class C3523i extends C87463KdF {
    public static ChangeQuickRedirect LIZJ;
    public final long LIZLLL;

    /* renamed from: LJ */
    public final long f26066LJ;

    static {
        Covode.recordClassIndex(20303);
    }

    @Override // p003X.C87463KdF
    public JSONObject LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZJ, false, 1);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        JSONObject LIZIZ = super.LIZIZ();
        LIZIZ.put("seq", this.LIZLLL);
        LIZIZ.put("time_stamp", System.currentTimeMillis());
        return LIZIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3523i(String str, long j, long j2, long j3, long j4) {
        super(str, j, j3);
        C106862S5w.LIZ(str);
        this.LIZLLL = j2;
        this.f26066LJ = j4;
    }

    public /* synthetic */ C3523i(String str, long j, long j2, long j3, long j4, int i) {
        this(str, j, j2, j3, 1L);
    }
}
