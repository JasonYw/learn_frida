package android.p006ss.com.vboost;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bytedance.covode.number.Covode;

/* renamed from: android.ss.com.vboost.IImageThumbFetch */
/* loaded from: classes9.dex */
public interface IImageThumbFetch {

    /* renamed from: android.ss.com.vboost.IImageThumbFetch$Fetcher */
    /* loaded from: classes9.dex */
    public interface Fetcher {
        static {
            Covode.recordClassIndex(35);
        }

        Bitmap getThumbnail(int i, long j, int i2, int i3, BitmapFactory.Options options);
    }

    static {
        Covode.recordClassIndex(34);
    }

    Fetcher createFetcher();
}
