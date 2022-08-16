package android.p006ss.com.vboost;

import android.content.Context;
import android.p006ss.com.vboost.VboostListener;
import com.bytedance.covode.number.Covode;
import java.util.HashSet;

/* renamed from: android.ss.com.vboost.ISchedulerInitialConfigProvider */
/* loaded from: classes19.dex */
public interface ISchedulerInitialConfigProvider {
    static {
        Covode.recordClassIndex(36);
    }

    HashSet<Integer> getAllowedScenes();

    VboostListener.VboostApplogListener getApplogListener();

    Context getContext();

    Integer getLogLevel();

    Boolean getSwitch();

    VboostListener.SystemListener getSystemListener();
}
