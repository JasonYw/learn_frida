package com.bytedance.android.live.liveinteract.widget.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.config.C6936ds;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.HYC;
import p003X.LK5;
import p003X.M0Q;

/* loaded from: classes3.dex */
public final class PkResultConsecutiveVictoryInfoLayout extends ConstraintLayout {
    public static ChangeQuickRedirect LIZ;
    public HashMap LIZIZ;

    static {
        Covode.recordClassIndex(31951);
    }

    public final View LIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 6);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (this.LIZIZ == null) {
            this.LIZIZ = new HashMap();
        }
        View view = (View) this.LIZIZ.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.LIZIZ.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    private final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        C116971W2r.LIZ(LayoutInflater.from(getContext()), 2131700490, (ViewGroup) this, true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PkResultConsecutiveVictoryInfoLayout(Context context) {
        super(context);
        C106862S5w.LIZ(context);
        LIZ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PkResultConsecutiveVictoryInfoLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C106862S5w.LIZ(context);
        LIZ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PkResultConsecutiveVictoryInfoLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        LIZ();
    }

    public final void LIZ(LinkCrossRoomDataHolder.PkResult pkResult, long j, long j2) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        if (PatchProxy.proxy(new Object[]{pkResult, new Long(j), new Long(j2)}, this, LIZ, false, 2).isSupported) {
            return;
        }
        if (pkResult != null) {
            int i = HYC.LIZ[pkResult.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    if (j2 > 99) {
                        TextView textView = (TextView) LIZ(2131193812);
                        Intrinsics.checkNotNullExpressionValue(textView, "");
                        textView.setText(LK5.LIZ(2131584308));
                    } else {
                        TextView textView2 = (TextView) LIZ(2131193812);
                        Intrinsics.checkNotNullExpressionValue(textView2, "");
                        textView2.setText(LK5.LIZ(2131584310, Long.valueOf(j2)));
                    }
                    FrameLayout frameLayout = (FrameLayout) LIZ(2131178060);
                    Intrinsics.checkNotNullExpressionValue(frameLayout, "");
                    frameLayout.setVisibility(0);
                    FrameLayout frameLayout2 = (FrameLayout) LIZ(2131176163);
                    Intrinsics.checkNotNullExpressionValue(frameLayout2, "");
                    frameLayout2.setVisibility(8);
                    return;
                }
            } else {
                HSImageView hSImageView = (HSImageView) LIZ(2131178782);
                Intrinsics.checkNotNullExpressionValue(hSImageView, "");
                int i2 = (int) (j2 + 1);
                if (!PatchProxy.proxy(new Object[]{hSImageView, Integer.valueOf(i2), new Long(j)}, this, LIZ, false, 3).isSupported) {
                    String str6 = null;
                    if (i2 < 10) {
                        SettingKey<Map<Long, C6936ds>> settingKey = LiveConfigSettingKeys.LIVE_PK_SKIN_PACKAGE;
                        Intrinsics.checkNotNullExpressionValue(settingKey, "");
                        Map<Long, C6936ds> value = settingKey.getValue();
                        if (value != null && !value.isEmpty()) {
                            SettingKey<Map<Long, C6936ds>> settingKey2 = LiveConfigSettingKeys.LIVE_PK_SKIN_PACKAGE;
                            Intrinsics.checkNotNullExpressionValue(settingKey2, "");
                            C6936ds c6936ds = settingKey2.getValue().get(Long.valueOf(j));
                            if (c6936ds != null) {
                                str5 = c6936ds.LJJIJ;
                            } else {
                                str5 = null;
                            }
                            if (str5 != null && str5.length() != 0) {
                                SettingKey<Map<Long, C6936ds>> settingKey3 = LiveConfigSettingKeys.LIVE_PK_SKIN_PACKAGE;
                                Intrinsics.checkNotNullExpressionValue(settingKey3, "");
                                C6936ds c6936ds2 = settingKey3.getValue().get(Long.valueOf(j));
                                if (c6936ds2 != null) {
                                    str6 = c6936ds2.LJJIJ;
                                }
                                M0Q.LIZ(hSImageView, str6);
                            }
                        }
                        hSImageView.setImageResource(2130855057);
                    } else if (i2 < 25) {
                        SettingKey<Map<Long, C6936ds>> settingKey4 = LiveConfigSettingKeys.LIVE_PK_SKIN_PACKAGE;
                        Intrinsics.checkNotNullExpressionValue(settingKey4, "");
                        Map<Long, C6936ds> value2 = settingKey4.getValue();
                        if (value2 != null && !value2.isEmpty()) {
                            SettingKey<Map<Long, C6936ds>> settingKey5 = LiveConfigSettingKeys.LIVE_PK_SKIN_PACKAGE;
                            Intrinsics.checkNotNullExpressionValue(settingKey5, "");
                            C6936ds c6936ds3 = settingKey5.getValue().get(Long.valueOf(j));
                            if (c6936ds3 != null) {
                                str4 = c6936ds3.LJJIJIIJI;
                            } else {
                                str4 = null;
                            }
                            if (str4 != null && str4.length() != 0) {
                                SettingKey<Map<Long, C6936ds>> settingKey6 = LiveConfigSettingKeys.LIVE_PK_SKIN_PACKAGE;
                                Intrinsics.checkNotNullExpressionValue(settingKey6, "");
                                C6936ds c6936ds4 = settingKey6.getValue().get(Long.valueOf(j));
                                if (c6936ds4 != null) {
                                    str6 = c6936ds4.LJJIJIIJI;
                                }
                                M0Q.LIZ(hSImageView, str6);
                            }
                        }
                        hSImageView.setImageResource(2130855062);
                    } else if (i2 < 50) {
                        SettingKey<Map<Long, C6936ds>> settingKey7 = LiveConfigSettingKeys.LIVE_PK_SKIN_PACKAGE;
                        Intrinsics.checkNotNullExpressionValue(settingKey7, "");
                        Map<Long, C6936ds> value3 = settingKey7.getValue();
                        if (value3 != null && !value3.isEmpty()) {
                            SettingKey<Map<Long, C6936ds>> settingKey8 = LiveConfigSettingKeys.LIVE_PK_SKIN_PACKAGE;
                            Intrinsics.checkNotNullExpressionValue(settingKey8, "");
                            C6936ds c6936ds5 = settingKey8.getValue().get(Long.valueOf(j));
                            if (c6936ds5 != null) {
                                str3 = c6936ds5.LJJIJIIJIL;
                            } else {
                                str3 = null;
                            }
                            if (str3 != null && str3.length() != 0) {
                                SettingKey<Map<Long, C6936ds>> settingKey9 = LiveConfigSettingKeys.LIVE_PK_SKIN_PACKAGE;
                                Intrinsics.checkNotNullExpressionValue(settingKey9, "");
                                C6936ds c6936ds6 = settingKey9.getValue().get(Long.valueOf(j));
                                if (c6936ds6 != null) {
                                    str6 = c6936ds6.LJJIJIIJIL;
                                }
                                M0Q.LIZ(hSImageView, str6);
                            }
                        }
                        hSImageView.setImageResource(2130855059);
                    } else if (i2 < 99) {
                        SettingKey<Map<Long, C6936ds>> settingKey10 = LiveConfigSettingKeys.LIVE_PK_SKIN_PACKAGE;
                        Intrinsics.checkNotNullExpressionValue(settingKey10, "");
                        Map<Long, C6936ds> value4 = settingKey10.getValue();
                        if (value4 != null && !value4.isEmpty()) {
                            SettingKey<Map<Long, C6936ds>> settingKey11 = LiveConfigSettingKeys.LIVE_PK_SKIN_PACKAGE;
                            Intrinsics.checkNotNullExpressionValue(settingKey11, "");
                            C6936ds c6936ds7 = settingKey11.getValue().get(Long.valueOf(j));
                            if (c6936ds7 != null) {
                                str2 = c6936ds7.LJJIJIL;
                            } else {
                                str2 = null;
                            }
                            if (str2 != null && str2.length() != 0) {
                                SettingKey<Map<Long, C6936ds>> settingKey12 = LiveConfigSettingKeys.LIVE_PK_SKIN_PACKAGE;
                                Intrinsics.checkNotNullExpressionValue(settingKey12, "");
                                C6936ds c6936ds8 = settingKey12.getValue().get(Long.valueOf(j));
                                if (c6936ds8 != null) {
                                    str6 = c6936ds8.LJJIJIL;
                                }
                                M0Q.LIZ(hSImageView, str6);
                            }
                        }
                        hSImageView.setImageResource(2130855061);
                    } else {
                        SettingKey<Map<Long, C6936ds>> settingKey13 = LiveConfigSettingKeys.LIVE_PK_SKIN_PACKAGE;
                        Intrinsics.checkNotNullExpressionValue(settingKey13, "");
                        Map<Long, C6936ds> value5 = settingKey13.getValue();
                        if (value5 != null && !value5.isEmpty()) {
                            SettingKey<Map<Long, C6936ds>> settingKey14 = LiveConfigSettingKeys.LIVE_PK_SKIN_PACKAGE;
                            Intrinsics.checkNotNullExpressionValue(settingKey14, "");
                            C6936ds c6936ds9 = settingKey14.getValue().get(Long.valueOf(j));
                            if (c6936ds9 != null) {
                                str = c6936ds9.LJJIJL;
                            } else {
                                str = null;
                            }
                            if (str != null && str.length() != 0) {
                                SettingKey<Map<Long, C6936ds>> settingKey15 = LiveConfigSettingKeys.LIVE_PK_SKIN_PACKAGE;
                                Intrinsics.checkNotNullExpressionValue(settingKey15, "");
                                C6936ds c6936ds10 = settingKey15.getValue().get(Long.valueOf(j));
                                if (c6936ds10 != null) {
                                    str6 = c6936ds10.LJJIJL;
                                }
                                M0Q.LIZ(hSImageView, str6);
                            }
                        }
                        hSImageView.setImageResource(2130855058);
                    }
                }
                if (j2 >= 99) {
                    TextView textView3 = (TextView) LIZ(2131193808);
                    Intrinsics.checkNotNullExpressionValue(textView3, "");
                    textView3.setText(LK5.LIZ(2131584307));
                } else {
                    TextView textView4 = (TextView) LIZ(2131193808);
                    Intrinsics.checkNotNullExpressionValue(textView4, "");
                    textView4.setText(LK5.LIZ(2131584309, Integer.valueOf(i2)));
                }
                FrameLayout frameLayout3 = (FrameLayout) LIZ(2131176163);
                Intrinsics.checkNotNullExpressionValue(frameLayout3, "");
                frameLayout3.setVisibility(0);
                FrameLayout frameLayout4 = (FrameLayout) LIZ(2131178060);
                Intrinsics.checkNotNullExpressionValue(frameLayout4, "");
                frameLayout4.setVisibility(8);
                return;
            }
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) LIZ(2131196923);
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(8);
    }
}
