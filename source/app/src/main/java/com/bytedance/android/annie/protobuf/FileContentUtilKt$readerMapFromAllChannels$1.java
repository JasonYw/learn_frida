package com.bytedance.android.annie.protobuf;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import p003X.C106862S5w;
import p003X.PLB;

/* loaded from: classes7.dex */
public final class FileContentUtilKt$readerMapFromAllChannels$1 extends Lambda implements Function1<String, Pair<? extends String, ? extends BufferedReader>> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PLB $loader;
    public final /* synthetic */ String $relativePath;

    static {
        Covode.recordClassIndex(10930);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileContentUtilKt$readerMapFromAllChannels$1(PLB plb, String str) {
        super(1);
        this.$loader = plb;
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
        C106862S5w.LIZ(str2);
        InputStream LIZ = this.$loader.LIZ(this.$relativePath, str2);
        if (LIZ != null) {
            return new Pair<>(str2, new BufferedReader(new InputStreamReader(LIZ, Charsets.UTF_8), 8192));
        }
        return null;
    }
}
