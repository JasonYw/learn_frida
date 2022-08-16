package com.bytedance.android.live.liveinteract.jsbridge.method;

import com.bytedance.android.live.browser.jsbridge.base.SendQuickInteractResultModel;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C101520PyU;

/* loaded from: classes8.dex */
public final class SendQuickInteractMethod$invoke$1 extends Lambda implements Function1<Integer, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ SendQuickInteractResultModel $result;
    public final /* synthetic */ C101520PyU this$0;

    static {
        Covode.recordClassIndex(27462);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendQuickInteractMethod$invoke$1(C101520PyU c101520PyU, SendQuickInteractResultModel sendQuickInteractResultModel) {
        super(1);
        this.this$0 = c101520PyU;
        this.$result = sendQuickInteractResultModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Integer num) {
        SendQuickInteractResultModel.Code code;
        int intValue = num.intValue();
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(intValue)}, this, changeQuickRedirect, false, 1).isSupported && this.this$0.callContext != null) {
            SendQuickInteractResultModel sendQuickInteractResultModel = this.$result;
            if (intValue != 1) {
                code = SendQuickInteractResultModel.Code.Failed;
            } else {
                code = SendQuickInteractResultModel.Code.Success;
            }
            sendQuickInteractResultModel.LIZ = code;
            this.this$0.finishWithResult(this.$result);
        }
        return Unit.INSTANCE;
    }
}
