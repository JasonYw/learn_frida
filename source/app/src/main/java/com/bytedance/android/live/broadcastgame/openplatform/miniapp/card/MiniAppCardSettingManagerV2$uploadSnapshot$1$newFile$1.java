package com.bytedance.android.live.broadcastgame.openplatform.miniapp.card;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C116971W2r;
import p003X.LK1;

/* loaded from: classes5.dex */
public final class MiniAppCardSettingManagerV2$uploadSnapshot$1$newFile$1 extends Lambda implements Function1<Bitmap, Bitmap> {
    public static final MiniAppCardSettingManagerV2$uploadSnapshot$1$newFile$1 INSTANCE = new MiniAppCardSettingManagerV2$uploadSnapshot$1$newFile$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(21583);
    }

    public MiniAppCardSettingManagerV2$uploadSnapshot$1$newFile$1() {
        super(1);
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [android.graphics.Bitmap, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Bitmap invoke(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{bitmap2}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        if (bitmap2 != null) {
            int LIZ = (int) LK1.LIZ(44.0f);
            return C116971W2r.LIZ(bitmap2, 0, LIZ, bitmap2.getWidth(), bitmap2.getHeight() - LIZ);
        }
        return null;
    }
}
