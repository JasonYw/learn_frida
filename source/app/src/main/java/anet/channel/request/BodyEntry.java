package anet.channel.request;

import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.io.OutputStream;

/* loaded from: classes20.dex */
public interface BodyEntry extends Parcelable {
    static {
        Covode.recordClassIndex(2232);
    }

    String getContentType();

    int writeTo(OutputStream outputStream);
}
