package com.bytedance.android.live.impl;

import androidx.lifecycle.LiveData;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.monitor.LiveTracingMonitor;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.impl.processor.AbstractC4251a;
import com.bytedance.android.live.impl.strategy.C4252a;
import com.bytedance.android.live.impl.strategy.StrategyPlatformApi;
import com.bytedance.android.live.strategy.api.AbstractC5732d;
import com.bytedance.android.live.strategy.api.IStrategyService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p003X.AbstractC99972PYw;
import p003X.C100298Pem;
import p003X.C106862S5w;
import p003X.C127309a3T;
import p003X.C147430fIu;
import p003X.C147431fIv;
import p003X.C147432fIw;
import p003X.C147433fIx;
import p003X.C147434fIy;
import p003X.C147435fIz;
import p003X.C147436fJ0;
import p003X.C147437fJ1;
import p003X.C1D9;
import p003X.C88306Kqq;
import p003X.PWW;

/* loaded from: classes20.dex */
public class StrategyService implements IStrategyService {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(24988);
    }

    public StrategyService() {
        ServiceManager.registerService(IStrategyService.class, this);
    }

    @Override // com.bytedance.android.live.strategy.api.IStrategyService
    public void releaseCache() {
        Map<String, Object> map;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4).isSupported) {
            return;
        }
        if (!PatchProxy.proxy(new Object[0], C147430fIu.LJI, C147430fIu.LIZ, false, 10).isSupported && (map = C147430fIu.f19679LJ) != null) {
            map.clear();
        }
    }

    @Override // com.bytedance.android.live.strategy.api.IStrategyService
    public void init() {
        Boolean bool;
        String str = "";
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C147430fIu c147430fIu = C147430fIu.LJI;
        if (!PatchProxy.proxy(new Object[0], c147430fIu, C147430fIu.LIZ, false, 1).isSupported && !C147430fIu.LJFF) {
            if (!PatchProxy.proxy(new Object[0], c147430fIu, C147430fIu.LIZ, false, 2).isSupported) {
                C147437fJ1 c147437fJ1 = new C147437fJ1();
                if (!PatchProxy.proxy(new Object[]{"degrade_level", c147437fJ1}, c147430fIu, C147430fIu.LIZ, false, 3).isSupported && !C147430fIu.LIZJ.containsKey("degrade_level")) {
                    C147430fIu.LIZJ.put("degrade_level", c147437fJ1);
                }
            }
            try {
                C147435fIz c147435fIz = C147435fIz.LIZIZ;
                StrategyManager$init$1 strategyManager$init$1 = new StrategyManager$init$1(c147430fIu);
                if (!PatchProxy.proxy(new Object[]{strategyManager$init$1}, c147435fIz, C147435fIz.LIZ, false, 1).isSupported) {
                    C106862S5w.LIZ(strategyManager$init$1);
                    SettingKey<Boolean> settingKey = LiveSettingKeys.LIVE_STRATEGY_PLATFROM_SETTING_ENABLE;
                    if (settingKey != null) {
                        bool = settingKey.getValue();
                    } else {
                        bool = null;
                    }
                    if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                        ((StrategyPlatformApi) C88306Kqq.LIZ().LIZ(StrategyPlatformApi.class)).fetchStrategySource().retry(3L).subscribeOn(Schedulers.m138io()).observeOn(Schedulers.m138io()).subscribe(new C147432fIw(strategyManager$init$1), new C147433fIx(strategyManager$init$1));
                        return;
                    }
                    Gson gson = new Gson();
                    SettingKey<String> settingKey2 = LiveSettingKeys.STRATEGY_INFO_DATA;
                    Intrinsics.checkNotNullExpressionValue(settingKey2, str);
                    String value = settingKey2.getValue();
                    if (value == null) {
                        value = str;
                    }
                    Object fromJson = GsonProtectorUtils.fromJson(gson, value, (Class<Object>) C4252a.class);
                    Intrinsics.checkNotNullExpressionValue(fromJson, str);
                    strategyManager$init$1.invoke(fromJson);
                }
            } catch (Exception e) {
                ALogger.m15797i("strategy_tag", e.getMessage());
                C147430fIu.LJFF = false;
                C147431fIv c147431fIv = C147431fIv.LIZJ;
                String message = e.getMessage();
                if (message != null) {
                    str = message;
                }
                if (!PatchProxy.proxy(new Object[]{str}, c147431fIv, C147431fIv.LIZ, false, 2).isSupported) {
                    C106862S5w.LIZ(str);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("init_result", -1);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("error_msg", str);
                    jSONObject2.put("error_id", 1004);
                    LiveTracingMonitor.LIZ("ttlive_strategy_init", LiveTracingMonitor.EventModule.STRATEGY, jSONObject, new JSONObject(), jSONObject2);
                }
            }
        }
    }

    @Override // com.bytedance.android.live.strategy.api.IStrategyService
    public boolean addOperator(AbstractC5732d abstractC5732d) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC5732d}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        C106862S5w.LIZ(abstractC5732d);
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{abstractC5732d}, C147430fIu.LJI, C147430fIu.LIZ, false, 9);
        if (proxy2.isSupported) {
            return ((Boolean) proxy2.result).booleanValue();
        }
        C106862S5w.LIZ(abstractC5732d);
        if (!C147430fIu.LJFF) {
            return false;
        }
        C147436fJ0 c147436fJ0 = C147430fIu.LIZLLL;
        if (c147436fJ0 != null) {
            c147436fJ0.LIZ(abstractC5732d);
        }
        Map<String, AbstractC4251a> map = C147430fIu.LIZJ;
        if (map != null) {
            for (Map.Entry<String, AbstractC4251a> entry : map.entrySet()) {
                entry.getValue().LIZ(abstractC5732d);
            }
        }
        return true;
    }

    @Override // com.bytedance.android.live.strategy.api.IStrategyService
    public <T> LiveData<T> getFactor(String str, T t) {
        AbstractC99972PYw featureManager;
        Integer num;
        C127309a3T c127309a3T;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, t}, this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return (LiveData) proxy.result;
        }
        C106862S5w.LIZ(str);
        try {
            C147430fIu c147430fIu = C147430fIu.LJI;
            PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{str, t}, c147430fIu, C147430fIu.LIZ, false, 7);
            if (proxy2.isSupported) {
                c127309a3T = proxy2.result;
            } else {
                C106862S5w.LIZ(str);
                if (!C147430fIu.LJFF) {
                    ALogger.m15797i("strategy_tag", "strategy disable");
                    C127309a3T c127309a3T2 = new C127309a3T();
                    c127309a3T2.setValue(t);
                    c127309a3T = c127309a3T2;
                } else {
                    C1D9 c1d9 = C1D9.f168LJ;
                    final StrategyManager$getFactor$1 strategyManager$getFactor$1 = new StrategyManager$getFactor$1(c147430fIu);
                    if (!PatchProxy.proxy(new Object[]{strategyManager$getFactor$1}, c1d9, C1D9.LIZ, false, 4).isSupported) {
                        C106862S5w.LIZ(strategyManager$getFactor$1);
                        final List distinct = CollectionsKt___CollectionsKt.distinct(C1D9.LIZIZ);
                        if (distinct != null) {
                            num = Integer.valueOf(distinct.size());
                        } else {
                            num = null;
                        }
                        if (num.intValue() > 0 && !C1D9.LIZLLL) {
                            C1D9.LIZLLL = true;
                            Observable.interval(15L, TimeUnit.SECONDS).observeOn(Schedulers.computation()).subscribe(new Consumer<Long>() { // from class: X.1D4
                                public static ChangeQuickRedirect LIZ;

                                static {
                                    Covode.recordClassIndex(25004);
                                }

                                @Override // io.reactivex.functions.Consumer
                                public final /* synthetic */ void accept(Long l) {
                                    Long l2 = l;
                                    if (!PatchProxy.proxy(new Object[]{l2}, this, LIZ, false, 1).isSupported) {
                                        for (Number number : distinct) {
                                            long longValue = number.longValue();
                                            if (l2 != null && ((l2.longValue() + 1) * 15) % longValue == 0) {
                                                Map<String, Long> map = C1D9.LIZJ;
                                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                                for (Map.Entry<String, Long> entry : map.entrySet()) {
                                                    if (entry.getValue().longValue() == longValue) {
                                                        linkedHashMap.put(entry.getKey(), entry.getValue());
                                                    }
                                                }
                                                strategyManager$getFactor$1.invoke(CollectionsKt___CollectionsKt.toList(linkedHashMap.keySet()));
                                            }
                                        }
                                    }
                                }
                            });
                        }
                    }
                    C147434fIy c147434fIy = C147434fIy.LIZJ;
                    StrategyManager$getFactor$2 strategyManager$getFactor$2 = new StrategyManager$getFactor$2(c147430fIu);
                    if (!PatchProxy.proxy(new Object[]{strategyManager$getFactor$2}, c147434fIy, C147434fIy.LIZ, false, 1).isSupported) {
                        C106862S5w.LIZ(strategyManager$getFactor$2);
                        if (!C147434fIy.LIZIZ) {
                            C147434fIy.LIZIZ = true;
                            PWW pww = (PWW) ServiceManager.getService(PWW.class);
                            if (pww != null && (featureManager = pww.getFeatureManager()) != null) {
                                featureManager.LIZ(new C100298Pem(strategyManager$getFactor$2));
                            }
                        }
                    }
                    if (!C147430fIu.f19679LJ.containsKey(str)) {
                        C127309a3T<T> c127309a3T3 = new C127309a3T<>();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (C147430fIu.LIZJ.containsKey(str)) {
                            AbstractC4251a abstractC4251a = C147430fIu.LIZJ.get(str);
                            if (abstractC4251a != null) {
                                abstractC4251a.LIZ(str, (String) t, (C127309a3T<String>) c127309a3T3, (Map<String, Object>) linkedHashMap);
                            }
                        } else {
                            C147430fIu.LIZLLL.LIZ(str, (String) t, (C127309a3T<String>) c127309a3T3, (Map<String, Object>) linkedHashMap);
                        }
                        C147430fIu.f19679LJ.put(str, c127309a3T3);
                        Object obj = C147430fIu.f19679LJ.get(str);
                        c127309a3T = obj;
                        if (obj == null) {
                            throw new NullPointerException("null cannot be cast to non-null type android.arch.lifecycle.LiveData<T>");
                        }
                    } else {
                        Object obj2 = C147430fIu.f19679LJ.get(str);
                        if (obj2 != null) {
                            return (LiveData) obj2;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type android.arch.lifecycle.LiveData<T>");
                    }
                }
            }
            return (LiveData) c127309a3T;
        } catch (Exception e) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fa_name", str);
            jSONObject.put("error_msg", e.getMessage());
            jSONObject.put("error_id", 1002);
            C147431fIv.LIZJ.LIZIZ(jSONObject);
            ALogger.m15797i("strategy_tag", e.getMessage());
            C127309a3T c127309a3T4 = new C127309a3T();
            c127309a3T4.setValue(t);
            return c127309a3T4;
        }
    }
}
