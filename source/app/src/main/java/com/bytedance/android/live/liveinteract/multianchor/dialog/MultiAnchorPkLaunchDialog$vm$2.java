package com.bytedance.android.live.liveinteract.multianchor.dialog;

import androidx.lifecycle.ViewModelProviders;
import com.bytedance.android.live.liveinteract.multianchor.p371k.C4527a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C79644HaQ;

/* loaded from: classes3.dex */
public final class MultiAnchorPkLaunchDialog$vm$2 extends Lambda implements Function0<C4527a> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C79644HaQ this$0;

    static {
        Covode.recordClassIndex(27954);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiAnchorPkLaunchDialog$vm$2(C79644HaQ c79644HaQ) {
        super(0);
        this.this$0 = c79644HaQ;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.bytedance.android.live.liveinteract.multianchor.k.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.bytedance.android.live.liveinteract.multianchor.k.a, androidx.lifecycle.ViewModel, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C4527a mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        ?? r1 = ViewModelProviders.m21144of(this.this$0).get(C4527a.class);
        Intrinsics.checkNotNullExpressionValue(r1, "");
        return r1;
    }
}
