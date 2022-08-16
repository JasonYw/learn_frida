package com.bytedance.android.live.broadcastgame;

import com.bytedance.android.live.broadcastgame.api.model.AbstractC3379i;
import com.bytedance.android.live.broadcastgame.api.model.C3383p;
import com.bytedance.android.live.broadcastgame.api.model.InteractID;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.ktvapi.IKtvService;
import com.bytedance.android.livesdk.ktvapi.KtvConflictScene;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import p003X.C106862S5w;
import p003X.C443233g5;
import p003X.C448003nm;
import p003X.C448033np;

/* loaded from: classes12.dex */
public final class LiveOpenFeatureSceneFilters$filter$1 extends Lambda implements Function1<T, Boolean> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ h$a $filterContext;
    public final /* synthetic */ C448003nm this$0;

    static {
        Covode.recordClassIndex(19002);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveOpenFeatureSceneFilters$filter$1(C448003nm c448003nm, h$a h_a) {
        super(1);
        this.this$0 = c448003nm;
        this.$filterContext = h_a;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Boolean invoke(Object obj) {
        List<Long> LIZJ;
        List<Integer> list;
        C3383p LIZIZ;
        AbstractC3379i abstractC3379i = (AbstractC3379i) obj;
        boolean z = false;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{abstractC3379i}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            z = ((Boolean) proxy.result).booleanValue();
        } else {
            C106862S5w.LIZ(abstractC3379i);
            C448003nm c448003nm = this.this$0;
            h$a h_a = this.$filterContext;
            PatchProxyResult proxy2 = PatchProxy.proxy(new Object[]{h_a, abstractC3379i}, c448003nm, C448003nm.LIZ, false, 3);
            if (proxy2.isSupported) {
                z = ((Boolean) proxy2.result).booleanValue();
            } else {
                PatchProxyResult proxy3 = PatchProxy.proxy(new Object[]{abstractC3379i}, c448003nm, C448003nm.LIZ, false, 5);
                if (!proxy3.isSupported ? !((LIZJ = abstractC3379i.LIZJ()) == null || LIZJ.isEmpty() || LIZJ.contains(0L)) : !((Boolean) proxy3.result).booleanValue()) {
                    int LIZ = abstractC3379i.LIZ();
                    if (LIZ != InteractID.OpenGame.value && LIZ != InteractID.SonicMiniGame.value) {
                        List<Long> LIZJ2 = abstractC3379i.LIZJ();
                        if (LIZJ2 == null) {
                            LIZJ2 = new ArrayList<>();
                        }
                        PatchProxyResult proxy4 = PatchProxy.proxy(new Object[]{h_a, abstractC3379i, LIZJ2}, c448003nm, C448003nm.LIZ, false, 6);
                        if (proxy4.isSupported) {
                            z = ((Boolean) proxy4.result).booleanValue();
                        } else if (((IKtvService) ServiceManager.getService(IKtvService.class)).requestConflictCheck(KtvConflictScene.SCENE_ANCHOR_GAME) || !C448033np.LIZ(abstractC3379i)) {
                            if (h_a.LJIIIIZZ) {
                                if (!C448033np.LIZ(abstractC3379i)) {
                                    z = LIZJ2.contains(3L);
                                }
                            } else if (h_a.LIZLLL) {
                                if (!C448033np.LIZ(abstractC3379i)) {
                                    z = LIZJ2.contains(2L);
                                }
                            } else if (h_a.f26050LJ) {
                                C3383p LIZIZ2 = abstractC3379i.LIZIZ();
                                if (LIZIZ2 != null && LIZIZ2.LJIL == 1 && h_a.LJFF > 1 && !C448033np.LIZ(abstractC3379i)) {
                                    int i = h_a.LJFF;
                                }
                            } else if (h_a.LJI) {
                                if (h_a.LJII) {
                                    if (!C448033np.LIZ(abstractC3379i) && (LIZIZ = abstractC3379i.LIZIZ()) != null && LIZIZ.LJIL == 2) {
                                        z = LIZJ2.contains(2L);
                                    }
                                } else {
                                    z = LIZJ2.contains(1L);
                                }
                            } else {
                                z = LIZJ2.contains(1L);
                            }
                        }
                    } else {
                        C3383p LIZIZ3 = abstractC3379i.LIZIZ();
                        if (LIZIZ3 != null && (list = LIZIZ3.LJIJI) != null) {
                            z = C443233g5.LIZIZ.LIZ(list, h_a.LJIIIZ, h_a.LJIIJ);
                        }
                    }
                } else {
                    z = true;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
