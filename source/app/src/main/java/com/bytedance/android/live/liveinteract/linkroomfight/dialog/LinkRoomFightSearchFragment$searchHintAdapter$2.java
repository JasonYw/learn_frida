package com.bytedance.android.live.liveinteract.linkroomfight.dialog;

import android.content.Context;
import com.bytedance.android.live.liveinteract.linkroomfight.adapter.C4448h;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C80087HhZ;

/* loaded from: classes3.dex */
public final class LinkRoomFightSearchFragment$searchHintAdapter$2 extends Lambda implements Function0<C4448h> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C80087HhZ this$0;

    static {
        Covode.recordClassIndex(27690);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkRoomFightSearchFragment$searchHintAdapter$2(C80087HhZ c80087HhZ) {
        super(0);
        this.this$0 = c80087HhZ;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, com.bytedance.android.live.liveinteract.linkroomfight.adapter.h] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C4448h mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        Context context = this.this$0.getContext();
        Intrinsics.checkNotNull(context);
        Intrinsics.checkNotNullExpressionValue(context, "");
        return new C4448h(context, this.this$0);
    }
}
