package com.bytedance.android.live.browser.jsbridge.prefetch;

import com.alipay.sdk.p082m.p113p.AbstractC1354e;
import com.bytedance.android.live.base.model.NameValuePair;
import com.bytedance.android.live.browser.jsbridge.protobuf.C4035b;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdkapi.model.C9646n;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.tools.prefetch.INetworkExecutor;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import java.util.Collection;
import java.util.LinkedList;
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
import p003X.C106862S5w;
import p003X.C88686Kwy;
import p003X.C88687Kwz;
import p003X.C88688Kx0;
import p003X.C88689Kx1;
import p003X.C88691Kx3;
import p003X.C88692Kx4;
import p003X.CallableC88684Kww;
import p003X.CallableC88685Kwx;

/* loaded from: classes5.dex */
public final class PrefetchNetworkExecutorImpl implements INetworkExecutor {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(22901);
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
                Covode.recordClassIndex(22903);
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
            Covode.recordClassIndex(22902);
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

    public final LinkedList<NameValuePair> LIZ(Map<String, String> map) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{map}, this, LIZ, false, 5);
        if (proxy.isSupported) {
            return (LinkedList) proxy.result;
        }
        LinkedList<NameValuePair> linkedList = new LinkedList<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            linkedList.add(new NameValuePair(entry.getKey(), entry.getValue()));
        }
        return linkedList;
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
                SettingKey<Boolean> settingKey = LiveConfigSettingKeys.ENABLE_PB_PREFETCH;
                Intrinsics.checkNotNullExpressionValue(settingKey, "");
                Boolean value = settingKey.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "");
                if (value.booleanValue()) {
                    return MapsKt__MapsKt.plus(map, TuplesKt.m137to("response-format", "protobuf"));
                }
                return map;
            }
            return map;
        }
        return map;
    }

    public final INetworkExecutor.HttpResponse LIZ(C9646n c9646n, String str, Map<String, String> map, C4035b c4035b) {
        String str2;
        INetworkExecutor.HttpResponse c88691Kx3;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c9646n, str, map, c4035b}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return (INetworkExecutor.HttpResponse) proxy.result;
        }
        List<NameValuePair> list = c9646n.LIZLLL;
        Intrinsics.checkNotNullExpressionValue(list, "");
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (NameValuePair nameValuePair : list) {
                Intrinsics.checkNotNullExpressionValue(nameValuePair, "");
                String str3 = nameValuePair.name;
                Intrinsics.checkNotNullExpressionValue(str3, "");
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue(locale, "");
                String lowerCase = str3.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                if (Intrinsics.areEqual(lowerCase, AbstractC1354e.f22314f)) {
                    String str4 = nameValuePair.value;
                    Intrinsics.checkNotNullExpressionValue(str4, "");
                    Locale locale2 = Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(locale2, "");
                    String lowerCase2 = str4.toLowerCase(locale2);
                    Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
                    if (Intrinsics.areEqual(lowerCase2, "application/x-protobuf")) {
                        String str5 = map.get("data_message_name");
                        if (str5 != null) {
                            String str6 = str5;
                            String str7 = map.get("extra_message_name");
                            SettingKey<Boolean> settingKey = LiveConfigSettingKeys.ENABLE_PB_PREFETCH_SHRINK;
                            Intrinsics.checkNotNullExpressionValue(settingKey, "");
                            Boolean value = settingKey.getValue();
                            Intrinsics.checkNotNullExpressionValue(value, "");
                            String str8 = null;
                            if (value.booleanValue()) {
                                str2 = map.get("data_shrink_config");
                            } else {
                                str2 = null;
                            }
                            SettingKey<Boolean> settingKey2 = LiveConfigSettingKeys.ENABLE_PB_PREFETCH_SHRINK;
                            Intrinsics.checkNotNullExpressionValue(settingKey2, "");
                            Boolean value2 = settingKey2.getValue();
                            Intrinsics.checkNotNullExpressionValue(value2, "");
                            if (value2.booleanValue()) {
                                str8 = map.get("extra_shrink_config");
                            }
                            if (c4035b != null) {
                                byte[] bArr = c9646n.LJFF;
                                Intrinsics.checkNotNullExpressionValue(bArr, "");
                                c88691Kx3 = new C88691Kx3(c4035b.LIZ(bArr, str6, str7, str2, str8));
                                c88691Kx3.setBody(c9646n.LJFF);
                                c88691Kx3.setStatusCode(c9646n.LIZJ);
                                return c88691Kx3;
                            }
                            throw new IllegalArgumentException("Decoder shouldn't be null".toString());
                        }
                        throw new IllegalArgumentException(C0002O.m25086C("[data_message_name] is required for pb prefetch. please complete prefetch config. url: ", str).toString());
                    }
                }
            }
        }
        byte[] bArr2 = c9646n.LJFF;
        Intrinsics.checkNotNullExpressionValue(bArr2, "");
        c88691Kx3 = new C88692Kx4(new JSONObject(new String(bArr2, Charsets.UTF_8)));
        c88691Kx3.setBody(c9646n.LJFF);
        c88691Kx3.setStatusCode(c9646n.LIZJ);
        return c88691Kx3;
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
        Observable subscribeOn = Observable.fromCallable(new CallableC88685Kwx(this, str, map, map3, C4035b.LIZLLL.LIZ(map3.get("channel")))).subscribeOn(Schedulers.m138io());
        SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_PREFETCH_AVOID_THREAD_SWITCHING;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (!value.booleanValue()) {
            subscribeOn = subscribeOn.observeOn(AndroidSchedulers.mainThread());
        }
        subscribeOn.subscribe(new C88686Kwy(callback), new C88688Kx0(callback));
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
        Observable subscribeOn = Observable.fromCallable(new CallableC88684Kww(this, str, map, map3, C4035b.LIZLLL.LIZ(map3.get("channel")), jSONObject)).subscribeOn(Schedulers.m138io());
        SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_PREFETCH_AVOID_THREAD_SWITCHING;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (!value.booleanValue()) {
            subscribeOn = subscribeOn.observeOn(AndroidSchedulers.mainThread());
        }
        subscribeOn.subscribe(new C88687Kwz(callback), new C88689Kx1(callback));
    }
}
