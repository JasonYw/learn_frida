package com.bytedance.android.live.broadcast.dialog;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C81918IQm;
import p003X.IWH;

/* loaded from: classes3.dex */
public final class AdvanceAnnouncementPushDialog$SPLITER_MARGIN$2 extends Lambda implements Function0<Integer> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ IWH this$0;

    static {
        Covode.recordClassIndex(15381);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvanceAnnouncementPushDialog$SPLITER_MARGIN$2(IWH iwh) {
        super(0);
        this.this$0 = iwh;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Integer mo30099invoke() {
        int i;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            i = ((Integer) proxy.result).intValue();
        } else {
            i = -((int) C81918IQm.LIZ(this.this$0.getContext(), 2.0f));
        }
        return Integer.valueOf(i);
    }
}
