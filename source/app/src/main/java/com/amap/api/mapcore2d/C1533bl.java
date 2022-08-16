package com.amap.api.mapcore2d;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.util.Pair;
import android.view.WindowManager;
import com.amap.api.maps2d.CameraUpdateFactory;
import com.amap.api.maps2d.model.CameraPosition;
import com.amap.api.maps2d.model.Marker;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.ActionInvokeEntrance;
import p003X.C116971W2r;

/* renamed from: com.amap.api.mapcore2d.bl */
/* loaded from: classes19.dex */
public class C1533bl implements SensorEventListener {

    /* renamed from: a */
    public SensorManager f23021a;

    /* renamed from: b */
    public Sensor f23022b;

    /* renamed from: c */
    public long f23023c;

    /* renamed from: e */
    public float f23025e;

    /* renamed from: f */
    public Context f23026f;

    /* renamed from: g */
    public AbstractC1783y f23027g;

    /* renamed from: h */
    public Marker f23028h;

    /* renamed from: d */
    public final int f23024d = 100;

    /* renamed from: i */
    public boolean f23029i = true;

    static {
        Covode.recordClassIndex(5081);
    }

    /* renamed from: com_amap_api_mapcore2d_bl_android_hardware_SensorManager_getDefaultSensor */
    public static Sensor m18273xf3a7f060(SensorManager sensorManager, int i) {
        ActionInvokeEntrance.setEventUuid(100703);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(sensorManager, new Object[]{Integer.valueOf(i)}, 100703, "android.hardware.Sensor", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return (Sensor) actionIntercept.second;
        }
        Sensor LIZ = C116971W2r.LIZ(sensorManager, i);
        ActionInvokeEntrance.actionInvoke(LIZ, sensorManager, new Object[]{Integer.valueOf(i)}, 100703, "com_amap_api_mapcore2d_bl_android_hardware_SensorManager_getDefaultSensor(Landroid/hardware/SensorManager;I)Landroid/hardware/Sensor;");
        return LIZ;
    }

    /* renamed from: com_amap_api_mapcore2d_bl_android_hardware_SensorManager_registerListener */
    public static boolean m18272x3f8a9732(SensorManager sensorManager, SensorEventListener sensorEventListener, Sensor sensor, int i) {
        ActionInvokeEntrance.setEventUuid(100700);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(sensorManager, new Object[]{sensorEventListener, sensor, Integer.valueOf(i)}, 100700, "boolean", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return ((Boolean) actionIntercept.second).booleanValue();
        }
        boolean registerListener = sensorManager.registerListener(sensorEventListener, sensor, i);
        ActionInvokeEntrance.actionInvoke(Boolean.valueOf(registerListener), sensorManager, new Object[]{sensorEventListener, sensor, Integer.valueOf(i)}, 100700, "com_amap_api_mapcore2d_bl_android_hardware_SensorManager_registerListener(Landroid/hardware/SensorManager;Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z");
        return registerListener;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    /* renamed from: a */
    public void m18278a() {
        Sensor sensor;
        SensorManager sensorManager = this.f23021a;
        if (sensorManager != null && (sensor = this.f23022b) != null) {
            m18272x3f8a9732(sensorManager, this, sensor, 3);
        }
    }

    /* renamed from: b */
    public void m18274b() {
        Sensor sensor;
        SensorManager sensorManager = this.f23021a;
        if (sensorManager != null && (sensor = this.f23022b) != null) {
            sensorManager.unregisterListener(this, sensor);
        }
    }

    /* renamed from: a */
    public void m18276a(Marker marker) {
        this.f23028h = marker;
    }

    /* renamed from: a */
    public void m18275a(boolean z) {
        this.f23029i = z;
    }

    /* renamed from: a */
    public static int m18277a(Context context) {
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        if (rotation == 0) {
            return 0;
        }
        if (rotation != 1) {
            if (rotation != 2) {
                if (rotation != 3) {
                    return 0;
                }
                return -90;
            }
            return 180;
        }
        return 90;
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        try {
            if (System.currentTimeMillis() - this.f23023c >= 100 && sensorEvent.sensor.getType() == 3) {
                float m18277a = (sensorEvent.values[0] + m18277a(this.f23026f)) % 360.0f;
                if (m18277a > 180.0f) {
                    m18277a -= 360.0f;
                } else if (m18277a < -180.0f) {
                    m18277a += 360.0f;
                }
                if (Math.abs(this.f23025e - m18277a) >= 3.0f) {
                    if (Float.isNaN(m18277a)) {
                        m18277a = 0.0f;
                    }
                    this.f23025e = m18277a;
                    if (this.f23028h != null) {
                        try {
                            if (this.f23029i) {
                                CameraPosition cameraPosition = this.f23027g.getCameraPosition();
                                this.f23027g.moveCamera(CameraUpdateFactory.newCameraPosition(new CameraPosition(cameraPosition.target, cameraPosition.zoom, cameraPosition.tilt, this.f23025e)));
                                this.f23028h.setRotateAngle(-this.f23025e);
                            } else {
                                this.f23028h.setRotateAngle(360.0f - this.f23025e);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    this.f23023c = System.currentTimeMillis();
                }
            }
        } catch (Throwable unused2) {
        }
    }

    public C1533bl(Context context, AbstractC1783y abstractC1783y) {
        this.f23026f = context.getApplicationContext();
        this.f23027g = abstractC1783y;
        try {
            this.f23021a = (SensorManager) context.getSystemService("sensor");
            this.f23022b = m18273xf3a7f060(this.f23021a, 3);
        } catch (Throwable unused) {
        }
    }
}
