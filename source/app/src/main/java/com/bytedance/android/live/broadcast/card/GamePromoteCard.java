package com.bytedance.android.live.broadcast.card;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.AbstractC2891l;
import com.bytedance.android.live.broadcast.api.gamepromote.C2888a;
import com.bytedance.android.live.broadcast.download.C3002c;
import com.bytedance.android.live.broadcast.download.PromoteCardDownloadView;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.config.C6825ah;
import com.bytedance.android.livesdk.config.C6837at;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.message.model.C8788cd;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.live.datacontext.C13491f;
import com.bytedance.p1300mt.protector.impl.CastProtectorUtils;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import org.json.JSONObject;
import p002O.C0002O;
import p003X.AbstractC4569445g;
import p003X.AbstractC89227LDp;
import p003X.AbstractC89313LGx;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C134798c0f;
import p003X.C2WC;
import p003X.C409882Kg;
import p003X.C440033av;
import p003X.C89235LDx;
import p003X.C89245LEh;
import p003X.IQV;
import p003X.K8Q;
import p003X.LE4;
import p003X.LEE;
import p003X.LEF;
import p003X.LEG;
import p003X.LEH;
import p003X.LEI;
import p003X.LEP;
import p003X.LEQ;
import p003X.LF3;
import p003X.LFB;
import p003X.LHU;
import p003X.LK1;
import p003X.LK5;
import p003X.M0Q;

/* loaded from: classes5.dex */
public final class GamePromoteCard implements AbstractC89313LGx, AbstractC4569445g {
    public static ChangeQuickRedirect LIZ;
    public AbstractC2891l LIZIZ;
    public final Room LIZJ;
    public final String LIZLLL;

    /* renamed from: LJ */
    public final String f25792LJ;
    public PromoteCardDownloadView LJFF;
    public C3002c LJI;
    public boolean LJII;
    public ObjectAnimator LJIIIIZZ;
    public ObjectAnimator LJIIIZ;
    public ObjectAnimator LJIIJ;
    public ObjectAnimator LJIIJJI;
    public C8788cd LJIIL;
    public View LJIILIIL;
    public ConstraintLayout LJIILJJIL;
    public final C2888a LJIILL;
    public final Context LJIILLIIL;
    public View LJIIZILJ;

    static {
        Covode.recordClassIndex(15034);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (!PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, LIZ, false, 6).isSupported && event == Lifecycle.Event.ON_RESUME) {
            onResume();
        }
    }

    @Override // p003X.AbstractC89313LGx
    public final View LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (View) proxy.result;
        }
        View view = this.LJIIZILJ;
        Intrinsics.checkNotNull(view);
        return view;
    }

    @Override // p003X.AbstractC89313LGx
    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 5).isSupported) {
            return;
        }
        LE4.LIZIZ.LIZ(this.LJIILLIIL, this.LJI);
        ObjectAnimator objectAnimator = this.LJIIIIZZ;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ObjectAnimator objectAnimator2 = this.LJIIIZ;
        if (objectAnimator2 != null) {
            objectAnimator2.cancel();
        }
        ObjectAnimator objectAnimator3 = this.LJIIJ;
        if (objectAnimator3 != null) {
            objectAnimator3.cancel();
        }
        ObjectAnimator objectAnimator4 = this.LJIIJJI;
        if (objectAnimator4 != null) {
            objectAnimator4.cancel();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        C2888a c2888a = this.LJIILL;
        Boolean bool = null;
        String str = null;
        if (c2888a != null) {
            C8788cd c8788cd = this.LJIIL;
            if (c8788cd != null) {
                str = c8788cd.LJIILLIIL;
            }
            bool = c2888a.LIZ(str);
        }
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            ConstraintLayout constraintLayout = this.LJIILJJIL;
            if (constraintLayout != null) {
                LK1.LIZIZ(constraintLayout);
            }
            View view = this.LJIILIIL;
            if (view != null) {
                LK1.LIZJ(view);
            }
        }
    }

    public static boolean LIZIZ(C8788cd c8788cd) {
        if (c8788cd.LJJIIJ) {
            return true;
        }
        return false;
    }

    public GamePromoteCard(Context context) {
        Room room;
        String str;
        String str2;
        C2WC<Room> LIZ2;
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(1215);
        this.LJIILLIIL = context;
        C5923dp LIZ3 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null);
        if (LIZ3 != null && (LIZ2 = LIZ3.LIZ()) != null) {
            room = LIZ2.LIZ();
        } else {
            room = null;
        }
        this.LIZJ = room;
        Room room2 = this.LIZJ;
        if (room2 != null) {
            str = String.valueOf(room2.getId());
        } else {
            str = null;
        }
        this.LIZLLL = str;
        Room room3 = this.LIZJ;
        if (room3 != null) {
            str2 = String.valueOf(room3.ownerUserId);
        } else {
            str2 = null;
        }
        this.f25792LJ = str2;
        C13491f LIZ4 = IQV.LIZ(C2888a.class);
        this.LJIILL = (C2888a) (!(LIZ4 instanceof C2888a) ? null : LIZ4);
        K8Q.LIZ().LJFF().LIZ(this);
        this.LJIIZILJ = LayoutInflater.from(this.LJIILLIIL).inflate(2131698502, (ViewGroup) null);
        MethodCollector.m14707o(1215);
    }

    public final void LIZ(C8788cd c8788cd) {
        Long l;
        String str;
        String str2;
        User owner;
        User owner2;
        ImageModel avatarThumb;
        List<String> urls;
        if (PatchProxy.proxy(new Object[]{c8788cd}, this, LIZ, false, 4).isSupported) {
            return;
        }
        AbstractC2891l abstractC2891l = this.LIZIZ;
        if (abstractC2891l != null) {
            Context context = this.LJIILLIIL;
            Bundle bundle = new Bundle();
            bundle.putString("game_id", c8788cd.LJIILLIIL);
            bundle.putString("anchor_id", this.f25792LJ);
            Room room = this.LIZJ;
            String str3 = null;
            if (room != null) {
                l = Long.valueOf(room.ownerUserId);
            } else {
                l = null;
            }
            bundle.putString("package_anchor_id", String.valueOf(l));
            Room room2 = this.LIZJ;
            if (room2 != null && (owner2 = room2.getOwner()) != null && (avatarThumb = owner2.getAvatarThumb()) != null && (urls = avatarThumb.getUrls()) != null) {
                str = (String) CollectionsKt___CollectionsKt.first((List<? extends Object>) urls);
            } else {
                str = null;
            }
            bundle.putString("package_anchor_avatar", str);
            Room room3 = this.LIZJ;
            if (room3 != null && (owner = room3.getOwner()) != null) {
                str3 = owner.getNickName();
            }
            bundle.putString("package_anchor_nick", str3);
            bundle.putString("room_id", this.LIZLLL);
            bundle.putString("enter_from", "game_ad");
            bundle.putString("game_ad_type", "1");
            if (c8788cd.f27873LJ) {
                str2 = "auto";
            } else {
                str2 = "manual";
            }
            bundle.putString("game_ad_show_type", str2);
            bundle.putString("start_page", "game_ad");
            abstractC2891l.LIZ(context, bundle, Boolean.FALSE);
        }
        C440033av c440033av = C440033av.LIZIZ;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("game_name", String.valueOf(c8788cd.LJII));
        jSONObject.put("game_id", String.valueOf(c8788cd.LJIILLIIL));
        C440033av.LIZ(c440033av, 106, jSONObject, null, 4, null);
    }

    /* JADX WARN: Type inference failed for: r2v58, types: [T, java.lang.String] */
    @Override // p003X.AbstractC89313LGx
    public final void LIZ(View view, final C8788cd c8788cd, AbstractC89227LDp abstractC89227LDp) {
        Long l;
        String str;
        String str2;
        Integer num;
        String str3;
        String str4;
        boolean z;
        String LIZ2;
        User owner;
        User owner2;
        ImageModel avatarThumb;
        List<String> urls;
        if (PatchProxy.proxy(new Object[]{view, c8788cd, abstractC89227LDp}, this, LIZ, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(view, c8788cd, abstractC89227LDp);
        View findViewById = view.findViewById(2131167988);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        Intrinsics.checkNotNullExpressionValue(view.findViewById(2131194445), "");
        View findViewById2 = view.findViewById(2131171764);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        HSImageView hSImageView = (HSImageView) findViewById2;
        View findViewById3 = view.findViewById(2131171295);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "");
        TextView textView = (TextView) findViewById3;
        View findViewById4 = view.findViewById(2131172331);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "");
        final TextView textView2 = (TextView) findViewById4;
        View findViewById5 = view.findViewById(2131165633);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "");
        TextView textView3 = (TextView) findViewById5;
        View findViewById6 = view.findViewById(2131194856);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "");
        TextView textView4 = (TextView) findViewById6;
        this.LJFF = (PromoteCardDownloadView) view.findViewById(2131172903);
        View findViewById7 = view.findViewById(2131193964);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "");
        TextView textView5 = (TextView) findViewById7;
        View findViewById8 = view.findViewById(2131193966);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "");
        TextView textView6 = (TextView) findViewById8;
        View findViewById9 = view.findViewById(2131193968);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "");
        TextView textView7 = (TextView) findViewById9;
        View findViewById10 = view.findViewById(2131194887);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "");
        TextView textView8 = (TextView) findViewById10;
        View findViewById11 = view.findViewById(2131193970);
        Intrinsics.checkNotNullExpressionValue(findViewById11, "");
        TextView textView9 = (TextView) findViewById11;
        View findViewById12 = view.findViewById(2131170319);
        Intrinsics.checkNotNullExpressionValue(findViewById12, "");
        View findViewById13 = view.findViewById(2131170325);
        Intrinsics.checkNotNullExpressionValue(findViewById13, "");
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById13;
        View findViewById14 = view.findViewById(2131196394);
        Intrinsics.checkNotNullExpressionValue(findViewById14, "");
        this.LJIILIIL = findViewById12;
        this.LJIILJJIL = constraintLayout;
        this.LJIIL = c8788cd;
        int[] iArr = new int[2];
        iArr[1] = 0;
        try {
            iArr[0] = Color.parseColor(c8788cd.LJIIJJI);
        } catch (Exception e) {
            e.printStackTrace();
            iArr[0] = CastProtectorUtils.parseColor("#161616");
        }
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, iArr);
        gradientDrawable.setCornerRadius(LK5.LIZ(5.0f));
        gradientDrawable.setGradientType(0);
        findViewById14.setBackground(gradientDrawable);
        this.LJIIIIZZ = ObjectAnimator.ofFloat(findViewById12, "alpha", 0.0f, 1.0f);
        ObjectAnimator objectAnimator = this.LJIIIIZZ;
        if (objectAnimator != null) {
            objectAnimator.setDuration(250L);
        }
        ObjectAnimator objectAnimator2 = this.LJIIIIZZ;
        if (objectAnimator2 != null) {
            objectAnimator2.removeAllListeners();
        }
        ObjectAnimator objectAnimator3 = this.LJIIIIZZ;
        if (objectAnimator3 != null) {
            objectAnimator3.addListener(new LFB(findViewById12));
        }
        this.LJIIIZ = ObjectAnimator.ofFloat(constraintLayout, "alpha", 1.0f, 0.0f);
        ObjectAnimator objectAnimator4 = this.LJIIIZ;
        if (objectAnimator4 != null) {
            objectAnimator4.setDuration(250L);
        }
        ObjectAnimator objectAnimator5 = this.LJIIIZ;
        if (objectAnimator5 != null) {
            objectAnimator5.removeAllListeners();
        }
        ObjectAnimator objectAnimator6 = this.LJIIIZ;
        if (objectAnimator6 != null) {
            objectAnimator6.addListener(new LF3(constraintLayout));
        }
        LK1.LIZ(findViewById12);
        LK1.LIZJ(constraintLayout);
        constraintLayout.setAlpha(1.0f);
        PromoteCardDownloadView promoteCardDownloadView = this.LJFF;
        if (promoteCardDownloadView != null) {
            promoteCardDownloadView.LJII();
        }
        PromoteCardDownloadView promoteCardDownloadView2 = this.LJFF;
        if (promoteCardDownloadView2 != null) {
            promoteCardDownloadView2.LJIIIIZZ();
        }
        PromoteCardDownloadView promoteCardDownloadView3 = this.LJFF;
        if (promoteCardDownloadView3 != null) {
            promoteCardDownloadView3.setOnGetDownloadCountListener(new C89245LEh(this, c8788cd));
        }
        PromoteCardDownloadView promoteCardDownloadView4 = this.LJFF;
        if (promoteCardDownloadView4 != null) {
            promoteCardDownloadView4.setOnDownloadStateChangeListener(new LEE(this, textView9, constraintLayout, findViewById12));
        }
        M0Q.LIZ(hSImageView, new ImageModel(c8788cd.LJI, CollectionsKt__CollectionsJVMKt.listOf(c8788cd.LJI)));
        textView.setText(c8788cd.LJII);
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = c8788cd.LJIJ;
        textView2.post(new Runnable() { // from class: X.5LF
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(15041);
            }

            /* JADX WARN: Type inference failed for: r0v11, types: [T, java.lang.String] */
            /* JADX WARN: Type inference failed for: r0v19, types: [T, java.lang.String] */
            @Override // java.lang.Runnable
            public final void run() {
                if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                    return;
                }
                if (C5LE.LIZIZ.LIZ(textView2, (String) objectRef.element) > 1.0d) {
                    Ref.ObjectRef objectRef2 = objectRef;
                    new StringBuilder();
                    objectRef2.element = C0002O.m25085C(c8788cd.LJIJ, " ", c8788cd.LJIIZILJ);
                    if (C5LE.LIZIZ.LIZ(textView2, (String) objectRef.element) > 2.0d) {
                        textView2.setTextSize(8.0f);
                    }
                } else {
                    Ref.ObjectRef objectRef3 = objectRef;
                    new StringBuilder();
                    objectRef3.element = C0002O.m25085C(c8788cd.LJIJ, "\n", c8788cd.LJIIZILJ);
                }
                textView2.setText((String) objectRef.element);
            }
        });
        textView4.setText(LK5.LIZ(2131583515));
        textView3.setText(LK5.LIZ(2131583516));
        C89235LDx c89235LDx = C89235LDx.LIZIZ;
        String str5 = c8788cd.LJIILLIIL;
        List<String> list = c8788cd.LJIIJ;
        String str6 = this.f25792LJ;
        Room room = this.LIZJ;
        if (room != null) {
            l = Long.valueOf(room.ownerUserId);
        } else {
            l = null;
        }
        String valueOf = String.valueOf(l);
        Room room2 = this.LIZJ;
        if (room2 != null && (owner2 = room2.getOwner()) != null && (avatarThumb = owner2.getAvatarThumb()) != null && (urls = avatarThumb.getUrls()) != null) {
            str = (String) CollectionsKt___CollectionsKt.first((List<? extends Object>) urls);
        } else {
            str = null;
        }
        Room room3 = this.LIZJ;
        if (room3 != null && (owner = room3.getOwner()) != null) {
            str2 = owner.getNickName();
        } else {
            str2 = null;
        }
        String str7 = this.LIZLLL;
        String str8 = c8788cd.LJIJJLI;
        PromoteCardDownloadView promoteCardDownloadView5 = this.LJFF;
        if (promoteCardDownloadView5 != null) {
            num = Integer.valueOf(promoteCardDownloadView5.getViewToken());
        } else {
            num = null;
        }
        String str9 = c8788cd.LJJII;
        String str10 = c8788cd.LJJIII;
        Boolean bool = Boolean.FALSE;
        if (c8788cd.f27873LJ) {
            str3 = "auto";
        } else {
            str3 = "manual";
        }
        this.LJI = C89235LDx.LIZ(c89235LDx, str5, list, false, str6, valueOf, str, str2, str7, "game_ad", "game_ad", str8, num, str9, str10, bool, null, 0, null, str3, 229376, null);
        PromoteCardDownloadView promoteCardDownloadView6 = this.LJFF;
        if (promoteCardDownloadView6 != null) {
            promoteCardDownloadView6.setDownloadInfo(this.LJI);
        }
        if (c8788cd.LJJIIJZLJL) {
            str4 = "1";
        } else {
            str4 = "0";
        }
        PromoteCardDownloadView promoteCardDownloadView7 = this.LJFF;
        if (promoteCardDownloadView7 != null) {
            z = true;
            promoteCardDownloadView7.setExtraGameInfo(MapsKt__MapsKt.mapOf(TuplesKt.m137to("start_page", "game_ad"), TuplesKt.m137to("is_task", str4)));
        } else {
            z = true;
        }
        PromoteCardDownloadView promoteCardDownloadView8 = this.LJFF;
        if (promoteCardDownloadView8 != null) {
            promoteCardDownloadView8.LIZIZ = z;
        }
        if (LIZIZ(c8788cd)) {
            LIZ2 = LK5.LIZ(2131582999);
        } else {
            LIZ2 = LK5.LIZ(2131582998);
        }
        textView5.setText(C134798c0f.LIZ(c8788cd.LJFF, LIZ2));
        textView6.setText(C134798c0f.LIZ(c8788cd.LJFF, LIZ2));
        textView7.setText(C134798c0f.LIZ(c8788cd.LJFF, LIZ2));
        if (LIZIZ(c8788cd)) {
            Drawable LIZJ = LK5.LIZJ(2130856313);
            textView6.setCompoundDrawablesWithIntrinsicBounds(LIZJ, (Drawable) null, (Drawable) null, (Drawable) null);
            textView7.setCompoundDrawablesWithIntrinsicBounds(LIZJ, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            SettingKey<C6837at> settingKey = LiveSettingKeys.LIVE_GAME_SECURITY_SIGN_PROGRESS_CONFIG;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            if (settingKey.getValue().LIZIZ == 1) {
                Drawable LIZJ2 = LK5.LIZJ(2130856320);
                textView6.setCompoundDrawablesWithIntrinsicBounds(LIZJ2, (Drawable) null, (Drawable) null, (Drawable) null);
                textView7.setCompoundDrawablesWithIntrinsicBounds(LIZJ2, (Drawable) null, (Drawable) null, (Drawable) null);
            } else {
                textView6.setCompoundDrawables(null, null, null, null);
                textView7.setCompoundDrawables(null, null, null, null);
            }
        }
        if (c8788cd.LJJIFFI) {
            SettingKey<C6825ah> settingKey2 = LiveSettingKeys.LIVE_GAME_DOWNLOAD_MSG_CONFIG;
            Intrinsics.checkNotNullExpressionValue(settingKey2, "");
            if (settingKey2.getValue().LIZJ == 1) {
                String LIZ3 = LK5.LIZ(2131583001);
                Intrinsics.checkNotNullExpressionValue(LIZ3, "");
                String format = String.format(LIZ3, Arrays.copyOf(new Object[]{LHU.LIZIZ.LIZ(c8788cd.LJIL)}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "");
                SpannableString spannableString = new SpannableString(format);
                int indexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) spannableString, " ", 0, false, 6, (Object) null);
                if (indexOf$default > 0) {
                    C116971W2r.LIZ(spannableString, new StyleSpan(1), 0, indexOf$default, 33);
                }
                textView8.setText(spannableString);
                PromoteCardDownloadView promoteCardDownloadView9 = this.LJFF;
                if (promoteCardDownloadView9 != null) {
                    long j = c8788cd.LJJ;
                    long j2 = c8788cd.LJJI;
                    if (!PatchProxy.proxy(new Object[]{new Long(j), new Long(j2)}, promoteCardDownloadView9, PromoteCardDownloadView.f25816LJ, false, 11).isSupported) {
                        promoteCardDownloadView9.LJIIJJI = Observable.timer(j, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new LEP(promoteCardDownloadView9, j2));
                    }
                }
            }
        }
        LE4.LIZIZ.LIZ(this.LJIILLIIL, this.LJI, this.LJFF);
        findViewById.setOnClickListener(new LEG(this, abstractC89227LDp, c8788cd));
        view.setOnClickListener(new LEH(this, c8788cd));
        hSImageView.setOnClickListener(new LEI(this, c8788cd));
        textView4.setOnClickListener(new LEF(this, c8788cd));
        textView3.setOnClickListener(new LEQ(this, c8788cd));
    }
}
