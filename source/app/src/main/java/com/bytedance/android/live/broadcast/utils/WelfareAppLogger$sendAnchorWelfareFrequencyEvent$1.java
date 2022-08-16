package com.bytedance.android.live.broadcast.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes.dex */
public final class WelfareAppLogger$sendAnchorWelfareFrequencyEvent$1 extends Lambda implements Function1<HashMap<String, String>, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ long $frequency;

    static {
        Covode.recordClassIndex(17973);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WelfareAppLogger$sendAnchorWelfareFrequencyEvent$1(long j) {
        super(1);
        this.$frequency = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(HashMap<String, String> hashMap) {
        HashMap<String, String> hashMap2 = hashMap;
        if (!PatchProxy.proxy(new Object[]{hashMap2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(hashMap2);
            hashMap2.put("frequency", String.valueOf(this.$frequency));
        }
        return Unit.INSTANCE;
    }
}
