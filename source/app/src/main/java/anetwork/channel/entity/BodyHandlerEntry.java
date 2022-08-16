package anetwork.channel.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import anet.channel.bytes.ByteArray;
import anet.channel.bytes.C0470a;
import anet.channel.request.BodyEntry;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.IOException;
import java.io.OutputStream;
import p003X.AbstractC108834StA;
import p003X.C108833St9;

/* loaded from: classes10.dex */
public class BodyHandlerEntry implements BodyEntry {
    public static final Parcelable.Creator<BodyHandlerEntry> CREATOR = new C108833St9();
    public AbstractC108834StA LIZ;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // anet.channel.request.BodyEntry
    public String getContentType() {
        return null;
    }

    public BodyHandlerEntry() {
    }

    static {
        Covode.recordClassIndex(2443);
    }

    public /* synthetic */ BodyHandlerEntry(byte b) {
        this();
    }

    @Override // anet.channel.request.BodyEntry
    public int writeTo(OutputStream outputStream) {
        MethodCollector.m14708i(110);
        try {
            ByteArray m21051a = C0470a.C0471a.f20427a.m21051a(AccessibilityEventCompat.TYPE_WINDOW_CONTENT_CHANGED);
            int i = 0;
            while (!this.LIZ.LIZ()) {
                int LIZ = this.LIZ.LIZ(m21051a.getBuffer());
                outputStream.write(m21051a.getBuffer(), 0, LIZ);
                i += LIZ;
            }
            m21051a.recycle();
            MethodCollector.m14707o(110);
            return i;
        } catch (RemoteException e) {
            IOException iOException = new IOException("RemoteException", e);
            MethodCollector.m14707o(110);
            throw iOException;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongInterface(this.LIZ);
    }
}
