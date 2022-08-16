package androidx.core.p018os;

import android.os.Parcel;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.core.os.ParcelableCompatCreatorCallbacks */
/* loaded from: classes19.dex */
public interface ParcelableCompatCreatorCallbacks<T> {
    static {
        Covode.recordClassIndex(1012);
    }

    /* renamed from: createFromParcel */
    T mo26786createFromParcel(Parcel parcel, ClassLoader classLoader);

    /* renamed from: newArray */
    T[] mo26787newArray(int i);
}
