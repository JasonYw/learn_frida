package com.bytedance.android.live.broadcast.dialog;

import com.bytedance.android.live.broadcast.viewmodel.C3255a;
import com.bytedance.android.live.broadcast.widget.ForenoticeEntryWidget;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.LK9;

/* loaded from: classes5.dex */
public final class ForenoticeEntryDialog$mForenoticeEntryWidget$2 extends Lambda implements Function0<ForenoticeEntryWidget> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ LK9 this$0;

    static {
        Covode.recordClassIndex(15384);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForenoticeEntryDialog$mForenoticeEntryWidget$2(LK9 lk9) {
        super(0);
        this.this$0 = lk9;
    }

    /* renamed from: com.bytedance.android.live.broadcast.dialog.ForenoticeEntryDialog$mForenoticeEntryWidget$2$1 */
    /* loaded from: classes5.dex */
    public static final class C29961 extends Lambda implements Function0<Unit> {
        public static final C29961 INSTANCE = new C29961();

        static {
            Covode.recordClassIndex(15385);
        }

        public C29961() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final /* bridge */ /* synthetic */ Unit mo30099invoke() {
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [com.bytedance.android.live.broadcast.widget.ForenoticeEntryWidget, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ ForenoticeEntryWidget mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        int i = this.this$0.LIZIZ;
        C3255a LIZIZ = this.this$0.LIZIZ();
        Intrinsics.checkNotNullExpressionValue(LIZIZ, "");
        return new ForenoticeEntryWidget(i, LIZIZ, this.this$0.LIZLLL, C29961.INSTANCE);
    }
}
