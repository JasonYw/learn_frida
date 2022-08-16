package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import com.bytedance.covode.number.Covode;
import com.huawei.updatesdk.service.appmgr.bean.C15631a;
import java.util.WeakHashMap;
import p002O.C0002O;
import p003X.AbstractC138301cvJ;
import p003X.AbstractC138302cvK;
import p003X.AbstractC138306cvO;
import p003X.AbstractC138427cxL;
import p003X.AbstractC76125Fzr;
import p003X.C116971W2r;
import p003X.C138254cuX;
import p003X.C138269cum;
import p003X.C138282cv0;
import p003X.C138295cvD;
import p003X.C138296cvE;
import p003X.C138298cvG;
import p003X.C138299cvH;
import p003X.C138361cwH;
import p003X.C489985Yi;
import p003X.RunnableC138297cvF;
import p003X.View$OnClickListenerC138293cvB;
import p003X.View$OnClickListenerC138303cvL;
import p003X.View$OnFocusChangeListenerC138300cvI;
import p003X.View$OnKeyListenerC138294cvC;
import p003X.View$OnLayoutChangeListenerC138292cvA;

/* loaded from: classes17.dex */
public class SearchView extends LinearLayoutCompat implements AbstractC138427cxL {
    public static final C138282cv0 LJIJ;
    public final SearchAutoComplete LIZ;
    public final View LIZIZ;
    public final ImageView LIZJ;
    public final ImageView LIZLLL;

    /* renamed from: LJ */
    public final ImageView f20232LJ;
    public final ImageView LJFF;
    public final View LJI;
    public final Intent LJII;
    public final Intent LJIIIIZZ;
    public View.OnFocusChangeListener LJIIIZ;
    public AbstractC138301cvJ LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public AbstractC138306cvO LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public SearchableInfo LJIILLIIL;
    public Bundle LJIIZILJ;
    public View.OnKeyListener LJIJI;
    public final View LJIJJ;
    public final View LJIJJLI;
    public C489985Yi LJIL;
    public Rect LJJ;
    public Rect LJJI;
    public int[] LJJIFFI;
    public int[] LJJII;
    public final ImageView LJJIII;
    public final Drawable LJJIIJ;
    public final int LJJIIJZLJL;
    public final int LJJIIZ;
    public final CharSequence LJJIIZI;
    public AbstractC76125Fzr LJJIJ;
    public AbstractC138302cvK LJJIJIIJI;
    public View.OnClickListener LJJIJIIJIL;
    public CharSequence LJJIJIL;
    public boolean LJJIJL;
    public int LJJIJLIJ;
    public boolean LJJIL;
    public CharSequence LJJIZ;
    public CharSequence LJJJ;
    public boolean LJJJI;
    public int LJJJIL;
    public final Runnable LJJJJ;
    public Runnable LJJJJI;
    public final WeakHashMap<String, Drawable.ConstantState> LJJJJIZL;
    public final View.OnClickListener LJJJJJ;
    public final TextView.OnEditorActionListener LJJJJJL;
    public final AdapterView.OnItemClickListener LJJJJL;
    public final AdapterView.OnItemSelectedListener LJJJJLI;
    public TextWatcher LJJJJLL;

    public int getMaxWidth() {
        return this.LJJIJLIJ;
    }

    public int getSuggestionCommitIconResId() {
        return this.LJJIIZ;
    }

    public int getSuggestionRowLayout() {
        return this.LJJIIJZLJL;
    }

    public AbstractC138306cvO getSuggestionsAdapter() {
        return this.LJIILIIL;
    }

    public final void LIZ(CharSequence charSequence, boolean z) {
        this.LIZ.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.LIZ;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.LJJJ = charSequence;
        }
        if (!z || TextUtils.isEmpty(charSequence)) {
            return;
        }
        LIZLLL();
    }

    public final boolean LIZ(int i) {
        AbstractC138301cvJ abstractC138301cvJ = this.LJIIJ;
        if (abstractC138301cvJ == null || !abstractC138301cvJ.LIZIZ()) {
            LIZ(i, 0, (String) null);
            this.LIZ.setImeVisibility(false);
            LJIILIIL();
            return true;
        }
        return false;
    }

    private void LJIIJJI() {
        post(this.LJJJJ);
    }

    private void LJIILIIL() {
        this.LIZ.dismissDropDown();
    }

    public int getImeOptions() {
        return this.LIZ.getImeOptions();
    }

    public int getInputType() {
        return this.LIZ.getInputType();
    }

    public CharSequence getQuery() {
        return this.LIZ.getText();
    }

    /* loaded from: classes17.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: androidx.appcompat.widget.SearchView.SavedState.1
            static {
                Covode.recordClassIndex(652);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        };
        public boolean LIZ;

        static {
            Covode.recordClassIndex(651);
        }

        public String toString() {
            return C0002O.m25083C("SearchView.SavedState{", Integer.toHexString(System.identityHashCode(this)), " isIconified=", Boolean.valueOf(this.LIZ), "}");
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.LIZ));
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.LIZ = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    /* loaded from: classes17.dex */
    public static class SearchAutoComplete extends C138254cuX {
        public boolean LIZ;
        public final Runnable LIZIZ;
        public int LIZJ;
        public SearchView LIZLLL;

        static {
            Covode.recordClassIndex(653);
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public void replaceText(CharSequence charSequence) {
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            if (this.LIZJ > 0 && !super.enoughToFilter()) {
                return false;
            }
            return true;
        }

        public final void LIZ() {
            if (Build.VERSION.SDK_INT >= 29) {
                setInputMethodMode(1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            SearchView.LJIJ.LIZJ(this);
        }

        @Override // android.view.View
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                if (i >= 640 && i2 >= 480) {
                    return 192;
                }
                return 160;
            }
            return 192;
        }

        public void setSearchView(SearchView searchView) {
            this.LIZLLL = searchView;
        }

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.LIZJ = i;
        }

        @Override // p003X.C138254cuX, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.LIZ) {
                removeCallbacks(this.LIZIZ);
                post(this.LIZIZ);
            }
            return onCreateInputConnection;
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.LIZLLL.hasFocus() && getVisibility() == 0) {
                this.LIZ = true;
                if (getContext().getResources().getConfiguration().orientation == 2) {
                    LIZ();
                }
            }
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.LIZ = false;
                removeCallbacks(this.LIZIZ);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.LIZ = false;
                removeCallbacks(this.LIZIZ);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.LIZ = true;
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, 2130772213);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.LIZLLL.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.LIZLLL.LJI();
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.LIZIZ = new Runnable() { // from class: androidx.appcompat.widget.SearchView.SearchAutoComplete.1
                static {
                    Covode.recordClassIndex(654);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    SearchAutoComplete searchAutoComplete = SearchAutoComplete.this;
                    if (searchAutoComplete.LIZ) {
                        ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
                        searchAutoComplete.LIZ = false;
                    }
                }
            };
            this.LIZJ = getThreshold();
        }
    }

    private boolean LJIIIIZZ() {
        if ((this.LJIILJJIL || this.LJJIL) && !this.LJIIL) {
            return true;
        }
        return false;
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(2131427403);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(2131427404);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.LJJJJ);
        post(this.LJJJJI);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.LIZ = this.LJIIL;
        return savedState;
    }

    static {
        C138282cv0 c138282cv0;
        Covode.recordClassIndex(640);
        if (Build.VERSION.SDK_INT < 29) {
            c138282cv0 = new C138282cv0();
        } else {
            c138282cv0 = null;
        }
        LJIJ = c138282cv0;
    }

    private void LJIIIZ() {
        int i;
        if (LJIIIIZZ() && (this.LIZLLL.getVisibility() == 0 || this.LJFF.getVisibility() == 0)) {
            i = 0;
        } else {
            i = 8;
        }
        this.LJIJJLI.setVisibility(i);
    }

    private void LJIIL() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.LIZ;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(LIZIZ(queryHint));
    }

    public final void LJFF() {
        LIZ(false);
        this.LIZ.requestFocus();
        this.LIZ.setImeVisibility(true);
        View.OnClickListener onClickListener = this.LJJIJIIJIL;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public final void LJI() {
        LIZ(this.LJIIL);
        LJIIJJI();
        if (this.LIZ.hasFocus()) {
            LJII();
        }
    }

    public final void LJII() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.LIZ.refreshAutoCompleteResults();
            return;
        }
        LJIJ.LIZ(this.LIZ);
        LJIJ.LIZIZ(this.LIZ);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.LJJIJL = true;
        super.clearFocus();
        this.LIZ.clearFocus();
        this.LIZ.setImeVisibility(false);
        this.LJJIJL = false;
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.LJJIJIL;
        if (charSequence == null) {
            SearchableInfo searchableInfo = this.LJIILLIIL;
            if (searchableInfo != null && searchableInfo.getHintId() != 0) {
                return getContext().getText(this.LJIILLIIL.getHintId());
            }
            return this.LJJIIZI;
        }
        return charSequence;
    }

    private void LJIIJ() {
        int[] iArr;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.LIZ.getText());
        int i = 0;
        if (!z2 && (!this.LJIIJJI || this.LJJJI)) {
            z = false;
        }
        ImageView imageView = this.f20232LJ;
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
        Drawable drawable = this.f20232LJ.getDrawable();
        if (drawable != null) {
            if (z2) {
                iArr = ENABLED_STATE_SET;
            } else {
                iArr = EMPTY_STATE_SET;
            }
            drawable.setState(iArr);
        }
    }

    @Override // p003X.AbstractC138427cxL
    public final void LIZ() {
        if (this.LJJJI) {
            return;
        }
        this.LJJJI = true;
        this.LJJJIL = this.LIZ.getImeOptions();
        this.LIZ.setImeOptions(this.LJJJIL | C15631a.PARSE_IS_REMOVABLE_PREINSTALLED_APK);
        this.LIZ.setText("");
        setIconified(false);
    }

    public final void LIZJ() {
        int[] iArr;
        if (this.LIZ.hasFocus()) {
            iArr = FOCUSED_STATE_SET;
        } else {
            iArr = EMPTY_STATE_SET;
        }
        Drawable background = this.LIZIZ.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.LJIJJLI.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void LIZLLL() {
        Editable text = this.LIZ.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            if (this.LJJIJ != null) {
                text.toString();
            }
            if (this.LJIILLIIL != null) {
                LIZ(0, (String) null, text.toString());
            }
            this.LIZ.setImeVisibility(false);
            LJIILIIL();
        }
    }

    /* renamed from: LJ */
    public final void m21194LJ() {
        if (TextUtils.isEmpty(this.LIZ.getText())) {
            if (this.LJIIJJI) {
                AbstractC138302cvK abstractC138302cvK = this.LJJIJIIJI;
                if (abstractC138302cvK == null || !abstractC138302cvK.LIZ()) {
                    clearFocus();
                    LIZ(true);
                    return;
                }
                return;
            }
            return;
        }
        this.LIZ.setText("");
        this.LIZ.requestFocus();
        this.LIZ.setImeVisibility(true);
    }

    @Override // p003X.AbstractC138427cxL
    public final void LIZIZ() {
        LIZ("", false);
        clearFocus();
        LIZ(true);
        this.LIZ.setImeOptions(this.LJJJIL);
        this.LJJJI = false;
    }

    public void setAppSearchData(Bundle bundle) {
        this.LJIIZILJ = bundle;
    }

    public void setOnCloseListener(AbstractC138302cvK abstractC138302cvK) {
        this.LJJIJIIJI = abstractC138302cvK;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.LJIIIZ = onFocusChangeListener;
    }

    public void setOnQueryTextListener(AbstractC76125Fzr abstractC76125Fzr) {
        this.LJJIJ = abstractC76125Fzr;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.LJJIJIIJIL = onClickListener;
    }

    public void setOnSuggestionListener(AbstractC138301cvJ abstractC138301cvJ) {
        this.LJIIJ = abstractC138301cvJ;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        LJIIJJI();
    }

    public void setImeOptions(int i) {
        this.LIZ.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.LIZ.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.LJJIJLIJ = i;
        requestLayout();
    }

    public void setQueryHint(CharSequence charSequence) {
        this.LJJIJIL = charSequence;
        LJIIL();
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.LJIILJJIL = z;
        LIZ(this.LJIIL);
    }

    private void LIZ(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            C116971W2r.LIZ(getContext(), intent);
        } catch (RuntimeException unused) {
        }
    }

    public void setIconified(boolean z) {
        if (z) {
            m21194LJ();
        } else {
            LJFF();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.LJIIJJI == z) {
            return;
        }
        this.LJIIJJI = z;
        LIZ(z);
        LJIIL();
    }

    public void setSuggestionsAdapter(AbstractC138306cvO abstractC138306cvO) {
        this.LJIILIIL = abstractC138306cvO;
        this.LIZ.setAdapter(this.LJIILIIL);
    }

    private void LIZIZ(boolean z) {
        int i;
        if (this.LJIILJJIL && LJIIIIZZ() && hasFocus() && (z || !this.LJJIL)) {
            i = 0;
        } else {
            i = 8;
        }
        this.LIZLLL.setVisibility(i);
    }

    private void LIZJ(boolean z) {
        int i;
        if (this.LJJIL && !this.LJIIL && z) {
            i = 0;
            this.LIZLLL.setVisibility(8);
        } else {
            i = 8;
        }
        this.LJFF.setVisibility(i);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        LIZ(savedState.LIZ);
        requestLayout();
    }

    public void setQuery(CharSequence charSequence) {
        int length;
        this.LIZ.setText(charSequence);
        SearchAutoComplete searchAutoComplete = this.LIZ;
        if (TextUtils.isEmpty(charSequence)) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        searchAutoComplete.setSelection(length);
    }

    public void setQueryRefinementEnabled(boolean z) {
        int i;
        this.LJIILL = z;
        AbstractC138306cvO abstractC138306cvO = this.LJIILIIL;
        if (abstractC138306cvO instanceof View$OnClickListenerC138303cvL) {
            View$OnClickListenerC138303cvL view$OnClickListenerC138303cvL = (View$OnClickListenerC138303cvL) abstractC138306cvO;
            if (z) {
                i = 2;
            } else {
                i = 1;
            }
            view$OnClickListenerC138303cvL.LIZ = i;
        }
    }

    private CharSequence LIZIZ(CharSequence charSequence) {
        if (this.LJIIJJI && this.LJJIIJ != null) {
            int textSize = (int) (this.LIZ.getTextSize() * 1.25d);
            this.LJJIIJ.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(this.LJJIIJ), 1, 2, 33);
            spannableStringBuilder.append(charSequence);
            return spannableStringBuilder;
        }
        return charSequence;
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        Intent intent;
        int i;
        this.LJIILLIIL = searchableInfo;
        SearchableInfo searchableInfo2 = this.LJIILLIIL;
        if (searchableInfo2 != null) {
            this.LIZ.setThreshold(searchableInfo2.getSuggestThreshold());
            this.LIZ.setImeOptions(this.LJIILLIIL.getImeOptions());
            int inputType = this.LJIILLIIL.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.LJIILLIIL.getSuggestAuthority() != null) {
                    inputType = inputType | 65536 | 524288;
                }
            }
            this.LIZ.setInputType(inputType);
            AbstractC138306cvO abstractC138306cvO = this.LJIILIIL;
            if (abstractC138306cvO != null) {
                abstractC138306cvO.LIZ((Cursor) null);
            }
            if (this.LJIILLIIL.getSuggestAuthority() != null) {
                this.LJIILIIL = new View$OnClickListenerC138303cvL(getContext(), this, this.LJIILLIIL, this.LJJJJIZL);
                this.LIZ.setAdapter(this.LJIILIIL);
                View$OnClickListenerC138303cvL view$OnClickListenerC138303cvL = (View$OnClickListenerC138303cvL) this.LJIILIIL;
                if (this.LJIILL) {
                    i = 2;
                } else {
                    i = 1;
                }
                view$OnClickListenerC138303cvL.LIZ = i;
            }
            LJIIL();
        }
        SearchableInfo searchableInfo3 = this.LJIILLIIL;
        boolean z = false;
        if (searchableInfo3 != null && searchableInfo3.getVoiceSearchEnabled()) {
            if (this.LJIILLIIL.getVoiceSearchLaunchWebSearch()) {
                intent = this.LJII;
            } else if (this.LJIILLIIL.getVoiceSearchLaunchRecognizer()) {
                intent = this.LJIIIIZZ;
            }
            if (intent != null && getContext().getPackageManager().resolveActivity(intent, 65536) != null) {
                z = true;
            }
        }
        this.LJJIL = z;
        if (this.LJJIL) {
            this.LIZ.setPrivateImeOptions("nm");
        }
        LIZ(this.LJIIL);
    }

    private void LIZ(boolean z) {
        int i;
        int i2;
        this.LJIIL = z;
        int i3 = 0;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        boolean z2 = !TextUtils.isEmpty(this.LIZ.getText());
        this.LIZJ.setVisibility(i);
        LIZIZ(z2);
        View view = this.LJIJJ;
        if (z) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        view.setVisibility(i2);
        if (this.LJJIII.getDrawable() == null || this.LJIIJJI) {
            i3 = 8;
        }
        this.LJJIII.setVisibility(i3);
        LJIIJ();
        LIZJ(!z2);
        LJIIIZ();
    }

    public final void LIZ(CharSequence charSequence) {
        Editable text = this.LIZ.getText();
        this.LJJJ = text;
        boolean z = !TextUtils.isEmpty(text);
        LIZIZ(z);
        LIZJ(!z);
        LJIIJ();
        LJIIIZ();
        if (this.LJJIJ != null && !TextUtils.equals(charSequence, this.LJJIZ)) {
            this.LJJIJ.LIZ(charSequence.toString());
        }
        this.LJJIZ = charSequence.toString();
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 2130774331);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i, Rect rect) {
        if (this.LJJIJL || !isFocusable()) {
            return false;
        }
        if (!this.LJIIL) {
            boolean requestFocus = this.LIZ.requestFocus(i, rect);
            if (requestFocus) {
                LIZ(false);
            }
            return requestFocus;
        }
        return super.requestFocus(i, rect);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        if (this.LJIIL) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824 && (i3 = this.LJJIJLIJ) > 0) {
                    size = Math.min(i3, size);
                }
            } else {
                size = this.LJJIJLIJ;
                if (size <= 0) {
                    size = getPreferredWidth();
                }
            }
        } else {
            int i4 = this.LJJIJLIJ;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getPreferredWidth(), size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                size2 = getPreferredHeight();
            }
        } else {
            size2 = Math.min(getPreferredHeight(), size2);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    private boolean LIZ(int i, int i2, String str) {
        Cursor LIZ = this.LJIILIIL.LIZ();
        if (LIZ == null || !LIZ.moveToPosition(i)) {
            return false;
        }
        LIZ(LIZ(LIZ, 0, (String) null));
        return true;
    }

    private Intent LIZ(Cursor cursor, int i, String str) {
        Uri parse;
        String LIZ;
        try {
            try {
                String LIZ2 = View$OnClickListenerC138303cvL.LIZ(cursor, "suggest_intent_action");
                if (LIZ2 == null) {
                    LIZ2 = this.LJIILLIIL.getSuggestIntentAction();
                }
                if (LIZ2 == null) {
                    LIZ2 = "android.intent.action.SEARCH";
                }
                String LIZ3 = View$OnClickListenerC138303cvL.LIZ(cursor, "suggest_intent_data");
                if (LIZ3 == null) {
                    LIZ3 = this.LJIILLIIL.getSuggestIntentData();
                }
                if (LIZ3 != null && (LIZ = View$OnClickListenerC138303cvL.LIZ(cursor, "suggest_intent_data_id")) != null) {
                    new StringBuilder();
                    LIZ3 = C0002O.m25085C(LIZ3, "/", Uri.encode(LIZ));
                }
                if (LIZ3 == null) {
                    parse = null;
                } else {
                    parse = Uri.parse(LIZ3);
                }
                return LIZ(LIZ2, parse, View$OnClickListenerC138303cvL.LIZ(cursor, "suggest_intent_extra_data"), View$OnClickListenerC138303cvL.LIZ(cursor, "suggest_intent_query"), i, str);
            } catch (RuntimeException unused) {
                cursor.getPosition();
                return null;
            }
        } catch (RuntimeException unused2) {
            return null;
        }
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LJJ = new Rect();
        this.LJJI = new Rect();
        this.LJJIFFI = new int[2];
        this.LJJII = new int[2];
        this.LJJJJ = new Runnable() { // from class: androidx.appcompat.widget.SearchView.1
            static {
                Covode.recordClassIndex(641);
            }

            @Override // java.lang.Runnable
            public final void run() {
                SearchView.this.LIZJ();
            }
        };
        this.LJJJJI = new RunnableC138297cvF(this);
        this.LJJJJIZL = new WeakHashMap<>();
        this.LJJJJJ = new View$OnClickListenerC138293cvB(this);
        this.LJIJI = new View$OnKeyListenerC138294cvC(this);
        this.LJJJJJL = new C138299cvH(this);
        this.LJJJJL = new C138296cvE(this);
        this.LJJJJLI = new C138295cvD(this);
        this.LJJJJLL = new C138298cvG(this);
        C138269cum LIZ = C138269cum.LIZ(context, attributeSet, new int[]{16842970, 16843039, 16843296, 16843364, 2130772733, 2130772771, 2130772881, 2130773194, 2130773274, 2130773485, 2130774050, 2130774051, 2130774329, 2130774330, 2130774392, 2130774596, 2130774602, 2130775025}, i, 0);
        C116971W2r.LIZ(LayoutInflater.from(context), LIZ.LJI(9, 2131689512), (ViewGroup) this, true);
        this.LIZ = (SearchAutoComplete) findViewById(2131189030);
        this.LIZ.setSearchView(this);
        this.LJIJJ = findViewById(2131188917);
        this.LIZIZ = findViewById(2131189010);
        this.LJIJJLI = findViewById(2131190992);
        this.LIZJ = (ImageView) findViewById(2131188883);
        this.LIZLLL = (ImageView) findViewById(2131188926);
        this.f20232LJ = (ImageView) findViewById(2131188903);
        this.LJFF = (ImageView) findViewById(2131189059);
        this.LJJIII = (ImageView) findViewById(2131188984);
        ViewCompat.setBackground(this.LIZIZ, LIZ.LIZ(10));
        ViewCompat.setBackground(this.LJIJJLI, LIZ.LIZ(15));
        this.LIZJ.setImageDrawable(LIZ.LIZ(13));
        this.LIZLLL.setImageDrawable(LIZ.LIZ(7));
        this.f20232LJ.setImageDrawable(LIZ.LIZ(4));
        this.LJFF.setImageDrawable(LIZ.LIZ(17));
        this.LJJIII.setImageDrawable(LIZ.LIZ(13));
        this.LJJIIJ = LIZ.LIZ(12);
        C138361cwH.LIZ(this.LIZJ, getResources().getString(2131558666));
        this.LJJIIJZLJL = LIZ.LJI(16, 2131689511);
        this.LJJIIZ = LIZ.LJI(5, 0);
        this.LIZJ.setOnClickListener(this.LJJJJJ);
        this.f20232LJ.setOnClickListener(this.LJJJJJ);
        this.LIZLLL.setOnClickListener(this.LJJJJJ);
        this.LJFF.setOnClickListener(this.LJJJJJ);
        this.LIZ.setOnClickListener(this.LJJJJJ);
        this.LIZ.addTextChangedListener(this.LJJJJLL);
        this.LIZ.setOnEditorActionListener(this.LJJJJJL);
        this.LIZ.setOnItemClickListener(this.LJJJJL);
        this.LIZ.setOnItemSelectedListener(this.LJJJJLI);
        this.LIZ.setOnKeyListener(this.LJIJI);
        this.LIZ.setOnFocusChangeListener(new View$OnFocusChangeListenerC138300cvI(this));
        setIconifiedByDefault(LIZ.LIZ(8, true));
        int m21664LJ = LIZ.m21664LJ(1, -1);
        if (m21664LJ != -1) {
            setMaxWidth(m21664LJ);
        }
        this.LJJIIZI = LIZ.LIZJ(6);
        this.LJJIJIL = LIZ.LIZJ(11);
        int LIZ2 = LIZ.LIZ(3, -1);
        if (LIZ2 != -1) {
            setImeOptions(LIZ2);
        }
        int LIZ3 = LIZ.LIZ(2, -1);
        if (LIZ3 != -1) {
            setInputType(LIZ3);
        }
        setFocusable(LIZ.LIZ(0, true));
        LIZ.LIZ();
        this.LJII = new Intent("android.speech.action.WEB_SEARCH");
        this.LJII.addFlags(268435456);
        this.LJII.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        this.LJIIIIZZ = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.LJIIIIZZ.addFlags(268435456);
        this.LJI = findViewById(this.LIZ.getDropDownAnchor());
        View view = this.LJI;
        if (view != null) {
            view.addOnLayoutChangeListener(new View$OnLayoutChangeListenerC138292cvA(this));
        }
        LIZ(this.LJIIJJI);
        LJIIL();
    }

    public final void LIZ(int i, String str, String str2) {
        C116971W2r.LIZ(getContext(), LIZ("android.intent.action.SEARCH", null, null, str2, 0, null));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [X.5Yi] */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.LIZ;
            Rect rect = this.LJJ;
            searchAutoComplete.getLocationInWindow(this.LJJIFFI);
            getLocationInWindow(this.LJJII);
            int[] iArr = this.LJJIFFI;
            int i5 = iArr[1];
            int[] iArr2 = this.LJJII;
            int i6 = i5 - iArr2[1];
            int i7 = iArr[0] - iArr2[0];
            rect.set(i7, i6, searchAutoComplete.getWidth() + i7, searchAutoComplete.getHeight() + i6);
            this.LJJI.set(this.LJJ.left, 0, this.LJJ.right, i4 - i2);
            C489985Yi c489985Yi = this.LJIL;
            if (c489985Yi == null) {
                final Rect rect2 = this.LJJI;
                final Rect rect3 = this.LJJ;
                final SearchAutoComplete searchAutoComplete2 = this.LIZ;
                this.LJIL = new TouchDelegate(rect2, rect3, searchAutoComplete2) { // from class: X.5Yi
                    public final View LIZ;

                    /* renamed from: LJ */
                    public final int f1685LJ;
                    public boolean LJFF;
                    public final Rect LIZIZ = new Rect();
                    public final Rect LIZLLL = new Rect();
                    public final Rect LIZJ = new Rect();

                    static {
                        Covode.recordClassIndex(659);
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
                        if (r7.LIZLLL.contains(r1, r3) == false) goto L16;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:9:0x0020, code lost:
                        if (1 != 0) goto L10;
                     */
                    @Override // android.view.TouchDelegate
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final boolean onTouchEvent(android.view.MotionEvent r8) {
                        /*
                            r7 = this;
                            float r0 = r8.getX()
                            int r1 = (int) r0
                            float r0 = r8.getY()
                            int r3 = (int) r0
                            int r6 = r8.getAction()
                            r2 = 2
                            r5 = 1
                            r4 = 0
                            if (r6 == 0) goto L60
                            if (r6 == r5) goto L44
                            if (r6 == r2) goto L44
                            r0 = 3
                            if (r6 != r0) goto L43
                            boolean r0 = r7.LJFF
                            r7.LJFF = r4
                            if (r0 == 0) goto L43
                            if (r5 == 0) goto L50
                        L22:
                            android.graphics.Rect r0 = r7.LIZJ
                            boolean r0 = r0.contains(r1, r3)
                            if (r0 != 0) goto L50
                            android.view.View r0 = r7.LIZ
                            int r0 = r0.getWidth()
                            int r0 = r0 / r2
                            float r1 = (float) r0
                            android.view.View r0 = r7.LIZ
                            int r0 = r0.getHeight()
                            int r0 = r0 / r2
                            float r0 = (float) r0
                            r8.setLocation(r1, r0)
                        L3d:
                            android.view.View r0 = r7.LIZ
                            boolean r4 = r0.dispatchTouchEvent(r8)
                        L43:
                            return r4
                        L44:
                            boolean r0 = r7.LJFF
                            if (r0 == 0) goto L43
                            android.graphics.Rect r0 = r7.LIZLLL
                            boolean r0 = r0.contains(r1, r3)
                            if (r0 != 0) goto L22
                        L50:
                            android.graphics.Rect r0 = r7.LIZJ
                            int r0 = r0.left
                            int r1 = r1 - r0
                            float r1 = (float) r1
                            android.graphics.Rect r0 = r7.LIZJ
                            int r0 = r0.top
                            int r3 = r3 - r0
                            float r0 = (float) r3
                            r8.setLocation(r1, r0)
                            goto L3d
                        L60:
                            android.graphics.Rect r0 = r7.LIZIZ
                            boolean r0 = r0.contains(r1, r3)
                            if (r0 == 0) goto L43
                            r7.LJFF = r5
                            r0 = 1
                            goto L22
                        */
                        throw new UnsupportedOperationException("Method not decompiled: p003X.C489985Yi.onTouchEvent(android.view.MotionEvent):boolean");
                    }

                    public final void LIZ(Rect rect4, Rect rect5) {
                        this.LIZIZ.set(rect4);
                        this.LIZLLL.set(rect4);
                        Rect rect6 = this.LIZLLL;
                        int i8 = this.f1685LJ;
                        rect6.inset(-i8, -i8);
                        this.LIZJ.set(rect5);
                    }

                    {
                        super(rect2, searchAutoComplete2);
                        this.f1685LJ = ViewConfiguration.get(searchAutoComplete2.getContext()).getScaledTouchSlop();
                        LIZ(rect2, rect3);
                        this.LIZ = searchAutoComplete2;
                    }
                };
                setTouchDelegate(this.LJIL);
                return;
            }
            c489985Yi.LIZ(this.LJJI, this.LJJ);
        }
    }

    private Intent LIZ(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.LJJJ);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.LJIIZILJ;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.LJIILLIIL.getSearchActivity());
        return intent;
    }
}
