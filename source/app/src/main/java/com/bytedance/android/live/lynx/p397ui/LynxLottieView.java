package com.bytedance.android.live.lynx.p397ui;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.widget.ImageView;
import com.airbnb.lottie.ImageAssetDelegate;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.facebook.common.executors.CallerThreadExecutor;
import com.facebook.common.references.CloseableReference;
import com.facebook.datasource.DataSource;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.lynx.tasm.EventEmitter;
import com.lynx.tasm.behavior.LynxContext;
import com.lynx.tasm.behavior.LynxProp;
import com.lynx.tasm.behavior.p1543ui.LynxUI;
import com.lynx.tasm.behavior.p1543ui.image.ImageUrlRedirectUtils;
import com.lynx.tasm.event.EventsListener;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import p003X.AbstractC109419T6f;
import p003X.C106862S5w;
import p003X.C109368T4g;
import p003X.C109418T6e;
import p003X.C145350elG;
import p003X.C145351elH;
import p003X.C145364elU;

/* renamed from: com.bytedance.android.live.lynx.ui.LynxLottieView */
/* loaded from: classes19.dex */
public final class LynxLottieView extends LynxUI<LottieAnimationView> implements ImageAssetDelegate {
    public static final C145364elU Companion = new C145364elU((byte) 0);
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean mCancelPlay;
    public int mCurrFrame;
    public int mCurrLoop;
    public boolean mSetPlay;
    public String mSrcUrl;
    public Set<String> supportedEvents;
    public boolean mKeepLastFrame = true;
    public boolean mAutoPlay = true;
    public int mUpdateRate = 6;
    public int mTotalFrame = -1;
    public int mLastProgressInt = -1;
    public long mLastProgressUpdateTime = -1;

    static {
        Covode.recordClassIndex(32380);
    }

    @Override // com.lynx.tasm.behavior.p1543ui.LynxUI, com.lynx.tasm.behavior.p1543ui.LynxBaseUI
    public final void onDetach() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19).isSupported) {
            return;
        }
        super.onDetach();
        ((LottieAnimationView) this.mView).removeAllAnimatorListeners();
        ((LottieAnimationView) this.mView).removeAllUpdateListeners();
        ((LottieAnimationView) this.mView).cancelAnimation();
    }

    @Override // com.lynx.tasm.behavior.p1543ui.LynxBaseUI
    public final void onPropsUpdated() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14).isSupported) {
            return;
        }
        super.onPropsUpdated();
        if (this.mAutoPlay && !this.mCancelPlay && !this.mSetPlay) {
            ((LottieAnimationView) this.mView).playAnimation();
        }
        this.mSetPlay = false;
    }

    @LynxProp(defaultBoolean = true, name = "autoplay")
    public final void setAutoPlay(boolean z) {
        this.mAutoPlay = z;
    }

    @LynxProp(defaultBoolean = true, name = "keeplastframe")
    public final void setKeepLastFrame(boolean z) {
        this.mKeepLastFrame = z;
    }

    @LynxProp(defaultInt = 6, name = "rate")
    public final void setUpdateRate(int i) {
        if (i <= 0) {
            return;
        }
        this.mUpdateRate = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LynxLottieView(LynxContext lynxContext) {
        super(lynxContext);
        C106862S5w.LIZ(lynxContext);
    }

    @LynxProp(defaultInt = 0, name = "startframe")
    public final void setStartFrame(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 12).isSupported) {
            return;
        }
        ((LottieAnimationView) this.mView).setMinFrame(i);
    }

    private final void setSrcUrl(String str) {
        int lastIndexOf$default;
        if (!PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 11).isSupported && (lastIndexOf$default = StringsKt__StringsKt.lastIndexOf$default((CharSequence) str, '/', 0, false, 6, (Object) null)) > 0) {
            if (str != null) {
                String substring = str.substring(0, lastIndexOf$default);
                Intrinsics.checkNotNullExpressionValue(substring, "");
                this.mSrcUrl = substring;
                ((LottieAnimationView) this.mView).setImageAssetDelegate(this);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
    }

    @LynxProp(defaultInt = -1, name = "endframe")
    public final void setEndFrame(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 13).isSupported) {
            return;
        }
        if (i < 0) {
            ((LottieAnimationView) this.mView).setMaxFrame(Integer.MAX_VALUE);
        }
        ((LottieAnimationView) this.mView).setMaxFrame(i);
    }

    @Override // com.lynx.tasm.behavior.p1543ui.LynxBaseUI
    public final void setEvents(Map<String, EventsListener> map) {
        Set<String> set;
        if (PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 15).isSupported) {
            return;
        }
        super.setEvents(map);
        if (map != null) {
            set = map.keySet();
        } else {
            set = null;
        }
        this.supportedEvents = set;
    }

    @LynxProp(name = "json")
    public final void setJson(String str) {
        if (!PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 7).isSupported && str != null && str.length() != 0) {
            ((LottieAnimationView) this.mView).setAnimationFromJson(str, null);
            if (!this.mCancelPlay && this.mAutoPlay) {
                ((LottieAnimationView) this.mView).playAnimation();
            } else {
                ((LottieAnimationView) this.mView).cancelAnimation();
            }
            this.mCancelPlay = false;
            this.mAutoPlay = true;
        }
    }

    @LynxProp(defaultBoolean = false, name = "loop")
    public final void setLoop(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 8).isSupported) {
            return;
        }
        if (z) {
            T t = this.mView;
            Intrinsics.checkNotNullExpressionValue(t, "");
            ((LottieAnimationView) t).setRepeatCount(-1);
            return;
        }
        T t2 = this.mView;
        Intrinsics.checkNotNullExpressionValue(t2, "");
        ((LottieAnimationView) t2).setRepeatCount(0);
    }

    @LynxProp(name = "playstatus")
    public final void setPlay(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        if (Intrinsics.areEqual("play", str)) {
            ((LottieAnimationView) this.mView).playAnimation();
            this.mSetPlay = true;
            this.mCancelPlay = false;
        } else if (Intrinsics.areEqual("pause", str)) {
            ((LottieAnimationView) this.mView).cancelAnimation();
            this.mCancelPlay = true;
        }
    }

    @LynxProp(name = "progress")
    public final void setProgress(float f) {
        if (PatchProxy.proxy(new Object[]{Float.valueOf(f)}, this, changeQuickRedirect, false, 5).isSupported) {
            return;
        }
        T t = this.mView;
        Intrinsics.checkNotNullExpressionValue(t, "");
        ((LottieAnimationView) t).setProgress(f);
    }

    @LynxProp(defaultInt = -1, name = "repetcount")
    public final void setRepeat(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, changeQuickRedirect, false, 9).isSupported) {
            return;
        }
        if (i < 0) {
            i = -1;
        }
        T t = this.mView;
        Intrinsics.checkNotNullExpressionValue(t, "");
        ((LottieAnimationView) t).setRepeatCount(i);
    }

    @LynxProp(name = "speed")
    public final void setSpeed(float f) {
        if (PatchProxy.proxy(new Object[]{Float.valueOf(f)}, this, changeQuickRedirect, false, 4).isSupported) {
            return;
        }
        T t = this.mView;
        Intrinsics.checkNotNullExpressionValue(t, "");
        ((LottieAnimationView) t).setSpeed(f);
    }

    @Override // com.lynx.tasm.behavior.p1543ui.LynxUI
    /* renamed from: createView  reason: collision with other method in class */
    public final LottieAnimationView mo29230createView(Context context) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (LottieAnimationView) proxy.result;
        }
        LottieAnimationView lottieAnimationView = new LottieAnimationView(context);
        int i = Build.VERSION.SDK_INT;
        lottieAnimationView.useHardwareAcceleration(true);
        lottieAnimationView.enableMergePathsForKitKatAndAbove(true);
        lottieAnimationView.addAnimatorListener(new C145350elG(this));
        lottieAnimationView.addAnimatorUpdateListener(new C145351elH(this));
        try {
            Field declaredField = lottieAnimationView.getClass().getDeclaredField("autoPlay");
            Intrinsics.checkNotNullExpressionValue(declaredField, "");
            declaredField.setAccessible(true);
            declaredField.set(lottieAnimationView, Boolean.TRUE);
        } catch (Exception unused) {
        }
        return lottieAnimationView;
    }

    @LynxProp(name = "objectfit")
    public final void setObjectFit(String str) {
        ImageView.ScaleType scaleType;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 6).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        int hashCode = str.hashCode();
        if (hashCode != 94852023) {
            if (hashCode == 951526612 && str.equals("contain")) {
                scaleType = ImageView.ScaleType.FIT_CENTER;
            }
            scaleType = ImageView.ScaleType.CENTER;
        } else {
            if (str.equals("cover")) {
                scaleType = ImageView.ScaleType.CENTER_CROP;
            }
            scaleType = ImageView.ScaleType.CENTER;
        }
        T t = this.mView;
        Intrinsics.checkNotNullExpressionValue(t, "");
        ((LottieAnimationView) t).setScaleType(scaleType);
    }

    @LynxProp(defaultBoolean = false, name = "play")
    public final void setPlay(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 3).isSupported) {
            return;
        }
        if (z) {
            this.mSetPlay = true;
            this.mCancelPlay = false;
            return;
        }
        ((LottieAnimationView) this.mView).cancelAnimation();
        this.mCancelPlay = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0095, code lost:
        if (kotlin.text.StringsKt__StringsJVMKt.startsWith$default(r1, "https://", false, 2, null) != false) goto L38;
     */
    /* JADX WARN: Type inference failed for: r0v34, types: [T, android.graphics.Bitmap] */
    @Override // com.airbnb.lottie.ImageAssetDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap fetchBitmap(com.airbnb.lottie.LottieImageAsset r8) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.lynx.p397ui.LynxLottieView.fetchBitmap(com.airbnb.lottie.LottieImageAsset):android.graphics.Bitmap");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a8 A[Catch: Exception -> 0x00f6, TryCatch #0 {Exception -> 0x00f6, blocks: (B:9:0x0026, B:11:0x0030, B:14:0x003e, B:18:0x0049, B:21:0x00a1, B:24:0x00a8, B:26:0x00b0, B:27:0x00b7, B:29:0x00c0, B:30:0x00e6, B:33:0x0052, B:36:0x0063, B:38:0x0069, B:39:0x006c, B:42:0x005b, B:45:0x0078, B:47:0x0080, B:50:0x0099, B:53:0x00ee), top: B:8:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0069 A[Catch: Exception -> 0x00f6, TryCatch #0 {Exception -> 0x00f6, blocks: (B:9:0x0026, B:11:0x0030, B:14:0x003e, B:18:0x0049, B:21:0x00a1, B:24:0x00a8, B:26:0x00b0, B:27:0x00b7, B:29:0x00c0, B:30:0x00e6, B:33:0x0052, B:36:0x0063, B:38:0x0069, B:39:0x006c, B:42:0x005b, B:45:0x0078, B:47:0x0080, B:50:0x0099, B:53:0x00ee), top: B:8:0x0026 }] */
    @com.lynx.tasm.behavior.LynxProp(name = "src")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setSrc(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.lynx.p397ui.LynxLottieView.setSrc(java.lang.String):void");
    }

    public final void requestBitmapSync(String str, AbstractC109419T6f abstractC109419T6f) {
        if (PatchProxy.proxy(new Object[]{str, abstractC109419T6f}, this, changeQuickRedirect, false, 18).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, abstractC109419T6f);
        String redirectUrl = ImageUrlRedirectUtils.redirectUrl(getLynxContext(), str);
        Intrinsics.checkNotNullExpressionValue(redirectUrl, "");
        DataSource<CloseableReference<CloseableImage>> fetchDecodedImage = Fresco.getImagePipeline().fetchDecodedImage(ImageRequestBuilder.newBuilderWithSource(Uri.parse(redirectUrl)).build(), "tt-lottie");
        if (fetchDecodedImage == null) {
            return;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        C109418T6e c109418T6e = new C109418T6e(abstractC109419T6f, countDownLatch, fetchDecodedImage);
        fetchDecodedImage.subscribe(c109418T6e, CallerThreadExecutor.getInstance());
        try {
            if (!countDownLatch.await(3L, TimeUnit.SECONDS)) {
                c109418T6e.onFailure(null);
            }
        } catch (InterruptedException unused) {
            c109418T6e.onFailure(null);
        }
    }

    public final void sendLottieEvent(String str, int i, int i2, int i3) {
        Set<String> set;
        LynxContext lynxContext;
        EventEmitter eventEmitter;
        if (!PatchProxy.proxy(new Object[]{str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, changeQuickRedirect, false, 16).isSupported && (set = this.supportedEvents) != null && set.contains(str) && (lynxContext = getLynxContext()) != null && (eventEmitter = lynxContext.getEventEmitter()) != null) {
            eventEmitter.sendCustomEvent(new C109368T4g(this, i, i2, i3, str, getSign(), str));
        }
    }
}
