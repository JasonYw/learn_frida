package androidx.appcompat.view;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import com.bytedance.covode.number.Covode;
import p003X.AbstractC138442cxa;
import p003X.AbstractMenuC138417cxB;
import p003X.MenuC138436cxU;

/* renamed from: androidx.appcompat.view.e */
/* loaded from: classes17.dex */
public final class C0198e extends ActionMode {
    public final Context LIZ;
    public final AbstractC138442cxa LIZIZ;

    static {
        Covode.recordClassIndex(530);
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.LIZIZ.LIZJ();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.LIZIZ.LJIIIIZZ();
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.LIZIZ.LIZ();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.LIZIZ.LJI();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.LIZIZ.LIZIZ;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.LIZIZ.LJFF();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.LIZIZ.LIZJ;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.LIZIZ.LIZLLL();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.LIZIZ.LJII();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC138436cxU(this.LIZ, (AbstractMenuC138417cxB) this.LIZIZ.LIZIZ());
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.LIZIZ.LIZ(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.LIZIZ.LIZIZ(i);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.LIZIZ.LIZIZ = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.LIZIZ.LIZ(i);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.LIZIZ.LIZ(z);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.LIZIZ.LIZ(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.LIZIZ.LIZIZ(charSequence);
    }

    public C0198e(Context context, AbstractC138442cxa abstractC138442cxa) {
        this.LIZ = context;
        this.LIZIZ = abstractC138442cxa;
    }
}
