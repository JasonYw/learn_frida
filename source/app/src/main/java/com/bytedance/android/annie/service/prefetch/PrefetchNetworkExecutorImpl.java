package com.bytedance.android.annie.service.prefetch;

import android.util.Pair;
import com.alipay.sdk.p082m.p113p.AbstractC1354e;
import com.bytedance.android.annie.service.network.AnnieResponse;
import com.bytedance.android.annie.service.p218j.AbstractC2631b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.tools.prefetch.INetworkExecutor;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONObject;
import p002O.C0002O;
import p003X.AbstractC88640KwE;
import p003X.AbstractC90724Lok;
import p003X.C106862S5w;
import p003X.C88696Kx8;
import p003X.C88697Kx9;
import p003X.C88698KxA;
import p003X.C88699KxB;
import p003X.C88700KxC;
import p003X.C88701KxD;
import p003X.C90746Lp6;
import p003X.C99782PRo;
import p003X.CallableC88693Kx5;
import p003X.CallableC88694Kx6;

/* loaded from: classes5.dex */
public final class PrefetchNetworkExecutorImpl implements INetworkExecutor {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(11159);
    }

    /* loaded from: classes5.dex */
    public static abstract class MultiFormatResponse extends INetworkExecutor.HttpResponse {
        public static ChangeQuickRedirect LIZ;
        public final JSONObject LIZIZ;
        public final Lazy LIZJ;

        /* loaded from: classes5.dex */
        public enum Format {
            JSON,
            Protobuf;
            
            public static ChangeQuickRedirect changeQuickRedirect;

            static {
                Covode.recordClassIndex(11161);
            }

            public static Format valueOf(String str) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
                return (Format) (proxy.isSupported ? proxy.result : Enum.valueOf(Format.class, str));
            }

            /* renamed from: values  reason: to resolve conflict with enum method */
            public static Format[] valuesCustom() {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
                return (Format[]) (proxy.isSupported ? proxy.result : values().clone());
            }
        }

        static {
            Covode.recordClassIndex(11160);
        }

        public abstract Format LIZ();

        public final JSONObject LIZIZ() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
            return (JSONObject) (proxy.isSupported ? proxy.result : this.LIZJ.mo27335getValue());
        }

        public String toString() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
            if (proxy.isSupported) {
                return (String) proxy.result;
            }
            return "PrefetchResponse: { format: " + LIZ() + ", status_code: " + getStatusCode() + ", data: " + this.LIZIZ + ", cached: " + getCached() + " }";
        }

        public MultiFormatResponse(JSONObject jSONObject) {
            this.LIZIZ = jSONObject;
            this.LIZJ = LazyKt__LazyJVMKt.lazy(new PrefetchNetworkExecutorImpl$MultiFormatResponse$decoded$2(this));
        }

        public /* synthetic */ MultiFormatResponse(JSONObject jSONObject, byte b) {
            this(jSONObject);
        }
    }

    public final List<Pair<String, String>> LIZ(Map<String, String> map) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{map}, this, LIZ, false, 5);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(new Pair(entry.getKey(), entry.getValue()));
        }
        return arrayList;
    }

    @Override // com.bytedance.ies.tools.prefetch.INetworkExecutor
    @Deprecated(message = "Please implement the other 'get' method.")
    public final void get(String str, Map<String, String> map, INetworkExecutor.Callback callback) {
        C106862S5w.LIZ(str, map, callback);
        INetworkExecutor.DefaultImpls.get(this, str, map, callback);
    }

    public final Map<String, String> LIZ(Map<String, String> map, Map<String, String> map2, boolean z) {
        String str;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{map, map2, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        if (!z) {
            if (map2 != null) {
                str = map2.get("response-format");
            } else {
                str = null;
            }
            if (Intrinsics.areEqual(str, "protobuf")) {
                C90746Lp6<Boolean> c90746Lp6 = AbstractC90724Lok.LJIILLIIL;
                Intrinsics.checkNotNullExpressionValue(c90746Lp6, "");
                Boolean LIZ2 = c90746Lp6.LIZ();
                Intrinsics.checkNotNullExpressionValue(LIZ2, "");
                if (LIZ2.booleanValue()) {
                    return MapsKt__MapsKt.plus(map, TuplesKt.m137to("response-format", "protobuf"));
                }
                return map;
            }
            return map;
        }
        return map;
    }

    public final INetworkExecutor.HttpResponse LIZ(AnnieResponse annieResponse, String str, Map<String, String> map, AbstractC2631b abstractC2631b) {
        String str2;
        INetworkExecutor.HttpResponse c88701KxD;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{annieResponse, str, map, abstractC2631b}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return (INetworkExecutor.HttpResponse) proxy.result;
        }
        List<Pair<String, String>> headers = annieResponse.getHeaders();
        Intrinsics.checkNotNullExpressionValue(headers, "");
        if (!(headers instanceof Collection) || !headers.isEmpty()) {
            Iterator<T> it = headers.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                Object obj = pair.first;
                Intrinsics.checkNotNullExpressionValue(obj, "");
                String str3 = (String) obj;
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "");
                if (str3 != null) {
                    String lowerCase = str3.toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                    if (Intrinsics.areEqual(lowerCase, AbstractC1354e.f22314f)) {
                        Object obj2 = pair.second;
                        Intrinsics.checkNotNullExpressionValue(obj2, "");
                        String str4 = (String) obj2;
                        Locale locale2 = Locale.getDefault();
                        Intrinsics.checkNotNullExpressionValue(locale2, "");
                        if (str4 != null) {
                            String lowerCase2 = str4.toLowerCase(locale2);
                            Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
                            if (Intrinsics.areEqual(lowerCase2, "application/x-protobuf")) {
                                String str5 = map.get("data_message_name");
                                if (str5 != null) {
                                    String str6 = str5;
                                    String str7 = map.get("extra_message_name");
                                    C90746Lp6<Boolean> c90746Lp6 = AbstractC90724Lok.LJIIZILJ;
                                    Intrinsics.checkNotNullExpressionValue(c90746Lp6, "");
                                    Boolean LIZ2 = c90746Lp6.LIZ();
                                    Intrinsics.checkNotNullExpressionValue(LIZ2, "");
                                    String str8 = null;
                                    if (LIZ2.booleanValue()) {
                                        str2 = map.get("data_shrink_config");
                                    } else {
                                        str2 = null;
                                    }
                                    C90746Lp6<Boolean> c90746Lp62 = AbstractC90724Lok.LJIIZILJ;
                                    Intrinsics.checkNotNullExpressionValue(c90746Lp62, "");
                                    Boolean LIZ3 = c90746Lp62.LIZ();
                                    Intrinsics.checkNotNullExpressionValue(LIZ3, "");
                                    if (LIZ3.booleanValue()) {
                                        str8 = map.get("extra_shrink_config");
                                    }
                                    if (abstractC2631b != null) {
                                        byte[] body = annieResponse.getBody();
                                        Intrinsics.checkNotNullExpressionValue(body, "");
                                        c88701KxD = new C88701KxD(abstractC2631b.LIZ(body, str6, str7, str2, str8));
                                        c88701KxD.setBody(annieResponse.getBody());
                                        c88701KxD.setStatusCode(annieResponse.getStatusCode());
                                        return c88701KxD;
                                    }
                                    throw new IllegalArgumentException("Decoder shouldn't be null".toString());
                                }
                                throw new IllegalArgumentException(C0002O.m25086C("[data_message_name] is required for pb prefetch. please complete prefetch config. url: ", str).toString());
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        }
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
            }
        }
        byte[] body2 = annieResponse.getBody();
        Intrinsics.checkNotNullExpressionValue(body2, "");
        c88701KxD = new C88700KxC(new JSONObject(new String(body2, Charsets.UTF_8)));
        c88701KxD.setBody(annieResponse.getBody());
        c88701KxD.setStatusCode(annieResponse.getStatusCode());
        return c88701KxD;
    }

    @Override // com.bytedance.ies.tools.prefetch.INetworkExecutor
    @Deprecated(message = "Please implement the other 'post' method.")
    public final void post(String str, Map<String, String> map, String str2, JSONObject jSONObject, INetworkExecutor.Callback callback) {
        C106862S5w.LIZ(str, map, str2, jSONObject, callback);
        INetworkExecutor.DefaultImpls.post(this, str, map, str2, jSONObject, callback);
    }

    @Override // com.bytedance.ies.tools.prefetch.INetworkExecutor
    public final void get(String str, Map<String, String> map, boolean z, Map<String, String> map2, INetworkExecutor.Callback callback) {
        Map<String, String> map3 = map2;
        if (PatchProxy.proxy(new Object[]{str, map, Byte.valueOf(z ? (byte) 1 : (byte) 0), map3, callback}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, map, callback);
        if (map3 == null) {
            map3 = MapsKt__MapsKt.emptyMap();
        }
        Observable.fromCallable(new CallableC88694Kx6(this, str, map, map3, ((AbstractC88640KwE) C99782PRo.LIZIZ.LIZ(AbstractC88640KwE.class)).LIZ(map3.get("channel")))).subscribeOn(Schedulers.m138io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new C88696Kx8(callback), new C88697Kx9(callback));
    }

    @Override // com.bytedance.ies.tools.prefetch.INetworkExecutor
    public final void post(String str, Map<String, String> map, String str2, JSONObject jSONObject, boolean z, Map<String, String> map2, INetworkExecutor.Callback callback) {
        Map<String, String> map3 = map2;
        if (PatchProxy.proxy(new Object[]{str, map, str2, jSONObject, Byte.valueOf(z ? (byte) 1 : (byte) 0), map3, callback}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, map, str2, jSONObject, callback);
        if (map3 == null) {
            map3 = MapsKt__MapsKt.emptyMap();
        }
        Observable.fromCallable(new CallableC88693Kx5(this, str, map, map3, ((AbstractC88640KwE) C99782PRo.LIZIZ.LIZ(AbstractC88640KwE.class)).LIZ(map3.get("channel")), jSONObject)).subscribeOn(Schedulers.m138io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new C88698KxA(callback), new C88699KxB(callback));
    }
}
