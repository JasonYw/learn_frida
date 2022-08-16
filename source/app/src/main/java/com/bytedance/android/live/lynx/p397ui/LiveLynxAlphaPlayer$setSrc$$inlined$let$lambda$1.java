package com.bytedance.android.live.lynx.p397ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.xelement.api.XResourceFrom;
import com.bytedance.ies.xelement.api.XResourceLoadInfo;
import com.lynx.tasm.base.LLog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C98762Ov6;

/* renamed from: com.bytedance.android.live.lynx.ui.LiveLynxAlphaPlayer$setSrc$$inlined$let$lambda$1 */
/* loaded from: classes7.dex */
public final class LiveLynxAlphaPlayer$setSrc$$inlined$let$lambda$1 extends Lambda implements Function1<XResourceLoadInfo, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ String $directUrl$inlined;
    public final /* synthetic */ LiveLynxAlphaPlayer this$0;

    static {
        Covode.recordClassIndex(32348);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveLynxAlphaPlayer$setSrc$$inlined$let$lambda$1(LiveLynxAlphaPlayer liveLynxAlphaPlayer, String str) {
        super(1);
        this.this$0 = liveLynxAlphaPlayer;
        this.$directUrl$inlined = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(XResourceLoadInfo xResourceLoadInfo) {
        String resourcePath;
        XResourceLoadInfo xResourceLoadInfo2 = xResourceLoadInfo;
        if (!PatchProxy.proxy(new Object[]{xResourceLoadInfo2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(xResourceLoadInfo2);
            LiveLynxAlphaPlayer liveLynxAlphaPlayer = this.this$0;
            liveLynxAlphaPlayer.useResourceImg = true;
            liveLynxAlphaPlayer.resourceFrom = xResourceLoadInfo2.getResourceFrom();
            LLog.m10232i("x-alpha-video", "load resource success: " + xResourceLoadInfo2.getResourcePath() + ", " + xResourceLoadInfo2.getResourceType());
            XResourceFrom resourceFrom = xResourceLoadInfo2.getResourceFrom();
            if (resourceFrom != null) {
                int i = C98762Ov6.LIZ[resourceFrom.ordinal()];
                if (i != 1 && i != 2) {
                    if (i == 3 && (resourcePath = xResourceLoadInfo2.getResourcePath()) != null) {
                        this.this$0.legacySetSrc(resourcePath);
                    }
                } else {
                    String resourcePath2 = xResourceLoadInfo2.getResourcePath();
                    if (resourcePath2 != null) {
                        LiveLynxAlphaPlayer liveLynxAlphaPlayer2 = this.this$0;
                        String str = this.$directUrl$inlined;
                        Intrinsics.checkNotNullExpressionValue(str, "");
                        liveLynxAlphaPlayer2.resolveResAndTryPlay(resourcePath2, str);
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
