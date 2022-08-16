package com.bytedance.android.live.liveinteract.chatroom.chatroom.widget;

import android.content.Context;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.p347a.C4306a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class PKRivalsPanelSearchWidget$mHistoryAdapter$2 extends Lambda implements Function0<C4306a> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PKRivalsPanelSearchWidget this$0;

    static {
        Covode.recordClassIndex(26514);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PKRivalsPanelSearchWidget$mHistoryAdapter$2(PKRivalsPanelSearchWidget pKRivalsPanelSearchWidget) {
        super(0);
        this.this$0 = pKRivalsPanelSearchWidget;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.a.a] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C4306a mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        Context context = this.this$0.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        return new C4306a(context, this.this$0.LJIIIIZZ, this.this$0);
    }
}
