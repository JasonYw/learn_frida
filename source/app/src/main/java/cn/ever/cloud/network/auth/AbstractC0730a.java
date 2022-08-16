package cn.ever.cloud.network.auth;

import com.bytedance.covode.number.Covode;
import java.util.Map;
import kotlinx.coroutines.flow.Flow;

/* renamed from: cn.ever.cloud.network.auth.a */
/* loaded from: classes23.dex */
public interface AbstractC0730a {
    static {
        Covode.recordClassIndex(3184);
    }

    Map<String, String> getTokenMap();

    UserId getUserId();

    void onTokenExceeded();

    Flow<UserInconsistentEvent> onUserInconsistentEvent();
}
