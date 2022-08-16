package com.bytedance.android.live.core.utils;

import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* loaded from: classes.dex */
public final class UtilityKotlinExtentionsKt$throttle$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Function0 $block;
    public final /* synthetic */ Ref.LongRef $lastClick;
    public final /* synthetic */ long $minInterval;

    static {
        Covode.recordClassIndex(23831);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UtilityKotlinExtentionsKt$throttle$1(long j, Ref.LongRef longRef, Function0 function0) {
        super(0);
        this.$minInterval = j;
        this.$lastClick = longRef;
        this.$block = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (uptimeMillis - this.$lastClick.element > this.$minInterval) {
                this.$lastClick.element = uptimeMillis;
                this.$block.mo30099invoke();
            }
        }
        return Unit.INSTANCE;
    }
}
