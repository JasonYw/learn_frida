package com.bytedance.android.live.broadcast.props;

import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.schema.interfaces.ILiveActionHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.DialogC89180LBu;
import p003X.LCG;

/* loaded from: classes5.dex */
public final class PropDetailDialog$setData$$inlined$apply$lambda$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ DialogC89180LBu this$0;

    static {
        Covode.recordClassIndex(17583);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PropDetailDialog$setData$$inlined$apply$lambda$1(DialogC89180LBu dialogC89180LBu) {
        super(0);
        this.this$0 = dialogC89180LBu;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        ILiveActionHandler iLiveActionHandler;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported && (iLiveActionHandler = (ILiveActionHandler) ServiceManager.getService(ILiveActionHandler.class)) != null) {
            iLiveActionHandler.handle(this.this$0.getContext(), LCG.LIZ());
        }
        return Unit.INSTANCE;
    }
}
