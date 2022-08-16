package com.bytedance.android.live.impl.processor;

import androidx.lifecycle.LiveData;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.strategy.api.AbstractC5732d;
import com.bytedance.android.live.strategy.api.C5731c;
import com.bytedance.android.live.strategy.api.C5733e;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import p003X.C101376PwA;
import p003X.C103623QrJ;
import p003X.C106862S5w;
import p003X.C127309a3T;
import p003X.C72670ElE;
import p003X.PZK;

/* renamed from: com.bytedance.android.live.impl.processor.a */
/* loaded from: classes20.dex */
public abstract class AbstractC4251a {
    public static ChangeQuickRedirect LIZ;
    public List<C5733e> LIZIZ;
    public List<C5731c> LIZJ;
    public final C72670ElE LIZLLL = new C72670ElE();

    /* renamed from: LJ */
    public List<AbstractC5732d> f26248LJ = new ArrayList();
    public Map<String, Object> LJFF = new LinkedHashMap();
    public Map<String, Long> LJI = new LinkedHashMap();
    public volatile boolean LJII;

    static {
        Covode.recordClassIndex(25026);
    }

    public abstract <T> LiveData<T> LIZ(C5731c c5731c, LiveData<T> liveData, T t);

    public abstract <T> LiveData<T> LIZ(C5733e c5733e, Object obj, AbstractC5732d abstractC5732d, LiveData<T> liveData, T t);

    private final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 9).isSupported) {
            return;
        }
        this.f26248LJ.add(new C103623QrJ());
    }

    public final List<C5731c> LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        List<C5731c> list = this.LIZJ;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return list;
    }

    public final Object LIZ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 13);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C106862S5w.LIZ(str);
        Object LIZ2 = PZK.LIZIZ.LIZ(str, null);
        ALogger.m15797i("strategy_tag", "curent character " + str + " is " + LIZ2);
        return LIZ2;
    }

    public final void LIZ(AbstractC5732d abstractC5732d) {
        if (PatchProxy.proxy(new Object[]{abstractC5732d}, this, LIZ, false, 10).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC5732d);
        if (!this.f26248LJ.contains(abstractC5732d)) {
            this.f26248LJ.add(abstractC5732d);
        }
    }

    public final Object LIZ(Object obj, String str) {
        String str2;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj, str}, this, LIZ, false, 14);
        if (proxy.isSupported) {
            return proxy.result;
        }
        if (str != null) {
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "");
            str2 = str.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(str2, "");
        } else {
            str2 = null;
        }
        if (Intrinsics.areEqual(str2, "double") && obj != null) {
            return Double.valueOf(C101376PwA.LIZIZ.LIZIZ(obj));
        }
        return obj;
    }

    public final void LIZ(List<C5733e> list, List<C5731c> list2) {
        if (PatchProxy.proxy(new Object[]{list, list2}, this, LIZ, false, 8).isSupported) {
            return;
        }
        C106862S5w.LIZ(list, list2);
        this.LIZIZ = list;
        this.LIZJ = list2;
        LIZIZ();
        this.LJII = true;
    }

    public final void LIZ(String str, String str2, C127309a3T<Object> c127309a3T, Map<String, Object> map) {
        Object LIZ2;
        if (PatchProxy.proxy(new Object[]{str, str2, c127309a3T, map}, this, LIZ, false, 11).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, str2, c127309a3T, map);
        if (map.containsKey(str2)) {
            LIZ2 = map.get(str2);
        } else {
            LIZ2 = LIZ(str2);
            map.put(str2, LIZ2);
        }
        if (!Intrinsics.areEqual(LIZ2, this.LJFF.get(str2)) && c127309a3T.getValue() != null) {
            Object value = c127309a3T.getValue();
            Intrinsics.checkNotNull(value);
            Intrinsics.checkNotNullExpressionValue(value, "");
            LiveData LIZ3 = LIZ(str, (String) value, (C127309a3T<String>) c127309a3T, map);
            if (LIZ3 != null) {
                LIZ3.getValue();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:181:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x028f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized <T> androidx.lifecycle.LiveData<T> LIZ(java.lang.String r18, T r19, p003X.C127309a3T<T> r20, java.util.Map<java.lang.String, java.lang.Object> r21) {
        /*
            Method dump skipped, instructions count: 997
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.impl.processor.AbstractC4251a.LIZ(java.lang.String, java.lang.Object, X.a3T, java.util.Map):androidx.lifecycle.LiveData");
    }
}
