package androidx.fragment.app;

import androidx.fragment.app.FragmentManagerImpl;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle;
import com.bytedance.covode.number.Covode;
import java.io.PrintWriter;
import java.util.ArrayList;
import p002O.C0002O;
import p003X.AbstractC145688eqm;
import p003X.AnonymousClass298;
import p003X.C103348Qms;

/* renamed from: androidx.fragment.app.a */
/* loaded from: classes19.dex */
public final class C0289a extends FragmentTransaction implements AnonymousClass298, FragmentManagerImpl.AbstractC0282e {
    public final FragmentManagerImpl LIZ;
    public boolean LIZIZ;
    public int LIZJ = -1;

    static {
        Covode.recordClassIndex(1295);
    }

    @Override // p003X.AnonymousClass298
    public final String LIZJ() {
        return this.mName;
    }

    @Override // androidx.fragment.app.FragmentManagerImpl.AbstractC0282e
    public final boolean LIZ(ArrayList<C0289a> arrayList, ArrayList<Boolean> arrayList2) {
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (this.mAddToBackStack) {
            this.LIZ.addBackStackState(this);
            return true;
        }
        return true;
    }

    public final boolean LIZ(ArrayList<C0289a> arrayList, int i, int i2) {
        int i3;
        if (i2 == i) {
            return false;
        }
        int size = this.mOps.size();
        int i4 = -1;
        for (int i5 = 0; i5 < size; i5++) {
            FragmentTransaction.C0288a c0288a = this.mOps.get(i5);
            if (c0288a.LIZIZ != null && (i3 = c0288a.LIZIZ.mContainerId) != 0 && i3 != i4) {
                for (int i6 = i; i6 < i2; i6++) {
                    C0289a c0289a = arrayList.get(i6);
                    int size2 = c0289a.mOps.size();
                    for (int i7 = 0; i7 < size2; i7++) {
                        FragmentTransaction.C0288a c0288a2 = c0289a.mOps.get(i7);
                        if (c0288a2.LIZIZ != null && c0288a2.LIZIZ.mContainerId == i3) {
                            return true;
                        }
                    }
                }
                i4 = i3;
            }
        }
        return false;
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final int commit() {
        return LIZIZ(false);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final int commitAllowingStateLoss() {
        return LIZIZ(true);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final boolean isEmpty() {
        return this.mOps.isEmpty();
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final void commitNow() {
        disallowAddToBackStack();
        this.LIZ.execSingleAction(this, false);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final void commitNowAllowingStateLoss() {
        disallowAddToBackStack();
        this.LIZ.execSingleAction(this, true);
    }

    public final void LIZ() {
        if (this.mCommitRunnables != null) {
            for (int i = 0; i < this.mCommitRunnables.size(); i++) {
                this.mCommitRunnables.get(i).run();
            }
            this.mCommitRunnables = null;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.LIZJ >= 0) {
            sb.append(" #");
            sb.append(this.LIZJ);
        }
        if (this.mName != null) {
            sb.append(" ");
            sb.append(this.mName);
        }
        sb.append("}");
        return sb.toString();
    }

    public final void LIZIZ() {
        int size = this.mOps.size();
        for (int i = 0; i < size; i++) {
            FragmentTransaction.C0288a c0288a = this.mOps.get(i);
            Fragment fragment = c0288a.LIZIZ;
            if (fragment != null) {
                fragment.setNextTransition(this.mTransition, this.mTransitionStyle);
            }
            switch (c0288a.LIZ) {
                case 1:
                    fragment.setNextAnim(c0288a.LIZJ);
                    this.LIZ.addFragment(fragment, false);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + c0288a.LIZ);
                case 3:
                    fragment.setNextAnim(c0288a.LIZLLL);
                    this.LIZ.removeFragment(fragment);
                    break;
                case 4:
                    fragment.setNextAnim(c0288a.LIZLLL);
                    this.LIZ.hideFragment(fragment);
                    break;
                case 5:
                    fragment.setNextAnim(c0288a.LIZJ);
                    this.LIZ.showFragment(fragment);
                    break;
                case 6:
                    fragment.setNextAnim(c0288a.LIZLLL);
                    this.LIZ.detachFragment(fragment);
                    break;
                case 7:
                    fragment.setNextAnim(c0288a.LIZJ);
                    this.LIZ.attachFragment(fragment);
                    break;
                case 8:
                    this.LIZ.setPrimaryNavigationFragment(fragment);
                    break;
                case 9:
                    this.LIZ.setPrimaryNavigationFragment(null);
                    break;
                case 10:
                    this.LIZ.setMaxLifecycle(fragment, c0288a.LJII);
                    break;
            }
            if (!this.mReorderingAllowed && c0288a.LIZ != 1 && fragment != null) {
                this.LIZ.moveFragmentToExpectedState(fragment);
            }
        }
        if (!this.mReorderingAllowed) {
            FragmentManagerImpl fragmentManagerImpl = this.LIZ;
            fragmentManagerImpl.moveToState(fragmentManagerImpl.mCurState, true);
        }
    }

    public C0289a(FragmentManagerImpl fragmentManagerImpl) {
        this.LIZ = fragmentManagerImpl;
    }

    public static boolean LIZ(FragmentTransaction.C0288a c0288a) {
        Fragment fragment = c0288a.LIZIZ;
        if (fragment != null && fragment.mAdded && fragment.mView != null && !fragment.mDetached && !fragment.mHidden && fragment.isPostponed()) {
            return true;
        }
        return false;
    }

    private int LIZIZ(boolean z) {
        if (!this.LIZIZ) {
            if (FragmentManagerImpl.DEBUG) {
                PrintWriter printWriter = new PrintWriter(new C103348Qms("FragmentManager"));
                LIZ("  ", printWriter);
                printWriter.close();
            }
            this.LIZIZ = true;
            if (this.mAddToBackStack) {
                this.LIZJ = this.LIZ.allocBackStackIndex(this);
            } else {
                this.LIZJ = -1;
            }
            this.LIZ.enqueueAction(this, z);
            return this.LIZJ;
        }
        throw new IllegalStateException("commit already called");
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final FragmentTransaction detach(Fragment fragment) {
        if (fragment.mFragmentManager != null && fragment.mFragmentManager != this.LIZ) {
            throw new IllegalStateException(C0002O.m25085C("Cannot detach Fragment attached to a different FragmentManager. Fragment ", fragment.toString(), " is already attached to a FragmentManager."));
        }
        super.detach(fragment);
        return this;
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final FragmentTransaction hide(Fragment fragment) {
        if (fragment.mFragmentManager != null && fragment.mFragmentManager != this.LIZ) {
            throw new IllegalStateException(C0002O.m25085C("Cannot hide Fragment attached to a different FragmentManager. Fragment ", fragment.toString(), " is already attached to a FragmentManager."));
        }
        super.hide(fragment);
        return this;
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final FragmentTransaction remove(Fragment fragment) {
        if (fragment.mFragmentManager != null && fragment.mFragmentManager != this.LIZ) {
            throw new IllegalStateException(C0002O.m25085C("Cannot remove Fragment attached to a different FragmentManager. Fragment ", fragment.toString(), " is already attached to a FragmentManager."));
        }
        super.remove(fragment);
        return this;
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final FragmentTransaction setPrimaryNavigationFragment(Fragment fragment) {
        if (fragment != null && fragment.mFragmentManager != null && fragment.mFragmentManager != this.LIZ) {
            throw new IllegalStateException(C0002O.m25085C("Cannot setPrimaryNavigation for Fragment attached to a different FragmentManager. Fragment ", fragment.toString(), " is already attached to a FragmentManager."));
        }
        super.setPrimaryNavigationFragment(fragment);
        return this;
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final FragmentTransaction show(Fragment fragment) {
        if (fragment.mFragmentManager != null && fragment.mFragmentManager != this.LIZ) {
            throw new IllegalStateException(C0002O.m25085C("Cannot show Fragment attached to a different FragmentManager. Fragment ", fragment.toString(), " is already attached to a FragmentManager."));
        }
        super.show(fragment);
        return this;
    }

    public final void LIZ(int i) {
        if (!this.mAddToBackStack) {
            return;
        }
        int size = this.mOps.size();
        for (int i2 = 0; i2 < size; i2++) {
            FragmentTransaction.C0288a c0288a = this.mOps.get(i2);
            if (c0288a.LIZIZ != null) {
                c0288a.LIZIZ.mBackStackNesting += i;
            }
        }
    }

    public final void LIZ(AbstractC145688eqm abstractC145688eqm) {
        for (int i = 0; i < this.mOps.size(); i++) {
            FragmentTransaction.C0288a c0288a = this.mOps.get(i);
            if (LIZ(c0288a)) {
                c0288a.LIZIZ.setOnStartEnterTransitionListener(abstractC145688eqm);
            }
        }
    }

    public final boolean LIZIZ(int i) {
        int i2;
        int size = this.mOps.size();
        for (int i3 = 0; i3 < size; i3++) {
            FragmentTransaction.C0288a c0288a = this.mOps.get(i3);
            if (c0288a.LIZIZ != null && (i2 = c0288a.LIZIZ.mContainerId) != 0 && i2 == i) {
                return true;
            }
        }
        return false;
    }

    public final void LIZ(boolean z) {
        for (int size = this.mOps.size() - 1; size >= 0; size--) {
            FragmentTransaction.C0288a c0288a = this.mOps.get(size);
            Fragment fragment = c0288a.LIZIZ;
            if (fragment != null) {
                fragment.setNextTransition(FragmentManagerImpl.reverseTransit(this.mTransition), this.mTransitionStyle);
            }
            switch (c0288a.LIZ) {
                case 1:
                    fragment.setNextAnim(c0288a.LJFF);
                    this.LIZ.removeFragment(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + c0288a.LIZ);
                case 3:
                    fragment.setNextAnim(c0288a.f20260LJ);
                    this.LIZ.addFragment(fragment, false);
                    break;
                case 4:
                    fragment.setNextAnim(c0288a.f20260LJ);
                    this.LIZ.showFragment(fragment);
                    break;
                case 5:
                    fragment.setNextAnim(c0288a.LJFF);
                    this.LIZ.hideFragment(fragment);
                    break;
                case 6:
                    fragment.setNextAnim(c0288a.f20260LJ);
                    this.LIZ.attachFragment(fragment);
                    break;
                case 7:
                    fragment.setNextAnim(c0288a.LJFF);
                    this.LIZ.detachFragment(fragment);
                    break;
                case 8:
                    this.LIZ.setPrimaryNavigationFragment(null);
                    break;
                case 9:
                    this.LIZ.setPrimaryNavigationFragment(fragment);
                    break;
                case 10:
                    this.LIZ.setMaxLifecycle(fragment, c0288a.LJI);
                    break;
            }
            if (!this.mReorderingAllowed && c0288a.LIZ != 3 && fragment != null) {
                this.LIZ.moveFragmentToExpectedState(fragment);
            }
        }
        if (!this.mReorderingAllowed && z) {
            FragmentManagerImpl fragmentManagerImpl = this.LIZ;
            fragmentManagerImpl.moveToState(fragmentManagerImpl.mCurState, true);
        }
    }

    public final void LIZ(String str, PrintWriter printWriter) {
        LIZ(str, printWriter, true);
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final FragmentTransaction setMaxLifecycle(Fragment fragment, Lifecycle.State state) {
        if (fragment.mFragmentManager == this.LIZ) {
            if (state.isAtLeast(Lifecycle.State.CREATED)) {
                super.setMaxLifecycle(fragment, state);
                return this;
            }
            throw new IllegalArgumentException("Cannot set maximum Lifecycle below " + Lifecycle.State.CREATED);
        }
        throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + this.LIZ);
    }

    public final Fragment LIZIZ(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.mOps.size() - 1; size >= 0; size--) {
            FragmentTransaction.C0288a c0288a = this.mOps.get(size);
            int i = c0288a.LIZ;
            if (i != 1) {
                if (i != 3) {
                    switch (i) {
                        case 8:
                            fragment = null;
                            break;
                        case 9:
                            fragment = c0288a.LIZIZ;
                            break;
                        case 10:
                            c0288a.LJII = c0288a.LJI;
                            break;
                    }
                }
                arrayList.add(c0288a.LIZIZ);
            }
            arrayList.remove(c0288a.LIZIZ);
        }
        return fragment;
    }

    public final Fragment LIZ(ArrayList<Fragment> arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int i = 0;
        while (i < this.mOps.size()) {
            FragmentTransaction.C0288a c0288a = this.mOps.get(i);
            int i2 = c0288a.LIZ;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3 && i2 != 6) {
                        if (i2 != 7) {
                            if (i2 == 8) {
                                this.mOps.add(i, new FragmentTransaction.C0288a(9, fragment2));
                                i++;
                                fragment2 = c0288a.LIZIZ;
                            }
                        }
                    } else {
                        arrayList.remove(c0288a.LIZIZ);
                        if (c0288a.LIZIZ == fragment2) {
                            this.mOps.add(i, new FragmentTransaction.C0288a(9, c0288a.LIZIZ));
                            i++;
                            fragment2 = null;
                        }
                    }
                } else {
                    Fragment fragment3 = c0288a.LIZIZ;
                    int i3 = fragment3.mContainerId;
                    boolean z = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = arrayList.get(size);
                        if (fragment4.mContainerId == i3) {
                            if (fragment4 == fragment3) {
                                z = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.mOps.add(i, new FragmentTransaction.C0288a(9, fragment4));
                                    i++;
                                    fragment2 = null;
                                }
                                FragmentTransaction.C0288a c0288a2 = new FragmentTransaction.C0288a(3, fragment4);
                                c0288a2.LIZJ = c0288a.LIZJ;
                                c0288a2.f20260LJ = c0288a.f20260LJ;
                                c0288a2.LIZLLL = c0288a.LIZLLL;
                                c0288a2.LJFF = c0288a.LJFF;
                                this.mOps.add(i, c0288a2);
                                arrayList.remove(fragment4);
                                i++;
                            }
                        }
                    }
                    if (z) {
                        this.mOps.remove(i);
                        i--;
                    } else {
                        c0288a.LIZ = 1;
                        arrayList.add(fragment3);
                    }
                }
                i++;
            }
            arrayList.add(c0288a.LIZIZ);
            i++;
        }
        return fragment2;
    }

    public final void LIZ(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.mName);
            printWriter.print(" mIndex=");
            printWriter.print(this.LIZJ);
            printWriter.print(" mCommitted=");
            printWriter.println(this.LIZIZ);
            if (this.mTransition != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.mTransition));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.mTransitionStyle));
            }
            if (this.mEnterAnim != 0 || this.mExitAnim != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.mEnterAnim));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.mExitAnim));
            }
            if (this.mPopEnterAnim != 0 || this.mPopExitAnim != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.mPopEnterAnim));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.mPopExitAnim));
            }
            if (this.mBreadCrumbTitleRes != 0 || this.mBreadCrumbTitleText != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.mBreadCrumbTitleRes));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.mBreadCrumbTitleText);
            }
            if (this.mBreadCrumbShortTitleRes != 0 || this.mBreadCrumbShortTitleText != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.mBreadCrumbShortTitleRes));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.mBreadCrumbShortTitleText);
            }
        }
        if (!this.mOps.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = this.mOps.size();
            for (int i = 0; i < size; i++) {
                FragmentTransaction.C0288a c0288a = this.mOps.get(i);
                switch (c0288a.LIZ) {
                    case 0:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + c0288a.LIZ;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(c0288a.LIZIZ);
                if (z) {
                    if (c0288a.LIZJ != 0 || c0288a.LIZLLL != 0) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(c0288a.LIZJ));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(c0288a.LIZLLL));
                    }
                    if (c0288a.f20260LJ != 0 || c0288a.LJFF != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(c0288a.f20260LJ));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(c0288a.LJFF));
                    }
                }
            }
        }
    }

    @Override // androidx.fragment.app.FragmentTransaction
    public final void doAddOp(int i, Fragment fragment, String str, int i2) {
        super.doAddOp(i, fragment, str, i2);
        fragment.mFragmentManager = this.LIZ;
    }
}
