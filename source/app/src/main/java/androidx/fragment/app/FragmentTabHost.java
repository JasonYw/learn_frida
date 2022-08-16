package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.widget.TabHost;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import p002O.C0002O;

/* loaded from: classes6.dex */
public final class FragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {
    public final ArrayList<C0287a> LIZ;
    public Context LIZIZ;
    public FragmentManager LIZJ;
    public int LIZLLL;

    /* renamed from: LJ */
    public TabHost.OnTabChangeListener f20259LJ;
    public C0287a LJFF;
    public boolean LJI;

    /* renamed from: androidx.fragment.app.FragmentTabHost$a */
    /* loaded from: classes6.dex */
    public static final class C0287a {
        public final String LIZ;
        public final Class<?> LIZIZ;
        public final Bundle LIZJ;
        public Fragment LIZLLL;

        static {
            Covode.recordClassIndex(1291);
        }
    }

    static {
        Covode.recordClassIndex(1288);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.LJI = false;
    }

    @Override // android.widget.TabHost
    public final void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    /* loaded from: classes19.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.fragment.app.FragmentTabHost.SavedState.1
            static {
                Covode.recordClassIndex(1290);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        };
        public String LIZ;

        static {
            Covode.recordClassIndex(1289);
        }

        public String toString() {
            return C0002O.m25083C("FragmentTabHost.SavedState{", Integer.toHexString(System.identityHashCode(this)), " curTab=", this.LIZ, "}");
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.LIZ = parcel.readString();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.LIZ);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.LIZ = getCurrentTabTag();
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        int size = this.LIZ.size();
        FragmentTransaction fragmentTransaction = null;
        for (int i = 0; i < size; i++) {
            C0287a c0287a = this.LIZ.get(i);
            c0287a.LIZLLL = this.LIZJ.findFragmentByTag(c0287a.LIZ);
            if (c0287a.LIZLLL != null && !c0287a.LIZLLL.isDetached()) {
                if (c0287a.LIZ.equals(currentTabTag)) {
                    this.LJFF = c0287a;
                } else {
                    if (fragmentTransaction == null) {
                        fragmentTransaction = this.LIZJ.beginTransaction();
                    }
                    fragmentTransaction.detach(c0287a.LIZLLL);
                }
            }
        }
        this.LJI = true;
        FragmentTransaction LIZ = LIZ(currentTabTag, fragmentTransaction);
        if (LIZ != null) {
            LIZ.commit();
            this.LIZJ.executePendingTransactions();
        }
    }

    @Override // android.widget.TabHost
    public final void setOnTabChangedListener(TabHost.OnTabChangeListener onTabChangeListener) {
        this.f20259LJ = onTabChangeListener;
    }

    private C0287a LIZ(String str) {
        int size = this.LIZ.size();
        for (int i = 0; i < size; i++) {
            C0287a c0287a = this.LIZ.get(i);
            if (c0287a.LIZ.equals(str)) {
                return c0287a;
            }
        }
        return null;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.LIZ);
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    public final void onTabChanged(String str) {
        FragmentTransaction LIZ;
        if (this.LJI && (LIZ = LIZ(str, null)) != null) {
            LIZ.commit();
        }
        TabHost.OnTabChangeListener onTabChangeListener = this.f20259LJ;
        if (onTabChangeListener != null) {
            onTabChangeListener.onTabChanged(str);
        }
    }

    private FragmentTransaction LIZ(String str, FragmentTransaction fragmentTransaction) {
        C0287a LIZ = LIZ(str);
        if (this.LJFF != LIZ) {
            if (fragmentTransaction == null) {
                fragmentTransaction = this.LIZJ.beginTransaction();
            }
            C0287a c0287a = this.LJFF;
            if (c0287a != null && c0287a.LIZLLL != null) {
                fragmentTransaction.detach(this.LJFF.LIZLLL);
            }
            if (LIZ != null) {
                if (LIZ.LIZLLL == null) {
                    LIZ.LIZLLL = this.LIZJ.getFragmentFactory().LIZJ(this.LIZIZ.getClassLoader(), LIZ.LIZIZ.getName());
                    LIZ.LIZLLL.setArguments(LIZ.LIZJ);
                    fragmentTransaction.add(this.LIZLLL, LIZ.LIZLLL, LIZ.LIZ);
                } else {
                    fragmentTransaction.attach(LIZ.LIZLLL);
                }
            }
            this.LJFF = LIZ;
        }
        return fragmentTransaction;
    }
}
