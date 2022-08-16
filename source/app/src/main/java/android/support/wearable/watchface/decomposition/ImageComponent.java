package android.support.wearable.watchface.decomposition;

import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Icon;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.wearable.watchface.decomposition.BaseComponent;
import android.support.wearable.watchface.decomposition.BaseDrawnComponent;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public class ImageComponent extends BaseDrawnComponent implements Parcelable {
    public static final Parcelable.Creator<ImageComponent> CREATOR = new Parcelable.Creator<ImageComponent>() { // from class: android.support.wearable.watchface.decomposition.ImageComponent.1
        static {
            Covode.recordClassIndex(375);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ImageComponent[] newArray(int i) {
            return new ImageComponent[i];
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ ImageComponent createFromParcel(Parcel parcel) {
            return new ImageComponent(parcel, (byte) 0);
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
    public static class Builder extends BaseDrawnComponent.BaseDrawnBuilder<Builder, ImageComponent> {
        static {
            Covode.recordClassIndex(376);
        }

        public Builder() {
            super(new BaseComponent.ComponentFactory<ImageComponent>() { // from class: android.support.wearable.watchface.decomposition.ImageComponent.Builder.1
                static {
                    Covode.recordClassIndex(377);
                }
            });
        }
    }

    static {
        Covode.recordClassIndex(374);
    }

    public final Icon LJFF() {
        return (Icon) this.LIZ.getParcelable("image");
    }

    public final RectF LJI() {
        return new RectF((RectF) this.LIZ.getParcelable("bounds"));
    }

    public final float LJII() {
        return this.LIZ.getFloat("degreesPerDay");
    }

    public final float LJIIIZ() {
        return this.LIZ.getFloat("offsetDegrees");
    }

    public final float LJIIJ() {
        return this.LIZ.getFloat("degreesPerStep");
    }

    public final PointF LJIIIIZZ() {
        PointF pointF = (PointF) this.LIZ.getParcelable("pivot");
        if (pointF == null) {
            return null;
        }
        return new PointF(pointF.x, pointF.y);
    }

    public ImageComponent(Parcel parcel) {
        super(parcel.readBundle());
        this.LIZ.setClassLoader(getClass().getClassLoader());
    }

    public /* synthetic */ ImageComponent(Parcel parcel, byte b) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.LIZ);
    }
}
