package com.amazing.media;

import android.media.MediaPlayer;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.IOException;

/* loaded from: classes24.dex */
public class AudioPlayer {
    public static ChangeQuickRedirect LIZ;
    public MediaPlayer LIZIZ = new MediaPlayer();
    public String LIZJ;

    static {
        Covode.recordClassIndex(5890);
    }

    public void destroy() {
        MediaPlayer mediaPlayer;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported && (mediaPlayer = this.LIZIZ) != null) {
            mediaPlayer.stop();
            this.LIZIZ.release();
            this.LIZIZ = null;
        }
    }

    public boolean isPlaying() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return this.LIZIZ.isPlaying();
    }

    public void pause() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        this.LIZIZ.pause();
    }

    public void play() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        this.LIZIZ.reset();
        if (prepare()) {
            this.LIZIZ.start();
        }
    }

    public void resume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 6).isSupported) {
            return;
        }
        this.LIZIZ.start();
    }

    public void stop() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            return;
        }
        this.LIZIZ.stop();
    }

    public boolean prepare() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        try {
            this.LIZIZ.setDataSource(this.LIZJ);
            this.LIZIZ.setAudioStreamType(3);
            this.LIZIZ.prepare();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public AudioPlayer(String str) {
        this.LIZJ = str;
    }

    public void setLoop(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 2).isSupported) {
            return;
        }
        this.LIZIZ.setLooping(z);
    }
}
