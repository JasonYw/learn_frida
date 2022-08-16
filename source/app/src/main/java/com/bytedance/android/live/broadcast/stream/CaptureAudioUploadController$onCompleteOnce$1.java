package com.bytedance.android.live.broadcast.stream;

import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC80293Hkt;
import p003X.C87308Kak;

/* loaded from: classes3.dex */
public final class CaptureAudioUploadController$onCompleteOnce$1 extends Lambda implements Function0<Unit> {
    public static final CaptureAudioUploadController$onCompleteOnce$1 INSTANCE = new CaptureAudioUploadController$onCompleteOnce$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(17894);
    }

    public CaptureAudioUploadController$onCompleteOnce$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported) {
            ALogger.m15801d("CaptureAudioUploadController", "origin file update success");
            C87308Kak<Long> c87308Kak = AbstractC80293Hkt.LJIL;
            Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
            c87308Kak.LIZ(Long.valueOf(System.currentTimeMillis()));
        }
        return Unit.INSTANCE;
    }
}
