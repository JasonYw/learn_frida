package com.baichuan.nb_trade.trade;

import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.wireless.security.open.SecException;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.alibaba.wireless.security.open.opensdk.IOpenSDKComponent;
import com.alipay.sdk.p082m.p105l.C1314b;
import com.baichuan.nb_trade.core.ErrorEnum;
import com.baichuan.nb_trade.core.GlobalStatusEnum;
import com.baichuan.nb_trade.model.ConfigDO;
import com.baichuan.nb_trade.p185b.C2446a;
import com.baichuan.nb_trade.p186c.C2450b;
import com.baichuan.nb_trade.utils.C2459c;
import com.baichuan.nb_trade.utils.net.HttpHelper;
import com.bytedance.covode.number.Covode;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.umeng.message.proguard.C34037f;
import com.xiaomi.mipush.sdk.Constants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p002O.C0002O;
import p003X.C63331Ayz;
import p003X.V4I;
import p003X.V4K;
import p003X.V4L;
import p003X.V4R;

/* loaded from: classes13.dex */
public class AlibcMiniTrade {
    static {
        Covode.recordClassIndex(9480);
    }

    /* renamed from: a */
    public static String m16017a(String str, Object obj) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }

    /* renamed from: a */
    public static Map<String, Object> m16015a(Map<String, Object> map, ConfigDO configDO) {
        if (map == null) {
            map = new HashMap<>();
        }
        map.put("linkcs", (configDO == null || 1 != configDO.f25570c) ? "" : m16013b(configDO));
        map.put(C1314b.f22207g, V4K.LIZJ());
        return map;
    }

    /* renamed from: a */
    public static boolean m16018a(ConfigDO configDO) {
        return configDO != null && configDO.f25574g == 0;
    }

    /* renamed from: a */
    public static boolean m16016a(String str, Map<String, Object> map, AlibcTradeCallback alibcTradeCallback) {
        int i;
        String str2;
        if (GlobalStatusEnum.INIT_SDK_FAIL.f25566a == V4L.LIZIZ) {
            i = 100;
            str2 = "SDK初始化失败，请检查SDK初始化流程~";
        } else if (!TextUtils.isEmpty(str)) {
            return true;
        } else {
            i = 1100;
            str2 = "传入的url为空";
        }
        alibcTradeCallback.onFailure(i, str2);
        return false;
    }

    /* renamed from: b */
    public static String m16013b(ConfigDO configDO) {
        IOpenSDKComponent openSDKComp;
        String str = "";
        try {
            openSDKComp = SecurityGuardManager.getInstance(V4K.f13706LJ).getOpenSDKComp();
        } catch (SecException e) {
            new StringBuilder("安全接口调用异常： errorCode = ").append(e.getErrorCode());
        } catch (Exception e2) {
            new StringBuilder("安全接口调用异常： msg = ").append(e2.getMessage());
        }
        if (configDO == null) {
            return str;
        }
        str = openSDKComp.getJumpEnv(V4K.LIZ(), null, "", configDO.f25571d, "");
        new StringBuilder("生成的加密串: ").append(str);
        return Uri.encode(str, C34037f.f43302f);
    }

    /* renamed from: b */
    public static void m16012b(Map<String, Object> map, boolean z, int i, String str, String str2) {
        new StringBuilder("唤端打点：openSuccess = ").append(z);
        HashMap hashMap = new HashMap(16);
        if (!TextUtils.isEmpty(V4K.LIZ())) {
            hashMap.put("appkey", V4K.LIZ());
        }
        if (map != null && map.size() > 0) {
            hashMap.put("param", m16017a("param", map));
        }
        hashMap.put("from", "lite_nbsdk");
        hashMap.put("isSuccess", z ? "1" : "0");
        if (TextUtils.isEmpty(str)) {
            ErrorEnum LIZ = ErrorEnum.LIZ(i);
            hashMap.put("errorCode", (z || LIZ == null) ? "" : LIZ.f25564b);
        } else {
            if (z) {
                str = "";
            }
            hashMap.put("errorCode", str);
        }
        C2450b.LIZ().LIZ(str2, "", hashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void openUrl(java.lang.String r5, java.util.Map<java.lang.String, java.lang.Object> r6, com.baichuan.nb_trade.trade.AlibcTradeCallback r7) {
        /*
            X.V4I r0 = p003X.V4I.LIZ()
            com.baichuan.nb_trade.model.ConfigDO r2 = r0.LIZIZ()
            boolean r0 = m16018a(r2)
            if (r0 == 0) goto L16
            r1 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r0 = r2.f25575h
            r7.onFailure(r1, r0)
            return
        L16:
            boolean r0 = m16016a(r5, r6, r7)
            if (r0 != 0) goto L1d
            return
        L1d:
            int r0 = r2.f25572e
            if (r0 != 0) goto L29
            r1 = 1200(0x4b0, float:1.682E-42)
            java.lang.String r0 = "不允许唤端"
            r7.onFailure(r1, r0)
            return
        L29:
            java.util.Map r4 = m16015a(r6, r2)
            com.alibaba.alibclinkpartner.simple.data.ALSLSimpleUri r2 = new com.alibaba.alibclinkpartner.simple.data.ALSLSimpleUri
            r2.<init>()
            java.lang.String r0 = "backUrl"
            java.lang.Object r0 = r4.get(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.backUrl = r0
            java.lang.String r0 = "degradeH5Url"
            java.lang.Object r0 = r4.get(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.degradeH5Url = r0
            java.lang.String r0 = "degradeType"
            java.lang.Object r0 = r4.get(r0)
            java.lang.String r3 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "h5"
            boolean r0 = r1.equals(r3)
            if (r0 == 0) goto L98
            com.alibaba.alibclinkpartner.simple.data.ALSLSimpleUri$ALSLdegradeType r0 = com.alibaba.alibclinkpartner.simple.data.ALSLSimpleUri.ALSLdegradeType.H5
        L5e:
            r2.degradeType = r0
        L60:
            r2.module = r1
            r2.extraParam = r4
            java.lang.String r0 = "com.taobao.taobao"
            r2.packageName = r0
            java.lang.String r0 = "com.taobao.open.intent.action.GETWAY"
            r2.action = r0
            r2.url = r5
            java.lang.String r0 = "bc_lite_android"
            r2.bcFlSrc = r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "open url: "
            r1.<init>(r0)
            java.lang.String r0 = r2.url
            r1.append(r0)
            com.alibaba.alibclinkpartner.simple.AppLinkCenter r1 = com.alibaba.alibclinkpartner.simple.AppLinkCenter.instance()
            android.app.Application r0 = p003X.V4K.f13706LJ
            int r3 = r1.openUrl(r0, r2)
            r0 = 1001(0x3e9, float:1.403E-42)
            java.lang.String r2 = ""
            if (r3 != r0) goto Lae
            r1 = 1
            java.lang.String r0 = p003X.V4R.LIZ
            m16012b(r6, r1, r3, r2, r0)
            r7.onSuccess(r2)
            return
        L98:
            java.lang.String r0 = "none"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto La3
            com.alibaba.alibclinkpartner.simple.data.ALSLSimpleUri$ALSLdegradeType r0 = com.alibaba.alibclinkpartner.simple.data.ALSLSimpleUri.ALSLdegradeType.NONE
            goto L5e
        La3:
            java.lang.String r0 = "download"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L60
            com.alibaba.alibclinkpartner.simple.data.ALSLSimpleUri$ALSLdegradeType r0 = com.alibaba.alibclinkpartner.simple.data.ALSLSimpleUri.ALSLdegradeType.Download
            goto L5e
        Lae:
            r1 = 0
            java.lang.String r0 = p003X.V4R.LIZ
            m16012b(r6, r1, r3, r2, r0)
            com.baichuan.nb_trade.core.ErrorEnum r0 = com.baichuan.nb_trade.core.ErrorEnum.LIZ(r3)
            if (r0 == 0) goto Lbc
            java.lang.String r2 = r0.f25564b
        Lbc:
            r7.onFailure(r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baichuan.nb_trade.trade.AlibcMiniTrade.openUrl(java.lang.String, java.util.Map, com.baichuan.nb_trade.trade.AlibcTradeCallback):void");
    }

    public static void convertUrl(final String str, final Map<String, Object> map, final AlibcTradeCallback alibcTradeCallback) {
        ConfigDO LIZIZ = V4I.LIZ().LIZIZ();
        if (m16018a(LIZIZ)) {
            alibcTradeCallback.onFailure(1000, LIZIZ.f25575h);
        } else if (!m16016a(str, map, alibcTradeCallback)) {
        } else {
            final C2446a c2446a = new C2446a(V4K.f13706LJ, new C2446a.AbstractC2448a() { // from class: com.baichuan.nb_trade.trade.AlibcMiniTrade.1
                static {
                    Covode.recordClassIndex(9481);
                }

                @Override // com.baichuan.nb_trade.p185b.C2446a.AbstractC2448a
                public final void LIZ(int i, String str2) {
                    AlibcMiniTrade.m16012b(map, true, i, str2, V4R.LIZIZ);
                    alibcTradeCallback.onFailure(i, str2);
                }

                @Override // com.baichuan.nb_trade.p185b.C2446a.AbstractC2448a
                public final void LIZ(String str2) {
                    AlibcMiniTrade.m16012b(map, true, 2400, "", V4R.LIZIZ);
                    alibcTradeCallback.onSuccess(str2);
                }
            });
            if (!C63331Ayz.LIZ(c2446a.LIZ)) {
                c2446a.LIZIZ.LIZ(Constants.ASSEMBLE_PUSH_RETRY_INTERVAL, "网络异常，请检查网络配置~");
            } else {
                C2459c.LIZ().LIZ(new Runnable() { // from class: com.baichuan.nb_trade.b.a.1
                    static {
                        Covode.recordClassIndex(9455);
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        com.alibaba.fastjson.JSONObject jSONObject;
                        String str2 = "";
                        try {
                            String str3 = str;
                            Map map2 = map;
                            HashMap hashMap = new HashMap(16);
                            hashMap.put("appkey", V4K.LIZ());
                            hashMap.put("adzoneid", String.valueOf(map2.get("adzoneid")));
                            hashMap.put("taokeAppkey", String.valueOf(map2.get("taokeAppkey")));
                            hashMap.put("deviceModel", V4K.LIZLLL());
                            hashMap.put("os", C0002O.m25086C("android", V4K.m22557LJ()));
                            hashMap.put("pcv", "1.0");
                            hashMap.put("sdkVersion", str2);
                            hashMap.put("mcid", str2);
                            hashMap.put("unid", String.valueOf(map2.get("unionId")));
                            String valueOf = String.valueOf(map2.get("sellerId"));
                            if (str3.contains("shop_id")) {
                                str3 = str3.replaceFirst("shop_id=\\d+", C0002O.m25086C("user_id=", valueOf));
                            }
                            hashMap.put(PushConstants.WEB_URL, str3);
                            com.alibaba.fastjson.JSONObject jSONObject2 = (com.alibaba.fastjson.JSONObject) JSON.parse(HttpHelper.LIZ("https://tunion-api.m.taobao.com/newconvert", hashMap));
                            if (jSONObject2 != null && (jSONObject = (com.alibaba.fastjson.JSONObject) jSONObject2.get("convert")) != null) {
                                str2 = String.valueOf(jSONObject.get(PushConstants.WEB_URL));
                            }
                            c2446a.LIZIZ.LIZ(str2);
                        } catch (Exception e) {
                            if (!(e instanceof HttpHelper.HttpHelperException)) {
                                return;
                            }
                            HttpHelper.HttpHelperException httpHelperException = (HttpHelper.HttpHelperException) e;
                            c2446a.LIZIZ.LIZ(httpHelperException.statusCode == -999 ? -1 : httpHelperException.statusCode, e.getMessage());
                        }
                    }
                }, 2000L);
            }
        }
    }
}
