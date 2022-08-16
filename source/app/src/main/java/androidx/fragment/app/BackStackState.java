package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* loaded from: classes19.dex */
public final class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new Parcelable.Creator<BackStackState>() { // from class: androidx.fragment.app.BackStackState.1
        static {
            Covode.recordClassIndex(1247);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ BackStackState[] newArray(int i) {
            return new BackStackState[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }
    };
    public final int[] LIZ;
    public final ArrayList<String> LIZIZ;
    public final int[] LIZJ;
    public final int[] LIZLLL;

    /* renamed from: LJ */
    public final int f20257LJ;
    public final int LJFF;
    public final String LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final CharSequence LJIIIZ;
    public final int LJIIJ;
    public final CharSequence LJIIJJI;
    public final ArrayList<String> LJIIL;
    public final ArrayList<String> LJIILIIL;
    public final boolean LJIILJJIL;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(1246);
    }

    public BackStackState(Parcel parcel) {
        boolean z;
        this.LIZ = parcel.createIntArray();
        this.LIZIZ = parcel.createStringArrayList();
        this.LIZJ = parcel.createIntArray();
        this.LIZLLL = parcel.createIntArray();
        this.f20257LJ = parcel.readInt();
        this.LJFF = parcel.readInt();
        this.LJI = parcel.readString();
        this.LJII = parcel.readInt();
        this.LJIIIIZZ = parcel.readInt();
        this.LJIIIZ = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.LJIIJ = parcel.readInt();
        this.LJIIJJI = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.LJIIL = parcel.createStringArrayList();
        this.LJIILIIL = parcel.createStringArrayList();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.LJIILJJIL = z;
    }

    public BackStackState(C0289a c0289a) {
        String str;
        int size = c0289a.mOps.size();
        this.LIZ = new int[size * 5];
        if (c0289a.mAddToBackStack) {
            this.LIZIZ = new ArrayList<>(size);
            this.LIZJ = new int[size];
            this.LIZLLL = new int[size];
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                FragmentTransaction.C0288a c0288a = c0289a.mOps.get(i2);
                int i3 = i + 1;
                this.LIZ[i] = c0288a.LIZ;
                ArrayList<String> arrayList = this.LIZIZ;
                if (c0288a.LIZIZ != null) {
                    str = c0288a.LIZIZ.mWho;
                } else {
                    str = null;
                }
                arrayList.add(str);
                int i4 = i3 + 1;
                this.LIZ[i3] = c0288a.LIZJ;
                int i5 = i4 + 1;
                this.LIZ[i4] = c0288a.LIZLLL;
                int i6 = i5 + 1;
                this.LIZ[i5] = c0288a.f20260LJ;
                i = i6 + 1;
                this.LIZ[i6] = c0288a.LJFF;
                this.LIZJ[i2] = c0288a.LJI.ordinal();
                this.LIZLLL[i2] = c0288a.LJII.ordinal();
            }
            this.f20257LJ = c0289a.mTransition;
            this.LJFF = c0289a.mTransitionStyle;
            this.LJI = c0289a.mName;
            this.LJII = c0289a.LIZJ;
            this.LJIIIIZZ = c0289a.mBreadCrumbTitleRes;
            this.LJIIIZ = c0289a.mBreadCrumbTitleText;
            this.LJIIJ = c0289a.mBreadCrumbShortTitleRes;
            this.LJIIJJI = c0289a.mBreadCrumbShortTitleText;
            this.LJIIL = c0289a.mSharedElementSourceNames;
            this.LJIILIIL = c0289a.mSharedElementTargetNames;
            this.LJIILJJIL = c0289a.mReorderingAllowed;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    public final C0289a LIZ(FragmentManagerImpl fragmentManagerImpl) {
        C0289a c0289a = new C0289a(fragmentManagerImpl);
        int i = 0;
        int i2 = 0;
        while (i < this.LIZ.length) {
            FragmentTransaction.C0288a c0288a = new FragmentTransaction.C0288a();
            int i3 = i + 1;
            c0288a.LIZ = this.LIZ[i];
            String str = this.LIZIZ.get(i2);
            if (str != null) {
                c0288a.LIZIZ = fragmentManagerImpl.mActive.get(str);
            } else {
                c0288a.LIZIZ = null;
            }
            c0288a.LJI = Lifecycle.State.values()[this.LIZJ[i2]];
            c0288a.LJII = Lifecycle.State.values()[this.LIZLLL[i2]];
            int[] iArr = this.LIZ;
            int i4 = i3 + 1;
            c0288a.LIZJ = iArr[i3];
            int i5 = i4 + 1;
            c0288a.LIZLLL = iArr[i4];
            int i6 = i5 + 1;
            c0288a.f20260LJ = iArr[i5];
            i = i6 + 1;
            c0288a.LJFF = iArr[i6];
            c0289a.mEnterAnim = c0288a.LIZJ;
            c0289a.mExitAnim = c0288a.LIZLLL;
            c0289a.mPopEnterAnim = c0288a.f20260LJ;
            c0289a.mPopExitAnim = c0288a.LJFF;
            c0289a.addOp(c0288a);
            i2++;
        }
        c0289a.mTransition = this.f20257LJ;
        c0289a.mTransitionStyle = this.LJFF;
        c0289a.mName = this.LJI;
        c0289a.LIZJ = this.LJII;
        c0289a.mAddToBackStack = true;
        c0289a.mBreadCrumbTitleRes = this.LJIIIIZZ;
        c0289a.mBreadCrumbTitleText = this.LJIIIZ;
        c0289a.mBreadCrumbShortTitleRes = this.LJIIJ;
        c0289a.mBreadCrumbShortTitleText = this.LJIIJJI;
        c0289a.mSharedElementSourceNames = this.LJIIL;
        c0289a.mSharedElementTargetNames = this.LJIILIIL;
        c0289a.mReorderingAllowed = this.LJIILJJIL;
        c0289a.LIZ(1);
        return c0289a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.LIZ);
        parcel.writeStringList(this.LIZIZ);
        parcel.writeIntArray(this.LIZJ);
        parcel.writeIntArray(this.LIZLLL);
        parcel.writeInt(this.f20257LJ);
        parcel.writeInt(this.LJFF);
        parcel.writeString(this.LJI);
        parcel.writeInt(this.LJII);
        parcel.writeInt(this.LJIIIIZZ);
        TextUtils.writeToParcel(this.LJIIIZ, parcel, 0);
        parcel.writeInt(this.LJIIJ);
        TextUtils.writeToParcel(this.LJIIJJI, parcel, 0);
        parcel.writeStringList(this.LJIIL);
        parcel.writeStringList(this.LJIILIIL);
        parcel.writeInt(this.LJIILJJIL ? 1 : 0);
    }
}
