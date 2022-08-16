package com.bytedance.android.live.liveinteract.videotalk.dialog;

import android.view.View;
import android.widget.Switch;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.DialogC77436Gfu;

/* loaded from: classes3.dex */
public final class VideoTalkAVPermissionDialog$initLinkVideoSetting$2 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ DialogC77436Gfu this$0;

    static {
        Covode.recordClassIndex(30019);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoTalkAVPermissionDialog$initLinkVideoSetting$2(DialogC77436Gfu dialogC77436Gfu) {
        super(1);
        this.this$0 = dialogC77436Gfu;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            Switch r0 = (Switch) this.this$0.findViewById(2131191200);
            Intrinsics.checkNotNullExpressionValue(r0, "");
            if (!r0.isChecked()) {
                Switch r02 = (Switch) this.this$0.findViewById(2131191201);
                Intrinsics.checkNotNullExpressionValue(r02, "");
                if (!r02.isChecked()) {
                    Switch r03 = (Switch) this.this$0.findViewById(2131191200);
                    Intrinsics.checkNotNullExpressionValue(r03, "");
                    r03.setChecked(true);
                }
            }
            Switch r1 = (Switch) this.this$0.findViewById(2131191201);
            Intrinsics.checkNotNullExpressionValue(r1, "");
            Switch r04 = (Switch) this.this$0.findViewById(2131191201);
            Intrinsics.checkNotNullExpressionValue(r04, "");
            r1.setChecked(true ^ r04.isChecked());
        }
        return Unit.INSTANCE;
    }
}
