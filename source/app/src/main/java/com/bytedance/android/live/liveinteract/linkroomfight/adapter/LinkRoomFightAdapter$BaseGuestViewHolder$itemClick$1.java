package com.bytedance.android.live.liveinteract.linkroomfight.adapter;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C80666Hqu;

/* loaded from: classes3.dex */
public final class LinkRoomFightAdapter$BaseGuestViewHolder$itemClick$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C80666Hqu this$0;

    static {
        Covode.recordClassIndex(27502);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkRoomFightAdapter$BaseGuestViewHolder$itemClick$1(C80666Hqu c80666Hqu) {
        super(0);
        this.this$0 = c80666Hqu;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [kotlin.Unit, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        a$b a_b = this.this$0.LJIIIZ.LIZIZ;
        if (a_b != null) {
            a_b.LIZ(this.this$0.LJI);
            return Unit.INSTANCE;
        }
        return null;
    }
}
