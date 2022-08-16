package com.bytedance.android.live.broadcastgame.opengame.view;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.broadcastgame.api.C3348d;
import com.bytedance.android.live.broadcastgame.opengame.view.DialogC3739w;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.widget.AbstractDialogC9363b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import p002O.C0002O;
import p003X.C106862S5w;
import p003X.C4313534v;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.view.w */
/* loaded from: classes12.dex */
public final class DialogC3739w extends AbstractDialogC9363b {
    public static ChangeQuickRedirect LIZ;
    public Function0<Unit> LIZIZ;
    public TextView LIZJ;
    public HSImageView LIZLLL;

    /* renamed from: LJ */
    public HSImageView f26099LJ;

    static {
        Covode.recordClassIndex(21274);
    }

    @Override // com.bytedance.android.livesdk.widget.AbstractDialogC9363b
    public final int LIZ() {
        return 2131698864;
    }

    @Override // com.bytedance.android.livesdk.widget.AbstractDialogC9363b, p003X.DialogC89454LMi, androidx.appcompat.app.AppCompatDialog, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        TextView textView;
        if (PatchProxy.proxy(new Object[]{bundle}, this, LIZ, false, 1).isSupported) {
            return;
        }
        super.onCreate(bundle);
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            this.LIZJ = (TextView) findViewById(2131169094);
            this.LIZLLL = (HSImageView) findViewById(2131166438);
            this.f26099LJ = (HSImageView) findViewById(2131167106);
            String LIZIZ = C4313534v.LIZIZ();
            LIZ(this.LIZLLL, C0002O.m25085C("https://", LIZIZ, "/obj/live-android/cast_screen_anchor_view.png"));
            LIZ(this.f26099LJ, C0002O.m25085C("https://", LIZIZ, "/obj/live-android/cast_screen_audience_view.png"));
            if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported && (textView = this.LIZJ) != null) {
                textView.setOnClickListener(new View.OnClickListener() { // from class: X.3Dw
                    public static ChangeQuickRedirect LIZ;

                    static {
                        Covode.recordClassIndex(21275);
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
                            return;
                        }
                        C116971W2r.LIZ(DialogC3739w.this);
                        C4574547f.LIZ().LIZ("livesdk_little_game_anchor_share_screen", Room.class, C3348d.class);
                        Function0<Unit> function0 = DialogC3739w.this.LIZIZ;
                        if (function0 != null) {
                            function0.mo30099invoke();
                        }
                    }
                });
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC3739w(Context context, Function0<Unit> function0) {
        super(context);
        C106862S5w.LIZ(context);
        this.LIZIZ = function0;
    }

    private final void LIZ(HSImageView hSImageView, String str) {
        if (!PatchProxy.proxy(new Object[]{hSImageView, str}, this, LIZ, false, 4).isSupported && hSImageView != null) {
            hSImageView.setController(Fresco.newDraweeControllerBuilder().setAutoPlayAnimations(true).mo27962setUri(Uri.parse(str)).mo27965build());
            GenericDraweeHierarchy hierarchy = hSImageView.getHierarchy();
            if (hierarchy != null) {
                hierarchy.setFailureImage(2130857607);
            }
        }
    }
}
