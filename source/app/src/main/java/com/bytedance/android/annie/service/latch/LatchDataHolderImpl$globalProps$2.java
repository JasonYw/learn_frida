package com.bytedance.android.annie.service.latch;

import com.bytedance.android.annie.param.C2613i;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Map;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC99737PPv;
import p003X.C99718PPc;
import p003X.C99782PRo;
import p003X.C99786PRs;
import p003X.PRQ;

/* loaded from: classes7.dex */
public final class LatchDataHolderImpl$globalProps$2 extends Lambda implements Function0<Map<String, ? extends Object>> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PRQ this$0;

    static {
        Covode.recordClassIndex(11084);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LatchDataHolderImpl$globalProps$2(PRQ prq) {
        super(0);
        this.this$0 = prq;
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [java.util.Map<java.lang.String, ? extends java.lang.Object>, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Map<String, ? extends Object> mo30099invoke() {
        C2613i LIZ;
        Map<String, ? extends Object> LIZ2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        String authority = this.this$0.LIZJ.getAuthority();
        if (authority == null) {
            authority = "";
        }
        int hashCode = authority.hashCode();
        if (hashCode != 469921128) {
            if (hashCode == 1435311181 && authority.equals("webcast_webview")) {
                LIZ = C99718PPc.LJIIJ.LIZ(this.this$0.LIZIZ, this.this$0.LIZJ.toString(), this.this$0.LIZLLL, PRQ.LJFF.LIZ(this.this$0.LIZJ), "", this.this$0.f10629LJ, false);
                if (LIZ != null && (LIZ2 = C99786PRs.LIZIZ.LIZ(LIZ)) != null) {
                    return LIZ2;
                }
            }
            return MapsKt__MapsKt.emptyMap();
        }
        if (authority.equals("webcast_lynxview")) {
            LIZ = ((AbstractC99737PPv) C99782PRo.LIZIZ.LIZ(AbstractC99737PPv.class)).LIZ(this.this$0.LIZIZ, this.this$0.LIZJ.toString(), this.this$0.LIZLLL, "", this.this$0.f10629LJ, false);
            if (LIZ != null) {
                return LIZ2;
            }
        }
        return MapsKt__MapsKt.emptyMap();
    }
}
