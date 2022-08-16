package com.bytedance.android.live.core.utils.rxutils;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import p003X.AbstractC101917QBr;
import p003X.C101914QBo;
import p003X.C101915QBp;
import p003X.C101916QBq;
import p003X.C106862S5w;

/* loaded from: classes8.dex */
public final class RxUtilKt$flatDiff$2$1 extends Lambda implements Function1<Map<K, ? extends V>, ObservableSource<AbstractC101917QBr<K, V>>> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Ref.ObjectRef $last;

    static {
        Covode.recordClassIndex(23976);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RxUtilKt$flatDiff$2$1(Ref.ObjectRef objectRef) {
        super(1);
        this.$last = objectRef;
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [T, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Object invoke(Object obj) {
        Map map = (Map) obj;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C106862S5w.LIZ(map);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((Map) this.$last.element).entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            arrayList.add(new C101915QBp(entry2.getKey(), entry2.getValue()));
        }
        ArrayList arrayList2 = arrayList;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry3 : map.entrySet()) {
            if (!((Map) this.$last.element).containsKey(entry3.getKey())) {
                linkedHashMap2.put(entry3.getKey(), entry3.getValue());
            }
        }
        ArrayList arrayList3 = new ArrayList(linkedHashMap2.size());
        for (Map.Entry entry4 : linkedHashMap2.entrySet()) {
            arrayList3.add(new C101914QBo(entry4.getKey(), entry4.getValue()));
        }
        ArrayList arrayList4 = arrayList3;
        Set intersect = CollectionsKt___CollectionsKt.intersect(((Map) this.$last.element).keySet(), map.keySet());
        ArrayList arrayList5 = new ArrayList();
        for (Object obj2 : intersect) {
            if (!Intrinsics.areEqual(((Map) this.$last.element).get(obj2), map.get(obj2))) {
                arrayList5.add(obj2);
            }
        }
        ArrayList arrayList6 = arrayList5;
        ArrayList arrayList7 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList6, 10));
        for (Object obj3 : arrayList6) {
            arrayList7.add(new C101916QBq(obj3, MapsKt__MapsKt.getValue((Map) this.$last.element, obj3), MapsKt__MapsKt.getValue(map, obj3)));
        }
        this.$last.element = MapsKt__MapsKt.toMap(map);
        Observable concat = Observable.concat(Observable.fromIterable(arrayList2), Observable.fromIterable(arrayList7), Observable.fromIterable(arrayList4));
        Intrinsics.checkNotNullExpressionValue(concat, "");
        return concat;
    }
}
