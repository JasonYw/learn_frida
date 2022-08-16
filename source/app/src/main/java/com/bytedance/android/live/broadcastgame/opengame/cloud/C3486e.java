package com.bytedance.android.live.broadcastgame.opengame.cloud;

import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.base.model.NameValuePair;
import com.bytedance.android.live.broadcastgame.opengame.cloud.CloudConstant;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livehostapi.foundation.IHostContext;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.ttnet.utils.RetrofitUtils;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p003X.C102311QQv;
import p003X.C106862S5w;
import p003X.C6LI;
import p003X.C87549Ked;
import p003X.C87692Kgw;
import p003X.C87707KhB;
import p003X.C87708KhC;
import p003X.C88112Kni;
import p003X.C88113Knj;
import p003X.QRZ;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.cloud.e */
/* loaded from: classes5.dex */
public final class C3486e {
    public static ChangeQuickRedirect LIZ;
    public final /* synthetic */ C87549Ked LIZLLL = new C87549Ked();
    public long LIZIZ = 60000;
    public final ConcurrentHashMap<String, ICloudNetworkApi> LIZJ = new ConcurrentHashMap<>();

    static {
        Covode.recordClassIndex(19992);
    }

    public final JSONObject LIZ(List<? extends NameValuePair> list) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 6);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        JSONObject jSONObject = new JSONObject();
        for (NameValuePair nameValuePair : list) {
            jSONObject.put(nameValuePair.name, nameValuePair.value);
        }
        return jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(String str, CloudConstant.Method method, String str2, Map<String, String> map, Map<String, String> map2, byte[] bArr, long j, boolean z, Function4<? super Integer, ? super String, ? super JSONObject, ? super String, Unit> function4, Function1<? super Throwable, Unit> function1) {
        TypedByteArray typedByteArray;
        boolean z2;
        int i;
        ICloudNetworkApi iCloudNetworkApi;
        int i2;
        Call doDelete;
        String str3 = str;
        if (PatchProxy.proxy(new Object[]{str3, method, str2, map, map2, bArr, new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0), function4, function1}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(str3, method, str2, map, map2, function4, function1);
        try {
            ALogger.m15797i("CloudNetworkExecutor_doRequest", "request start");
            C87708KhC c87708KhC = C87708KhC.LIZIZ;
            String host = new URL(str3).getHost();
            Intrinsics.checkNotNullExpressionValue(host, "");
            if (!c87708KhC.LIZIZ(host)) {
                IService service = ServiceManager.getService(IHostContext.class);
                Intrinsics.checkNotNullExpressionValue(service, "");
                if (((IHostContext) service).isBoe()) {
                    str3 = str3 + ".boe-gateway.byted.org";
                }
            }
            if (bArr != null) {
                String str4 = map.get("Content-Type");
                if (str4 == null) {
                    str4 = "application/json";
                }
                typedByteArray = new TypedByteArray(str4, bArr, new String[0]);
                i = 3;
                z2 = false;
            } else {
                z2 = false;
                typedByteArray = new TypedByteArray("", new byte[0], new String[0]);
                i = 3;
            }
            Object[] objArr = new Object[i];
            char c = z2 ? 1 : 0;
            char c2 = z2 ? 1 : 0;
            objArr[c] = str3;
            objArr[1] = str2;
            objArr[2] = Byte.valueOf((byte) z);
            PatchProxyResult proxy = PatchProxy.proxy(objArr, this, LIZ, z2, 5);
            if (proxy.isSupported) {
                iCloudNetworkApi = (ICloudNetworkApi) proxy.result;
            } else {
                iCloudNetworkApi = this.LIZJ.get(str3 + str2);
                if (iCloudNetworkApi == null) {
                    if (z == 0) {
                        iCloudNetworkApi = (ICloudNetworkApi) RetrofitUtils.getSsRetrofit(str3).create(ICloudNetworkApi.class);
                    } else {
                        iCloudNetworkApi = (ICloudNetworkApi) new C102311QQv().LIZ(str3).create(ICloudNetworkApi.class);
                    }
                    Intrinsics.checkNotNullExpressionValue(iCloudNetworkApi, "");
                    this.LIZJ.put(str3 + str2, iCloudNetworkApi);
                }
            }
            switch (C87692Kgw.LIZ[method.ordinal()]) {
                case 1:
                    i2 = 4;
                    PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{iCloudNetworkApi, Byte.valueOf((byte) z), 0, str2, map, map2, 2, null}, null, C6LI.LIZ, true, 1);
                    if (proxy2.isSupported) {
                        doDelete = (Call) proxy2.result;
                        break;
                    } else {
                        doDelete = iCloudNetworkApi.doGet(z, Integer.MAX_VALUE, str2, map, map2);
                        break;
                    }
                case 2:
                    i2 = 4;
                    PatchProxyResult proxy3 = PatchProxy.proxy(new Object[]{iCloudNetworkApi, Byte.valueOf((byte) z), 0, str2, map, map2, 2, null}, null, C6LI.LIZ, true, 2);
                    if (proxy3.isSupported) {
                        doDelete = (Call) proxy3.result;
                        break;
                    } else {
                        doDelete = iCloudNetworkApi.doHead(z, Integer.MAX_VALUE, str2, map, map2);
                        break;
                    }
                case 3:
                    i2 = 4;
                    PatchProxyResult proxy4 = PatchProxy.proxy(new Object[]{iCloudNetworkApi, Byte.valueOf((byte) z), 0, str2, map, map2, typedByteArray, 2, null}, null, C6LI.LIZ, true, 3);
                    if (proxy4.isSupported) {
                        doDelete = (Call) proxy4.result;
                        break;
                    } else {
                        doDelete = iCloudNetworkApi.doPost(z, Integer.MAX_VALUE, str2, map, map2, typedByteArray);
                        break;
                    }
                case 4:
                    i2 = 4;
                    PatchProxyResult proxy5 = PatchProxy.proxy(new Object[]{iCloudNetworkApi, Byte.valueOf((byte) z), 0, str2, map, map2, typedByteArray, 2, null}, null, C6LI.LIZ, true, 5);
                    if (proxy5.isSupported) {
                        doDelete = (Call) proxy5.result;
                        break;
                    } else {
                        doDelete = iCloudNetworkApi.doPut(z, Integer.MAX_VALUE, str2, map, map2, typedByteArray);
                        break;
                    }
                case 5:
                    i2 = 4;
                    PatchProxyResult proxy6 = PatchProxy.proxy(new Object[]{iCloudNetworkApi, Byte.valueOf((byte) z), 0, str2, map, map2, typedByteArray, 2, null}, null, C6LI.LIZ, true, 4);
                    if (proxy6.isSupported) {
                        doDelete = (Call) proxy6.result;
                        break;
                    } else {
                        doDelete = iCloudNetworkApi.doOptions(z, Integer.MAX_VALUE, str2, map, map2, typedByteArray);
                        break;
                    }
                case 6:
                    i2 = 4;
                    PatchProxyResult proxy7 = PatchProxy.proxy(new Object[]{iCloudNetworkApi, Byte.valueOf((byte) z), 0, str2, map, map2, typedByteArray, 2, null}, null, C6LI.LIZ, true, 6);
                    if (proxy7.isSupported) {
                        doDelete = (Call) proxy7.result;
                        break;
                    } else {
                        doDelete = iCloudNetworkApi.doDelete(z, Integer.MAX_VALUE, str2, map, map2, typedByteArray);
                        break;
                    }
                default:
                    throw new NoWhenBranchMatchedException();
            }
            StringBuilder sb = new StringBuilder("do request: url = ");
            Request request = doDelete.request();
            Intrinsics.checkNotNullExpressionValue(request, "");
            sb.append(request.getUrl());
            sb.append(", method = ");
            Request request2 = doDelete.request();
            Intrinsics.checkNotNullExpressionValue(request2, "");
            sb.append(request2.getMethod());
            sb.append(", headers = ");
            Request request3 = doDelete.request();
            Intrinsics.checkNotNullExpressionValue(request3, "");
            sb.append(request3.getHeaders());
            sb.append(", body = ");
            Request request4 = doDelete.request();
            Intrinsics.checkNotNullExpressionValue(request4, "");
            sb.append(request4.getRequestBody());
            ALogger.m15797i("CloudNetworkExecutor_doRequest", sb.toString());
            Object[] objArr2 = new Object[i2];
            objArr2[0] = doDelete;
            objArr2[1] = new Long(j);
            objArr2[2] = function4;
            objArr2[3] = function1;
            if (!PatchProxy.proxy(objArr2, this, LIZ, false, i2).isSupported) {
                QRZ qrz = new QRZ(doDelete);
                long j2 = 60000;
                if (j <= 60000) {
                    if (j > 0) {
                        j2 = j;
                    } else {
                        j2 = this.LIZIZ;
                    }
                }
                Disposable subscribe = Observable.create(new C88112Kni(qrz)).timeout(j2, TimeUnit.MILLISECONDS).subscribeOn(Schedulers.m138io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new C88113Knj(this, function4), new C87707KhB(function1));
                Intrinsics.checkNotNullExpressionValue(subscribe, "");
                if (!PatchProxy.proxy(new Object[]{subscribe}, this, LIZ, false, 9).isSupported) {
                    C106862S5w.LIZ(subscribe);
                    this.LIZLLL.LIZ(subscribe);
                }
            }
        } catch (Throwable th) {
            function1.invoke(th);
            ALogger.m15799e("CloudNetworkExecutor_doRequest", "onError", th);
        }
    }

    public static /* synthetic */ void LIZ(C3486e c3486e, String str, CloudConstant.Method method, String str2, Map map, Map map2, byte[] bArr, long j, boolean z, Function4 function4, Function1 function1, int i, Object obj) {
        if (PatchProxy.proxy(new Object[]{c3486e, str, method, str2, map, map2, null, 0L, (byte) 1, function4, function1, 32, null}, null, LIZ, true, 2).isSupported) {
            return;
        }
        c3486e.LIZ(str, method, str2, map, map2, null, 0L, true, function4, function1);
    }
}
