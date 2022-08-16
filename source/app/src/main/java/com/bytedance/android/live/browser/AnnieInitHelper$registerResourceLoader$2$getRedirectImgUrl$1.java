package com.bytedance.android.live.browser;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import p003X.C106862S5w;

/* loaded from: classes.dex */
public final class AnnieInitHelper$registerResourceLoader$2$getRedirectImgUrl$1 extends Lambda implements Function1<String, Pair<? extends String, ? extends Integer>> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ String $url;

    static {
        Covode.recordClassIndex(21863);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnnieInitHelper$registerResourceLoader$2$getRedirectImgUrl$1(String str) {
        super(1);
        this.$url = str;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Pair<? extends java.lang.String, ? extends java.lang.Integer>] */
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Pair<? extends String, ? extends Integer> invoke(String str) {
        String str2 = str;
        boolean z = true;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str2}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        C106862S5w.LIZ(str2);
        Integer valueOf = Integer.valueOf(StringsKt__StringsKt.indexOf$default((CharSequence) this.$url, str2, 0, false, 6, (Object) null));
        if (valueOf.intValue() < 0) {
            z = false;
        }
        if (!z || valueOf == null) {
            return null;
        }
        return new Pair<>(str2, Integer.valueOf(valueOf.intValue()));
    }
}
