package com.bytedance.android.live.broadcast.track;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes.dex */
public final class GamePromoteOrderTrack$trackOrderDialogShow$1 extends Lambda implements Function1<Map<String, String>, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Boolean $hasPlatformGift;

    static {
        Covode.recordClassIndex(17960);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GamePromoteOrderTrack$trackOrderDialogShow$1(Boolean bool) {
        super(1);
        this.$hasPlatformGift = bool;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Map<String, String> map) {
        String str;
        Map<String, String> map2 = map;
        if (!PatchProxy.proxy(new Object[]{map2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(map2);
            if (Intrinsics.areEqual(this.$hasPlatformGift, Boolean.TRUE)) {
                str = "1";
            } else {
                str = "0";
            }
            map2.put("is_benefit", str);
        }
        return Unit.INSTANCE;
    }
}
