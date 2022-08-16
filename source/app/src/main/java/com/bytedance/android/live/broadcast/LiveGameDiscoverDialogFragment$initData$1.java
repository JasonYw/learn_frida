package com.bytedance.android.live.broadcast;

import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.live.broadcast.api.C2926t;
import com.bytedance.android.live.broadcast.api.GameTabItem;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.android.material.tabs.TabLayout;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC449173pf;
import p003X.C106862S5w;
import p003X.C449593qL;
import p003X.C78322GuC;
import p003X.C78334GuO;

/* loaded from: classes3.dex */
public final class LiveGameDiscoverDialogFragment$initData$1 extends Lambda implements Function1<AbstractC449173pf<? extends C2926t>, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C78322GuC this$0;

    static {
        Covode.recordClassIndex(14300);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveGameDiscoverDialogFragment$initData$1(C78322GuC c78322GuC) {
        super(1);
        this.this$0 = c78322GuC;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(AbstractC449173pf<? extends C2926t> abstractC449173pf) {
        List<GameTabItem> list;
        TabLayout.Tab tabAt;
        CharSequence charSequence;
        AbstractC449173pf<? extends C2926t> abstractC449173pf2 = abstractC449173pf;
        int i = 0;
        if (!PatchProxy.proxy(new Object[]{abstractC449173pf2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(abstractC449173pf2);
            C78322GuC c78322GuC = this.this$0;
            C2926t c2926t = (C2926t) C449593qL.LIZ((AbstractC449173pf<? extends Object>) abstractC449173pf2);
            if (!PatchProxy.proxy(new Object[]{c2926t}, c78322GuC, C78322GuC.LIZJ, false, 11).isSupported && c2926t != null && (list = c2926t.LIZ) != null) {
                ViewPager viewPager = c78322GuC.f6500LJ;
                if (viewPager != null) {
                    viewPager.setOffscreenPageLimit(list.size());
                }
                ViewPager viewPager2 = c78322GuC.f6500LJ;
                if (viewPager2 != null) {
                    viewPager2.setAdapter(new C78334GuO(list, c78322GuC.getChildFragmentManager()));
                }
                for (GameTabItem gameTabItem : list) {
                    TabLayout tabLayout = c78322GuC.LIZLLL;
                    if (tabLayout != null && (tabAt = tabLayout.getTabAt(i)) != null) {
                        if (i == 0) {
                            charSequence = c78322GuC.LIZ(gameTabItem.LIZJ);
                        } else {
                            charSequence = gameTabItem.LIZJ;
                        }
                        tabAt.setText(charSequence);
                    }
                    i++;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
