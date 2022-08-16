package androidx.fragment.app;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import com.bytedance.covode.number.Covode;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import p003X.C143793eM7;

/* renamed from: androidx.fragment.app.g */
/* loaded from: classes18.dex */
public class C0292g extends ViewModel {
    public static final ViewModelProvider.Factory LIZ = new C143793eM7();

    /* renamed from: LJ */
    public final boolean f20261LJ;
    public final HashSet<Fragment> LIZIZ = new HashSet<>();
    public final HashMap<String, C0292g> LIZJ = new HashMap<>();
    public final HashMap<String, ViewModelStore> LIZLLL = new HashMap<>();
    public boolean LJFF = false;
    public boolean LJI = false;

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        this.LJFF = true;
    }

    static {
        Covode.recordClassIndex(1301);
    }

    public int hashCode() {
        return (((this.LIZIZ.hashCode() * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final C0291f LIZ() {
        if (this.LIZIZ.isEmpty() && this.LIZJ.isEmpty() && this.LIZLLL.isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, C0292g> entry : this.LIZJ.entrySet()) {
            C0291f LIZ2 = entry.getValue().LIZ();
            if (LIZ2 != null) {
                hashMap.put(entry.getKey(), LIZ2);
            }
        }
        this.LJI = true;
        if (this.LIZIZ.isEmpty() && hashMap.isEmpty() && this.LIZLLL.isEmpty()) {
            return null;
        }
        return new C0291f(new ArrayList(this.LIZIZ), hashMap, new HashMap(this.LIZLLL));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.LIZIZ.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.LIZJ.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.LIZLLL.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(LoggerUtil.S_RIGHT_TAG);
        return sb.toString();
    }

    public C0292g(boolean z) {
        this.f20261LJ = z;
    }

    public final boolean LIZ(Fragment fragment) {
        if (!this.LIZIZ.contains(fragment)) {
            return true;
        }
        if (this.f20261LJ) {
            return this.LJFF;
        }
        if (!this.LJI) {
            return true;
        }
        return false;
    }

    public final void LIZIZ(Fragment fragment) {
        C0292g c0292g = this.LIZJ.get(fragment.mWho);
        if (c0292g != null) {
            c0292g.onCleared();
            this.LIZJ.remove(fragment.mWho);
        }
        ViewModelStore viewModelStore = this.LIZLLL.get(fragment.mWho);
        if (viewModelStore != null) {
            viewModelStore.clear();
            this.LIZLLL.remove(fragment.mWho);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C0292g c0292g = (C0292g) obj;
            if (this.LIZIZ.equals(c0292g.LIZIZ) && this.LIZJ.equals(c0292g.LIZJ) && this.LIZLLL.equals(c0292g.LIZLLL)) {
                return true;
            }
        }
        return false;
    }

    public final void LIZ(C0291f c0291f) {
        this.LIZIZ.clear();
        this.LIZJ.clear();
        this.LIZLLL.clear();
        if (c0291f != null) {
            Collection<Fragment> collection = c0291f.LIZ;
            if (collection != null) {
                this.LIZIZ.addAll(collection);
            }
            Map<String, C0291f> map = c0291f.LIZIZ;
            if (map != null) {
                for (Map.Entry<String, C0291f> entry : map.entrySet()) {
                    C0292g c0292g = new C0292g(this.f20261LJ);
                    c0292g.LIZ(entry.getValue());
                    this.LIZJ.put(entry.getKey(), c0292g);
                }
            }
            Map<String, ViewModelStore> map2 = c0291f.LIZJ;
            if (map2 != null) {
                this.LIZLLL.putAll(map2);
            }
        }
        this.LJI = false;
    }
}
