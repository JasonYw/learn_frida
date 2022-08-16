package com.bytedance.android.btm.api.util;

import com.bytedance.android.btm.api.BtmPage;
import com.bytedance.android.btm.api.PageProp;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes18.dex */
public final class BtmPageUtils {
    public static final BtmPageUtils INSTANCE = new BtmPageUtils();
    public static final ConcurrentHashMap<Class<?>, BtmPage> annotationMap = new ConcurrentHashMap<>();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(11329);
    }

    public final boolean isAutoPage(Object obj) {
        PageProp pageProp;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (obj != null && (pageProp = getPageProp(obj)) != null && pageProp.getAuto()) {
            return true;
        }
        return false;
    }

    public final boolean isPage(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (getPageProp(obj) != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.bytedance.android.btm.api.PageProp getPageProp(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            java.lang.Object[] r3 = new java.lang.Object[r0]
            r2 = 0
            r3[r2] = r7
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.btm.api.util.BtmPageUtils.changeQuickRedirect
            r0 = 2
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r3, r6, r1, r2, r0)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L16
            java.lang.Object r0 = r1.result
            com.bytedance.android.btm.api.PageProp r0 = (com.bytedance.android.btm.api.PageProp) r0
            return r0
        L16:
            r5 = 0
            if (r7 != 0) goto L1a
            return r5
        L1a:
            com.bytedance.android.btm.api.BtmHostDependManager r0 = com.bytedance.android.btm.api.BtmHostDependManager.INSTANCE
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.getPageClassSet()
            java.util.Iterator r2 = r0.iterator()
        L24:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L62
            java.lang.Object r4 = r2.next()
            com.bytedance.android.btm.api.BtmPageClass r4 = (com.bytedance.android.btm.api.BtmPageClass) r4
            java.lang.Class r1 = r4.getClazz()
            java.lang.Class r0 = r7.getClass()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r0 != 0) goto L50
            java.lang.Class r0 = r7.getClass()
            java.lang.String r1 = r0.getName()
            java.lang.String r0 = r4.getClazzName()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L24
        L50:
            com.bytedance.android.btm.api.PageProp r3 = new com.bytedance.android.btm.api.PageProp
            java.lang.String r2 = r4.getBtm()
            boolean r1 = r4.getAuto()
            boolean r0 = r4.getSingleton()
            r3.<init>(r2, r1, r0)
            return r3
        L62:
            com.bytedance.android.btm.api.BtmHostDependManager r0 = com.bytedance.android.btm.api.BtmHostDependManager.INSTANCE
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.getPageInstanceSet()
            java.util.Iterator r1 = r0.iterator()
        L6c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L98
            java.lang.Object r4 = r1.next()
            com.bytedance.android.btm.api.BtmPageInstance r4 = (com.bytedance.android.btm.api.BtmPageInstance) r4
            java.lang.ref.WeakReference r0 = r4.getPageRef()
            java.lang.Object r0 = r0.get()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r7)
            if (r0 == 0) goto L6c
            com.bytedance.android.btm.api.PageProp r3 = new com.bytedance.android.btm.api.PageProp
            java.lang.String r2 = r4.getBtm()
            boolean r1 = r4.getAuto()
            boolean r0 = r4.getSingleton()
            r3.<init>(r2, r1, r0)
            return r3
        L98:
            com.bytedance.android.btm.api.BtmHostDependManager r0 = com.bytedance.android.btm.api.BtmHostDependManager.INSTANCE
            boolean r0 = r0.getEnableBtmPageAnnotation()
            if (r0 == 0) goto Le3
            java.util.concurrent.ConcurrentHashMap<java.lang.Class<?>, com.bytedance.android.btm.api.BtmPage> r1 = com.bytedance.android.btm.api.util.BtmPageUtils.annotationMap     // Catch: java.lang.Throwable -> Ldb
            java.lang.Class r0 = r7.getClass()     // Catch: java.lang.Throwable -> Ldb
            java.lang.Object r4 = r1.get(r0)     // Catch: java.lang.Throwable -> Ldb
            com.bytedance.android.btm.api.BtmPage r4 = (com.bytedance.android.btm.api.BtmPage) r4     // Catch: java.lang.Throwable -> Ldb
            if (r4 != 0) goto Lc0
            java.lang.Class r1 = r7.getClass()     // Catch: java.lang.Throwable -> Ldb
            java.lang.Class<com.bytedance.android.btm.api.BtmPage> r0 = com.bytedance.android.btm.api.BtmPage.class
            java.lang.annotation.Annotation r4 = r1.getAnnotation(r0)     // Catch: java.lang.Throwable -> Ldb
            com.bytedance.android.btm.api.BtmPage r4 = (com.bytedance.android.btm.api.BtmPage) r4     // Catch: java.lang.Throwable -> Ldb
            if (r4 != 0) goto Lc0
            kotlin.Result.m30308constructorimpl(r5)     // Catch: java.lang.Throwable -> Ldb
            return r5
        Lc0:
            java.util.concurrent.ConcurrentHashMap<java.lang.Class<?>, com.bytedance.android.btm.api.BtmPage> r1 = com.bytedance.android.btm.api.util.BtmPageUtils.annotationMap     // Catch: java.lang.Throwable -> Ldb
            java.lang.Class r0 = r7.getClass()     // Catch: java.lang.Throwable -> Ldb
            r1.put(r0, r4)     // Catch: java.lang.Throwable -> Ldb
            com.bytedance.android.btm.api.PageProp r3 = new com.bytedance.android.btm.api.PageProp     // Catch: java.lang.Throwable -> Ldb
            java.lang.String r2 = r4.value()     // Catch: java.lang.Throwable -> Ldb
            boolean r1 = r4.auto()     // Catch: java.lang.Throwable -> Ldb
            boolean r0 = r4.singleton()     // Catch: java.lang.Throwable -> Ldb
            r3.<init>(r2, r1, r0)     // Catch: java.lang.Throwable -> Ldb
            return r3
        Ldb:
            r0 = move-exception
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            kotlin.Result.m30308constructorimpl(r0)
        Le3:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.btm.api.util.BtmPageUtils.getPageProp(java.lang.Object):com.bytedance.android.btm.api.PageProp");
    }
}
