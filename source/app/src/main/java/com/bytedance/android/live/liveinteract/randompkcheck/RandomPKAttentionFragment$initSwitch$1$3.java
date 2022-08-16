package com.bytedance.android.live.liveinteract.randompkcheck;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C79762HcK;

/* loaded from: classes3.dex */
public final class RandomPKAttentionFragment$initSwitch$1$3 extends Lambda implements Function1<Boolean, Unit> {
    public static final RandomPKAttentionFragment$initSwitch$1$3 INSTANCE = new RandomPKAttentionFragment$initSwitch$1$3();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(29589);
    }

    public RandomPKAttentionFragment$initSwitch$1$3() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Boolean bool) {
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(bool.booleanValue() ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1).isSupported) {
            C79762HcK.LIZ(C4832a.LIZJ, false, false, 2, null);
        }
        return Unit.INSTANCE;
    }
}
