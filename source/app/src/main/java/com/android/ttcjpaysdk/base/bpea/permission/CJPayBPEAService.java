package com.android.ttcjpaysdk.base.bpea.permission;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.hardware.Camera;
import android.telephony.TelephonyManager;
import com.android.ttcjpaysdk.base.service.ICJPayBPEAService;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.bpea.entry.api.camera.Camera1Entry;
import com.bytedance.bpea.entry.api.device.info.TelephonyManagerEntry;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.ezpermission.EzPermission;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import p003X.C106862S5w;
import p003X.C109043SwX;
import p003X.C109044SwY;
import p003X.C109045SwZ;

/* loaded from: classes10.dex */
public final class CJPayBPEAService implements ICJPayBPEAService {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(5988);
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayService
    public final String getPackageName() {
        return "com.android.ttcjpaysdk.base.bpea";
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayBPEAService
    public final int getNetworkType(TelephonyManager telephonyManager) {
        Integer networkType;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{telephonyManager}, this, LIZ, false, 8);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (telephonyManager != null && (networkType = TelephonyManagerEntry.Companion.getNetworkType(telephonyManager, TokenCert.Companion.with("bpea-cjpay_android_network_type"))) != null) {
            return networkType.intValue();
        }
        return -1;
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayBPEAService
    public final ClipData getPrimaryClip(ClipboardManager clipboardManager) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{clipboardManager}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (ClipData) proxy.result;
        }
        return (ClipData) LIZ((CJPayBPEAService) null, new CJPayBPEAService$getPrimaryClip$1(clipboardManager));
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayBPEAService
    public final Camera openCamera(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 5);
        if (proxy.isSupported) {
            return (Camera) proxy.result;
        }
        C106862S5w.LIZ(str);
        return Camera1Entry.Companion.open(TokenCert.Companion.with(str));
    }

    private final <T> T LIZ(T t, Function0<? extends T> function0) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{null, function0}, this, LIZ, false, 9);
        if (proxy.isSupported) {
            return (T) proxy.result;
        }
        try {
            return function0.mo30099invoke();
        } catch (Throwable unused) {
            return null;
        }
    }

    private final void LIZ(Function0<Unit> function0, Function0<Unit> function02) {
        if (PatchProxy.proxy(new Object[]{function0, function02}, this, LIZ, false, 10).isSupported) {
            return;
        }
        try {
            function02.mo30099invoke();
        } catch (Throwable unused) {
            function0.mo30099invoke();
        }
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayBPEAService
    public final Camera openCamera(int i, String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), str}, this, LIZ, false, 6);
        if (proxy.isSupported) {
            return (Camera) proxy.result;
        }
        C106862S5w.LIZ(str);
        return Camera1Entry.Companion.open(i, TokenCert.Companion.with(str));
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayBPEAService
    public final void releaseCamera(Camera camera, String str) {
        if (PatchProxy.proxy(new Object[]{camera, str}, this, LIZ, false, 7).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        LIZ((Function0<Unit>) new CJPayBPEAService$releaseCamera$1(camera), (Function0<Unit>) new CJPayBPEAService$releaseCamera$2(camera, str));
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayBPEAService
    public final void setClipboardText(ClipboardManager clipboardManager, CharSequence charSequence) {
        if (PatchProxy.proxy(new Object[]{clipboardManager, charSequence}, this, LIZ, false, 4).isSupported || charSequence == null) {
            return;
        }
        LIZ((Function0<Unit>) CJPayBPEAService$setClipboardText$1.INSTANCE, (Function0<Unit>) new CJPayBPEAService$setClipboardText$2(clipboardManager, charSequence));
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayBPEAService
    public final void setPrimaryClip(ClipboardManager clipboardManager, ClipData clipData) {
        if (PatchProxy.proxy(new Object[]{clipboardManager, clipData}, this, LIZ, false, 2).isSupported || clipData == null) {
            return;
        }
        LIZ((Function0<Unit>) CJPayBPEAService$setPrimaryClip$1.INSTANCE, (Function0<Unit>) new CJPayBPEAService$setPrimaryClip$2(clipboardManager, clipData));
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayBPEAService
    public final void requestEzPermission(Activity activity, String[] strArr, String str, ICJPayBPEAService.PermissionCallback permissionCallback) {
        if (PatchProxy.proxy(new Object[]{activity, strArr, str, permissionCallback}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(activity, strArr, str, permissionCallback);
        C109043SwX c109043SwX = C109045SwZ.LIZ;
        if (!PatchProxy.proxy(new Object[]{activity, strArr, str, permissionCallback}, c109043SwX, C109043SwX.LIZ, false, 2).isSupported) {
            C106862S5w.LIZ(strArr, str);
            if (activity != null && !activity.isFinishing() && str.length() != 0) {
                if (c109043SwX.LIZ()) {
                    try {
                        EzPermission.with(activity, TokenCert.Companion.with(str)).permissions(ArraysKt___ArraysKt.toList(strArr)).request(new C109044SwY(permissionCallback));
                    } catch (Exception e) {
                        e.printStackTrace();
                        if (permissionCallback != null) {
                            permissionCallback.onEzPermissionResult(false, CollectionsKt__CollectionsKt.emptyList(), ArraysKt___ArraysKt.toList(strArr));
                        }
                    }
                } else if (permissionCallback != null) {
                    permissionCallback.onRequestPermissions();
                }
            } else if (permissionCallback != null) {
                permissionCallback.onEzPermissionResult(false, CollectionsKt__CollectionsKt.emptyList(), ArraysKt___ArraysKt.toList(strArr));
            }
        }
    }
}
