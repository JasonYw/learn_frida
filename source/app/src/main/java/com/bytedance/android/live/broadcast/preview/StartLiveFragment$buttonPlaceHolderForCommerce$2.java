package com.bytedance.android.live.broadcast.preview;

import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.broadcast.preview.externalframework.placeholder.SimpleWidgetPlaceHolder;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdkapi.room.p783c.C9664b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C3VF;
import p003X.KJV;

/* loaded from: classes5.dex */
public final class StartLiveFragment$buttonPlaceHolderForCommerce$2 extends Lambda implements Function0<SimpleWidgetPlaceHolder> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ KJV this$0;

    static {
        Covode.recordClassIndex(17109);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StartLiveFragment$buttonPlaceHolderForCommerce$2(KJV kjv) {
        super(0);
        this.this$0 = kjv;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.live.broadcast.preview.externalframework.placeholder.SimpleWidgetPlaceHolder, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ SimpleWidgetPlaceHolder mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return new SimpleWidgetPlaceHolder(new C31721());
    }

    /* renamed from: com.bytedance.android.live.broadcast.preview.StartLiveFragment$buttonPlaceHolderForCommerce$2$1 */
    /* loaded from: classes5.dex */
    public static final class C31721 extends Lambda implements Function0<C9664b> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(17110);
        }

        public C31721() {
            super(0);
        }

        /* JADX WARN: Type inference failed for: r0v10, types: [com.bytedance.android.livesdkapi.room.c.b, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final /* synthetic */ C9664b mo30099invoke() {
            C3VF user;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return proxy.result;
            }
            IUserService iUserService = (IUserService) ServiceManager.getService(IUserService.class);
            if (iUserService != null && (user = iUserService.user()) != null) {
                KJV kjv = StartLiveFragment$buttonPlaceHolderForCommerce$2.this.this$0;
                IUser LIZ = user.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ, "");
                return kjv.LIZ(LIZ);
            }
            return null;
        }
    }
}
