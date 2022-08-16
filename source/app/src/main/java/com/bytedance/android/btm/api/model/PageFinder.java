package com.bytedance.android.btm.api.model;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes18.dex */
public class PageFinder {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String btmPageId;
    public Fragment fragment;
    public Object page;
    public View view;

    static {
        Covode.recordClassIndex(11327);
    }

    public boolean isEmpty() {
        if (this.page == null && this.view == null && this.fragment == null) {
            return true;
        }
        return false;
    }

    public static PageFinder via(View view) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (PageFinder) proxy.result;
        }
        PageFinder pageFinder = new PageFinder();
        pageFinder.view = view;
        return pageFinder;
    }

    public static PageFinder via(Fragment fragment) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{fragment}, null, changeQuickRedirect, true, 3);
        if (proxy.isSupported) {
            return (PageFinder) proxy.result;
        }
        PageFinder pageFinder = new PageFinder();
        pageFinder.fragment = fragment;
        return pageFinder;
    }

    public static PageFinder via(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (PageFinder) proxy.result;
        }
        PageFinder pageFinder = new PageFinder();
        pageFinder.page = obj;
        return pageFinder;
    }

    public static PageFinder via(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 4);
        if (proxy.isSupported) {
            return (PageFinder) proxy.result;
        }
        PageFinder pageFinder = new PageFinder();
        pageFinder.btmPageId = str;
        return pageFinder;
    }
}
