package com.bytedance.android.live.browser.jsbridge.protobuf;

import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt___SequencesKt;
import p003X.C101148PsU;
import p003X.C106862S5w;
import p003X.KM9;
import p003X.QOW;

/* renamed from: com.bytedance.android.live.browser.jsbridge.protobuf.c */
/* loaded from: classes8.dex */
public final class C4036c {
    public static ChangeQuickRedirect LIZ;
    public static final C101148PsU LIZIZ = new C101148PsU((byte) 0);
    public final Map<String, C4040c> LIZJ;

    static {
        Covode.recordClassIndex(22951);
    }

    public final C4040c LIZ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (C4040c) proxy.result;
        }
        C106862S5w.LIZ(str);
        return this.LIZJ.get(str);
    }

    /* renamed from: com.bytedance.android.live.browser.jsbridge.protobuf.c$c */
    /* loaded from: classes8.dex */
    public static final class C4040c {
        public final SparseArray<C4037b> LIZ;

        static {
            Covode.recordClassIndex(22957);
        }

        public C4040c(String str, SparseArray<C4037b> sparseArray) {
            this.LIZ = sparseArray;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public C4040c(java.lang.String r19, com.google.gson.JsonObject r20) {
            /*
                Method dump skipped, instructions count: 278
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.browser.jsbridge.protobuf.C4036c.C4040c.<init>(java.lang.String, com.google.gson.JsonObject):void");
        }
    }

    /* renamed from: com.bytedance.android.live.browser.jsbridge.protobuf.c$b */
    /* loaded from: classes8.dex */
    public static class C4037b {
        public static final QOW LJI = new QOW((byte) 0);
        public final String LIZ;
        public final int LIZIZ;
        public final int LIZJ;
        public final boolean LIZLLL;

        /* renamed from: LJ */
        public final String f26164LJ;
        public final Pair<C4038b, C4039c> LJFF;

        static {
            Covode.recordClassIndex(22953);
        }

        /* renamed from: com.bytedance.android.live.browser.jsbridge.protobuf.c$b$b */
        /* loaded from: classes8.dex */
        public static final class C4038b extends C4037b {
            static {
                Covode.recordClassIndex(22955);
            }

            public C4038b(int i, String str) {
                super("_map_key", 1, i, false, str, null, 32);
            }
        }

        /* renamed from: com.bytedance.android.live.browser.jsbridge.protobuf.c$b$c */
        /* loaded from: classes8.dex */
        public static final class C4039c extends C4037b {
            static {
                Covode.recordClassIndex(22956);
            }

            public C4039c(int i, String str) {
                super("_map_value", 2, i, false, str, null, 32);
            }
        }

        public C4037b(String str, int i, int i2, boolean z, String str2, Pair<C4038b, C4039c> pair) {
            C106862S5w.LIZ(str);
            this.LIZ = str;
            this.LIZIZ = i;
            this.LIZJ = i2;
            this.LIZLLL = z;
            this.f26164LJ = str2;
            this.LJFF = pair;
        }

        public /* synthetic */ C4037b(String str, int i, int i2, boolean z, String str2, Pair pair, int i3) {
            this(str, i, i2, false, str2, null);
        }
    }

    public C4036c(String str, BufferedReader bufferedReader) {
        JsonElement parse = KM9.LIZJ().parse(bufferedReader);
        Intrinsics.checkNotNullExpressionValue(parse, "");
        JsonObject asJsonObject = parse.getAsJsonObject();
        Intrinsics.checkNotNullExpressionValue(asJsonObject, "");
        Set<String> keySet = asJsonObject.keySet();
        Intrinsics.checkNotNullExpressionValue(keySet, "");
        this.LIZJ = MapsKt__MapsKt.toMap(SequencesKt___SequencesKt.map(CollectionsKt___CollectionsKt.asSequence(keySet), new C4030xd59212bd(asJsonObject)));
    }

    public /* synthetic */ C4036c(String str, BufferedReader bufferedReader, byte b) {
        this(str, bufferedReader);
    }
}
