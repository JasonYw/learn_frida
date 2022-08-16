package com.bytedance.android.live.browser.jsbridge.protobuf;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import p003X.C88347KrV;

/* loaded from: classes7.dex */
public final class FileContentUtilKt$readerMapFromAllChannels$1 extends Lambda implements Function1<String, Pair<? extends String, ? extends BufferedReader>> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ String $relativePath;

    static {
        Covode.recordClassIndex(22947);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileContentUtilKt$readerMapFromAllChannels$1(String str) {
        super(1);
        this.$relativePath = str;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Pair<? extends java.lang.String, ? extends java.io.BufferedReader>] */
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Pair<? extends String, ? extends BufferedReader> invoke(String str) {
        String str2 = str;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str2}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C88347KrV c88347KrV = C88347KrV.LIZIZ;
        String str3 = this.$relativePath;
        Intrinsics.checkNotNullExpressionValue(str2, "");
        InputStream LIZ = c88347KrV.LIZ(str3, str2);
        if (LIZ != null) {
            return new Pair<>(str2, new BufferedReader(new InputStreamReader(LIZ, Charsets.UTF_8), 8192));
        }
        return null;
    }
}
