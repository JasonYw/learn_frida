package com.bytedance.android.live.liveinteract.newpk.p379vm;

import android.os.SystemClock;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.api.LinkPKApi;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.message.model.LinkMicBattleFinishMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.p1594ss.ugc.live.sdk.message.data.IMessage;
import com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import p003X.C100839PnV;
import p003X.C106862S5w;
import p003X.C79446HTk;
import p003X.C79450HTo;
import p003X.C79455HTt;
import p003X.C88306Kqq;
import p003X.HTX;
import p003X.QB4;

/* renamed from: com.bytedance.android.live.liveinteract.newpk.vm.c */
/* loaded from: classes3.dex */
public final class C4689c extends PkDataContext implements OnMessageListener {
    public static ChangeQuickRedirect LIZ;
    public Disposable LIZIZ;

    static {
        Covode.recordClassIndex(28649);
    }

    @Override // com.bytedance.android.live.liveinteract.newpk.p379vm.PkDataContext
    public final void LIZLLL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        Disposable disposable = this.LIZIZ;
        if (disposable != null) {
            disposable.dispose();
        }
        if (this.LJJL) {
            return;
        }
        SettingKey<Long> settingKey = LiveConfigSettingKeys.LIVE_PK_FINISH_STATS_BACKUP_DELAY;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        Long value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        this.LIZIZ = Observable.timer(value.longValue(), TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new C79450HTo(this));
    }

    @Override // com.bytedance.android.live.liveinteract.newpk.p379vm.PkDataContext, com.p1594ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        Disposable disposable;
        if (PatchProxy.proxy(new Object[]{iMessage}, this, LIZ, false, 4).isSupported) {
            return;
        }
        super.onMessage(iMessage);
        if (iMessage != null && (iMessage instanceof LinkMicBattleFinishMessage) && (disposable = this.LIZIZ) != null) {
            disposable.dispose();
        }
    }

    public final void LIZ(boolean z, int i) {
        long j;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i)}, this, LIZ, false, 2).isSupported) {
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        LinkPKApi linkPKApi = (LinkPKApi) C88306Kqq.LIZ().LIZ(LinkPKApi.class);
        Room room = this.LJJLIIIJLJLI;
        long j2 = 0;
        if (room != null) {
            j = room.getOwnerUserId();
        } else {
            j = 0;
        }
        Room room2 = this.LJJLIIIJLJLI;
        if (room2 != null) {
            j2 = room2.getRoomId();
        }
        QB4.LIZ(linkPKApi.battleStats(j, j2, i).compose(C100839PnV.LIZJ()).subscribe(new HTX(this, uptimeMillis, z), new C79446HTk<>(this, z)), this.LJJLIIIJJI);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4689c(DataCenter dataCenter, long j, long j2) {
        super(dataCenter, j, j2);
        int ordinal;
        C106862S5w.LIZ(dataCenter);
        QB4.LIZ(LLLLIIIILLL().subscribe(new C79455HTt(this)), this.LJJLIIIJJI);
        if (this.LJII.LJJJJJ) {
            ordinal = LinkCrossRoomDataHolder.BattleStatsFromType.OpenIM.ordinal();
        } else {
            ordinal = LinkCrossRoomDataHolder.BattleStatsFromType.PKingInRoom.ordinal();
        }
        if (!PatchProxy.proxy(new Object[]{this, (byte) 0, Integer.valueOf(ordinal), 1, null}, null, LIZ, true, 3).isSupported) {
            LIZ(false, ordinal);
        }
    }
}
