package com.bytedance.android.live.broadcast.gamedetail.block.widget;

import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p002O.C0002O;
import p003X.C106862S5w;

/* loaded from: classes22.dex */
public final class GameOfficialItemWidget$onUpdate$6 extends Lambda implements Function1<String, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ GameOfficialItemWidget this$0;

    static {
        Covode.recordClassIndex(16404);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameOfficialItemWidget$onUpdate$6(GameOfficialItemWidget gameOfficialItemWidget) {
        super(1);
        this.this$0 = gameOfficialItemWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(String str) {
        String str2 = str;
        if (!PatchProxy.proxy(new Object[]{str2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(str2);
            TextView textView = this.this$0.f25865LJ;
            if (textView != null) {
                new StringBuilder();
                textView.setText(C0002O.m25086C(str2, "粉丝"));
            }
        }
        return Unit.INSTANCE;
    }
}
