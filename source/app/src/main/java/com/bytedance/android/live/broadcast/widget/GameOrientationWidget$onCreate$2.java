package com.bytedance.android.live.broadcast.widget;

import android.view.View;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C438153Uz;
import p003X.C4574547f;
import p003X.C88440Kt0;

/* loaded from: classes5.dex */
public final class GameOrientationWidget$onCreate$2 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ GameOrientationWidget this$0;

    static {
        Covode.recordClassIndex(18343);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameOrientationWidget$onCreate$2(GameOrientationWidget gameOrientationWidget) {
        super(1);
        this.this$0 = gameOrientationWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        int i;
        String str;
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            if (!this.this$0.LIZJ) {
                GameOrientationWidget gameOrientationWidget = this.this$0;
                Integer LIZ = gameOrientationWidget.LIZIZ().LJIILJJIL().LIZ();
                if (LIZ != null) {
                    int intValue = LIZ.intValue();
                    if (!PatchProxy.proxy(new Object[]{Integer.valueOf(intValue)}, gameOrientationWidget, GameOrientationWidget.LIZ, false, 5).isSupported) {
                        if (intValue != 0) {
                            if (intValue == 1) {
                                C88440Kt0.LIZ(2131587837);
                            }
                        } else {
                            C88440Kt0.LIZ(2131587840);
                        }
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                }
            } else {
                Object tag = this.this$0.containerView.getTag(2131185003);
                if (tag != null) {
                    int intValue2 = ((Integer) tag).intValue();
                    if (intValue2 != 0 && intValue2 == 1) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                    this.this$0.LIZIZ().LJIILJJIL().LIZ(Integer.valueOf(i));
                    this.this$0.containerView.setTag(2131185003, Integer.valueOf(i));
                    C438153Uz.LIZ().putInt("xigua_game_live_broadcast_orientation", i).apply();
                    this.this$0.LIZ(i);
                    if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this.this$0, GameOrientationWidget.LIZ, false, 6).isSupported) {
                        if (i != 0) {
                            if (i == 1) {
                                C88440Kt0.LIZ(2131587836);
                            }
                        } else {
                            C88440Kt0.LIZ(2131587839);
                        }
                        HashMap hashMap = new HashMap();
                        if (((IUserService) ServiceManager.getService(IUserService.class)).user().LIZLLL()) {
                            str = String.valueOf(((IUserService) ServiceManager.getService(IUserService.class)).user().LIZIZ());
                        } else {
                            str = "0";
                        }
                        hashMap.put("anchor_id", str);
                        C4574547f.LIZ().LIZ("livesdk_live_take_transverse_screen", hashMap, new Object[0]);
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                }
            }
        }
        return Unit.INSTANCE;
    }
}
