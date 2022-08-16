package android.support.p007v4.app;

import androidx.core.app.RemoteActionCompat;
import androidx.versionedparcelable.AbstractC0434a;
import com.bytedance.covode.number.Covode;

/* renamed from: android.support.v4.app.RemoteActionCompatParcelizer */
/* loaded from: classes10.dex */
public final class RemoteActionCompatParcelizer extends androidx.core.app.RemoteActionCompatParcelizer {
    static {
        Covode.recordClassIndex(123);
    }

    public static RemoteActionCompat read(AbstractC0434a abstractC0434a) {
        return androidx.core.app.RemoteActionCompatParcelizer.read(abstractC0434a);
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC0434a abstractC0434a) {
        androidx.core.app.RemoteActionCompatParcelizer.write(remoteActionCompat, abstractC0434a);
    }
}
