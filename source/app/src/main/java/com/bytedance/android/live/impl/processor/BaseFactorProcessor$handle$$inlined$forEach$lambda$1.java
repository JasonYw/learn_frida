package com.bytedance.android.live.impl.processor;

import com.bytedance.android.live.strategy.api.AbstractC5732d;
import com.bytedance.android.live.strategy.api.C5730b;
import com.bytedance.android.live.strategy.api.C5731c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C127309a3T;

/* loaded from: classes20.dex */
public final class BaseFactorProcessor$handle$$inlined$forEach$lambda$1 extends Lambda implements Function1<String, Boolean> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Map $characterCache$inlined;
    public final /* synthetic */ C5731c $comInfo$inlined;
    public final /* synthetic */ C127309a3T $data$inlined;
    public final /* synthetic */ Object $default$inlined;
    public final /* synthetic */ String $faName$inlined;
    public final /* synthetic */ AbstractC4251a this$0;

    static {
        Covode.recordClassIndex(25024);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseFactorProcessor$handle$$inlined$forEach$lambda$1(C5731c c5731c, AbstractC4251a abstractC4251a, Map map, C127309a3T c127309a3T, String str, Object obj) {
        super(1);
        this.$comInfo$inlined = c5731c;
        this.this$0 = abstractC4251a;
        this.$characterCache$inlined = map;
        this.$data$inlined = c127309a3T;
        this.$faName$inlined = str;
        this.$default$inlined = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Boolean invoke(String str) {
        ArrayList<C5730b> arrayList;
        Object obj;
        Object LIZ;
        boolean z = true;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            z = ((Boolean) proxy.result).booleanValue();
        } else {
            C106862S5w.LIZ(str);
            C5731c c5731c = this.$comInfo$inlined;
            if (c5731c != null && (arrayList = c5731c.LIZIZ) != null) {
                Iterator<T> it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (Intrinsics.areEqual(((C5730b) obj).LJI, str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                C5730b c5730b = (C5730b) obj;
                if (c5730b != null) {
                    if (!Intrinsics.areEqual("all", c5730b.f26742LJ)) {
                        if (!Intrinsics.areEqual("all not", c5730b.f26742LJ)) {
                            Map map = this.$characterCache$inlined;
                            String str2 = c5730b.LIZIZ;
                            if (map != null) {
                                if (map.containsKey(str2)) {
                                    LIZ = this.$characterCache$inlined.get(c5730b.LIZIZ);
                                } else {
                                    AbstractC4251a abstractC4251a = this.this$0;
                                    String str3 = c5730b.LIZIZ;
                                    if (str3 == null) {
                                        str3 = "";
                                    }
                                    LIZ = abstractC4251a.LIZ(str3);
                                    String str4 = c5730b.LIZIZ;
                                    if (str4 != null) {
                                        this.$characterCache$inlined.put(str4, LIZ);
                                    }
                                }
                                if (LIZ != null) {
                                    Intrinsics.areEqual(this.this$0.LJFF.get(c5730b.LIZIZ), LIZ);
                                    List<AbstractC5732d> list = this.this$0.f26248LJ;
                                    if (list != null) {
                                        for (AbstractC5732d abstractC5732d : list) {
                                            if (c5730b.LIZLLL != null && c5730b.f26742LJ != null && abstractC5732d.LIZ(LIZ, this.this$0.LIZ(c5730b.LIZLLL, c5730b.LIZJ), c5730b.f26742LJ)) {
                                                break;
                                            }
                                        }
                                    }
                                }
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.Map<K, *>");
                            }
                        }
                    }
                }
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
