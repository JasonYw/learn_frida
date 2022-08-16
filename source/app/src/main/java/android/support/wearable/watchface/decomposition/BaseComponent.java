package android.support.wearable.watchface.decomposition;

import android.os.Bundle;
import android.support.wearable.watchface.decomposition.WatchFaceDecomposition;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public abstract class BaseComponent implements WatchFaceDecomposition.Component {
    public final Bundle LIZ;

    /* loaded from: classes19.dex */
    public interface ComponentFactory<T extends WatchFaceDecomposition.Component> {
        static {
            Covode.recordClassIndex(363);
        }
    }

    static {
        Covode.recordClassIndex(361);
    }

    public int LIZ() {
        return this.LIZ.getInt("component_id");
    }

    public int LIZIZ() {
        return this.LIZ.getInt("display_modes");
    }

    @Override // android.support.wearable.watchface.decomposition.WatchFaceDecomposition.Component
    public boolean LIZJ() {
        if ((LIZIZ() & 1) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.support.wearable.watchface.decomposition.WatchFaceDecomposition.Component
    public boolean LIZLLL() {
        if ((LIZIZ() & 2) != 0) {
            return true;
        }
        return false;
    }

    public BaseComponent(Bundle bundle) {
        this.LIZ = bundle;
    }

    /* loaded from: classes19.dex */
    public static abstract class BaseBuilder<T extends BaseBuilder<T, K>, K extends WatchFaceDecomposition.Component> {
        static {
            Covode.recordClassIndex(362);
        }

        public BaseBuilder(ComponentFactory<K> componentFactory) {
            new Bundle();
        }
    }
}
