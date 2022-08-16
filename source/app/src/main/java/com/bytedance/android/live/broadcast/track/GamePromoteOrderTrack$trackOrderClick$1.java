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
public final class GamePromoteOrderTrack$trackOrderClick$1 extends Lambda implements Function1<Map<String, String>, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Integer $giftNum;
    public final /* synthetic */ Boolean $hasGift;

    static {
        Covode.recordClassIndex(17958);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GamePromoteOrderTrack$trackOrderClick$1(Boolean bool, Integer num) {
        super(1);
        this.$hasGift = bool;
        this.$giftNum = num;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Map<String, String> map) {
        String str;
        Integer num;
        Map<String, String> map2 = map;
        if (!PatchProxy.proxy(new Object[]{map2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(map2);
            if (Intrinsics.areEqual(this.$hasGift, Boolean.TRUE)) {
                str = "1";
            } else {
                str = "0";
            }
            map2.put("is_benefit", str);
            if (Intrinsics.areEqual(this.$hasGift, Boolean.TRUE) && (num = this.$giftNum) != null) {
                map2.put("num_benefit", String.valueOf(num.intValue()));
            }
        }
        return Unit.INSTANCE;
    }
}
