package com.bytedance.android.live.broadcast.gamedetail.block;

import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.live.broadcast.gamedetail.block.tab.GameCommentTabWidget;
import com.bytedance.android.live.broadcast.gamedetail.block.tab.GameDetailInfoTabWidget;
import com.bytedance.android.live.broadcast.gamedetail.block.tab.GameDetailLynxTabWidget;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sve_core.PureWidget;
import com.bytedance.ies.viewpager.PagerItemWidget;
import com.bytedance.ies.viewpager.SimplePagerWidget;
import com.google.android.material.tabs.TabLayout;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C89099L8r;
import p003X.L6Z;

/* loaded from: classes5.dex */
public final class GameTabWidget$onUpdate$2 extends Lambda implements Function1<List<? extends C3052c>, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ GameTabWidget this$0;

    static {
        Covode.recordClassIndex(16167);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameTabWidget$onUpdate$2(GameTabWidget gameTabWidget) {
        super(1);
        this.this$0 = gameTabWidget;
    }

    /* renamed from: com.bytedance.android.live.broadcast.gamedetail.block.GameTabWidget$onUpdate$2$2 */
    /* loaded from: classes5.dex */
    public static final class C30482 extends Lambda implements Function1<ViewPager, Unit> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public final /* synthetic */ List $list;

        static {
            Covode.recordClassIndex(16169);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30482(List list) {
            super(1);
            this.$list = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(ViewPager viewPager) {
            ViewPager viewPager2 = viewPager;
            if (!PatchProxy.proxy(new Object[]{viewPager2}, this, changeQuickRedirect, false, 1).isSupported) {
                C106862S5w.LIZ(viewPager2);
                TabLayout tabLayout = GameTabWidget$onUpdate$2.this.this$0.LIZIZ;
                if (tabLayout != null) {
                    tabLayout.setupWithViewPager(viewPager2);
                }
                viewPager2.setOffscreenPageLimit(this.$list.size());
                viewPager2.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.bytedance.android.live.broadcast.gamedetail.block.GameTabWidget.onUpdate.2.2.1
                    public static ChangeQuickRedirect LIZ;

                    static {
                        Covode.recordClassIndex(16170);
                    }

                    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                    public final void onPageScrollStateChanged(int i) {
                    }

                    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                    public final void onPageScrolled(int i, float f, int i2) {
                    }

                    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                    public final void onPageSelected(int i) {
                        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 1).isSupported) {
                            return;
                        }
                        GameTabWidget$onUpdate$2.this.this$0.LJIILL().LIZ(L6Z.LIZ, new C89099L8r(((C3052c) C30482.this.$list.get(i)).LIZ()));
                    }
                });
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(List<? extends C3052c> list) {
        List<? extends C3052c> list2 = list;
        if (!PatchProxy.proxy(new Object[]{list2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(list2);
            SimplePagerWidget simplePagerWidget = this.this$0.LIZLLL;
            if (simplePagerWidget != null) {
                simplePagerWidget.LJIJ();
            }
            GameTabWidget gameTabWidget = this.this$0;
            SimplePagerWidget simplePagerWidget2 = new SimplePagerWidget(list2, new C30471(list2), new C30482(list2));
            GameTabWidget gameTabWidget2 = this.this$0;
            ViewGroup viewGroup = this.this$0.containerView;
            Intrinsics.checkNotNullExpressionValue(viewGroup, "");
            PureWidget LJIIJ = simplePagerWidget2.LIZ((PureWidget<?>) gameTabWidget2, (Integer) 2131197227, viewGroup).LJIIJ();
            if (!(LJIIJ instanceof SimplePagerWidget)) {
                LJIIJ = null;
            }
            gameTabWidget.LIZLLL = (SimplePagerWidget) LJIIJ;
        }
        return Unit.INSTANCE;
    }

    /* renamed from: com.bytedance.android.live.broadcast.gamedetail.block.GameTabWidget$onUpdate$2$1 */
    /* loaded from: classes5.dex */
    public static final class C30471 extends Lambda implements Function1<String, PagerItemWidget<?>> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public final /* synthetic */ List $list;

        static {
            Covode.recordClassIndex(16168);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30471(List list) {
            super(1);
            this.$list = list;
        }

        /* JADX WARN: Type inference failed for: r0v21, types: [com.bytedance.ies.viewpager.PagerItemWidget<?>, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ PagerItemWidget<?> invoke(String str) {
            Object obj;
            String str2;
            String str3 = str;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str3}, this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return proxy.result;
            }
            C106862S5w.LIZ(str3);
            Iterator it = this.$list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (Intrinsics.areEqual(((C3052c) obj).LIZ(), str3)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            C3052c c3052c = (C3052c) obj;
            if (c3052c == null || (str2 = c3052c.LIZIZ) == null) {
                str2 = "";
            }
            int hashCode = str3.hashCode();
            if (hashCode != -1898123339) {
                if (hashCode != -1615346206) {
                    if (hashCode == 1547058068 && str3.equals("tab_game_detail")) {
                        return new GameDetailInfoTabWidget();
                    }
                } else if (str3.equals("tab_welfare")) {
                    return new GameDetailLynxTabWidget(str3, str2);
                }
            } else if (str3.equals("tab_comment")) {
                return new GameCommentTabWidget();
            }
            return new GameDetailInfoTabWidget();
        }
    }
}
