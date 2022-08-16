package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.collection.SimpleArrayMap;
import androidx.lifecycle.AbstractC0326p;
import androidx.loader.p019a.AbstractC0327a;
import com.bytedance.covode.number.Covode;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import p003X.AbstractC145684eqi;
import p003X.C109592TCw;

/* loaded from: classes19.dex */
public class FragmentController {
    public final AbstractC145684eqi<?> mHost;

    static {
        Covode.recordClassIndex(1262);
    }

    public void dispatchReallyStop() {
    }

    public void doLoaderDestroy() {
    }

    public void doLoaderRetain() {
    }

    public void doLoaderStart() {
    }

    public void doLoaderStop(boolean z) {
    }

    public void dumpLoaders(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public void reportLoaderStart() {
    }

    public void restoreLoaderNonConfig(SimpleArrayMap<String, AbstractC0327a> simpleArrayMap) {
    }

    public SimpleArrayMap<String, AbstractC0327a> retainLoaderNonConfig() {
        return null;
    }

    public void dispatchActivityCreated() {
        this.mHost.f19433LJ.dispatchActivityCreated();
    }

    public void dispatchCreate() {
        this.mHost.f19433LJ.dispatchCreate();
    }

    public void dispatchDestroy() {
        this.mHost.f19433LJ.dispatchDestroy();
    }

    public void dispatchDestroyView() {
        this.mHost.f19433LJ.dispatchDestroyView();
    }

    public void dispatchLowMemory() {
        this.mHost.f19433LJ.dispatchLowMemory();
    }

    public void dispatchPause() {
        this.mHost.f19433LJ.dispatchPause();
    }

    public void dispatchResume() {
        this.mHost.f19433LJ.dispatchResume();
    }

    public void dispatchStart() {
        this.mHost.f19433LJ.dispatchStart();
    }

    public void dispatchStop() {
        this.mHost.f19433LJ.dispatchStop();
    }

    public FragmentManager getSupportFragmentManager() {
        return this.mHost.f19433LJ;
    }

    public AbstractC0327a getSupportLoaderManager() {
        throw new UnsupportedOperationException("Loaders are managed separately from FragmentController, use LoaderManager.getInstance() to obtain a LoaderManager.");
    }

    public void noteStateNotSaved() {
        this.mHost.f19433LJ.noteStateNotSaved();
    }

    public boolean execPendingActions() {
        return this.mHost.f19433LJ.execPendingActions();
    }

    public int getActiveFragmentsCount() {
        return this.mHost.f19433LJ.getActiveFragmentCount();
    }

    public C0291f retainNestedNonConfig() {
        return this.mHost.f19433LJ.retainNonConfig();
    }

    public Parcelable saveAllState() {
        return this.mHost.f19433LJ.saveAllState();
    }

    public List<Fragment> retainNonConfig() {
        C0291f retainNonConfig = this.mHost.f19433LJ.retainNonConfig();
        if (retainNonConfig != null && retainNonConfig.LIZ != null) {
            return new ArrayList(retainNonConfig.LIZ);
        }
        return null;
    }

    public FragmentController(AbstractC145684eqi<?> abstractC145684eqi) {
        this.mHost = abstractC145684eqi;
    }

    public void dispatchConfigurationChanged(Configuration configuration) {
        this.mHost.f19433LJ.dispatchConfigurationChanged(configuration);
    }

    public void dispatchMultiWindowModeChanged(boolean z) {
        this.mHost.f19433LJ.dispatchMultiWindowModeChanged(z);
    }

    public void dispatchOptionsMenuClosed(Menu menu) {
        this.mHost.f19433LJ.dispatchOptionsMenuClosed(menu);
    }

    public void dispatchPictureInPictureModeChanged(boolean z) {
        this.mHost.f19433LJ.dispatchPictureInPictureModeChanged(z);
    }

    public static FragmentController createController(AbstractC145684eqi<?> abstractC145684eqi) {
        C109592TCw.LIZ(abstractC145684eqi, "callbacks == null");
        return new FragmentController(abstractC145684eqi);
    }

    public void attachHost(Fragment fragment) {
        FragmentManagerImpl fragmentManagerImpl = this.mHost.f19433LJ;
        AbstractC145684eqi<?> abstractC145684eqi = this.mHost;
        fragmentManagerImpl.attachController(abstractC145684eqi, abstractC145684eqi, fragment);
    }

    public boolean dispatchContextItemSelected(MenuItem menuItem) {
        return this.mHost.f19433LJ.dispatchContextItemSelected(menuItem);
    }

    public boolean dispatchOptionsItemSelected(MenuItem menuItem) {
        return this.mHost.f19433LJ.dispatchOptionsItemSelected(menuItem);
    }

    public boolean dispatchPrepareOptionsMenu(Menu menu) {
        return this.mHost.f19433LJ.dispatchPrepareOptionsMenu(menu);
    }

    public Fragment findFragmentByWho(String str) {
        return this.mHost.f19433LJ.findFragmentByWho(str);
    }

    public List<Fragment> getActiveFragments(List<Fragment> list) {
        return this.mHost.f19433LJ.getActiveFragments();
    }

    public void restoreSaveState(Parcelable parcelable) {
        AbstractC145684eqi<?> abstractC145684eqi = this.mHost;
        if (abstractC145684eqi instanceof AbstractC0326p) {
            abstractC145684eqi.f19433LJ.restoreSaveState(parcelable);
            return;
        }
        throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
    }

    public void restoreAllState(Parcelable parcelable, C0291f c0291f) {
        this.mHost.f19433LJ.restoreAllState(parcelable, c0291f);
    }

    public boolean dispatchCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        return this.mHost.f19433LJ.dispatchCreateOptionsMenu(menu, menuInflater);
    }

    public void restoreAllState(Parcelable parcelable, List<Fragment> list) {
        this.mHost.f19433LJ.restoreAllState(parcelable, new C0291f(list, null, null));
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mHost.f19433LJ.onCreateView(view, str, context, attributeSet);
    }
}
