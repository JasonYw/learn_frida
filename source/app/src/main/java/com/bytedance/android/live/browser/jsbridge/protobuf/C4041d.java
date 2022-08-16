package com.bytedance.android.live.browser.jsbridge.protobuf;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.MapsKt___MapsKt;
import kotlin.collections.SetsKt___SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import p003X.AbstractC102251QOn;
import p003X.C101153PsZ;
import p003X.C102250QOm;
import p003X.C102255QOr;
import p003X.C106862S5w;
import p003X.KM9;

/* renamed from: com.bytedance.android.live.browser.jsbridge.protobuf.d */
/* loaded from: classes8.dex */
public final class C4041d {
    public static ChangeQuickRedirect LIZ;
    public static final C101153PsZ LIZIZ = new C101153PsZ((byte) 0);
    public final Map<String, C4042b> LIZJ;

    static {
        Covode.recordClassIndex(22958);
    }

    public final C4042b LIZ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (C4042b) proxy.result;
        }
        if (str != null) {
            return this.LIZJ.get(str);
        }
        return null;
    }

    public C4041d(String str, BufferedReader bufferedReader) {
        JsonElement parse = KM9.LIZJ().parse(bufferedReader);
        Intrinsics.checkNotNullExpressionValue(parse, "");
        JsonObject asJsonObject = parse.getAsJsonObject();
        Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
        Set<String> keySet = asJsonObject.keySet();
        Intrinsics.checkNotNullExpressionValue(keySet, "");
        Map<String, C4042b> map = MapsKt__MapsKt.toMap(SequencesKt___SequencesKt.map(CollectionsKt___CollectionsKt.asSequence(keySet), new ExternalProtobufShrinkConfigs$$special$$inlined$shallowToMap$1(asJsonObject)));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C4042b c4042b : map.values()) {
            LIZ(c4042b, map, linkedHashMap, true);
        }
        this.LIZJ = linkedHashMap;
    }

    public /* synthetic */ C4041d(String str, BufferedReader bufferedReader, byte b) {
        this(str, bufferedReader);
    }

    /* renamed from: com.bytedance.android.live.browser.jsbridge.protobuf.d$b */
    /* loaded from: classes8.dex */
    public static final class C4042b {

        /* renamed from: LJ */
        public static final C102250QOm f26165LJ = new C102250QOm((byte) 0);
        public final Map<Class<?>, AbstractC102251QOn<?>> LIZ;
        public final String LIZIZ;
        public final Set<String> LIZJ;
        public final Map<String, C4042b> LIZLLL;

        static {
            Covode.recordClassIndex(22960);
        }

        public C4042b(String str, Set<String> set, Map<String, C4042b> map, Collection<? extends AbstractC102251QOn<?>> collection) {
            Map linkedHashMap;
            C106862S5w.LIZ(str, set, map, collection);
            this.LIZIZ = str;
            this.LIZJ = set;
            this.LIZLLL = map;
            if (collection.isEmpty()) {
                linkedHashMap = MapsKt__MapsKt.emptyMap();
            } else {
                linkedHashMap = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(collection, 10)), 16));
                for (Object obj : collection) {
                    linkedHashMap.put(obj.getClass(), obj);
                }
            }
            this.LIZ = linkedHashMap;
        }
    }

    public final C4042b LIZ(C4042b c4042b, Map<String, C4042b> map, Map<String, C4042b> map2, boolean z) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c4042b, map, map2, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (C4042b) proxy.result;
        }
        ExternalProtobufShrinkConfigs$mergedConfigs$1 externalProtobufShrinkConfigs$mergedConfigs$1 = new ExternalProtobufShrinkConfigs$mergedConfigs$1(this, map, map2);
        ExternalProtobufShrinkConfigs$mergedConfigs$2 externalProtobufShrinkConfigs$mergedConfigs$2 = new ExternalProtobufShrinkConfigs$mergedConfigs$2(this, map, map2);
        C102255QOr c102255QOr = (C102255QOr) c4042b.LIZ.get(C102255QOr.class);
        if (c102255QOr == null) {
            if (!c4042b.LIZLLL.isEmpty() || !c4042b.LIZ.isEmpty()) {
                c4042b = new C4042b(c4042b.LIZIZ, c4042b.LIZJ, MapsKt__MapsKt.toMap(externalProtobufShrinkConfigs$mergedConfigs$1.invoke(MapsKt___MapsKt.asSequence(c4042b.LIZLLL))), SequencesKt___SequencesKt.toSet(externalProtobufShrinkConfigs$mergedConfigs$2.invoke(MapsKt___MapsKt.asSequence(c4042b.LIZ))));
            }
            if (z) {
                map2.put(c4042b.LIZIZ, c4042b);
            }
            return c4042b;
        }
        C4042b c4042b2 = map2.get(c102255QOr.LIZIZ);
        if (c4042b2 == null) {
            C4042b c4042b3 = map.get(c102255QOr.LIZIZ);
            if (c4042b3 != null) {
                c4042b2 = LIZ(c4042b3, map, map2, true);
            } else {
                throw new IllegalArgumentException(("failed to find [" + c102255QOr.LIZIZ + LoggerUtil.M_RIGHT_TAG).toString());
            }
        }
        C4042b c4042b4 = new C4042b(c4042b.LIZIZ, SetsKt___SetsKt.plus((Set) c4042b.LIZJ, (Iterable) c4042b2.LIZJ), MapsKt__MapsKt.toMap(externalProtobufShrinkConfigs$mergedConfigs$1.invoke(SequencesKt___SequencesKt.plus(MapsKt___MapsKt.asSequence(c4042b.LIZLLL), SequencesKt___SequencesKt.filterNot(MapsKt___MapsKt.asSequence(c4042b2.LIZLLL), new ExternalProtobufShrinkConfigs$mergedConfigs$children$1(c4042b))))), SequencesKt___SequencesKt.toSet(externalProtobufShrinkConfigs$mergedConfigs$2.invoke(SequencesKt___SequencesKt.filterNot(CollectionsKt___CollectionsKt.asSequence(c4042b2.LIZ.entrySet()), new ExternalProtobufShrinkConfigs$mergedConfigs$options$1(c4042b)))));
        if (z) {
            map2.put(c4042b4.LIZIZ, c4042b4);
        }
        return c4042b4;
    }
}
