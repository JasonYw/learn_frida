package com.bytedance.android.live.broadcastgame.opengame.message;

import com.bytedance.android.livesdk.message.model.C8958ir;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.disposables.Disposable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C87709KhD;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.message.OpenPlatformPublicMessageReceiver$showStartInteractOpenAppMessage$$inlined$let$lambda$1 */
/* loaded from: classes5.dex */
public final class C3507xcc0f694d extends Lambda implements Function1<Boolean, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C8958ir $message;
    public final /* synthetic */ C87709KhD this$0;

    static {
        Covode.recordClassIndex(20256);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3507xcc0f694d(C8958ir c8958ir, C87709KhD c87709KhD) {
        super(1);
        this.$message = c8958ir;
        this.this$0 = c87709KhD;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Boolean bool) {
        if (!PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, 1).isSupported && Intrinsics.areEqual(bool, Boolean.TRUE)) {
            this.this$0.LIZ(this.$message);
            Disposable disposable = this.this$0.LIZIZ;
            if (disposable != null) {
                disposable.dispose();
            }
        }
        return Unit.INSTANCE;
    }
}
