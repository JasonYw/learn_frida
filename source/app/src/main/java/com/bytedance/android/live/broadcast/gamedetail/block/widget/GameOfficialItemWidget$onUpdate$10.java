package com.bytedance.android.live.broadcast.gamedetail.block.widget;

import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.LK1;

/* loaded from: classes22.dex */
public final class GameOfficialItemWidget$onUpdate$10 extends Lambda implements Function1<Boolean, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ GameOfficialItemWidget this$0;

    static {
        Covode.recordClassIndex(16399);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameOfficialItemWidget$onUpdate$10(GameOfficialItemWidget gameOfficialItemWidget) {
        super(1);
        this.this$0 = gameOfficialItemWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(booleanValue ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1).isSupported) {
            if (booleanValue) {
                ImageView imageView = this.this$0.LJFF;
                if (imageView != null) {
                    LK1.LIZJ(imageView);
                }
            } else {
                ImageView imageView2 = this.this$0.LJFF;
                if (imageView2 != null) {
                    LK1.LIZ(imageView2);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
