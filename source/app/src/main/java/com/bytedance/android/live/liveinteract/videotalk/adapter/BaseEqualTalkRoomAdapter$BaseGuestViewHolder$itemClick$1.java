package com.bytedance.android.live.liveinteract.videotalk.adapter;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C80667Hqv;

/* loaded from: classes3.dex */
public final class BaseEqualTalkRoomAdapter$BaseGuestViewHolder$itemClick$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C80667Hqv this$0;

    static {
        Covode.recordClassIndex(29634);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseEqualTalkRoomAdapter$BaseGuestViewHolder$itemClick$1(C80667Hqv c80667Hqv) {
        super(0);
        this.this$0 = c80667Hqv;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [kotlin.Unit, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        AbstractC4848n abstractC4848n = this.this$0.LJIJJ.LIZIZ;
        if (abstractC4848n != null) {
            abstractC4848n.LIZ(this.this$0.LJIJ);
            return Unit.INSTANCE;
        }
        return null;
    }
}
