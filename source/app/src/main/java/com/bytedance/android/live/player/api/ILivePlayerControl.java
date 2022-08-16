package com.bytedance.android.live.player.api;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdkapi.roomplayer.LiveRequest;
import com.bytedance.covode.number.Covode;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes12.dex */
public interface ILivePlayerControl {
    static {
        Covode.recordClassIndex(32825);
    }

    void blur();

    float curPlayerVolume();

    void disableVideoRender(boolean z);

    boolean getStopBarrier();

    boolean isMute();

    boolean isSrUsed();

    void mute();

    void notifyEventForSharePlayer(Function1<? super LifecycleOwner, Unit> function1);

    void pause();

    void prePlaySwitchRes();

    boolean release();

    void resume();

    void seekBy(int i);

    void setDsr(boolean z);

    void setIsPrePlay(boolean z);

    void setPlayerVolume(float f);

    void setProcessAudioAddr(long j);

    void setStopBarrier(boolean z);

    void stop();

    void stream(LiveRequest liveRequest, Function1<? super LifecycleOwner, Unit> function1);

    void switchResolution(String str);

    void switchStreamData(String str);

    void switchStreamData(String str, Function1<? super LiveRequest, Unit> function1);

    void unblur();

    void unmute();
}
