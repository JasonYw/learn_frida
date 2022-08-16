package com.bytedance.android.live.broadcast.welfare;

import com.bytedance.android.live.broadcast.welfare.coupon.C3268d;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.LDA;

/* loaded from: classes5.dex */
public final class ReceivedWelfareFragmentAdapter$mGameCouponFragment$2 extends Lambda implements Function0<C3268d> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ String $mStartPage;

    static {
        Covode.recordClassIndex(18173);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReceivedWelfareFragmentAdapter$mGameCouponFragment$2(String str) {
        super(0);
        this.$mStartPage = str;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, com.bytedance.android.live.broadcast.welfare.coupon.d] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, com.bytedance.android.live.broadcast.welfare.coupon.d] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C3268d mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        LDA lda = C3268d.LIZJ;
        String str = this.$mStartPage;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{str}, lda, LDA.LIZ, false, 1);
        if (proxy2.isSupported) {
            return proxy2.result;
        }
        C3268d c3268d = new C3268d();
        c3268d.LIZIZ = str;
        return c3268d;
    }
}
