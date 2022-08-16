package com.bytedance.android.live.liveinteract.digitavatar.ktvavatar;

import com.bytedance.android.live.liveinteract.digitavatar.C4382d;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p003X.C2WC;
import p003X.C88440Kt0;

/* loaded from: classes3.dex */
public final class KtvDigitAvatarWidget$$special$$inlined$apply$lambda$2 extends Lambda implements Function2<Integer, Boolean, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ KtvDigitAvatarWidget this$0;

    static {
        Covode.recordClassIndex(26649);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KtvDigitAvatarWidget$$special$$inlined$apply$lambda$2(KtvDigitAvatarWidget ktvDigitAvatarWidget) {
        super(2);
        this.this$0 = ktvDigitAvatarWidget;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Unit invoke(Integer num, Boolean bool) {
        C2WC<KtvSingMode> LIZ;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(num.intValue()), Byte.valueOf(bool.booleanValue() ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1).isSupported && this.this$0.LJI == KtvSingMode.VIDEO) {
            C88440Kt0.LIZ("房间性能异常，暂不支持视频及虚拟形象模式");
            C4382d LIZ2 = C4382d.LIZLLL.LIZ();
            if (LIZ2 != null && (LIZ = LIZ2.LIZ()) != null) {
                LIZ.LIZ(KtvSingMode.AUDIO);
            }
        }
        return Unit.INSTANCE;
    }
}
