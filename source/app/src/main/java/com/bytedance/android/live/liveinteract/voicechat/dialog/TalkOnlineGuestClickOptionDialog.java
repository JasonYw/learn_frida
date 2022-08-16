package com.bytedance.android.live.liveinteract.voicechat.dialog;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.bytedance.android.livesdk.widget.AbstractDialogC9363b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import p003X.C106862S5w;
import p003X.View$OnClickListenerC78308Gty;
import p003X.View$OnClickListenerC78309Gtz;
import p003X.View$OnClickListenerC78310Gu0;

/* loaded from: classes3.dex */
public final class TalkOnlineGuestClickOptionDialog extends AbstractDialogC9363b {
    public static ChangeQuickRedirect LIZ;
    public final Function1<Option, Unit> LIZIZ;
    public final Boolean LIZJ;
    public final Boolean LIZLLL;

    /* loaded from: classes3.dex */
    public enum Option {
        CHANGE_POSITION,
        INVITE_FRIENDS;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(30982);
        }

        public static Option valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (Option) (proxy.isSupported ? proxy.result : Enum.valueOf(Option.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static Option[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (Option[]) (proxy.isSupported ? proxy.result : values().clone());
        }
    }

    static {
        Covode.recordClassIndex(30981);
    }

    @Override // com.bytedance.android.livesdk.widget.AbstractDialogC9363b
    public final int LIZ() {
        return 2131698758;
    }

    @Override // com.bytedance.android.livesdk.widget.AbstractDialogC9363b, p003X.DialogC89454LMi, androidx.appcompat.app.AppCompatDialog, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        View findViewById;
        View findViewById2;
        if (PatchProxy.proxy(new Object[]{bundle}, this, LIZ, false, 1).isSupported) {
            return;
        }
        super.onCreate(bundle);
        setCanceledOnTouchOutside(true);
        setCancelable(true);
        Boolean bool = this.LIZJ;
        if (bool != null && !bool.booleanValue() && (findViewById2 = findViewById(2131193690)) != null) {
            findViewById2.setVisibility(8);
        }
        Boolean bool2 = this.LIZLLL;
        if (bool2 != null && !bool2.booleanValue() && (findViewById = findViewById(2131194441)) != null) {
            findViewById.setVisibility(8);
        }
        View findViewById3 = findViewById(2131193690);
        if (findViewById3 != null) {
            findViewById3.setOnClickListener(new View$OnClickListenerC78308Gty(this));
        }
        View findViewById4 = findViewById(2131194441);
        if (findViewById4 != null) {
            findViewById4.setOnClickListener(new View$OnClickListenerC78309Gtz(this));
        }
        View findViewById5 = findViewById(2131171740);
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(new View$OnClickListenerC78310Gu0(this));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public TalkOnlineGuestClickOptionDialog(Context context, Boolean bool, Boolean bool2, Function1<? super Option, Unit> function1) {
        super(context);
        C106862S5w.LIZ(context, function1);
        this.LIZJ = bool;
        this.LIZLLL = bool2;
        this.LIZIZ = function1;
    }
}
