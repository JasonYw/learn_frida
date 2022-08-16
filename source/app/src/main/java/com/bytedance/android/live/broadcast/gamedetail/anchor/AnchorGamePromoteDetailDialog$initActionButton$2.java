package com.bytedance.android.live.broadcast.gamedetail.anchor;

import androidx.fragment.app.DialogFragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C88929L2d;

/* loaded from: classes5.dex */
public final class AnchorGamePromoteDetailDialog$initActionButton$2 extends Lambda implements Function1<Boolean, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C88929L2d this$0;

    static {
        Covode.recordClassIndex(16025);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchorGamePromoteDetailDialog$initActionButton$2(C88929L2d c88929L2d) {
        super(1);
        this.this$0 = c88929L2d;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Boolean bool) {
        Object mo27335getValue;
        boolean booleanValue = bool.booleanValue();
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(booleanValue ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1).isSupported) {
            Boolean valueOf = Boolean.valueOf(booleanValue);
            if (valueOf.booleanValue()) {
                valueOf.booleanValue();
                C88929L2d c88929L2d = this.this$0;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[0], c88929L2d, C88929L2d.LIZ, false, 44);
                if (proxy.isSupported) {
                    mo27335getValue = proxy.result;
                } else {
                    mo27335getValue = c88929L2d.LJJIIZ.mo27335getValue();
                }
                ((DialogFragment) mo27335getValue).show(this.this$0.getFragmentManager(), "AnchorExceedPromoteGameLimitDialog");
            }
        }
        return Unit.INSTANCE;
    }
}
