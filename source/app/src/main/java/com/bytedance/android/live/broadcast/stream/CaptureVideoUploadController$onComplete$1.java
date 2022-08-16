package com.bytedance.android.live.broadcast.stream;

import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC80293Hkt;
import p003X.C82009ITz;
import p003X.C87308Kak;

/* loaded from: classes3.dex */
public final class CaptureVideoUploadController$onComplete$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C82009ITz this$0;

    static {
        Covode.recordClassIndex(17900);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CaptureVideoUploadController$onComplete$1(C82009ITz c82009ITz) {
        super(0);
        this.this$0 = c82009ITz;
    }

    /* renamed from: com.bytedance.android.live.broadcast.stream.CaptureVideoUploadController$onComplete$1$1 */
    /* loaded from: classes3.dex */
    public static final class C32381 extends Lambda implements Function0<Unit> {
        public static final C32381 INSTANCE = new C32381();
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(17901);
        }

        public C32381() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: invoke */
        public final /* synthetic */ Unit mo30099invoke() {
            if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
                ALogger.m15801d("CaptureVideoUploadController", "effect file update success");
                C87308Kak<Long> c87308Kak = AbstractC80293Hkt.LJIJJLI;
                Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
                c87308Kak.LIZ(Long.valueOf(System.currentTimeMillis()));
            }
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            ALogger.m15801d("CaptureVideoUploadController", "origin file update success");
            C82009ITz c82009ITz = this.this$0;
            c82009ITz.LIZ(new File(c82009ITz.LIZIZ()), "2", C32381.INSTANCE);
        }
        return Unit.INSTANCE;
    }
}
