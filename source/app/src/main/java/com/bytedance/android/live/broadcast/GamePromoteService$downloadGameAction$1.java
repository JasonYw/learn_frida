package com.bytedance.android.live.broadcast;

import android.content.Context;
import com.bytedance.android.live.broadcast.download.C3002c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.LE4;

/* loaded from: classes5.dex */
public final class GamePromoteService$downloadGameAction$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C3002c $downloadInfo;

    static {
        Covode.recordClassIndex(14296);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GamePromoteService$downloadGameAction$1(Context context, C3002c c3002c) {
        super(0);
        this.$context = context;
        this.$downloadInfo = c3002c;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            LE4.LIZIZ.LIZIZ(this.$context, this.$downloadInfo);
        }
        return Unit.INSTANCE;
    }
}
