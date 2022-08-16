package com.bytedance.android.live.broadcast.widget;

import android.net.Uri;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.broadcast.api.model.RoomCreateInfo;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import p003X.C3KQ;
import p003X.M0Q;

/* loaded from: classes12.dex */
public final class PreviewInfoBarWidget$onCreate$1 extends Lambda implements Function1<RoomCreateInfo, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ PreviewInfoBarWidget this$0;

    static {
        Covode.recordClassIndex(18542);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreviewInfoBarWidget$onCreate$1(PreviewInfoBarWidget previewInfoBarWidget) {
        super(1);
        this.this$0 = previewInfoBarWidget;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(RoomCreateInfo roomCreateInfo) {
        ImageModel imageModel;
        String str;
        String str2;
        String str3;
        RoomCreateInfo roomCreateInfo2 = roomCreateInfo;
        if (!PatchProxy.proxy(new Object[]{roomCreateInfo2}, this, changeQuickRedirect, false, 1).isSupported) {
            PreviewInfoBarWidget previewInfoBarWidget = this.this$0;
            if (!PatchProxy.proxy(new Object[]{roomCreateInfo2}, previewInfoBarWidget, PreviewInfoBarWidget.LIZ, false, 3).isSupported && roomCreateInfo2 != null) {
                TextView textView = previewInfoBarWidget.LIZJ;
                Integer num = null;
                if (textView != null) {
                    C3KQ c3kq = roomCreateInfo2.LJIIZILJ;
                    if (c3kq != null) {
                        str3 = c3kq.LIZIZ;
                    } else {
                        str3 = null;
                    }
                    textView.setText(str3);
                }
                TextView textView2 = previewInfoBarWidget.LIZLLL;
                if (textView2 != null) {
                    C3KQ c3kq2 = roomCreateInfo2.LJIIZILJ;
                    if (c3kq2 != null) {
                        str2 = c3kq2.LIZJ;
                    } else {
                        str2 = null;
                    }
                    textView2.setText(str2);
                }
                HSImageView hSImageView = previewInfoBarWidget.LIZIZ;
                C3KQ c3kq3 = roomCreateInfo2.LJIIZILJ;
                if (c3kq3 != null) {
                    imageModel = c3kq3.LIZ;
                } else {
                    imageModel = null;
                }
                M0Q.LIZ((ImageView) hSImageView, imageModel);
                C3KQ c3kq4 = roomCreateInfo2.LJIIZILJ;
                if (c3kq4 != null) {
                    str = c3kq4.LIZLLL;
                } else {
                    str = null;
                }
                previewInfoBarWidget.f25989LJ = str;
                String str4 = previewInfoBarWidget.f25989LJ;
                if (str4 != null) {
                    String queryParameter = Uri.parse(str4).getQueryParameter("tab");
                    if (queryParameter != null) {
                        num = StringsKt__StringNumberConversionsKt.toIntOrNull(queryParameter);
                    }
                    PatchProxyResult proxy = PatchProxy.proxy(new Object[]{num}, previewInfoBarWidget, PreviewInfoBarWidget.LIZ, false, 7);
                    String str5 = "";
                    if (proxy.isSupported) {
                        str5 = (String) proxy.result;
                    } else if (num != null) {
                        int intValue = num.intValue();
                        if (intValue != 1) {
                            if (intValue != 2) {
                                if (intValue == 3) {
                                    str5 = "anchor_mission";
                                }
                            } else {
                                str5 = "flow_support";
                            }
                        } else {
                            str5 = "live_tips";
                        }
                    }
                    previewInfoBarWidget.LJFF = str5;
                }
            }
        }
        return Unit.INSTANCE;
    }
}
