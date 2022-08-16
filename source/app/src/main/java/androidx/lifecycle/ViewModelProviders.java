package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.covode.number.Covode;

/* loaded from: classes22.dex */
public class ViewModelProviders {
    static {
        Covode.recordClassIndex(1396);
    }

    /* renamed from: of */
    public static ViewModelProvider m21144of(Fragment fragment) {
        return m21143of(fragment, (ViewModelProvider.Factory) null);
    }

    public static Activity checkActivity(Fragment fragment) {
        FragmentActivity activity = fragment.getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Can't create ViewModelProvider for detached fragment");
    }

    public static Application checkApplication(Activity activity) {
        Application application = activity.getApplication();
        if (application != null) {
            return application;
        }
        throw new IllegalStateException("Your activity/fragment is not yet attached to Application. You can't request ViewModel before onCreate call.");
    }

    /* renamed from: of */
    public static ViewModelProvider m21142of(FragmentActivity fragmentActivity) {
        return m21141of(fragmentActivity, (ViewModelProvider.Factory) null);
    }

    /* renamed from: of */
    public static ViewModelProvider m21143of(Fragment fragment, ViewModelProvider.Factory factory) {
        Application checkApplication = checkApplication(checkActivity(fragment));
        if (factory == null) {
            factory = ViewModelProvider.C0323a.LIZ(checkApplication);
        }
        return new ViewModelProvider(fragment.getViewModelStore(), factory);
    }

    /* renamed from: of */
    public static ViewModelProvider m21141of(FragmentActivity fragmentActivity, ViewModelProvider.Factory factory) {
        Application checkApplication = checkApplication(fragmentActivity);
        if (factory == null) {
            factory = ViewModelProvider.C0323a.LIZ(checkApplication);
        }
        return new ViewModelProvider(fragmentActivity.getViewModelStore(), factory);
    }
}
