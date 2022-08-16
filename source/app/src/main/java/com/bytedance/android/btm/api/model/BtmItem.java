package com.bytedance.android.btm.api.model;

import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.btm.api.IGetFragmentListener;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p003X.C106862S5w;

/* loaded from: classes18.dex */
public final class BtmItem {
    public static ChangeQuickRedirect changeQuickRedirect;
    public Boolean _enterPage;
    public boolean addBtmChain;
    public FragmentManager fragmentManager;
    public IGetFragmentListener getFragmentListener;
    public String preBtm;
    public ViewPager viewPager;
    public String btm = "";
    public int enterPageTimes = 1;
    public List<String> targetPagesBtm = new ArrayList();
    public PageFinder pageFinder = new PageFinder();
    public int curPosition = -1;
    public int btmChainLength = 10;
    public Map<String, Object> content = new LinkedHashMap();

    static {
        Covode.recordClassIndex(11315);
    }

    public final boolean getAddBtmChain() {
        return this.addBtmChain;
    }

    public final String getBtm() {
        return this.btm;
    }

    public final int getBtmChainLength() {
        return this.btmChainLength;
    }

    public final Map<String, Object> getContent() {
        return this.content;
    }

    public final int getCurPosition() {
        return this.curPosition;
    }

    public final int getEnterPageTimes() {
        return this.enterPageTimes;
    }

    public final FragmentManager getFragmentManager() {
        return this.fragmentManager;
    }

    public final IGetFragmentListener getGetFragmentListener() {
        return this.getFragmentListener;
    }

    public final PageFinder getPageFinder() {
        return this.pageFinder;
    }

    public final String getPreBtm() {
        return this.preBtm;
    }

    public final List<String> getTargetPagesBtm() {
        return this.targetPagesBtm;
    }

    public final ViewPager getViewPager() {
        return this.viewPager;
    }

    public final Boolean get_enterPage() {
        return this._enterPage;
    }

    public final boolean getEnterPage() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        Boolean bool = this._enterPage;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "BtmItem(btm='" + this.btm + "', _enterPage=" + this._enterPage + ", enterPageTimes=" + this.enterPageTimes + ", targetPagesBtm=" + this.targetPagesBtm + ", preBtm=" + this.preBtm + ", content=" + this.content + ", curPosition=" + this.curPosition + LoggerUtil.S_RIGHT_TAG;
    }

    public final void setAddBtmChain(boolean z) {
        this.addBtmChain = z;
    }

    public final void setBtmChainLength(int i) {
        this.btmChainLength = i;
    }

    public final void setCurPosition(int i) {
        this.curPosition = i;
    }

    public final void setEnterPageTimes(int i) {
        this.enterPageTimes = i;
    }

    public final void setFragmentManager(FragmentManager fragmentManager) {
        this.fragmentManager = fragmentManager;
    }

    public final void setGetFragmentListener(IGetFragmentListener iGetFragmentListener) {
        this.getFragmentListener = iGetFragmentListener;
    }

    public final void setPreBtm(String str) {
        this.preBtm = str;
    }

    public final void setViewPager(ViewPager viewPager) {
        this.viewPager = viewPager;
    }

    public final void set_enterPage(Boolean bool) {
        this._enterPage = bool;
    }

    public final void setBtm(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.btm = str;
    }

    public final void setContent(Map<String, Object> map) {
        if (PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(map);
        this.content = map;
    }

    public final void setPageFinder(PageFinder pageFinder) {
        if (PatchProxy.proxy(new Object[]{pageFinder}, this, changeQuickRedirect, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(pageFinder);
        this.pageFinder = pageFinder;
    }

    public final void setTargetPagesBtm(List<String> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(list);
        this.targetPagesBtm = list;
    }
}
