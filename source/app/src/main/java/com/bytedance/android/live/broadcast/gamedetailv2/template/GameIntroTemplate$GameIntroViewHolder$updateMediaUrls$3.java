package com.bytedance.android.live.broadcast.gamedetailv2.template;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class GameIntroTemplate$GameIntroViewHolder$updateMediaUrls$3 extends Lambda implements Function1<Integer, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ e$a this$0;

    static {
        Covode.recordClassIndex(16695);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameIntroTemplate$GameIntroViewHolder$updateMediaUrls$3(e$a e_a) {
        super(1);
        this.this$0 = e_a;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Integer num) {
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(num.intValue())}, this, changeQuickRedirect, false, 1).isSupported) {
            this.this$0.f25892LJ.post(new Runnable() { // from class: com.bytedance.android.live.broadcast.gamedetailv2.template.GameIntroTemplate$GameIntroViewHolder$updateMediaUrls$3.1
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(16696);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                        return;
                    }
                    e$a e_a = GameIntroTemplate$GameIntroViewHolder$updateMediaUrls$3.this.this$0;
                    if (!PatchProxy.proxy(new Object[0], e_a, e$a.LIZ, false, 13).isSupported && e_a.LJFF && e_a.f25892LJ.getLocalVisibleRect(e_a.LJI)) {
                        if (e_a.LJI.top == 0 && e_a.LJI.bottom == e_a.f25892LJ.getHeight()) {
                            e_a.LIZLLL.LIZIZ();
                        } else {
                            e_a.LIZLLL.LIZJ();
                        }
                    }
                }
            });
        }
        return Unit.INSTANCE;
    }
}
