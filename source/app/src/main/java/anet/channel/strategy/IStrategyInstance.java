package anet.channel.strategy;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* loaded from: classes2.dex */
public interface IStrategyInstance {
    static {
        Covode.recordClassIndex(2298);
    }

    void forceRefreshStrategy(String str);

    String getCNameByHost(String str);

    String getClientIp();

    List<IConnStrategy> getConnStrategyListByHost(String str);

    List<IConnStrategy> getConnStrategyListByHost(String str, IStrategyFilter iStrategyFilter);

    String getFormalizeUrl(String str);

    String getSchemeByHost(String str);

    String getSchemeByHost(String str, String str2);

    String getUnitByHost(String str);

    void initialize(Context context);

    void notifyConnEvent(String str, IConnStrategy iConnStrategy, ConnEvent connEvent);

    void registerListener(IStrategyListener iStrategyListener);

    void saveData();

    void switchEnv();

    void unregisterListener(IStrategyListener iStrategyListener);
}
