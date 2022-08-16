package android.support.wearable.watchface.decomposition;

import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.wearable.complications.rendering.ComplicationDrawable;
import android.support.wearable.watchface.decomposition.BaseComponent;
import android.support.wearable.watchface.decomposition.BaseDrawnComponent;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;

/* loaded from: classes19.dex */
public class ComplicationComponent extends BaseDrawnComponent implements Parcelable {
    public static final Parcelable.Creator<ComplicationComponent> CREATOR = new Parcelable.Creator<ComplicationComponent>() { // from class: android.support.wearable.watchface.decomposition.ComplicationComponent.1
        static {
            Covode.recordClassIndex(367);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ComplicationComponent[] newArray(int i) {
            return new ComplicationComponent[i];
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ ComplicationComponent createFromParcel(Parcel parcel) {
            return new ComplicationComponent(parcel, (byte) 0);
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.support.wearable.watchface.decomposition.BaseComponent
    public final /* bridge */ /* synthetic */ int LIZ() {
        return super.LIZ();
    }

    @Override // android.support.wearable.watchface.decomposition.BaseComponent
    public final /* bridge */ /* synthetic */ int LIZIZ() {
        return super.LIZIZ();
    }

    @Override // android.support.wearable.watchface.decomposition.BaseComponent, android.support.wearable.watchface.decomposition.WatchFaceDecomposition.Component
    public final /* bridge */ /* synthetic */ boolean LIZJ() {
        return super.LIZJ();
    }

    @Override // android.support.wearable.watchface.decomposition.BaseComponent, android.support.wearable.watchface.decomposition.WatchFaceDecomposition.Component
    public final /* bridge */ /* synthetic */ boolean LIZLLL() {
        return super.LIZLLL();
    }

    @Override // android.support.wearable.watchface.decomposition.BaseDrawnComponent, android.support.wearable.watchface.decomposition.WatchFaceDecomposition.DrawnComponent
    /* renamed from: LJ */
    public final /* bridge */ /* synthetic */ int mo21215LJ() {
        return super.mo21215LJ();
    }

    /* loaded from: classes19.dex */
    public static class Builder extends BaseDrawnComponent.BaseDrawnBuilder<Builder, ComplicationComponent> {
        static {
            Covode.recordClassIndex(368);
        }

        public Builder() {
            super(new BaseComponent.ComponentFactory<ComplicationComponent>() { // from class: android.support.wearable.watchface.decomposition.ComplicationComponent.Builder.1
                static {
                    Covode.recordClassIndex(369);
                }
            });
        }
    }

    static {
        Covode.recordClassIndex(366);
    }

    public final RectF LJFF() {
        return new RectF((RectF) this.LIZ.getParcelable("bounds"));
    }

    public final ComplicationDrawable LJI() {
        return (ComplicationDrawable) this.LIZ.getParcelable("complication_drawable");
    }

    public final int LJII() {
        return this.LIZ.getInt("wf_complication_id");
    }

    public final int[] LJIIIIZZ() {
        int[] intArray = this.LIZ.getIntArray("complication_types");
        if (intArray == null) {
            return null;
        }
        return Arrays.copyOf(intArray, intArray.length);
    }

    public ComplicationComponent(Parcel parcel) {
        super(parcel.readBundle());
        this.LIZ.setClassLoader(getClass().getClassLoader());
    }

    public /* synthetic */ ComplicationComponent(Parcel parcel, byte b) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.LIZ);
    }
}
