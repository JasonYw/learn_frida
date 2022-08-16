package com.bytedance.android.live.browser.jsbridge.state.annieObservable;

import com.bytedance.android.livesdkapi.depend.message.MessageType;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C101069PrD;

/* loaded from: classes8.dex */
public final class RoomMessageState$obtainObservable$$inlined$also$lambda$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ OnMessageListener $messageListener$inlined;
    public final /* synthetic */ IMessageManager $messageManager$inlined;
    public final /* synthetic */ MessageType $messageType$inlined;
    public final /* synthetic */ C101069PrD this$0;

    static {
        Covode.recordClassIndex(22998);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomMessageState$obtainObservable$$inlined$also$lambda$1(C101069PrD c101069PrD, MessageType messageType, IMessageManager iMessageManager, OnMessageListener onMessageListener) {
        super(0);
        this.this$0 = c101069PrD;
        this.$messageType$inlined = messageType;
        this.$messageManager$inlined = iMessageManager;
        this.$messageListener$inlined = onMessageListener;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            this.$messageManager$inlined.removeMessageListener(this.$messageListener$inlined);
        }
        return Unit.INSTANCE;
    }
}
