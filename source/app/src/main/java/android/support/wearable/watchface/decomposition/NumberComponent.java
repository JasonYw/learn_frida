package android.support.wearable.watchface.decomposition;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.wearable.watchface.decomposition.BaseComponent;
import android.support.wearable.watchface.decomposition.BaseDrawnComponent;
import com.bytedance.covode.number.Covode;
import java.util.Locale;
import java.util.TimeZone;

/* loaded from: classes19.dex */
public class NumberComponent extends BaseDrawnComponent implements Parcelable {
    public static final Parcelable.Creator<NumberComponent> CREATOR = new Parcelable.Creator<NumberComponent>() { // from class: android.support.wearable.watchface.decomposition.NumberComponent.1
        static {
            Covode.recordClassIndex(379);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ NumberComponent[] newArray(int i) {
            return new NumberComponent[i];
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ NumberComponent createFromParcel(Parcel parcel) {
            return new NumberComponent(parcel, (byte) 0);
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
    public static class Builder extends BaseDrawnComponent.BaseDrawnBuilder<Builder, NumberComponent> {
        static {
            Covode.recordClassIndex(380);
        }

        public Builder() {
            super(new BaseComponent.ComponentFactory<NumberComponent>() { // from class: android.support.wearable.watchface.decomposition.NumberComponent.Builder.1
                static {
                    Covode.recordClassIndex(381);
                }
            });
        }
    }

    static {
        Covode.recordClassIndex(378);
    }

    public final long LJFF() {
        return this.LIZ.getLong("ms_per_increment");
    }

    public final long LJI() {
        return this.LIZ.getLong("highest_value");
    }

    public final int LJII() {
        return this.LIZ.getInt("font_component_id");
    }

    public final PointF LJIIIIZZ() {
        PointF pointF = (PointF) this.LIZ.getParcelable("position");
        if (pointF == null) {
            return null;
        }
        return new PointF(pointF.x, pointF.y);
    }

    public NumberComponent(Parcel parcel) {
        super(parcel.readBundle());
        this.LIZ.setClassLoader(getClass().getClassLoader());
    }

    public final String LIZ(long j) {
        long j2 = this.LIZ.getLong("lowest_value");
        long offset = ((((j + TimeZone.getDefault().getOffset(j)) + this.LIZ.getLong("time_offset_ms")) / LJFF()) % ((LJI() - j2) + 1)) + j2;
        int i = this.LIZ.getInt("leading_zeroes");
        if (i <= 0) {
            return Long.toString(offset);
        }
        Locale locale = Locale.US;
        StringBuilder sb = new StringBuilder(14);
        sb.append("%0");
        sb.append(i);
        sb.append("d");
        return String.format(locale, sb.toString(), Long.valueOf(offset));
    }

    public /* synthetic */ NumberComponent(Parcel parcel, byte b) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.LIZ);
    }
}
