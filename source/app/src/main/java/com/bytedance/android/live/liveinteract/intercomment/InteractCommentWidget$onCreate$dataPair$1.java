package com.bytedance.android.live.liveinteract.intercomment;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class InteractCommentWidget$onCreate$dataPair$1 extends Lambda implements Function0<C4443i> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ InteractCommentWidget this$0;

    static {
        Covode.recordClassIndex(27431);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InteractCommentWidget$onCreate$dataPair$1(InteractCommentWidget interactCommentWidget) {
        super(0);
        this.this$0 = interactCommentWidget;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.bytedance.android.live.liveinteract.intercomment.i, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C4443i mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C4443i(this.this$0.LJIILIIL);
    }
}
