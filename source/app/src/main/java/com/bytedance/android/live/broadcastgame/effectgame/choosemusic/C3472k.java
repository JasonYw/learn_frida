package com.bytedance.android.live.broadcastgame.effectgame.choosemusic;

import android.text.TextUtils;
import com.bytedance.android.live.broadcastgame.effectgame.choosemusic.C3472k;
import com.bytedance.android.livesdk.message.model.KtvMusic;
import com.bytedance.android.livesdk.message.model.MusicPanel;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.android.socialbase.downloader.downloader.BaseDownloader;
import com.p1594ss.android.socialbase.downloader.model.DownloadTask;
import io.reactivex.Single;
import io.reactivex.SingleEmitter;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.schedulers.Schedulers;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p002O.C0002O;
import p003X.C81280I1y;
import p003X.LI6;
import p003X.LI9;
import p003X.LK5;

/* renamed from: com.bytedance.android.live.broadcastgame.effectgame.choosemusic.k */
/* loaded from: classes5.dex */
public final class C3472k {
    public static ChangeQuickRedirect LIZ;
    public boolean LIZIZ;
    public MusicPanel LIZJ;
    public LI9 LIZLLL;

    /* renamed from: LJ */
    public DownloadTask f26049LJ;

    /* renamed from: com.bytedance.android.live.broadcastgame.effectgame.choosemusic.k$a */
    /* loaded from: classes5.dex */
    public interface AbstractC3473a {
        static {
            Covode.recordClassIndex(19831);
        }

        void LIZ(MusicPanel musicPanel);

        void LIZ(MusicPanel musicPanel, int i);

        void LIZIZ(MusicPanel musicPanel);
    }

    static {
        Covode.recordClassIndex(19829);
    }

    public final boolean LIZ() {
        if (!this.LIZIZ) {
            return true;
        }
        return false;
    }

    public C3472k(LI9 li9) {
        this.LIZLLL = li9;
    }

    private String LIZ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf != -1) {
            return str.substring(lastIndexOf);
        }
        return null;
    }

    private String LIZIZ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf != -1) {
            return str.substring(0, lastIndexOf);
        }
        return null;
    }

    private boolean LIZJ(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 7);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        return new File(str).exists();
    }

    public final String LIZ(KtvMusic ktvMusic) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{ktvMusic}, this, LIZ, false, 5);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        String LIZ2 = this.LIZLLL.LIZ(ktvMusic);
        File file = new File(LIZ2);
        if (!file.exists()) {
            if (file.mkdirs()) {
                Single.create(new SingleOnSubscribe(this) { // from class: X.LIA
                    public static ChangeQuickRedirect LIZ;
                    public final C3472k LIZIZ;

                    static {
                        Covode.recordClassIndex(19832);
                    }

                    {
                        this.LIZIZ = this;
                    }

                    @Override // io.reactivex.SingleOnSubscribe
                    public final void subscribe(SingleEmitter singleEmitter) {
                        String m25085C;
                        MethodCollector.m14708i(1423);
                        if (PatchProxy.proxy(new Object[]{singleEmitter}, this, LIZ, false, 1).isSupported) {
                            MethodCollector.m14707o(1423);
                            return;
                        }
                        C3472k c3472k = this.LIZIZ;
                        if (PatchProxy.proxy(new Object[]{singleEmitter}, c3472k, C3472k.LIZ, false, 9).isSupported || PatchProxy.proxy(new Object[0], c3472k, C3472k.LIZ, false, 6).isSupported) {
                            MethodCollector.m14707o(1423);
                            return;
                        }
                        synchronized (c3472k) {
                            try {
                                PatchProxyResult proxy2 = PatchProxy.proxy(new Object[0], LI9.LIZLLL, LIC.LIZ, false, 1);
                                if (proxy2.isSupported) {
                                    m25085C = (String) proxy2.result;
                                } else {
                                    m25085C = C0002O.m25085C(C90963Lsb.LIZ(), File.separator, "musicPack");
                                    Intrinsics.checkNotNullExpressionValue(m25085C, "");
                                }
                                File file2 = new File(m25085C);
                                if (file2.exists() && file2.isDirectory()) {
                                    File[] listFiles = file2.listFiles();
                                    int length = listFiles.length;
                                    if (length <= 100) {
                                        return;
                                    }
                                    int i = length - 100;
                                    List asList = Arrays.asList(listFiles);
                                    if (asList != null && asList.size() > 0) {
                                        Collections.sort(asList, LIB.LIZIZ);
                                        if (i > asList.size()) {
                                            MethodCollector.m14707o(1423);
                                            return;
                                        }
                                        for (int i2 = 0; i2 < i; i2++) {
                                            File file3 = (File) asList.get(i2);
                                            if (file3 != null && file3.exists()) {
                                                C64226BWa.LIZ(file3);
                                            }
                                        }
                                    }
                                }
                                MethodCollector.m14707o(1423);
                            } finally {
                                MethodCollector.m14707o(1423);
                            }
                        }
                    }
                }).subscribeOn(Schedulers.m138io()).subscribe(new C81280I1y());
            } else {
                throw new IOException("mkdirs return false, dir=" + file);
            }
        }
        return LIZ2 + this.LIZLLL.LIZIZ(ktvMusic);
    }

    public final void LIZ(MusicPanel musicPanel, AbstractC3473a abstractC3473a) {
        if (PatchProxy.proxy(new Object[]{musicPanel, abstractC3473a}, this, LIZ, false, 1).isSupported || this.LIZIZ) {
            return;
        }
        this.LIZJ = musicPanel;
        this.LIZIZ = true;
        try {
            String LIZ2 = LIZ(musicPanel.LJIIL);
            if (LIZJ(LIZ2)) {
                this.LIZIZ = false;
                abstractC3473a.LIZIZ(this.LIZJ);
                return;
            }
            String LIZJ = this.LIZLLL.LIZJ(musicPanel.LJIIL);
            if (TextUtils.isEmpty(LIZJ)) {
                this.LIZIZ = false;
                abstractC3473a.LIZ(this.LIZJ);
                return;
            }
            this.f26049LJ = BaseDownloader.with(LK5.LJIIJ()).url(LIZJ).name(LIZ(LIZ2)).savePath(LIZIZ(LIZ2)).subThreadListener(new LI6(this, abstractC3473a));
            this.f26049LJ.download();
        } catch (Exception unused) {
            this.LIZIZ = false;
            abstractC3473a.LIZ(this.LIZJ);
        }
    }
}
