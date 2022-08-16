package com.bytedance.android.live.broadcast.gallery.transfer;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.widget.ImageView;
import androidx.appcompat.app.AlertDialog;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.List;
import p003X.AbstractC149420fp4;
import p003X.C116971W2r;
import p003X.C149405fon;
import p003X.C439993ar;

/* renamed from: com.bytedance.android.live.broadcast.gallery.transfer.g */
/* loaded from: classes20.dex */
public final class DialogInterface$OnKeyListenerC3024g implements DialogInterface.OnKeyListener, DialogInterface.OnShowListener, AbstractC149420fp4 {
    public static ChangeQuickRedirect LIZ;
    public Dialog LIZIZ;
    public C3023e LIZJ;
    public C149405fon LIZLLL;

    /* renamed from: LJ */
    public boolean f25835LJ;
    public Context LJFF;

    static {
        Covode.recordClassIndex(15943);
    }

    @Override // p003X.AbstractC149420fp4
    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 15).isSupported) {
            return;
        }
        try {
            C116971W2r.LIZ(this.LIZIZ);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f25835LJ = false;
    }

    private void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        if (this.LIZJ == null) {
            this.LIZJ = new C3023e(this.LJFF);
        }
        this.LIZJ.setOnLayoutResetListener(this);
    }

    private void LIZJ() {
        Activity LIZ2;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported || (LIZ2 = C439993ar.LIZ(this.LJFF)) == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(LIZ2, 16973840);
        builder.setView(this.LIZJ);
        this.LIZIZ = builder.create();
        this.LIZIZ.setOnShowListener(this);
        this.LIZIZ.setOnKeyListener(this);
    }

    public DialogInterface$OnKeyListenerC3024g(Context context) {
        this.LJFF = context;
        LIZIZ();
        LIZJ();
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        if (PatchProxy.proxy(new Object[]{dialogInterface}, this, LIZ, false, 14).isSupported) {
            return;
        }
        this.LIZJ.LIZIZ();
    }

    public void LIZ(List<ImageView> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 9).isSupported) {
            return;
        }
        int size = this.LIZLLL.LJIIIIZZ.size();
        for (int i = 0; i < size; i++) {
            list.add(null);
        }
    }

    public DialogInterface$OnKeyListenerC3024g(Context context, C3023e c3023e) {
        this.LJFF = context;
        this.LIZJ = c3023e;
        LIZIZ();
        LIZJ();
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{dialogInterface, Integer.valueOf(i), keyEvent}, this, LIZ, false, 16);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (i == 4 && keyEvent.getAction() == 1 && !keyEvent.isCanceled() && !PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported && this.f25835LJ && this.LIZJ.LIZIZ(this.LIZLLL.LIZIZ)) {
            this.f25835LJ = false;
        }
        return true;
    }
}
