package com.bytedance.android.live.broadcast.stream;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p002O.C0002O;
import p003X.LK5;

/* loaded from: classes2.dex */
public final class CaptureVideoUploadController$effectVideoPath$2 extends Lambda implements Function0<String> {
    public static final CaptureVideoUploadController$effectVideoPath$2 INSTANCE = new CaptureVideoUploadController$effectVideoPath$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(17899);
    }

    public CaptureVideoUploadController$effectVideoPath$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, java.lang.String] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ String mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        new StringBuilder();
        File dir = LK5.LJIIJ().getDir("live_capture_video", 0);
        Intrinsics.checkNotNullExpressionValue(dir, "");
        return C0002O.m25085C(dir.getAbsolutePath(), File.separator, "effect_video.h264");
    }
}
