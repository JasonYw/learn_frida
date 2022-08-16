package android.support.wearable.watchface.decomposition;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes19.dex */
public class WatchFaceDecomposition implements Parcelable {
    public static final Parcelable.Creator<WatchFaceDecomposition> CREATOR = new Parcelable.Creator<WatchFaceDecomposition>() { // from class: android.support.wearable.watchface.decomposition.WatchFaceDecomposition.1
        static {
            Covode.recordClassIndex(383);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ WatchFaceDecomposition[] newArray(int i) {
            return new WatchFaceDecomposition[i];
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ WatchFaceDecomposition createFromParcel(Parcel parcel) {
            return new WatchFaceDecomposition(parcel, (byte) 0);
        }
    };
    public final List<ImageComponent> LIZ;
    public final List<NumberComponent> LIZIZ;
    public final List<FontComponent> LIZJ;
    public final List<ComplicationComponent> LIZLLL;

    /* loaded from: classes19.dex */
    public interface Component {
        static {
            Covode.recordClassIndex(385);
        }

        boolean LIZJ();

        boolean LIZLLL();
    }

    /* loaded from: classes19.dex */
    public interface DrawnComponent extends Component {
        static {
            Covode.recordClassIndex(386);
        }

        /* renamed from: LJ */
        int mo21215LJ();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(382);
    }

    /* loaded from: classes19.dex */
    public static class Builder {
        static {
            Covode.recordClassIndex(384);
        }

        public Builder() {
            new ArrayList();
            new ArrayList();
            new ArrayList();
            new ArrayList();
        }
    }

    public WatchFaceDecomposition(Parcel parcel) {
        Bundle readBundle = parcel.readBundle(getClass().getClassLoader());
        List<ImageComponent> parcelableArrayList = readBundle.getParcelableArrayList("images");
        List<NumberComponent> parcelableArrayList2 = readBundle.getParcelableArrayList("numbers");
        List<FontComponent> parcelableArrayList3 = readBundle.getParcelableArrayList("fonts");
        List<ComplicationComponent> parcelableArrayList4 = readBundle.getParcelableArrayList("complications");
        this.LIZ = parcelableArrayList == null ? Collections.emptyList() : parcelableArrayList;
        this.LIZIZ = parcelableArrayList2 == null ? Collections.emptyList() : parcelableArrayList2;
        this.LIZJ = parcelableArrayList3 == null ? Collections.emptyList() : parcelableArrayList3;
        this.LIZLLL = parcelableArrayList4 == null ? Collections.emptyList() : parcelableArrayList4;
    }

    public /* synthetic */ WatchFaceDecomposition(Parcel parcel, byte b) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("images", new ArrayList<>(this.LIZ));
        bundle.putParcelableArrayList("numbers", new ArrayList<>(this.LIZIZ));
        bundle.putParcelableArrayList("fonts", new ArrayList<>(this.LIZJ));
        bundle.putParcelableArrayList("complications", new ArrayList<>(this.LIZLLL));
        parcel.writeBundle(bundle);
    }
}
