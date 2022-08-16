package com.bytedance.android.live.broadcast.viewmodel;

import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.broadcast.api.BroadcastUserApi;
import com.bytedance.android.live.broadcast.api.LiveForenoticeApi;
import com.bytedance.android.live.broadcast.api.model.PermissionResult;
import com.bytedance.android.live.broadcast.api.model.ScheduledSettingInfo;
import com.bytedance.android.live.broadcast.model.C3163j;
import com.bytedance.android.live.broadcast.viewmodel.C3255a;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.core.utils.rxutils.C4157y;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import io.reactivex.functions.Consumer;
import kotlin.jvm.internal.Intrinsics;
import p003X.C100839PnV;
import p003X.C88306Kqq;

/* renamed from: com.bytedance.android.live.broadcast.viewmodel.a */
/* loaded from: classes12.dex */
public final class C3255a extends C4157y {
    public static ChangeQuickRedirect LIZ;
    public final NextLiveData<Boolean> LIZIZ = new NextLiveData<>();
    public final NextLiveData<ScheduledSettingInfo> LIZJ = new NextLiveData<>();
    public final NextLiveData<Boolean> LIZLLL = new NextLiveData<>();

    /* renamed from: LJ */
    public final NextLiveData<Boolean> f25955LJ = new NextLiveData<>();
    public final NextLiveData<Boolean> LJFF = new NextLiveData<>();
    public ScheduledSettingInfo LJI;
    public String LJII;

    static {
        Covode.recordClassIndex(18124);
    }

    @Override // com.bytedance.android.live.core.utils.rxutils.C4157y, androidx.lifecycle.ViewModel
    public final void onCleared() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        super.onCleared();
        this.LJI = null;
    }

    public final void LIZ() {
        String str;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        ScheduledSettingInfo scheduledSettingInfo = this.LJI;
        if (scheduledSettingInfo != null) {
            this.LIZJ.postValue(scheduledSettingInfo);
            this.LIZLLL.postValue(Boolean.TRUE);
            return;
        }
        BroadcastUserApi broadcastUserApi = (BroadcastUserApi) C88306Kqq.LIZ().LIZ(BroadcastUserApi.class);
        IUser LIZ2 = ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        String secUid = LIZ2.getSecUid();
        SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_MINIAPP_ENTRANCE_PERMISSION;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Boolean value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (value.booleanValue()) {
            str = "open";
        } else {
            str = "white_list";
        }
        LIZ(broadcastUserApi.getUserPermissionWithId(secUid, str).compose(C100839PnV.LIZJ()).subscribe(new Consumer<C5176i<PermissionResult>>() { // from class: X.3P0
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(18125);
            }

            @Override // io.reactivex.functions.Consumer
            public final /* synthetic */ void accept(C5176i<PermissionResult> c5176i) {
                C5176i<PermissionResult> c5176i2 = c5176i;
                if (!PatchProxy.proxy(new Object[]{c5176i2}, this, LIZ, false, 1).isSupported) {
                    C3255a.this.LIZJ.postValue(c5176i2.LIZJ.broadcastConfig);
                    C3255a.this.LIZLLL.postValue(Boolean.TRUE);
                }
            }
        }, new Consumer<Throwable>() { // from class: X.3P1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(18126);
            }

            @Override // io.reactivex.functions.Consumer
            public final /* synthetic */ void accept(Throwable th) {
                if (!PatchProxy.proxy(new Object[]{th}, this, LIZ, false, 1).isSupported) {
                    C3255a.this.LIZLLL.postValue(Boolean.FALSE);
                }
            }
        }));
    }

    public final void LIZ(boolean z, boolean z2) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, this, LIZ, false, 2).isSupported) {
            return;
        }
        ScheduledSettingInfo value = this.LIZJ.getValue();
        if (value == null) {
            this.f25955LJ.postValue(Boolean.FALSE);
        } else {
            LIZ(((LiveForenoticeApi) C88306Kqq.LIZ().LIZ(LiveForenoticeApi.class)).updateSchedule(z, value.profileSwitch, value.anchorScheduledTime, value.anchorScheduledDays, z2).compose(C100839PnV.LIZJ()).subscribe(new Consumer<C5176i<C3163j>>() { // from class: X.3V9
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(18127);
                }

                @Override // io.reactivex.functions.Consumer
                public final /* synthetic */ void accept(C5176i<C3163j> c5176i) {
                    C5176i<C3163j> c5176i2 = c5176i;
                    if (!PatchProxy.proxy(new Object[]{c5176i2}, this, LIZ, false, 1).isSupported) {
                        ScheduledSettingInfo value2 = C3255a.this.LIZJ.getValue();
                        if (value2 != null) {
                            value2.scheduledTimeWords = c5176i2.LIZJ.LIZ;
                        }
                        C3255a.this.LIZIZ.postValue(Boolean.TRUE);
                        C3255a.this.f25955LJ.postValue(Boolean.TRUE);
                    }
                }
            }, new Consumer<Throwable>() { // from class: X.3VA
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(18128);
                }

                @Override // io.reactivex.functions.Consumer
                public final /* synthetic */ void accept(Throwable th) {
                    if (!PatchProxy.proxy(new Object[]{th}, this, LIZ, false, 1).isSupported) {
                        C3255a.this.f25955LJ.postValue(Boolean.FALSE);
                    }
                }
            }));
        }
    }
}
