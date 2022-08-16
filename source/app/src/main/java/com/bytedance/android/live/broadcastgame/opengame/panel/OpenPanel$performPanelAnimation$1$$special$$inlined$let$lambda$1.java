package com.bytedance.android.live.broadcastgame.opengame.panel;

import android.animation.ValueAnimator;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C88031KmP;

/* loaded from: classes5.dex */
public final class OpenPanel$performPanelAnimation$1$$special$$inlined$let$lambda$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ ValueAnimator $it$inlined;
    public final /* synthetic */ WindowManager.LayoutParams $lp;
    public final /* synthetic */ C88031KmP this$0;

    static {
        Covode.recordClassIndex(20773);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenPanel$performPanelAnimation$1$$special$$inlined$let$lambda$1(WindowManager.LayoutParams layoutParams, C88031KmP c88031KmP, ValueAnimator valueAnimator) {
        super(0);
        this.$lp = layoutParams;
        this.this$0 = c88031KmP;
        this.$it$inlined = valueAnimator;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        Window window;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported && (window = this.this$0.LIZIZ.getWindow()) != null) {
            window.setAttributes(this.$lp);
        }
        return Unit.INSTANCE;
    }
}
