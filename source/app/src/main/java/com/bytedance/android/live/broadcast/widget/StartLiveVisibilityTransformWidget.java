package com.bytedance.android.live.broadcast.widget;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.AbstractC2930as;
import com.bytedance.android.live.broadcast.api.model.C2903am;
import com.bytedance.android.live.broadcast.api.model.C2906ap;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.widget.RoomWidget;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import p003X.AbstractC4569445g;
import p003X.C2WC;
import p003X.C77042GYy;
import p003X.C77043GYz;
import p003X.C77291GdZ;
import p003X.C77292Gda;
import p003X.K8Q;
import p003X.QB4;

/* loaded from: classes3.dex */
public final class StartLiveVisibilityTransformWidget extends RoomWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public AbstractC2930as LIZJ;
    public final CompositeDisposable LIZLLL = new CompositeDisposable();
    public final String LIZIZ = "StartLiveVisibilityTransformWidget[" + hashCode() + LoggerUtil.M_RIGHT_TAG;

    static {
        Covode.recordClassIndex(18795);
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 4).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        super.onDestroy();
        this.LIZLLL.dispose();
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        Integer num;
        int i;
        Observable<C5176i<C2903am>> LIZIZ;
        Disposable subscribe;
        Observable<C5176i<C2903am>> LIZIZ2;
        Disposable subscribe2;
        C2WC<Room> LIZ2;
        Room LIZ3;
        int i2 = 0;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        super.onCreate();
        K8Q.LIZ().LJIIIZ().LIZ(this);
        C5923dp c5923dp = this.LJJJJI;
        if (c5923dp != null && (LIZ2 = c5923dp.LIZ()) != null && (LIZ3 = LIZ2.LIZ()) != null) {
            num = Integer.valueOf(LIZ3.visibilityRange);
        } else {
            num = null;
        }
        String str = this.LIZIZ;
        StringBuilder sb = new StringBuilder("visibility:");
        if (num != null) {
            i = num.intValue();
        } else {
            i = -1;
        }
        sb.append(i);
        sb.append(",dataContext:");
        C5923dp c5923dp2 = this.LJJJJI;
        if (c5923dp2 != null) {
            i2 = c5923dp2.hashCode();
        }
        sb.append(i2);
        ALogger.m15801d(str, sb.toString());
        if (num != null) {
            if (num.intValue() == 3) {
                AbstractC2930as abstractC2930as = this.LIZJ;
                if (abstractC2930as != null && (LIZIZ2 = abstractC2930as.LIZIZ(77)) != null && (subscribe2 = LIZIZ2.subscribe(new C77291GdZ(this), new C77043GYz(this))) != null) {
                    QB4.LIZ(subscribe2, this.LIZLLL);
                    return;
                }
                return;
            } else if (num.intValue() == 4) {
                AbstractC2930as abstractC2930as2 = this.LIZJ;
                if (abstractC2930as2 != null && (LIZIZ = abstractC2930as2.LIZIZ(79)) != null && (subscribe = LIZIZ.subscribe(new C77292Gda(this), new C77042GYy(this))) != null) {
                    QB4.LIZ(subscribe, this.LIZLLL);
                    return;
                }
                return;
            }
        }
        ALogger.m15801d(this.LIZIZ, "skip loadHis");
    }

    public final void LIZ(List<C2906ap> list, List<User> list2) {
        if (PatchProxy.proxy(new Object[]{list, list2}, this, LIZ, false, 2).isSupported) {
            return;
        }
        if (list2 != null) {
            list2.clear();
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (C2906ap c2906ap : list) {
            arrayList.add(c2906ap.LIZ());
        }
        ArrayList arrayList2 = arrayList;
        if (list2 != null) {
            list2.addAll(arrayList2);
        }
    }
}
