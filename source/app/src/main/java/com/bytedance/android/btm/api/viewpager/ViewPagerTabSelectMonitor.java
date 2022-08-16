package com.bytedance.android.btm.api.viewpager;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import p003X.C106862S5w;

/* loaded from: classes28.dex */
public final class ViewPagerTabSelectMonitor {
    public static ChangeQuickRedirect changeQuickRedirect;
    public PagerAdapter adapter;
    public boolean attached;
    public int selectedTabPosition = -1;
    public final Set<ViewPagerOnTabSelectedListener> listeners = new LinkedHashSet();

    static {
        Covode.recordClassIndex(11335);
    }

    public final ViewPagerTabSelectMonitor registerListener(ViewPagerOnTabSelectedListener viewPagerOnTabSelectedListener) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{viewPagerOnTabSelectedListener}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (ViewPagerTabSelectMonitor) proxy.result;
        }
        if (viewPagerOnTabSelectedListener != null) {
            this.listeners.add(viewPagerOnTabSelectedListener);
        }
        return this;
    }

    public final void selectTab(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 4).isSupported) {
            return;
        }
        dispatchTabSelected(this.selectedTabPosition, i);
        this.selectedTabPosition = i;
    }

    public final ViewPagerTabSelectMonitor unregisterListener(ViewPagerOnTabSelectedListener viewPagerOnTabSelectedListener) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{viewPagerOnTabSelectedListener}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (ViewPagerTabSelectMonitor) proxy.result;
        }
        if (viewPagerOnTabSelectedListener != null) {
            this.listeners.remove(viewPagerOnTabSelectedListener);
        }
        return this;
    }

    public final ViewPagerTabSelectMonitor attach(ViewPager viewPager) {
        int coerceAtMost;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{viewPager}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (ViewPagerTabSelectMonitor) proxy.result;
        }
        C106862S5w.LIZ(viewPager);
        if (!this.attached) {
            this.adapter = viewPager.getAdapter();
            if (this.adapter != null) {
                this.attached = true;
                viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.bytedance.android.btm.api.viewpager.ViewPagerTabSelectMonitor$attach$3
                    public static ChangeQuickRedirect changeQuickRedirect;

                    static {
                        Covode.recordClassIndex(11336);
                    }

                    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                    public final void onPageScrollStateChanged(int i) {
                    }

                    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                    public final void onPageScrolled(int i, float f, int i2) {
                    }

                    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
                    public final void onPageSelected(int i) {
                        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 1).isSupported && ViewPagerTabSelectMonitor.this.selectedTabPosition != i) {
                            PagerAdapter pagerAdapter = ViewPagerTabSelectMonitor.this.adapter;
                            Intrinsics.checkNotNull(pagerAdapter);
                            if (i < pagerAdapter.getCount()) {
                                ViewPagerTabSelectMonitor.this.selectTab(i);
                            }
                        }
                    }
                });
                PagerAdapter pagerAdapter = this.adapter;
                Intrinsics.checkNotNull(pagerAdapter);
                int count = pagerAdapter.getCount();
                if (count > 0 && (coerceAtMost = RangesKt___RangesKt.coerceAtMost(viewPager.getCurrentItem(), count - 1)) != this.selectedTabPosition) {
                    selectTab(coerceAtMost);
                }
                return this;
            }
            throw new IllegalStateException("ViewPagerTabSelectMonitor cannot get viewPager adapter".toString());
        }
        throw new IllegalStateException("ViewPagerTabSelectMonitor is already attached".toString());
    }

    private final void dispatchTabSelected(int i, int i2) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 5).isSupported) {
            return;
        }
        for (ViewPagerOnTabSelectedListener viewPagerOnTabSelectedListener : this.listeners) {
            viewPagerOnTabSelectedListener.onTabSelected(i, i2);
        }
    }
}
