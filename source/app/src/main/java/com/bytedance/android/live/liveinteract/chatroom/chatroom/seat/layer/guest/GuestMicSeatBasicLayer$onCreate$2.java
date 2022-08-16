package com.bytedance.android.live.liveinteract.chatroom.chatroom.seat.layer.guest;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C80680Hr8;

/* loaded from: classes3.dex */
public final class GuestMicSeatBasicLayer$onCreate$2 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C80680Hr8 this$0;

    static {
        Covode.recordClassIndex(26379);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GuestMicSeatBasicLayer$onCreate$2(C80680Hr8 c80680Hr8) {
        super(1);
        this.this$0 = c80680Hr8;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            this.this$0.LJIILL();
        }
        return Unit.INSTANCE;
    }
}
