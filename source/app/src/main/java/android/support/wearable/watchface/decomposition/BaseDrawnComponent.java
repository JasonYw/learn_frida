package android.support.wearable.watchface.decomposition;

import android.os.Bundle;
import android.support.wearable.watchface.decomposition.BaseComponent;
import android.support.wearable.watchface.decomposition.WatchFaceDecomposition;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public abstract class BaseDrawnComponent extends BaseComponent implements WatchFaceDecomposition.DrawnComponent {
    static {
        Covode.recordClassIndex(364);
    }

    @Override // android.support.wearable.watchface.decomposition.WatchFaceDecomposition.DrawnComponent
    /* renamed from: LJ */
    public int mo21215LJ() {
        return this.LIZ.getInt("zOrder");
    }

    /* loaded from: classes19.dex */
    public static abstract class BaseDrawnBuilder<T extends BaseDrawnBuilder<T, K>, K extends WatchFaceDecomposition.Component> extends BaseComponent.BaseBuilder<T, K> {
        static {
            Covode.recordClassIndex(365);
        }

        public BaseDrawnBuilder(BaseComponent.ComponentFactory<K> componentFactory) {
            super(componentFactory);
        }
    }

    public BaseDrawnComponent(Bundle bundle) {
        super(bundle);
    }
}
