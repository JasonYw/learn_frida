package com.bytedance.android.live.broadcast.widget;

import android.animation.Animator;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.os.Looper;
import android.os.Message;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.broadcast.api.model.C2908d;
import com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget;
import com.bytedance.android.live.room.ILiveSDKService;
import com.bytedance.android.live.room.IRoomService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.p750v.C9305m;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.info.WidgetInfo;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import java.util.concurrent.Callable;
import p002O.C0002O;
import p003X.AbstractC4569445g;
import p003X.AbstractC90419Ljp;
import p003X.C116971W2r;
import p003X.C3XJ;
import p003X.C440083b0;
import p003X.C65402BrI;
import p003X.C80604Hpu;
import p003X.C87010KQi;
import p003X.LK5;
import p003X.M25;

/* loaded from: classes12.dex */
public class TaskFinishAnimationWidget extends LiveRecyclableWidget implements WeakHandler.IHandler, AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public View LIZIZ;
    public LottieAnimationView LIZJ;
    public TextView LIZLLL;

    /* renamed from: LJ */
    public AlphaAnimation f26005LJ;
    public Runnable LJFF;
    public AlphaAnimation LJI;
    public final WeakHandler LJII = new WeakHandler(Looper.getMainLooper(), this);
    public float LJIIIIZZ = 245.0f;
    public float LJIIIZ = -546.0f;
    public int[] LJIIJ = null;
    public boolean LJIIJJI = false;
    public CompositeDisposable LJIIL = new CompositeDisposable();

    static {
        Covode.recordClassIndex(18846);
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public int getLayoutId() {
        return 2131698298;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.android.logsdk.collect.p785a.AbstractC9727b
    public String getSpm() {
        return "a100.a100.a140";
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 9).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public void onUnload() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            return;
        }
        CompositeDisposable compositeDisposable = this.LJIIL;
        if (compositeDisposable != null) {
            compositeDisposable.dispose();
        }
        AlphaAnimation alphaAnimation = this.LJI;
        if (alphaAnimation != null) {
            alphaAnimation.cancel();
            this.LJI = null;
        }
        AlphaAnimation alphaAnimation2 = this.f26005LJ;
        if (alphaAnimation2 != null) {
            alphaAnimation2.cancel();
            this.f26005LJ = null;
        }
        if (this.LJFF != null) {
            this.LJFF = null;
        }
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public void handleMsg(Message message) {
        C3XJ lottiePlayService;
        if (!PatchProxy.proxy(new Object[]{message}, this, LIZ, false, 8).isSupported && message != null && message.what == 100 && (message.obj instanceof C9305m) && (lottiePlayService = ((ILiveSDKService) ServiceManager.getService(ILiveSDKService.class)).getLottiePlayService()) != null) {
            this.LIZJ.setVisibility(0);
            lottiePlayService.startLotteryFullAnimation((C9305m) message.obj, this.LIZJ, true);
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public void onInit(Object[] objArr) {
        if (PatchProxy.proxy(new Object[]{objArr}, this, LIZ, false, 1).isSupported) {
            return;
        }
        this.LIZIZ = findViewById(2131191558);
        this.LIZLLL = (TextView) findViewById(2131192775);
        this.LIZJ = (LottieAnimationView) findViewById(2131192774);
        this.LIZJ.setVisibility(4);
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveRecyclableWidget
    public void onLoad(Object[] objArr) {
        if (PatchProxy.proxy(new Object[]{objArr}, this, LIZ, false, 2).isSupported) {
            return;
        }
        this.LJIIL.add(C87010KQi.LIZ().LIZ(C2908d.class).subscribe(new Consumer<C2908d>() { // from class: com.bytedance.android.live.broadcast.widget.TaskFinishAnimationWidget.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(18847);
            }

            @Override // io.reactivex.functions.Consumer
            public final /* synthetic */ void accept(C2908d c2908d) {
                C2908d c2908d2 = c2908d;
                if (!PatchProxy.proxy(new Object[]{c2908d2}, this, LIZ, false, 1).isSupported) {
                    final TaskFinishAnimationWidget taskFinishAnimationWidget = TaskFinishAnimationWidget.this;
                    if (!PatchProxy.proxy(new Object[]{c2908d2}, taskFinishAnimationWidget, TaskFinishAnimationWidget.LIZ, false, 3).isSupported && c2908d2 != null) {
                        taskFinishAnimationWidget.LJIIJJI = c2908d2.LIZJ;
                        long j = 0;
                        if (taskFinishAnimationWidget.LJIIJJI) {
                            if (LiveSettingKeys.ASSET_ANIM_ID_MAP.getValue() != null) {
                                j = LiveSettingKeys.ASSET_ANIM_ID_MAP.getValue().LIZJ;
                            }
                        } else {
                            if (LiveSettingKeys.ASSET_ANIM_ID_MAP.getValue() != null) {
                                j = LiveSettingKeys.ASSET_ANIM_ID_MAP.getValue().LIZIZ;
                            }
                            new StringBuilder();
                            SpannableString spannableString = new SpannableString(C0002O.m25085C(c2908d2.LIZ, "\n", c2908d2.LIZIZ));
                            if (!TextUtils.isEmpty(c2908d2.LIZ)) {
                                C116971W2r.LIZ(spannableString, new AbsoluteSizeSpan(LK5.LIZ(11.0f)), 0, c2908d2.LIZ.length(), 18);
                            }
                            taskFinishAnimationWidget.LIZLLL.setText(spannableString);
                        }
                        ((AbstractC90419Ljp) ServiceManager.getService(AbstractC90419Ljp.class)).getAssetsManager().LIZ(j, new C440083b0() { // from class: com.bytedance.android.live.broadcast.widget.TaskFinishAnimationWidget.3
                            public static ChangeQuickRedirect LIZ;

                            static {
                                Covode.recordClassIndex(18849);
                            }

                            @Override // p003X.C440083b0, com.bytedance.android.livesdk.gift.platform.business.effect.assets.AbstractC7397l
                            public final void LIZ(Throwable th) {
                            }

                            @Override // p003X.C440083b0, com.bytedance.android.livesdk.gift.platform.business.effect.assets.AbstractC7397l
                            public final void LIZ(long j2, final String str) {
                                if (PatchProxy.proxy(new Object[]{new Long(j2), str}, this, LIZ, false, 1).isSupported) {
                                    return;
                                }
                                super.LIZ(j2, str);
                                WeakHandler weakHandler = TaskFinishAnimationWidget.this.LJII;
                                if (!PatchProxy.proxy(new Object[]{weakHandler, str, 7, 100}, null, C65402BrI.LIZ, true, 1).isSupported) {
                                    M25.LIZ().LIZ(weakHandler, new Callable() { // from class: X.3XU
                                        public static ChangeQuickRedirect LIZ;

                                        static {
                                            Covode.recordClassIndex(60707);
                                        }

                                        @Override // java.util.concurrent.Callable
                                        public final Object call() {
                                            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
                                            if (proxy.isSupported) {
                                                return proxy.result;
                                            }
                                            return C65402BrI.LIZ(str, r2);
                                        }
                                    }, 100);
                                }
                            }
                        }, 4);
                    }
                }
            }
        }));
        this.LIZJ.addAnimatorListener(new Animator.AnimatorListener() { // from class: com.bytedance.android.live.broadcast.widget.TaskFinishAnimationWidget.2
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(18848);
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.proxy(new Object[]{animator}, this, LIZ, false, 2).isSupported) {
                    return;
                }
                UIUtils.setViewVisibility(TaskFinishAnimationWidget.this.LIZLLL, 8);
                if (TaskFinishAnimationWidget.this.LJIIJJI) {
                    UIUtils.setViewVisibility(TaskFinishAnimationWidget.this.LIZLLL, 8);
                    UIUtils.setViewVisibility(TaskFinishAnimationWidget.this.LIZJ, 8);
                    TaskFinishAnimationWidget taskFinishAnimationWidget = TaskFinishAnimationWidget.this;
                    if (!PatchProxy.proxy(new Object[0], taskFinishAnimationWidget, TaskFinishAnimationWidget.LIZ, false, 6).isSupported) {
                        taskFinishAnimationWidget.LIZIZ.setTranslationX(0.0f);
                        taskFinishAnimationWidget.LIZIZ.setTranslationY(0.0f);
                        taskFinishAnimationWidget.LIZIZ.setScaleX(1.0f);
                        taskFinishAnimationWidget.LIZIZ.setScaleY(1.0f);
                        taskFinishAnimationWidget.LIZIZ.setAlpha(1.0f);
                    }
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                if (PatchProxy.proxy(new Object[]{animator}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                if (TaskFinishAnimationWidget.this.LJIIJJI) {
                    TaskFinishAnimationWidget taskFinishAnimationWidget = TaskFinishAnimationWidget.this;
                    if (!PatchProxy.proxy(new Object[0], taskFinishAnimationWidget, TaskFinishAnimationWidget.LIZ, false, 5).isSupported) {
                        WidgetInfo widgetInfo = taskFinishAnimationWidget.getWidgetInfo(((IRoomService) ServiceManager.getService(IRoomService.class)).getTopRightBannerWidgetClass());
                        if (widgetInfo != null) {
                            int[] locationOnScreen = widgetInfo.getLocationOnScreen();
                            if (taskFinishAnimationWidget.LJIIJ == null) {
                                taskFinishAnimationWidget.LJIIJ = new int[2];
                                taskFinishAnimationWidget.LIZIZ.getLocationOnScreen(taskFinishAnimationWidget.LJIIJ);
                            }
                            taskFinishAnimationWidget.LJIIIIZZ = (locationOnScreen[0] + (widgetInfo.getContentViewWidth() * 0.75f)) - (taskFinishAnimationWidget.LJIIJ[0] + ((taskFinishAnimationWidget.LIZIZ.getWidth() * 1.0f) / 2.0f));
                            taskFinishAnimationWidget.LJIIIZ = (locationOnScreen[1] + ((widgetInfo.getContentViewHeight() * 1.0f) / 2.0f)) - (taskFinishAnimationWidget.LJIIJ[1] + ((taskFinishAnimationWidget.LIZJ.getHeight() * 1.0f) / 2.0f));
                        }
                        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat("translationX", 0.0f, taskFinishAnimationWidget.LJIIIIZZ);
                        PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat("translationY", 0.0f, taskFinishAnimationWidget.LJIIIZ);
                        PropertyValuesHolder ofFloat3 = PropertyValuesHolder.ofFloat("scaleX", 1.0f, 0.0f);
                        PropertyValuesHolder ofFloat4 = PropertyValuesHolder.ofFloat("scaleY", 1.0f, 0.0f);
                        Keyframe ofFloat5 = Keyframe.ofFloat(0.0f, 1.0f);
                        Keyframe ofFloat6 = Keyframe.ofFloat(0.6875f, 1.0f);
                        Keyframe ofFloat7 = Keyframe.ofFloat(1.0f, 0.0f);
                        ofFloat7.setInterpolator(new C80604Hpu());
                        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(taskFinishAnimationWidget.LIZIZ, ofFloat3, ofFloat4, ofFloat, ofFloat2, PropertyValuesHolder.ofKeyframe("alpha", ofFloat5, ofFloat6, ofFloat7));
                        ofPropertyValuesHolder.setInterpolator(new C80604Hpu());
                        ofPropertyValuesHolder.setDuration(640L);
                        ofPropertyValuesHolder.setStartDelay(4300L);
                        ofPropertyValuesHolder.start();
                        return;
                    }
                    return;
                }
                UIUtils.setViewVisibility(TaskFinishAnimationWidget.this.LIZLLL, 0);
                final TaskFinishAnimationWidget taskFinishAnimationWidget2 = TaskFinishAnimationWidget.this;
                if (!PatchProxy.proxy(new Object[0], taskFinishAnimationWidget2, TaskFinishAnimationWidget.LIZ, false, 4).isSupported) {
                    taskFinishAnimationWidget2.LJI = new AlphaAnimation(0.0f, 1.0f);
                    taskFinishAnimationWidget2.f26005LJ = new AlphaAnimation(1.0f, 0.0f);
                    taskFinishAnimationWidget2.LJI.setDuration(200L);
                    taskFinishAnimationWidget2.f26005LJ.setDuration(200L);
                    taskFinishAnimationWidget2.LJFF = new Runnable() { // from class: com.bytedance.android.live.broadcast.widget.TaskFinishAnimationWidget.4
                        public static ChangeQuickRedirect LIZ;

                        static {
                            Covode.recordClassIndex(18850);
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported && TaskFinishAnimationWidget.this.isViewValid()) {
                                TaskFinishAnimationWidget.this.LIZLLL.startAnimation(TaskFinishAnimationWidget.this.f26005LJ);
                            }
                        }
                    };
                }
                TaskFinishAnimationWidget.this.LIZLLL.startAnimation(TaskFinishAnimationWidget.this.LJI);
                TaskFinishAnimationWidget.this.LIZLLL.postDelayed(TaskFinishAnimationWidget.this.LJFF, 1700L);
            }
        });
    }
}
