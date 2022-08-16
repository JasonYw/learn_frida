package com.bytedance.android.live.broadcast.dialog;

import com.bytedance.android.live.broadcast.widget.ForenoticeEntrySwitchWidget;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.LKF;

/* loaded from: classes5.dex */
public final class ForenoticeSettingDialog$mEntrySwitchWidget$2 extends Lambda implements Function0<ForenoticeEntrySwitchWidget> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ LKF this$0;

    static {
        Covode.recordClassIndex(15388);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForenoticeSettingDialog$mEntrySwitchWidget$2(LKF lkf) {
        super(0);
        this.this$0 = lkf;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.bytedance.android.live.broadcast.widget.ForenoticeEntrySwitchWidget, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ ForenoticeEntrySwitchWidget mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new ForenoticeEntrySwitchWidget(this.this$0.LIZIZ, this.this$0.LIZIZ());
    }
}
