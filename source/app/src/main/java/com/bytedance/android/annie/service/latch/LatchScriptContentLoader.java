package com.bytedance.android.annie.service.latch;

import android.content.Context;
import android.net.Uri;
import android.webkit.WebResourceResponse;
import com.bytedance.android.annie.service.prefetch.C2641a;
import com.bytedance.android.latch.b$c$a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Url;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.regex.Matcher;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p3059io.CloseableKt;
import kotlin.p3059io.TextStreamsKt;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import p002O.C0002O;
import p003X.AbstractC90724Lok;
import p003X.C106862S5w;
import p003X.C90746Lp6;
import p003X.C99788PRu;
import p003X.PL0;
import p003X.PL1;
import p003X.PL2;
import p003X.PL3;

/* loaded from: classes7.dex */
public final class LatchScriptContentLoader implements PL2 {
    public static ChangeQuickRedirect LIZ;
    public final Lazy LIZIZ = LazyKt__LazyJVMKt.lazy(LatchScriptContentLoader$loader$2.INSTANCE);
    public final Lazy LIZJ = LazyKt__LazyJVMKt.lazy(LatchScriptContentLoader$api$2.INSTANCE);

    /* loaded from: classes7.dex */
    public interface ILatchRetrofitApi {
        static {
            Covode.recordClassIndex(11087);
        }

        @GET
        Call<String> get(@Url String str);
    }

    static {
        Covode.recordClassIndex(11086);
    }

    private ILatchRetrofitApi LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return (ILatchRetrofitApi) (proxy.isSupported ? proxy.result : this.LIZJ.mo27335getValue());
    }

    @Override // p003X.PL2
    public final void LIZ(Context context, b$c$a b_c_a, Function1<? super String, Unit> function1) {
        InputStream data;
        BufferedReader bufferedReader;
        Object createFailure;
        Object mo27335getValue;
        String m25085C;
        int coerceAtLeast;
        String substring;
        String trim;
        if (PatchProxy.proxy(new Object[]{context, b_c_a, function1}, this, LIZ, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(context, b_c_a, function1);
        if (b_c_a instanceof PL0) {
            if (!PatchProxy.proxy(new Object[]{b_c_a, function1}, this, LIZ, false, 4).isSupported) {
                try {
                    String str = b_c_a.LIZ;
                    PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 6);
                    if (proxy.isSupported) {
                        createFailure = (String) proxy.result;
                    } else {
                        C90746Lp6<List<String>> c90746Lp6 = AbstractC90724Lok.LIZIZ;
                        Intrinsics.checkNotNullExpressionValue(c90746Lp6, "");
                        List<String> LIZ2 = c90746Lp6.LIZ();
                        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
                        Matcher matcher = (Matcher) SequencesKt___SequencesKt.firstOrNull(SequencesKt___SequencesKt.filter(SequencesKt___SequencesKt.map(CollectionsKt___CollectionsKt.asSequence(LIZ2), new LatchScriptContentLoader$extractChannel$1(str)), LatchScriptContentLoader$extractChannel$2.INSTANCE));
                        if (matcher != null) {
                            PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{str, matcher}, this, LIZ, false, 7);
                            if (proxy2.isSupported) {
                                trim = (String) proxy2.result;
                            } else {
                                int indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) str, "?", 0, false, 6, (Object) null);
                                int indexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) str, "#", 0, false, 6, (Object) null);
                                Integer valueOf = Integer.valueOf(RangesKt___RangesKt.coerceAtMost(indexOf$default, indexOf$default2));
                                if (valueOf.intValue() >= 0 && valueOf != null) {
                                    coerceAtLeast = valueOf.intValue();
                                } else {
                                    coerceAtLeast = RangesKt___RangesKt.coerceAtLeast(indexOf$default, indexOf$default2);
                                }
                                if (coerceAtLeast != -1) {
                                    int end = matcher.end();
                                    if (str != null) {
                                        substring = str.substring(end, coerceAtLeast);
                                        Intrinsics.checkNotNullExpressionValue(substring, "");
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                                    }
                                } else {
                                    int end2 = matcher.end();
                                    if (str != null) {
                                        substring = str.substring(end2);
                                        Intrinsics.checkNotNullExpressionValue(substring, "");
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                                    }
                                }
                                trim = StringsKt__StringsKt.trim(substring, '/');
                            }
                            createFailure = StringsKt__StringsKt.substringBefore$default(trim, '/', (String) null, 2, (Object) null);
                            if (createFailure != null) {
                            }
                        }
                        throw new IllegalStateException(C0002O.m25086C("Failed to extract channel from url: ", str).toString());
                    }
                    Result.m30308constructorimpl(createFailure);
                } catch (Throwable th) {
                    createFailure = ResultKt.createFailure(th);
                    Result.m30308constructorimpl(createFailure);
                }
                if (Result.m30314isFailureimpl(createFailure)) {
                    createFailure = null;
                }
                String str2 = (String) createFailure;
                if (str2 == null) {
                    str2 = "";
                }
                if (!C99788PRu.LIZIZ.LIZ()) {
                    if (str2.length() == 0) {
                        String str3 = b_c_a.LIZ;
                        int lastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((CharSequence) str3, "pages", 0, false, 6, (Object) null);
                        if (lastIndexOf$default >= 0) {
                            new StringBuilder();
                            if (str3 != null) {
                                String substring2 = str3.substring(0, lastIndexOf$default);
                                Intrinsics.checkNotNullExpressionValue(substring2, "");
                                m25085C = C0002O.m25086C(substring2, "latch.init.js");
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                            }
                        } else {
                            int lastIndexOf$default2 = StringsKt__StringsKt.lastIndexOf$default((CharSequence) str3, "template.js", 0, false, 6, (Object) null) - 1;
                            if (str3 != null) {
                                String substring3 = str3.substring(0, lastIndexOf$default2);
                                Intrinsics.checkNotNullExpressionValue(substring3, "");
                                String str4 = (String) CollectionsKt___CollectionsKt.lastOrNull((List<? extends Object>) StringsKt__StringsKt.split$default((CharSequence) substring3, new String[]{"/"}, false, 0, 6, (Object) null));
                                if (str4 == null) {
                                    str4 = "";
                                }
                                String str5 = b_c_a.LIZ;
                                new StringBuilder();
                                m25085C = StringsKt__StringsJVMKt.replace$default(str5, C0002O.m25086C(str4, "/template.js"), "latch.init.js", false, 4, (Object) null);
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                            }
                        }
                    } else {
                        int lastIndexOf$default3 = StringsKt__StringsKt.lastIndexOf$default((CharSequence) b_c_a.LIZ, str2, 0, false, 6, (Object) null);
                        new StringBuilder();
                        String str6 = b_c_a.LIZ;
                        if (str6 != null) {
                            String substring4 = str6.substring(0, lastIndexOf$default3);
                            Intrinsics.checkNotNullExpressionValue(substring4, "");
                            m25085C = C0002O.m25085C(substring4, str2, "/latch.init.js");
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                    }
                    String body = LIZ().get(m25085C).execute().body();
                    Intrinsics.checkNotNullExpressionValue(body, "");
                    function1.invoke(body);
                    return;
                }
                PatchProxyResult proxy3 = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
                if (proxy3.isSupported) {
                    mo27335getValue = proxy3.result;
                } else {
                    mo27335getValue = this.LIZIZ.mo27335getValue();
                }
                InputStream LIZ3 = ((C2641a) mo27335getValue).LIZ("latch.init.js", str2);
                if (LIZ3 != null) {
                    bufferedReader = new BufferedReader(new InputStreamReader(LIZ3, Charsets.UTF_8), 8192);
                    try {
                        String readText = TextStreamsKt.readText(bufferedReader);
                        CloseableKt.closeFinally(bufferedReader, null);
                        function1.invoke(readText);
                    } finally {
                    }
                } else {
                    throw new IllegalArgumentException(C0002O.m25086C("Failed to load latch.init.js from channel: ", str2).toString());
                }
            }
        } else if (b_c_a instanceof PL1) {
            if (!PatchProxy.proxy(new Object[]{b_c_a, function1}, this, LIZ, false, 5).isSupported) {
                Uri parse = Uri.parse(b_c_a.LIZ);
                Intrinsics.checkNotNullExpressionValue(parse, "");
                String path = parse.getPath();
                if (path != null) {
                    if (StringsKt__StringsJVMKt.endsWith$default(path, "template.js", false, 2, null)) {
                        Uri.Builder buildUpon = parse.buildUpon();
                        new StringBuilder();
                        String substring5 = path.substring(0, path.length() - 11);
                        Intrinsics.checkNotNullExpressionValue(substring5, "");
                        String uri = buildUpon.path(C0002O.m25086C(substring5, "prefetch.js")).build().toString();
                        Intrinsics.checkNotNullExpressionValue(uri, "");
                        if (!C99788PRu.LIZIZ.LIZ()) {
                            String body2 = LIZ().get(uri).execute().body();
                            Intrinsics.checkNotNullExpressionValue(body2, "");
                            function1.invoke(body2);
                            return;
                        }
                        WebResourceResponse LIZ4 = PL3.LIZIZ.LIZ(uri);
                        if (LIZ4 != null && (data = LIZ4.getData()) != null) {
                            bufferedReader = new BufferedReader(new InputStreamReader(data, Charsets.UTF_8), 8192);
                            try {
                                String readText2 = TextStreamsKt.readText(bufferedReader);
                                CloseableKt.closeFinally(bufferedReader, null);
                                function1.invoke(readText2);
                            } finally {
                            }
                        } else {
                            throw new IllegalArgumentException(C0002O.m25086C("Failed to load prefetch.js from url: ", uri).toString());
                        }
                    } else {
                        throw new IllegalStateException(C0002O.m25086C("Unsupported page url: ", b_c_a.LIZ).toString());
                    }
                } else {
                    throw new IllegalStateException(C0002O.m25086C("No path in url: ", b_c_a.LIZ).toString());
                }
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
