package com.bytedance.android.live.liveinteract.plantform.utils;

import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.config.C7013k;
import com.bytedance.android.livesdk.log.p723a.s$a;
import com.bytedance.android.livesdkapi.degrade.BaseDegradeTask;
import com.bytedance.android.livesdkapi.degrade.IDegradeManager;
import com.bytedance.android.livesdkapi.degrade.IDegradeMonitor;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.android.ugc.aweme.experiment.ReDexClinitStringAb;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import p003X.C4574547f;

/* loaded from: classes3.dex */
public class InteractBusinessDegradeTask extends BaseDegradeTask {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final List<WeakReference<C7013k>> degradeStrategyList = new CopyOnWriteArrayList();
    public boolean isInit = false;

    static {
        if (ReDexClinitStringAb.abTest >= 5) {
            Covode.recordClassIndex(29500);
        } else {
            Covode.recordClassIndex(29500);
        }
    }

    private String getLevelStr(int i) {
        return i == 1 ? "serious" : i == 2 ? "critical" : "";
    }

    @Override // com.bytedance.android.livesdkapi.degrade.BaseDegradeTask
    public boolean onRecoverAllFeatures(Map<String, String> map, IDegradeMonitor iDegradeMonitor) {
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.degrade.BaseDegradeTask
    public boolean onTriggerLowPowerMode(int i, Map<String, String> map, IDegradeMonitor iDegradeMonitor) {
        return false;
    }

    public void init() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported && !this.isInit) {
            IDegradeManager iDegradeManager = (IDegradeManager) ServiceManager.getService(IDegradeManager.class);
            if (iDegradeManager != null) {
                iDegradeManager.registerDegradeTask(300, this);
            }
            this.isInit = true;
        }
    }

    public void addBusinessDegradeStrategy(C7013k c7013k) {
        if (PatchProxy.proxy(new Object[]{c7013k}, this, changeQuickRedirect, false, 4).isSupported) {
            return;
        }
        this.degradeStrategyList.add(new WeakReference<>(c7013k));
    }

    public void resetBusinessDegradeStrategy(int i, String str) {
        List<Integer> list;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), str}, this, changeQuickRedirect, false, 5).isSupported) {
            return;
        }
        for (WeakReference<C7013k> weakReference : this.degradeStrategyList) {
            C7013k c7013k = weakReference.get();
            if (c7013k != null && (list = c7013k.LJI.f27267LJ) != null && !list.isEmpty() && list.contains(Integer.valueOf(i)) && (str == null || c7013k.LIZIZ().equals(str))) {
                c7013k.LIZ();
            }
        }
    }

    public void onDownGradeInfo(boolean z, int i) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("degrade_level", getLevelStr(i));
        for (WeakReference<C7013k> weakReference : this.degradeStrategyList) {
            C7013k c7013k = weakReference.get();
            if (c7013k != null) {
                ALogger.m15795w("LiveDegradeManager", "onDownGradeInfo" + i);
                C7013k.LIZIZ(i);
                c7013k.LIZ(i);
                if (c7013k.LIZJ) {
                    hashMap.put("scene", c7013k.LIZIZ());
                    C4574547f.LIZ().LIZ("livesdk_performance_monitor_biz_degrade", hashMap, s$a.class);
                }
            }
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("degrade_level", getLevelStr(i));
        C4574547f.LIZ().LIZ("livesdk_performance_monitor_degrade_notify", hashMap2, s$a.class);
    }

    @Override // com.bytedance.android.livesdkapi.degrade.BaseDegradeTask
    public boolean onTriggerDegradeOne(int i, Map<String, String> map, IDegradeMonitor iDegradeMonitor) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), map, iDegradeMonitor}, this, changeQuickRedirect, false, 6);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        onDownGradeInfo(i, map, false, iDegradeMonitor);
        return false;
    }

    @Override // com.bytedance.android.livesdkapi.degrade.BaseDegradeTask
    public boolean onTriggerDegradeTwo(int i, Map<String, String> map, IDegradeMonitor iDegradeMonitor) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), map, iDegradeMonitor}, this, changeQuickRedirect, false, 7);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        onDownGradeInfo(i, map, false, iDegradeMonitor);
        return false;
    }

    public boolean onDownGradeInfo(int i, Map<String, String> map, boolean z, IDegradeMonitor iDegradeMonitor) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), map, Byte.valueOf(z ? (byte) 1 : (byte) 0), iDegradeMonitor}, this, changeQuickRedirect, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        HashMap hashMap = new HashMap();
        hashMap.put("degrade_level", getLevelStr(i));
        boolean z2 = false;
        for (WeakReference<C7013k> weakReference : this.degradeStrategyList) {
            C7013k c7013k = weakReference.get();
            if (c7013k != null) {
                ALogger.m15795w("LiveDegradeManager", "onDownGradeInfo" + i);
                C7013k.LIZIZ(i);
                c7013k.LIZ(i);
                if (c7013k.LIZJ) {
                    hashMap.put("scene", c7013k.LIZIZ());
                    iDegradeMonitor.updateDegradeMonitor(hashMap, i, false, z);
                    z2 = true;
                }
            }
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("degrade_level", getLevelStr(i));
        iDegradeMonitor.updateNotifyMonitor(hashMap2, i, false, z);
        return z2;
    }
}
