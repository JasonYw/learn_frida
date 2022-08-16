package com.baichuan.nb_trade.trade;

import android.app.Application;
import android.text.TextUtils;
import com.alibaba.alibclinkpartner.simple.AppLinkCenter;
import com.alibaba.fastjson.JSON;
import com.baichuan.nb_trade.core.AlibcTradeInitCallback;
import com.baichuan.nb_trade.core.GlobalStatusEnum;
import com.baichuan.nb_trade.model.ConfigDO;
import com.baichuan.nb_trade.p184a.C2444a;
import com.baichuan.nb_trade.p186c.C2450b;
import com.baichuan.nb_trade.utils.C2458b;
import com.baichuan.nb_trade.utils.C2459c;
import com.bytedance.covode.number.Covode;
import com.p3039ut.mini.UTAnalytics;
import com.p3039ut.mini.UTHitBuilders;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import p003X.C63331Ayz;
import p003X.V4I;
import p003X.V4J;
import p003X.V4K;
import p003X.V4L;
import p003X.V4M;
import p003X.V4O;
import p003X.V4P;
import p003X.V4S;
import p003X.V4T;

/* loaded from: classes13.dex */
public class AlibcMiniTradeSDK {
    public static V4S initResult;
    public static List<AlibcTradeInitCallback> pendingInitCallbacks = Collections.synchronizedList(new ArrayList());
    public static V4T initState = new V4T();

    static {
        Covode.recordClassIndex(9482);
    }

    /* renamed from: a */
    public static void m16009a(final AlibcTradeInitCallback alibcTradeInitCallback, final V4S v4s) {
        initState.LIZ = 3;
        V4L.LIZIZ = GlobalStatusEnum.INIT_SDK_FAIL.f25566a;
        C2459c.LIZ().LIZ(new Runnable() { // from class: com.baichuan.nb_trade.trade.AlibcMiniTradeSDK.4
            static {
                Covode.recordClassIndex(9486);
            }

            @Override // java.lang.Runnable
            public final void run() {
                V4S v4s2 = V4S.this;
                if (v4s2 == null) {
                    v4s2 = V4S.LIZ(0, "未知错误");
                }
                alibcTradeInitCallback.onFailure(v4s2.LIZ, v4s2.LIZIZ);
                for (AlibcTradeInitCallback alibcTradeInitCallback2 : AlibcMiniTradeSDK.pendingInitCallbacks) {
                    alibcTradeInitCallback2.onFailure(v4s2.LIZ, v4s2.LIZIZ);
                }
                AlibcMiniTradeSDK.pendingInitCallbacks.clear();
                AlibcMiniTradeSDK.m16005b(false, v4s2.LIZ);
            }
        });
    }

    /* renamed from: b */
    public static void m16006b(final AlibcTradeInitCallback alibcTradeInitCallback) {
        V4L.LIZIZ = GlobalStatusEnum.INIT_SDK_STATUS.f25566a;
        initState.LIZ = 2;
        C2459c.LIZ().LIZ(new Runnable() { // from class: com.baichuan.nb_trade.trade.AlibcMiniTradeSDK.3
            static {
                Covode.recordClassIndex(9485);
            }

            @Override // java.lang.Runnable
            public final void run() {
                AlibcTradeInitCallback.this.onSuccess();
                for (AlibcTradeInitCallback alibcTradeInitCallback2 : AlibcMiniTradeSDK.pendingInitCallbacks) {
                    alibcTradeInitCallback2.onSuccess();
                }
                AlibcMiniTradeSDK.pendingInitCallbacks.clear();
                AlibcMiniTradeSDK.m16005b(true, 0);
            }
        });
    }

    public static synchronized void asyncInit(final Application application, final AlibcTradeInitCallback alibcTradeInitCallback) {
        synchronized (AlibcMiniTradeSDK.class) {
            if (!m16010a(alibcTradeInitCallback)) {
                return;
            }
            initState.LIZ = 1;
            C2459c LIZ = C2459c.LIZ();
            LIZ.LIZ.post(new Runnable() { // from class: com.baichuan.nb_trade.trade.AlibcMiniTradeSDK.1
                static {
                    Covode.recordClassIndex(9483);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AlibcMiniTradeSDK.m16007b(application, alibcTradeInitCallback);
                }
            });
        }
    }

    /* renamed from: a */
    public static boolean m16010a(final AlibcTradeInitCallback alibcTradeInitCallback) {
        if (initState.LIZ == 1) {
            pendingInitCallbacks.add(alibcTradeInitCallback);
            return false;
        } else if (initState.LIZ != 2) {
            return true;
        } else {
            C2459c.LIZ().LIZ(new Runnable() { // from class: com.baichuan.nb_trade.trade.AlibcMiniTradeSDK.2
                static {
                    Covode.recordClassIndex(9484);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AlibcTradeInitCallback.this.onSuccess();
                }
            });
            return false;
        }
    }

    /* renamed from: b */
    public static void m16007b(Application application, AlibcTradeInitCallback alibcTradeInitCallback) {
        C2444a.C2445a c2445a;
        V4M v4m = new V4M();
        V4M LIZ = V4K.LIZ(application);
        if (!LIZ.LIZ) {
            v4m.LIZIZ = LIZ.LIZIZ;
            v4m.LIZJ = LIZ.LIZJ;
            initResult = V4S.LIZ(v4m.LIZIZ, v4m.LIZJ);
            m16009a(alibcTradeInitCallback, initResult);
            return;
        }
        V4I LIZ2 = V4I.LIZ();
        LIZ2.LIZ = new V4P(application, new V4J(LIZ2));
        try {
            C2458b.LIZ();
            if (((ConfigDO) C2458b.LIZ("lite_baichuan_config")) == null) {
                LIZ2.LIZIZ = (ConfigDO) JSON.parseObject("{\"sign\":\"89282992fbfc9e5b25bd8b48ea45d236\",\"sc\":\"{\\\"cc\\\":1,\\\"ml\\\":0}\",\"al\":1,\"u\":0,\"ul\":0}", ConfigDO.class);
                if (LIZ2.LIZIZ != null) {
                    C2458b.LIZ();
                    C2458b.LIZ("lite_baichuan_config", LIZ2.LIZIZ, true);
                }
            }
        } catch (Exception e) {
            new StringBuilder("初始化解析或写入文件异常：msg = ").append(e.getMessage());
        }
        if (LIZ2.LIZ != null) {
            V4P v4p = LIZ2.LIZ;
            if (!C63331Ayz.LIZ(v4p.LIZ)) {
                v4p.LIZIZ.LIZ("3000", "网络异常，请检查网络配置~");
            } else {
                C2459c.LIZ().LIZ(new V4O(v4p), 2000L);
            }
        }
        C2444a LIZ3 = C2444a.LIZ();
        if (LIZ3.LIZ) {
            c2445a = new C2444a.C2445a(LIZ3, 2);
        } else {
            AppLinkCenter.instance().init(V4K.f13706LJ, V4K.LIZ());
            LIZ3.LIZ = true;
            c2445a = new C2444a.C2445a(LIZ3, 0);
        }
        if (c2445a.LIZ == 0) {
            C2450b.LIZ().LIZIZ();
            v4m.LIZ = true;
            m16006b(alibcTradeInitCallback);
            return;
        }
        v4m.LIZIZ = 102;
        v4m.LIZJ = "Applink初始化失败";
        initResult = V4S.LIZ(v4m.LIZIZ, v4m.LIZJ);
        m16009a(alibcTradeInitCallback, initResult);
    }

    /* renamed from: b */
    public static void m16005b(boolean z, int i) {
        HashMap hashMap = new HashMap();
        String LIZ = V4K.LIZ();
        if (!TextUtils.isEmpty(LIZ)) {
            hashMap.put("appkey", LIZ);
        }
        hashMap.put("ttid", String.format("2014_%s_%s@baichuan_android_%s", V4K.LIZIZ, V4K.LIZ, V4K.LJFF));
        hashMap.put("sdkType", "lite");
        hashMap.put("isSuccess", z ? "1" : "0");
        hashMap.put("errorCode", String.valueOf(i));
        C2450b.LIZ().LIZ(V4L.LIZ, "", hashMap);
        C2450b LIZ2 = C2450b.LIZ();
        String str = V4K.LJFF;
        ConfigDO LIZIZ = V4I.LIZ().LIZIZ();
        if (LIZIZ == null) {
            C2458b.LIZ();
            LIZIZ = (ConfigDO) C2458b.LIZ("lite_baichuan_config");
            if (LIZIZ == null) {
                return;
            }
        }
        new StringBuilder("config ul: ").append(LIZIZ.f25573f);
        if (LIZIZ.f25573f <= 0 || !LIZ2.LIZ) {
            return;
        }
        UTHitBuilders.UTCustomHitBuilder uTCustomHitBuilder = new UTHitBuilders.UTCustomHitBuilder("80001");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("model", "lite_trade");
        hashMap2.put("version", str);
        uTCustomHitBuilder.setProperties(hashMap2);
        UTAnalytics.getInstance().getTracker("19").send(uTCustomHitBuilder.build());
    }
}
