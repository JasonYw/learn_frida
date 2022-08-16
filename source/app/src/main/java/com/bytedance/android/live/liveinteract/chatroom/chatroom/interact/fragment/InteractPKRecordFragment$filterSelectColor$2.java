package com.bytedance.android.live.liveinteract.chatroom.chatroom.interact.fragment;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.CastProtectorUtils;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes22.dex */
public final class InteractPKRecordFragment$filterSelectColor$2 extends Lambda implements Function0<Integer> {
    public static final InteractPKRecordFragment$filterSelectColor$2 INSTANCE = new InteractPKRecordFragment$filterSelectColor$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(25742);
    }

    public InteractPKRecordFragment$filterSelectColor$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Integer mo30099invoke() {
        int parseColor;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            parseColor = ((Integer) proxy.result).intValue();
        } else {
            parseColor = CastProtectorUtils.parseColor("#FE2C55");
        }
        return Integer.valueOf(parseColor);
    }
}
