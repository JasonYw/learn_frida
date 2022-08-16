package com.bytedance.android.annie.service.prefetch;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.regex.Matcher;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class AnniePrefetchProcessor$getChannelFrom$3 extends Lambda implements Function1<Matcher, Boolean> {
    public static final AnniePrefetchProcessor$getChannelFrom$3 INSTANCE = new AnniePrefetchProcessor$getChannelFrom$3();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(11151);
    }

    public AnniePrefetchProcessor$getChannelFrom$3() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Boolean invoke(Matcher matcher) {
        boolean find;
        Matcher matcher2 = matcher;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{matcher2}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            find = ((Boolean) proxy.result).booleanValue();
        } else {
            find = matcher2.find();
        }
        return Boolean.valueOf(find);
    }
}
