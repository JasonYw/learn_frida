package com.bytedance.android.live.broadcast.gamedetailv2.template;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p003X.L7T;

/* loaded from: classes5.dex */
public final class BaseViewHolder$1 extends Lambda implements Function2<Boolean, T, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ L7T this$0;

    static {
        Covode.recordClassIndex(16686);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseViewHolder$1(L7T l7t) {
        super(2);
        this.this$0 = l7t;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Unit invoke(Boolean bool, Object obj) {
        boolean booleanValue = bool.booleanValue();
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(booleanValue ? (byte) 1 : (byte) 0), obj}, this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LIZ(booleanValue, obj);
        }
        return Unit.INSTANCE;
    }
}
