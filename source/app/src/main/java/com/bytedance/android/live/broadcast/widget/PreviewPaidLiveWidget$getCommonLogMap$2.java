package com.bytedance.android.live.broadcast.widget;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C2VQ;

/* loaded from: classes3.dex */
public final class PreviewPaidLiveWidget$getCommonLogMap$2 extends Lambda implements Function0<Map<String, ? extends String>> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PreviewPaidLiveWidget this$0;

    static {
        Covode.recordClassIndex(18633);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewPaidLiveWidget$getCommonLogMap$2(PreviewPaidLiveWidget previewPaidLiveWidget) {
        super(0);
        this.this$0 = previewPaidLiveWidget;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.Map<java.lang.String, ? extends java.lang.String>, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Map<String, ? extends String> mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return MapsKt__MapsKt.mapOf(TuplesKt.m137to("enter_from_merge", "direct_shoot"), TuplesKt.m137to("live_type", C2VQ.LIZ(this.this$0.LJIIJJI().LIZ().LIZ())));
    }
}
