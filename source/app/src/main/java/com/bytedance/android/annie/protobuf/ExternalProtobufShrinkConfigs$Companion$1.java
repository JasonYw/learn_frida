package com.bytedance.android.annie.protobuf;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.BufferedReader;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes8.dex */
public final class ExternalProtobufShrinkConfigs$Companion$1 extends Lambda implements Function2<String, BufferedReader, C2624e> {
    public static final ExternalProtobufShrinkConfigs$Companion$1 INSTANCE = new ExternalProtobufShrinkConfigs$Companion$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(10921);
    }

    public ExternalProtobufShrinkConfigs$Companion$1() {
        super(2);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.bytedance.android.annie.protobuf.e, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ C2624e invoke(String str, BufferedReader bufferedReader) {
        String str2 = str;
        BufferedReader bufferedReader2 = bufferedReader;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str2, bufferedReader2}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C106862S5w.LIZ(str2, bufferedReader2);
        return new C2624e(str2, bufferedReader2, (byte) 0);
    }
}
