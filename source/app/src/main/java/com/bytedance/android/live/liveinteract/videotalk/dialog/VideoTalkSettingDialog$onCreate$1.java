package com.bytedance.android.live.liveinteract.videotalk.dialog;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.DialogC77790Glc;

/* loaded from: classes3.dex */
public final class VideoTalkSettingDialog$onCreate$1 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ DialogC77790Glc this$0;

    static {
        Covode.recordClassIndex(30039);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoTalkSettingDialog$onCreate$1(DialogC77790Glc dialogC77790Glc) {
        super(1);
        this.this$0 = dialogC77790Glc;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            this.this$0.LJI();
        }
        return Unit.INSTANCE;
    }
}