package com.bytedance.android.live.broadcast.widget;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.broadcast.AbstractC2863ai;
import com.bytedance.android.live.broadcast.model.AudioInteractMode;
import com.bytedance.android.live.broadcast.preview.C3181o;
import com.bytedance.android.live.broadcast.preview.C3199v;
import com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget;
import com.bytedance.android.live.broadcast.viewmodel.C3258d;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.room.IEntranceContext;
import com.bytedance.android.live.room.ILiveSDKService;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.config.C6853bj;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.model.C9061c;
import com.bytedance.android.livesdk.radio.VideoThemeView;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.audio.AnimatedBgInfo;
import com.bytedance.android.livesdkapi.depend.model.live.audio.VoiceLiveTheme;
import com.bytedance.android.livesdkapi.model.C9634bb;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.CastProtectorUtils;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.imagepipeline.request.ImageRequest;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import p003X.AbstractC413392Xt;
import p003X.AbstractC414762bG;
import p003X.AbstractC4569445g;
import p003X.AbstractC81935IRd;
import p003X.AbstractC81939IRh;
import p003X.AbstractC81969ISl;
import p003X.C106862S5w;
import p003X.C2VQ;
import p003X.C81953IRv;
import p003X.C81954IRw;
import p003X.C81955IRx;
import p003X.C81956IRy;
import p003X.IS2;
import p003X.IS3;
import p003X.IS4;
import p003X.IS5;
import p003X.ISA;
import p003X.ISB;
import p003X.K8Q;
import p003X.LK1;
import p003X.M0O;
import p003X.M0Q;

/* loaded from: classes3.dex */
public final class PreviewVoiceLiveThemeWidget extends AbsPreviewWidget implements IEntranceContext, AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public static final /* synthetic */ KProperty[] LIZIZ;
    public AbstractC81939IRh LIZJ;
    public AbstractC81969ISl LIZLLL;

    /* renamed from: LJ */
    public AbstractC81935IRd f26002LJ;
    public Fragment LJFF;
    public AbstractC2863ai LJI;
    public HSImageView LJIIL;
    public HSImageView LJIILIIL;
    public VideoThemeView LJIILJJIL;
    public HSImageView LJIILL;
    public HSImageView LJIILLIIL;
    public HSImageView LJIIZILJ;
    public View LJIJJLI;
    public HSImageView LJIL;
    public boolean LJIJ = true;
    public final Lazy LJIJI = LIZ(C3199v.class);
    public final Lazy LJIJJ = LIZ(C3181o.class);
    public Observer<ArrayList<VoiceLiveTheme>> LJJ = new IS2(this);
    public Observer<VoiceLiveTheme> LJJI = new C81955IRx(this);

    static {
        Covode.recordClassIndex(18746);
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(PreviewVoiceLiveThemeWidget.class, "startLiveViewModel", "getStartLiveViewModel()Lcom/bytedance/android/live/broadcast/preview/StartLiveViewModel;", 0);
        Reflection.property1(propertyReference1Impl);
        PropertyReference1Impl propertyReference1Impl2 = new PropertyReference1Impl(PreviewVoiceLiveThemeWidget.class, "eventViewModel", "getEventViewModel()Lcom/bytedance/android/live/broadcast/preview/StartLiveEventViewModel;", 0);
        Reflection.property1(propertyReference1Impl2);
        LIZIZ = new KProperty[]{propertyReference1Impl, propertyReference1Impl2};
    }

    /* renamed from: LJ */
    private final C3199v m15858LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        return (C3199v) (proxy.isSupported ? proxy.result : LIZ(this.LJIJI, this, LIZIZ[0]));
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbstractC3175a
    public final String LIZ() {
        return "PreviewVoiceLiveThemeWidget";
    }

    public final C3181o LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 2);
        return (C3181o) (proxy.isSupported ? proxy.result : LIZ(this.LJIJJ, this, LIZIZ[1]));
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final int getLayoutId() {
        return 2131698482;
    }

    @Override // com.bytedance.android.live.room.IEntranceContext
    public final boolean isPreviewScene() {
        return true;
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 23).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LIZLLL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 18).isSupported) {
            return;
        }
        HSImageView hSImageView = this.LJIILL;
        if (hSImageView != null) {
            LK1.LIZ(hSImageView);
        }
        HSImageView hSImageView2 = this.LJIILLIIL;
        if (hSImageView2 != null) {
            LK1.LIZ(hSImageView2);
        }
        LJIILL();
    }

    @Override // com.bytedance.android.live.room.IEntranceContext
    public final String getLiveType() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 22);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return C2VQ.LIZ(LJIIJJI().LIZ().LIZ());
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 21).isSupported) {
            return;
        }
        super.onDestroy();
        AbstractC81939IRh abstractC81939IRh = this.LIZJ;
        if (abstractC81939IRh != null && abstractC81939IRh.isShowing()) {
            AbstractC81939IRh abstractC81939IRh2 = this.LIZJ;
            if (abstractC81939IRh2 != null) {
                abstractC81939IRh2.dismiss();
            }
            this.LIZJ = null;
        }
        LIZJ(2);
        LIZJ(5);
        LIZJ(1);
    }

    public final int LIZJ() {
        AudioInteractMode audioInteractMode;
        AbstractC413392Xt<C3258d> LJJI;
        C3258d LIZIZ2;
        AbstractC414762bG<AudioInteractMode> abstractC414762bG;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        C3199v m15858LJ = m15858LJ();
        if (m15858LJ == null || (LJJI = m15858LJ.LJJI()) == null || (LIZIZ2 = LJJI.LIZIZ()) == null || (abstractC414762bG = LIZIZ2.LIZIZ) == null || (audioInteractMode = abstractC414762bG.LIZ()) == null) {
            audioInteractMode = AudioInteractMode.Radio;
        }
        if (audioInteractMode == AudioInteractMode.KTV) {
            return 1;
        }
        if (audioInteractMode != AudioInteractMode.Chat) {
            return 5;
        }
        return 2;
    }

    private final void LJFF() {
        DraweeController draweeController;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 15).isSupported) {
            return;
        }
        View view = this.LJIJJLI;
        if (view != null) {
            view.setBackgroundColor(CastProtectorUtils.parseColor("#100b5c"));
        }
        SettingKey<C6853bj> settingKey = LiveSettingKeys.LIVE_KTV_ROOM_UI_RESOURCE;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        C6853bj value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        String LIZLLL = value.LIZLLL();
        SettingKey<C6853bj> settingKey2 = LiveSettingKeys.LIVE_KTV_ROOM_UI_RESOURCE;
        Intrinsics.checkNotNullExpressionValue(settingKey2, "");
        C6853bj value2 = settingKey2.getValue();
        Intrinsics.checkNotNullExpressionValue(value2, "");
        String m15456LJ = value2.m15456LJ();
        PipelineDraweeControllerBuilder controllerListener = Fresco.newDraweeControllerBuilder().setControllerListener(new IS3());
        Intrinsics.checkNotNullExpressionValue(controllerListener, "");
        PipelineDraweeControllerBuilder imageRequest = controllerListener.setLowResImageRequest(ImageRequest.fromUri(LIZLLL)).setImageRequest(ImageRequest.fromUri(m15456LJ));
        HSImageView hSImageView = this.LJIL;
        if (hSImageView != null) {
            draweeController = hSImageView.getController();
        } else {
            draweeController = null;
        }
        imageRequest.mo27967setOldController(draweeController).setAutoPlayAnimations(true).mo27965build();
        HSImageView hSImageView2 = this.LJIL;
        if (hSImageView2 != null) {
            hSImageView2.setController(controllerListener.mo27965build());
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        AbstractC81935IRd abstractC81935IRd;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        super.onCreate();
        K8Q.LIZ().LJIIIIZZ().LIZ(this);
        AbstractC2863ai abstractC2863ai = this.LJI;
        FragmentActivity fragmentActivity = null;
        if (abstractC2863ai != null) {
            abstractC81935IRd = abstractC2863ai.LJII();
        } else {
            abstractC81935IRd = null;
        }
        this.f26002LJ = abstractC81935IRd;
        this.LJIILL = (HSImageView) this.contentView.findViewById(2131186185);
        this.LJIILLIIL = (HSImageView) this.contentView.findViewById(2131186102);
        SettingKey<C9634bb> settingKey = LiveSettingKeys.LIVE_KTV_LIVE_THEME_CONFIG;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        C9634bb value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (value.LIZ()) {
            LIZIZ(1);
        }
        LIZIZ(5);
        LIZIZ(2);
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported) {
            ILiveSDKService iLiveSDKService = (ILiveSDKService) ServiceManager.getService(ILiveSDKService.class);
            Fragment fragment = this.LJFF;
            if (fragment != null) {
                fragmentActivity = fragment.getActivity();
            }
            this.LIZLLL = iLiveSDKService.createImagePicker(fragmentActivity, this.LJFF, "PreviewTheme", 9, 16, 720, 1280, new C81956IRy(this), this, null);
        }
        LIZIZ().LJI().observe(this, new C81954IRw(this));
        Disposable subscribe = m15858LJ().LJJIIJ().LIZIZ().subscribe(new C81953IRv(this));
        if (subscribe != null) {
            LIZ(subscribe);
        }
        m15858LJ().LJJI().LIZ(new PreviewVoiceLiveThemeWidget$onCreate$3(this));
    }

    public final void LIZ(Fragment fragment) {
        if (PatchProxy.proxy(new Object[]{fragment}, this, LIZ, false, 9).isSupported) {
            return;
        }
        C106862S5w.LIZ(fragment);
        this.LJFF = fragment;
    }

    private void LIZIZ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 6).isSupported) {
            return;
        }
        AbstractC81935IRd abstractC81935IRd = this.f26002LJ;
        if (abstractC81935IRd != null) {
            abstractC81935IRd.LIZJ(i);
        }
        AbstractC81935IRd abstractC81935IRd2 = this.f26002LJ;
        if (abstractC81935IRd2 != null) {
            abstractC81935IRd2.LIZIZ(this, this.LJJ, i);
        }
        AbstractC81935IRd abstractC81935IRd3 = this.f26002LJ;
        if (abstractC81935IRd3 != null) {
            abstractC81935IRd3.LIZ(this, this.LJJI, i);
        }
    }

    private void LIZJ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 7).isSupported) {
            return;
        }
        AbstractC81935IRd abstractC81935IRd = this.f26002LJ;
        if (abstractC81935IRd != null) {
            abstractC81935IRd.LIZIZ(this.LJJ, i);
        }
        AbstractC81935IRd abstractC81935IRd2 = this.f26002LJ;
        if (abstractC81935IRd2 != null) {
            abstractC81935IRd2.LIZ(this.LJJI, i);
        }
    }

    public final void LIZ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 20).isSupported) {
            return;
        }
        if (i == 1) {
            View view = this.LJIJJLI;
            if (view != null) {
                LK1.LIZJ(view);
            }
            HSImageView hSImageView = this.LJIILIIL;
            if (hSImageView != null) {
                LK1.LIZ(hSImageView);
            }
            HSImageView hSImageView2 = this.LJIIL;
            if (hSImageView2 != null) {
                LK1.LIZ(hSImageView2);
            }
            SettingKey<C9634bb> settingKey = LiveSettingKeys.LIVE_KTV_LIVE_THEME_CONFIG;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            C9634bb value = settingKey.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            if (!value.LIZ()) {
                LJFF();
                return;
            }
            return;
        }
        View view2 = this.LJIJJLI;
        if (view2 != null) {
            LK1.LIZ(view2);
        }
    }

    private final void LIZIZ(VoiceLiveTheme voiceLiveTheme) {
        ImageModel imageModel;
        if (PatchProxy.proxy(new Object[]{voiceLiveTheme}, this, LIZ, false, 14).isSupported) {
            return;
        }
        SettingKey<C9634bb> settingKey = LiveSettingKeys.LIVE_KTV_LIVE_THEME_CONFIG;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        C9634bb value = settingKey.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "");
        if (!value.LIZ()) {
            return;
        }
        boolean LIZ2 = C9061c.LIZ(true);
        try {
            View view = this.LJIJJLI;
            if (view != null) {
                view.setBackgroundColor(Color.parseColor(voiceLiveTheme.LJIILL));
            }
        } catch (Exception unused) {
            View view2 = this.LJIJJLI;
            if (view2 != null) {
                view2.setBackgroundColor(CastProtectorUtils.parseColor("#100b5c"));
            }
        }
        if (LIZ2) {
            if (!VoiceLiveTheme.LIZ(voiceLiveTheme.LJIIJJI)) {
                LJFF();
                return;
            }
        } else if (!VoiceLiveTheme.LIZ(voiceLiveTheme.LJI)) {
            LJFF();
            return;
        }
        PipelineDraweeControllerBuilder controllerListener = Fresco.newDraweeControllerBuilder().setControllerListener(new IS4());
        Intrinsics.checkNotNullExpressionValue(controllerListener, "");
        if (LIZ2) {
            imageModel = voiceLiveTheme.LJFF;
        } else {
            imageModel = voiceLiveTheme.LJI;
        }
        controllerListener.setFirstAvailableImageRequests(M0Q.LIZJ(imageModel));
        HSImageView hSImageView = this.LJIL;
        if (hSImageView != null) {
            hSImageView.setController(controllerListener.mo27965build());
        }
    }

    @Override // com.bytedance.android.live.broadcast.preview.base.AbsPreviewWidget
    public final void LIZ(LiveMode liveMode) {
        VoiceLiveTheme LIZ2;
        if (PatchProxy.proxy(new Object[]{liveMode}, this, LIZ, false, 19).isSupported || liveMode == null) {
            return;
        }
        if (liveMode != LiveMode.AUDIO) {
            LIZLLL();
            HSImageView hSImageView = this.LJIIL;
            if (hSImageView != null) {
                LK1.LIZ(hSImageView);
            }
            HSImageView hSImageView2 = this.LJIILIIL;
            if (hSImageView2 != null) {
                LK1.LIZ(hSImageView2);
            }
            View view = this.LJIJJLI;
            if (view != null) {
                LK1.LIZ(view);
            }
            VideoThemeView videoThemeView = this.LJIILJJIL;
            if (videoThemeView != null) {
                LK1.LIZ((View) videoThemeView);
                return;
            }
            return;
        }
        int LIZJ = LIZJ();
        LIZ(LIZJ);
        AbstractC81935IRd abstractC81935IRd = this.f26002LJ;
        if (abstractC81935IRd != null && (LIZ2 = abstractC81935IRd.LIZ(LIZJ)) != null) {
            LIZ(LIZ2, LIZJ);
        }
    }

    public final void LIZ(VoiceLiveTheme voiceLiveTheme) {
        if (PatchProxy.proxy(new Object[]{voiceLiveTheme}, this, LIZ, false, 17).isSupported) {
            return;
        }
        HSImageView hSImageView = this.LJIILL;
        IUser LIZ2 = ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        M0Q.LIZ(hSImageView, LIZ2.getAvatarLarge());
        HSImageView hSImageView2 = this.LJIILL;
        if (hSImageView2 != null) {
            LK1.LIZJ(hSImageView2);
        }
        PipelineDraweeControllerBuilder newDraweeControllerBuilder = Fresco.newDraweeControllerBuilder();
        if (!voiceLiveTheme.LIZIZ() && VoiceLiveTheme.LIZ(voiceLiveTheme.LJII)) {
            Intrinsics.checkNotNullExpressionValue(newDraweeControllerBuilder, "");
            newDraweeControllerBuilder.setFirstAvailableImageRequests(M0Q.LIZJ(voiceLiveTheme.LJII));
        } else {
            SettingKey<String> settingKey = LiveSettingKeys.LIVE_AUDIO_LIVE_WEBP;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            newDraweeControllerBuilder.mo27962setUri(Uri.parse(settingKey.getValue()));
        }
        newDraweeControllerBuilder.setAutoPlayAnimations(true);
        HSImageView hSImageView3 = this.LJIILLIIL;
        if (hSImageView3 != null) {
            hSImageView3.setController(newDraweeControllerBuilder.mo27965build());
        }
        HSImageView hSImageView4 = this.LJIILLIIL;
        if (hSImageView4 != null) {
            LK1.LIZJ(hSImageView4);
        }
    }

    public final void LIZ(VoiceLiveTheme voiceLiveTheme, int i) {
        GenericDraweeHierarchy hierarchy;
        GenericDraweeHierarchy hierarchy2;
        String str;
        String str2;
        List<String> urls;
        if (PatchProxy.proxy(new Object[]{voiceLiveTheme, Integer.valueOf(i)}, this, LIZ, false, 16).isSupported) {
            return;
        }
        ALogger.m15801d(VoiceLiveTheme.LIZIZ, "showBackgroundPreview : " + i);
        if (voiceLiveTheme.LJJIIJ == 1) {
            HSImageView hSImageView = this.LJIIZILJ;
            if (hSImageView != null) {
                hSImageView.setActualImageResource(2130854121);
            }
            HSImageView hSImageView2 = this.LJIIZILJ;
            if (hSImageView2 != null) {
                hSImageView2.setVisibility(0);
            }
        } else {
            HSImageView hSImageView3 = this.LJIIZILJ;
            if (hSImageView3 != null) {
                hSImageView3.setVisibility(8);
            }
        }
        if (this.LJIJ) {
            IS5.LIZ(IS5.LIZIZ, voiceLiveTheme, false, null, i, false, 4, null);
            this.LJIJ = false;
        }
        VideoThemeView videoThemeView = this.LJIILJJIL;
        if (videoThemeView != null) {
            videoThemeView.LIZ();
        }
        VideoThemeView videoThemeView2 = this.LJIILJJIL;
        if (videoThemeView2 != null) {
            videoThemeView2.setVisibility(8);
        }
        if (i == 1) {
            LIZIZ(voiceLiveTheme);
        } else if (voiceLiveTheme.LIZIZ()) {
            if (voiceLiveTheme.LJJIIJZLJL != null) {
                HSImageView hSImageView4 = this.LJIIL;
                if (hSImageView4 != null) {
                    hSImageView4.setVisibility(8);
                }
                HSImageView hSImageView5 = this.LJIILIIL;
                if (hSImageView5 != null) {
                    hSImageView5.setVisibility(8);
                }
                VideoThemeView videoThemeView3 = this.LJIILJJIL;
                if (videoThemeView3 != null) {
                    videoThemeView3.setVisibility(0);
                }
                VideoThemeView videoThemeView4 = this.LJIILJJIL;
                if (videoThemeView4 != null) {
                    AnimatedBgInfo animatedBgInfo = voiceLiveTheme.LJJIIJZLJL;
                    Intrinsics.checkNotNull(animatedBgInfo);
                    videoThemeView4.setShowArea(animatedBgInfo.LIZIZ);
                }
                if (voiceLiveTheme.LJIILIIL != null) {
                    VideoThemeView videoThemeView5 = this.LJIILJJIL;
                    if (videoThemeView5 != null) {
                        videoThemeView5.LIZ(voiceLiveTheme.LJIILIIL, "");
                    }
                } else {
                    VideoThemeView videoThemeView6 = this.LJIILJJIL;
                    if (videoThemeView6 != null) {
                        AnimatedBgInfo animatedBgInfo2 = voiceLiveTheme.LJJIIJZLJL;
                        Intrinsics.checkNotNull(animatedBgInfo2);
                        ImageModel imageModel = animatedBgInfo2.LIZJ;
                        if (imageModel != null && (urls = imageModel.getUrls()) != null) {
                            str = urls.get(0);
                        } else {
                            str = null;
                        }
                        AnimatedBgInfo animatedBgInfo3 = voiceLiveTheme.LJJIIJZLJL;
                        Intrinsics.checkNotNull(animatedBgInfo3);
                        ImageModel imageModel2 = animatedBgInfo3.LIZJ;
                        if (imageModel2 != null) {
                            str2 = imageModel2.mUri;
                        } else {
                            str2 = null;
                        }
                        videoThemeView6.LIZ(str, str2);
                    }
                }
            } else {
                if (voiceLiveTheme.LJFF != null) {
                    M0Q.LIZIZ(this.LJIIL, voiceLiveTheme.LJFF, 2130854252);
                } else {
                    M0O.LIZIZ(this.LJIIL, voiceLiveTheme.LJIILIIL);
                }
                HSImageView hSImageView6 = this.LJIIL;
                if (hSImageView6 != null && (hierarchy2 = hSImageView6.getHierarchy()) != null) {
                    hierarchy2.setOverlayImage(new ColorDrawable(Integer.MIN_VALUE));
                }
                HSImageView hSImageView7 = this.LJIIL;
                if (hSImageView7 != null) {
                    LK1.LIZJ(hSImageView7);
                }
            }
            HSImageView hSImageView8 = this.LJIILIIL;
            if (hSImageView8 != null) {
                hSImageView8.setController(null);
            }
            HSImageView hSImageView9 = this.LJIILIIL;
            if (hSImageView9 != null) {
                LK1.LIZ(hSImageView9);
            }
        } else {
            HSImageView hSImageView10 = this.LJIIL;
            if (hSImageView10 != null && (hierarchy = hSImageView10.getHierarchy()) != null) {
                hierarchy.setOverlayImage(null);
            }
            HSImageView hSImageView11 = this.LJIIL;
            if (hSImageView11 != null) {
                LK1.LIZJ(hSImageView11);
            }
            if (C9061c.LIZ(true)) {
                long currentTimeMillis = System.currentTimeMillis();
                PipelineDraweeControllerBuilder newDraweeControllerBuilder = Fresco.newDraweeControllerBuilder();
                Intrinsics.checkNotNullExpressionValue(newDraweeControllerBuilder, "");
                newDraweeControllerBuilder.setFirstAvailableImageRequests(M0Q.LIZJ(voiceLiveTheme.LJIIJJI));
                newDraweeControllerBuilder.setControllerListener(new ISA(currentTimeMillis, voiceLiveTheme));
                HSImageView hSImageView12 = this.LJIIL;
                if (hSImageView12 != null) {
                    hSImageView12.setController(newDraweeControllerBuilder.mo27965build());
                    return;
                }
                return;
            }
            M0Q.LIZIZ(this.LJIIL, voiceLiveTheme.LJFF, 2130854252);
            long currentTimeMillis2 = System.currentTimeMillis();
            PipelineDraweeControllerBuilder newDraweeControllerBuilder2 = Fresco.newDraweeControllerBuilder();
            Intrinsics.checkNotNullExpressionValue(newDraweeControllerBuilder2, "");
            newDraweeControllerBuilder2.setFirstAvailableImageRequests(M0Q.LIZJ(voiceLiveTheme.LJI));
            newDraweeControllerBuilder2.setAutoPlayAnimations(true);
            newDraweeControllerBuilder2.setControllerListener(new ISB(currentTimeMillis2, voiceLiveTheme));
            HSImageView hSImageView13 = this.LJIILIIL;
            if (hSImageView13 != null) {
                hSImageView13.setController(newDraweeControllerBuilder2.mo27965build());
            }
            HSImageView hSImageView14 = this.LJIILIIL;
            if (hSImageView14 != null) {
                LK1.LIZJ(hSImageView14);
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public final void onActivityResult(int i, int i2, Intent intent) {
        AbstractC81969ISl abstractC81969ISl;
        if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent}, this, LIZ, false, 11).isSupported && (abstractC81969ISl = this.LIZLLL) != null) {
            abstractC81969ISl.LIZ(i, i2, intent);
        }
    }

    public final void LIZ(HSImageView hSImageView, HSImageView hSImageView2, View view, HSImageView hSImageView3, VideoThemeView videoThemeView, HSImageView hSImageView4) {
        if (PatchProxy.proxy(new Object[]{hSImageView, hSImageView2, view, hSImageView3, videoThemeView, hSImageView4}, this, LIZ, false, 8).isSupported) {
            return;
        }
        C106862S5w.LIZ(hSImageView, hSImageView2, view, hSImageView3, videoThemeView, hSImageView4);
        this.LJIIL = hSImageView;
        this.LJIILIIL = hSImageView2;
        this.LJIILJJIL = videoThemeView;
        this.LJIJJLI = view;
        this.LJIL = hSImageView3;
        this.LJIIZILJ = hSImageView4;
    }
}
