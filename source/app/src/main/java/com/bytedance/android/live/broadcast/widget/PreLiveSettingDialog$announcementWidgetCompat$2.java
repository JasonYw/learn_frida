package com.bytedance.android.live.broadcast.widget;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C436493Op;

/* loaded from: classes12.dex */
public final class PreLiveSettingDialog$announcementWidgetCompat$2 extends Lambda implements Function0<C3318d> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C436493Op this$0;

    static {
        Covode.recordClassIndex(18383);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreLiveSettingDialog$announcementWidgetCompat$2(C436493Op c436493Op) {
        super(0);
        this.this$0 = c436493Op;
    }

    /* renamed from: com.bytedance.android.live.broadcast.widget.PreLiveSettingDialog$announcementWidgetCompat$2$1 */
    /* loaded from: classes12.dex */
    public static final class C32821 extends Lambda implements Function0<Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(18384);
        }

        public C32821() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final /* synthetic */ Unit mo30099invoke() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
                PreLiveSettingDialog$announcementWidgetCompat$2.this.this$0.dismiss();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.live.broadcast.widget.d, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ C3318d mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new C3318d(this.this$0, new C32821());
    }
}
