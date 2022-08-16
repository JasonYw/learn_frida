package com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.viewholder;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.LHN;
import p003X.LK5;

/* loaded from: classes12.dex */
public final class PKRecordViewHolder$nonFixWidth$2 extends Lambda implements Function0<Integer> {
    public static final PKRecordViewHolder$nonFixWidth$2 INSTANCE = new PKRecordViewHolder$nonFixWidth$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(26078);
    }

    public PKRecordViewHolder$nonFixWidth$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Integer mo30099invoke() {
        int LIZLLL;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            LIZLLL = ((Integer) proxy.result).intValue();
        } else {
            LIZLLL = LHN.LIZLLL() - LK5.LIZ(164.0f);
        }
        return Integer.valueOf(LIZLLL);
    }
}
