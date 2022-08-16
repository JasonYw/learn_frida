package com.bytedance.android.live.core.utils.rxutils;

import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* loaded from: classes.dex */
public final class RxUtilKt$getOnErrorTrace$1 extends Lambda implements Function1<Throwable, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ String $tag;

    static {
        Covode.recordClassIndex(23978);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RxUtilKt$getOnErrorTrace$1(String str) {
        super(1);
        this.$tag = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Throwable th) {
        Throwable th2 = th;
        if (!PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(th2);
            ALogger.m15798e(this.$tag, th2);
        }
        return Unit.INSTANCE;
    }
}
