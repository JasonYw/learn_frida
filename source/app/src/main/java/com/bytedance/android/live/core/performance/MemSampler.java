package com.bytedance.android.live.core.performance;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.Process;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import org.json.JSONObject;
import p003X.AbstractC4569445g;
import p003X.C74743FdZ;

/* loaded from: classes5.dex */
public class MemSampler extends BaseSampler<JSONObject> implements AbstractC4569445g {
    public static ChangeQuickRedirect LJFF;

    static {
        Covode.recordClassIndex(23529);
    }

    @Override // com.bytedance.android.live.core.performance.BaseSampler, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LJFF, false, 2).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // java.lang.Runnable
    public void run() {
        ActivityManager activityManager;
        if (PatchProxy.proxy(new Object[0], this, LJFF, false, 1).isSupported) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (this.LIZLLL != null && this.LIZLLL.get() != null) {
            Context context = this.LIZLLL.get();
            int myPid = Process.myPid();
            if (!PatchProxy.proxy(new Object[]{jSONObject, context, Integer.valueOf(myPid)}, null, C74743FdZ.LIZ, true, 9).isSupported && context != null && (activityManager = (ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)) != null) {
                Debug.MemoryInfo[] processMemoryInfo = activityManager.getProcessMemoryInfo(new int[]{myPid});
                try {
                    jSONObject.put("total_mem", processMemoryInfo[0].getTotalPss());
                    PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context}, null, C74743FdZ.LIZ, true, 3);
                    int i = -1;
                    if (proxy.isSupported) {
                        i = ((Integer) proxy.result).intValue();
                    } else {
                        ActivityManager activityManager2 = (ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME);
                        if (activityManager2 != null) {
                            i = activityManager2.getMemoryClass();
                        }
                    }
                    jSONObject.put("mem_class", i);
                    jSONObject.put("uss", processMemoryInfo[0].getTotalPrivateDirty());
                    jSONObject.put("pss", processMemoryInfo[0].getTotalPss());
                    jSONObject.put("rss", processMemoryInfo[0].getTotalSharedDirty());
                    jSONObject.put("dalvikPss", processMemoryInfo[0].dalvikPss);
                    jSONObject.put("dalvikPrivateDirty", processMemoryInfo[0].dalvikPrivateDirty);
                    jSONObject.put("dalvikSharedDirty", processMemoryInfo[0].dalvikSharedDirty);
                    jSONObject.put("nativePss", processMemoryInfo[0].nativePss);
                    jSONObject.put("nativePrivateDirty", processMemoryInfo[0].nativePrivateDirty);
                    jSONObject.put("nativeSharedDirty", processMemoryInfo[0].nativeSharedDirty);
                } catch (Throwable unused) {
                }
            }
            LIZ((MemSampler) jSONObject);
            if (this.LIZJ != null) {
                this.LIZJ.postDelayed(this, this.LIZIZ);
            }
        }
    }

    public MemSampler(int i, int i2) {
        super(i, PushConstants.WORK_RECEIVER_EVENT_CORE_ERROR);
    }
}
