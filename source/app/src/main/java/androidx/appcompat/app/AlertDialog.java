package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import androidx.appcompat.app.AlertController;
import androidx.core.view.MotionEventCompat;
import com.bytedance.covode.number.Covode;
import p003X.C116971W2r;
import p003X.C149911fx1;
import p003X.C149912fx2;
import p003X.C149919fx9;
import p003X.C149920fxA;
import p003X.C149921fxB;
import p003X.C149922fxC;

/* loaded from: classes20.dex */
public class AlertDialog extends AppCompatDialog implements DialogInterface {
    public final AlertController mAlert;

    static {
        Covode.recordClassIndex(454);
    }

    /* loaded from: classes20.dex */
    public static class Builder {

        /* renamed from: P */
        public final C149919fx9 f20219P;
        public final int mTheme;

        static {
            Covode.recordClassIndex(455);
        }

        public Builder setInverseBackgroundForced(boolean z) {
            return this;
        }

        public Builder setRecycleOnMeasureEnabled(boolean z) {
            return this;
        }

        public Context getContext() {
            return this.f20219P.LIZ;
        }

        public AlertDialog show() {
            AlertDialog create = create();
            C116971W2r.LIZJ(create);
            return create;
        }

        public AlertDialog create() {
            int i;
            ListAdapter c149922fxC;
            AlertDialog alertDialog = new AlertDialog(this.f20219P.LIZ, this.mTheme);
            C149919fx9 c149919fx9 = this.f20219P;
            AlertController alertController = alertDialog.mAlert;
            if (c149919fx9.LJI != null) {
                alertController.LJJIJ = c149919fx9.LJI;
            } else {
                if (c149919fx9.LJFF != null) {
                    alertController.LIZ(c149919fx9.LJFF);
                }
                if (c149919fx9.LIZLLL != null) {
                    alertController.LIZ(c149919fx9.LIZLLL);
                }
                if (c149919fx9.LIZJ != 0) {
                    alertController.LIZ(c149919fx9.LIZJ);
                }
                if (c149919fx9.f20117LJ != 0) {
                    int i2 = c149919fx9.f20117LJ;
                    TypedValue typedValue = new TypedValue();
                    alertController.LIZ.getTheme().resolveAttribute(i2, typedValue, true);
                    alertController.LIZ(typedValue.resourceId);
                }
            }
            if (c149919fx9.LJII != null) {
                alertController.LIZIZ(c149919fx9.LJII);
            }
            if (c149919fx9.LJIIIIZZ != null || c149919fx9.LJIIIZ != null) {
                alertController.LIZ(-1, c149919fx9.LJIIIIZZ, c149919fx9.LJIIJ, (Message) null, c149919fx9.LJIIIZ);
            }
            if (c149919fx9.LJIIJJI != null || c149919fx9.LJIIL != null) {
                alertController.LIZ(-2, c149919fx9.LJIIJJI, c149919fx9.LJIILIIL, (Message) null, c149919fx9.LJIIL);
            }
            if (c149919fx9.LJIILJJIL != null || c149919fx9.LJIILL != null) {
                alertController.LIZ(-3, c149919fx9.LJIILJJIL, c149919fx9.LJIILLIIL, (Message) null, c149919fx9.LJIILL);
            }
            if (c149919fx9.LJIJJLI != null || c149919fx9.LJJIJL != null || c149919fx9.LJIL != null) {
                AlertController.RecycleListView recycleListView = (AlertController.RecycleListView) c149919fx9.LIZIZ.inflate(alertController.LJJIJLIJ, (ViewGroup) null);
                if (c149919fx9.LJJIJ) {
                    if (c149919fx9.LJJIJL == null) {
                        c149922fxC = new C149921fxB(c149919fx9, c149919fx9.LIZ, alertController.LJJIL, 16908308, c149919fx9.LJIJJLI, recycleListView);
                    } else {
                        Context context = c149919fx9.LIZ;
                        Cursor cursor = c149919fx9.LJJIJL;
                        c149919fx9 = c149919fx9;
                        c149922fxC = new C149920fxA(c149919fx9, context, cursor, false, recycleListView, alertController);
                    }
                } else {
                    if (c149919fx9.LJJIJIIJI) {
                        i = alertController.LJJIZ;
                    } else {
                        i = alertController.LJJJ;
                    }
                    if (c149919fx9.LJJIJL != null) {
                        c149922fxC = new SimpleCursorAdapter(c149919fx9.LIZ, i, c149919fx9.LJJIJL, new String[]{c149919fx9.LJJIJLIJ}, new int[]{16908308});
                    } else if (c149919fx9.LJIL != null) {
                        c149922fxC = c149919fx9.LJIL;
                    } else {
                        c149922fxC = new C149922fxC(c149919fx9.LIZ, i, 16908308, c149919fx9.LJIJJLI);
                    }
                }
                alertController.LJJIJIIJI = c149922fxC;
                alertController.LJJIJIIJIL = c149919fx9.LJJIJIIJIL;
                if (c149919fx9.LJJ != null) {
                    recycleListView.setOnItemClickListener(new C149911fx1(c149919fx9, alertController));
                } else if (c149919fx9.LJJIJIL != null) {
                    recycleListView.setOnItemClickListener(new C149912fx2(c149919fx9, recycleListView, alertController));
                }
                if (c149919fx9.LJJIZ != null) {
                    recycleListView.setOnItemSelectedListener(c149919fx9.LJJIZ);
                }
                if (c149919fx9.LJJIJIIJI) {
                    recycleListView.setChoiceMode(1);
                } else if (c149919fx9.LJJIJ) {
                    recycleListView.setChoiceMode(2);
                }
                alertController.LJI = recycleListView;
            }
            if (c149919fx9.LJJIFFI != null) {
                if (c149919fx9.LJJIIZ) {
                    alertController.LIZ(c149919fx9.LJJIFFI, c149919fx9.LJJII, c149919fx9.LJJIII, c149919fx9.LJJIIJ, c149919fx9.LJJIIJZLJL);
                } else {
                    alertController.LIZIZ(c149919fx9.LJJIFFI);
                }
            } else if (c149919fx9.LJJI != 0) {
                int i3 = c149919fx9.LJJI;
                alertController.LJII = null;
                alertController.LJIIIIZZ = i3;
                alertController.LJIILIIL = false;
            }
            alertDialog.setCancelable(this.f20219P.LJIIZILJ);
            if (this.f20219P.LJIIZILJ) {
                alertDialog.setCanceledOnTouchOutside(true);
            }
            C116971W2r.LIZ(alertDialog, this.f20219P.LJIJ);
            C116971W2r.LIZ(alertDialog, this.f20219P.LJIJI);
            if (this.f20219P.LJIJJ != null) {
                alertDialog.setOnKeyListener(this.f20219P.LJIJJ);
            }
            return alertDialog;
        }

        public Builder setCancelable(boolean z) {
            this.f20219P.LJIIZILJ = z;
            return this;
        }

        public Builder setCustomTitle(View view) {
            this.f20219P.LJI = view;
            return this;
        }

        public Builder setIcon(int i) {
            this.f20219P.LIZJ = i;
            return this;
        }

        public Builder setMessage(CharSequence charSequence) {
            this.f20219P.LJII = charSequence;
            return this;
        }

        public Builder setNegativeButtonIcon(Drawable drawable) {
            this.f20219P.LJIIL = drawable;
            return this;
        }

        public Builder setNeutralButtonIcon(Drawable drawable) {
            this.f20219P.LJIILL = drawable;
            return this;
        }

        public Builder setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
            this.f20219P.LJIJ = onCancelListener;
            return this;
        }

        public Builder setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
            this.f20219P.LJIJI = onDismissListener;
            return this;
        }

        public Builder setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
            this.f20219P.LJJIZ = onItemSelectedListener;
            return this;
        }

        public Builder setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
            this.f20219P.LJIJJ = onKeyListener;
            return this;
        }

        public Builder setPositiveButtonIcon(Drawable drawable) {
            this.f20219P.LJIIIZ = drawable;
            return this;
        }

        public Builder setTitle(CharSequence charSequence) {
            this.f20219P.LJFF = charSequence;
            return this;
        }

        public Builder(Context context) {
            this(context, AlertDialog.resolveDialogTheme(context, 0));
        }

        public Builder setIcon(Drawable drawable) {
            this.f20219P.LIZLLL = drawable;
            return this;
        }

        public Builder setMessage(int i) {
            C149919fx9 c149919fx9 = this.f20219P;
            c149919fx9.LJII = c149919fx9.LIZ.getText(i);
            return this;
        }

        public Builder setTitle(int i) {
            C149919fx9 c149919fx9 = this.f20219P;
            c149919fx9.LJFF = c149919fx9.LIZ.getText(i);
            return this;
        }

        public Builder setView(int i) {
            C149919fx9 c149919fx9 = this.f20219P;
            c149919fx9.LJJIFFI = null;
            c149919fx9.LJJI = i;
            c149919fx9.LJJIIZ = false;
            return this;
        }

        public Builder setIconAttribute(int i) {
            TypedValue typedValue = new TypedValue();
            this.f20219P.LIZ.getTheme().resolveAttribute(i, typedValue, true);
            this.f20219P.LIZJ = typedValue.resourceId;
            return this;
        }

        public Builder setView(View view) {
            C149919fx9 c149919fx9 = this.f20219P;
            c149919fx9.LJJIFFI = view;
            c149919fx9.LJJI = 0;
            c149919fx9.LJJIIZ = false;
            return this;
        }

        public Builder setAdapter(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            C149919fx9 c149919fx9 = this.f20219P;
            c149919fx9.LJIL = listAdapter;
            c149919fx9.LJJ = onClickListener;
            return this;
        }

        public Builder setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            C149919fx9 c149919fx9 = this.f20219P;
            c149919fx9.LJIJJLI = charSequenceArr;
            c149919fx9.LJJ = onClickListener;
            return this;
        }

        public Builder setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            C149919fx9 c149919fx9 = this.f20219P;
            c149919fx9.LJIIJJI = charSequence;
            c149919fx9.LJIILIIL = onClickListener;
            return this;
        }

        public Builder setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            C149919fx9 c149919fx9 = this.f20219P;
            c149919fx9.LJIILJJIL = charSequence;
            c149919fx9.LJIILLIIL = onClickListener;
            return this;
        }

        public Builder setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            C149919fx9 c149919fx9 = this.f20219P;
            c149919fx9.LJIIIIZZ = charSequence;
            c149919fx9.LJIIJ = onClickListener;
            return this;
        }

        public Builder setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
            C149919fx9 c149919fx9 = this.f20219P;
            c149919fx9.LJIIJJI = c149919fx9.LIZ.getText(i);
            this.f20219P.LJIILIIL = onClickListener;
            return this;
        }

        public Builder setNeutralButton(int i, DialogInterface.OnClickListener onClickListener) {
            C149919fx9 c149919fx9 = this.f20219P;
            c149919fx9.LJIILJJIL = c149919fx9.LIZ.getText(i);
            this.f20219P.LJIILLIIL = onClickListener;
            return this;
        }

        public Builder setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
            C149919fx9 c149919fx9 = this.f20219P;
            c149919fx9.LJIIIIZZ = c149919fx9.LIZ.getText(i);
            this.f20219P.LJIIJ = onClickListener;
            return this;
        }

        public Builder(Context context, int i) {
            this.f20219P = new C149919fx9(new ContextThemeWrapper(context, AlertDialog.resolveDialogTheme(context, i)));
            this.mTheme = i;
        }

        public Builder setItems(int i, DialogInterface.OnClickListener onClickListener) {
            C149919fx9 c149919fx9 = this.f20219P;
            c149919fx9.LJIJJLI = c149919fx9.LIZ.getResources().getTextArray(i);
            this.f20219P.LJJ = onClickListener;
            return this;
        }

        public Builder setCursor(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
            C149919fx9 c149919fx9 = this.f20219P;
            c149919fx9.LJJIJL = cursor;
            c149919fx9.LJJIJLIJ = str;
            c149919fx9.LJJ = onClickListener;
            return this;
        }

        public Builder setMultiChoiceItems(int i, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            C149919fx9 c149919fx9 = this.f20219P;
            c149919fx9.LJIJJLI = c149919fx9.LIZ.getResources().getTextArray(i);
            C149919fx9 c149919fx92 = this.f20219P;
            c149919fx92.LJJIJIL = onMultiChoiceClickListener;
            c149919fx92.LJJIIZI = zArr;
            c149919fx92.LJJIJ = true;
            return this;
        }

        public Builder setSingleChoiceItems(int i, int i2, DialogInterface.OnClickListener onClickListener) {
            C149919fx9 c149919fx9 = this.f20219P;
            c149919fx9.LJIJJLI = c149919fx9.LIZ.getResources().getTextArray(i);
            C149919fx9 c149919fx92 = this.f20219P;
            c149919fx92.LJJ = onClickListener;
            c149919fx92.LJJIJIIJIL = i2;
            c149919fx92.LJJIJIIJI = true;
            return this;
        }

        public Builder setMultiChoiceItems(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            C149919fx9 c149919fx9 = this.f20219P;
            c149919fx9.LJIJJLI = charSequenceArr;
            c149919fx9.LJJIJIL = onMultiChoiceClickListener;
            c149919fx9.LJJIIZI = zArr;
            c149919fx9.LJJIJ = true;
            return this;
        }

        public Builder setSingleChoiceItems(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
            C149919fx9 c149919fx9 = this.f20219P;
            c149919fx9.LJIL = listAdapter;
            c149919fx9.LJJ = onClickListener;
            c149919fx9.LJJIJIIJIL = i;
            c149919fx9.LJJIJIIJI = true;
            return this;
        }

        public Builder setSingleChoiceItems(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
            C149919fx9 c149919fx9 = this.f20219P;
            c149919fx9.LJIJJLI = charSequenceArr;
            c149919fx9.LJJ = onClickListener;
            c149919fx9.LJJIJIIJIL = i;
            c149919fx9.LJJIJIIJI = true;
            return this;
        }

        public Builder setMultiChoiceItems(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            C149919fx9 c149919fx9 = this.f20219P;
            c149919fx9.LJJIJL = cursor;
            c149919fx9.LJJIJIL = onMultiChoiceClickListener;
            c149919fx9.LJJIL = str;
            c149919fx9.LJJIJLIJ = str2;
            c149919fx9.LJJIJ = true;
            return this;
        }

        public Builder setSingleChoiceItems(Cursor cursor, int i, String str, DialogInterface.OnClickListener onClickListener) {
            C149919fx9 c149919fx9 = this.f20219P;
            c149919fx9.LJJIJL = cursor;
            c149919fx9.LJJ = onClickListener;
            c149919fx9.LJJIJIIJIL = i;
            c149919fx9.LJJIJLIJ = str;
            c149919fx9.LJJIJIIJI = true;
            return this;
        }

        public Builder setView(View view, int i, int i2, int i3, int i4) {
            C149919fx9 c149919fx9 = this.f20219P;
            c149919fx9.LJJIFFI = view;
            c149919fx9.LJJI = 0;
            c149919fx9.LJJIIZ = true;
            c149919fx9.LJJII = i;
            c149919fx9.LJJIII = i2;
            c149919fx9.LJJIIJ = i3;
            c149919fx9.LJJIIJZLJL = i4;
            return this;
        }
    }

    public ListView getListView() {
        return this.mAlert.LJI;
    }

    public AlertDialog(Context context) {
        this(context, 0);
    }

    public void setButtonPanelLayoutHint(int i) {
        this.mAlert.LJJJIL = i;
    }

    public void setCustomTitle(View view) {
        this.mAlert.LJJIJ = view;
    }

    public void setIcon(int i) {
        this.mAlert.LIZ(i);
    }

    public void setMessage(CharSequence charSequence) {
        this.mAlert.LIZIZ(charSequence);
    }

    public void setView(View view) {
        this.mAlert.LIZIZ(view);
    }

    public void setIcon(Drawable drawable) {
        this.mAlert.LIZ(drawable);
    }

    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.mAlert.LIZ(charSequence);
    }

    public Button getButton(int i) {
        AlertController alertController = this.mAlert;
        if (i != -3) {
            if (i != -2) {
                if (i != -1) {
                    return null;
                }
                return alertController.LJIILJJIL;
            }
            return alertController.LJIJ;
        }
        return alertController.LJIL;
    }

    public void setIconAttribute(int i) {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(i, typedValue, true);
        this.mAlert.LIZ(typedValue.resourceId);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004d, code lost:
        if (androidx.appcompat.app.AlertController.LIZ(r12) == false) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:123:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01d9  */
    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r16) {
        /*
            Method dump skipped, instructions count: 1028
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AlertDialog.onCreate(android.os.Bundle):void");
    }

    public AlertDialog(Context context, int i) {
        super(context, resolveDialogTheme(context, i));
        this.mAlert = new AlertController(getContext(), this, getWindow());
    }

    public static int resolveDialogTheme(Context context, int i) {
        if (((i >>> 24) & MotionEventCompat.ACTION_MASK) > 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(2130772174, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        AlertController alertController = this.mAlert;
        if (alertController.LJJII != null && alertController.LJJII.executeKeyEvent(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        AlertController alertController = this.mAlert;
        if (alertController.LJJII != null && alertController.LJJII.executeKeyEvent(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public AlertDialog(Context context, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        this(context, 0);
        setCancelable(z);
        C116971W2r.LIZ(this, onCancelListener);
    }

    public void setButton(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        this.mAlert.LIZ(i, charSequence, onClickListener, (Message) null, (Drawable) null);
    }

    public void setButton(int i, CharSequence charSequence, Message message) {
        this.mAlert.LIZ(i, charSequence, (DialogInterface.OnClickListener) null, message, (Drawable) null);
    }

    public void setButton(int i, CharSequence charSequence, Drawable drawable, DialogInterface.OnClickListener onClickListener) {
        this.mAlert.LIZ(i, charSequence, onClickListener, (Message) null, drawable);
    }

    public void setView(View view, int i, int i2, int i3, int i4) {
        this.mAlert.LIZ(view, i, i2, i3, i4);
    }
}
