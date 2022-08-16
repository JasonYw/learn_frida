package com.bytedance.android.live.broadcastgame.channel.interceptor;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C3804915f;

/* loaded from: classes.dex */
public final class SeqInterceptor$appendSeqNumber$$inlined$synchronized$lambda$1 extends Lambda implements Function1<Long, Boolean> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ long $number$inlined;
    public final /* synthetic */ C3804915f this$0;

    static {
        Covode.recordClassIndex(19503);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeqInterceptor$appendSeqNumber$$inlined$synchronized$lambda$1(C3804915f c3804915f, long j) {
        super(1);
        this.this$0 = c3804915f;
        this.$number$inlined = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Boolean invoke(Long l) {
        long longValue = l.longValue();
        boolean z = true;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(longValue)}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            z = ((Boolean) proxy.result).booleanValue();
        } else if (longValue >= this.$number$inlined - (this.this$0.LIZ().size() / 2)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
