package com.bytedance.android.live.liveinteract.chatroom.chatroom.interact;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.base.IService;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.chatroom.chatroom.widget.PKListItemShadowView;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.interact.model.C6053g;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.sdk.bridge.p1355js.delegate.JsBridgeDelegate;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.view.DraweeView;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import p003X.C106862S5w;
import p003X.C2IN;
import p003X.C3BL;
import p003X.C4574547f;
import p003X.C79179HJd;
import p003X.C79615HZx;
import p003X.C79783Hcf;
import p003X.C80342Hlg;
import p003X.C88440Kt0;
import p003X.LK5;
import p003X.View$OnClickListenerC79800Hcw;
import p003X.View$OnClickListenerC79801Hcx;
import p003X.View$OnClickListenerC79802Hcy;

/* loaded from: classes3.dex */
public final class PkRandomView extends RelativeLayout {
    public static ChangeQuickRedirect LIZ;
    public AbstractC4310p LIZIZ;
    public final LinkCrossRoomDataHolder LIZJ;
    public final View LIZLLL;

    /* renamed from: LJ */
    public boolean f26269LJ;
    public HashMap LJFF;

    static {
        Covode.recordClassIndex(25629);
    }

    private View LIZ(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 7);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        if (this.LJFF == null) {
            this.LJFF = new HashMap();
        }
        View view = (View) this.LJFF.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.LJFF.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final AbstractC4310p getListener() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (AbstractC4310p) proxy.result;
        }
        AbstractC4310p abstractC4310p = this.LIZIZ;
        if (abstractC4310p == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return abstractC4310p;
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(JsBridgeDelegate.TYPE_EVENT, "random click");
        C79615HZx LIZ2 = C79615HZx.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        hashMap.put("match_state", String.valueOf(LIZ2.LIZJ()));
        Room room = this.LIZJ.LJJJ;
        if (room != null) {
            hashMap.put("targetRoom", room.getIdStr());
        }
        hashMap.put("match_type", String.valueOf(this.LIZJ.LJIJJLI));
        C2IN.LIZIZ().LIZ("ttlive_pk", hashMap);
        IService service = ServiceManager.getService(IInteractService.class);
        Intrinsics.checkNotNullExpressionValue(service, "");
        C3BL interactAudienceService = ((IInteractService) service).getInteractAudienceService();
        Intrinsics.checkNotNullExpressionValue(interactAudienceService, "");
        if (interactAudienceService.LIZIZ() && !C79179HJd.LIZIZ.LIZJ()) {
            C88440Kt0.LIZ(2131584070);
            return;
        }
        if (!PatchProxy.proxy(new Object[0], null, C79783Hcf.LIZ, true, 7).isSupported) {
            HashMap hashMap2 = new HashMap();
            C79783Hcf.LIZ(hashMap2);
            C4574547f.LIZ().LIZ("livesdk_random_pk_match_click", hashMap2, new Object[0]);
        }
        AbstractC4310p abstractC4310p = this.LIZIZ;
        if (abstractC4310p == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        abstractC4310p.LIZ(false);
    }

    public final void setListener(AbstractC4310p abstractC4310p) {
        if (PatchProxy.proxy(new Object[]{abstractC4310p}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC4310p);
        this.LIZIZ = abstractC4310p;
    }

    public PkRandomView(Context context) {
        super(context);
        MethodCollector.m14708i(1736);
        View inflate = LayoutInflater.from(getContext()).inflate(2131699548, this);
        Intrinsics.checkNotNullExpressionValue(inflate, "");
        this.LIZLLL = inflate;
        LinkCrossRoomDataHolder LJII = LinkCrossRoomDataHolder.LJII();
        Intrinsics.checkNotNullExpressionValue(LJII, "");
        this.LIZJ = LJII;
        MethodCollector.m14707o(1736);
    }

    public PkRandomView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m14708i(1737);
        View inflate = LayoutInflater.from(getContext()).inflate(2131699548, this);
        Intrinsics.checkNotNullExpressionValue(inflate, "");
        this.LIZLLL = inflate;
        LinkCrossRoomDataHolder LJII = LinkCrossRoomDataHolder.LJII();
        Intrinsics.checkNotNullExpressionValue(LJII, "");
        this.LIZJ = LJII;
        MethodCollector.m14707o(1737);
    }

    public PkRandomView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        MethodCollector.m14708i(1738);
        View inflate = LayoutInflater.from(getContext()).inflate(2131699548, this);
        Intrinsics.checkNotNullExpressionValue(inflate, "");
        this.LIZLLL = inflate;
        LinkCrossRoomDataHolder LJII = LinkCrossRoomDataHolder.LJII();
        Intrinsics.checkNotNullExpressionValue(LJII, "");
        this.LIZJ = LJII;
        MethodCollector.m14707o(1738);
    }

    public final void LIZ(boolean z, boolean z2, boolean z3, C6053g c6053g) {
        boolean z4;
        ConstraintLayout constraintLayout;
        PKListItemShadowView pKListItemShadowView;
        ConstraintLayout constraintLayout2;
        PKListItemShadowView pKListItemShadowView2;
        ConstraintLayout constraintLayout3;
        PKListItemShadowView pKListItemShadowView3;
        ConstraintLayout constraintLayout4;
        PKListItemShadowView pKListItemShadowView4;
        ConstraintLayout constraintLayout5;
        PKListItemShadowView pKListItemShadowView5;
        ConstraintLayout constraintLayout6;
        PKListItemShadowView pKListItemShadowView6;
        HSImageView hSImageView;
        ConstraintLayout constraintLayout7;
        ConstraintLayout constraintLayout8;
        HSImageView hSImageView2;
        View view;
        DraweeView draweeView;
        PKListItemShadowView pKListItemShadowView7;
        ConstraintLayout constraintLayout9;
        PKListItemShadowView pKListItemShadowView8;
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0), c6053g}, this, LIZ, false, 3).isSupported) {
            return;
        }
        if (c6053g != null && c6053g.LIZLLL > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f26269LJ = z4;
        ConstraintLayout constraintLayout10 = null;
        if (this.f26269LJ && z2) {
            View view2 = this.LIZLLL;
            if (view2 != null) {
                pKListItemShadowView7 = (PKListItemShadowView) view2.findViewById(2131191118);
            } else {
                pKListItemShadowView7 = null;
            }
            Intrinsics.checkNotNullExpressionValue(pKListItemShadowView7, "");
            pKListItemShadowView7.setVisibility(8);
            View view3 = this.LIZLLL;
            if (view3 != null) {
                constraintLayout9 = (ConstraintLayout) view3.findViewById(2131180390);
            } else {
                constraintLayout9 = null;
            }
            Intrinsics.checkNotNullExpressionValue(constraintLayout9, "");
            constraintLayout9.setVisibility(8);
            View view4 = this.LIZLLL;
            if (view4 != null) {
                pKListItemShadowView8 = (PKListItemShadowView) view4.findViewById(2131191122);
            } else {
                pKListItemShadowView8 = null;
            }
            Intrinsics.checkNotNullExpressionValue(pKListItemShadowView8, "");
            pKListItemShadowView8.setVisibility(0);
        } else if (z) {
            if (z2) {
                View view5 = this.LIZLLL;
                if (view5 != null) {
                    constraintLayout5 = (ConstraintLayout) view5.findViewById(2131180464);
                } else {
                    constraintLayout5 = null;
                }
                Intrinsics.checkNotNullExpressionValue(constraintLayout5, "");
                constraintLayout5.setVisibility(0);
                View view6 = this.LIZLLL;
                if (view6 != null) {
                    pKListItemShadowView5 = (PKListItemShadowView) view6.findViewById(2131191118);
                } else {
                    pKListItemShadowView5 = null;
                }
                Intrinsics.checkNotNullExpressionValue(pKListItemShadowView5, "");
                pKListItemShadowView5.setVisibility(0);
                View view7 = this.LIZLLL;
                if (view7 != null) {
                    constraintLayout6 = (ConstraintLayout) view7.findViewById(2131180390);
                } else {
                    constraintLayout6 = null;
                }
                Intrinsics.checkNotNullExpressionValue(constraintLayout6, "");
                constraintLayout6.setVisibility(4);
                View view8 = this.LIZLLL;
                if (view8 != null) {
                    pKListItemShadowView6 = (PKListItemShadowView) view8.findViewById(2131191122);
                } else {
                    pKListItemShadowView6 = null;
                }
                Intrinsics.checkNotNullExpressionValue(pKListItemShadowView6, "");
                pKListItemShadowView6.setVisibility(8);
            } else {
                View view9 = this.LIZLLL;
                if (view9 != null) {
                    constraintLayout3 = (ConstraintLayout) view9.findViewById(2131180464);
                } else {
                    constraintLayout3 = null;
                }
                Intrinsics.checkNotNullExpressionValue(constraintLayout3, "");
                constraintLayout3.setVisibility(4);
                View view10 = this.LIZLLL;
                if (view10 != null) {
                    pKListItemShadowView3 = (PKListItemShadowView) view10.findViewById(2131191118);
                } else {
                    pKListItemShadowView3 = null;
                }
                Intrinsics.checkNotNullExpressionValue(pKListItemShadowView3, "");
                pKListItemShadowView3.setVisibility(4);
                View view11 = this.LIZLLL;
                if (view11 != null) {
                    constraintLayout4 = (ConstraintLayout) view11.findViewById(2131180390);
                } else {
                    constraintLayout4 = null;
                }
                Intrinsics.checkNotNullExpressionValue(constraintLayout4, "");
                constraintLayout4.setVisibility(0);
                View view12 = this.LIZLLL;
                if (view12 != null) {
                    pKListItemShadowView4 = (PKListItemShadowView) view12.findViewById(2131191122);
                } else {
                    pKListItemShadowView4 = null;
                }
                Intrinsics.checkNotNullExpressionValue(pKListItemShadowView4, "");
                pKListItemShadowView4.setVisibility(8);
            }
        } else {
            View view13 = this.LIZLLL;
            if (view13 != null) {
                constraintLayout = (ConstraintLayout) view13.findViewById(2131180464);
            } else {
                constraintLayout = null;
            }
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            constraintLayout.setVisibility(8);
            View view14 = this.LIZLLL;
            if (view14 != null) {
                pKListItemShadowView = (PKListItemShadowView) view14.findViewById(2131191118);
            } else {
                pKListItemShadowView = null;
            }
            Intrinsics.checkNotNullExpressionValue(pKListItemShadowView, "");
            pKListItemShadowView.setVisibility(8);
            View view15 = this.LIZLLL;
            if (view15 != null) {
                constraintLayout2 = (ConstraintLayout) view15.findViewById(2131180390);
            } else {
                constraintLayout2 = null;
            }
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
            constraintLayout2.setVisibility(0);
            View view16 = this.LIZLLL;
            if (view16 != null) {
                pKListItemShadowView2 = (PKListItemShadowView) view16.findViewById(2131191122);
            } else {
                pKListItemShadowView2 = null;
            }
            Intrinsics.checkNotNullExpressionValue(pKListItemShadowView2, "");
            pKListItemShadowView2.setVisibility(8);
        }
        if (!this.f26269LJ && z3 && (view = this.LIZLLL) != null && (draweeView = (DraweeView) view.findViewById(2131166896)) != null) {
            draweeView.setController(Fresco.newDraweeControllerBuilder().mo27962setUri(Uri.parse("https://lf3-webcastcdn-tos.douyinstatic.com/obj/live-android/pk_list_random_emoji_twice.webp")).setAutoPlayAnimations(true).setControllerListener(new C80342Hlg()).mo27965build());
        }
        if (this.f26269LJ) {
            View view17 = this.LIZLLL;
            if (view17 != null) {
                hSImageView2 = (HSImageView) view17.findViewById(2131178918);
            } else {
                hSImageView2 = null;
            }
            Intrinsics.checkNotNullExpressionValue(hSImageView2, "");
            hSImageView2.setVisibility(8);
            if (c6053g != null) {
                String str = c6053g.LIZIZ;
                if (str != null) {
                    TextView textView = (TextView) LIZ(2131195101);
                    Intrinsics.checkNotNullExpressionValue(textView, "");
                    textView.setText(str);
                }
                String str2 = c6053g.LIZJ;
                if (str2 != null) {
                    TextView textView2 = (TextView) LIZ(2131165386);
                    Intrinsics.checkNotNullExpressionValue(textView2, "");
                    textView2.setText(str2);
                }
            }
            if (c6053g != null) {
                Long valueOf = Long.valueOf(c6053g.LIZLLL);
                if (valueOf.longValue() > 0 && valueOf != null) {
                    long longValue = valueOf.longValue();
                    if (longValue >= 60) {
                        int i = (int) longValue;
                        int i2 = i / 60;
                        if (i % 60 != 0) {
                            i2++;
                        }
                        TextView textView3 = (TextView) LIZ(2131195687);
                        Intrinsics.checkNotNullExpressionValue(textView3, "");
                        textView3.setText(String.valueOf(i2));
                        TextView textView4 = (TextView) LIZ(2131195686);
                        Intrinsics.checkNotNullExpressionValue(textView4, "");
                        textView4.setText(LK5.LIZ(2131585793));
                    } else {
                        TextView textView5 = (TextView) LIZ(2131195687);
                        Intrinsics.checkNotNullExpressionValue(textView5, "");
                        textView5.setText(String.valueOf(longValue));
                        TextView textView6 = (TextView) LIZ(2131195686);
                        Intrinsics.checkNotNullExpressionValue(textView6, "");
                        textView6.setText(LK5.LIZ(2131585795));
                    }
                }
            }
            TextView textView7 = (TextView) LIZ(2131195687);
            Intrinsics.checkNotNullExpressionValue(textView7, "");
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "");
            textView7.setTypeface(Typeface.createFromAsset(context.getAssets(), "fonts/clarity_mono_bold.otf"));
        } else {
            View view18 = this.LIZLLL;
            if (view18 != null) {
                hSImageView = (HSImageView) view18.findViewById(2131178918);
            } else {
                hSImageView = null;
            }
            Intrinsics.checkNotNullExpressionValue(hSImageView, "");
            hSImageView.setVisibility(0);
        }
        View view19 = this.LIZLLL;
        if (view19 != null) {
            constraintLayout7 = (ConstraintLayout) view19.findViewById(2131180464);
        } else {
            constraintLayout7 = null;
        }
        constraintLayout7.setOnClickListener(new View$OnClickListenerC79800Hcw(this));
        View view20 = this.LIZLLL;
        if (view20 != null) {
            constraintLayout8 = (ConstraintLayout) view20.findViewById(2131180390);
        } else {
            constraintLayout8 = null;
        }
        constraintLayout8.setOnClickListener(new View$OnClickListenerC79801Hcx(this));
        View view21 = this.LIZLLL;
        if (view21 != null) {
            constraintLayout10 = (ConstraintLayout) view21.findViewById(2131180571);
        }
        constraintLayout10.setOnClickListener(new View$OnClickListenerC79802Hcy(this));
    }
}
