package com.bytedance.android.live.media.impl.portrait;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class MediaIntroductionWidget$gesture$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ MediaIntroductionWidget this$0;

    static {
        Covode.recordClassIndex(32440);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaIntroductionWidget$gesture$1(MediaIntroductionWidget mediaIntroductionWidget) {
        super(0);
        this.this$0 = mediaIntroductionWidget;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LIZIZ();
        }
        return Unit.INSTANCE;
    }
}
