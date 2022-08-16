package com.bytedance.android.live.impl.strategy;

import com.bytedance.android.live.strategy.api.C5729a;
import com.bytedance.android.live.strategy.api.C5730b;
import com.bytedance.android.live.strategy.api.C5731c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import com.umeng.commonsdk.vchannel.C33968a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.impl.strategy.a */
/* loaded from: classes28.dex */
public final class C4252a {
    public static ChangeQuickRedirect LIZ;
    @SerializedName(C33968a.f42937f)
    public final String LIZIZ;
    @SerializedName("combine")
    public final ArrayList<C5731c> LIZJ;
    @SerializedName("ab_info")
    public final Map<String, ArrayList<C5731c>> LIZLLL;

    static {
        Covode.recordClassIndex(25030);
    }

    public C4252a() {
        this(null, null, null, 7);
    }

    private Object[] LIZIZ() {
        return new Object[]{this.LIZIZ, this.LIZJ, this.LIZLLL};
    }

    public final boolean equals(Object obj) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 6);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4252a) {
            return C106862S5w.LIZ(((C4252a) obj).LIZIZ(), LIZIZ());
        }
        return false;
    }

    public final int hashCode() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : Objects.hash(LIZIZ());
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 8);
        return proxy.isSupported ? (String) proxy.result : C106862S5w.LIZ("Strategy:%s,%s,%s", LIZIZ());
    }

    public final Pair<List<Long>, Map<String, Long>> LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (Pair) proxy.result;
        }
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList<C5731c> arrayList2 = this.LIZJ;
        if (arrayList2 != null) {
            for (C5731c c5731c : arrayList2) {
                ArrayList<C5730b> arrayList3 = c5731c.LIZIZ;
                if (arrayList3 != null) {
                    for (C5730b c5730b : arrayList3) {
                        long j = c5730b.LJFF;
                        String str = c5730b.LIZIZ;
                        if (str != null && j > 0) {
                            if (linkedHashMap.containsKey(str)) {
                                Long l = (Long) linkedHashMap.get(str);
                                if (l == null) {
                                    arrayList.add(Long.valueOf(j));
                                    linkedHashMap.put(str, Long.valueOf(j));
                                } else {
                                    if (j > l.longValue()) {
                                        j = l.longValue();
                                    }
                                    linkedHashMap.put(str, Long.valueOf(j));
                                }
                            } else {
                                arrayList.add(Long.valueOf(j));
                                linkedHashMap.put(str, Long.valueOf(j));
                            }
                        }
                    }
                }
            }
        }
        return new Pair<>(arrayList, linkedHashMap);
    }

    public final List<String> LIZ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        C106862S5w.LIZ(str);
        ArrayList arrayList = new ArrayList();
        ArrayList<C5731c> arrayList2 = this.LIZJ;
        if (arrayList2 != null) {
            ArrayList<C5731c> arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                ArrayList<C5730b> arrayList4 = ((C5731c) obj).LIZIZ;
                if (arrayList4 != null && (!(arrayList4 instanceof Collection) || !arrayList4.isEmpty())) {
                    Iterator<T> it = arrayList4.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (Intrinsics.areEqual(((C5730b) it.next()).LIZIZ, str)) {
                            arrayList3.add(obj);
                            break;
                        }
                    }
                }
            }
            for (C5731c c5731c : arrayList3) {
                ArrayList<C5729a> arrayList5 = c5731c.LJFF;
                if (arrayList5 != null) {
                    for (C5729a c5729a : arrayList5) {
                        String str2 = c5729a.LIZIZ;
                        if (str2 != null) {
                            arrayList.add(str2);
                        }
                    }
                }
            }
        }
        return CollectionsKt___CollectionsKt.distinct(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4252a(String str, ArrayList<C5731c> arrayList, Map<String, ? extends ArrayList<C5731c>> map) {
        this.LIZIZ = str;
        this.LIZJ = arrayList;
        this.LIZLLL = map;
    }

    public /* synthetic */ C4252a(String str, ArrayList arrayList, Map map, int i) {
        this("", new ArrayList(), new LinkedHashMap());
    }
}
