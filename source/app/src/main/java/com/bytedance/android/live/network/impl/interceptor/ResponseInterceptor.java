package com.bytedance.android.live.network.impl.interceptor;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alipay.sdk.p082m.p105l.C1315c;
import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.android.live.api.exceptions.local.EmptyResponseException;
import com.bytedance.android.live.api.exceptions.local.ResponseNoDataException;
import com.bytedance.android.live.base.model.Extra;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.network.response.AbstractC5174f;
import com.bytedance.android.live.network.response.C5169a;
import com.bytedance.android.live.network.response.C5171b;
import com.bytedance.android.live.network.response.C5175h;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.live.network.response.ExtraResponse;
import com.bytedance.android.live.network.response.RequestError;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.GsonProtectorUtils;
import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.client.Header;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.client.Response;
import com.bytedance.retrofit2.intercept.Interceptor;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.p1594ss.android.ugc.aweme.experiment.ReDexClinitStringAb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import p002O.C0002O;
import p003X.AbstractC100831PnN;
import p003X.AbstractC100832PnO;
import p003X.AbstractC100833PnP;
import p003X.C102564QaE;
import p003X.C116971W2r;
import p003X.C87007KQf;
import p003X.C87045KRr;
import p003X.C87053KRz;
import p003X.C88469KtT;
import p003X.C91211Lwb;
import p003X.C91246LxA;
import p003X.KM9;
import p003X.KS8;
import p003X.KSA;
import p003X.LK5;

/* loaded from: classes8.dex */
public class ResponseInterceptor implements Interceptor {
    public static ChangeQuickRedirect LIZ;
    public static final Pattern LIZJ;
    public static final Pattern LIZLLL;

    /* renamed from: LJ */
    public static ResponseInterceptor f26524LJ;
    public KS8 LIZIZ;
    public List<AbstractC5168e> LJFF = new ArrayList();

    public final void LIZ(String str, Object obj, String str2) {
        if (PatchProxy.proxy(new Object[]{str, obj, str2}, this, LIZ, false, 3).isSupported) {
            return;
        }
        if (obj instanceof AbstractC5174f) {
            AbstractC5174f abstractC5174f = (AbstractC5174f) obj;
            C88469KtT.LIZ(abstractC5174f.LIZ(), abstractC5174f.LIZIZ(), GsonProtectorUtils.toJson(KM9.LIZ(), abstractC5174f.LIZJ()), str2);
        } else if (obj instanceof ExtraResponse) {
            if (obj instanceof AbstractC100831PnN) {
                ((AbstractC100831PnN) obj).LIZ(str2);
            } else if (obj instanceof AbstractC100832PnO) {
                ((AbstractC100832PnO) obj).LIZ(str2);
            } else if (obj instanceof AbstractC100833PnP) {
                ((AbstractC100833PnP) obj).LIZ(str2);
            } else {
                throw new IllegalStateException(C0002O.m25086C("Unknown type of ExtraResponse: ", obj.getClass().getCanonicalName()));
            }
        } else if (obj instanceof C87007KQf) {
            C87007KQf c87007KQf = (C87007KQf) obj;
            c87007KQf.LIZ = str2;
            if (c87007KQf.LIZIZ == 0) {
                return;
            }
            if (c87007KQf.f8471LJ == null) {
                c87007KQf.f8471LJ = new RequestError();
            }
            c87007KQf.f8471LJ.url = str;
            c87007KQf.f8471LJ.message = ((Room) c87007KQf.LIZJ).message;
            c87007KQf.f8471LJ.prompts = ((Room) c87007KQf.LIZJ).prompts;
            LIZ(str, c87007KQf.LIZIZ, c87007KQf.f8471LJ);
            C88469KtT.LIZ(c87007KQf.LIZIZ, c87007KQf.f8471LJ, GsonProtectorUtils.toJson(KM9.LIZ(), c87007KQf.LIZLLL), str2);
        } else if (obj instanceof C5176i) {
            C5171b c5171b = (C5171b) obj;
            c5171b.f26526LJ = str2;
            LIZ(str, c5171b, c5171b.LIZIZ, c5171b.LJI);
            if (c5171b.LIZIZ == 0) {
                return;
            }
            if (c5171b.LJI == null) {
                c5171b.LJI = new RequestError();
            }
            c5171b.LJI.url = str;
            LIZ(str, c5171b.LIZIZ, c5171b.LJI);
            C88469KtT.LIZ(c5171b.LIZIZ, c5171b.LJI, c5171b.LIZLLL, str2);
        } else if (obj instanceof C5175h) {
            C5169a c5169a = (C5169a) obj;
            if (c5169a.LIZ == 0) {
                return;
            }
            if (c5169a.LIZLLL == null) {
                c5169a.LIZLLL = new RequestError();
            }
            c5169a.LIZLLL.url = str;
            LIZ(str, c5169a.LIZ, c5169a.LIZLLL);
            C88469KtT.LIZ(c5169a.LIZ, c5169a.LIZLLL, c5169a.LIZJ, str2);
        } else if (obj instanceof C5169a) {
            C5169a c5169a2 = (C5169a) obj;
            if (c5169a2.LIZ != 0) {
                if (c5169a2.LIZLLL == null) {
                    c5169a2.LIZLLL = new RequestError();
                }
                c5169a2.LIZLLL.url = str;
                LIZ(str, c5169a2.LIZ, c5169a2.LIZLLL);
                C88469KtT.LIZ(c5169a2.LIZ, c5169a2.LIZLLL, c5169a2.LIZJ, str2);
            } else if (c5169a2.LIZIZ == null) {
                throw new ResponseNoDataException();
            }
        } else if (obj instanceof C5171b) {
            C5171b c5171b2 = (C5171b) obj;
            c5171b2.f26526LJ = str2;
            LIZ(str, c5171b2, c5171b2.LIZIZ, c5171b2.LJI);
            if (c5171b2.LIZIZ != 0) {
                if (c5171b2.LJI == null) {
                    c5171b2.LJI = new RequestError();
                }
                c5171b2.LJI.url = str;
                LIZ(str, c5171b2.LIZIZ, c5171b2.LJI);
                C88469KtT.LIZ(c5171b2.LIZIZ, c5171b2.LJI, c5171b2.LIZLLL, str2);
            } else if (c5171b2.LIZJ == 0) {
                throw new ResponseNoDataException(c5171b2);
            }
        } else if (obj instanceof String) {
            String str3 = (String) obj;
            if (StringUtils.isEmpty(str3)) {
                throw new EmptyResponseException();
            }
            JSONObject jSONObject = new JSONObject(str3);
            if (!LIZ(jSONObject)) {
                int optInt = jSONObject.optInt("status_code");
                JSONObject optJSONObject = jSONObject.optJSONObject(C2521l.LJIIL);
                RequestError requestError = new RequestError();
                requestError.prompts = optJSONObject.optString("prompts", "");
                requestError.message = optJSONObject.optString("message", "");
                requestError.alert = optJSONObject.optString("alert", "");
                requestError.url = str;
                LIZ(str, optInt, requestError);
                C88469KtT.LIZ(optInt, requestError, jSONObject.optString("extra", ""), str2);
            } else if (!jSONObject.has(C2521l.LJIIL)) {
                throw new ResponseNoDataException();
            }
        } else if (obj != null || !LiveConfigSettingKeys.LIVE_ENTER_ROOM_EMPTY_BODY.getValue().booleanValue() || str == null || !str.contains("room/enter") || TextUtils.isEmpty(str2)) {
        } else {
            C88469KtT.LIZ(-10001, (RequestError) null, new Extra(), str2);
        }
    }

    public static boolean LIZ(JSONObject jSONObject) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{jSONObject}, null, LIZ, true, 5);
        return proxy.isSupported ? ((Boolean) proxy.result).booleanValue() : jSONObject.has("status_code") && jSONObject.optInt("status_code") == 0;
    }

    private void LIZ(JSONObject jSONObject, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{jSONObject, str, str2}, this, LIZ, false, 16).isSupported) {
            return;
        }
        try {
            jSONObject.put(str, str2);
        } catch (Exception unused) {
        }
    }

    private void LIZ(JSONObject jSONObject, String str, int i) {
        if (PatchProxy.proxy(new Object[]{jSONObject, str, Integer.valueOf(i)}, this, LIZ, false, 17).isSupported) {
            return;
        }
        try {
            jSONObject.put(str, i);
        } catch (Exception unused) {
        }
    }

    static {
        if (ReDexClinitStringAb.abTest >= 5) {
            clinit$r$fake();
            return;
        }
        Covode.recordClassIndex(32673);
        LIZJ = C116971W2r.LIZJ(".*/webcast/wallet_api/diamond_buy.*");
        LIZLLL = C116971W2r.LIZJ(".*/webcast/wallet/recharge/.*");
    }

    public ResponseInterceptor() {
        this.LJFF.add(C87045KRr.LIZIZ);
        this.LJFF.add(KSA.LIZJ);
    }

    private static void clinit$r$fake() {
        Covode.recordClassIndex(32673);
        LIZJ = C116971W2r.LIZJ(".*/webcast/wallet_api/diamond_buy.*");
        LIZLLL = C116971W2r.LIZJ(".*/webcast/wallet/recharge/.*");
    }

    public static ResponseInterceptor LIZ() {
        MethodCollector.m14708i(2146);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, LIZ, true, 1);
        if (proxy.isSupported) {
            ResponseInterceptor responseInterceptor = (ResponseInterceptor) proxy.result;
            MethodCollector.m14707o(2146);
            return responseInterceptor;
        }
        if (f26524LJ == null) {
            synchronized (ResponseInterceptor.class) {
                try {
                    if (f26524LJ == null) {
                        f26524LJ = new ResponseInterceptor();
                    }
                } catch (Throwable th) {
                    MethodCollector.m14707o(2146);
                    throw th;
                }
            }
        }
        ResponseInterceptor responseInterceptor2 = f26524LJ;
        MethodCollector.m14707o(2146);
        return responseInterceptor2;
    }

    private JSONObject LIZ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 18);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        try {
            return new JSONObject(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private SsResponse LIZ(Interceptor.Chain chain) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{chain}, this, LIZ, false, 11);
        if (proxy.isSupported) {
            return (SsResponse) proxy.result;
        }
        Request LIZ2 = LIZ(chain.request());
        SsResponse proceed = chain.proceed(LIZ2);
        LIZ(LIZ2, proceed);
        return proceed;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.bytedance.retrofit2.client.Request LIZ(com.bytedance.retrofit2.client.Request r6) {
        /*
            r5 = 1
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r4 = 0
            r2[r4] = r6
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.bytedance.android.live.network.impl.interceptor.ResponseInterceptor.LIZ
            r3 = 0
            r0 = 4
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r2, r3, r1, r5, r0)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L17
            java.lang.Object r0 = r1.result
            com.bytedance.retrofit2.client.Request r0 = (com.bytedance.retrofit2.client.Request) r0
            return r0
        L17:
            com.bytedance.android.live.core.setting.SettingKey<java.lang.Boolean> r0 = com.bytedance.android.live.network.NetworkSettingKeys.ENABLE_PB_REQUESTS
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L5e
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r2[r4] = r6
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = p003X.C102305QQp.LIZ
            r0 = 5
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r2, r3, r1, r5, r0)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L5f
            java.lang.Object r0 = r1.result
        L36:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
        L3c:
            if (r0 == 0) goto L5e
            java.util.LinkedList r3 = new java.util.LinkedList
            java.util.List r0 = r6.getHeaders()
            r3.<init>(r0)
            com.bytedance.retrofit2.client.Header r2 = new com.bytedance.retrofit2.client.Header
            java.lang.String r1 = "response-format"
            java.lang.String r0 = "protobuf"
            r2.<init>(r1, r0)
            r3.add(r2)
            com.bytedance.retrofit2.client.Request$Builder r0 = r6.newBuilder()
            r0.headers(r3)
            com.bytedance.retrofit2.client.Request r6 = r0.build()
        L5e:
            return r6
        L5f:
            X.QQo r3 = p003X.C102305QQp.f11079LJ
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r2[r4] = r6
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = p003X.C102304QQo.LIZ
            r0 = 3
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r2, r3, r1, r4, r0)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L73
            java.lang.Object r0 = r1.result
            goto L36
        L73:
            p003X.C106862S5w.LIZ(r6)
            java.util.Map<java.lang.String, java.lang.String> r1 = p003X.C102305QQp.LIZJ
            java.lang.String r0 = r3.LIZ(r6)
            java.lang.Object r2 = r1.remove(r0)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L5e
            org.json.JSONObject r1 = r3.LIZ()
            java.lang.String r0 = "_global_switch"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            boolean r0 = r1.optBoolean(r2, r0)
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.network.impl.interceptor.ResponseInterceptor.LIZ(com.bytedance.retrofit2.client.Request):com.bytedance.retrofit2.client.Request");
    }

    @Override // com.bytedance.retrofit2.intercept.Interceptor
    public SsResponse intercept(Interceptor.Chain chain) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{chain}, this, LIZ, false, 10);
        if (proxy.isSupported) {
            return (SsResponse) proxy.result;
        }
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{this, chain}, null, LIZ, true, 9);
        if (proxy2.isSupported) {
            return (SsResponse) proxy2.result;
        }
        if (chain.metrics() instanceof C102564QaE) {
            C102564QaE c102564QaE = (C102564QaE) chain.metrics();
            if (c102564QaE.f11152LJ > 0) {
                c102564QaE.requestInterceptDuration.put(c102564QaE.LJI, Long.valueOf(SystemClock.uptimeMillis() - c102564QaE.f11152LJ));
            }
            c102564QaE.LIZ(getClass().getSimpleName());
            c102564QaE.f11152LJ = SystemClock.uptimeMillis();
            SsResponse LIZ2 = LIZ(chain);
            if (c102564QaE.LJFF > 0) {
                c102564QaE.responseInterceptDuration.put(getClass().getSimpleName(), Long.valueOf(SystemClock.uptimeMillis() - c102564QaE.LJFF));
            }
            c102564QaE.LJFF = SystemClock.uptimeMillis();
            return LIZ2;
        }
        return LIZ(chain);
    }

    private void LIZ(Request request, SsResponse ssResponse) {
        Response raw;
        int status;
        int optInt;
        String str;
        if (PatchProxy.proxy(new Object[]{request, ssResponse}, this, LIZ, false, 2).isSupported) {
            return;
        }
        String str2 = "";
        if (!PatchProxy.proxy(new Object[]{request, ssResponse}, this, LIZ, false, 12).isSupported && ssResponse != null && request != null && (raw = ssResponse.raw()) != null && (status = raw.getStatus()) == 200) {
            Object body = ssResponse.body();
            String url = request.getUrl();
            String LIZ2 = LK5.LIZ(2131586438);
            if (body instanceof C87007KQf) {
                C87007KQf c87007KQf = (C87007KQf) body;
                optInt = c87007KQf.LIZIZ;
                if (c87007KQf.LIZJ instanceof Room) {
                    LIZ2 = ((Room) c87007KQf.LIZJ).message;
                }
            } else if (body instanceof Response) {
                optInt = ((Response) body).getStatus();
            } else if (body instanceof C5175h) {
                optInt = ((C5169a) body).LIZ;
            } else if (body instanceof C5169a) {
                optInt = ((C5169a) body).LIZ;
            } else if (body instanceof C5171b) {
                optInt = ((C5171b) body).LIZIZ;
            } else if (body instanceof String) {
                String str3 = (String) body;
                if (TextUtils.isEmpty(str3)) {
                    JSONObject LIZ3 = LIZ(str3);
                    PatchProxyResult proxy = PatchProxy.proxy(new Object[]{LIZ3, "status_code", 0}, this, LIZ, false, 14);
                    if (proxy.isSupported) {
                        optInt = ((Integer) proxy.result).intValue();
                    } else if (LIZ3 == null) {
                        optInt = 0;
                    } else {
                        optInt = LIZ3.optInt("status_code", 0);
                    }
                    PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{LIZ3, "message", str2}, this, LIZ, false, 15);
                    LIZ2 = proxy2.isSupported ? (String) proxy2.result : LIZ3 == null ? str2 : LIZ3.optString("message", str2);
                }
            }
            if (optInt != 0) {
                try {
                    Uri parse = Uri.parse(url);
                    if (C91246LxA.LIZ() != null && C91246LxA.LIZ().LIZ() != null) {
                        if (C91246LxA.LIZ().LIZ().contains(parse.getPath())) {
                        }
                    }
                } catch (Exception unused) {
                }
                List<Header> headers = raw.getHeaders();
                if (headers != null && !headers.isEmpty()) {
                    str = str2;
                    for (Header header : headers) {
                        if (header != null && "x-tt-Logid".equalsIgnoreCase(header.getName())) {
                            str = header.getValue();
                        }
                    }
                } else {
                    str = str2;
                }
                JSONObject jSONObject = new JSONObject();
                LIZ(jSONObject, "xLogId", str);
                LIZ(jSONObject, C2521l.LJIIJ, status);
                LIZ(jSONObject, "status_code", optInt);
                LIZ(jSONObject, PushConstants.WEB_URL, url);
                LIZ(jSONObject, "message", LIZ2);
                LIZ(jSONObject, "classes", "com.bytedance.android.livesdk.network.ResponseInterceptor");
                ALogger.m15801d("ttlive_net", LIZ("ttlive_net", jSONObject, (JSONObject) null));
                JSONObject jSONObject2 = new JSONObject();
                LIZ(jSONObject2, "xLogId", str);
                LIZ(jSONObject2, C2521l.LJIIJ, status);
                LIZ(jSONObject2, "status_code", optInt);
                try {
                    Uri parse2 = Uri.parse(url);
                    LIZ(jSONObject2, C1315c.f22208f, parse2.getHost());
                    LIZ(jSONObject2, "path", parse2.getPath());
                } catch (Exception unused2) {
                }
                LIZ(jSONObject2, "message", LIZ2);
                C91211Lwb.LIZIZ("ttlive_network_request_error", 1, jSONObject2);
            }
        }
        Object body2 = ssResponse.body();
        PatchProxyResult proxy3 = PatchProxy.proxy(new Object[]{ssResponse}, this, LIZ, false, 8);
        if (proxy3.isSupported) {
            str2 = (String) proxy3.result;
        } else {
            List<Header> headers2 = ssResponse.raw().headers("X-Tt-Logid");
            if (headers2 != null && headers2.size() > 0) {
                str2 = headers2.get(0).getValue();
            }
        }
        LIZ(request.getUrl(), body2, str2);
    }

    private String LIZ(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, jSONObject, null}, this, LIZ, false, 13);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("tag", str);
            jSONObject3.put(C2521l.LJIIL, jSONObject.toString());
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject3.toString();
    }

    private void LIZ(String str, int i, RequestError requestError) {
        if (PatchProxy.proxy(new Object[]{str, Integer.valueOf(i), requestError}, this, LIZ, false, 6).isSupported) {
            return;
        }
        if ((i == 42201 || i == 42202 || i == 42200) && !LIZJ.matcher(str).matches() && !LIZLLL.matcher(str).matches()) {
            if (LiveSettingKeys.LIVE_COMMON_MINOR_INTERCEPT.getValue().booleanValue()) {
                C87053KRz.LIZIZ.LIZ(i, "live_detail", requestError);
                return;
            }
            KS8 ks8 = this.LIZIZ;
            if (ks8 != null) {
                ks8.LIZ(i, "live_detail", requestError);
            }
        }
    }

    private void LIZ(String str, C5171b c5171b, int i, RequestError requestError) {
        if (PatchProxy.proxy(new Object[]{str, c5171b, Integer.valueOf(i), requestError}, this, LIZ, false, 7).isSupported) {
            return;
        }
        Iterator<AbstractC5168e> it = this.LJFF.iterator();
        while (it.hasNext() && !it.next().LIZ(str, i, c5171b, "live_detail", requestError)) {
        }
    }
}
