package com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.viewholder;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.LK5;

/* loaded from: classes3.dex */
public final class PKRecordViewHolder$btnWidth$2 extends Lambda implements Function0<Integer> {
    public static final PKRecordViewHolder$btnWidth$2 INSTANCE = new PKRecordViewHolder$btnWidth$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(26076);
    }

    public PKRecordViewHolder$btnWidth$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Integer mo30099invoke() {
        int m23417LJ;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            m23417LJ = ((Integer) proxy.result).intValue();
        } else {
            m23417LJ = LK5.m23417LJ(2131429359);
        }
        return Integer.valueOf(m23417LJ);
    }
}
