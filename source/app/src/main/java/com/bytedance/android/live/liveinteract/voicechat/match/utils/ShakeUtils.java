package com.bytedance.android.live.liveinteract.voicechat.match.utils;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.util.Pair;
import androidx.core.app.ComponentActivity;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.liveinteract.api.data.C4282c;
import com.bytedance.android.live.liveinteract.plantform.api.LinkApis;
import com.bytedance.android.live.liveinteract.voicechat.match.utils.ShakeUtils;
import com.bytedance.android.live.network.response.C5171b;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.bpea.basics.BPEAException;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.covode.number.Covode;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitor;
import com.bytedance.helios.sdk.ActionInvokeEntrance;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.heytap.mcssdk.constant.C15151a;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import java.util.Map;
import p003X.AbstractC4569445g;
import p003X.AbstractC80293Hkt;
import p003X.AbstractC81278I1w;
import p003X.C100839PnV;
import p003X.C148062fT6;
import p003X.C76537GFn;
import p003X.C79046HEa;
import p003X.C80299Hkz;
import p003X.C88306Kqq;
import p003X.H8K;

/* loaded from: classes3.dex */
public class ShakeUtils implements SensorEventListener, AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public static final Cert LJFF = TokenCert.with("bpea-shakeutils_getdefaultsensor");
    public H8K LIZIZ;
    public int LIZJ;
    public SensorManager LIZLLL;

    /* renamed from: LJ */
    public boolean f26495LJ;
    public long LJII;
    public long LJIIIIZZ;
    public int LJIIIZ;
    public float LJIIJJI;
    public float LJIIL;
    public float LJIILIIL;
    public int LJI = AccessibilityEventCompat.TYPE_TOUCH_EXPLORATION_GESTURE_END;
    public int LJIIJ = 55;

    public static boolean LIZ(SensorManager sensorManager, SensorEventListener sensorEventListener, Sensor sensor, int i) {
        Object obj;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{sensorManager, sensorEventListener, sensor, 2}, null, LIZ, true, 13);
        if (proxy.isSupported) {
            obj = proxy.result;
        } else {
            ActionInvokeEntrance.setEventUuid(100700);
            Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(sensorManager, new Object[]{sensorEventListener, sensor, 2}, 100700, "boolean", false, null, false);
            if (!((Boolean) actionIntercept.first).booleanValue()) {
                boolean registerListener = sensorManager.registerListener(sensorEventListener, sensor, 2);
                ActionInvokeEntrance.actionInvoke(Boolean.valueOf(registerListener), sensorManager, new Object[]{sensorEventListener, sensor, 2}, 100700, "com_bytedance_android_live_liveinteract_voicechat_match_utils_ShakeUtils_android_hardware_SensorManager_registerListener(Landroid/hardware/SensorManager;Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z");
                return registerListener;
            }
            obj = actionIntercept.second;
        }
        return ((Boolean) obj).booleanValue();
    }

    public final void LIZ() {
        this.LIZIZ = null;
    }

    public final void LIZLLL() {
        this.LIZLLL = null;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    static {
        Covode.recordClassIndex(31595);
    }

    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        this.f26495LJ = false;
        m15643LJ();
    }

    public final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        this.f26495LJ = true;
        this.LIZLLL.unregisterListener(this);
    }

    /* renamed from: LJ */
    private void m15643LJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        try {
            LIZ(this.LIZLLL, this, C76537GFn.LIZIZ(this.LIZLLL, 1, LJFF), 2);
        } catch (BPEAException e) {
            ALogger.m15798e("ShakeUtils", e);
        }
    }

    private boolean LJFF() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 8);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (LiveSettingKeys.LIVE_SHAKE_ENABLE_GALILEO.getValue().intValue() <= 0) {
            return false;
        }
        return true;
    }

    public final void LIZ(Map<String, Double> map) {
        if (PatchProxy.proxy(new Object[]{map}, this, LIZ, false, 9).isSupported) {
            return;
        }
        this.LIZJ = map.get("speed_shake_millisecond").intValue();
        this.LJI = map.get("min_shake_interval").intValue();
        this.LJIIJ = map.get("shake_interval_millisecond").intValue();
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (!PatchProxy.proxy(new Object[]{sensorEvent}, this, LIZ, false, 5).isSupported && !this.f26495LJ && sensorEvent != null && sensorEvent.values != null && sensorEvent.values.length >= 3) {
            long currentTimeMillis = System.currentTimeMillis();
            long j = currentTimeMillis - this.LJIIIIZZ;
            if (j < this.LJIIJ) {
                return;
            }
            this.LJIIIIZZ = currentTimeMillis;
            float f = sensorEvent.values[0];
            float f2 = sensorEvent.values[1];
            float f3 = sensorEvent.values[2];
            float f4 = f - this.LJIIJJI;
            float f5 = f2 - this.LJIIL;
            float f6 = f3 - this.LJIILIIL;
            this.LJIIJJI = f;
            this.LJIIL = f2;
            this.LJIILIIL = f3;
            double sqrt = (Math.sqrt(((f4 * f4) + (f5 * f5)) + (f6 * f6)) * 1000.0d) / j;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Double.valueOf(sqrt)}, this, LIZ, false, 7);
            if (proxy.isSupported) {
                if (!((Boolean) proxy.result).booleanValue()) {
                    return;
                }
            } else if (C79046HEa.LIZ().LIZJ()) {
                if (sqrt < this.LJIIIZ) {
                    return;
                }
            } else if (sqrt < this.LIZJ) {
                return;
            }
            if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
                long currentTimeMillis2 = System.currentTimeMillis();
                if (currentTimeMillis2 - this.LJII >= this.LJI) {
                    this.LJII = currentTimeMillis2;
                    H8K h8k = this.LIZIZ;
                    if (h8k != null && !this.f26495LJ) {
                        h8k.LIZ();
                    }
                }
            }
        }
    }

    public ShakeUtils(Context context, int i) {
        this.LIZJ = SDKMonitor.SDK_VERSION;
        this.LJIIIZ = SDKMonitor.SDK_VERSION;
        boolean z = context instanceof FragmentActivity;
        if (z) {
            ((ComponentActivity) context).mo29786getLifecycle().addObserver(this);
        }
        this.LIZLLL = (SensorManager) context.getSystemService("sensor");
        this.LIZJ = i;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported && LJFF()) {
            Map<String, Double> LIZ2 = AbstractC80293Hkt.f7026bA.LIZ();
            LIZ(LIZ2);
            ALogger.m15801d("ShakeUtils", "initGalileoConfig galileoData: " + LIZ2);
        }
        this.LJIIIZ = LiveSettingKeys.LIVE_SHAKE_MATCH_CONFIG.getValue().LIZJ;
        if (this.LIZJ < 200) {
            this.LIZJ = 200;
        }
        if (!PatchProxy.proxy(new Object[]{context}, this, LIZ, false, 10).isSupported && LJFF()) {
            FragmentActivity fragmentActivity = z ? (FragmentActivity) context : null;
            long currentTimeMillis = System.currentTimeMillis() - AbstractC80293Hkt.f7027bB.LIZ().longValue();
            if (fragmentActivity != null && currentTimeMillis >= C15151a.f30809f) {
                ((AbstractC81278I1w) ((LinkApis) C88306Kqq.LIZ().LIZ(LinkApis.class)).galileoParamsRequest().compose(C100839PnV.LIZJ()).m151as(C148062fT6.LIZ(fragmentActivity))).LIZ(new Consumer(this) { // from class: X.Hky
                    public static ChangeQuickRedirect LIZ;
                    public final ShakeUtils LIZIZ;

                    static {
                        Covode.recordClassIndex(31597);
                    }

                    {
                        this.LIZIZ = this;
                    }

                    @Override // io.reactivex.functions.Consumer
                    public final void accept(Object obj) {
                        if (PatchProxy.proxy(new Object[]{obj}, this, LIZ, false, 1).isSupported) {
                            return;
                        }
                        ShakeUtils shakeUtils = this.LIZIZ;
                        C5171b c5171b = (C5171b) obj;
                        if (PatchProxy.proxy(new Object[]{c5171b}, shakeUtils, ShakeUtils.LIZ, false, 12).isSupported) {
                            return;
                        }
                        if (c5171b.LIZIZ == 0) {
                            C4282c c4282c = (C4282c) c5171b.LIZJ;
                            HashMap hashMap = new HashMap();
                            hashMap.put("speed_shake_millisecond", Double.valueOf(c4282c.LIZIZ));
                            hashMap.put("min_shake_interval", Double.valueOf(c4282c.LIZLLL));
                            hashMap.put("shake_interval_millisecond", Double.valueOf(c4282c.LJFF));
                            ALogger.m15801d("ShakeUtils", "update galileo data: " + hashMap.toString());
                            shakeUtils.LIZ(hashMap);
                            AbstractC80293Hkt.f7026bA.LIZ(hashMap);
                            AbstractC80293Hkt.f7027bB.LIZ(Long.valueOf(System.currentTimeMillis()));
                            return;
                        }
                        ALogger.m15801d("ShakeUtils", "galileoParamsRequest failed, error code : " + c5171b.LIZIZ);
                    }
                }, C80299Hkz.LIZIZ);
            }
        }
    }
}
