package com.bytedance.android.live.broadcast.gamedetail.block.widget;

import android.view.View;
import android.widget.Button;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.L6C;

/* loaded from: classes5.dex */
public final class GameOfficialItemWidget$onUpdate$8 extends Lambda implements Function1<Boolean, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C3092r $props;
    public final /* synthetic */ GameOfficialItemWidget this$0;

    static {
        Covode.recordClassIndex(16406);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameOfficialItemWidget$onUpdate$8(GameOfficialItemWidget gameOfficialItemWidget, C3092r c3092r) {
        super(1);
        this.this$0 = gameOfficialItemWidget;
        this.$props = c3092r;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Boolean bool) {
        String str;
        final boolean booleanValue = bool.booleanValue();
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(booleanValue ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1).isSupported) {
            Button button = this.this$0.LIZIZ;
            if (button != null) {
                if (booleanValue) {
                    str = "已关注";
                } else {
                    str = "关注";
                }
                button.setText(str);
            }
            Button button2 = this.this$0.LIZIZ;
            if (button2 != null) {
                button2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.live.broadcast.gamedetail.block.widget.GameOfficialItemWidget$onUpdate$8.1
                    public static ChangeQuickRedirect LIZ;

                    static {
                        Covode.recordClassIndex(16407);
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
                            return;
                        }
                        GameOfficialItemWidget$onUpdate$8.this.this$0.LIZJ(new L6C(booleanValue, GameOfficialItemWidget$onUpdate$8.this.$props.LIZIZ));
                    }
                });
            }
        }
        return Unit.INSTANCE;
    }
}
