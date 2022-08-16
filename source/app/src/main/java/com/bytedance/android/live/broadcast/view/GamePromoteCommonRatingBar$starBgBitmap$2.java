package com.bytedance.android.live.broadcast.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p003X.C116971W2r;

/* loaded from: classes5.dex */
public final class GamePromoteCommonRatingBar$starBgBitmap$2 extends Lambda implements Function0<Bitmap> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ GamePromoteCommonRatingBar this$0;

    static {
        Covode.recordClassIndex(18089);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GamePromoteCommonRatingBar$starBgBitmap$2(GamePromoteCommonRatingBar gamePromoteCommonRatingBar, Context context) {
        super(0);
        this.this$0 = gamePromoteCommonRatingBar;
        this.$context = context;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [android.graphics.Bitmap, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Bitmap mo30099invoke() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return proxy.result;
        }
        Bitmap LIZ = C116971W2r.LIZ(this.this$0.LIZJ, this.this$0.LIZJ, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(LIZ);
        Drawable drawable = ContextCompat.getDrawable(this.$context, this.this$0.f25953LJ);
        if (drawable != null) {
            drawable.setBounds(0, 0, this.this$0.LIZJ, this.this$0.LIZJ);
            drawable.draw(canvas);
        }
        return LIZ;
    }
}
