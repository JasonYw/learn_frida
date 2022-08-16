package com.bytedance.android.live.core.room.startup;

import com.bytedance.android.live.core.room.startup.C4090l;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes20.dex */
public final class RoomTaskManager$mDefaultTaskListener$2 extends Lambda implements Function0<C4090l.C4091b> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C4090l this$0;

    static {
        Covode.recordClassIndex(23592);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomTaskManager$mDefaultTaskListener$2(C4090l c4090l) {
        super(0);
        this.this$0 = c4090l;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.bytedance.android.live.core.room.startup.l$b, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C4090l.C4091b mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C4090l.C4091b(this.this$0.LIZLLL);
    }
}
