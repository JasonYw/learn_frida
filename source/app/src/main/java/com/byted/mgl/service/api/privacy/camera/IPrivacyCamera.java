package com.byted.mgl.service.api.privacy.camera;

import android.hardware.Camera;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import com.bytedance.covode.number.Covode;

/* loaded from: classes10.dex */
public interface IPrivacyCamera {
    static {
        Covode.recordClassIndex(9799);
    }

    void close(CameraDevice cameraDevice, String str);

    Camera open(int i, String str);

    void openCamera(CameraManager cameraManager, String str, CameraDevice.StateCallback stateCallback, Handler handler, String str2);

    void release(Camera camera, String str);
}
