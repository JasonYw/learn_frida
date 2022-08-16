package com.bytedance.android.live.liveinteract.paidlink.profilecard;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.data.C4285g;
import com.bytedance.android.live.liveinteract.interact.audience.p362ui.StarView;
import com.bytedance.android.live.liveinteract.paidlink.profilecard.C4722a;
import com.bytedance.android.live.p482ui.PingFangSCTextView;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.widget.RoomWidget;
import com.bytedance.android.livesdk.log.model.C8668v;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC4569445g;
import p003X.C2WD;
import p003X.C409882Kg;
import p003X.C4574547f;
import p003X.C478994wf;
import p003X.C79046HEa;
import p003X.View$OnClickListenerC78353Guh;
import p003X.View$OnClickListenerC78356Guk;

/* loaded from: classes3.dex */
public final class PaidProfileCardWidget extends RoomWidget implements AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public C4285g LIZIZ;
    public C478994wf LIZJ;

    static {
        Covode.recordClassIndex(28883);
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 8).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    public PaidProfileCardWidget() {
        C4285g c4285g;
        C2WD<C4285g> LIZJ;
        C4722a LIZ2 = C4722a.LIZJ.LIZ();
        if (LIZ2 != null && (LIZJ = LIZ2.LIZJ()) != null) {
            c4285g = LIZJ.LIZ();
        } else {
            c4285g = null;
        }
        this.LIZIZ = c4285g;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onDestroy() {
        MethodCollector.m14708i(1985);
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 7).isSupported) {
            MethodCollector.m14707o(1985);
            return;
        }
        super.onDestroy();
        C478994wf c478994wf = this.LIZJ;
        if (c478994wf != null) {
            this.containerView.removeView(c478994wf);
            this.LIZJ = null;
            MethodCollector.m14707o(1985);
            return;
        }
        MethodCollector.m14707o(1985);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.4wf, android.view.View] */
    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public final void onCreate() {
        C4722a.C4723b c4723b;
        String str;
        C2WD<C4722a.C4723b> LIZIZ;
        MethodCollector.m14708i(1984);
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            MethodCollector.m14707o(1984);
            return;
        }
        super.onCreate();
        C4722a LIZ2 = C4722a.LIZJ.LIZ();
        if (LIZ2 == null || (LIZIZ = LIZ2.LIZIZ()) == null || (c4723b = LIZIZ.LIZ()) == null) {
            Context context = this.context;
            Intrinsics.checkNotNullExpressionValue(context, "");
            int dimension = (int) context.getResources().getDimension(2131429416);
            Context context2 = this.context;
            Intrinsics.checkNotNullExpressionValue(context2, "");
            c4723b = new C4722a.C4723b(0, 0, dimension, (int) context2.getResources().getDimension(2131429415), 8388693);
        }
        C4285g c4285g = this.LIZIZ;
        if (c4285g == null) {
            MethodCollector.m14707o(1984);
            return;
        }
        final Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "");
        ?? r5 = new FrameLayout(context3) { // from class: X.4wf
            public static ChangeQuickRedirect LIZ;
            public final Integer[] LIZIZ = {2131190393, 2131190394, 2131190395, 2131190396, 2131190397};
            public ImageModel LIZJ;
            public ImageModel LIZLLL;

            /* renamed from: LJ */
            public long f1438LJ;
            public float LJFF;
            public View.OnClickListener LJI;
            public View.OnClickListener LJII;
            public HashMap LJIIIIZZ;

            static {
                Covode.recordClassIndex(27422);
            }

            private View LIZ(int i) {
                PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 10);
                if (proxy.isSupported) {
                    return (View) proxy.result;
                }
                if (this.LJIIIIZZ == null) {
                    this.LJIIIIZZ = new HashMap();
                }
                View view = (View) this.LJIIIIZZ.get(Integer.valueOf(i));
                if (view != null) {
                    return view;
                }
                View findViewById = findViewById(i);
                this.LJIIIIZZ.put(Integer.valueOf(i), findViewById);
                return findViewById;
            }

            @Override // android.view.View
            public final boolean onTouchEvent(MotionEvent motionEvent) {
                return true;
            }

            public final ImageModel getAvatar() {
                return this.LIZLLL;
            }

            public final ImageModel getLabel() {
                return this.LIZJ;
            }

            public final long getNumOfLink() {
                return this.f1438LJ;
            }

            public final View.OnClickListener getOnCloseClickListener() {
                return this.LJII;
            }

            public final View.OnClickListener getOnConfirmClickListener() {
                return this.LJI;
            }

            public final float getScore() {
                return this.LJFF;
            }

            public final Integer[] getStarsId() {
                return this.LIZIZ;
            }

            public final void setAnchor(boolean z) {
                int i;
                if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 1).isSupported) {
                    return;
                }
                PingFangSCTextView pingFangSCTextView = (PingFangSCTextView) LIZ(2131171778);
                Intrinsics.checkNotNullExpressionValue(pingFangSCTextView, "");
                Context context4 = getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "");
                Resources resources = context4.getResources();
                if (z) {
                    i = 2131584432;
                } else {
                    i = 2131584429;
                }
                pingFangSCTextView.setText(resources.getString(i));
            }

            public final void setAvatar(ImageModel imageModel) {
                int i = 0;
                if (PatchProxy.proxy(new Object[]{imageModel}, this, LIZ, false, 3).isSupported) {
                    return;
                }
                this.LIZLLL = imageModel;
                HSImageView hSImageView = (HSImageView) LIZ(2131177453);
                Intrinsics.checkNotNullExpressionValue(hSImageView, "");
                if (imageModel == null) {
                    i = 8;
                }
                hSImageView.setVisibility(i);
                if (imageModel != null) {
                    M0O.LIZ(imageModel).LIZ((HSImageView) LIZ(2131177453));
                }
            }

            public final void setLabel(ImageModel imageModel) {
                int i = 0;
                if (PatchProxy.proxy(new Object[]{imageModel}, this, LIZ, false, 2).isSupported) {
                    return;
                }
                this.LIZJ = imageModel;
                HSImageView hSImageView = (HSImageView) LIZ(2131186522);
                Intrinsics.checkNotNullExpressionValue(hSImageView, "");
                if (imageModel == null) {
                    i = 8;
                }
                hSImageView.setVisibility(i);
                if (imageModel != null) {
                    M0O.LIZ(imageModel).LIZ((HSImageView) LIZ(2131186522));
                }
            }

            public final void setOnCloseClickListener(View.OnClickListener onClickListener) {
                if (PatchProxy.proxy(new Object[]{onClickListener}, this, LIZ, false, 7).isSupported) {
                    return;
                }
                this.LJII = onClickListener;
                ((HSImageView) LIZ(2131177460)).setOnClickListener(onClickListener);
            }

            public final void setOnConfirmClickListener(View.OnClickListener onClickListener) {
                if (PatchProxy.proxy(new Object[]{onClickListener}, this, LIZ, false, 6).isSupported) {
                    return;
                }
                this.LJI = onClickListener;
                ((PingFangSCTextView) LIZ(2131171778)).setOnClickListener(onClickListener);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(context3);
                C106862S5w.LIZ(context3);
                MethodCollector.m14708i(1888);
                LayoutInflater.from(context3).inflate(2131699384, this);
                MethodCollector.m14707o(1888);
            }

            public final void setNumOfLink(long j) {
                int i;
                String string;
                if (PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZ, false, 4).isSupported || j < 0) {
                    return;
                }
                this.f1438LJ = j;
                PingFangSCTextView pingFangSCTextView = (PingFangSCTextView) LIZ(2131171900);
                Intrinsics.checkNotNullExpressionValue(pingFangSCTextView, "");
                if (i != 0) {
                    Context context4 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context4, "");
                    string = context4.getResources().getString(2131584430, Long.valueOf(j));
                } else {
                    Context context5 = getContext();
                    Intrinsics.checkNotNullExpressionValue(context5, "");
                    string = context5.getResources().getString(2131584431);
                }
                pingFangSCTextView.setText(string);
            }

            public final void setScore(float f) {
                if (PatchProxy.proxy(new Object[]{Float.valueOf(f)}, this, LIZ, false, 5).isSupported) {
                    return;
                }
                if (f >= 0.0f && f <= 5.0f) {
                    this.LJFF = f;
                    LIZ(f);
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("log", "score set not within boundary, score " + f);
                HNG.LIZ("ProfileCard", hashMap);
            }

            private final void LIZ(float f) {
                if (PatchProxy.proxy(new Object[]{Float.valueOf(f)}, this, LIZ, false, 8).isSupported) {
                    return;
                }
                for (Integer num : this.LIZIZ) {
                    int intValue = num.intValue();
                    if (f > 0.0f) {
                        if (f < 1.0f) {
                            View findViewById = findViewById(intValue);
                            Intrinsics.checkNotNullExpressionValue(findViewById, "");
                            LIZ((StarView) findViewById, f);
                            f = 0.0f;
                        } else {
                            View findViewById2 = findViewById(intValue);
                            Intrinsics.checkNotNullExpressionValue(findViewById2, "");
                            LIZ((StarView) findViewById2, 1.0f);
                            f -= 1.0f;
                        }
                    } else {
                        return;
                    }
                }
            }

            private final void LIZ(StarView starView, float f) {
                if (PatchProxy.proxy(new Object[]{starView, Float.valueOf(f)}, this, LIZ, false, 9).isSupported) {
                    return;
                }
                starView.setPercent(f);
            }
        };
        r5.setAnchor(c4285g.LIZIZ);
        r5.setLabel(c4285g.LIZJ);
        r5.setAvatar(c4285g.LIZLLL);
        r5.setNumOfLink(c4285g.f26257LJ);
        r5.setScore(c4285g.LJFF);
        r5.setOnCloseClickListener(new View$OnClickListenerC78356Guk(this));
        r5.setOnConfirmClickListener(new View$OnClickListenerC78353Guh(this));
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "");
        int dimension2 = (int) context4.getResources().getDimension(2131429417);
        Context context5 = getContext();
        Intrinsics.checkNotNullExpressionValue(context5, "");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimension2, (int) context5.getResources().getDimension(2131429414));
        layoutParams.leftMargin = c4723b.LIZ;
        layoutParams.topMargin = c4723b.LIZIZ;
        layoutParams.rightMargin = c4723b.LIZJ;
        layoutParams.bottomMargin = c4723b.LIZLLL;
        layoutParams.gravity = c4723b.f26405LJ;
        this.containerView.addView((View) r5, layoutParams);
        this.LIZJ = r5;
        if (!PatchProxy.proxy(new Object[0], this, LIZ, false, 4).isSupported) {
            HashMap hashMap = new HashMap();
            IService service = ServiceManager.getService(IInteractService.class);
            Intrinsics.checkNotNullExpressionValue(service, "");
            hashMap.put("function_type", ((IInteractService) service).getCurrentFunctionType());
            C5923dp LIZ3 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
            if (LIZ3 != null) {
                if (LIZ3.LJIILJJIL().LIZIZ().booleanValue()) {
                    str = "anchor";
                } else {
                    C79046HEa LIZ4 = C79046HEa.LIZ();
                    Intrinsics.checkNotNullExpressionValue(LIZ4, "");
                    Integer num = (Integer) LIZ4.LJJIIZI;
                    if (num != null && num.intValue() == 0) {
                        str = "user";
                    } else {
                        str = "guest";
                    }
                }
                hashMap.put("user_type", str);
            }
            C4574547f.LIZ().LIZ("livesdk_anchor_audience_connection_rechargeable_card_show", hashMap, Room.class, C8668v.class);
        }
        MethodCollector.m14707o(1984);
    }
}
