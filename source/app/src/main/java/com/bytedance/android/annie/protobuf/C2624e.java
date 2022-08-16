package com.bytedance.android.annie.protobuf;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
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
import p003X.AbstractC102244QOg;
import p003X.C101151PsX;
import p003X.C102242QOe;
import p003X.C102248QOk;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.annie.protobuf.e */
/* loaded from: classes8.dex */
public final class C2624e {
    public static ChangeQuickRedirect LIZ;
    public static final C101151PsX LIZIZ = new C101151PsX((byte) 0);
    public final Map<String, C2625b> LIZJ;

    static {
        Covode.recordClassIndex(10946);
    }

    public final C2625b LIZ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (C2625b) proxy.result;
        }
        if (str != null) {
            return this.LIZJ.get(str);
        }
        return null;
    }

    public C2624e(String str, BufferedReader bufferedReader) {
        JsonElement parse = new JsonParser().parse(bufferedReader);
        Intrinsics.checkNotNullExpressionValue(parse, "");
        JsonObject asJsonObject = parse.getAsJsonObject();
        Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
        Set<String> keySet = asJsonObject.keySet();
        Intrinsics.checkNotNullExpressionValue(keySet, "");
        Map<String, C2625b> map = MapsKt__MapsKt.toMap(SequencesKt___SequencesKt.map(CollectionsKt___CollectionsKt.asSequence(keySet), new ExternalProtobufShrinkConfigs$$special$$inlined$shallowToMap$1(asJsonObject)));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C2625b c2625b : map.values()) {
            LIZ(c2625b, map, linkedHashMap, true);
        }
        this.LIZJ = linkedHashMap;
    }

    public /* synthetic */ C2624e(String str, BufferedReader bufferedReader, byte b) {
        this(str, bufferedReader);
    }

    /* renamed from: com.bytedance.android.annie.protobuf.e$b */
    /* loaded from: classes8.dex */
    public static final class C2625b {

        /* renamed from: LJ */
        public static final C102242QOe f25623LJ = new C102242QOe((byte) 0);
        public final Map<Class<?>, AbstractC102244QOg<?>> LIZ;
        public final String LIZIZ;
        public final Set<String> LIZJ;
        public final Map<String, C2625b> LIZLLL;

        static {
            Covode.recordClassIndex(10948);
        }

        public C2625b(String str, Set<String> set, Map<String, C2625b> map, Collection<? extends AbstractC102244QOg<?>> collection) {
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

    public final C2625b LIZ(C2625b c2625b, Map<String, C2625b> map, Map<String, C2625b> map2, boolean z) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c2625b, map, map2, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (C2625b) proxy.result;
        }
        ExternalProtobufShrinkConfigs$mergedConfigs$1 externalProtobufShrinkConfigs$mergedConfigs$1 = new ExternalProtobufShrinkConfigs$mergedConfigs$1(this, map, map2);
        ExternalProtobufShrinkConfigs$mergedConfigs$2 externalProtobufShrinkConfigs$mergedConfigs$2 = new ExternalProtobufShrinkConfigs$mergedConfigs$2(this, map, map2);
        C102248QOk c102248QOk = (C102248QOk) c2625b.LIZ.get(C102248QOk.class);
        if (c102248QOk == null) {
            if (!c2625b.LIZLLL.isEmpty() || !c2625b.LIZ.isEmpty()) {
                c2625b = new C2625b(c2625b.LIZIZ, c2625b.LIZJ, MapsKt__MapsKt.toMap(externalProtobufShrinkConfigs$mergedConfigs$1.invoke(MapsKt___MapsKt.asSequence(c2625b.LIZLLL))), SequencesKt___SequencesKt.toSet(externalProtobufShrinkConfigs$mergedConfigs$2.invoke(MapsKt___MapsKt.asSequence(c2625b.LIZ))));
            }
            if (z) {
                map2.put(c2625b.LIZIZ, c2625b);
            }
            return c2625b;
        }
        C2625b c2625b2 = map2.get(c102248QOk.LIZIZ);
        if (c2625b2 == null) {
            C2625b c2625b3 = map.get(c102248QOk.LIZIZ);
            if (c2625b3 != null) {
                c2625b2 = LIZ(c2625b3, map, map2, true);
            } else {
                throw new IllegalArgumentException(("failed to find [" + c102248QOk.LIZIZ + LoggerUtil.M_RIGHT_TAG).toString());
            }
        }
        C2625b c2625b4 = new C2625b(c2625b.LIZIZ, SetsKt___SetsKt.plus((Set) c2625b.LIZJ, (Iterable) c2625b2.LIZJ), MapsKt__MapsKt.toMap(externalProtobufShrinkConfigs$mergedConfigs$1.invoke(SequencesKt___SequencesKt.plus(MapsKt___MapsKt.asSequence(c2625b.LIZLLL), SequencesKt___SequencesKt.filterNot(MapsKt___MapsKt.asSequence(c2625b2.LIZLLL), new ExternalProtobufShrinkConfigs$mergedConfigs$children$1(c2625b))))), SequencesKt___SequencesKt.toSet(externalProtobufShrinkConfigs$mergedConfigs$2.invoke(SequencesKt___SequencesKt.filterNot(CollectionsKt___CollectionsKt.asSequence(c2625b2.LIZ.entrySet()), new ExternalProtobufShrinkConfigs$mergedConfigs$options$1(c2625b)))));
        if (z) {
            map2.put(c2625b4.LIZIZ, c2625b4);
        }
        return c2625b4;
    }
}
