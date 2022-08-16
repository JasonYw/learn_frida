package androidx.fragment.app;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;
import p003X.AbstractC92843Mhp;
import p003X.AnonymousClass298;
import p003X.C115757VhX;

/* loaded from: classes19.dex */
public abstract class FragmentManager {
    public static final C115757VhX DEFAULT_FACTORY = new C115757VhX();
    public C115757VhX mFragmentFactory;

    /* renamed from: androidx.fragment.app.FragmentManager$c */
    /* loaded from: classes3.dex */
    public interface AbstractC0273c {
        static {
            Covode.recordClassIndex(1266);
        }

        void LIZ();
    }

    public abstract void addOnBackStackChangedListener(AbstractC0273c abstractC0273c);

    public abstract FragmentTransaction beginTransaction();

    public abstract void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract boolean executePendingTransactions();

    public abstract Fragment findFragmentById(int i);

    public abstract Fragment findFragmentByTag(String str);

    public abstract AnonymousClass298 getBackStackEntryAt(int i);

    public abstract int getBackStackEntryCount();

    public abstract Fragment getFragment(Bundle bundle, String str);

    public abstract List<Fragment> getFragments();

    public abstract Fragment getPrimaryNavigationFragment();

    public abstract boolean isDestroyed();

    public abstract boolean isStateSaved();

    public abstract void popBackStack();

    public abstract void popBackStack(int i, int i2);

    public abstract void popBackStack(String str, int i);

    public abstract boolean popBackStackImmediate();

    public abstract boolean popBackStackImmediate(int i, int i2);

    public abstract boolean popBackStackImmediate(String str, int i);

    public abstract void putFragment(Bundle bundle, String str, Fragment fragment);

    public abstract void registerFragmentLifecycleCallbacks(AbstractC92843Mhp abstractC92843Mhp, boolean z);

    public abstract void removeOnBackStackChangedListener(AbstractC0273c abstractC0273c);

    public abstract Fragment.SavedState saveFragmentInstanceState(Fragment fragment);

    public abstract void unregisterFragmentLifecycleCallbacks(AbstractC92843Mhp abstractC92843Mhp);

    public FragmentTransaction openTransaction() {
        return beginTransaction();
    }

    static {
        Covode.recordClassIndex(1263);
    }

    public C115757VhX getFragmentFactory() {
        if (this.mFragmentFactory == null) {
            this.mFragmentFactory = DEFAULT_FACTORY;
        }
        return this.mFragmentFactory;
    }

    public static void enableDebugLogging(boolean z) {
        FragmentManagerImpl.DEBUG = z;
    }

    public void setFragmentFactory(C115757VhX c115757VhX) {
        this.mFragmentFactory = c115757VhX;
    }
}
