package com.bytedance.android.live.p482ui.artist;

import android.graphics.Paint;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.bytedance.android.live.ui.artist.TextArtist$linePaint$2 */
/* loaded from: classes12.dex */
public final class TextArtist$linePaint$2 extends Lambda implements Function0<Paint> {
    public static final TextArtist$linePaint$2 INSTANCE = new TextArtist$linePaint$2();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(36335);
    }

    public TextArtist$linePaint$2() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, android.graphics.Paint] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Paint mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        Paint paint = new Paint();
        paint.setStrokeWidth(1.0f);
        paint.setColor(-65536);
        paint.setStyle(Paint.Style.STROKE);
        return paint;
    }
}
