package com.alibaba.wireless.security.open.initialize;

import android.content.Context;
import com.bytedance.covode.number.Covode;

/* loaded from: classes2.dex */
public interface IInitializeComponent {

    /* loaded from: classes2.dex */
    public interface IInitFinishListener {
        static {
            Covode.recordClassIndex(4573);
        }

        void onError();

        void onSuccess();
    }

    static {
        Covode.recordClassIndex(4572);
    }

    int initialize(Context context);

    void initializeAsync(Context context);

    boolean isSoValid(Context context);

    void loadLibraryAsync(Context context);

    int loadLibrarySync(Context context);

    int loadLibrarySync(Context context, String str);

    void registerInitFinishListener(IInitFinishListener iInitFinishListener);

    void unregisterInitFinishListener(IInitFinishListener iInitFinishListener);
}
