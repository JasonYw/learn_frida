package com.bytedance.android.live.broadcastgame.opengame.dialog;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.bytedance.android.live.broadcastgame.api.openplatform.PluginType;
import com.bytedance.android.live.broadcastgame.opengame.C3607p;
import com.bytedance.android.live.broadcastgame.opengame.network.C3599x;
import com.bytedance.android.live.broadcastgame.opengame.network.GameReportApi;
import com.bytedance.android.live.broadcastgame.opengame.p292b.C3483a;
import com.bytedance.android.livesdk.widget.AbstractDialogC9363b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.minigame.appbase.base.event.BdpAppEventConstant;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.p1594ss.android.ugc.aweme.teen.api.constant.DialogType;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import p003X.C106862S5w;
import p003X.C116968W2o;
import p003X.C3809016u;
import p003X.C3Q0;
import p003X.C403021xQ;
import p003X.C596569go;
import p003X.C87010KQi;
import p003X.C87549Ked;
import p003X.C87890Kk8;
import p003X.C88054Kmm;
import p003X.C89019L5p;
import p003X.DialogC88058Kmq;
import p003X.LK5;
import p003X.QB4;

/* renamed from: com.bytedance.android.live.broadcastgame.opengame.dialog.a */
/* loaded from: classes5.dex */
public final class DialogC3494a extends AbstractDialogC9363b {
    public static ChangeQuickRedirect LIZ;
    public int LIZIZ;
    public DialogC88058Kmq LIZJ;
    public final C3607p LJI;
    public final boolean LJII;
    public final boolean LJIIIIZZ;
    public Disposable LJIIIZ;
    public final /* synthetic */ C87549Ked LJIILIIL = new C87549Ked();
    public boolean LJIIJ = true;
    public final Lazy LJIIJJI = LazyKt__LazyJVMKt.lazy(new OpenGameReportDialogV1$develop$2(this));
    public final Lazy LIZLLL = LazyKt__LazyJVMKt.lazy(new OpenGameReportDialogV1$roomId$2(this));

    /* renamed from: LJ */
    public final Lazy f26058LJ = LazyKt__LazyJVMKt.lazy(new OpenGameReportDialogV1$appId$2(this));
    public final Lazy LJFF = LazyKt__LazyJVMKt.lazy(new OpenGameReportDialogV1$appName$2(this));
    public final Lazy LJIIL = LazyKt__LazyJVMKt.lazy(new OpenGameReportDialogV1$pluginType$2(this));

    static {
        Covode.recordClassIndex(20150);
    }

    private final String LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (String) (proxy.isSupported ? proxy.result : this.LJIIJJI.mo27335getValue());
    }

    @Override // com.bytedance.android.livesdk.widget.AbstractDialogC9363b
    public final int LIZ() {
        return 2131695530;
    }

    public final int LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        return proxy.isSupported ? ((Integer) proxy.result).intValue() : ((Number) this.LJIIL.mo27335getValue()).intValue();
    }

    /* renamed from: LJ */
    private final String m15847LJ() {
        if (this.LJI.LJIILIIL.value == PluginType.MINI_APP.value) {
            return BdpAppEventConstant.MICRO_APP;
        }
        return "mini_app";
    }

    private final void LJFF() {
        Disposable disposable;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 19).isSupported && (disposable = this.LJIIIZ) != null) {
            disposable.dispose();
        }
    }

    @Override // p003X.DialogC89454LMi, android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 14).isSupported) {
            return;
        }
        super.cancel();
        LJFF();
    }

    @Override // com.bytedance.android.livesdk.widget.AbstractDialogC9363b, android.app.Dialog, android.view.Window.Callback
    public final void onAttachedToWindow() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported) {
            return;
        }
        super.onAttachedToWindow();
        this.LIZIZ = 0;
        if (!this.LJIIJ) {
            LIZLLL();
        }
        this.LJIIJ = false;
    }

    private final void LIZLLL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported) {
            return;
        }
        this.LJIIIZ = ((GameReportApi) C3599x.LIZJ.LIZ().LIZ(GameReportApi.class)).getReportReasonList(m15847LJ(), this.LJI.LIZIZ).observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.m138io()).subscribe(new C88054Kmm(this), C3809016u.LIZ);
    }

    @Override // com.bytedance.android.livesdk.widget.AbstractDialogC9363b, p003X.DialogC89454LMi, androidx.appcompat.app.AppCompatDialog, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 15).isSupported) {
            return;
        }
        if (!PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 17).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 16).isSupported) {
                super.dismiss();
            }
            C403021xQ.LIZIZ.LIZ(this);
        }
        LJFF();
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 22).isSupported) {
            this.LJIILIIL.LIZ();
        }
    }

    @Override // com.bytedance.android.livesdk.widget.AbstractDialogC9363b, p003X.DialogC89454LMi, android.app.Dialog
    public final void show() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            return;
        }
        Observable LIZ2 = C87010KQi.LIZ().LIZ(C3483a.class);
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        Disposable LIZ3 = C87890Kk8.LIZ(QB4.LIZIZ(LIZ2), new OpenGameReportDialogV1$show$1(this));
        if (!PatchProxy.proxy(new Object[]{LIZ3}, this, LIZ, false, 24).isSupported) {
            C106862S5w.LIZ(LIZ3);
            this.LJIILIIL.LIZ(LIZ3);
        }
        if (!PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 11).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 10).isSupported) {
                if (!PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 9).isSupported) {
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

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 7).isSupported) {
            return;
        }
        if (this.LJIIIIZZ && z) {
            C89019L5p.LIZ(getWindow());
        }
        super.onWindowFocusChanged(z);
    }

    @Override // com.bytedance.android.livesdk.widget.AbstractDialogC9363b, p003X.DialogC89454LMi, androidx.appcompat.app.AppCompatDialog, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        WindowManager.LayoutParams attributes;
        if (PatchProxy.proxy(new Object[]{bundle}, this, LIZ, false, 6).isSupported) {
            return;
        }
        super.onCreate(bundle);
        if (this.LJIIIIZZ) {
            Window window = getWindow();
            if (window != null && (attributes = window.getAttributes()) != null) {
                attributes.width = LK5.LIZ(390.0f);
            }
            View findViewById = findViewById(2131188335);
            if (findViewById != null) {
                C3Q0.LIZIZ(findViewById, LK5.LIZ(getContext()).heightPixels);
                Drawable background = findViewById.getBackground();
                if (!(background instanceof GradientDrawable)) {
                    background = null;
                }
                GradientDrawable gradientDrawable = (GradientDrawable) background;
                float LIZJ = LK5.LIZJ(12.0f);
                if (gradientDrawable != null) {
                    gradientDrawable.setCornerRadii(new float[]{LIZJ, LIZJ, 0.0f, 0.0f, 0.0f, 0.0f, LIZJ, LIZJ});
                }
            }
            Window window2 = getWindow();
            if (window2 != null) {
                window2.setGravity(5);
            }
            C89019L5p.LIZ(getWindow());
        }
        LIZLLL();
        if (!StringsKt__StringsJVMKt.isBlank(LIZJ())) {
            TextView textView = (TextView) findViewById(2131171823);
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setText(LK5.LIZ(2131587466, LIZJ()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC3494a(Context context, C3607p c3607p, boolean z, boolean z2) {
        super(context, z2, false);
        C106862S5w.LIZ(context, c3607p);
        this.LJI = c3607p;
        this.LJII = z;
        this.LJIIIIZZ = z2;
    }
}
