package cn.everphoto.template_panel.view;

import android.animation.ValueAnimator;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.android.ugc.tools.view.widget.CircularProgressView;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC83375ItV;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C403021xQ;
import p003X.C83377ItX;
import p003X.View$OnClickListenerC83376ItW;

/* renamed from: cn.everphoto.template_panel.view.b */
/* loaded from: classes4.dex */
public final class AlertDialogC0793b extends AlertDialog {
    public static ChangeQuickRedirect LIZ;
    public AbstractC83375ItV LIZIZ;
    public boolean LIZJ;
    public CharSequence LIZLLL;

    /* renamed from: LJ */
    public boolean f21076LJ;
    public int LJFF;
    public int LJI = 100;
    public View LJII;
    public TextView LJIIIIZZ;
    public CircularProgressView LJIIIZ;
    public TextView LJIIJ;
    public View LJIIJJI;
    public ValueAnimator LJIIL;

    static {
        Covode.recordClassIndex(3826);
    }

    private final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported) {
            return;
        }
        ValueAnimator valueAnimator = this.LJIIL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.LJIIL;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllUpdateListeners();
        }
        this.LJIIL = null;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            return;
        }
        LIZ(0);
        CircularProgressView circularProgressView = this.LJIIIZ;
        if (circularProgressView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        circularProgressView.setVisibility(0);
        CircularProgressView circularProgressView2 = this.LJIIIZ;
        if (circularProgressView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        circularProgressView2.LIZIZ();
        LIZ();
        if (!PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 8).isSupported) {
            if (!PatchProxy.proxy(new Object[]{this}, null, LIZ, true, 7).isSupported) {
                super.dismiss();
            }
            C403021xQ.LIZIZ.LIZ(this);
        }
    }

    @Override // android.app.AlertDialog
    public final void setMessage(CharSequence charSequence) {
        int i = 0;
        if (PatchProxy.proxy(new Object[]{charSequence}, this, LIZ, false, 5).isSupported) {
            return;
        }
        if (this.LIZJ) {
            TextView textView = this.LJIIIIZZ;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            textView.setText(charSequence);
            TextView textView2 = this.LJIIIIZZ;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            if (TextUtils.isEmpty(charSequence)) {
                i = 8;
            }
            textView2.setVisibility(i);
        }
        this.LIZLLL = charSequence;
    }

    public final void LIZ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 3).isSupported) {
            return;
        }
        if (this.LIZJ) {
            TextView textView = this.LJIIJ;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append('%');
            textView.setText(sb.toString());
            CircularProgressView circularProgressView = this.LJIIIZ;
            if (circularProgressView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            circularProgressView.setProgress(i);
            if (i > 0) {
                CircularProgressView circularProgressView2 = this.LJIIIZ;
                if (circularProgressView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                if (circularProgressView2.getVisibility() == 4) {
                    CircularProgressView circularProgressView3 = this.LJIIIZ;
                    if (circularProgressView3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                    circularProgressView3.setVisibility(0);
                }
            }
        }
        this.LJFF = i;
    }

    public final void LIZIZ(int i) {
        int i2;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 12).isSupported || i <= (i2 = this.LJFF)) {
            return;
        }
        LIZ();
        this.LJIIL = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
        ValueAnimator valueAnimator = this.LJIIL;
        if (valueAnimator != null) {
            valueAnimator.addUpdateListener(new C83377ItX(this, i2, i));
        }
        ValueAnimator valueAnimator2 = this.LJIIL;
        if (valueAnimator2 != null) {
            valueAnimator2.start();
        }
    }

    public final void LIZ(boolean z) {
        View view;
        int i = 0;
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 11).isSupported && (view = this.LJII) != null) {
            if (!z) {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    @Override // android.app.AlertDialog, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, LIZ, false, 1).isSupported) {
            return;
        }
        super.onCreate(bundle);
        setContentView(2131694413);
        int i = 4;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            View findViewById = findViewById(2131170683);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "");
            this.LJIIJJI = findViewById;
            View findViewById2 = findViewById(2131165279);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "");
            this.LJIIIIZZ = (TextView) findViewById2;
            View findViewById3 = findViewById(2131165240);
            Intrinsics.checkExpressionValueIsNotNull(findViewById3, "");
            this.LJIIIZ = (CircularProgressView) findViewById3;
            this.LJII = findViewById(2131168972);
            View findViewById4 = findViewById(2131169963);
            Intrinsics.checkExpressionValueIsNotNull(findViewById4, "");
            this.LJIIJ = (TextView) findViewById4;
            View view = this.LJII;
            if (view != null) {
                view.setOnClickListener(new View$OnClickListenerC83376ItW(this));
            }
            View view2 = this.LJII;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            CircularProgressView circularProgressView = this.LJIIIZ;
            if (circularProgressView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            circularProgressView.setVisibility(4);
            View view3 = this.LJIIJJI;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            view3.setBackgroundColor(C116971W2r.LIZ(getContext(), 2131627976));
        }
        this.LIZJ = true;
        setMessage(this.LIZLLL);
        boolean z = this.f21076LJ;
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 4).isSupported) {
            if (this.LIZJ) {
                CircularProgressView circularProgressView2 = this.LJIIIZ;
                if (circularProgressView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                circularProgressView2.setIndeterminate(z);
                TextView textView = this.LJIIJ;
                if (textView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                if (!z) {
                    i = 0;
                }
                textView.setVisibility(i);
            }
            this.f21076LJ = z;
        }
        int i2 = this.LJI;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i2)}, this, LIZ, false, 9).isSupported) {
            if (this.LIZJ) {
                CircularProgressView circularProgressView3 = this.LJIIIZ;
                if (circularProgressView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                circularProgressView3.setMaxProgress(i2);
            }
            this.LJI = i2;
        }
        LIZ(this.LJFF);
        setCanceledOnTouchOutside(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlertDialogC0793b(Context context, int i) {
        super(context, 2131493635);
        C106862S5w.LIZ(context);
    }
}
