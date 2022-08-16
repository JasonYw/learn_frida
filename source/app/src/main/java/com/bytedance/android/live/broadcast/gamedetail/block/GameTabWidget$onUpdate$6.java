package com.bytedance.android.live.broadcast.gamedetail.block;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.android.material.tabs.TabLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.LK5;

/* loaded from: classes5.dex */
public final class GameTabWidget$onUpdate$6 extends Lambda implements Function1<Integer, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ GameTabWidget this$0;

    static {
        Covode.recordClassIndex(16174);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameTabWidget$onUpdate$6(GameTabWidget gameTabWidget) {
        super(1);
        this.this$0 = gameTabWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Integer num) {
        int intValue = num.intValue();
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(intValue)}, this, changeQuickRedirect, false, 1).isSupported) {
            if (intValue != 1) {
                if (intValue == 2) {
                    TabLayout tabLayout = this.this$0.LIZIZ;
                    if (tabLayout != null) {
                        tabLayout.setBackgroundColor(LK5.LIZIZ(2131626090));
                    }
                    View view = this.this$0.LIZJ;
                    if (view != null) {
                        view.setVisibility(0);
                    }
                }
            } else {
                TabLayout tabLayout2 = this.this$0.LIZIZ;
                if (tabLayout2 != null) {
                    tabLayout2.setBackgroundColor(LK5.LIZIZ(2131623937));
                }
                View view2 = this.this$0.LIZJ;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
