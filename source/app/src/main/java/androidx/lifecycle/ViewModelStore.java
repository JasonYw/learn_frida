package androidx.lifecycle;

import com.bytedance.covode.number.Covode;
import com.p1594ss.android.ugc.aweme.experiment.ReDexClinitStringAb;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class ViewModelStore {
    public final HashMap<String, ViewModel> mMap = new HashMap<>();

    static {
        if (ReDexClinitStringAb.abTest >= 5) {
            Covode.recordClassIndex(1397);
        } else {
            Covode.recordClassIndex(1397);
        }
    }

    public final void clear() {
        m21140x4f56b76a(this);
    }

    public final ViewModel get(String str) {
        return m21139x794a33b3(this, str);
    }

    public final void put(String str, ViewModel viewModel) {
        m21138x794a576c(this, str, viewModel);
    }

    public Set<String> keys() {
        return new HashSet(this.mMap.keySet());
    }

    public final void androidx_lifecycle_ViewModelStore__clear$___twin___() {
        for (ViewModel viewModel : this.mMap.values()) {
            viewModel.clear();
        }
        this.mMap.clear();
    }

    /* renamed from: androidx_lifecycle_ViewModelStore_com_ss_android_ugc_aweme_lancet_ViewModelStoreLancet_clear */
    public static void m21140x4f56b76a(ViewModelStore viewModelStore) {
        synchronized (viewModelStore) {
            viewModelStore.androidx_lifecycle_ViewModelStore__clear$___twin___();
        }
    }

    public final ViewModel androidx_lifecycle_ViewModelStore__get$___twin___(String str) {
        return this.mMap.get(str);
    }

    /* renamed from: androidx_lifecycle_ViewModelStore_com_ss_android_ugc_aweme_lancet_ViewModelStoreLancet_get */
    public static ViewModel m21139x794a33b3(ViewModelStore viewModelStore, String str) {
        ViewModel androidx_lifecycle_ViewModelStore__get$___twin___;
        synchronized (viewModelStore) {
            androidx_lifecycle_ViewModelStore__get$___twin___ = viewModelStore.androidx_lifecycle_ViewModelStore__get$___twin___(str);
        }
        return androidx_lifecycle_ViewModelStore__get$___twin___;
    }

    public final void androidx_lifecycle_ViewModelStore__put$___twin___(String str, ViewModel viewModel) {
        ViewModel put = this.mMap.put(str, viewModel);
        if (put != null) {
            put.onCleared();
        }
    }

    /* renamed from: androidx_lifecycle_ViewModelStore_com_ss_android_ugc_aweme_lancet_ViewModelStoreLancet_put */
    public static void m21138x794a576c(ViewModelStore viewModelStore, String str, ViewModel viewModel) {
        synchronized (viewModelStore) {
            viewModelStore.androidx_lifecycle_ViewModelStore__put$___twin___(str, viewModel);
        }
    }
}
