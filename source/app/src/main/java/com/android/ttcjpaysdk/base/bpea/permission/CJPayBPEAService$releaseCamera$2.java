package com.android.ttcjpaysdk.base.bpea.permission;

import android.hardware.Camera;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.bpea.entry.api.camera.Camera1Entry;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes10.dex */
public final class CJPayBPEAService$releaseCamera$2 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Camera $camera;
    public final /* synthetic */ String $token;

    static {
        Covode.recordClassIndex(5991);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CJPayBPEAService$releaseCamera$2(Camera camera, String str) {
        super(0);
        this.$camera = camera;
        this.$token = str;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        Camera camera;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported && (camera = this.$camera) != null) {
            Camera1Entry.Companion.release(camera, TokenCert.Companion.with(this.$token));
        }
        return Unit.INSTANCE;
    }
}
