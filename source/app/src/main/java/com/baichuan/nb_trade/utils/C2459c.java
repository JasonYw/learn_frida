package com.baichuan.nb_trade.utils;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;

/* renamed from: com.baichuan.nb_trade.utils.c */
/* loaded from: classes10.dex */
public class C2459c {
    public static volatile C2459c LIZLLL;
    public Handler LIZ;
    public Handler LIZIZ = new Handler(Looper.getMainLooper());
    public HandlerThread LIZJ = new HandlerThread("SDK Looper Thread");

    static {
        Covode.recordClassIndex(9490);
    }

    public C2459c() {
        this.LIZJ.start();
        while (this.LIZJ.getLooper() == null) {
            try {
                this.LIZJ.wait();
            } catch (InterruptedException e) {
                new StringBuilder("创建handlerThread错误：").append(e.getMessage());
            }
        }
        this.LIZ = new Handler(this, this.LIZJ.getLooper()) { // from class: com.baichuan.nb_trade.utils.c.1
            static {
                Covode.recordClassIndex(9491);
            }

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                try {
                    super.handleMessage(message);
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
        };
    }

    public static C2459c LIZ() {
        if (LIZLLL == null) {
            synchronized (C2459c.class) {
                if (LIZLLL == null) {
                    LIZLLL = new C2459c();
                }
            }
        }
        return LIZLLL;
    }

    public final void LIZ(Runnable runnable) {
        this.LIZIZ.post(runnable);
    }

    public final void LIZ(Runnable runnable, long j) {
        this.LIZ.postDelayed(runnable, 2000L);
    }
}
