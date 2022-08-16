package com.bytedance.android.live.liveinteract.voicechat.video;

import android.graphics.Bitmap;
import android.view.SurfaceView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC80491Ho5;
import p003X.C80478Hns;

/* loaded from: classes3.dex */
public final class KtvVideoManager$showSelfVideoView$1 extends Lambda implements Function1<Bitmap, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ SurfaceView $surfaceView;
    public final /* synthetic */ C80478Hns this$0;

    static {
        Covode.recordClassIndex(31737);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KtvVideoManager$showSelfVideoView$1(C80478Hns c80478Hns, SurfaceView surfaceView) {
        super(1);
        this.this$0 = c80478Hns;
        this.$surfaceView = surfaceView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        if (!PatchProxy.proxy(new Object[]{bitmap2}, this, changeQuickRedirect, false, 1).isSupported) {
            AbstractC80491Ho5 abstractC80491Ho5 = this.this$0.f7294LJ;
            if (abstractC80491Ho5 != null) {
                abstractC80491Ho5.LIZ(this.$surfaceView, this.this$0.LJII(), true, bitmap2);
            }
            this.this$0.LIZJ("openCamera");
        }
        return Unit.INSTANCE;
    }
}
