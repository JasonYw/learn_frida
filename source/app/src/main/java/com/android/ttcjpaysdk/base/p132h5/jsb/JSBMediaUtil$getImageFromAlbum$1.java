package com.android.ttcjpaysdk.base.p132h5.jsb;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.sdk.bridge.model.IBridgeContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C137422ch0;

/* renamed from: com.android.ttcjpaysdk.base.h5.jsb.JSBMediaUtil$getImageFromAlbum$1 */
/* loaded from: classes17.dex */
public final class JSBMediaUtil$getImageFromAlbum$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Activity $activity;
    public final /* synthetic */ IBridgeContext $bridgeContext;

    static {
        Covode.recordClassIndex(6136);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JSBMediaUtil$getImageFromAlbum$1(Activity activity, IBridgeContext iBridgeContext) {
        super(0);
        this.$activity = activity;
        this.$bridgeContext = iBridgeContext;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            C137422ch0.LIZIZ.LIZ(this.$activity, new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI), 9981, new AbstractC2142f() { // from class: com.android.ttcjpaysdk.base.h5.jsb.JSBMediaUtil$getImageFromAlbum$1.1
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(6137);
                }

                @Override // com.android.ttcjpaysdk.base.p132h5.jsb.AbstractC2142f
                public final void LIZ(int i, int i2, Intent intent) {
                    Uri data;
                    String LIZ2;
                    if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    String str = "";
                    if (intent != null && (data = intent.getData()) != null && (LIZ2 = C137422ch0.LIZ(C137422ch0.LIZIZ, JSBMediaUtil$getImageFromAlbum$1.this.$activity, data, null, 4, null)) != null) {
                        str = LIZ2;
                    }
                    C137422ch0.LIZIZ.LIZ(JSBMediaUtil$getImageFromAlbum$1.this.$activity, JSBMediaUtil$getImageFromAlbum$1.this.$bridgeContext, str);
                }
            });
        }
        return Unit.INSTANCE;
    }
}
