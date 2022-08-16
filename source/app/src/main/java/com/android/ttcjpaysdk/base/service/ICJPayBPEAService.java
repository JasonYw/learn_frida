package com.android.ttcjpaysdk.base.service;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.hardware.Camera;
import android.telephony.TelephonyManager;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* loaded from: classes10.dex */
public interface ICJPayBPEAService extends ICJPayService {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* loaded from: classes10.dex */
    public interface PermissionCallback {
        static {
            Covode.recordClassIndex(6412);
        }

        void onEzPermissionResult(boolean z, List<String> list, List<String> list2);

        void onRequestPermissions();
    }

    static {
        Covode.recordClassIndex(6409);
    }

    int getNetworkType(TelephonyManager telephonyManager);

    ClipData getPrimaryClip(ClipboardManager clipboardManager);

    Camera openCamera(int i, String str);

    Camera openCamera(String str);

    void releaseCamera(Camera camera, String str);

    void requestEzPermission(Activity activity, String[] strArr, String str, PermissionCallback permissionCallback);

    void setClipboardText(ClipboardManager clipboardManager, CharSequence charSequence);

    void setPrimaryClip(ClipboardManager clipboardManager, ClipData clipData);

    /* loaded from: classes10.dex */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        static {
            Covode.recordClassIndex(6411);
        }
    }
}
