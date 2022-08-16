package androidx.core.p018os;

import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import p003X.C144293eUB;

/* renamed from: androidx.core.os.ParcelableCompat */
/* loaded from: classes19.dex */
public final class ParcelableCompat {
    static {
        Covode.recordClassIndex(1010);
    }

    public static <T> Parcelable.Creator<T> newCreator(ParcelableCompatCreatorCallbacks<T> parcelableCompatCreatorCallbacks) {
        return new C144293eUB(parcelableCompatCreatorCallbacks);
    }
}
