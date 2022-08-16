package com.bytedance.android.live.broadcastgame.opengame.control;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C116971W2r;
import p003X.View$OnClickListenerC87747Khp;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.control.OpenPlatformControlService$OpenCertificateManager$showDialog$$inlined$apply$lambda$2$1 */
/* loaded from: classes5.dex */
public final class C3487x73c5cb2b extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ View$OnClickListenerC87747Khp this$0;

    static {
        Covode.recordClassIndex(20008);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3487x73c5cb2b(View$OnClickListenerC87747Khp view$OnClickListenerC87747Khp) {
        super(0);
        this.this$0 = view$OnClickListenerC87747Khp;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            C116971W2r.LIZ(this.this$0.LIZIZ);
            this.this$0.f8574LJ.mo30099invoke();
        }
        return Unit.INSTANCE;
    }
}
