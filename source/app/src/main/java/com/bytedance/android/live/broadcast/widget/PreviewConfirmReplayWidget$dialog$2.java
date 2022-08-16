package com.bytedance.android.live.broadcast.widget;

import android.content.Context;
import com.bytedance.android.live.broadcast.view.DialogC3254g;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class PreviewConfirmReplayWidget$dialog$2 extends Lambda implements Function0<DialogC3254g> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PreviewConfirmReplayWidget this$0;

    static {
        Covode.recordClassIndex(18473);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewConfirmReplayWidget$dialog$2(PreviewConfirmReplayWidget previewConfirmReplayWidget) {
        super(0);
        this.this$0 = previewConfirmReplayWidget;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, com.bytedance.android.live.broadcast.view.g] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ DialogC3254g mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        Context context = this.this$0.context;
        Intrinsics.checkNotNullExpressionValue(context, "");
        return new DialogC3254g(context);
    }
}
