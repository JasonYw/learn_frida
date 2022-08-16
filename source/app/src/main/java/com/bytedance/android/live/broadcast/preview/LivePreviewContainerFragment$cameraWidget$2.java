package com.bytedance.android.live.broadcast.preview;

import android.os.Bundle;
import com.bytedance.android.live.broadcast.AbstractC2868an;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.Widget;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class LivePreviewContainerFragment$cameraWidget$2 extends Lambda implements Function0<Widget> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ LivePreviewContainerFragment this$0;

    static {
        Covode.recordClassIndex(17092);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LivePreviewContainerFragment$cameraWidget$2(LivePreviewContainerFragment livePreviewContainerFragment) {
        super(0);
        this.this$0 = livePreviewContainerFragment;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [com.bytedance.ies.sdk.widgets.Widget, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Widget mo30099invoke() {
        boolean z = false;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        Bundle arguments = this.this$0.getArguments();
        int i = 720;
        if (arguments != null) {
            i = arguments.getInt("camera_width", 720);
        }
        Bundle arguments2 = this.this$0.getArguments();
        int i2 = 1280;
        if (arguments2 != null) {
            i2 = arguments2.getInt("camera_height", 1280);
        }
        Bundle arguments3 = this.this$0.getArguments();
        if (arguments3 != null) {
            z = arguments3.getBoolean("inject_surface", false);
        }
        AbstractC2868an abstractC2868an = this.this$0.LIZJ;
        if (abstractC2868an != null) {
            Bundle arguments4 = this.this$0.getArguments();
            int i3 = 2;
            if (arguments4 != null) {
                i3 = arguments4.getInt("camera_type", 2);
            }
            return abstractC2868an.LIZ(i3, i, i2, z);
        }
        return null;
    }
}
