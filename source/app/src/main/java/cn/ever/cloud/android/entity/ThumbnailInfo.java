package cn.ever.cloud.android.entity;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class ThumbnailInfo {
    public final String resolution;
    public final ByteBuffer thumbnail;

    static {
        Covode.recordClassIndex(2876);
    }

    public final String getResolution() {
        return this.resolution;
    }

    public final ByteBuffer getThumbnail() {
        return this.thumbnail;
    }

    public ThumbnailInfo(String str, ByteBuffer byteBuffer) {
        C106862S5w.LIZ(str, byteBuffer);
        this.resolution = str;
        this.thumbnail = byteBuffer;
    }
}
