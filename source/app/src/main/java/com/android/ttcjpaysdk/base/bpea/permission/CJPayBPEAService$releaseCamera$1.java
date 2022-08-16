package com.android.ttcjpaysdk.base.bpea.permission;

import android.hardware.Camera;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.ActionInvokeEntrance;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes10.dex */
public final class CJPayBPEAService$releaseCamera$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Camera $camera;

    static {
        Covode.recordClassIndex(5990);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CJPayBPEAService$releaseCamera$1(Camera camera) {
        super(0);
        this.$camera = camera;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        Camera camera;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported && (camera = this.$camera) != null && !PatchProxy.proxy(new Object[]{camera}, null, changeQuickRedirect, true, 2).isSupported) {
            ActionInvokeEntrance.setEventUuid(100101);
            if (!((Boolean) ActionInvokeEntrance.actionIntercept(camera, new Object[0], 100101, "void", false, null, false).first).booleanValue()) {
                ActionInvokeEntrance.actionInvoke(null, camera, new Object[0], 100106, "com_android_ttcjpaysdk_base_bpea_permission_CJPayBPEAService$releaseCamera$1_android_hardware_Camera_release(Landroid/hardware/Camera;)V");
                camera.release();
                ActionInvokeEntrance.actionInvoke(null, camera, new Object[0], 100101, "com_android_ttcjpaysdk_base_bpea_permission_CJPayBPEAService$releaseCamera$1_android_hardware_Camera_release(Landroid/hardware/Camera;)V");
            }
        }
        return Unit.INSTANCE;
    }
}
