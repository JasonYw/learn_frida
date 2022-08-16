package com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.viewholder;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.LK5;

/* loaded from: classes3.dex */
public final class PKRecordViewHolder$sexWidth$2 extends Lambda implements Function0<Integer> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C4350u this$0;

    static {
        Covode.recordClassIndex(26080);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PKRecordViewHolder$sexWidth$2(C4350u c4350u) {
        super(0);
        this.this$0 = c4350u;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Integer mo30099invoke() {
        int LIZ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            LIZ = ((Integer) proxy.result).intValue();
        } else {
            LIZ = LK5.LIZ(14.0f) + this.this$0.LJIIIIZZ;
        }
        return Integer.valueOf(LIZ);
    }
}
