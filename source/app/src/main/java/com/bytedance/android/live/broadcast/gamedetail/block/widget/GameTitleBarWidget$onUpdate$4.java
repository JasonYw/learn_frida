package com.bytedance.android.live.broadcast.gamedetail.block.widget;

import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes3.dex */
public final class GameTitleBarWidget$onUpdate$4 extends Lambda implements Function1<String, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ GameTitleBarWidget this$0;

    static {
        Covode.recordClassIndex(16414);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameTitleBarWidget$onUpdate$4(GameTitleBarWidget gameTitleBarWidget) {
        super(1);
        this.this$0 = gameTitleBarWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(String str) {
        String str2 = str;
        if (!PatchProxy.proxy(new Object[]{str2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(str2);
            TextView textView = this.this$0.LIZJ;
            if (textView != null) {
                textView.setText(str2);
            }
        }
        return Unit.INSTANCE;
    }
}
