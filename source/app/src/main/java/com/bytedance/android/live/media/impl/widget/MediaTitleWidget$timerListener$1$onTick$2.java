package com.bytedance.android.live.media.impl.widget;

import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C2WC;
import p003X.C409882Kg;
import p003X.C441013cV;

/* loaded from: classes12.dex */
public final class MediaTitleWidget$timerListener$1$onTick$2 extends Lambda implements Function1<Boolean, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C441013cV this$0;

    static {
        Covode.recordClassIndex(32487);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaTitleWidget$timerListener$1$onTick$2(C441013cV c441013cV) {
        super(1);
        this.this$0 = c441013cV;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Boolean bool) {
        C5923dp LIZ;
        C2WC<Boolean> LLLJIL;
        boolean booleanValue = bool.booleanValue();
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(booleanValue ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1).isSupported && booleanValue && (LIZ = C409882Kg.LIZ(C5923dp.LJIIJ, this.this$0.LIZIZ.dataCenter, 0L, 2, null)) != null && (LLLJIL = LIZ.LLLJIL()) != null) {
            LLLJIL.LIZ(Boolean.TRUE);
        }
        return Unit.INSTANCE;
    }
}
