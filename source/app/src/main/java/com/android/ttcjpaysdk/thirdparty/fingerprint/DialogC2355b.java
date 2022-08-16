package com.android.ttcjpaysdk.thirdparty.fingerprint;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.ttcjpaysdk.base.C2118a;
import com.android.ttcjpaysdk.base.theme.widget.CJPayFingerPrintIconView;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.android.ttcjpaysdk.base.utils.CJPayParamsUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C136982cZt;

/* renamed from: com.android.ttcjpaysdk.thirdparty.fingerprint.b */
/* loaded from: classes17.dex */
public final class DialogC2355b extends Dialog {
    public static ChangeQuickRedirect LIZ;
    public View.OnClickListener LIZIZ;
    public View.OnClickListener LIZJ;
    public Context LIZLLL;

    /* renamed from: LJ */
    public CJPayFingerPrintIconView f25525LJ;
    public TextView LJFF;
    public ImageView LJI;
    public TextView LJII;
    public String LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI = true;
    public long LJIIL;

    static {
        Covode.recordClassIndex(8449);
    }

    @Override // android.app.Dialog
    public final void onStop() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            return;
        }
        super.onStop();
        C136982cZt.LIZIZ = null;
    }

    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 4).isSupported) {
            return;
        }
        this.LJIIIIZZ = str;
        TextView textView = this.LJFF;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public final void LIZIZ(String str) {
        TextView textView;
        if (!PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 6).isSupported && (textView = this.LJII) != null) {
            textView.setText(str);
        }
    }

    public final void LIZ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 7).isSupported) {
            return;
        }
        this.LJIIIZ = z;
        if (!this.LJIIJ) {
            return;
        }
        if (z) {
            this.LJII.setVisibility(8);
        } else {
            this.LJII.setVisibility(0);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 2).isSupported) {
            return;
        }
        super.onWindowFocusChanged(z);
        if (this.LJIIJJI) {
            if (z) {
                this.LJIIL = System.currentTimeMillis();
                return;
            }
            if (System.currentTimeMillis() - this.LJIIL < 500) {
                try {
                    C2118a.LIZ().LIZ("wallet_fingerprint_verify_page_cover_imp", CJPayParamsUtils.LIZ("", ""));
                } catch (Exception unused) {
                }
            }
            this.LJIIJJI = false;
        }
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        TextView textView;
        MethodCollector.m14708i(517);
        if (PatchProxy.proxy(new Object[]{bundle}, this, LIZ, false, 1).isSupported) {
            MethodCollector.m14707o(517);
            return;
        }
        super.onCreate(bundle);
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            View inflate = LayoutInflater.from(this.LIZLLL).inflate(2131690589, (ViewGroup) null);
            setContentView(inflate);
            setCancelable(false);
            this.f25525LJ = (CJPayFingerPrintIconView) inflate.findViewById(2131179733);
            this.f25525LJ.LIZ(true, CJPayBasicUtils.dipToPX(this.LIZLLL, 72.0f), CJPayBasicUtils.dipToPX(this.LIZLLL, 48.0f));
            this.f25525LJ.setVisibility(0);
            this.LJFF = (TextView) inflate.findViewById(2131172394);
            this.LJI = (ImageView) inflate.findViewById(2131192761);
            this.LJII = (TextView) inflate.findViewById(2131192762);
            this.LJIIJ = true;
            ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
            layoutParams.height = CJPayBasicUtils.dipToPX(this.LIZLLL, 170.0f);
            layoutParams.width = CJPayBasicUtils.dipToPX(this.LIZLLL, 250.0f);
            LIZ(this.LJIIIZ);
            this.LJI.setOnClickListener(this.LIZIZ);
            this.LJII.setOnClickListener(this.LIZJ);
            if (!TextUtils.isEmpty(this.LJIIIIZZ) && (textView = this.LJFF) != null) {
                textView.setText(this.LJIIIIZZ);
            }
        }
        MethodCollector.m14707o(517);
    }

    public final void LIZ(String str, int i) {
        if (PatchProxy.proxy(new Object[]{str, Integer.valueOf(i)}, this, LIZ, false, 5).isSupported) {
            return;
        }
        this.LJIIIIZZ = str;
        TextView textView = this.LJFF;
        if (textView != null) {
            textView.setText(str);
            this.LJFF.setTextColor(i);
        }
    }

    public DialogC2355b(Context context, int i, boolean z) {
        super(context, 2131493160);
        this.LIZLLL = context;
        this.LJIIIZ = z;
    }

    public DialogC2355b(Context context, int i, boolean z, boolean z2) {
        super(context, i);
        this.LIZLLL = context;
        this.LJIIIZ = z;
    }
}
