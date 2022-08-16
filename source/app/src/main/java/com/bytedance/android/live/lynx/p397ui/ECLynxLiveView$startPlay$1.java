package com.bytedance.android.live.lynx.p397ui;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.android.livesdkapi.roomplayer.ILivePlayerClient;
import com.bytedance.android.livesdkapi.roomplayer.IRoomEventHub;
import com.bytedance.android.livesdkapi.roomplayer.LivePlayerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;

/* renamed from: com.bytedance.android.live.lynx.ui.ECLynxLiveView$startPlay$1 */
/* loaded from: classes19.dex */
public final class ECLynxLiveView$startPlay$1 extends Lambda implements Function1<LifecycleOwner, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ ECLynxLiveView this$0;

    static {
        Covode.recordClassIndex(32307);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ECLynxLiveView$startPlay$1(ECLynxLiveView eCLynxLiveView) {
        super(1);
        this.this$0 = eCLynxLiveView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(LifecycleOwner lifecycleOwner) {
        LivePlayerView playerView$livehybrid_impl_cnDouyinRelease;
        ILivePlayerClient client;
        IRoomEventHub eventHub;
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        if (!PatchProxy.proxy(new Object[]{lifecycleOwner2}, this, changeQuickRedirect, false, 1).isSupported) {
            C106862S5w.LIZ(lifecycleOwner2);
            C5162e view = this.this$0.getView();
            if (view != null && (playerView$livehybrid_impl_cnDouyinRelease = view.getPlayerView$livehybrid_impl_cnDouyinRelease()) != null && (client = playerView$livehybrid_impl_cnDouyinRelease.getClient()) != null && (eventHub = client.getEventHub()) != null) {
                MutableLiveData<Boolean> playing = eventHub.getPlaying();
                if (playing != null) {
                    playing.observe(lifecycleOwner2, new Observer<Boolean>() { // from class: com.bytedance.android.live.lynx.ui.ECLynxLiveView$startPlay$1.1
                        public static ChangeQuickRedirect LIZ;

                        static {
                            Covode.recordClassIndex(32308);
                        }

                        @Override // androidx.lifecycle.Observer
                        public final /* synthetic */ void onChanged(Boolean bool) {
                            if (!PatchProxy.proxy(new Object[]{bool}, this, LIZ, false, 1).isSupported) {
                                if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                                    ECLynxLiveView.sendCustomEvents$default(ECLynxLiveView$startPlay$1.this.this$0, "play", null, 2, null);
                                    ECLynxLiveView$startPlay$1.this.this$0.handlePoster(true);
                                    return;
                                }
                                ECLynxLiveView.sendCustomEvents$default(ECLynxLiveView$startPlay$1.this.this$0, "pause", null, 2, null);
                            }
                        }
                    });
                }
                MutableLiveData<Boolean> playResume = eventHub.getPlayResume();
                if (playResume != null) {
                    playResume.observe(lifecycleOwner2, new Observer<Boolean>() { // from class: com.bytedance.android.live.lynx.ui.ECLynxLiveView$startPlay$1.2
                        public static ChangeQuickRedirect LIZ;

                        static {
                            Covode.recordClassIndex(32309);
                        }

                        @Override // androidx.lifecycle.Observer
                        public final /* synthetic */ void onChanged(Boolean bool) {
                            if (!PatchProxy.proxy(new Object[]{bool}, this, LIZ, false, 1).isSupported) {
                                ECLynxLiveView.sendCustomEvents$default(ECLynxLiveView$startPlay$1.this.this$0, "resume", null, 2, null);
                            }
                        }
                    });
                }
                MutableLiveData<Boolean> playComplete = eventHub.getPlayComplete();
                if (playComplete != null) {
                    playComplete.observe(lifecycleOwner2, new Observer<Boolean>() { // from class: com.bytedance.android.live.lynx.ui.ECLynxLiveView$startPlay$1.3
                        public static ChangeQuickRedirect LIZ;

                        static {
                            Covode.recordClassIndex(32310);
                        }

                        @Override // androidx.lifecycle.Observer
                        public final /* synthetic */ void onChanged(Boolean bool) {
                            if (!PatchProxy.proxy(new Object[]{bool}, this, LIZ, false, 1).isSupported) {
                                ECLynxLiveView.sendCustomEvents$default(ECLynxLiveView$startPlay$1.this.this$0, "ended", null, 2, null);
                            }
                        }
                    });
                }
                MutableLiveData<String> playerMediaError = eventHub.getPlayerMediaError();
                if (playerMediaError != null) {
                    playerMediaError.observe(lifecycleOwner2, new Observer<String>() { // from class: com.bytedance.android.live.lynx.ui.ECLynxLiveView$startPlay$1.4
                        public static ChangeQuickRedirect LIZ;

                        static {
                            Covode.recordClassIndex(32311);
                        }

                        @Override // androidx.lifecycle.Observer
                        public final /* synthetic */ void onChanged(String str) {
                            if (!PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 1).isSupported) {
                                ECLynxLiveView eCLynxLiveView = ECLynxLiveView$startPlay$1.this.this$0;
                                Pair[] pairArr = new Pair[1];
                                if (str == null) {
                                    str = "";
                                }
                                pairArr[0] = TuplesKt.m137to("msg", str);
                                eCLynxLiveView.sendCustomEvents("error", MapsKt__MapsKt.mutableMapOf(pairArr));
                            }
                        }
                    });
                }
                MutableLiveData<String> seiUpdate = eventHub.getSeiUpdate();
                if (seiUpdate != null) {
                    seiUpdate.observe(lifecycleOwner2, new Observer<String>() { // from class: com.bytedance.android.live.lynx.ui.ECLynxLiveView$startPlay$1.5
                        public static ChangeQuickRedirect LIZ;

                        static {
                            Covode.recordClassIndex(32312);
                        }

                        @Override // androidx.lifecycle.Observer
                        public final /* synthetic */ void onChanged(String str) {
                            if (!PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 1).isSupported) {
                                ECLynxLiveView eCLynxLiveView = ECLynxLiveView$startPlay$1.this.this$0;
                                Pair[] pairArr = new Pair[1];
                                if (str == null) {
                                    str = "";
                                }
                                pairArr[0] = TuplesKt.m137to("sei", str);
                                eCLynxLiveView.sendCustomEvents("sei", MapsKt__MapsKt.mutableMapOf(pairArr));
                            }
                        }
                    });
                }
            }
        }
        return Unit.INSTANCE;
    }
}
