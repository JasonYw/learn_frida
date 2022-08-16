package com.bytedance.android.live.playtogether.playlist;

import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.playtogether.api.PlayTogetherAnchorApi;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import io.reactivex.disposables.CompositeDisposable;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import p003X.AbstractC89680LVa;
import p003X.C100839PnV;
import p003X.C88306Kqq;
import p003X.LUC;
import p003X.LVP;
import p003X.LVS;
import p003X.QB4;

/* renamed from: com.bytedance.android.live.playtogether.playlist.c */
/* loaded from: classes5.dex */
public final class C5236c {
    public static ChangeQuickRedirect LIZ;
    public AbstractC89680LVa LIZIZ;
    public boolean LIZJ;
    public int LIZLLL;

    /* renamed from: LJ */
    public int f26547LJ;
    public int LJFF;
    public int LJI;
    public final Lazy LJIIIIZZ = LazyKt__LazyJVMKt.lazy(AnchorPlaylistModel$roomId$2.INSTANCE);
    public final CompositeDisposable LJII = new CompositeDisposable();

    static {
        Covode.recordClassIndex(33045);
    }

    private final long LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return proxy.isSupported ? ((Long) proxy.result).longValue() : ((Number) this.LJIIIIZZ.mo27335getValue()).longValue();
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            return;
        }
        if ((this.LJI != 0 && this.f26547LJ >= this.LIZLLL && this.LJFF != 20) || this.LIZJ) {
            return;
        }
        this.LIZJ = true;
        ALogger.m15797i("Together#AnchorPlayListModel", "fetchPlayRecords...");
        QB4.LIZ(LUC.LIZ((PlayTogetherAnchorApi) C88306Kqq.LIZ().LIZ(PlayTogetherAnchorApi.class), LIZIZ(), this.f26547LJ, 20, 0, 0L, 16, null).compose(C100839PnV.LIZJ()).subscribe(new LVP(this), new LVS(this)), this.LJII);
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "[Fetch progress: " + this.f26547LJ + '/' + this.LIZLLL + ", lastFetchCount: " + this.LJFF + ", ITEM_COUNT_PER_TIME: 20, succFetchTimes: " + this.LJI + ", roomId: " + LIZIZ() + LoggerUtil.M_RIGHT_TAG;
    }
}
