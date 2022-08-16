package com.bytedance.android.live.broadcastgame.opengame.panel;

import android.view.Window;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class OpenPanel$onStart$$inlined$let$lambda$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ WindowManager.LayoutParams $it;
    public final /* synthetic */ DialogC3611f this$0;

    static {
        Covode.recordClassIndex(20772);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenPanel$onStart$$inlined$let$lambda$1(WindowManager.LayoutParams layoutParams, DialogC3611f dialogC3611f) {
        super(0);
        this.$it = layoutParams;
        this.this$0 = dialogC3611f;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        Window window;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported && (window = this.this$0.getWindow()) != null) {
            window.setAttributes(this.$it);
        }
        return Unit.INSTANCE;
    }
}
