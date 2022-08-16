package com.bytedance.android.live.broadcast.preview;

import android.content.Context;
import android.view.View;
import com.bytedance.android.livesdkapi.room.p781a.AbstractC9661d;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class StartLiveFragment$realOnViewCreated$10 extends Lambda implements Function1<AbstractC9661d, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ View $view;

    static {
        Covode.recordClassIndex(17181);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartLiveFragment$realOnViewCreated$10(View view) {
        super(1);
        this.$view = view;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(AbstractC9661d abstractC9661d) {
        AbstractC9661d abstractC9661d2 = abstractC9661d;
        if (!PatchProxy.proxy(new Object[]{abstractC9661d2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(abstractC9661d2);
            Context context = this.$view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            abstractC9661d2.LIZ(context);
        }
        return Unit.INSTANCE;
    }
}
