package com.bytedance.android.live.network.impl.utils;

import com.bytedance.android.live.network.gson.BaseListResponseTypeAdapter;
import com.bytedance.android.live.network.gson.BaseResponseTypeAdapter;
import com.bytedance.android.live.network.gson.EmptyResponseInstanceCreator;
import com.bytedance.android.live.network.gson.ExtraResponseInstanceCreator;
import com.bytedance.android.live.network.gson.ListResponseTypeAdapter;
import com.bytedance.android.live.network.gson.ResponseTypeAdapter;
import com.bytedance.android.live.network.gson.SimpleResponseInstanceCreator;
import com.bytedance.android.live.network.response.AbstractC5172c;
import com.bytedance.android.live.network.response.C5169a;
import com.bytedance.android.live.network.response.C5171b;
import com.bytedance.android.live.network.response.C5175h;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.live.network.response.ExtraResponse;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC100834PnQ;
import p003X.KM9;

/* loaded from: classes8.dex */
public final class NetworkGson$instance$2 extends Lambda implements Function0<Gson> {
    public static final NetworkGson$instance$2 INSTANCE = new NetworkGson$instance$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(32707);
    }

    public NetworkGson$instance$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [com.google.gson.Gson, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Gson mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        Gson LIZ = KM9.LIZ();
        GsonBuilder LIZLLL = KM9.LIZLLL();
        LIZLLL.registerTypeAdapter(C5171b.class, new BaseResponseTypeAdapter(LIZ));
        LIZLLL.registerTypeAdapter(C5176i.class, new ResponseTypeAdapter(LIZ));
        LIZLLL.registerTypeAdapter(C5169a.class, new BaseListResponseTypeAdapter(LIZ));
        LIZLLL.registerTypeAdapter(C5175h.class, new ListResponseTypeAdapter(LIZ));
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        LIZLLL.registerTypeAdapter(AbstractC100834PnQ.class, new SimpleResponseInstanceCreator(LIZ));
        LIZLLL.registerTypeAdapter(ExtraResponse.class, new ExtraResponseInstanceCreator(LIZ));
        LIZLLL.registerTypeAdapter(AbstractC5172c.class, new EmptyResponseInstanceCreator(LIZ));
        return LIZLLL.create();
    }
}
