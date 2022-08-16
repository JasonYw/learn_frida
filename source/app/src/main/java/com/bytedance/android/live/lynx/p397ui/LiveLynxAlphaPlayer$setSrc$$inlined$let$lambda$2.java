package com.bytedance.android.live.lynx.p397ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.lynx.tasm.base.LLog;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p002O.C0002O;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.lynx.ui.LiveLynxAlphaPlayer$setSrc$$inlined$let$lambda$2 */
/* loaded from: classes10.dex */
public final class LiveLynxAlphaPlayer$setSrc$$inlined$let$lambda$2 extends Lambda implements Function2<Throwable, Boolean, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ String $directUrl$inlined;
    public final /* synthetic */ LiveLynxAlphaPlayer this$0;

    static {
        Covode.recordClassIndex(32349);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveLynxAlphaPlayer$setSrc$$inlined$let$lambda$2(LiveLynxAlphaPlayer liveLynxAlphaPlayer, String str) {
        super(2);
        this.this$0 = liveLynxAlphaPlayer;
        this.$directUrl$inlined = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Unit invoke(Throwable th, Boolean bool) {
        Throwable th2 = th;
        boolean booleanValue = bool.booleanValue();
        if (!PatchProxy.proxy(new Object[]{th2, Byte.valueOf(booleanValue ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(th2);
            String m25084C = C0002O.m25084C("failed when use resource loader to load ", this.this$0.mResourceURL, ", and error msg ", String.valueOf(th2.getMessage()));
            if (booleanValue) {
                LLog.m10232i("x-alpha-video", m25084C);
                this.this$0.legacySetSrc(this.$directUrl$inlined);
            } else {
                LiveLynxAlphaPlayer liveLynxAlphaPlayer = this.this$0;
                liveLynxAlphaPlayer.handleErrorMsg(m25084C, liveLynxAlphaPlayer.mResourceURL, -11);
            }
        }
        return Unit.INSTANCE;
    }
}
