package com.bytedance.android.live.broadcast.widget;

import com.bytedance.android.live.broadcast.viewmodel.C3255a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes12.dex */
public final class AnnouncementEntryCompat$forenoticeEntryWidget$2 extends Lambda implements Function0<ForenoticeEntryWidget> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C3318d this$0;

    static {
        Covode.recordClassIndex(18298);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnnouncementEntryCompat$forenoticeEntryWidget$2(C3318d c3318d) {
        super(0);
        this.this$0 = c3318d;
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.AnnouncementEntryCompat$forenoticeEntryWidget$2$1 */
    /* loaded from: classes12.dex */
    public static final class C32761 extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(18299);
        }

        public C32761() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final /* synthetic */ Unit mo30099invoke() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
                AnnouncementEntryCompat$forenoticeEntryWidget$2.this.this$0.LIZJ.mo30099invoke();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.bytedance.android.live.broadcast.widget.ForenoticeEntryWidget, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ ForenoticeEntryWidget mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C3255a LIZ = this.this$0.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        return new ForenoticeEntryWidget(0, LIZ, null, new C32761(), 5);
    }
}
