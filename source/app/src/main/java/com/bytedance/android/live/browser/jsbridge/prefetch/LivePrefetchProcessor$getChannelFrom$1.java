package com.bytedance.android.live.browser.jsbridge.prefetch;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class LivePrefetchProcessor$getChannelFrom$1 extends Lambda implements Function1<Pattern, Matcher> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ String $url;

    static {
        Covode.recordClassIndex(22893);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivePrefetchProcessor$getChannelFrom$1(String str) {
        super(1);
        this.$url = str;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.regex.Matcher, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Matcher invoke(Pattern pattern) {
        Pattern pattern2 = pattern;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{pattern2}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return pattern2.matcher(this.$url);
    }
}
