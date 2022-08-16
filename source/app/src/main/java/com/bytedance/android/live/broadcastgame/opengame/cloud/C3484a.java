package com.bytedance.android.live.broadcastgame.opengame.cloud;

import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.android.live.broadcastgame.opengame.cloud.CloudResultType;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.Single;
import io.reactivex.schedulers.Schedulers;
import java.util.Arrays;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import p003X.C106862S5w;
import p003X.C3808416o;
import p003X.C87516Ke6;
import p003X.C87693Kgx;
import p003X.C87696Kh0;
import p003X.C87697Kh1;
import p003X.C87698Kh2;
import p003X.C87700Kh4;
import p003X.C87702Kh6;
import p003X.C87705Kh9;
import p003X.C87706KhA;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.cloud.a */
/* loaded from: classes5.dex */
public final class C3484a {
    public static ChangeQuickRedirect LIZ;
    public final String LIZJ;

    /* renamed from: LJ */
    public static final C87516Ke6 f26051LJ = new C87516Ke6((byte) 0);
    public static final C3484a LIZLLL = new C3484a("");
    public final ConcurrentLinkedQueue<AbstractC3485a> LIZIZ = new ConcurrentLinkedQueue<>();
    public final Lazy LJFF = LazyKt__LazyJVMKt.lazy(CloudExecutor$cloudNetworkExecutor$2.INSTANCE);

    /* renamed from: com.bytedance.android.live.broadcastgame.opengame.cloud.a$a */
    /* loaded from: classes5.dex */
    public interface AbstractC3485a {
        static {
            Covode.recordClassIndex(19978);
        }

        void LIZ();

        void LIZ(CloudResultType.ClientResultType clientResultType, String str);
    }

    public final C3486e LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (C3486e) (proxy.isSupported ? proxy.result : this.LJFF.mo27335getValue());
    }

    static {
        Covode.recordClassIndex(19977);
    }

    public C3484a(String str) {
        C106862S5w.LIZ(str);
        this.LIZJ = str;
    }

    public final void LIZIZ(AbstractC3485a abstractC3485a) {
        if (PatchProxy.proxy(new Object[]{abstractC3485a}, this, LIZ, false, 8).isSupported) {
            return;
        }
        if (abstractC3485a != null) {
            abstractC3485a.LIZ();
            return;
        }
        for (AbstractC3485a abstractC3485a2 : this.LIZIZ) {
            abstractC3485a2.LIZ();
        }
        this.LIZIZ.clear();
    }

    public final void LIZ(AbstractC3485a abstractC3485a) {
        if (PatchProxy.proxy(new Object[]{abstractC3485a}, this, LIZ, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC3485a);
        ALogger.m15797i("CloudExecutor_refreshSid", "refreshSid start");
        if (this.LIZIZ.isEmpty()) {
            this.LIZIZ.add(abstractC3485a);
            Intrinsics.checkNotNullExpressionValue(Single.just(this.LIZJ).subscribeOn(Schedulers.m138io()).map(new C87696Kh0(this)).subscribe(C3808416o.LIZ, new C87698Kh2(this)), "");
            return;
        }
        ALogger.m15797i("CloudExecutor_refreshSid", "refresh task already exist");
        this.LIZIZ.add(abstractC3485a);
    }

    public final void LIZ(CloudResultType.ClientResultType clientResultType, String str, AbstractC3485a abstractC3485a) {
        String str2;
        if (PatchProxy.proxy(new Object[]{clientResultType, str, abstractC3485a}, this, LIZ, false, 10).isSupported) {
            return;
        }
        if (abstractC3485a != null) {
            if (str == null) {
                str = clientResultType.errMsg;
            }
            abstractC3485a.LIZ(clientResultType, str);
            return;
        }
        for (AbstractC3485a abstractC3485a2 : this.LIZIZ) {
            if (str == null) {
                str2 = clientResultType.errMsg;
            } else {
                str2 = str;
            }
            abstractC3485a2.LIZ(clientResultType, str2);
        }
        this.LIZIZ.clear();
    }

    public final void LIZ(int i, String str, String str2, AbstractC3485a abstractC3485a, boolean z) {
        C87700Kh4 c87700Kh4;
        C87702Kh6 c87702Kh6;
        boolean z2;
        String str3;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, str2, abstractC3485a, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 6).isSupported) {
            return;
        }
        ALogger.m15797i("CloudExecutor_dealWithSidResponse", "statusCode:" + i + ", reason:" + str);
        if (i == 200) {
            C87705Kh9 c87705Kh9 = C87700Kh4.f8561LJ;
            JSONObject jSONObject = new JSONObject(str2);
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{jSONObject}, c87705Kh9, C87705Kh9.LIZ, false, 1);
            Long l = null;
            if (proxy.isSupported) {
                c87700Kh4 = (C87700Kh4) proxy.result;
            } else {
                C106862S5w.LIZ(jSONObject);
                int i2 = jSONObject.getInt("status_code");
                String optString = jSONObject.optString("status_message", null);
                Intrinsics.checkNotNullExpressionValue(optString, "");
                c87700Kh4 = new C87700Kh4(i2, optString);
                JSONObject optJSONObject = jSONObject.optJSONObject(C2521l.LJIIL);
                if (optJSONObject != null) {
                    PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{optJSONObject}, C87702Kh6.LIZLLL, C87706KhA.LIZ, false, 1);
                    if (proxy2.isSupported) {
                        c87702Kh6 = (C87702Kh6) proxy2.result;
                    } else {
                        C106862S5w.LIZ(optJSONObject);
                        c87702Kh6 = new C87702Kh6();
                        String optString2 = optJSONObject.optString("sid");
                        Intrinsics.checkNotNullExpressionValue(optString2, "");
                        if (!PatchProxy.proxy(new Object[]{optString2}, c87702Kh6, C87702Kh6.LIZ, false, 1).isSupported) {
                            C106862S5w.LIZ(optString2);
                            c87702Kh6.LIZIZ = optString2;
                        }
                        c87702Kh6.LIZJ = optJSONObject.optLong("expire_in");
                    }
                    c87700Kh4.LIZIZ = c87702Kh6;
                }
            }
            ALogger.m15797i("CloudExecutor_dealWithSidResponse", "response: " + c87700Kh4);
            if (c87700Kh4.LIZJ == CloudResultType.OpenPlatformServerResultType.Success.errNo) {
                C87697Kh1 c87697Kh1 = C87697Kh1.LIZIZ;
                String str4 = this.LIZJ;
                C87702Kh6 c87702Kh62 = c87700Kh4.LIZIZ;
                if (c87702Kh62 != null) {
                    str3 = c87702Kh62.LIZIZ;
                } else {
                    str3 = null;
                }
                C87702Kh6 c87702Kh63 = c87700Kh4.LIZIZ;
                if (c87702Kh63 != null) {
                    l = Long.valueOf(c87702Kh63.LIZJ);
                }
                if (!PatchProxy.proxy(new Object[]{str4, str3, l}, c87697Kh1, C87697Kh1.LIZ, false, 2).isSupported) {
                    C106862S5w.LIZ(str4);
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("sid", str3);
                        jSONObject2.put("expiredTime", l);
                    } catch (JSONException e) {
                        ALogger.m15798e("CloudSPHelper_saveSid", e);
                    }
                    c87697Kh1.LIZ().LIZIZ(str4, jSONObject2.toString());
                    ALogger.m15801d("CloudSPHelper_saveSId", "appId:" + str4 + ", sid:" + str3 + ", expiredTime:" + l);
                }
                LIZIZ(abstractC3485a);
                return;
            }
            ALogger.m15797i("CloudExecutor_dealWithSidResponse", "server error: errNo = " + c87700Kh4.LIZJ + ", errMsg = " + c87700Kh4.LIZLLL);
            if (c87700Kh4.LIZJ == CloudResultType.OpenPlatformServerResultType.NotFaasFunction.errNo) {
                z2 = true;
                ALogger.m15797i("CloudExecutor_dealWithSidResponse", "not available faas function");
            } else {
                z2 = false;
            }
            if (z && !z2) {
                C87693Kgx.LIZIZ.LIZ(this, new CloudExecutor$dealWithSidResponse$1(this, abstractC3485a), new CloudExecutor$dealWithSidResponse$2(this, abstractC3485a));
                return;
            }
            CloudResultType.ClientResultType clientResultType = CloudResultType.ClientResultType.ServerError;
            String format = String.format(clientResultType.errMsg, Arrays.copyOf(new Object[]{c87700Kh4.LIZLLL, Integer.valueOf(c87700Kh4.LIZJ)}, 2));
            Intrinsics.checkNotNullExpressionValue(format, "");
            LIZ(clientResultType, format, abstractC3485a);
            return;
        }
        CloudResultType.ClientResultType clientResultType2 = CloudResultType.ClientResultType.NetworkUnavailable;
        String format2 = String.format(clientResultType2.errMsg, Arrays.copyOf(new Object[]{str, Integer.valueOf(i)}, 2));
        Intrinsics.checkNotNullExpressionValue(format2, "");
        LIZ(clientResultType2, format2, abstractC3485a);
    }

    public static /* synthetic */ void LIZ(C3484a c3484a, CloudResultType.ClientResultType clientResultType, String str, AbstractC3485a abstractC3485a, int i, Object obj) {
        if (PatchProxy.proxy(new Object[]{c3484a, clientResultType, str, null, Integer.valueOf(i), null}, null, LIZ, true, 11).isSupported) {
            return;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        c3484a.LIZ(clientResultType, str, null);
    }

    public static /* synthetic */ void LIZ(C3484a c3484a, int i, String str, String str2, AbstractC3485a abstractC3485a, boolean z, int i2, Object obj) {
        if (PatchProxy.proxy(new Object[]{c3484a, Integer.valueOf(i), str, str2, null, (byte) 0, 24, null}, null, LIZ, true, 7).isSupported) {
            return;
        }
        c3484a.LIZ(i, str, str2, null, true);
    }
}
