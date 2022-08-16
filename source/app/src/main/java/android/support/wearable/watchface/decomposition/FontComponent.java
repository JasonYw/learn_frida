package android.support.wearable.watchface.decomposition;

import android.graphics.drawable.Icon;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.wearable.watchface.decomposition.BaseComponent;
import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public class FontComponent extends BaseComponent implements Parcelable {
    public static final Parcelable.Creator<FontComponent> CREATOR = new Parcelable.Creator<FontComponent>() { // from class: android.support.wearable.watchface.decomposition.FontComponent.1
        static {
            Covode.recordClassIndex(371);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ FontComponent[] newArray(int i) {
            return new FontComponent[i];
        }

        @Override // android.os.Parcelable.Creator
        public /* synthetic */ FontComponent createFromParcel(Parcel parcel) {
            return new FontComponent(parcel, (byte) 0);
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

    /* loaded from: classes19.dex */
    public static class Builder extends BaseComponent.BaseBuilder<Builder, FontComponent> {
        static {
            Covode.recordClassIndex(372);
        }

        public Builder() {
            super(new BaseComponent.ComponentFactory<FontComponent>() { // from class: android.support.wearable.watchface.decomposition.FontComponent.Builder.1
                static {
                    Covode.recordClassIndex(373);
                }
            });
        }
    }

    static {
        Covode.recordClassIndex(370);
    }

    /* renamed from: LJ */
    public final Icon m21216LJ() {
        return (Icon) this.LIZ.getParcelable("image");
    }

    public final int LJFF() {
        return this.LIZ.getInt("digit_count");
    }

    public FontComponent(Parcel parcel) {
        super(parcel.readBundle());
        this.LIZ.setClassLoader(getClass().getClassLoader());
    }

    public /* synthetic */ FontComponent(Parcel parcel, byte b) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.LIZ);
    }
}
