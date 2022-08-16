package com.byted.mgl.service.api.privacy.audio;

import android.media.AudioRecord;
import com.bytedance.covode.number.Covode;

/* loaded from: classes15.dex */
public interface IPrivacyAudio {
    static {
        Covode.recordClassIndex(9798);
    }

    void release(AudioRecord audioRecord, String str);

    void startRecording(AudioRecord audioRecord, String str);

    void stop(AudioRecord audioRecord, String str);
}
