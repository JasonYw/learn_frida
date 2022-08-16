package android.support.p007v4.media.session;

import android.os.Bundle;
import android.os.IInterface;
import android.support.p007v4.media.MediaMetadataCompat;
import android.support.p007v4.media.session.MediaSessionCompat;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: android.support.v4.media.session.a */
/* loaded from: classes19.dex */
public interface AbstractC0140a extends IInterface {
    static {
        Covode.recordClassIndex(225);
    }

    void LIZ();

    void LIZ(int i);

    void LIZ(Bundle bundle);

    void LIZ(MediaMetadataCompat mediaMetadataCompat);

    void LIZ(ParcelableVolumeInfo parcelableVolumeInfo);

    void LIZ(PlaybackStateCompat playbackStateCompat);

    void LIZ(CharSequence charSequence);

    void LIZ(String str, Bundle bundle);

    void LIZ(List<MediaSessionCompat.QueueItem> list);

    void LIZ(boolean z);

    void LIZIZ();

    void LIZIZ(int i);

    void LIZIZ(boolean z);
}
