package com.bytedance.android.live.liveinteract.voicechat.video;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC80486Ho0;
import p003X.C80478Hns;

/* loaded from: classes3.dex */
public final class KtvVideoManager$realCloseSelfCamera$1 extends Lambda implements Function1<Bitmap, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ AbstractC80486Ho0 $closeType;
    public final /* synthetic */ int $oldMode;
    public final /* synthetic */ C80478Hns this$0;

    static {
        Covode.recordClassIndex(31734);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KtvVideoManager$realCloseSelfCamera$1(C80478Hns c80478Hns, int i, AbstractC80486Ho0 abstractC80486Ho0) {
        super(1);
        this.this$0 = c80478Hns;
        this.$oldMode = i;
        this.$closeType = abstractC80486Ho0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        if (!PatchProxy.proxy(new Object[]{bitmap2}, this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.LIZ(this.$oldMode, this.$closeType, bitmap2);
        }
        return Unit.INSTANCE;
    }
}
