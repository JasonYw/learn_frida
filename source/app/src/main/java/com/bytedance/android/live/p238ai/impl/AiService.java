package com.bytedance.android.live.p238ai.impl;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.p238ai.api.AbstractC2780a;
import com.bytedance.android.live.p238ai.api.AbstractC2789c;
import com.bytedance.android.live.p238ai.api.C2790d;
import com.bytedance.android.live.p238ai.api.IAiService;
import com.bytedance.android.live.p238ai.impl.p240b.AbstractC2791e;
import com.bytedance.android.live.player.api.LivePlayer;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.config.LiveInitSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.config.p558a.C6810a;
import com.bytedance.android.livesdk.config.p558a.C6811b;
import com.bytedance.android.livesdk.config.p558a.C6812c;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.model.C9654w;
import com.bytedance.common.utility.concurrent.TTExecutors;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.android.ugc.aweme.experiment.ReDexClinitStringAb;
import com.p1594ss.videoarch.strategy.LiveStrategyManager;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p003X.AbstractC91043Ltt;
import p003X.AbstractC91467M1t;
import p003X.C100020PaI;
import p003X.C101471Pxh;
import p003X.C106862S5w;
import p003X.C370650mJ;
import p003X.C91042Lts;
import p003X.C91045Ltv;
import p003X.C91468M1u;
import p003X.C91478M2e;
import p003X.C99969PYt;
import p003X.C99975PYz;
import p003X.C99978PZc;
import p003X.LK1;
import p003X.LMJ;
import p003X.PZA;
import p003X.PZB;
import p003X.PZD;
import p003X.PZG;
import p003X.PZL;
import p003X.PZV;
import p003X.PZW;
import p003X.PZX;
import p003X.PZY;
import p003X.PZZ;

/* renamed from: com.bytedance.android.live.ai.impl.AiService */
/* loaded from: classes8.dex */
public class AiService implements IAiService {
    public static ChangeQuickRedirect changeQuickRedirect;
    public List<AbstractC2780a> observerAdapterList = new ArrayList();

    static {
        if (ReDexClinitStringAb.abTest >= 5) {
            Covode.recordClassIndex(13837);
        } else {
            Covode.recordClassIndex(13837);
        }
    }

    private final boolean isAsyncStart() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 12);
        return proxy.isSupported ? ((Boolean) proxy.result).booleanValue() : m15924x27a018e3(this);
    }

    /* renamed from: com_bytedance_android_live_ai_impl_AiService__isAsyncStart$___twin___ */
    public final boolean m15925x3b91e0b8() {
        return false;
    }

    @Override // com.bytedance.android.live.p238ai.api.IAiService
    public AbstractC91043Ltt getHarService() {
        return C91042Lts.LIZIZ;
    }

    @Override // com.bytedance.android.live.p238ai.api.IAiService
    public AbstractC91467M1t getOhrService() {
        return C100020PaI.f10689LJ;
    }

    @Override // com.bytedance.android.live.p238ai.api.IAiService
    public AbstractC2780a roomLifecycleObserver() {
        return C99969PYt.LIZIZ;
    }

    public AiService() {
        ServiceManager.registerService(IAiService.class, this);
    }

    @Override // com.bytedance.android.live.p238ai.api.IAiService
    public LinkedList<Long> getRoomListNotToPredictResolution() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19);
        if (proxy.isSupported) {
            return (LinkedList) proxy.result;
        }
        return PZW.LIZ();
    }

    @Override // com.bytedance.android.live.p238ai.api.IAiService
    public boolean isDynamicSREnable() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return C99978PZc.LIZIZ;
    }

    @Override // com.bytedance.android.live.p238ai.api.IAiService
    public String predictResolution() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return PZW.LJIIIIZZ;
    }

    @Override // com.bytedance.android.live.p238ai.api.IAiService
    public void triggerSRPredict() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14).isSupported) {
            return;
        }
        C99978PZc.LJFF.LIZJ();
    }

    private final void registerGamePredictManager() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5).isSupported) {
            return;
        }
        SettingKey<C6812c> settingKey = LiveSettingKeys.LIVE_AI_GAME_CONFIG;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        if (settingKey.getValue().LIZ) {
            C91478M2e.LIZJ.LIZ((AbstractC2791e) new PZG());
        }
    }

    private final void registerLogFilter() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        SettingKey<C6810a> settingKey = LiveSettingKeys.LIVE_AI_CONFIG;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        if (settingKey.getValue().LIZIZ) {
            LK1.LIZ(0L, false, false, AiService$registerLogFilter$1.INSTANCE, 7, null);
        }
    }

    private final void registerOhrService() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3).isSupported && C100020PaI.f10689LJ.LIZ()) {
            LK1.LIZ(0L, false, false, AiService$registerOhrService$1.INSTANCE, 7, null);
        }
    }

    @Override // com.bytedance.android.live.p238ai.api.IAiService
    public List<AbstractC2780a> getRoomLifecycleObserverList() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        if (this.observerAdapterList.isEmpty()) {
            this.observerAdapterList.add(roomLifecycleObserver());
            this.observerAdapterList.add(C91468M1u.LIZJ);
        }
        return this.observerAdapterList;
    }

    @Override // com.bytedance.android.live.p238ai.api.IAiService
    public void startStreamStrategy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 10).isSupported) {
            return;
        }
        if (isAsyncStart()) {
            C101471Pxh.LIZJ.LIZ();
        } else {
            LK1.LIZ(0L, false, false, AiService$startStreamStrategy$1.INSTANCE, 7, null);
        }
    }

    @Override // com.bytedance.android.live.p238ai.api.IAiService
    public void stopStreamStrategy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 13).isSupported) {
            return;
        }
        C101471Pxh c101471Pxh = C101471Pxh.LIZJ;
        if (!PatchProxy.proxy(new Object[0], c101471Pxh, C101471Pxh.LIZ, false, 3).isSupported && c101471Pxh.LIZIZ() && C101471Pxh.LIZIZ) {
            LiveStrategyManager.inst().stop();
        }
    }

    @Override // com.bytedance.android.live.p238ai.api.IAiService
    public void triggerResolutionPredict() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17).isSupported) {
            return;
        }
        if (!PatchProxy.proxy(new Object[0], PZW.LJIIIZ, PZW.LIZ, false, 4).isSupported) {
            TTExecutors.getNormalExecutor().submit(PZV.LIZIZ);
        }
    }

    private final void registerAppLogRunEventCallback() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6).isSupported) {
            return;
        }
        SettingKey<C6810a> settingKey = LiveSettingKeys.LIVE_AI_CONFIG;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        if (settingKey.getValue().LIZJ) {
            if (!PatchProxy.proxy(new Object[0], C99975PYz.LIZJ, C99975PYz.LIZ, false, 2).isSupported) {
                C6810a _live_ai_config = LiveInitSettingKeys.get_LIVE_AI_CONFIG();
                for (PZL<? extends AbstractC2789c, ? extends C2790d> pzl : C99975PYz.LIZIZ.values()) {
                    if (_live_ai_config.LIZ && pzl.LIZ() && !PatchProxy.proxy(new Object[0], pzl, PZL.LIZJ, false, 11).isSupported) {
                        PZX.LIZIZ.LIZ().LIZ(pzl.LIZIZ(), pzl.f10682LJ);
                    }
                }
            }
        }
    }

    private final void registerDrawerPredictManager() {
        ArrayList<String> arrayList;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 7).isSupported) {
            return;
        }
        SettingKey<C6811b> settingKey = LiveSettingKeys.LIVE_AI_DRAWER_CONFIG;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        C6811b value = settingKey.getValue();
        SettingKey<C6810a> settingKey2 = LiveSettingKeys.LIVE_AI_CONFIG;
        Intrinsics.checkNotNullExpressionValue(settingKey2, "");
        if (settingKey2.getValue().LIZ() && value.LIZ && (arrayList = value.LJII) != null && !arrayList.isEmpty()) {
            C91478M2e.LIZJ.LIZ((AbstractC2791e) PZA.LIZIZ);
        }
    }

    private final void registerHarService() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4).isSupported && getHarService().LIZ() && getHarService().LIZJ()) {
            C91478M2e c91478M2e = C91478M2e.LIZJ;
            C91045Ltv c91045Ltv = C91045Ltv.LIZIZ;
            if (!PatchProxy.proxy(new Object[]{c91045Ltv}, c91478M2e, C91478M2e.LIZ, false, 3).isSupported) {
                C106862S5w.LIZ(c91045Ltv);
                if (!C91478M2e.LIZIZ.contains(c91045Ltv)) {
                    C91478M2e.LIZIZ.add(c91045Ltv);
                }
            }
        }
    }

    @Override // com.bytedance.android.live.p238ai.api.IAiService
    public void preInit() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        registerLogFilter();
        startStreamStrategy();
        registerOhrService();
        registerHarService();
        registerGamePredictManager();
        PZX.LIZIZ.LIZ().LIZ();
        if (!PatchProxy.proxy(new Object[0], C99978PZc.LJFF, C99978PZc.LIZ, false, 8).isSupported) {
            SettingKey<C9654w> settingKey = LiveSettingKeys.LIVE_AI_DYNAMIC_SR;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            if (settingKey.getValue().LIZ != 0) {
                LivePlayer.playerService().registerPlayerEventObserver(C99978PZc.f10684LJ);
            }
        }
        registerAppLogRunEventCallback();
        registerDrawerPredictManager();
    }

    @Override // com.bytedance.android.live.p238ai.api.IAiService
    public void triggerDrawerPredict(JSONObject jSONObject) {
        if (PatchProxy.proxy(new Object[]{jSONObject}, this, changeQuickRedirect, false, 23).isSupported) {
            return;
        }
        C106862S5w.LIZ(jSONObject);
        PZB.LIZIZ.LIZ(jSONObject);
    }

    /* renamed from: com_bytedance_android_live_ai_impl_AiService_com_ss_android_ugc_aweme_lancet_AiServiceLancet_isAsyncStart */
    public static boolean m15924x27a018e3(AiService aiService) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{aiService}, null, changeQuickRedirect, true, 11);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return C370650mJ.LIZ();
    }

    @Override // com.bytedance.android.live.p238ai.api.IAiService
    public boolean predict(AbstractC2789c abstractC2789c) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC2789c}, this, changeQuickRedirect, false, 9);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return C99975PYz.LIZJ.LIZ(abstractC2789c);
    }

    @Override // com.bytedance.android.live.p238ai.api.IAiService
    public void setRoomListNotToPredictResolution(Room room) {
        if (PatchProxy.proxy(new Object[]{room}, this, changeQuickRedirect, false, 20).isSupported) {
            return;
        }
        C106862S5w.LIZ(room);
        PZW.LIZ().add(Long.valueOf(room.getId()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.view.View] */
    @Override // com.bytedance.android.live.p238ai.api.IAiService
    public View getDebugView(Context context) {
        Button button;
        LinearLayout linearLayout;
        MethodCollector.m14708i(1182);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 8);
        if (proxy.isSupported) {
            View view = (View) proxy.result;
            MethodCollector.m14707o(1182);
            return view;
        }
        C106862S5w.LIZ(context);
        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{context}, null, PZZ.LIZ, true, 1);
        if (proxy2.isSupported) {
            linearLayout = (View) proxy2.result;
        } else {
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setOrientation(1);
            new LinearLayout.LayoutParams(-1, -2);
            PatchProxyResult proxy3 = PatchProxy.proxy(new Object[]{context}, null, PZZ.LIZ, true, 2);
            if (proxy3.isSupported) {
                button = (View) proxy3.result;
            } else {
                Button button2 = new Button(context);
                button2.setText("super resolution");
                button2.setOnClickListener(PZY.LIZIZ);
                button = button2;
            }
            linearLayout2.addView(button);
            linearLayout = linearLayout2;
        }
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        MethodCollector.m14707o(1182);
        return linearLayout;
    }

    @Override // com.bytedance.android.live.p238ai.api.IAiService
    public void triggerGamePredict(JSONObject jSONObject, LMJ lmj) {
        if (PatchProxy.proxy(new Object[]{jSONObject, lmj}, this, changeQuickRedirect, false, 22).isSupported) {
            return;
        }
        C106862S5w.LIZ(jSONObject, lmj);
        PZD.LJFF.LIZ(jSONObject, lmj);
    }

    @Override // com.bytedance.android.live.p238ai.api.IAiService
    public void setResolutionStrategyInput(Room room, int i) {
        if (PatchProxy.proxy(new Object[]{room, Integer.valueOf(i)}, this, changeQuickRedirect, false, 18).isSupported) {
            return;
        }
        C106862S5w.LIZ(room);
        PZW.LJIIIZ.LIZ(room, i);
    }
}
