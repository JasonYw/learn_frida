package cn.ever.cloud.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Iterator;
import java.util.TreeSet;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class CollectKt {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(3420);
    }

    public static final <T> TreeSet<T> collect(Iterator<? extends T> it) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{it}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (TreeSet) proxy.result;
        }
        C106862S5w.LIZ(it);
        TreeSet<T> treeSet = new TreeSet<>();
        while (it.hasNext()) {
            treeSet.add(it.next());
        }
        return treeSet;
    }
}
