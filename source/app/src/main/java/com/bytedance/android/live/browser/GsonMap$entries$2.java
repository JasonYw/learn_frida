package com.bytedance.android.live.browser;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.JsonElement;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.QP9;
import p003X.QPA;

/* loaded from: classes8.dex */
public final class GsonMap$entries$2 extends Lambda implements Function0<LinkedHashSet<Map.Entry<? extends String, ? extends Object>>> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ QP9 this$0;

    static {
        Covode.recordClassIndex(21897);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GsonMap$entries$2(QP9 qp9) {
        super(0);
        this.this$0 = qp9;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.util.LinkedHashSet<java.util.Map$Entry<? extends java.lang.String, ? extends java.lang.Object>>] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ LinkedHashSet<Map.Entry<? extends String, ? extends Object>> mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        Set<Map.Entry<String, JsonElement>> entrySet = this.this$0.LIZIZ.entrySet();
        Intrinsics.checkNotNullExpressionValue(entrySet, "");
        LinkedHashSet<Map.Entry<? extends String, ? extends Object>> linkedHashSet = new LinkedHashSet<>();
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(new QPA((Map.Entry) it.next()));
        }
        return linkedHashSet;
    }
}
