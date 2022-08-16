package com.bytedance.android.live.broadcast.widget;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C436493Op;

/* loaded from: classes12.dex */
public final class PreLiveSettingDialog$liveInfoMediaWidget$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C436493Op this$0;

    static {
        Covode.recordClassIndex(18387);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreLiveSettingDialog$liveInfoMediaWidget$1(C436493Op c436493Op) {
        super(0);
        this.this$0 = c436493Op;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.dismiss();
        }
        return Unit.INSTANCE;
    }
}
