package com.android.ttcjpaysdk.base.p132h5.jsb;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.sdk.bridge.model.IBridgeContext;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p002O.C0002O;
import p003X.C106834S4u;
import p003X.C116971W2r;
import p003X.C137422ch0;
import p003X.C7D7;

/* renamed from: com.android.ttcjpaysdk.base.h5.jsb.JSBMediaUtil$getImageFromCamera$1 */
/* loaded from: classes17.dex */
public final class JSBMediaUtil$getImageFromCamera$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Activity $activity;
    public final /* synthetic */ IBridgeContext $bridgeContext;
    public final /* synthetic */ boolean $saveToDCIM;
    public final /* synthetic */ boolean $useFrontCamera;

    static {
        Covode.recordClassIndex(6138);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JSBMediaUtil$getImageFromCamera$1(boolean z, Activity activity, boolean z2, IBridgeContext iBridgeContext) {
        super(0);
        this.$saveToDCIM = z;
        this.$activity = activity;
        this.$useFrontCamera = z2;
        this.$bridgeContext = iBridgeContext;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [boolean, int] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        final Uri LIZ;
        Intent intent;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            if (!this.$saveToDCIM) {
                LIZ = null;
            } else {
                Activity activity = this.$activity;
                new StringBuilder();
                LIZ = C106834S4u.LIZ(activity, C0002O.m25086C(String.valueOf(System.currentTimeMillis()), ".jpg"));
            }
            C137422ch0 c137422ch0 = C137422ch0.LIZIZ;
            ?? r6 = this.$useFrontCamera;
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Byte.valueOf(r6 == true ? (byte) 1 : (byte) 0), LIZ}, c137422ch0, C137422ch0.LIZ, false, 9);
            if (proxy.isSupported) {
                intent = (Intent) proxy.result;
            } else {
                Intent intent2 = new Intent("android.media.action.IMAGE_CAPTURE");
                if (LIZ != null) {
                    intent2.putExtra("output", LIZ);
                    intent2.addFlags(1);
                    intent2.addFlags(2);
                }
                intent2.putExtra("android.intent.extras.CAMERA_FACING", r6 == true ? 1 : 0);
                intent2.putExtra("android.intent.extras.LENS_FACING_FRONT", (int) r6);
                intent2.putExtra("android.intent.extra.USE_FRONT_CAMERA", (boolean) r6);
                intent = intent2;
            }
            C137422ch0.LIZIZ.LIZ(this.$activity, intent, 3721, new AbstractC2142f() { // from class: com.android.ttcjpaysdk.base.h5.jsb.JSBMediaUtil$getImageFromCamera$1.1
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(6139);
                }

                @Override // com.android.ttcjpaysdk.base.p132h5.jsb.AbstractC2142f
                public final void LIZ(int i, int i2, Intent intent3) {
                    Object obj;
                    String sb;
                    Bundle extras;
                    if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent3}, this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    String str = "";
                    if (LIZ != null) {
                        String LIZ2 = C137422ch0.LIZ(C137422ch0.LIZIZ, JSBMediaUtil$getImageFromCamera$1.this.$activity, LIZ, null, 4, null);
                        if (LIZ2 != null) {
                            str = LIZ2;
                        }
                    } else {
                        if (intent3 != null && (extras = intent3.getExtras()) != null) {
                            obj = extras.get(C2521l.LJIIL);
                        } else {
                            obj = null;
                        }
                        Bitmap bitmap = (Bitmap) obj;
                        C7D7 c7d7 = C7D7.LIZIZ;
                        C137422ch0 c137422ch02 = C137422ch0.LIZIZ;
                        Activity activity2 = JSBMediaUtil$getImageFromCamera$1.this.$activity;
                        PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{activity2}, c137422ch02, C137422ch0.LIZ, false, 2);
                        if (proxy2.isSupported) {
                            sb = (String) proxy2.result;
                        } else {
                            StringBuilder sb2 = new StringBuilder();
                            File LIZ3 = C116971W2r.LIZ(activity2);
                            if (LIZ3 == null) {
                                LIZ3 = C116971W2r.LIZIZ(activity2);
                            }
                            Intrinsics.checkNotNullExpressionValue(LIZ3, str);
                            sb2.append(LIZ3.getPath());
                            sb2.append("/jsb_img_cache_");
                            sb2.append(activity2.hashCode());
                            sb = sb2.toString();
                        }
                        str = c7d7.LIZ(sb, bitmap);
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                    }
                    C137422ch0.LIZIZ.LIZ(JSBMediaUtil$getImageFromCamera$1.this.$activity, JSBMediaUtil$getImageFromCamera$1.this.$bridgeContext, str);
                }
            });
        }
        return Unit.INSTANCE;
    }
}
