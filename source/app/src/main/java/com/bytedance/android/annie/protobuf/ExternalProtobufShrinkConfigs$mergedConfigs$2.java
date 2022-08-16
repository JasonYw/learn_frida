package com.bytedance.android.annie.protobuf;

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
import p003X.AbstractC102244QOg;
import p003X.C102245QOh;
import p003X.C102246QOi;
import p003X.C102247QOj;
import p003X.C102248QOk;
import p003X.C106862S5w;

/* loaded from: classes8.dex */
public final class ExternalProtobufShrinkConfigs$mergedConfigs$2 extends Lambda implements Function1<Sequence<? extends Map.Entry<? extends Class<?>, ? extends AbstractC102244QOg<?>>>, Sequence<? extends AbstractC102244QOg<?>>> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Map $initialMap;
    public final /* synthetic */ Map $mergedMap;
    public final /* synthetic */ C2624e this$0;

    static {
        Covode.recordClassIndex(10926);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExternalProtobufShrinkConfigs$mergedConfigs$2(C2624e c2624e, Map map, Map map2) {
        super(1);
        this.this$0 = c2624e;
        this.$initialMap = map;
        this.$mergedMap = map2;
    }

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: LIZ */
    public final Sequence<AbstractC102244QOg<?>> invoke(Sequence<? extends Map.Entry<? extends Class<?>, ? extends AbstractC102244QOg<?>>> sequence) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{sequence}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (Sequence) proxy.result;
        }
        C106862S5w.LIZ(sequence);
        return SequencesKt___SequencesKt.mapNotNull(sequence, new C26181());
    }

    /* renamed from: com.bytedance.android.annie.protobuf.ExternalProtobufShrinkConfigs$mergedConfigs$2$1 */
    /* loaded from: classes8.dex */
    public static final class C26181 extends Lambda implements Function1<Map.Entry<? extends Class<?>, ? extends AbstractC102244QOg<?>>, AbstractC102244QOg<? extends Object>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(10927);
        }

        public C26181() {
            super(1);
        }

        /* JADX WARN: Type inference failed for: r0v18, types: [X.QOg<? extends java.lang.Object>, java.lang.Object] */
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ AbstractC102244QOg<? extends Object> invoke(Map.Entry<? extends Class<?>, ? extends AbstractC102244QOg<?>> entry) {
            Map.Entry<? extends Class<?>, ? extends AbstractC102244QOg<?>> entry2 = entry;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{entry2}, this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return proxy.result;
            }
            C106862S5w.LIZ(entry2);
            AbstractC102244QOg<? extends Object> abstractC102244QOg = (AbstractC102244QOg) entry2.getValue();
            if (abstractC102244QOg instanceof C102248QOk) {
                return null;
            }
            if (abstractC102244QOg instanceof C102245QOh) {
                return new C102245QOh(ExternalProtobufShrinkConfigs$mergedConfigs$2.this.this$0.LIZ(((C102245QOh) abstractC102244QOg).LIZIZ, ExternalProtobufShrinkConfigs$mergedConfigs$2.this.$initialMap, ExternalProtobufShrinkConfigs$mergedConfigs$2.this.$mergedMap, false));
            }
            if (abstractC102244QOg instanceof C102246QOi) {
                return new C102246QOi(ExternalProtobufShrinkConfigs$mergedConfigs$2.this.this$0.LIZ(((C102246QOi) abstractC102244QOg).LIZIZ, ExternalProtobufShrinkConfigs$mergedConfigs$2.this.$initialMap, ExternalProtobufShrinkConfigs$mergedConfigs$2.this.$mergedMap, false));
            }
            if (abstractC102244QOg instanceof C102247QOj) {
                return abstractC102244QOg;
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
