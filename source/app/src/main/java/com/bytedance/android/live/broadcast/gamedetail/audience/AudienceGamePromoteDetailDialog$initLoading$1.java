package com.bytedance.android.live.broadcast.gamedetail.audience;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.L76;

/* loaded from: classes5.dex */
public final class AudienceGamePromoteDetailDialog$initLoading$1 extends Lambda implements Function1<Boolean, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ L76 this$0;

    static {
        Covode.recordClassIndex(16113);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudienceGamePromoteDetailDialog$initLoading$1(L76 l76) {
        super(1);
        this.this$0 = l76;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(booleanValue ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1).isSupported) {
            if (booleanValue) {
                this.this$0.LIZ(true);
            } else {
                this.this$0.LIZ(false);
            }
        }
        return Unit.INSTANCE;
    }
}
