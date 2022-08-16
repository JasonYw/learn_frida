package com.bytedance.android.live.impl;

import com.bytedance.android.live.core.monitor.LiveTracingMonitor;
import com.bytedance.android.live.impl.processor.AbstractC4251a;
import com.bytedance.android.live.impl.strategy.C4252a;
import com.bytedance.android.live.strategy.api.C5729a;
import com.bytedance.android.live.strategy.api.C5731c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p003X.C106862S5w;
import p003X.C147430fIu;
import p003X.C147431fIv;
import p003X.C147436fJ0;
import p003X.C1D9;

/* loaded from: classes20.dex */
public final /* synthetic */ class StrategyManager$init$1 extends FunctionReferenceImpl implements Function1<C4252a, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(24987);
    }

    public StrategyManager$init$1(C147430fIu c147430fIu) {
        super(1, c147430fIu, C147430fIu.class, "initSource", "initSource(Lcom/bytedance/android/live/impl/strategy/Strategy;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(C4252a c4252a) {
        ArrayList arrayList;
        ArrayList<C5731c> arrayList2;
        ArrayList<C5729a> arrayList3;
        ArrayList arrayList4;
        Collection<ArrayList<C5731c>> values;
        C4252a c4252a2 = c4252a;
        if (!PatchProxy.proxy(new Object[]{c4252a2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(c4252a2);
            Object obj = this.receiver;
            if (!PatchProxy.proxy(new Object[]{c4252a2}, obj, C147430fIu.LIZ, false, 4).isSupported && c4252a2 != null) {
                C147430fIu.LIZIZ = c4252a2;
                Map<String, ArrayList<C5731c>> map = c4252a2.LIZLLL;
                if (map != null && (values = map.values()) != null) {
                    Iterator<T> it = values.iterator();
                    while (it.hasNext()) {
                        ArrayList arrayList5 = (ArrayList) it.next();
                        C4252a c4252a3 = C147430fIu.LIZIZ;
                        if (c4252a3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                        } else {
                            ArrayList<C5731c> arrayList6 = c4252a3.LIZJ;
                            if (arrayList6 != null) {
                                arrayList6.addAll(0, arrayList5);
                            }
                        }
                    }
                }
                C4252a c4252a4 = C147430fIu.LIZIZ;
                if (c4252a4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                if (!PatchProxy.proxy(new Object[]{c4252a4}, obj, C147430fIu.LIZ, false, 8).isSupported) {
                    Set<String> keySet = C147430fIu.LIZJ.keySet();
                    if (keySet != null) {
                        for (Object obj2 : keySet) {
                            if (c4252a4 != null) {
                                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj2}, c4252a4, C4252a.LIZ, false, 2);
                                if (proxy.isSupported) {
                                    arrayList4 = (List) proxy.result;
                                } else {
                                    C106862S5w.LIZ(obj2);
                                    ArrayList<C5731c> arrayList7 = c4252a4.LIZJ;
                                    if (arrayList7 != null) {
                                        ArrayList arrayList8 = new ArrayList();
                                        for (Object obj3 : arrayList7) {
                                            ArrayList<C5729a> arrayList9 = ((C5731c) obj3).LJFF;
                                            if (arrayList9 != null && (!(arrayList9 instanceof Collection) || !arrayList9.isEmpty())) {
                                                Iterator<T> it2 = arrayList9.iterator();
                                                while (true) {
                                                    if (!it2.hasNext()) {
                                                        break;
                                                    } else if (Intrinsics.areEqual(((C5729a) it2.next()).LIZIZ, obj2)) {
                                                        arrayList8.add(obj3);
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        arrayList4 = arrayList8;
                                    } else {
                                        arrayList4 = new ArrayList<>();
                                    }
                                }
                            } else {
                                arrayList4 = null;
                            }
                            AbstractC4251a abstractC4251a = C147430fIu.LIZJ.get(obj2);
                            if (abstractC4251a != null) {
                                abstractC4251a.LIZ(new ArrayList(), arrayList4);
                            }
                        }
                    }
                    C147436fJ0 c147436fJ0 = C147430fIu.LIZLLL;
                    ArrayList arrayList10 = new ArrayList();
                    if (c4252a4 != null && (arrayList2 = c4252a4.LIZJ) != null) {
                        ArrayList arrayList11 = new ArrayList();
                        for (Object obj4 : arrayList2) {
                            C5731c c5731c = (C5731c) obj4;
                            if (c5731c != null && (arrayList3 = c5731c.LJFF) != null) {
                                if (!(arrayList3 instanceof Collection) || !arrayList3.isEmpty()) {
                                    for (C5729a c5729a : arrayList3) {
                                        if (!(!C147430fIu.LIZJ.containsKey(c5729a.LIZIZ))) {
                                            break;
                                        }
                                    }
                                }
                                arrayList11.add(obj4);
                            }
                        }
                        arrayList = arrayList11;
                    } else {
                        arrayList = new ArrayList();
                    }
                    c147436fJ0.LIZ(arrayList10, arrayList);
                }
                C147430fIu.LJFF = true;
                C1D9 c1d9 = C1D9.f168LJ;
                C4252a c4252a5 = C147430fIu.LIZIZ;
                if (c4252a5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                if (!PatchProxy.proxy(new Object[]{c4252a5}, c1d9, C1D9.LIZ, false, 3).isSupported) {
                    C106862S5w.LIZ(c4252a5);
                    Pair<List<Long>, Map<String, Long>> LIZ = c4252a5.LIZ();
                    C1D9.LIZIZ = LIZ.getFirst();
                    C1D9.LIZJ = LIZ.getSecond();
                    CollectionsKt__MutableCollectionsJVMKt.sort(C1D9.LIZIZ);
                }
                C147431fIv c147431fIv = C147431fIv.LIZJ;
                C4252a c4252a6 = C147430fIu.LIZIZ;
                if (c4252a6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                String str = c4252a6.LIZIZ;
                if (str == null) {
                    str = "";
                }
                if (!PatchProxy.proxy(new Object[]{str}, c147431fIv, C147431fIv.LIZ, false, 1).isSupported) {
                    C106862S5w.LIZ(str);
                    C147431fIv.LIZIZ = str;
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("init_result", 0);
                    jSONObject.put("strategy_id", C147431fIv.LIZIZ);
                    LiveTracingMonitor.LIZ("ttlive_strategy_init", LiveTracingMonitor.EventModule.STRATEGY, jSONObject, new JSONObject(), new JSONObject());
                }
            }
        }
        return Unit.INSTANCE;
    }
}
