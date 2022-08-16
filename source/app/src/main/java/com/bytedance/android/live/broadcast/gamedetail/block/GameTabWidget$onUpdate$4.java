package com.bytedance.android.live.broadcast.gamedetail.block;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.viewpager.SimplePagerWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class GameTabWidget$onUpdate$4 extends Lambda implements Function1<String, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ GameTabWidget this$0;

    static {
        Covode.recordClassIndex(16172);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameTabWidget$onUpdate$4(GameTabWidget gameTabWidget) {
        super(1);
        this.this$0 = gameTabWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(String str) {
        String str2 = str;
        if (!PatchProxy.proxy(new Object[]{str2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(str2);
            SimplePagerWidget simplePagerWidget = this.this$0.LIZLLL;
            if (simplePagerWidget != null) {
                simplePagerWidget.LIZ(str2);
            }
        }
        return Unit.INSTANCE;
    }
}
