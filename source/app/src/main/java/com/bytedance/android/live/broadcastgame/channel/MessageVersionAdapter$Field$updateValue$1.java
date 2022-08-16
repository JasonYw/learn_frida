package com.bytedance.android.live.broadcastgame.channel;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.KY8;

/* loaded from: classes5.dex */
public final class MessageVersionAdapter$Field$updateValue$1 extends Lambda implements Function1<Function1<? super T, ? extends Unit>, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ KY8 this$0;

    static {
        Covode.recordClassIndex(19375);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MessageVersionAdapter$Field$updateValue$1(KY8 ky8) {
        super(1);
        this.this$0 = ky8;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Object obj) {
        Function1 function1 = (Function1) obj;
        if (!PatchProxy.proxy(new Object[]{function1}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(function1);
            function1.invoke(this.this$0.LIZLLL);
        }
        return Unit.INSTANCE;
    }
}
