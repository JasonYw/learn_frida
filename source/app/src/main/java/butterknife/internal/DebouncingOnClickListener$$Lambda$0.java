package butterknife.internal;

import com.bytedance.covode.number.Covode;

/* loaded from: classes16.dex */
public final /* synthetic */ class DebouncingOnClickListener$$Lambda$0 implements Runnable {
    public static final Runnable $instance = new DebouncingOnClickListener$$Lambda$0();

    static {
        Covode.recordClassIndex(2556);
    }

    @Override // java.lang.Runnable
    public final void run() {
        DebouncingOnClickListener.enabled = true;
    }
}
