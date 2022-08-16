package com.bytedance.android.annie.protobuf;

import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt___SequencesKt;
import p003X.C101149PsV;
import p003X.C106862S5w;
import p003X.QOV;

/* renamed from: com.bytedance.android.annie.protobuf.d */
/* loaded from: classes8.dex */
public final class C2619d {
    public static ChangeQuickRedirect LIZ;
    public static final C101149PsV LIZIZ = new C101149PsV((byte) 0);
    public final Map<String, C2623c> LIZJ;

    static {
        Covode.recordClassIndex(10939);
    }

    public final C2623c LIZ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (C2623c) proxy.result;
        }
        C106862S5w.LIZ(str);
        return this.LIZJ.get(str);
    }

    /* renamed from: com.bytedance.android.annie.protobuf.d$c */
    /* loaded from: classes8.dex */
    public static final class C2623c {
        public final SparseArray<C2620b> LIZ;

        static {
            Covode.recordClassIndex(10945);
        }

        public C2623c(String str, SparseArray<C2620b> sparseArray) {
            this.LIZ = sparseArray;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public C2623c(java.lang.String r19, com.google.gson.JsonObject r20) {
            /*
                Method dump skipped, instructions count: 278
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.annie.protobuf.C2619d.C2623c.<init>(java.lang.String, com.google.gson.JsonObject):void");
        }
    }

    /* renamed from: com.bytedance.android.annie.protobuf.d$b */
    /* loaded from: classes8.dex */
    public static class C2620b {
        public static final QOV LJI = new QOV((byte) 0);
        public final String LIZ;
        public final int LIZIZ;
        public final int LIZJ;
        public final boolean LIZLLL;

        /* renamed from: LJ */
        public final String f25622LJ;
        public final Pair<C2621b, C2622c> LJFF;

        static {
            Covode.recordClassIndex(10941);
        }

        /* renamed from: com.bytedance.android.annie.protobuf.d$b$b */
        /* loaded from: classes8.dex */
        public static final class C2621b extends C2620b {
            static {
                Covode.recordClassIndex(10943);
            }

            public C2621b(int i, String str) {
                super("_map_key", 1, i, false, str, null, 32);
            }
        }

        /* renamed from: com.bytedance.android.annie.protobuf.d$b$c */
        /* loaded from: classes8.dex */
        public static final class C2622c extends C2620b {
            static {
                Covode.recordClassIndex(10944);
            }

            public C2622c(int i, String str) {
                super("_map_value", 2, i, false, str, null, 32);
            }
        }

        public C2620b(String str, int i, int i2, boolean z, String str2, Pair<C2621b, C2622c> pair) {
            C106862S5w.LIZ(str);
            this.LIZ = str;
            this.LIZIZ = i;
            this.LIZJ = i2;
            this.LIZLLL = z;
            this.f25622LJ = str2;
            this.LJFF = pair;
        }

        public /* synthetic */ C2620b(String str, int i, int i2, boolean z, String str2, Pair pair, int i3) {
            this(str, i, i2, false, str2, null);
        }
    }

    public C2619d(String str, BufferedReader bufferedReader) {
        JsonElement parse = new JsonParser().parse(bufferedReader);
        Intrinsics.checkNotNullExpressionValue(parse, "");
        JsonObject asJsonObject = parse.getAsJsonObject();
        Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
        Set<String> keySet = asJsonObject.keySet();
        Intrinsics.checkNotNullExpressionValue(keySet, "");
        this.LIZJ = MapsKt__MapsKt.toMap(SequencesKt___SequencesKt.map(CollectionsKt___CollectionsKt.asSequence(keySet), new C2614xd59212bd(asJsonObject)));
    }

    public /* synthetic */ C2619d(String str, BufferedReader bufferedReader, byte b) {
        this(str, bufferedReader);
    }
}
