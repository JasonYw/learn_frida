package com.bef.effectsdk;

import android.media.MediaPlayer;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes20.dex */
public class AudioPlayer {
    public static final String TAG = AudioPlayer.class.getSimpleName();
    public static ChangeQuickRedirect changeQuickRedirect;
    public String mFilename;
    public boolean mIsPrepared;
    public MediaPlayer mMediaPlayer;
    public long mNativePtr;

    public native void nativeOnCompletion(long j);

    public native void nativeOnError(long j, int i, int i2);

    public native void nativeOnInfo(long j, int i, int i2);

    public native void nativeOnPrepared(long j);

    static {
        Covode.recordClassIndex(9503);
    }

    public float getCurrentPlayTime() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 12);
        if (proxy.isSupported) {
            return ((Float) proxy.result).floatValue();
        }
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer == null) {
            return 0.0f;
        }
        return mediaPlayer.getCurrentPosition() / 1000.0f;
    }

    public float getTotalPlayTime() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 13);
        if (proxy.isSupported) {
            return ((Float) proxy.result).floatValue();
        }
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer == null) {
            return 0.0f;
        }
        return mediaPlayer.getDuration() / 1000.0f;
    }

    public boolean isPlaying() {
        boolean z = false;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 8);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer == null || !this.mIsPrepared) {
            return false;
        }
        try {
            z = mediaPlayer.isPlaying();
            return z;
        } catch (Exception e) {
            e.printStackTrace();
            return z;
        }
    }

    public boolean pause() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 6);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer == null || !this.mIsPrepared) {
            return false;
        }
        mediaPlayer.pause();
        return true;
    }

    public int release() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 2);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.stop();
                this.mMediaPlayer.release();
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.mMediaPlayer = null;
        }
        return 0;
    }

    public boolean resume() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 7);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer == null || !this.mIsPrepared) {
            return false;
        }
        mediaPlayer.start();
        return true;
    }

    public void startPlay() {
        MediaPlayer mediaPlayer;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 4).isSupported || (mediaPlayer = this.mMediaPlayer) == null) {
            return;
        }
        try {
            if (!this.mIsPrepared) {
                mediaPlayer.prepare();
                this.mIsPrepared = true;
            }
            this.mMediaPlayer.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void stopPlay() {
        MediaPlayer mediaPlayer;
        if (!PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 5).isSupported && (mediaPlayer = this.mMediaPlayer) != null && this.mIsPrepared) {
            try {
                mediaPlayer.stop();
                this.mMediaPlayer.release();
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.mMediaPlayer = null;
            this.mIsPrepared = false;
        }
    }

    public int init() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        this.mIsPrepared = false;
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.mMediaPlayer.release();
        }
        this.mMediaPlayer = new MediaPlayer();
        this.mMediaPlayer.setOnInfoListener(new MediaPlayer.OnInfoListener() { // from class: com.bef.effectsdk.AudioPlayer.1
            public static ChangeQuickRedirect changeQuickRedirect;

            static {
                Covode.recordClassIndex(9504);
            }

            @Override // android.media.MediaPlayer.OnInfoListener
            public boolean onInfo(MediaPlayer mediaPlayer2, int i, int i2) {
                MethodCollector.m14708i(595);
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{mediaPlayer2, Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 1);
                if (proxy2.isSupported) {
                    boolean booleanValue = ((Boolean) proxy2.result).booleanValue();
                    MethodCollector.m14707o(595);
                    return booleanValue;
                }
                AudioPlayer audioPlayer = AudioPlayer.this;
                audioPlayer.nativeOnInfo(audioPlayer.mNativePtr, i, i2);
                MethodCollector.m14707o(595);
                return false;
            }
        });
        this.mMediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.bef.effectsdk.AudioPlayer.2
            public static ChangeQuickRedirect changeQuickRedirect;

            static {
                Covode.recordClassIndex(9505);
            }

            @Override // android.media.MediaPlayer.OnErrorListener
            public boolean onError(MediaPlayer mediaPlayer2, int i, int i2) {
                MethodCollector.m14708i(596);
                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{mediaPlayer2, Integer.valueOf(i), Integer.valueOf(i2)}, this, changeQuickRedirect, false, 1);
                if (proxy2.isSupported) {
                    boolean booleanValue = ((Boolean) proxy2.result).booleanValue();
                    MethodCollector.m14707o(596);
                    return booleanValue;
                }
                try {
                    AudioPlayer.this.mMediaPlayer.stop();
                    AudioPlayer.this.mMediaPlayer.release();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                AudioPlayer audioPlayer = AudioPlayer.this;
                audioPlayer.mMediaPlayer = null;
                audioPlayer.nativeOnError(audioPlayer.mNativePtr, i, i2);
                MethodCollector.m14707o(596);
                return false;
            }
        });
        this.mMediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.bef.effectsdk.AudioPlayer.3
            public static ChangeQuickRedirect changeQuickRedirect;

            static {
                Covode.recordClassIndex(9506);
            }

            @Override // android.media.MediaPlayer.OnPreparedListener
            public void onPrepared(MediaPlayer mediaPlayer2) {
                MethodCollector.m14708i(597);
                if (PatchProxy.proxy(new Object[]{mediaPlayer2}, this, changeQuickRedirect, false, 1).isSupported) {
                    MethodCollector.m14707o(597);
                    return;
                }
                AudioPlayer audioPlayer = AudioPlayer.this;
                audioPlayer.mIsPrepared = true;
                audioPlayer.nativeOnPrepared(audioPlayer.mNativePtr);
                MethodCollector.m14707o(597);
            }
        });
        this.mMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.bef.effectsdk.AudioPlayer.4
            public static ChangeQuickRedirect changeQuickRedirect;

            static {
                Covode.recordClassIndex(9507);
            }

            @Override // android.media.MediaPlayer.OnCompletionListener
            public void onCompletion(MediaPlayer mediaPlayer2) {
                MethodCollector.m14708i(598);
                if (PatchProxy.proxy(new Object[]{mediaPlayer2}, this, changeQuickRedirect, false, 1).isSupported) {
                    MethodCollector.m14707o(598);
                    return;
                }
                AudioPlayer audioPlayer = AudioPlayer.this;
                audioPlayer.nativeOnCompletion(audioPlayer.mNativePtr);
                MethodCollector.m14707o(598);
            }
        });
        return 0;
    }

    public void setNativePtr(long j) {
        this.mNativePtr = j;
    }

    public boolean seek(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 9);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer == null || !this.mIsPrepared) {
            return false;
        }
        try {
            mediaPlayer.seekTo(i);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }

    public void setDataSource(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        if (this.mMediaPlayer == null) {
            init();
        }
        if (str.equals(this.mFilename) && this.mIsPrepared && this.mMediaPlayer.isPlaying()) {
            return;
        }
        try {
            this.mMediaPlayer.reset();
            this.mMediaPlayer.setDataSource(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.mFilename = str;
    }

    public boolean setLoop(boolean z) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 11);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer == null) {
            return false;
        }
        mediaPlayer.setLooping(z);
        return true;
    }

    public boolean setVolume(float f) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Float.valueOf(f)}, this, changeQuickRedirect, false, 10);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer == null || !this.mIsPrepared) {
            return false;
        }
        mediaPlayer.setVolume(f, f);
        return true;
    }
}
