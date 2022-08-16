package com.bytedance.android.live.browser.jsbridge.protobuf;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import p003X.AbstractC102251QOn;
import p003X.C102252QOo;
import p003X.C102253QOp;
import p003X.C102254QOq;
import p003X.C102255QOr;
import p003X.C106862S5w;

/* loaded from: classes8.dex */
public final class ExternalProtobufShrinkConfigs$mergedConfigs$2 extends Lambda implements Function1<Sequence<? extends Map.Entry<? extends Class<?>, ? extends AbstractC102251QOn<?>>>, Sequence<? extends AbstractC102251QOn<?>>> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Map $initialMap;
    public final /* synthetic */ Map $mergedMap;
    public final /* synthetic */ C4041d this$0;

    static {
        Covode.recordClassIndex(22943);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExternalProtobufShrinkConfigs$mergedConfigs$2(C4041d c4041d, Map map, Map map2) {
        super(1);
        this.this$0 = c4041d;
        this.$initialMap = map;
        this.$mergedMap = map2;
    }

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: LIZ */
    public final Sequence<AbstractC102251QOn<?>> invoke(Sequence<? extends Map.Entry<? extends Class<?>, ? extends AbstractC102251QOn<?>>> sequence) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{sequence}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (Sequence) proxy.result;
        }
        C106862S5w.LIZ(sequence);
        return SequencesKt___SequencesKt.mapNotNull(sequence, new C40341());
    }

    /* renamed from: com.bytedance.android.live.browser.jsbridge.protobuf.ExternalProtobufShrinkConfigs$mergedConfigs$2$1 */
    /* loaded from: classes8.dex */
    public static final class C40341 extends Lambda implements Function1<Map.Entry<? extends Class<?>, ? extends AbstractC102251QOn<?>>, AbstractC102251QOn<? extends Object>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(22944);
        }

        public C40341() {
            super(1);
        }

        /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object, X.QOn<? extends java.lang.Object>] */
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ AbstractC102251QOn<? extends Object> invoke(Map.Entry<? extends Class<?>, ? extends AbstractC102251QOn<?>> entry) {
            Map.Entry<? extends Class<?>, ? extends AbstractC102251QOn<?>> entry2 = entry;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{entry2}, this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return proxy.result;
            }
            C106862S5w.LIZ(entry2);
            AbstractC102251QOn<? extends Object> abstractC102251QOn = (AbstractC102251QOn) entry2.getValue();
            if (abstractC102251QOn instanceof C102255QOr) {
                return null;
            }
            if (abstractC102251QOn instanceof C102252QOo) {
                return new C102252QOo(ExternalProtobufShrinkConfigs$mergedConfigs$2.this.this$0.LIZ(((C102252QOo) abstractC102251QOn).LIZIZ, ExternalProtobufShrinkConfigs$mergedConfigs$2.this.$initialMap, ExternalProtobufShrinkConfigs$mergedConfigs$2.this.$mergedMap, false));
            }
            if (abstractC102251QOn instanceof C102253QOp) {
                return new C102253QOp(ExternalProtobufShrinkConfigs$mergedConfigs$2.this.this$0.LIZ(((C102253QOp) abstractC102251QOn).LIZIZ, ExternalProtobufShrinkConfigs$mergedConfigs$2.this.$initialMap, ExternalProtobufShrinkConfigs$mergedConfigs$2.this.$mergedMap, false));
            }
            if (abstractC102251QOn instanceof C102254QOq) {
                return abstractC102251QOn;
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
