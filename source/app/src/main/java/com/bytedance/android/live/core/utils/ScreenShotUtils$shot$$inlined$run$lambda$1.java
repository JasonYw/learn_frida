package com.bytedance.android.live.core.utils;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import android.view.Window;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.livesdkapi.roomplayer.ILivePlayerClient;
import com.bytedance.android.livesdkapi.view.IRenderView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C116971W2r;

/* loaded from: classes5.dex */
public final class ScreenShotUtils$shot$$inlined$run$lambda$1 extends Lambda implements Function1<Bitmap, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Function1 $callback$inlined;
    public final /* synthetic */ Canvas $canvas;
    public final /* synthetic */ ILivePlayerClient $livePlayerClient;
    public final /* synthetic */ Bitmap $result;
    public final /* synthetic */ Window $this_run;

    static {
        Covode.recordClassIndex(23822);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenShotUtils$shot$$inlined$run$lambda$1(Window window, ILivePlayerClient iLivePlayerClient, Canvas canvas, Bitmap bitmap, Function1 function1) {
        super(1);
        this.$this_run = window;
        this.$livePlayerClient = iLivePlayerClient;
        this.$canvas = canvas;
        this.$result = bitmap;
        this.$callback$inlined = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Bitmap bitmap) {
        View findViewById;
        MethodCollector.m14708i(1600);
        Bitmap bitmap2 = bitmap;
        if (!PatchProxy.proxy(new Object[]{bitmap2}, this, changeQuickRedirect, false, 1).isSupported) {
            if (bitmap2 != null) {
                IRenderView renderView = this.$livePlayerClient.getRenderView();
                if (renderView == null || (findViewById = renderView.getSelfView()) == null) {
                    findViewById = this.$this_run.getDecorView().findViewById(2131193015);
                    Intrinsics.checkNotNullExpressionValue(findViewById, "");
                }
                int[] iArr = new int[2];
                findViewById.getLocationOnScreen(iArr);
                this.$canvas.drawBitmap(bitmap2, (Rect) null, new Rect(iArr[0], iArr[1], iArr[0] + bitmap2.getWidth(), iArr[1] + bitmap2.getHeight()), (Paint) null);
                View decorView = this.$this_run.getDecorView();
                Intrinsics.checkNotNullExpressionValue(decorView, "");
                int width = decorView.getWidth();
                View decorView2 = this.$this_run.getDecorView();
                Intrinsics.checkNotNullExpressionValue(decorView2, "");
                Bitmap LIZ = C116971W2r.LIZ(width, decorView2.getHeight(), Bitmap.Config.ARGB_8888);
                this.$this_run.getDecorView().draw(new Canvas(LIZ));
                this.$canvas.drawBitmap(LIZ, 0.0f, 0.0f, (Paint) null);
            } else {
                ALogger.m15801d("ScreenShotUtils", "直播画面不存在");
                this.$this_run.getDecorView().draw(this.$canvas);
            }
            this.$this_run.getDecorView().post(new Runnable() { // from class: com.bytedance.android.live.core.utils.ScreenShotUtils$shot$$inlined$run$lambda$1.1
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(23823);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    ScreenShotUtils$shot$$inlined$run$lambda$1.this.$callback$inlined.invoke(ScreenShotUtils$shot$$inlined$run$lambda$1.this.$result);
                }
            });
        }
        Unit unit = Unit.INSTANCE;
        MethodCollector.m14707o(1600);
        return unit;
    }
}
