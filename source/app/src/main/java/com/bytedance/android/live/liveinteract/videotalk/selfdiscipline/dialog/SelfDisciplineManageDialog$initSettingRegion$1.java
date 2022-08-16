package com.bytedance.android.live.liveinteract.videotalk.selfdiscipline.dialog;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.liveinteract.videotalk.selfdiscipline.dialog.SelfDisciplineManageDialog$mSelectTargetCallback$2;
import com.bytedance.android.livesdk.chatroom.model.interact.SelfDisciplineInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC80293Hkt;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C87308Kak;
import p003X.DialogC448093nv;
import p003X.DialogC448133nz;

/* loaded from: classes12.dex */
public final class SelfDisciplineManageDialog$initSettingRegion$1 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ DialogC448093nv this$0;

    static {
        Covode.recordClassIndex(30405);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelfDisciplineManageDialog$initSettingRegion$1(DialogC448093nv dialogC448093nv) {
        super(1);
        this.this$0 = dialogC448093nv;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        CharSequence charSequence;
        Object mo27335getValue;
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            DialogC448093nv dialogC448093nv = this.this$0;
            if (!PatchProxy.proxy(new Object[0], dialogC448093nv, DialogC448093nv.LIZ, false, 13).isSupported) {
                Context context = dialogC448093nv.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                TextView textView = (TextView) dialogC448093nv.findViewById(2131195291);
                if (textView != null) {
                    charSequence = textView.getText();
                } else {
                    charSequence = null;
                }
                String valueOf = String.valueOf(charSequence);
                C87308Kak<SelfDisciplineInfo> c87308Kak = AbstractC80293Hkt.f6989aQ;
                Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
                List<String> list = c87308Kak.LIZ().targetList;
                PatchProxyResult proxy = PatchProxy.proxy(new Object[0], dialogC448093nv, DialogC448093nv.LIZ, false, 2);
                if (proxy.isSupported) {
                    mo27335getValue = proxy.result;
                } else {
                    mo27335getValue = dialogC448093nv.LIZJ.mo27335getValue();
                }
                C116971W2r.LIZJ(new DialogC448133nz(context, valueOf, list, (SelfDisciplineManageDialog$mSelectTargetCallback$2.C49501) mo27335getValue));
            }
        }
        return Unit.INSTANCE;
    }
}
