package com.bytedance.android.btm.api.model;

import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.btm.api.BtmPage;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.IGetFragmentListener;
import com.bytedance.android.btm.api.inner.IMonitor;
import com.bytedance.android.btm.api.util.BtmPageUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003X.C106862S5w;

/* loaded from: classes18.dex */
public final class BtmItemBuilder {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final BtmItem item;

    static {
        Covode.recordClassIndex(11316);
    }

    public BtmItemBuilder() {
        this(null, null, 3, null);
    }

    public final PageFinder getPageFinder() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18);
        if (proxy.isSupported) {
            return (PageFinder) proxy.result;
        }
        return this.item.getPageFinder();
    }

    public final String createBtmId() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return BtmSDK.INSTANCE.createBtmId(copy().build());
    }

    public final BtmItem build() {
        boolean z;
        boolean z2;
        boolean z3 = false;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16);
        if (proxy.isSupported) {
            return (BtmItem) proxy.result;
        }
        IMonitor monitor = BtmSDK.INSTANCE.getService().getMonitor();
        if (this.item.getBtm().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        monitor.check(z, BtmItemBuilder$build$1.INSTANCE);
        IMonitor monitor2 = BtmSDK.INSTANCE.getService().getMonitor();
        if (this.item.get_enterPage() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        monitor2.check(z2, BtmItemBuilder$build$2.INSTANCE);
        IMonitor monitor3 = BtmSDK.INSTANCE.getService().getMonitor();
        if (!this.item.getPageFinder().isEmpty() || this.item.getViewPager() != null || this.item.getGetFragmentListener() != null) {
            z3 = true;
        }
        monitor3.check(z3, BtmItemBuilder$build$3.INSTANCE);
        return this.item;
    }

    public final BtmItemBuilder copy() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15);
        if (proxy.isSupported) {
            return (BtmItemBuilder) proxy.result;
        }
        BtmItemBuilder enterPageTimes = new BtmItemBuilder(this.item.getBtm(), this.item.get_enterPage()).setEnterPageTimes(this.item.getEnterPageTimes());
        if (this.item.getViewPager() != null) {
            enterPageTimes.withViewPager(this.item.getViewPager(), this.item.getCurPosition());
        }
        if (this.item.getGetFragmentListener() != null) {
            enterPageTimes.withGetFragmentListener(this.item.getGetFragmentListener(), this.item.getCurPosition(), this.item.getFragmentManager());
        }
        enterPageTimes.item.setPageFinder(this.item.getPageFinder());
        enterPageTimes.item.setContent(this.item.getContent());
        return enterPageTimes;
    }

    public final BtmItemBuilder setAddBtmChain(boolean z) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (BtmItemBuilder) proxy.result;
        }
        this.item.setAddBtmChain(z);
        return this;
    }

    public final BtmItemBuilder setBtmChainLength(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (BtmItemBuilder) proxy.result;
        }
        this.item.setBtmChainLength(i);
        return this;
    }

    public final BtmItemBuilder setEnterPageTimes(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 5);
        if (proxy.isSupported) {
            return (BtmItemBuilder) proxy.result;
        }
        this.item.setEnterPageTimes(i);
        return this;
    }

    public final BtmItemBuilder withPageFinder(PageFinder pageFinder) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{pageFinder}, this, changeQuickRedirect, false, 10);
        if (proxy.isSupported) {
            return (BtmItemBuilder) proxy.result;
        }
        if (pageFinder != null) {
            this.item.setPageFinder(pageFinder);
        }
        return this;
    }

    public final BtmItemBuilder withView(View view) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 8);
        if (proxy.isSupported) {
            return (BtmItemBuilder) proxy.result;
        }
        this.item.getPageFinder().view = view;
        return this;
    }

    public final BtmItemBuilder setEnterPage(boolean z) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return (BtmItemBuilder) proxy.result;
        }
        this.item.set_enterPage(Boolean.valueOf(z));
        return this;
    }

    public final BtmItemBuilder setTargetPagesBtm(List<String> list) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 7);
        if (proxy.isSupported) {
            return (BtmItemBuilder) proxy.result;
        }
        C106862S5w.LIZ(list);
        this.item.getTargetPagesBtm().clear();
        this.item.getTargetPagesBtm().addAll(list);
        return this;
    }

    public final BtmItemBuilder withBtmPage(@BtmPage Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 9);
        if (proxy.isSupported) {
            return (BtmItemBuilder) proxy.result;
        }
        BtmSDK.INSTANCE.getService().getMonitor().check(BtmPageUtils.INSTANCE.isPage(obj), new BtmItemBuilder$withBtmPage$1(obj));
        this.item.getPageFinder().page = obj;
        return this;
    }

    public final BtmItemBuilder setTargetPagesBtm(String... strArr) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{strArr}, this, changeQuickRedirect, false, 6);
        if (proxy.isSupported) {
            return (BtmItemBuilder) proxy.result;
        }
        C106862S5w.LIZ((Object) strArr);
        this.item.getTargetPagesBtm().clear();
        for (String str : strArr) {
            if (str != null && str.length() != 0) {
                this.item.getTargetPagesBtm().add(str);
            }
        }
        return this;
    }

    public BtmItemBuilder(String str, Boolean bool) {
        C106862S5w.LIZ(str);
        this.item = new BtmItem();
        this.item.setBtm(str);
        this.item.set_enterPage(bool);
    }

    public final BtmItemBuilder internalSetUnitParams(String str, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, obj}, this, changeQuickRedirect, false, 4);
        if (proxy.isSupported) {
            return (BtmItemBuilder) proxy.result;
        }
        if (str != null && str.length() != 0 && obj != null) {
            this.item.getContent().put(str, obj);
        }
        return this;
    }

    public final BtmItemBuilder withViewPager(ViewPager viewPager, int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{viewPager, Integer.valueOf(i)}, this, changeQuickRedirect, false, 11);
        if (proxy.isSupported) {
            return (BtmItemBuilder) proxy.result;
        }
        this.item.setViewPager(viewPager);
        this.item.setCurPosition(i);
        return this;
    }

    public final BtmItemBuilder withGetFragmentListener(IGetFragmentListener iGetFragmentListener, int i, FragmentManager fragmentManager) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{iGetFragmentListener, Integer.valueOf(i), fragmentManager}, this, changeQuickRedirect, false, 13);
        if (proxy.isSupported) {
            return (BtmItemBuilder) proxy.result;
        }
        this.item.setGetFragmentListener(iGetFragmentListener);
        this.item.setCurPosition(i);
        this.item.setFragmentManager(fragmentManager);
        return this;
    }

    public /* synthetic */ BtmItemBuilder(String str, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : bool);
    }

    public static /* synthetic */ BtmItemBuilder withViewPager$default(BtmItemBuilder btmItemBuilder, ViewPager viewPager, int i, int i2, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{btmItemBuilder, viewPager, Integer.valueOf(i), Integer.valueOf(i2), obj}, null, changeQuickRedirect, true, 12);
        if (proxy.isSupported) {
            return (BtmItemBuilder) proxy.result;
        }
        if ((i2 & 2) != 0) {
            i = -1;
        }
        return btmItemBuilder.withViewPager(viewPager, i);
    }

    public static /* synthetic */ BtmItemBuilder withGetFragmentListener$default(BtmItemBuilder btmItemBuilder, IGetFragmentListener iGetFragmentListener, int i, FragmentManager fragmentManager, int i2, Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{btmItemBuilder, iGetFragmentListener, Integer.valueOf(i), fragmentManager, Integer.valueOf(i2), obj}, null, changeQuickRedirect, true, 14);
        if (proxy.isSupported) {
            return (BtmItemBuilder) proxy.result;
        }
        if ((i2 & 2) != 0) {
            i = -1;
        }
        return btmItemBuilder.withGetFragmentListener(iGetFragmentListener, i, fragmentManager);
    }
}
