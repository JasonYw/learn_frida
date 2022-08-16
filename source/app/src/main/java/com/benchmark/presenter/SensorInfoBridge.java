package com.benchmark.presenter;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.bpea.entry.api.device.info.SensorEntry;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p003X.C108862Stc;
import p003X.C75509Fpv;

/* loaded from: classes2.dex */
public class SensorInfoBridge {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(9722);
    }

    private String keyToString(int i) {
        if (i != 12) {
            if (i == 13) {
                return "temperature";
            }
            if (i == 18) {
                return "step_detector";
            }
            if (i == 19) {
                return "step_counter";
            }
            switch (i) {
                case 1:
                    return "accelerometer";
                case 2:
                    return "magnetic_field";
                case 3:
                    return "orientation";
                case 4:
                    return "gyroscope";
                case 5:
                    return "light";
                case 6:
                    return "pressure";
                case 7:
                    return "temperature";
                case 8:
                    return "proximity";
                case 9:
                    return "gravity";
                case 10:
                    return "linear_acceleration";
                default:
                    return "other";
            }
        }
        return "relative_humidity";
    }

    public String getSensorInfo() {
        List<Sensor> list;
        SensorManager sensorManager;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        Context context = C108862Stc.LIZIZ().LIZIZ;
        if (context == null || context.getSystemService("sensor") == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], null, C75509Fpv.LIZ, true, 3);
            if (proxy2.isSupported) {
                list = (List) proxy2.result;
            } else {
                TokenCert with = TokenCert.with("bpea-bytebench_collection_sensor");
                PatchProxyResult proxy3 = PatchProxy.proxy(new Object[]{with}, null, C75509Fpv.LIZ, true, 1);
                if (proxy3.isSupported) {
                    list = (List) proxy3.result;
                } else {
                    Context context2 = C108862Stc.LIZIZ().LIZIZ;
                    if (context2 != null && (sensorManager = (SensorManager) context2.getSystemService("sensor")) != null) {
                        list = SensorEntry.Companion.getSensorList(sensorManager, -1, with);
                    } else {
                        list = null;
                    }
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (list == null) {
            return null;
        }
        for (Sensor sensor : list) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("name", sensor.getName());
            jSONObject2.put("maxRange", sensor.getMaximumRange());
            jSONObject2.put("minDelay", sensor.getMinDelay());
            jSONObject2.put("power", sensor.getPower());
            jSONObject2.put("resolution", sensor.getResolution());
            jSONObject2.put("type", sensor.getType());
            jSONObject2.put("vendor", sensor.getVendor());
            jSONObject2.put("version", sensor.getVersion());
            String valueOf = String.valueOf(sensor.getType());
            if (!jSONObject.has(valueOf)) {
                jSONObject.put(valueOf, new JSONArray());
            }
            jSONObject.getJSONArray(valueOf).put(jSONObject2);
        }
        return jSONObject.toString();
    }
}
