package cn.ever.cloud.network.retrofit;

import com.bytedance.covode.number.Covode;
import java.io.OutputStream;

/* renamed from: cn.ever.cloud.network.retrofit.b */
/* loaded from: classes8.dex */
public interface AbstractC0739b {
    static {
        Covode.recordClassIndex(3257);
    }

    String fileName();

    long length();

    String mimeType();

    void writeTo(OutputStream outputStream);
}
