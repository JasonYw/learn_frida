package com.bytedance.android.live.liveinteract.voicechat.dialog;

import android.view.View;
import com.bytedance.android.live.liveinteract.voicechat.VoiceChatMuteManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.AbstractC79093HFv;
import p003X.C106862S5w;
import p003X.C78737H2d;
import p003X.DialogC78738H2e;

/* loaded from: classes3.dex */
public final class VoiceChatAnchorManageDialog$initViews$1 extends Lambda implements Function1<View, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ DialogC78738H2e this$0;

    static {
        Covode.recordClassIndex(30986);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceChatAnchorManageDialog$initViews$1(DialogC78738H2e dialogC78738H2e) {
        super(1);
        this.this$0 = dialogC78738H2e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(View view) {
        if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(view);
            DialogC78738H2e dialogC78738H2e = this.this$0;
            if (!PatchProxy.proxy(new Object[0], dialogC78738H2e, DialogC78738H2e.LIZ, false, 6).isSupported) {
                VoiceChatMuteManager voiceChatMuteManager = dialogC78738H2e.LIZIZ;
                if (!PatchProxy.proxy(new Object[]{voiceChatMuteManager, null, 1, null}, null, C78737H2d.LIZ, true, 1).isSupported) {
                    voiceChatMuteManager.LIZ((AbstractC79093HFv) null);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
