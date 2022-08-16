package com.bytedance.android.live.broadcastgame.opengame.panel;

import android.os.Build;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.LK1;

/* loaded from: classes5.dex */
public final class OpenPanel$showDoubleBallLoading$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ DialogC3611f this$0;

    static {
        Covode.recordClassIndex(20777);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenPanel$showDoubleBallLoading$1(DialogC3611f dialogC3611f) {
        super(0);
        this.this$0 = dialogC3611f;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            LK1.LIZ((View) DialogC3611f.LIZ(this.this$0));
            int i = Build.VERSION.SDK_INT;
            ViewParent parent = DialogC3611f.LIZIZ(this.this$0).getParent();
            if (parent != null) {
                TransitionManager.beginDelayedTransition((ViewGroup) parent, new Fade(1));
                LK1.LIZJ(DialogC3611f.LIZIZ(this.this$0));
                LK1.LIZJ(DialogC3611f.LIZJ(this.this$0));
                DialogC3611f.LIZJ(this.this$0).LIZ();
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
            }
        }
        return Unit.INSTANCE;
    }
}
