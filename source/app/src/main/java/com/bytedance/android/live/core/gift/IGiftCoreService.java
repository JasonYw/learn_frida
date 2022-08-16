package com.bytedance.android.live.core.gift;

import android.os.Bundle;
import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.gift.model.C7199p;
import com.bytedance.android.livesdk.message.AbstractC8677d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.DataCenter;
import java.util.List;

/* loaded from: classes12.dex */
public interface IGiftCoreService extends IService {
    static {
        Covode.recordClassIndex(23450);
    }

    void addGiftSendResultListener(AbstractC4071b abstractC4071b);

    boolean allowSendToGuest();

    void closeGiftDialog();

    C7199p findGiftById(long j);

    AbstractC8677d getAssetsInterceptor(boolean z);

    String getAssetsPath(String str, long j);

    User getDefaultUserToSendGift();

    AbstractC8677d getGiftInterceptor(long j, boolean z);

    boolean getGiftTraySwitch();

    boolean getNeedShowGiftEffectSwitch();

    boolean isVSGiftIconShow(DataCenter dataCenter);

    void openGiftDialog(int i);

    void openGiftDialog(int i, long j, long j2, Bundle bundle);

    void openGiftDialog(int i, long j, long j2, Bundle bundle, int i2);

    void openGiftDialog(int i, long j, Bundle bundle, List<Long> list, boolean z);

    void openGiftDialog(int i, User user);

    void openGiftDialog(User user);

    void openGiftDialog(User user, Bundle bundle);

    void openGiftDialog(String str);

    void openGiftDialog(String str, User user);

    void openGiftDialogWithTip(String str);

    void removeGiftSendResultListener(AbstractC4071b abstractC4071b);

    void setDefaultUserToSendGift(User user);

    void setGiftTraySwitch(boolean z);

    void setNeedShowGiftEffectSwitch(boolean z);
}
