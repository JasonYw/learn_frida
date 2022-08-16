package com.byted.mgl.service.api.privacy.media;

import android.media.MediaRecorder;
import com.bytedance.covode.number.Covode;

/* loaded from: classes15.dex */
public interface IPrivacyMedia {
    static {
        Covode.recordClassIndex(9804);
    }

    void release(MediaRecorder mediaRecorder, String str);

    void start(MediaRecorder mediaRecorder, String str);

    void stop(MediaRecorder mediaRecorder, String str);
}
