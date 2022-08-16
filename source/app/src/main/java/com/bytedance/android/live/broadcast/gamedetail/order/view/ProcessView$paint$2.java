package com.bytedance.android.live.broadcast.gamedetail.order.view;

import android.graphics.Paint;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.LK1;

/* loaded from: classes12.dex */
public final class ProcessView$paint$2 extends Lambda implements Function0<Paint> {
    public static final ProcessView$paint$2 INSTANCE = new ProcessView$paint$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(16544);
    }

    public ProcessView$paint$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, android.graphics.Paint] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Paint mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        Paint paint = new Paint();
        paint.setStrokeWidth(LK1.LIZJ(4));
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        return paint;
    }
}
