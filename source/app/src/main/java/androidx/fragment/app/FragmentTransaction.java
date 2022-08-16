package androidx.fragment.app;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.Lifecycle;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import p002O.C0002O;
import p003X.C139228dAG;

/* loaded from: classes19.dex */
public abstract class FragmentTransaction {
    public boolean mAddToBackStack;
    public int mBreadCrumbShortTitleRes;
    public CharSequence mBreadCrumbShortTitleText;
    public int mBreadCrumbTitleRes;
    public CharSequence mBreadCrumbTitleText;
    public ArrayList<Runnable> mCommitRunnables;
    public int mEnterAnim;
    public int mExitAnim;
    public String mName;
    public int mPopEnterAnim;
    public int mPopExitAnim;
    public ArrayList<String> mSharedElementSourceNames;
    public ArrayList<String> mSharedElementTargetNames;
    public int mTransition;
    public int mTransitionStyle;
    public ArrayList<C0288a> mOps = new ArrayList<>();
    public boolean mAllowAddToBackStack = true;
    public boolean mReorderingAllowed = false;

    static {
        Covode.recordClassIndex(1292);
    }

    public abstract int commit();

    public abstract int commitAllowingStateLoss();

    public abstract void commitNow();

    public abstract void commitNowAllowingStateLoss();

    /* renamed from: androidx.fragment.app.FragmentTransaction$a */
    /* loaded from: classes19.dex */
    public static final class C0288a {
        public int LIZ;
        public Fragment LIZIZ;
        public int LIZJ;
        public int LIZLLL;

        /* renamed from: LJ */
        public int f20260LJ;
        public int LJFF;
        public Lifecycle.State LJI;
        public Lifecycle.State LJII;

        static {
            Covode.recordClassIndex(1293);
        }

        public C0288a() {
        }

        public C0288a(int i, Fragment fragment) {
            this.LIZ = i;
            this.LIZIZ = fragment;
            this.LJI = Lifecycle.State.RESUMED;
            this.LJII = Lifecycle.State.RESUMED;
        }

        public C0288a(int i, Fragment fragment, Lifecycle.State state) {
            this.LIZ = 10;
            this.LIZIZ = fragment;
            this.LJI = fragment.mMaxState;
            this.LJII = state;
        }
    }

    public boolean isAddToBackStackAllowed() {
        return this.mAllowAddToBackStack;
    }

    public boolean isEmpty() {
        return this.mOps.isEmpty();
    }

    public FragmentTransaction disallowAddToBackStack() {
        if (!this.mAddToBackStack) {
            this.mAllowAddToBackStack = false;
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public FragmentTransaction setReorderingAllowed(boolean z) {
        this.mReorderingAllowed = z;
        return this;
    }

    public FragmentTransaction setTransition(int i) {
        this.mTransition = i;
        return this;
    }

    public FragmentTransaction setTransitionStyle(int i) {
        this.mTransitionStyle = i;
        return this;
    }

    public FragmentTransaction setAllowOptimization(boolean z) {
        setReorderingAllowed(z);
        return this;
    }

    public FragmentTransaction setBreadCrumbShortTitle(int i) {
        this.mBreadCrumbShortTitleRes = i;
        this.mBreadCrumbShortTitleText = null;
        return this;
    }

    public FragmentTransaction setBreadCrumbTitle(int i) {
        this.mBreadCrumbTitleRes = i;
        this.mBreadCrumbTitleText = null;
        return this;
    }

    public FragmentTransaction attach(Fragment fragment) {
        addOp(new C0288a(7, fragment));
        return this;
    }

    public FragmentTransaction detach(Fragment fragment) {
        addOp(new C0288a(6, fragment));
        return this;
    }

    public FragmentTransaction hide(Fragment fragment) {
        addOp(new C0288a(4, fragment));
        return this;
    }

    public FragmentTransaction remove(Fragment fragment) {
        addOp(new C0288a(3, fragment));
        return this;
    }

    public FragmentTransaction setBreadCrumbShortTitle(CharSequence charSequence) {
        this.mBreadCrumbShortTitleRes = 0;
        this.mBreadCrumbShortTitleText = charSequence;
        return this;
    }

    public FragmentTransaction setBreadCrumbTitle(CharSequence charSequence) {
        this.mBreadCrumbTitleRes = 0;
        this.mBreadCrumbTitleText = charSequence;
        return this;
    }

    public FragmentTransaction setPrimaryNavigationFragment(Fragment fragment) {
        addOp(new C0288a(8, fragment));
        return this;
    }

    public FragmentTransaction show(Fragment fragment) {
        addOp(new C0288a(5, fragment));
        return this;
    }

    public void addOp(C0288a c0288a) {
        this.mOps.add(c0288a);
        c0288a.LIZJ = this.mEnterAnim;
        c0288a.LIZLLL = this.mExitAnim;
        c0288a.f20260LJ = this.mPopEnterAnim;
        c0288a.LJFF = this.mPopExitAnim;
    }

    public FragmentTransaction addToBackStack(String str) {
        if (this.mAllowAddToBackStack) {
            this.mAddToBackStack = true;
            this.mName = str;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    public FragmentTransaction runOnCommit(Runnable runnable) {
        disallowAddToBackStack();
        if (this.mCommitRunnables == null) {
            this.mCommitRunnables = new ArrayList<>();
        }
        this.mCommitRunnables.add(runnable);
        return this;
    }

    public FragmentTransaction add(int i, Fragment fragment) {
        doAddOp(i, fragment, null, 1);
        return this;
    }

    public FragmentTransaction replace(int i, Fragment fragment) {
        replace(i, fragment, null);
        return this;
    }

    public FragmentTransaction setCustomAnimations(int i, int i2) {
        setCustomAnimations(i, i2, 0, 0);
        return this;
    }

    public FragmentTransaction setMaxLifecycle(Fragment fragment, Lifecycle.State state) {
        addOp(new C0288a(10, fragment, state));
        return this;
    }

    public FragmentTransaction add(Fragment fragment, String str) {
        doAddOp(0, fragment, str, 1);
        return this;
    }

    public FragmentTransaction addSharedElement(View view, String str) {
        if (C139228dAG.LIZ != null || C139228dAG.LIZIZ != null) {
            String transitionName = ViewCompat.getTransitionName(view);
            if (transitionName != null) {
                if (this.mSharedElementSourceNames == null) {
                    this.mSharedElementSourceNames = new ArrayList<>();
                    this.mSharedElementTargetNames = new ArrayList<>();
                } else if (!this.mSharedElementTargetNames.contains(str)) {
                    if (this.mSharedElementSourceNames.contains(transitionName)) {
                        throw new IllegalArgumentException(C0002O.m25085C("A shared element with the source name '", transitionName, "' has already been added to the transaction."));
                    }
                } else {
                    throw new IllegalArgumentException(C0002O.m25085C("A shared element with the target name '", str, "' has already been added to the transaction."));
                }
                this.mSharedElementSourceNames.add(transitionName);
                this.mSharedElementTargetNames.add(str);
            } else {
                throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
            }
        }
        return this;
    }

    public FragmentTransaction add(int i, Fragment fragment, String str) {
        doAddOp(i, fragment, str, 1);
        return this;
    }

    public FragmentTransaction replace(int i, Fragment fragment, String str) {
        if (i != 0) {
            doAddOp(i, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    public FragmentTransaction setCustomAnimations(int i, int i2, int i3, int i4) {
        this.mEnterAnim = i;
        this.mExitAnim = i2;
        this.mPopEnterAnim = i3;
        this.mPopExitAnim = i4;
        return this;
    }

    public void doAddOp(int i, Fragment fragment, String str, int i2) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
            if (str != null) {
                if (fragment.mTag != null && !str.equals(fragment.mTag)) {
                    throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
                }
                fragment.mTag = str;
            }
            if (i != 0) {
                if (i != -1) {
                    if (fragment.mFragmentId != 0 && fragment.mFragmentId != i) {
                        throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i);
                    }
                    fragment.mFragmentId = i;
                    fragment.mContainerId = i;
                } else {
                    throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
                }
            }
            addOp(new C0288a(i2, fragment));
            return;
        }
        throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
    }
}
