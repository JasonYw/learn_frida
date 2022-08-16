package com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.viewholder;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.LK5;

/* loaded from: classes22.dex */
public final class PKRecordViewHolder$minNickWidth$2 extends Lambda implements Function0<Integer> {
    public static final PKRecordViewHolder$minNickWidth$2 INSTANCE = new PKRecordViewHolder$minNickWidth$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(26077);
    }

    public PKRecordViewHolder$minNickWidth$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Integer mo30099invoke() {
        int LIZ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            LIZ = ((Integer) proxy.result).intValue();
        } else {
            LIZ = LK5.LIZ(58.0f);
        }
        return Integer.valueOf(LIZ);
    }
}
