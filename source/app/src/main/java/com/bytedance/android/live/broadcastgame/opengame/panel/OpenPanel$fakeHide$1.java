package com.bytedance.android.live.broadcastgame.opengame.panel;

import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.LHN;

/* loaded from: classes5.dex */
public final class OpenPanel$fakeHide$1 extends Lambda implements Function0<Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ DialogC3611f this$0;

    static {
        Covode.recordClassIndex(20770);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenPanel$fakeHide$1(DialogC3611f dialogC3611f) {
        super(0);
        this.this$0 = dialogC3611f;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: invoke */
    public final /* synthetic */ Unit mo30099invoke() {
        WindowManager.LayoutParams attributes;
        int i;
        int i2;
        int i3;
        View decorView;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1).isSupported && this.this$0.LJI) {
            DialogC3611f dialogC3611f = this.this$0;
            dialogC3611f.LJI = false;
            Window window = dialogC3611f.getWindow();
            if (window != null && (attributes = window.getAttributes()) != null) {
                Window window2 = this.this$0.getWindow();
                if (window2 != null && (decorView = window2.getDecorView()) != null) {
                    i = decorView.getMeasuredHeight();
                } else {
                    i = 0;
                }
                int i4 = attributes.y;
                int i5 = attributes.y;
                DialogC3611f dialogC3611f2 = this.this$0;
                Context context = dialogC3611f2.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i), context}, dialogC3611f2, DialogC3611f.LIZ, false, 29);
                if (proxy.isSupported) {
                    i3 = ((Integer) proxy.result).intValue();
                } else {
                    if (LHN.LIZJ(context)) {
                        i2 = LHN.LIZ();
                    } else {
                        i2 = 0;
                    }
                    if (i <= 0) {
                        i = UIUtils.getScreenHeight(context) << 1;
                    }
                    i3 = -((int) ((i * 1.2d) + i2));
                }
                this.this$0.LIZ(i4, i5 + i3, false);
            }
        }
        return Unit.INSTANCE;
    }
}
