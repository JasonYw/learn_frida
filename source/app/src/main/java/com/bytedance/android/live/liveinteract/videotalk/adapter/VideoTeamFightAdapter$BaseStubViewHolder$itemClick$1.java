package com.bytedance.android.live.liveinteract.videotalk.adapter;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C80670Hqy;

/* loaded from: classes3.dex */
public final class VideoTeamFightAdapter$BaseStubViewHolder$itemClick$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C80670Hqy this$0;

    static {
        Covode.recordClassIndex(29663);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoTeamFightAdapter$BaseStubViewHolder$itemClick$1(C80670Hqy c80670Hqy) {
        super(0);
        this.this$0 = c80670Hqy;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [kotlin.Unit, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        ab$c ab_c = this.this$0.LJIIIZ.LIZIZ;
        if (ab_c != null) {
            ab_c.LIZ(this.this$0.LJIIIIZZ);
            return Unit.INSTANCE;
        }
        return null;
    }
}
