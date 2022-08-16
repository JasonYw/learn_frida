package com.bytedance.android.live.liveinteract.chatroom.chatroom.dialog;

import android.app.Activity;
import android.content.Context;
import com.bytedance.android.livesdk.widget.AbstractDialogC9363b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.p1594ss.android.ugc.aweme.teen.api.constant.DialogType;
import p003X.C106862S5w;
import p003X.C116968W2o;
import p003X.C439993ar;
import p003X.C596569go;
import p003X.HH8;

/* renamed from: com.bytedance.android.live.liveinteract.chatroom.chatroom.dialog.g */
/* loaded from: classes3.dex */
public abstract class AbstractDialogC4303g extends AbstractDialogC9363b {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(25487);
    }

    @Override // com.bytedance.android.livesdk.widget.AbstractDialogC9363b, p003X.DialogC89454LMi, android.app.Dialog
    public void show() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        Activity LIZ2 = C439993ar.LIZ(getContext());
        if (LIZ2 != null && LIZ2.isFinishing()) {
            HH8.LIZIZ.LJFF(LIZ2.toString());
        } else if (!PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 4).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 3).isSupported) {
                if (!PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 2).isSupported) {
                    super.show();
                }
                if (this instanceof BottomSheetDialog) {
                    C596569go.LIZ(this, DialogType.BOTTOM_SHEET);
                } else {
                    C596569go.LIZ(this, null);
                }
            }
            C116968W2o.LIZ(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractDialogC4303g(Context context) {
        super(context);
        C106862S5w.LIZ(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractDialogC4303g(Context context, int i) {
        super(context, 2131494844);
        C106862S5w.LIZ(context);
    }
}
