package com.bytedance.android.annie.service.latch;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.regex.Matcher;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C116971W2r;

/* loaded from: classes7.dex */
public final class LatchScriptContentLoader$extractChannel$1 extends Lambda implements Function1<String, Matcher> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ String $this_extractChannel;

    static {
        Covode.recordClassIndex(11089);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LatchScriptContentLoader$extractChannel$1(String str) {
        super(1);
        this.$this_extractChannel = str;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.regex.Matcher, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Matcher invoke(String str) {
        String str2 = str;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str2}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return C116971W2r.LIZJ(str2).matcher(this.$this_extractChannel);
    }
}
