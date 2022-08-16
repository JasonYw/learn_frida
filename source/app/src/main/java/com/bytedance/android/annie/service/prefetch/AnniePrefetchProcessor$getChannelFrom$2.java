package com.bytedance.android.annie.service.prefetch;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes7.dex */
public final class AnniePrefetchProcessor$getChannelFrom$2 extends Lambda implements Function1<Pattern, Matcher> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ String $url;

    static {
        Covode.recordClassIndex(11150);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnniePrefetchProcessor$getChannelFrom$2(String str) {
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
        C106862S5w.LIZ(pattern2);
        return pattern2.matcher(this.$url);
    }
}
