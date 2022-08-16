package com.alipay.sdk.p082m.p123x;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.alipay.sdk.p082m.p121u.C1385e;
import com.bytedance.covode.number.Covode;
import p003X.C116971W2r;

/* renamed from: com.alipay.sdk.m.x.b */
/* loaded from: classes2.dex */
public class C1422b {

    /* renamed from: com.alipay.sdk.m.x.b$a */
    /* loaded from: classes2.dex */
    public static class DialogInterface$OnKeyListenerC1423a implements DialogInterface.OnKeyListener {
        static {
            Covode.recordClassIndex(4924);
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            return i == 4;
        }
    }

    static {
        Covode.recordClassIndex(4923);
    }

    /* renamed from: a */
    public static AlertDialog.Builder m18730a(Context context, String str, String str2, DialogInterface.OnClickListener onClickListener, String str3, DialogInterface.OnClickListener onClickListener2) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        if (!TextUtils.isEmpty(str3) && onClickListener2 != null) {
            builder.setPositiveButton(str3, onClickListener2);
        }
        if (!TextUtils.isEmpty(str2) && onClickListener != null) {
            builder.setNegativeButton(str2, onClickListener);
        }
        return builder;
    }

    /* renamed from: a */
    public static Dialog m18729a(Context context, String str, String str2, String str3, DialogInterface.OnClickListener onClickListener, String str4, DialogInterface.OnClickListener onClickListener2) {
        AlertDialog.Builder m18730a = m18730a(context, str, str3, onClickListener, str4, onClickListener2);
        m18730a.setTitle(str);
        m18730a.setMessage(str2);
        AlertDialog create = m18730a.create();
        create.setCanceledOnTouchOutside(false);
        create.setOnKeyListener(new DialogInterface$OnKeyListenerC1423a());
        try {
            C116971W2r.LIZIZ(create);
            return create;
        } catch (Throwable th) {
            C1385e.m18867a("mspl", "showDialog ", th);
            return create;
        }
    }
}
