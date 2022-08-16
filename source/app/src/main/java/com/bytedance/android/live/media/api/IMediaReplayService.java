package com.bytedance.android.live.media.api;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.core.tetris.widgets.LiveWidget;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.DataCenter;
import p003X.AbstractC443003fi;
import p003X.AbstractC443013fj;
import p003X.C442993fh;

/* loaded from: classes12.dex */
public interface IMediaReplayService extends IService {
    static {
        Covode.recordClassIndex(32419);
    }

    void checkReplay(long j, LifecycleOwner lifecycleOwner, AbstractC443003fi abstractC443003fi);

    int getCurrentTime();

    int getDuration();

    LiveWidget getVideoControlWidget(boolean z);

    boolean isPlaying();

    boolean isReplaySync(long j);

    boolean isShowGenerating();

    void pause();

    void play();

    void seekTo(long j);

    void setInteractionVisibility(View view, boolean z);

    boolean shouldStartReplay(Room room);

    void startReplay(ViewGroup viewGroup, float f, DataCenter dataCenter, C442993fh c442993fh, AbstractC443013fj abstractC443013fj);

    void stopReplay();

    void updatePlaying(boolean z);

    void updateReplayState(long j, boolean z);
}
