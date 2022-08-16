package com.bytedance.android.live.liveinteract.chatroom.chatroom.p354vm;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.bytedance.android.live.liveinteract.chatroom.chatroom.vm.LinkBidViewModel$$special$$inlined$apply$lambda$4 */
/* loaded from: classes3.dex */
public final class LinkBidViewModel$$special$$inlined$apply$lambda$4 extends Lambda implements Function1<Integer, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C4378a this$0;

    static {
        Covode.recordClassIndex(26457);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkBidViewModel$$special$$inlined$apply$lambda$4(C4378a c4378a) {
        super(1);
        this.this$0 = c4378a;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Integer num) {
        int intValue = num.intValue();
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(intValue)}, this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LJIILLIIL.setValue(Integer.valueOf(intValue));
        }
        return Unit.INSTANCE;
    }
}
