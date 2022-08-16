package com.bytedance.android.live.browser.jsbridge.protobuf;

import com.bytedance.android.live.browser.jsbridge.protobuf.C4041d;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import p003X.C106862S5w;

/* loaded from: classes8.dex */
public final class ExternalProtobufShrinkConfigs$mergedConfigs$1 extends Lambda implements Function1<Sequence<? extends Map.Entry<? extends String, ? extends C4041d.C4042b>>, Sequence<? extends Pair<? extends String, ? extends C4041d.C4042b>>> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Map $initialMap;
    public final /* synthetic */ Map $mergedMap;
    public final /* synthetic */ C4041d this$0;

    static {
        Covode.recordClassIndex(22941);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExternalProtobufShrinkConfigs$mergedConfigs$1(C4041d c4041d, Map map, Map map2) {
        super(1);
        this.this$0 = c4041d;
        this.$initialMap = map;
        this.$mergedMap = map2;
    }

    /* renamed from: com.bytedance.android.live.browser.jsbridge.protobuf.ExternalProtobufShrinkConfigs$mergedConfigs$1$1 */
    /* loaded from: classes8.dex */
    public static final class C40331 extends Lambda implements Function1<Map.Entry<? extends String, ? extends C4041d.C4042b>, Pair<? extends String, ? extends C4041d.C4042b>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(22942);
        }

        public C40331() {
            super(1);
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Pair<? extends java.lang.String, ? extends com.bytedance.android.live.browser.jsbridge.protobuf.d$b>] */
        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Pair<? extends String, ? extends C4041d.C4042b> invoke(Map.Entry<? extends String, ? extends C4041d.C4042b> entry) {
            Map.Entry<? extends String, ? extends C4041d.C4042b> entry2 = entry;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{entry2}, this, changeQuickRedirect, false, 1);
            if (proxy.isSupported) {
                return proxy.result;
            }
            C106862S5w.LIZ(entry2);
            return new Pair<>(entry2.getKey(), ExternalProtobufShrinkConfigs$mergedConfigs$1.this.this$0.LIZ(entry2.getValue(), ExternalProtobufShrinkConfigs$mergedConfigs$1.this.$initialMap, ExternalProtobufShrinkConfigs$mergedConfigs$1.this.$mergedMap, false));
        }
    }

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: LIZ */
    public final Sequence<Pair<String, C4041d.C4042b>> invoke(Sequence<? extends Map.Entry<String, C4041d.C4042b>> sequence) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{sequence}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (Sequence) proxy.result;
        }
        C106862S5w.LIZ(sequence);
        return SequencesKt___SequencesKt.map(sequence, new C40331());
    }
}
