package com.bytedance.android.live.media.impl;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import com.bytedance.android.live.media.api.IMediaReplayService;
import com.bytedance.android.live.media.api.IMediaService;
import com.bytedance.android.live.media.impl.portrait.MediaIntroductionWidget;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.AbstractC443033fl;
import p003X.C106862S5w;
import p003X.C426942uu;
import p003X.C443043fm;
import p003X.C443053fn;
import p003X.C458454Bb;
import p003X.LK1;

/* loaded from: classes12.dex */
public class MediaService implements IMediaService {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(32425);
    }

    @Override // com.bytedance.android.live.media.api.IMediaService
    public int getMediaAnchorResId() {
        return 2131182785;
    }

    @Override // com.bytedance.android.live.media.api.IMediaService
    public int getMediaDetailMaskResId() {
        return 2131182803;
    }

    @Override // com.bytedance.android.live.media.api.IMediaService
    public int getMediaIntroductionResId() {
        return 2131182821;
    }

    @Override // com.bytedance.android.live.media.api.IMediaService
    public int getMediaMoveDownCloseResId() {
        return 2131182792;
    }

    @Override // com.bytedance.android.live.media.api.IMediaService
    public int getMediaTitleResId() {
        return 2131182847;
    }

    @Override // com.bytedance.android.live.media.api.IMediaService
    public int getMediaWatchNumberResId() {
        return 2131182796;
    }

    public MediaService() {
        ServiceManager.registerService(IMediaService.class, this);
    }

    @Override // com.bytedance.android.live.media.api.IMediaService
    public void hideMediaIntroduction(View view) {
        MediaIntroductionWidget mediaIntroductionWidget;
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(view);
        if (!(view instanceof C443043fm)) {
            view = null;
        }
        C443043fm c443043fm = (C443043fm) view;
        if (c443043fm != null && !PatchProxy.proxy(new Object[0], c443043fm, C443043fm.LIZJ, false, 4).isSupported && (mediaIntroductionWidget = c443043fm.f964LJ) != null) {
            mediaIntroductionWidget.LIZIZ();
        }
    }

    @Override // com.bytedance.android.live.media.api.IMediaService
    public View createView(Context context, boolean z) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        C106862S5w.LIZ(context);
        if (z) {
            return new C443043fm(context, null, 0, 6);
        }
        return new C443053fn(context, null, 0, 6);
    }

    @Override // com.bytedance.android.live.media.api.IMediaService
    public void prepareReplayWidget(View view, boolean z) {
        if (PatchProxy.proxy(new Object[]{view, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        if (!(view instanceof AbstractC443033fl)) {
            view = null;
        }
        AbstractC443033fl abstractC443033fl = (AbstractC443033fl) view;
        if (abstractC443033fl != null) {
            abstractC443033fl.LIZ(z);
        }
    }

    @Override // com.bytedance.android.live.media.api.IMediaService
    public void initMediaView(View view, C458454Bb c458454Bb) {
        MethodCollector.m14708i(2139);
        if (PatchProxy.proxy(new Object[]{view, c458454Bb}, this, changeQuickRedirect, false, 2).isSupported) {
            MethodCollector.m14707o(2139);
            return;
        }
        C106862S5w.LIZ(view, c458454Bb);
        if (!(view instanceof AbstractC443033fl)) {
            view = null;
        }
        AbstractC443033fl abstractC443033fl = (AbstractC443033fl) view;
        if (abstractC443033fl != null) {
            if (!PatchProxy.proxy(new Object[]{c458454Bb}, abstractC443033fl, AbstractC443033fl.LIZ, false, 1).isSupported) {
                abstractC443033fl.LIZIZ = c458454Bb;
                LayoutInflater.from(abstractC443033fl.getContext()).inflate(abstractC443033fl.getLayoutId(), abstractC443033fl);
                abstractC443033fl.LIZ();
            }
            MethodCollector.m14707o(2139);
            return;
        }
        MethodCollector.m14707o(2139);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.live.media.api.IMediaService
    public void setInteractionVisibility(View view, boolean z, boolean z2) {
        int LIZLLL;
        int LIZLLL2;
        int LIZLLL3;
        float LIZJ;
        float LIZJ2;
        float f;
        int i = 0;
        if (PatchProxy.proxy(new Object[]{view, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(view);
        if (!(view instanceof C443053fn)) {
            view = null;
        }
        C443053fn c443053fn = (C443053fn) view;
        if (c443053fn != null && !PatchProxy.proxy(new Object[]{Byte.valueOf((byte) z), Byte.valueOf((byte) z2)}, c443053fn, C443053fn.LIZJ, false, 3).isSupported) {
            if (C426942uu.LIZ(false)) {
                LIZLLL = LK1.LIZLLL(-120);
            } else {
                LIZLLL = LK1.LIZLLL(-92);
            }
            if (z2 != 0) {
                View findViewById = c443053fn.findViewById(2131182796);
                float f2 = 0.0f;
                if (findViewById != null) {
                    if (z != 0) {
                        f = 0.0f;
                    } else {
                        f = LIZLLL;
                    }
                    findViewById.setTranslationY(f);
                }
                View findViewById2 = c443053fn.findViewById(2131182785);
                if (findViewById2 != null) {
                    if (z != 0) {
                        LIZJ2 = 0.0f;
                    } else {
                        LIZJ2 = LK1.LIZJ(-92);
                    }
                    findViewById2.setTranslationY(LIZJ2);
                }
                View findViewById3 = c443053fn.findViewById(2131182847);
                if (findViewById3 != null) {
                    if (z != 0) {
                        LIZJ = 0.0f;
                    } else {
                        LIZJ = LK1.LIZJ(-92);
                    }
                    findViewById3.setTranslationY(LIZJ);
                }
                View findViewById4 = c443053fn.findViewById(2131196651);
                if (findViewById4 != null) {
                    if (z == 0) {
                        f2 = LK1.LIZJ(46);
                    }
                    findViewById4.setTranslationY(f2);
                }
            } else {
                View findViewById5 = c443053fn.findViewById(2131182796);
                if (z != 0) {
                    LIZLLL = 0;
                }
                c443053fn.LIZ(findViewById5, LIZLLL);
                View findViewById6 = c443053fn.findViewById(2131182785);
                if (z != 0) {
                    LIZLLL2 = 0;
                } else {
                    LIZLLL2 = LK1.LIZLLL(-92);
                }
                c443053fn.LIZ(findViewById6, LIZLLL2);
                View findViewById7 = c443053fn.findViewById(2131182847);
                if (z != 0) {
                    LIZLLL3 = 0;
                } else {
                    LIZLLL3 = LK1.LIZLLL(-92);
                }
                c443053fn.LIZ(findViewById7, LIZLLL3);
                View findViewById8 = c443053fn.findViewById(2131196651);
                if (z == 0) {
                    i = LK1.LIZLLL(46);
                }
                c443053fn.LIZ(findViewById8, i);
            }
            IMediaReplayService iMediaReplayService = (IMediaReplayService) ServiceManager.getService(IMediaReplayService.class);
            if (iMediaReplayService != null) {
                iMediaReplayService.setInteractionVisibility(c443053fn, z);
            }
        }
    }
}
