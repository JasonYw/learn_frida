package com.bytedance.android.live.broadcast.gamedetailv2;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C89053L6x;

/* loaded from: classes5.dex */
public final class AudienceGamePromoteDetailDialogV2$onViewCreated$1 extends Lambda implements Function1<Boolean, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C89053L6x this$0;

    static {
        Covode.recordClassIndex(16566);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudienceGamePromoteDetailDialogV2$onViewCreated$1(C89053L6x c89053L6x) {
        super(1);
        this.this$0 = c89053L6x;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(booleanValue ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LIZ(booleanValue);
        }
        return Unit.INSTANCE;
    }
}
