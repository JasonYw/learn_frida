package com.bytedance.android.live.broadcast.gamedetail.block.widget;

import android.text.TextUtils;
import com.bytedance.android.live.broadcast.C3243u;
import com.bytedance.android.live.broadcast.C3261w;
import com.bytedance.android.livesdk.chatroom.p518ui.ExpandableTextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt___MapsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import p003X.C106862S5w;
import p003X.L6M;

/* loaded from: classes5.dex */
public final class GameIntroWidget$onUpdate$2 extends Lambda implements Function1<C3243u, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ GameIntroWidget this$0;

    static {
        Covode.recordClassIndex(16393);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameIntroWidget$onUpdate$2(GameIntroWidget gameIntroWidget) {
        super(1);
        this.this$0 = gameIntroWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C3243u c3243u) {
        Map<String, String> map;
        List list;
        C3261w c3261w;
        ExpandableTextView expandableTextView;
        C3243u c3243u2 = c3243u;
        if (!PatchProxy.proxy(new Object[]{c3243u2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c3243u2);
            String str = c3243u2.LJIIL;
            if (!(!StringsKt__StringsJVMKt.isBlank(str))) {
                str = null;
            }
            if (str != null) {
                GameIntroWidget gameIntroWidget = this.this$0;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{gameIntroWidget}, null, GameIntroWidget.LIZ, true, 5);
                if (proxy.isSupported) {
                    expandableTextView = (ExpandableTextView) proxy.result;
                } else {
                    expandableTextView = gameIntroWidget.LIZJ;
                    if (expandableTextView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                }
                ExpandableTextView.LIZ(expandableTextView, str, false, false, 4, null);
            }
            GameIntroWidget gameIntroWidget2 = this.this$0;
            if (!PatchProxy.proxy(new Object[]{c3243u2}, gameIntroWidget2, GameIntroWidget.LIZ, false, 4).isSupported && (map = c3243u2.LJIIJJI) != null && (list = MapsKt___MapsKt.toList(map)) != null && (!list.isEmpty())) {
                List<Pair> sortedWith = CollectionsKt___CollectionsKt.sortedWith(list, new Comparator<T>() { // from class: X.4wQ
                    public static ChangeQuickRedirect LIZ;

                    static {
                        Covode.recordClassIndex(16391);
                    }

                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{t, t2}, this, LIZ, false, 1);
                        if (proxy2.isSupported) {
                            return ((Integer) proxy2.result).intValue();
                        }
                        return ComparisonsKt__ComparisonsKt.compareValues((String) ((Pair) t).getFirst(), (String) ((Pair) t2).getFirst());
                    }
                });
                ArrayList arrayList = new ArrayList();
                for (Pair pair : sortedWith) {
                    Object component1 = pair.component1();
                    String str2 = (String) pair.component2();
                    C3261w c3261w2 = new C3261w();
                    Map<String, C3261w> map2 = c3243u2.LJJI;
                    if (map2 == null || (c3261w = map2.get(component1)) == null) {
                        c3261w = c3261w2;
                    }
                    c3261w.LIZ(str2);
                    arrayList.add(c3261w);
                }
                L6M l6m = gameIntroWidget2.LIZIZ;
                if (l6m == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                if (!PatchProxy.proxy(new Object[]{arrayList}, l6m, L6M.LIZ, false, 4).isSupported) {
                    C106862S5w.LIZ(arrayList);
                    l6m.LIZIZ = arrayList;
                    if (!l6m.LIZIZ.isEmpty()) {
                        l6m.LIZJ = true ^ TextUtils.equals(l6m.LIZIZ.get(0).LIZJ, "1");
                    }
                    l6m.notifyDataSetChanged();
                }
            }
        }
        return Unit.INSTANCE;
    }
}
