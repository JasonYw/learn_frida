package androidx.appcompat.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import p003X.AbstractC138442cxa;
import p003X.AbstractC138451cxj;
import p003X.AbstractC138457cxp;
import p003X.AbstractC138468cy0;
import p003X.AbstractC138469cy1;
import p003X.C138460cxs;
import p003X.C403021xQ;

/* loaded from: classes17.dex */
public class AppCompatDialog extends Dialog implements AbstractC138468cy0 {
    public AppCompatDelegate mDelegate;
    public final AbstractC138469cy1 mKeyDispatcher;

    static {
        Covode.recordClassIndex(481);
    }

    @Override // p003X.AbstractC138468cy0
    public void onSupportActionModeFinished(AbstractC138442cxa abstractC138442cxa) {
    }

    @Override // p003X.AbstractC138468cy0
    public void onSupportActionModeStarted(AbstractC138442cxa abstractC138442cxa) {
    }

    @Override // p003X.AbstractC138468cy0
    public AbstractC138442cxa onWindowStartingSupportActionMode(AbstractC138451cxj abstractC138451cxj) {
        return null;
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        getDelegate().invalidateOptionsMenu();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        m21201x70b4228f(this);
        getDelegate().onDestroy();
    }

    public AppCompatDelegate getDelegate() {
        if (this.mDelegate == null) {
            this.mDelegate = AppCompatDelegate.create(this, this);
        }
        return this.mDelegate;
    }

    public AbstractC138457cxp getSupportActionBar() {
        return getDelegate().getSupportActionBar();
    }

    @Override // android.app.Dialog
    public void onStop() {
        super.onStop();
        getDelegate().onStop();
    }

    public AppCompatDialog(Context context) {
        this(context, 0);
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        getDelegate().setContentView(i);
    }

    public boolean superDispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    /* renamed from: INVOKESPECIAL_androidx_appcompat_app_AppCompatDialog_com_ss_android_ugc_aweme_teen_host_lancet_DialogLancet_dismiss */
    public static void m21201x70b4228f(Dialog dialog) {
        super.dismiss();
        C403021xQ.LIZIZ.LIZ(dialog);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C138460cxs.LIZ(this.mKeyDispatcher, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i) {
        return (T) getDelegate().findViewById(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        getDelegate().setContentView(view);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        getDelegate().setTitle(charSequence);
    }

    public boolean supportRequestWindowFeature(int i) {
        return getDelegate().requestWindowFeature(i);
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        getDelegate().installViewFactory();
        super.onCreate(bundle);
        getDelegate().onCreate(bundle);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        getDelegate().setTitle(getContext().getString(i));
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().addContentView(view, layoutParams);
    }

    public AppCompatDialog(Context context, int i) {
        super(context, getThemeResId(context, i));
        this.mKeyDispatcher = new AbstractC138469cy1() { // from class: androidx.appcompat.app.AppCompatDialog.1
            static {
                Covode.recordClassIndex(482);
            }

            @Override // p003X.AbstractC138469cy1
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return AppCompatDialog.this.superDispatchKeyEvent(keyEvent);
            }
        };
        AppCompatDelegate delegate = getDelegate();
        delegate.setTheme(getThemeResId(context, i));
        delegate.onCreate(null);
    }

    public static int getThemeResId(Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(2130772921, typedValue, true);
            return typedValue.resourceId;
        }
        return i;
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        getDelegate().setContentView(view, layoutParams);
    }

    public AppCompatDialog(Context context, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z, onCancelListener);
        this.mKeyDispatcher = new AbstractC138469cy1() { // from class: androidx.appcompat.app.AppCompatDialog.1
            static {
                Covode.recordClassIndex(482);
            }

            @Override // p003X.AbstractC138469cy1
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return AppCompatDialog.this.superDispatchKeyEvent(keyEvent);
            }
        };
    }
}
