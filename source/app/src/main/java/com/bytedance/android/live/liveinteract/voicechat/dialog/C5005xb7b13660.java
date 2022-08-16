package com.bytedance.android.live.liveinteract.voicechat.dialog;

import androidx.fragment.app.FragmentActivity;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.ktvapi.C8057l;
import com.bytedance.android.livesdk.ktvapi.IKtvService;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import p003X.C116971W2r;
import p003X.ProgressDialogC135233c7g;
import p003X.View$OnClickListenerC421982mu;

/* renamed from: com.bytedance.android.live.liveinteract.voicechat.dialog.AudioTalkSettingDialog$onCreate$15$$special$$inlined$run$lambda$1 */
/* loaded from: classes12.dex */
public final class C5005xb7b13660 extends Lambda implements Function2<Boolean, C8057l, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ FragmentActivity $fragmentActivity;
    public final /* synthetic */ ProgressDialogC135233c7g $processingDialog;
    public final /* synthetic */ View$OnClickListenerC421982mu this$0;

    static {
        Covode.recordClassIndex(30974);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5005xb7b13660(ProgressDialogC135233c7g progressDialogC135233c7g, FragmentActivity fragmentActivity, View$OnClickListenerC421982mu view$OnClickListenerC421982mu) {
        super(2);
        this.$processingDialog = progressDialogC135233c7g;
        this.$fragmentActivity = fragmentActivity;
        this.this$0 = view$OnClickListenerC421982mu;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Unit invoke(Boolean bool, C8057l c8057l) {
        boolean booleanValue = bool.booleanValue();
        C8057l c8057l2 = c8057l;
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(booleanValue ? (byte) 1 : (byte) 0), c8057l2}, this, changeQuickRedirect, false, 1).isSupported && this.this$0.LIZIZ.isShowing()) {
            C116971W2r.LIZ(this.$processingDialog);
            if (booleanValue) {
                C116971W2r.LIZ(this.this$0.LIZIZ);
                if (c8057l2 != null) {
                    ((IKtvService) ServiceManager.getService(IKtvService.class)).showKtvPriorSongConfigDialog(this.$fragmentActivity, c8057l2, 1);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
