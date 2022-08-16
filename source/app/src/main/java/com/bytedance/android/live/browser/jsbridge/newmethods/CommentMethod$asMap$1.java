package com.bytedance.android.live.browser.jsbridge.newmethods;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class CommentMethod$asMap$1 extends Lambda implements Function1<String, Pair<? extends String, ? extends Object>> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ JSONObject $this_asMap;

    static {
        Covode.recordClassIndex(22584);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentMethod$asMap$1(JSONObject jSONObject) {
        super(1);
        this.$this_asMap = jSONObject;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Pair<? extends java.lang.String, ? extends java.lang.Object>] */
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Pair<? extends String, ? extends Object> invoke(String str) {
        String str2 = str;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str2}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        return TuplesKt.m137to(str2, this.$this_asMap.get(str2));
    }
}
