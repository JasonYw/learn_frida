package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.bytedance.covode.number.Covode;
import java.lang.ref.WeakReference;

/* loaded from: classes20.dex */
public final class AlertController {
    public final Context LIZ;
    public final AppCompatDialog LIZIZ;
    public final Window LIZJ;
    public final int LIZLLL;

    /* renamed from: LJ */
    public CharSequence f20218LJ;
    public CharSequence LJFF;
    public ListView LJI;
    public View LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public boolean LJIILIIL;
    public Button LJIILJJIL;
    public CharSequence LJIILL;
    public Message LJIILLIIL;
    public Drawable LJIIZILJ;
    public Button LJIJ;
    public CharSequence LJIJI;
    public Message LJIJJ;
    public Drawable LJIJJLI;
    public Button LJIL;
    public CharSequence LJJ;
    public Message LJJI;
    public Drawable LJJIFFI;
    public NestedScrollView LJJII;
    public int LJJIII;
    public Drawable LJJIIJ;
    public ImageView LJJIIJZLJL;
    public TextView LJJIIZ;
    public TextView LJJIIZI;
    public View LJJIJ;
    public ListAdapter LJJIJIIJI;
    public int LJJIJIL;
    public int LJJIJL;
    public int LJJIJLIJ;
    public int LJJIL;
    public int LJJIZ;
    public int LJJJ;
    public boolean LJJJI;
    public int LJJJIL;
    public Handler LJJJJ;
    public int LJJIJIIJIL = -1;
    public final View.OnClickListener LJJJJI = new View.OnClickListener() { // from class: androidx.appcompat.app.AlertController.1
        static {
            Covode.recordClassIndex(441);
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Message obtain;
            if (view == AlertController.this.LJIILJJIL && AlertController.this.LJIILLIIL != null) {
                obtain = Message.obtain(AlertController.this.LJIILLIIL);
            } else if (view == AlertController.this.LJIJ && AlertController.this.LJIJJ != null) {
                obtain = Message.obtain(AlertController.this.LJIJJ);
            } else {
                if (view == AlertController.this.LJIL && AlertController.this.LJJI != null) {
                    obtain = Message.obtain(AlertController.this.LJJI);
                }
                AlertController.this.LJJJJ.obtainMessage(1, AlertController.this.LIZIZ).sendToTarget();
            }
            if (obtain != null) {
                obtain.sendToTarget();
            }
            AlertController.this.LJJJJ.obtainMessage(1, AlertController.this.LIZIZ).sendToTarget();
        }
    };

    static {
        Covode.recordClassIndex(440);
    }

    public final void LIZ(View view, int i, int i2, int i3, int i4) {
        this.LJII = view;
        this.LJIIIIZZ = 0;
        this.LJIILIIL = true;
        this.LJIIIZ = i;
        this.LJIIJ = i2;
        this.LJIIJJI = i3;
        this.LJIIL = i4;
    }

    /* loaded from: classes20.dex */
    public static class RecycleListView extends ListView {
        public final int LIZ;
        public final int LIZIZ;

        static {
            Covode.recordClassIndex(446);
        }

        public RecycleListView(Context context) {
            this(context, null);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{2130773848, 2130773851});
            this.LIZIZ = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
            this.LIZ = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
        }
    }

    public final void LIZIZ(View view) {
        this.LJII = view;
        this.LJIIIIZZ = 0;
        this.LJIILIIL = false;
    }

    public final void LIZ(CharSequence charSequence) {
        this.f20218LJ = charSequence;
        TextView textView = this.LJJIIZ;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final void LIZIZ(CharSequence charSequence) {
        this.LJFF = charSequence;
        TextView textView = this.LJJIIZI;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public static void LIZ(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    public static boolean LIZ(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (LIZ(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public final void LIZ(int i) {
        this.LJJIIJ = null;
        this.LJJIII = i;
        ImageView imageView = this.LJJIIJZLJL;
        if (imageView != null) {
            if (i != 0) {
                imageView.setVisibility(0);
                this.LJJIIJZLJL.setImageResource(this.LJJIII);
                return;
            }
            imageView.setVisibility(8);
        }
    }

    public final void LIZ(Drawable drawable) {
        this.LJJIIJ = drawable;
        this.LJJIII = 0;
        ImageView imageView = this.LJJIIJZLJL;
        if (imageView != null) {
            if (drawable != null) {
                imageView.setVisibility(0);
                this.LJJIIJZLJL.setImageDrawable(drawable);
                return;
            }
            imageView.setVisibility(8);
        }
    }

    public static ViewGroup LIZ(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public static void LIZ(View view, View view2, View view3) {
        int i;
        int i2 = 0;
        if (view2 != null) {
            if (view.canScrollVertically(-1)) {
                i = 0;
            } else {
                i = 4;
            }
            view2.setVisibility(i);
        }
        if (view3 != null) {
            if (!view.canScrollVertically(1)) {
                i2 = 4;
            }
            view3.setVisibility(i2);
        }
    }

    public AlertController(Context context, final AppCompatDialog appCompatDialog, Window window) {
        this.LIZ = context;
        this.LIZIZ = appCompatDialog;
        this.LIZJ = window;
        this.LJJJJ = new Handler(appCompatDialog) { // from class: X.9e8
            public WeakReference<DialogInterface> LIZ;

            static {
                Covode.recordClassIndex(452);
            }

            {
                this.LIZ = new WeakReference<>(appCompatDialog);
            }

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                int i = message.what;
                if (i != -3 && i != -2 && i != -1) {
                    if (i == 1) {
                        ((DialogInterface) message.obj).dismiss();
                        return;
                    }
                    return;
                }
                ((DialogInterface.OnClickListener) message.obj).onClick(this.LIZ.get(), message.what);
            }
        };
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{16842994, 2130772524, 2130772525, 2130773637, 2130773638, 2130773785, 2130774413, 2130774429}, 2130772173, 0);
        this.LJJIJIL = obtainStyledAttributes.getResourceId(0, 0);
        this.LJJIJL = obtainStyledAttributes.getResourceId(2, 0);
        this.LJJIJLIJ = obtainStyledAttributes.getResourceId(4, 0);
        this.LJJIL = obtainStyledAttributes.getResourceId(5, 0);
        this.LJJIZ = obtainStyledAttributes.getResourceId(7, 0);
        this.LJJJ = obtainStyledAttributes.getResourceId(3, 0);
        this.LJJJI = obtainStyledAttributes.getBoolean(6, true);
        this.LIZLLL = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        appCompatDialog.supportRequestWindowFeature(1);
    }

    public final void LIZ(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.LJJJJ.obtainMessage(i, onClickListener);
        }
        if (i != -3) {
            if (i != -2) {
                if (i == -1) {
                    this.LJIILL = charSequence;
                    this.LJIILLIIL = message;
                    this.LJIIZILJ = drawable;
                    return;
                }
                throw new IllegalArgumentException("Button does not exist");
            }
            this.LJIJI = charSequence;
            this.LJIJJ = message;
            this.LJIJJLI = drawable;
            return;
        }
        this.LJJ = charSequence;
        this.LJJI = message;
        this.LJJIFFI = drawable;
    }
}
