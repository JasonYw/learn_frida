package com.bytedance.android.live.broadcast.widget;

import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.model.C2910f;
import com.bytedance.android.live.broadcast.api.model.RoomCreateInfo;
import com.bytedance.android.live.browser.IBrowserService;
import com.bytedance.android.live.core.log.ALogger;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.C9078n;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.event.C7068i;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.generic.GenericDraweeHierarchy;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import p003X.AbstractC100934Pp2;
import p003X.C109391T5d;
import p003X.C427822wK;
import p003X.C87010KQi;
import p003X.KNN;
import p003X.LK5;
import p003X.M0O;

/* loaded from: classes5.dex */
public final class PreviewCoverPickerWidget$realInit$2 extends Lambda implements Function1<RoomCreateInfo, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PreviewCoverPickerWidget this$0;

    static {
        Covode.recordClassIndex(18482);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewCoverPickerWidget$realInit$2(PreviewCoverPickerWidget previewCoverPickerWidget) {
        super(1);
        this.this$0 = previewCoverPickerWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(RoomCreateInfo roomCreateInfo) {
        C2910f c2910f;
        Uri parse;
        String queryParameter;
        Integer intOrNull;
        Integer intOrNull2;
        String str;
        byte b;
        RoomCreateInfo roomCreateInfo2 = roomCreateInfo;
        if (!PatchProxy.proxy(new Object[]{roomCreateInfo2}, this, changeQuickRedirect, false, 1).isSupported) {
            if (roomCreateInfo2 != null && !this.this$0.LJIIJJI) {
                KNN knn = this.this$0.LJIIIZ;
                if (knn != null) {
                    int i = (int) roomCreateInfo2.LIZLLL;
                    ImageModel imageModel = roomCreateInfo2.LIZJ;
                    if (roomCreateInfo2.LJII == 1) {
                        b = 1;
                    } else {
                        b = 0;
                    }
                    if (!PatchProxy.proxy(new Object[]{Integer.valueOf(i), imageModel, Byte.valueOf(b)}, knn, KNN.LIZ, false, 2).isSupported) {
                        knn.LIZ();
                        if (i != 0) {
                            if (i != 1) {
                                knn.LIZJ.setText(LK5.LIZ(2131585167));
                                knn.LIZJ.setAlpha(0.64f);
                            } else {
                                knn.LIZJ.setText(LK5.LIZ(2131585168));
                                knn.LIZJ.setAlpha(1.0f);
                                if (LiveSettingKeys.ENABLE_BITMAP_CROP.getValue().booleanValue()) {
                                    knn.LIZ(knn.LIZIZ, imageModel);
                                } else {
                                    M0O.LIZIZ(knn.LIZIZ, imageModel);
                                }
                                if (knn.LJIIJ != null) {
                                    knn.LJIIJ.f8443LJ = imageModel;
                                }
                            }
                        } else {
                            knn.LIZJ.setText(LK5.LIZ(2131587159));
                            knn.LIZJ.setAlpha(1.0f);
                            if (LiveSettingKeys.ENABLE_BITMAP_CROP.getValue().booleanValue()) {
                                knn.LIZ(knn.LIZIZ, imageModel);
                            } else {
                                M0O.LIZIZ(knn.LIZIZ, imageModel);
                            }
                            if (knn.LJIIJ != null) {
                                knn.LJIIJ.f8443LJ = imageModel;
                            }
                        }
                        ALogger.m15801d("LiveNewCoverController", "handleRemoteCover: status:" + i);
                        if (imageModel != null) {
                            ALogger.m15801d("LiveNewCoverController", "handleRemoteCover: cover:" + imageModel);
                            knn.LJIIIIZZ = KNN.LIZ(imageModel);
                        }
                        if (knn.LJIIIZ != null && knn.LJIIIIZZ != null) {
                            knn.LJIIIZ.LJIIIZ().LIZ(Integer.valueOf(i));
                            knn.LJIIIZ.LJIIIIZZ().LIZ(knn.LJIIIIZZ);
                        }
                        if (b != 0) {
                            IUser LIZ = ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZ();
                            if (LIZ instanceof User) {
                                knn.LIZJ.setText(LK5.LIZ(2131585168));
                                if (LiveSettingKeys.ENABLE_BITMAP_CROP.getValue().booleanValue()) {
                                    knn.LIZ(knn.LIZIZ, LIZ.getAvatarLarge());
                                } else {
                                    M0O.LIZIZ(knn.LIZIZ, LIZ.getAvatarLarge());
                                }
                                if (knn.LJIIIZ != null) {
                                    knn.LJIIIIZZ = KNN.LIZ(LIZ.getAvatarLarge());
                                    knn.LJIIIZ.LJIIIZ().LIZ(Integer.valueOf(i));
                                    if (knn.LJIIIIZZ != null) {
                                        knn.LJIIIZ.LJIIIIZZ().LIZ(knn.LJIIIIZZ);
                                    }
                                }
                                if (knn.LJIIJ != null) {
                                    knn.LJIIJ.f8443LJ = LIZ.getAvatarThumb();
                                }
                                knn.LJIIIIZZ = KNN.LIZ(LIZ.getAvatarThumb());
                            }
                        } else if (imageModel == null) {
                            knn.LIZJ.setText(LK5.LIZ(2131585167));
                            knn.LIZIZ.setScaleType(ImageView.ScaleType.FIT_XY);
                            GenericDraweeHierarchy hierarchy = knn.LIZIZ.getHierarchy();
                            if (hierarchy != null) {
                                hierarchy.setActualImageScaleType(ScalingUtils.ScaleType.FIT_XY);
                                knn.LIZIZ.setHierarchy(hierarchy);
                            }
                            knn.LIZ();
                        }
                        C7068i c7068i = new C7068i();
                        c7068i.LIZ = 2;
                        C87010KQi.LIZ().LIZ(c7068i);
                    }
                }
                PreviewCoverPickerWidget previewCoverPickerWidget = this.this$0;
                long j = roomCreateInfo2.LJIILJJIL;
                if (!PatchProxy.proxy(new Object[]{new Long(j)}, previewCoverPickerWidget, PreviewCoverPickerWidget.LJFF, false, 15).isSupported) {
                    long j2 = 2;
                    if (j != 2) {
                        j2 = 1;
                    }
                    KNN knn2 = previewCoverPickerWidget.LJIIIZ;
                    if (knn2 != null) {
                        knn2.LIZ(j2);
                    }
                    previewCoverPickerWidget.LIZLLL().LJIJI().LIZ(Long.valueOf(j2));
                }
                this.this$0.LJIIJJI = true;
            }
            PreviewCoverPickerWidget previewCoverPickerWidget2 = this.this$0;
            if (!PatchProxy.proxy(new Object[]{roomCreateInfo2}, previewCoverPickerWidget2, PreviewCoverPickerWidget.LJFF, false, 10).isSupported && roomCreateInfo2 != null && (c2910f = roomCreateInfo2.LJI) != null && c2910f.f25779LJ != null && c2910f.f25779LJ.LIZ) {
                SettingKey<String> settingKey = LiveConfigSettingKeys.LIVE_NOTICE_URL;
                Intrinsics.checkNotNullExpressionValue(settingKey, "");
                String value = settingKey.getValue();
                if (value != null && value.length() != 0 && (parse = Uri.parse(value)) != null && (queryParameter = parse.getQueryParameter("width")) != null && (intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(queryParameter)) != null) {
                    int intValue = intOrNull.intValue();
                    String queryParameter2 = parse.getQueryParameter(C109391T5d.LJFF);
                    if (queryParameter2 != null && (intOrNull2 = StringsKt__StringNumberConversionsKt.toIntOrNull(queryParameter2)) != null) {
                        int intValue2 = intOrNull2.intValue();
                        Uri.Builder builder = new Uri.Builder();
                        Uri.Builder path = builder.scheme(parse.getScheme()).authority(parse.getAuthority()).path(parse.getPath());
                        if (previewCoverPickerWidget2.LJIIIIZZ) {
                            str = "live";
                        } else {
                            str = "upload";
                        }
                        path.appendQueryParameter("type", str).build();
                        String builder2 = builder.toString();
                        Intrinsics.checkNotNullExpressionValue(builder2, "");
                        C9078n c9078n = previewCoverPickerWidget2.LJIIJ;
                        if (c9078n != null) {
                            c9078n.dismissAllowingStateLoss();
                        }
                        AbstractC100934Pp2 buildWebDialog = ((IBrowserService) ServiceManager.getService(IBrowserService.class)).buildWebDialog(builder2);
                        buildWebDialog.LIZJ(intValue);
                        buildWebDialog.LIZLLL(intValue2);
                        buildWebDialog.LJI(17);
                        previewCoverPickerWidget2.LJIIJ = buildWebDialog.LIZ();
                        if (previewCoverPickerWidget2.LJIIJ != null) {
                            C427822wK c427822wK = C9078n.LJJIJLIJ;
                            Context context = previewCoverPickerWidget2.getContext();
                            if (context != null) {
                                c427822wK.LIZ((FragmentActivity) context, previewCoverPickerWidget2.LJIIJ);
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
                            }
                        }
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
