package com.bytedance.android.live.broadcastgame.opengame.cloud;

import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.android.live.broadcastgame.opengame.cloud.CloudConstant;
import com.bytedance.android.live.broadcastgame.opengame.cloud.CloudResultType;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.utils.NetworkUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Arrays;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONObject;
import p003X.C106862S5w;
import p003X.C87683Kgn;
import p003X.C87699Kh3;
import p003X.C87701Kh5;
import p003X.C87703Kh7;
import p003X.C87704Kh8;
import p003X.C87708KhC;
import p003X.LK5;

/* loaded from: classes5.dex */
public final class CloudLoginService$login$1 extends Lambda implements Function4<Integer, String, JSONObject, String, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C3484a $cloudExecutor;
    public final /* synthetic */ Function2 $onFail;
    public final /* synthetic */ Function1 $onSuccess;

    static {
        Covode.recordClassIndex(19969);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloudLoginService$login$1(Function1 function1, C3484a c3484a, Function2 function2) {
        super(4);
        this.$onSuccess = function1;
        this.$cloudExecutor = c3484a;
        this.$onFail = function2;
    }

    @Override // kotlin.jvm.functions.Function4
    public final /* synthetic */ Unit invoke(Integer num, String str, JSONObject jSONObject, String str2) {
        boolean z;
        Object obj;
        C87699Kh3 c87699Kh3;
        C87701Kh5 c87701Kh5;
        int intValue = num.intValue();
        String str3 = str2;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(intValue), str, jSONObject, str3}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(str, jSONObject, str3);
            if (200 <= intValue && 300 > intValue) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C87703Kh7 c87703Kh7 = C87699Kh3.f8560LJ;
                JSONObject jSONObject2 = new JSONObject(str3);
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{jSONObject2}, c87703Kh7, C87703Kh7.LIZ, false, 1);
                if (proxy.isSupported) {
                    c87699Kh3 = (C87699Kh3) proxy.result;
                } else {
                    C106862S5w.LIZ(jSONObject2);
                    int i = jSONObject2.getInt("err_no");
                    JSONObject jSONObject3 = jSONObject2.getJSONObject(C2521l.LJIIL);
                    C87704Kh8 c87704Kh8 = C87701Kh5.LJI;
                    Intrinsics.checkNotNullExpressionValue(jSONObject3, "");
                    PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{jSONObject3}, c87704Kh8, C87704Kh8.LIZ, false, 1);
                    if (proxy2.isSupported) {
                        c87701Kh5 = (C87701Kh5) proxy2.result;
                    } else {
                        C106862S5w.LIZ(jSONObject3);
                        c87701Kh5 = new C87701Kh5(jSONObject3.getBoolean("isLogin"));
                        c87701Kh5.LIZIZ = jSONObject3.optString(C2521l.LJIIJ, null);
                        c87701Kh5.LIZJ = jSONObject3.optString("anonymousCode", null);
                        String optString = jSONObject3.optString("cloudCode");
                        Intrinsics.checkNotNullExpressionValue(optString, "");
                        if (!PatchProxy.proxy(new Object[]{optString}, c87701Kh5, C87701Kh5.LIZ, false, 1).isSupported) {
                            C106862S5w.LIZ(optString);
                            c87701Kh5.LIZLLL = optString;
                        }
                        String optString2 = jSONObject3.optString("cloudACode");
                        Intrinsics.checkNotNullExpressionValue(optString2, "");
                        if (!PatchProxy.proxy(new Object[]{optString2}, c87701Kh5, C87701Kh5.LIZ, false, 2).isSupported) {
                            C106862S5w.LIZ(optString2);
                            c87701Kh5.f8562LJ = optString2;
                        }
                    }
                    c87699Kh3 = new C87699Kh3(i, c87701Kh5);
                    c87699Kh3.LIZIZ = jSONObject2.optString("err_tips", null);
                }
                ALogger.m15801d("CLoudLoginService_login", "response: " + c87699Kh3);
                if (c87699Kh3.LIZJ == CloudResultType.OpenPlatformServerResultType.Success.errNo) {
                    ALogger.m15797i("CLoudLoginService_login", "login success");
                    Function1 function1 = this.$onSuccess;
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("loginCode", c87699Kh3.LIZLLL.LIZIZ);
                    jSONObject4.put("isLogin", c87699Kh3.LIZLLL.LJFF);
                    jSONObject4.put("anonymousCode", c87699Kh3.LIZLLL.LIZJ);
                    function1.invoke(jSONObject4);
                    PatchProxyResult proxy3 = PatchProxy.proxy(new Object[0], c87699Kh3, C87699Kh3.LIZ, false, 2);
                    if (!proxy3.isSupported ? (!StringsKt__StringsJVMKt.isBlank(c87699Kh3.LIZLLL.LIZLLL)) || (!StringsKt__StringsJVMKt.isBlank(c87699Kh3.LIZLLL.f8562LJ)) : ((Boolean) proxy3.result).booleanValue()) {
                        ALogger.m15797i("CLoudLoginService_login", "isCloudLogin");
                        C3484a c3484a = this.$cloudExecutor;
                        String str4 = c87699Kh3.LIZLLL.LIZLLL;
                        String str5 = c87699Kh3.LIZLLL.f8562LJ;
                        if (!PatchProxy.proxy(new Object[]{c3484a, str4, str5, null, 4, null}, null, C3484a.LIZ, true, 3).isSupported) {
                            C87683Kgn c87683Kgn = new C87683Kgn();
                            if (!PatchProxy.proxy(new Object[]{str4, str5, c87683Kgn}, c3484a, C3484a.LIZ, false, 2).isSupported) {
                                C106862S5w.LIZ(str4, str5, c87683Kgn);
                                C3486e.LIZ(c3484a.LIZ(), "https://dycloud.volces.com", CloudConstant.Method.GET, "/api/gateway/cloudcode2session/", MapsKt__MapsJVMKt.mapOf(TuplesKt.m137to("X-TT-APPID", c3484a.LIZJ)), MapsKt__MapsKt.mapOf(TuplesKt.m137to("cloud_code", str4), TuplesKt.m137to("cloud_acode", str5)), null, 0L, true, new CloudExecutor$cloudCodeToSession$2(c3484a, c87683Kgn), new CloudExecutor$cloudCodeToSession$3(c87683Kgn), 32, null);
                            }
                        }
                    }
                } else {
                    ALogger.m15797i("CLoudLoginService_login", "fail server error: errNo = " + c87699Kh3.LIZJ + ", errMsg = " + c87699Kh3.LIZIZ);
                    Function2 function2 = this.$onFail;
                    CloudResultType.ClientResultType clientResultType = CloudResultType.ClientResultType.ServerError;
                    String format = String.format(clientResultType.errMsg, Arrays.copyOf(new Object[]{c87699Kh3.LIZIZ, Integer.valueOf(c87699Kh3.LIZJ)}, 2));
                    Intrinsics.checkNotNullExpressionValue(format, "");
                    function2.invoke(clientResultType, format);
                }
            } else {
                String format2 = String.format(CloudResultType.ClientResultType.NetworkUnavailable.errMsg, Arrays.copyOf(new Object[]{str, Integer.valueOf(intValue)}, 2));
                Intrinsics.checkNotNullExpressionValue(format2, "");
                Function2 function22 = this.$onFail;
                PatchProxyResult proxy4 = PatchProxy.proxy(new Object[]{Integer.valueOf(intValue), null}, C87708KhC.LIZIZ, C87708KhC.LIZ, false, 3);
                if (proxy4.isSupported) {
                    obj = proxy4.result;
                } else if (intValue == -1 && NetworkUtils.LIZIZ(LK5.LJIIJ())) {
                    obj = CloudResultType.ClientResultType.NetworkUnavailable;
                } else {
                    ALogger.m15797i("CloudNetworkUtil_createNetworkError", "nativeNetworkError: " + ((Object) null));
                    obj = CloudResultType.ClientResultType.NetworkError;
                }
                function22.invoke(obj, format2);
                ALogger.m15801d("CLoudLoginService_login", "fail network err: statusCode = " + intValue + ", errMsg = " + format2);
            }
        }
        return Unit.INSTANCE;
    }
}
