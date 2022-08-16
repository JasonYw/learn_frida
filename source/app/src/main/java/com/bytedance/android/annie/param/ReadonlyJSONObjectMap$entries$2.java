package com.bytedance.android.annie.param;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import p003X.QPC;
import p003X.QPV;

/* loaded from: classes8.dex */
public final class ReadonlyJSONObjectMap$entries$2 extends Lambda implements Function0<Set<? extends C26101.C26111>> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ QPV this$0;

    static {
        Covode.recordClassIndex(10889);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReadonlyJSONObjectMap$entries$2(QPV qpv) {
        super(0);
        this.this$0 = qpv;
    }

    /* renamed from: com.bytedance.android.annie.param.ReadonlyJSONObjectMap$entries$2$1 */
    /* loaded from: classes8.dex */
    public static final class C26101 extends Lambda implements Function1<String, C26111> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(10890);
        }

        public C26101() {
            super(1);
        }

        /* renamed from: com.bytedance.android.annie.param.ReadonlyJSONObjectMap$entries$2$1$1 */
        /* loaded from: classes8.dex */
        public static final class C26111 implements Map.Entry<String, Object>, KMappedMarker {
            public static ChangeQuickRedirect LIZ;
            public final /* synthetic */ String LIZJ;

            static {
                Covode.recordClassIndex(10891);
            }

            @Override // java.util.Map.Entry
            public final Object setValue(Object obj) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 3);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.lang.String] */
            @Override // java.util.Map.Entry
            public final /* synthetic */ String getKey() {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                String str = this.LIZJ;
                Intrinsics.checkNotNullExpressionValue(str, "");
                return str;
            }

            @Override // java.util.Map.Entry
            public final Object getValue() {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
                if (proxy.isSupported) {
                    return proxy.result;
                }
                Object opt = ReadonlyJSONObjectMap$entries$2.this.this$0.LIZIZ.opt(this.LIZJ);
                if (opt != null) {
                    return QPC.LIZ(opt);
                }
                return null;
            }

            public C26111(String str) {
                this.LIZJ = str;
            }
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.android.annie.param.ReadonlyJSONObjectMap$entries$2$1$1, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ C26111 invoke(String str) {
            String str2 = str;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str2}, this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return proxy.result;
            }
            return new C26111(str2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.Set<? extends com.bytedance.android.annie.param.ReadonlyJSONObjectMap$entries$2$1$1>, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Set<? extends C26101.C26111> mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        Iterator<String> keys = this.this$0.LIZIZ.keys();
        Intrinsics.checkNotNullExpressionValue(keys, "");
        return SequencesKt___SequencesKt.toSet(SequencesKt___SequencesKt.map(SequencesKt__SequencesKt.asSequence(keys), new C26101()));
    }
}
