package com.bytedance.android.live.broadcastgame.opengame.performance;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.widget.v$a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p003X.C87421KcZ;
import p003X.C88440Kt0;

/* loaded from: classes5.dex */
public final class OpenPlatformPerfRuntime$stopPerfTestBySwitch$2 extends Lambda implements Function2<Integer, Long, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ C87421KcZ this$0;

    static {
        Covode.recordClassIndex(20811);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenPlatformPerfRuntime$stopPerfTestBySwitch$2(C87421KcZ c87421KcZ) {
        super(2);
        this.this$0 = c87421KcZ;
    }

    /* renamed from: com.bytedance.android.live.broadcastgame.opengame.performance.OpenPlatformPerfRuntime$stopPerfTestBySwitch$2$2 */
    /* loaded from: classes5.dex */
    public static final class DialogInterface$OnClickListenerC36162 implements DialogInterface.OnClickListener {
        public static ChangeQuickRedirect LIZ;
        public static final DialogInterface$OnClickListenerC36162 LIZIZ = new DialogInterface$OnClickListenerC36162();

        static {
            Covode.recordClassIndex(20813);
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            if (PatchProxy.proxy(new Object[]{dialogInterface, Integer.valueOf(i)}, this, LIZ, false, 1).isSupported) {
                return;
            }
            C88440Kt0.LIZ("性能测试继续");
            dialogInterface.dismiss();
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Unit invoke(Integer num, Long l) {
        int intValue = num.intValue();
        long longValue = l.longValue();
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(intValue), new Long(longValue)}, this, changeQuickRedirect, false, 1).isSupported) {
            if (intValue == 0) {
                C88440Kt0.LIZ("当前测试任务任务未启动");
            } else {
                v$a v_a = new v$a(this.this$0.LJIIIZ);
                v_a.LIZ(0);
                v_a.LIZIZ("性能测试时长不足" + longValue + "分钟, \n是否继续退出性能测试？");
                v_a.LIZ("提示");
                v_a.LIZIZ(false);
                v_a.LIZIZ(0, "确定", new DialogInterface.OnClickListener() { // from class: com.bytedance.android.live.broadcastgame.opengame.performance.OpenPlatformPerfRuntime$stopPerfTestBySwitch$2.1
                    public static ChangeQuickRedirect LIZ;

                    static {
                        Covode.recordClassIndex(20812);
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        if (PatchProxy.proxy(new Object[]{dialogInterface, Integer.valueOf(i)}, this, LIZ, false, 1).isSupported) {
                            return;
                        }
                        C88440Kt0.LIZ("性能测试已结束");
                        OpenPlatformPerfRuntime$stopPerfTestBySwitch$2.this.this$0.LIZLLL();
                        OpenPlatformPerfRuntime$stopPerfTestBySwitch$2.this.this$0.LIZIZ().LIZ();
                        dialogInterface.dismiss();
                    }
                }).LIZIZ(1, "取消", DialogInterface$OnClickListenerC36162.LIZIZ).LIZ(0, true).LIZJ();
            }
        }
        return Unit.INSTANCE;
    }
}
