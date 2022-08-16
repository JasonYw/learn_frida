package com.bytedance.android.live.broadcast.toolbar;

import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.View$OnClickListenerC6497ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C116971W2r;
import p003X.C30E;
import p003X.C30F;
import p003X.C30R;

/* loaded from: classes12.dex */
public final class ToolbarBroadcastEffectBehavior$mToolbarBroadcastEffectDialog$2 extends Lambda implements Function0<View$OnClickListenerC6497ae> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C30R this$0;

    static {
        Covode.recordClassIndex(17934);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToolbarBroadcastEffectBehavior$mToolbarBroadcastEffectDialog$2(C30R c30r) {
        super(0);
        this.this$0 = c30r;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.ae, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ View$OnClickListenerC6497ae mo30099invoke() {
        DataCenter dataCenter;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        View$OnClickListenerC6497ae view$OnClickListenerC6497ae = new View$OnClickListenerC6497ae(this.this$0.LIZJ, this.this$0.f742LJ, new C30E(), false);
        C30R c30r = this.this$0;
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{c30r}, null, C30R.LIZ, true, 10);
        if (proxy2.isSupported) {
            dataCenter = (DataCenter) proxy2.result;
        } else {
            dataCenter = c30r.LIZLLL;
            if (dataCenter == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
        }
        view$OnClickListenerC6497ae.LIZ(dataCenter);
        C116971W2r.LIZ(view$OnClickListenerC6497ae, C30F.LIZ);
        return view$OnClickListenerC6497ae;
    }
}
