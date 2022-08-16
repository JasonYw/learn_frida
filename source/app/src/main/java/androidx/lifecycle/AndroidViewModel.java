package androidx.lifecycle;

import android.app.Application;
import com.bytedance.covode.number.Covode;

/* loaded from: classes28.dex */
public class AndroidViewModel extends ViewModel {
    public Application mApplication;

    static {
        Covode.recordClassIndex(1346);
    }

    public <T extends Application> T getApplication() {
        return (T) this.mApplication;
    }

    public AndroidViewModel(Application application) {
        this.mApplication = application;
    }
}
