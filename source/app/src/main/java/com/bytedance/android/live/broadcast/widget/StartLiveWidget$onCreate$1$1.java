package com.bytedance.android.live.broadcast.widget;

import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C76989GWx;

/* loaded from: classes3.dex */
public final class StartLiveWidget$onCreate$1$1 extends Lambda implements Function1<Boolean, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C76989GWx this$0;

    static {
        Covode.recordClassIndex(18821);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartLiveWidget$onCreate$1$1(C76989GWx c76989GWx) {
        super(1);
        this.this$0 = c76989GWx;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(booleanValue ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1).isSupported) {
            if (booleanValue) {
                this.this$0.LIZIZ.LIZIZ();
            } else {
                ALogger.m15797i(this.this$0.LIZIZ.LIZ(), "not start because hook return false");
            }
        }
        return Unit.INSTANCE;
    }
}
