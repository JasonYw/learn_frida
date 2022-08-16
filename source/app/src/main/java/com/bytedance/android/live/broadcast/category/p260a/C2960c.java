package com.bytedance.android.live.broadcast.category.p260a;

import android.content.Context;
import android.content.pm.PackageManager;
import com.bytedance.android.live.broadcast.api.model.CategoryNode;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.broadcast.category.a.c */
/* loaded from: classes5.dex */
public final class C2960c {
    public static ChangeQuickRedirect LIZ;
    public final Context LIZIZ;

    static {
        Covode.recordClassIndex(15069);
    }

    public C2960c(Context context) {
        C106862S5w.LIZ(context);
        this.LIZIZ = context;
    }

    private boolean LIZ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(str);
        if (StringsKt__StringsKt.trim((CharSequence) str).toString().length() == 0) {
            return false;
        }
        try {
            this.LIZIZ.getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    private boolean LIZIZ(CategoryNode categoryNode) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{categoryNode}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(categoryNode);
        if (LIZ(categoryNode) != null) {
            return true;
        }
        return false;
    }

    public final String LIZ(CategoryNode categoryNode) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{categoryNode}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        C106862S5w.LIZ(categoryNode);
        List<String> list = categoryNode.categoryAppAndroid;
        if (list != null) {
            for (String str : list) {
                Intrinsics.checkNotNullExpressionValue(str, "");
                if (LIZ(str)) {
                    return str;
                }
            }
            return null;
        }
        return null;
    }

    public final void LIZ(List<CategoryNode> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 6).isSupported) {
            return;
        }
        C106862S5w.LIZ(list);
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ListIterator<CategoryNode> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            CategoryNode next = listIterator.next();
            if (LIZIZ(next)) {
                listIterator.remove();
                arrayList.add(next);
            }
        }
        arrayList.isEmpty();
        list.addAll(0, arrayList);
    }
}
