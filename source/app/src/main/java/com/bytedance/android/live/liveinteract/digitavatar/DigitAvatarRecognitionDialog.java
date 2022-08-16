package com.bytedance.android.live.liveinteract.digitavatar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.broadcast.api.AbstractC2890k;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.effect.api.AbstractC4169j;
import com.bytedance.android.live.effect.api.C4173o;
import com.bytedance.android.live.effect.api.LiveEffectContextFactory;
import com.bytedance.android.live.effect.event.C4201f;
import com.bytedance.android.live.effect.event.ReleaseStatus;
import com.bytedance.android.live.liveinteract.digitavatar.DigitAvatarMsgController;
import com.bytedance.android.live.liveinteract.voicechat.api.KtvDigitAvatarApi;
import com.bytedance.android.live.pushstream.AbstractC5436a;
import com.bytedance.android.live.room.ILiveSDKService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.C9078n;
import com.bytedance.android.livesdk.chatroom.p518ui.DoubleColorBallAnimationView;
import com.bytedance.android.livesdk.config.C6849bf;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.log.model.C8668v;
import com.bytedance.android.livesdkapi.depend.model.Sticker;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedFile;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import com.facebook.cache.common.SimpleCacheKey;
import com.facebook.cache.disk.FileCache;
import com.facebook.common.file.FileUtils;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.imagepipeline.core.ImagePipelineFactory;
import java.io.File;
import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC80293Hkt;
import p003X.AbstractC80428Hn4;
import p003X.AbstractC81969ISl;
import p003X.C100839PnV;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C144451eWj;
import p003X.C2WC;
import p003X.C423702pg;
import p003X.C4574547f;
import p003X.C78757H2x;
import p003X.C80429Hn5;
import p003X.C80431Hn7;
import p003X.C80432Hn8;
import p003X.C80433Hn9;
import p003X.C80435HnB;
import p003X.C80445HnL;
import p003X.C80446HnM;
import p003X.C87010KQi;
import p003X.C87308Kak;
import p003X.C88306Kqq;
import p003X.C88440Kt0;
import p003X.H99;
import p003X.HH8;
import p003X.IT2;
import p003X.LK1;
import p003X.LK5;
import p003X.View$OnClickListenerC78920H9e;
import p003X.View$OnClickListenerC80451HnR;
import p003X.View$OnClickListenerC80453HnT;

/* loaded from: classes3.dex */
public abstract class DigitAvatarRecognitionDialog extends C9078n {
    public static ChangeQuickRedirect LIZ;
    public RecognitionType LIZJ;
    public DataCenter LIZLLL;

    /* renamed from: LJ */
    public AbstractC5436a f26306LJ;
    public AbstractC80428Hn4 LJFF;
    public Sticker LJI;
    public Sticker LJII;
    public DigitAvatarMsgController LJIIIIZZ;
    public File LJIIIZ;
    public String LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIILIIL;
    public Sticker LJIILJJIL;
    public boolean LJIILL;
    public AbstractC81969ISl LJIILLIIL;
    public AbstractC4169j LJIIZILJ;
    public o$a LJIJJLI;
    public o$a LJIL;
    public HashMap LJJ;
    public long LIZIZ = System.currentTimeMillis();
    public AvatarGender LJIJ = H99.LIZ();
    public final Handler LJIIL = new Handler(Looper.getMainLooper());
    public final C80429Hn5 LJIJI = new C80429Hn5(this);
    public final AbstractC2890k LJIJJ = new C80446HnM(this);

    /* loaded from: classes3.dex */
    public enum RecognitionType {
        DEFAULT,
        PHOTO,
        CAMERA,
        RESULT;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        static {
            Covode.recordClassIndex(26591);
        }

        public static RecognitionType valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            return (RecognitionType) (proxy.isSupported ? proxy.result : Enum.valueOf(RecognitionType.class, str));
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static RecognitionType[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            return (RecognitionType[]) (proxy.isSupported ? proxy.result : values().clone());
        }
    }

    static {
        Covode.recordClassIndex(26590);
    }

    @Override // com.bytedance.android.livesdk.C9078n, p003X.C88402KsO
    public View LIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 35);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (this.LJJ == null) {
            this.LJJ = new HashMap();
        }
        View view = (View) this.LJJ.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.LJJ.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void LIZ(AvatarGender avatarGender) {
        if (PatchProxy.proxy(new Object[]{avatarGender}, this, LIZ, false, 8).isSupported) {
            return;
        }
        C106862S5w.LIZ(avatarGender);
    }

    @Override // com.bytedance.android.livesdk.C9078n, p003X.C88402KsO
    public void LIZJ() {
        HashMap hashMap;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 36).isSupported && (hashMap = this.LJJ) != null) {
            hashMap.clear();
        }
    }

    public abstract boolean LJFF();

    public abstract DigitAvatarRecognitionScene LJI();

    public final void LIZ(String str, Throwable th) {
        if (PatchProxy.proxy(new Object[]{str, th}, this, LIZ, false, 33).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        ALogger.m15799e("KtvDigitAvatar", str, th);
    }

    public final RecognitionType LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (RecognitionType) proxy.result;
        }
        RecognitionType recognitionType = this.LIZJ;
        if (recognitionType == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return recognitionType;
    }

    public final AbstractC80428Hn4 LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 3);
        if (proxy.isSupported) {
            return (AbstractC80428Hn4) proxy.result;
        }
        AbstractC80428Hn4 abstractC80428Hn4 = this.LJFF;
        if (abstractC80428Hn4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return abstractC80428Hn4;
    }

    /* renamed from: LJ */
    public final DigitAvatarMsgController m15742LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        if (proxy.isSupported) {
            return (DigitAvatarMsgController) proxy.result;
        }
        DigitAvatarMsgController digitAvatarMsgController = this.LJIIIIZZ;
        if (digitAvatarMsgController == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return digitAvatarMsgController;
    }

    private final void LJIILLIIL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 25).isSupported) {
            return;
        }
        LinearLayout linearLayout = (LinearLayout) LIZ(2131182029);
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        LK1.LIZJ(linearLayout);
        DoubleColorBallAnimationView doubleColorBallAnimationView = (DoubleColorBallAnimationView) LIZ(2131172810);
        Intrinsics.checkNotNullExpressionValue(doubleColorBallAnimationView, "");
        LK1.LIZJ(doubleColorBallAnimationView);
        ((DoubleColorBallAnimationView) LIZ(2131172810)).LIZ();
    }

    public final void LJIIIIZZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 16).isSupported) {
            return;
        }
        C87010KQi.LIZ().LIZ(new C4201f(ReleaseStatus.Start));
        AbstractC81969ISl abstractC81969ISl = this.LJIILLIIL;
        if (abstractC81969ISl == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        abstractC81969ISl.LIZJ();
    }

    public final void LJIIIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 17).isSupported) {
            return;
        }
        C87010KQi.LIZ().LIZ(new C4201f(ReleaseStatus.Start));
        AbstractC81969ISl abstractC81969ISl = this.LJIILLIIL;
        if (abstractC81969ISl == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        abstractC81969ISl.LIZLLL();
    }

    public final void LJIIJJI() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 26).isSupported) {
            return;
        }
        LinearLayout linearLayout = (LinearLayout) LIZ(2131182029);
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        LK1.LIZ((View) linearLayout);
        DoubleColorBallAnimationView doubleColorBallAnimationView = (DoubleColorBallAnimationView) LIZ(2131172810);
        Intrinsics.checkNotNullExpressionValue(doubleColorBallAnimationView, "");
        LK1.LIZ(doubleColorBallAnimationView);
        ((DoubleColorBallAnimationView) LIZ(2131172810)).LIZIZ();
    }

    public final boolean LJIIL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 31);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        DataCenter dataCenter = this.LIZLLL;
        if (dataCenter == null || !C423702pg.LIZIZ(dataCenter, false)) {
            return false;
        }
        return true;
    }

    public final void LJIIJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 23).isSupported) {
            return;
        }
        Sticker sticker = this.LJI;
        if (sticker != null) {
            AbstractC4169j abstractC4169j = this.LJIIZILJ;
            if (abstractC4169j == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            abstractC4169j.LIZIZ("livedigitavatar", sticker);
        }
        Sticker sticker2 = this.LJII;
        if (sticker2 != null) {
            LIZ(sticker2);
            LJIILL();
            LIZ("waiting avatar sticker ready...");
        } else if (!PatchProxy.proxy(new Object[]{this, "形象识别成功后，形象道具还未下载完成", null, 2, null}, null, LIZ, true, 34).isSupported) {
            LIZ("形象识别成功后，形象道具还未下载完成", (Throwable) null);
        }
    }

    @Override // com.bytedance.android.livesdk.C9078n, p003X.C88402KsO, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported) {
            return;
        }
        super.onDestroyView();
        DigitAvatarMsgController digitAvatarMsgController = this.LJIIIIZZ;
        if (digitAvatarMsgController == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        digitAvatarMsgController.LIZIZ();
        this.LJIIL.removeCallbacksAndMessages(null);
        this.LJIL = null;
        this.LJIJJLI = null;
        AbstractC80428Hn4 abstractC80428Hn4 = this.LJFF;
        if (abstractC80428Hn4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        abstractC80428Hn4.LIZIZ(this.LJIJJ);
        AbstractC80428Hn4 abstractC80428Hn42 = this.LJFF;
        if (abstractC80428Hn42 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        abstractC80428Hn42.LIZIZ();
        LIZJ();
    }

    private final void LJIILL() {
        C2WC<C4383i> LIZIZ;
        C4383i LIZ2;
        C2WC<C4383i> LIZIZ2;
        C4383i LIZ3;
        FileCache smallImageFileCache;
        FileCache mainFileCache;
        boolean z = false;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 19).isSupported) {
            return;
        }
        RecognitionType recognitionType = this.LIZJ;
        if (recognitionType == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (recognitionType != RecognitionType.RESULT) {
            AbstractC80428Hn4 abstractC80428Hn4 = this.LJFF;
            if (abstractC80428Hn4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            LK1.LIZJ(abstractC80428Hn4.getSurfaceView());
        } else {
            if (this.LJIILIIL) {
                HSImageView hSImageView = (HSImageView) LIZ(2131167347);
                Intrinsics.checkNotNullExpressionValue(hSImageView, "");
                LK1.LIZJ(hSImageView);
                File LIZLLL = IT2.LIZIZ.LIZLLL();
                C4382d LIZ4 = C4382d.LIZLLL.LIZ();
                if (LIZ4 != null && (LIZIZ2 = LIZ4.LIZIZ()) != null && (LIZ3 = LIZIZ2.LIZ()) != null && LIZ3.LIZ() && LIZLLL != null) {
                    Uri fromFile = Uri.fromFile(LIZLLL);
                    ImagePipeline imagePipeline = Fresco.getImagePipeline();
                    if (imagePipeline != null) {
                        imagePipeline.evictFromCache(fromFile);
                    }
                    ImagePipelineFactory imagePipelineFactory = Fresco.getImagePipelineFactory();
                    if (imagePipelineFactory != null && (mainFileCache = imagePipelineFactory.getMainFileCache()) != null) {
                        mainFileCache.remove(new SimpleCacheKey(fromFile.toString()));
                    }
                    ImagePipelineFactory imagePipelineFactory2 = Fresco.getImagePipelineFactory();
                    if (imagePipelineFactory2 != null && (smallImageFileCache = imagePipelineFactory2.getSmallImageFileCache()) != null) {
                        smallImageFileCache.remove(new SimpleCacheKey(fromFile.toString()));
                    }
                    ((SimpleDraweeView) LIZ(2131167347)).setImageURI(fromFile, (Object) null);
                } else if (this.LJIJ == AvatarGender.Female) {
                    SettingKey<C6849bf> settingKey = LiveSettingKeys.LIVE_KTV_AVATAR_RESOURCE_CONFIG;
                    Intrinsics.checkNotNullExpressionValue(settingKey, "");
                    ((SimpleDraweeView) LIZ(2131167347)).setImageURI(settingKey.getValue().LIZIZ(), this);
                } else {
                    SettingKey<C6849bf> settingKey2 = LiveSettingKeys.LIVE_KTV_AVATAR_RESOURCE_CONFIG;
                    Intrinsics.checkNotNullExpressionValue(settingKey2, "");
                    ((SimpleDraweeView) LIZ(2131167347)).setImageURI(settingKey2.getValue().LIZ(), this);
                }
            } else {
                AbstractC80428Hn4 abstractC80428Hn42 = this.LJFF;
                if (abstractC80428Hn42 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                LK1.LIZJ(abstractC80428Hn42.getSurfaceView());
            }
            C4382d LIZ5 = C4382d.LIZLLL.LIZ();
            if (LIZ5 != null && (LIZIZ = LIZ5.LIZIZ()) != null && (LIZ2 = LIZIZ.LIZ()) != null && LIZ2.LJFF && !LIZ2.LIZLLL) {
                C88440Kt0.LIZ(2131584628);
            }
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) LIZ(2131187310);
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        LK1.LIZJ(constraintLayout);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) LIZ(2131187309);
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
        LK1.LIZ((View) constraintLayout2);
        LJIIJJI();
        C78757H2x c78757H2x = C78757H2x.LIZIZ;
        boolean LIZIZ3 = C423702pg.LIZIZ(this.LIZLLL, false);
        RecognitionType recognitionType2 = this.LIZJ;
        if (recognitionType2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (recognitionType2 == RecognitionType.DEFAULT) {
            z = true;
        }
        c78757H2x.LIZ(LIZIZ3, z);
    }

    public void LJII() {
        String str;
        boolean z;
        boolean z2;
        long j;
        Room LIZIZ;
        C2WC<C4383i> LIZIZ2;
        boolean z3;
        File[] listFiles;
        File file;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 12).isSupported) {
            return;
        }
        RecognitionType recognitionType = this.LIZJ;
        if (recognitionType == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (recognitionType != RecognitionType.RESULT) {
            IT2 it2 = IT2.LIZIZ;
            if (!PatchProxy.proxy(new Object[0], it2, IT2.LIZ, false, 7).isSupported && (listFiles = it2.LIZIZ().listFiles()) != null) {
                File LIZJ = IT2.LIZIZ.LIZJ();
                for (File file2 : listFiles) {
                    Intrinsics.checkNotNullExpressionValue(file2, "");
                    try {
                        FileUtils.LIZ(file2, new File(LIZJ, file2.getName()));
                    } catch (Exception e) {
                        ALogger.m15799e("KtvDigitAvatar", "file rename to fail. srcfile=" + file2.getPath() + ", dstFile=" + file.getPath(), e);
                    }
                }
            }
            C4382d LIZ2 = C4382d.LIZLLL.LIZ();
            if (LIZ2 != null && (LIZIZ2 = LIZ2.LIZIZ()) != null) {
                RecognitionType recognitionType2 = this.LIZJ;
                if (recognitionType2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                if (recognitionType2 == RecognitionType.DEFAULT) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                LIZIZ2.LIZ(new C4383i(z3, this.LJIJ, false, this.LJIIJ, false, 0L, 48));
            }
            C4382d LIZ3 = C4382d.LIZLLL.LIZ();
            if (LIZ3 != null) {
                LIZ3.LJIILIIL();
            }
            RecognitionType recognitionType3 = this.LIZJ;
            if (recognitionType3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            if (recognitionType3 != RecognitionType.DEFAULT && !PatchProxy.proxy(new Object[0], this, LIZ, false, 30).isSupported) {
                LIZ("fire uploadImage2Audit()...");
                File file3 = this.LJIIIZ;
                File LIZLLL = IT2.LIZIZ.LIZLLL();
                if (file3 != null && LIZLLL != null) {
                    DataCenter dataCenter = this.LIZLLL;
                    if (dataCenter != null && (LIZIZ = C423702pg.LIZIZ(dataCenter)) != null) {
                        j = LIZIZ.getId();
                    } else {
                        j = 0;
                    }
                    LIZ("start 上传图片去审核...");
                    MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
                    multipartTypedOutput.addPart("origin_file", new TypedFile("image/jpeg", file3));
                    multipartTypedOutput.addPart("avatar_file", new TypedFile("image/jpeg", LIZLLL));
                    ((KtvDigitAvatarApi) C88306Kqq.LIZ().LIZ(KtvDigitAvatarApi.class)).uploadImage4Audit(j, multipartTypedOutput).compose(C100839PnV.LIZJ()).subscribe(new C80433Hn9(this), new C80445HnL<>(this));
                } else {
                    StringBuilder sb = new StringBuilder("originFile is null (");
                    if (file3 == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    sb.append(z);
                    sb.append(") or avatarFile is null (");
                    if (LIZLLL == null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    sb.append(z2);
                    sb.append(").");
                    LIZ(sb.toString());
                }
            }
        }
        C87308Kak<Boolean> c87308Kak = AbstractC80293Hkt.f7150dS;
        Intrinsics.checkNotNullExpressionValue(c87308Kak, "");
        Boolean LIZ4 = c87308Kak.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ4, "");
        if (LIZ4.booleanValue()) {
            C87308Kak<Boolean> c87308Kak2 = AbstractC80293Hkt.f7150dS;
            Intrinsics.checkNotNullExpressionValue(c87308Kak2, "");
            c87308Kak2.LIZ(Boolean.FALSE);
        }
        C78757H2x c78757H2x = C78757H2x.LIZIZ;
        boolean LIZIZ3 = C423702pg.LIZIZ(this.LIZLLL, false);
        LinearLayout linearLayout = (LinearLayout) LIZ(2131175499);
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        boolean isSelected = linearLayout.isSelected();
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(LIZIZ3 ? (byte) 1 : (byte) 0), Byte.valueOf(isSelected ? (byte) 1 : (byte) 0)}, c78757H2x, C78757H2x.LIZ, false, 9).isSupported) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            c78757H2x.LIZ(linkedHashMap, LIZIZ3);
            linkedHashMap.put("avatar_type", "undefault");
            if (isSelected) {
                str = "on";
            } else {
                str = "off";
            }
            linkedHashMap.put("is_emoji_allow", str);
            C4574547f.LIZ().LIZ("livesdk_anchor_audinece_connection_avatar_model_confirm_click", linkedHashMap, C8668v.class, Room.class);
        }
        dismissAllowingStateLoss();
    }

    private final void LIZIZ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 27).isSupported) {
            return;
        }
        ((TextView) LIZ(2131182035)).setText(i);
    }

    public final void LIZ(Sticker sticker) {
        if (PatchProxy.proxy(new Object[]{sticker}, this, LIZ, false, 24).isSupported) {
            return;
        }
        if (this.LJIILL) {
            AbstractC4169j abstractC4169j = this.LJIIZILJ;
            if (abstractC4169j == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            abstractC4169j.LIZ("livedigitavatar", sticker);
            return;
        }
        this.LJIILJJIL = sticker;
    }

    public final void LIZIZ(AvatarGender avatarGender) {
        if (PatchProxy.proxy(new Object[]{avatarGender}, this, LIZ, false, 21).isSupported) {
            return;
        }
        LJIILLIIL();
        LIZIZ(2131584651);
        LIZ("start download sticker: [" + avatarGender + "] avatar sticker[id:" + avatarGender.LIZ() + LoggerUtil.M_RIGHT_TAG);
        this.LJIL = new C80431Hn7(this, avatarGender);
        C80432Hn8.LIZ(avatarGender, this.LJIL);
    }

    public final void LIZIZ(File file) {
        if (PatchProxy.proxy(new Object[]{file}, this, LIZ, false, 18).isSupported) {
            return;
        }
        LIZ("send message to effect to start recognition");
        DigitAvatarMsgController digitAvatarMsgController = this.LJIIIIZZ;
        if (digitAvatarMsgController == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        digitAvatarMsgController.LIZ(file);
    }

    public void LIZ(DigitAvatarMsgController.AvatarStickerType avatarStickerType) {
        if (PatchProxy.proxy(new Object[]{avatarStickerType}, this, LIZ, false, 9).isSupported) {
            return;
        }
        C106862S5w.LIZ(avatarStickerType);
        if (avatarStickerType == DigitAvatarMsgController.AvatarStickerType.DigitAvatar) {
            SettingKey<Boolean> settingKey = LiveConfigSettingKeys.LIVE_DIGIT_AVATAR_RECOGNITION_OPEN_CAMERA_ENABLE;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            Boolean value = settingKey.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "");
            if (value.booleanValue() && C144451eWj.LIZ(getContext(), "android.permission.CAMERA")) {
                AbstractC80428Hn4 abstractC80428Hn4 = this.LJFF;
                if (abstractC80428Hn4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                abstractC80428Hn4.LIZ();
                return;
            }
            StringBuilder sb = new StringBuilder("recognition can not open camera: ");
            sb.append("enable=");
            SettingKey<Boolean> settingKey2 = LiveConfigSettingKeys.LIVE_DIGIT_AVATAR_RECOGNITION_OPEN_CAMERA_ENABLE;
            Intrinsics.checkNotNullExpressionValue(settingKey2, "");
            sb.append(settingKey2.getValue());
            ALogger.m15795w("KtvDigitAvatar", sb.toString());
        }
    }

    @Override // com.bytedance.android.livesdk.C9078n, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        Serializable serializable;
        if (PatchProxy.proxy(new Object[]{bundle}, this, LIZ, false, 7).isSupported) {
            return;
        }
        super.onCreate(bundle);
        setStyle(2, getTheme());
        Bundle arguments = getArguments();
        if (arguments != null) {
            serializable = arguments.getSerializable("rec_type");
        } else {
            serializable = null;
        }
        if (!(serializable instanceof RecognitionType)) {
            serializable = null;
        }
        RecognitionType recognitionType = (RecognitionType) serializable;
        if (recognitionType == null) {
            recognitionType = RecognitionType.PHOTO;
        }
        this.LIZJ = recognitionType;
        AbstractC80428Hn4 createDigitAvatarPreView = ((IBroadcastService) ServiceManager.getService(IBroadcastService.class)).createDigitAvatarPreView(getContext());
        Intrinsics.checkNotNullExpressionValue(createDigitAvatarPreView, "");
        this.LJFF = createDigitAvatarPreView;
        AbstractC80428Hn4 abstractC80428Hn4 = this.LJFF;
        if (abstractC80428Hn4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        this.f26306LJ = abstractC80428Hn4.getLiveStream();
        this.LJIIZILJ = C4173o.LJIIJ.LIZ(LiveEffectContextFactory.Type.DIGIT_AVATAR).LJII();
        AbstractC80428Hn4 abstractC80428Hn42 = this.LJFF;
        if (abstractC80428Hn42 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        abstractC80428Hn42.LIZ(this.LJIJJ);
        AbstractC5436a abstractC5436a = this.f26306LJ;
        if (abstractC5436a == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        DigitAvatarMsgController digitAvatarMsgController = new DigitAvatarMsgController(abstractC5436a);
        digitAvatarMsgController.LIZIZ = this.LJIJI;
        this.LJIIIIZZ = digitAvatarMsgController;
        AbstractC81969ISl createImagePicker = ((ILiveSDKService) ServiceManager.getService(ILiveSDKService.class)).createImagePicker(getActivity(), this, "KtvDigitAvatarRecognitionImagePicker", 10, 15, 360, 640, new C80435HnB(this), null, ".png");
        Intrinsics.checkNotNullExpressionValue(createImagePicker, "");
        this.LJIILLIIL = createImagePicker;
        StringBuilder sb = new StringBuilder("KtvDigitAvatarRecognitionDialog: recType=");
        RecognitionType recognitionType2 = this.LIZJ;
        if (recognitionType2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        sb.append(recognitionType2);
        LIZ(sb.toString());
        RecognitionType recognitionType3 = this.LIZJ;
        if (recognitionType3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (recognitionType3 != RecognitionType.RESULT) {
            HH8 hh8 = HH8.LIZIZ;
            RecognitionType recognitionType4 = this.LIZJ;
            if (recognitionType4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            String name = recognitionType4.name();
            if (!PatchProxy.proxy(new Object[]{name}, hh8, HH8.LIZ, false, 195).isSupported) {
                C106862S5w.LIZ(name);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("type", name);
                HH8.LIZ("digit_avatar_start_recognition", (Map) linkedHashMap, false, 4, (Object) null);
            }
        }
    }

    public final void LIZ(File file) {
        if (PatchProxy.proxy(new Object[]{file}, this, LIZ, false, 15).isSupported) {
            return;
        }
        this.LJIIIZ = file;
        LJIILLIIL();
        if (!this.LJIIJJI) {
            LIZ("image picked, but not ready. so waiting for ready");
            LIZIZ(2131584649);
            return;
        }
        LIZ("image picked, and recognition sticker ready");
        LIZIZ(2131584635);
        LIZIZ(file);
    }

    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 32).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        ALogger.m15797i("KtvDigitAvatar", str);
    }

    public final void LIZ(String str, AvatarGender avatarGender) {
        this.LJIIJ = str;
        this.LJIJ = avatarGender;
    }

    private final void LIZ(RecognitionType recognitionType, Function0<Unit> function0) {
        if (PatchProxy.proxy(new Object[]{recognitionType, function0}, this, LIZ, false, 28).isSupported) {
            return;
        }
        FrameLayout frameLayout = (FrameLayout) LIZ(2131196169);
        Intrinsics.checkNotNullExpressionValue(frameLayout, "");
        LK1.LIZJ(frameLayout);
        SettingKey<C6849bf> settingKey = LiveSettingKeys.LIVE_KTV_AVATAR_RESOURCE_CONFIG;
        Intrinsics.checkNotNullExpressionValue(settingKey, "");
        ((SimpleDraweeView) LIZ(2131166224)).setImageURI(settingKey.getValue().LIZJ());
        if (recognitionType == RecognitionType.CAMERA) {
            TextView textView = (TextView) LIZ(2131166227);
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setText(LK5.LIZ(2131584626));
            TextView textView2 = (TextView) LIZ(2131166225);
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setText(LK5.LIZ(2131584622));
        } else {
            TextView textView3 = (TextView) LIZ(2131166227);
            Intrinsics.checkNotNullExpressionValue(textView3, "");
            textView3.setText(LK5.LIZ(2131584627));
            TextView textView4 = (TextView) LIZ(2131166225);
            Intrinsics.checkNotNullExpressionValue(textView4, "");
            textView4.setText(LK5.LIZ(2131584623));
        }
        ((ImageView) LIZ(2131166223)).setOnClickListener(new View$OnClickListenerC80451HnR(this));
        ((LinearLayout) LIZ(2131166226)).setOnClickListener(new View$OnClickListenerC80453HnT(this));
        ((TextView) LIZ(2131166225)).setOnClickListener(new View$OnClickListenerC78920H9e(this, function0));
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x015a, code lost:
        if (r1 == com.bytedance.android.live.liveinteract.digitavatar.DigitAvatarRecognitionDialog.RecognitionType.PHOTO) goto L63;
     */
    @Override // com.bytedance.android.livesdk.C9078n, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onViewCreated(android.view.View r10, android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.digitavatar.DigitAvatarRecognitionDialog.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent}, this, LIZ, false, 14).isSupported) {
            return;
        }
        super.onActivityResult(i, i2, intent);
        AbstractC81969ISl abstractC81969ISl = this.LJIILLIIL;
        if (abstractC81969ISl == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        abstractC81969ISl.LIZ(i, i2, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, bundle}, this, LIZ, false, 10);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        C106862S5w.LIZ(layoutInflater);
        return C116971W2r.LIZ(layoutInflater, 2131698770, viewGroup, false);
    }
}
