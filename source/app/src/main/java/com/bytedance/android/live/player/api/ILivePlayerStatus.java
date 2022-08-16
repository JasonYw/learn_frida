package com.bytedance.android.live.player.api;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.View;
import com.bytedance.android.livesdk.player.State;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONObject;
import p003X.C4C0;

/* loaded from: classes12.dex */
public interface ILivePlayerStatus {
    static {
        Covode.recordClassIndex(32829);
    }

    C4C0 context();

    long getAudioLostFocusTime();

    boolean getBufferFull();

    String getCurrentResolution();

    State getCurrentState();

    boolean getEnableBackgroundStop();

    View getExtraRenderView();

    JSONObject getFirstFrameBlockInfo();

    Object getLiveMode();

    String getLivePlayerState();

    Map<String, String> getLiveStreamBaseInfo();

    String getPlayerState();

    Surface getPlayerSurface();

    String getPullStreamData();

    boolean getShouldDestroy();

    JSONObject getStatsLog();

    String getStreamFormat();

    Pair<Integer, Integer> getVideoSize();

    boolean getVideoSizeChangeIntercept();

    Surface getViewSurface();

    SurfaceTexture getViewSurfaceTexture();

    int getVoiceDB();

    String identifier();

    boolean isPlaying();

    boolean isVideoHorizontal();

    void setEnableBackgroundStop(boolean z);

    void setShouldDestroy(boolean z);

    void setVideoSize(Pair<Integer, Integer> pair);

    void setVideoSizeChangeIntercept(boolean z);

    void updateIdentifier(String str);
}
