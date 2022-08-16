package com.bytedance.android.live.broadcast.comment;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.broadcast.C3243u;
import com.bytedance.android.live.broadcast.comment.data.C2989f;
import com.bytedance.android.live.broadcast.comment.data.C2990g;
import com.bytedance.android.live.broadcast.view.GamePromoteCommonRatingBar;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.user.IUserService;
import com.bytedance.android.live.utility.ServiceManager;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.user.C9284h;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.android.schedulers.AndroidSchedulers;
import java.util.HashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import p003X.AbstractC413402Xu;
import p003X.C100839PnV;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C2WC;
import p003X.C409882Kg;
import p003X.C88440Kt0;
import p003X.C88952L3a;
import p003X.C88954L3c;
import p003X.L3W;
import p003X.L43;
import p003X.L45;
import p003X.LK1;
import p003X.LK5;

/* loaded from: classes5.dex */
public final class CommentBar extends FrameLayout {
    public static ChangeQuickRedirect LIZ;
    public View LIZIZ;
    public TextView LIZJ;
    public String LIZLLL;

    /* renamed from: LJ */
    public TextView f25804LJ;
    public GamePromoteCommonRatingBar LJFF;
    public FragmentManager LJI;
    public C2990g LJII;

    static {
        Covode.recordClassIndex(15206);
    }

    public CommentBar(Context context) {
        this(context, null, 0, 6, null);
    }

    public CommentBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final FragmentManager getChildFragmentManager() {
        return this.LJI;
    }

    public final TextView getInputButton() {
        return this.LIZJ;
    }

    public final GamePromoteCommonRatingBar getRatingBar() {
        return this.LJFF;
    }

    public final TextView getTitle() {
        return this.f25804LJ;
    }

    public final View getView() {
        return this.LIZIZ;
    }

    public final C2990g getViewModel() {
        return this.LJII;
    }

    public final void setChildFragmentManager(FragmentManager fragmentManager) {
        this.LJI = fragmentManager;
    }

    public final void setViewModel(C2990g c2990g) {
        this.LJII = c2990g;
    }

    public final void LIZ(FragmentManager fragmentManager) {
        if (PatchProxy.proxy(new Object[]{fragmentManager}, this, LIZ, false, 6).isSupported) {
            return;
        }
        C106862S5w.LIZ(fragmentManager);
        this.LJI = fragmentManager;
    }

    public final void setInputButton(TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, LIZ, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(textView);
        this.LIZJ = textView;
    }

    public final void setRatingBar(GamePromoteCommonRatingBar gamePromoteCommonRatingBar) {
        if (PatchProxy.proxy(new Object[]{gamePromoteCommonRatingBar}, this, LIZ, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(gamePromoteCommonRatingBar);
        this.LJFF = gamePromoteCommonRatingBar;
    }

    public final void setTitle(TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(textView);
        this.f25804LJ = textView;
    }

    public final void setView(View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(view);
        this.LIZIZ = view;
    }

    public final void LIZ(C2990g c2990g) {
        C3243u c3243u;
        if (PatchProxy.proxy(new Object[]{c2990g}, this, LIZ, false, 7).isSupported) {
            return;
        }
        C106862S5w.LIZ(c2990g);
        this.LJII = c2990g;
        GamePromoteCommonRatingBar gamePromoteCommonRatingBar = this.LJFF;
        C2990g c2990g2 = this.LJII;
        if (c2990g2 != null) {
            c3243u = c2990g2.f25812LJ;
        } else {
            c3243u = null;
        }
        gamePromoteCommonRatingBar.LJFF = c3243u;
    }

    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.LIZLLL = str;
        if (TextUtils.equals("promote_detail", this.LIZLLL)) {
            ((ConstraintLayout) this.LIZIZ.findViewById(2131170233)).setPadding(LK1.LIZLLL(16), LK1.LIZLLL(12), LK1.LIZLLL(16), LK1.LIZLLL(16));
        }
    }

    /* renamed from: com.bytedance.android.live.broadcast.comment.CommentBar$2 */
    /* loaded from: classes5.dex */
    public static final class C29722 extends C88952L3a {
        public static ChangeQuickRedirect LIZ;
        public final /* synthetic */ Context LIZJ;

        static {
            Covode.recordClassIndex(15208);
        }

        public C29722(Context context) {
            this.LIZJ = context;
        }

        @Override // p003X.C88952L3a, p003X.AbstractC88953L3b
        public final void LIZ(float f, int i) {
            String str;
            int i2;
            String str2;
            C3243u c3243u;
            boolean z = false;
            if (PatchProxy.proxy(new Object[]{Float.valueOf(f), Integer.valueOf(i)}, this, LIZ, false, 1).isSupported || f <= 0.0f) {
                return;
            }
            L45 l45 = L45.LIZJ;
            C2990g viewModel = CommentBar.this.getViewModel();
            String str3 = null;
            if (viewModel != null) {
                str3 = viewModel.LJFF;
            }
            String valueOf = String.valueOf(str3);
            C2990g viewModel2 = CommentBar.this.getViewModel();
            if (viewModel2 == null || (c3243u = viewModel2.f25812LJ) == null || (str = c3243u.LIZLLL) == null) {
                str = "";
            }
            String str4 = CommentBar.this.LIZLLL;
            if (str4 == null) {
                str4 = "";
            }
            String valueOf2 = String.valueOf(CommentBar.this.getRatingBar().getScore() * 2.0d);
            C2990g viewModel3 = CommentBar.this.getViewModel();
            if (viewModel3 != null) {
                i2 = viewModel3.LIZJ;
            } else {
                i2 = 0;
            }
            C2990g viewModel4 = CommentBar.this.getViewModel();
            if (viewModel4 != null) {
                z = viewModel4.LIZLLL;
            }
            l45.LIZ(valueOf, str, str4, "click_star", "0", "0", valueOf2, i2, z);
            if (!((IUserService) ServiceManager.getService(IUserService.class)).user().LIZLLL()) {
                ((IUserService) ServiceManager.getService(IUserService.class)).user().LIZ(this.LIZJ, C9284h.LIZ().LIZ()).observeOn(AndroidSchedulers.mainThread()).subscribe(C100839PnV.m22957LJ(), C100839PnV.LIZLLL());
                C88440Kt0.LIZ(LK5.LIZ(2131583617));
                return;
            }
            C2990g viewModel5 = CommentBar.this.getViewModel();
            if (viewModel5 != null && (str2 = viewModel5.LJFF) != null && (true ^ StringsKt__StringsJVMKt.isBlank(str2))) {
                C2989f c2989f = new C2989f();
                c2989f.LIZIZ = str2;
                c2989f.f25811LJ = "";
                c2989f.LIZLLL = f * 2.0d;
                c2989f.LJII = System.currentTimeMillis() / 1000;
                C2990g viewModel6 = CommentBar.this.getViewModel();
                if (viewModel6 != null) {
                    viewModel6.LIZ(c2989f, new C88954L3c(this, f));
                }
            }
        }
    }

    public final boolean LIZ(Context context, String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, str}, this, LIZ, false, 10);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        try {
            context.getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentBar(final Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C106862S5w.LIZ(context);
        MethodCollector.m14708i(1222);
        View LIZ2 = C116971W2r.LIZ(LayoutInflater.from(context), 2131699285, (ViewGroup) this, true);
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        this.LIZIZ = LIZ2;
        this.LIZLLL = "";
        this.LIZIZ.setBackground(LK5.LIZJ(2130852716));
        View findViewById = this.LIZIZ.findViewById(2131172330);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.f25804LJ = (TextView) findViewById;
        View findViewById2 = this.LIZIZ.findViewById(2131194409);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        this.LIZJ = (TextView) findViewById2;
        View findViewById3 = this.LIZIZ.findViewById(2131187139);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "");
        this.LJFF = (GamePromoteCommonRatingBar) findViewById3;
        this.LIZJ.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.android.live.broadcast.comment.CommentBar.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(15207);
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FragmentManager childFragmentManager;
                C2990g viewModel;
                C3243u c3243u;
                String str;
                C5923dp LIZ3;
                C2WC<Room> LIZ4;
                Room LIZ5;
                C5923dp LIZ6;
                AbstractC413402Xu<Boolean> LJIILJJIL;
                String str2;
                if (!PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported && (childFragmentManager = CommentBar.this.getChildFragmentManager()) != null) {
                    L3W l3w = new L3W();
                    C2990g viewModel2 = CommentBar.this.getViewModel();
                    if (viewModel2 != null) {
                        l3w.LIZ(viewModel2);
                        L45 l45 = L45.LIZJ;
                        String valueOf = String.valueOf(viewModel2.LJFF);
                        C3243u c3243u2 = viewModel2.f25812LJ;
                        if (c3243u2 == null || (str2 = c3243u2.LIZLLL) == null) {
                            str2 = "";
                        }
                        String str3 = CommentBar.this.LIZLLL;
                        if (str3 == null) {
                            str3 = "";
                        }
                        int i2 = viewModel2.LIZJ;
                        boolean z = viewModel2.LIZLLL;
                        if (!PatchProxy.proxy(new Object[]{valueOf, str2, str3, Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : (byte) 0)}, l45, L45.LIZ, false, 3).isSupported) {
                            C106862S5w.LIZ(valueOf, str2, str3);
                            String LIZ7 = l45.LIZ("livesdk_game_promote_user_write_comment_botton_click", z);
                            HashMap hashMap = new HashMap();
                            hashMap.put("game_id", valueOf);
                            hashMap.put("game_name", str2);
                            String LIZIZ = l45.LIZIZ();
                            if (LIZIZ == null) {
                                LIZIZ = "";
                            }
                            hashMap.put("user_id", LIZIZ);
                            hashMap.put("enter_from", str3);
                            hashMap.put("identity", l45.LIZ());
                            L43.LIZ(L43.LIZIZ, LIZ7, hashMap, i2, z, false, null, 48, null);
                        }
                    }
                    SettingKey<Boolean> settingKey = LiveSettingKeys.LIVE_GAME_COMMENT_INSTALL_CHECK_CONFIG;
                    Intrinsics.checkNotNullExpressionValue(settingKey, "");
                    Boolean value = settingKey.getValue();
                    Intrinsics.checkNotNullExpressionValue(value, "");
                    if (value.booleanValue() && (viewModel = CommentBar.this.getViewModel()) != null && (c3243u = viewModel.f25812LJ) != null && (str = c3243u.LJIJJ) != null && (LIZ3 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null)) != null && (LIZ4 = LIZ3.LIZ()) != null && (LIZ5 = LIZ4.LIZ()) != null && LIZ5.getIdStr() != null && (LIZ6 = C409882Kg.LIZ(C5923dp.LJIIJ, null, 0L, 3, null)) != null && (LJIILJJIL = LIZ6.LJIILJJIL()) != null && !LJIILJJIL.LIZIZ().booleanValue() && !CommentBar.this.LIZ(context, str)) {
                        C88440Kt0.LIZ(LK5.LIZ(2131583547));
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("enter_from", CommentBar.this.LIZLLL);
                    if (CommentBar.this.getRatingBar().getProgress() >= 0.0f) {
                        bundle.putInt("current_progress", CommentBar.this.getRatingBar().getProgress());
                    }
                    l3w.setArguments(bundle);
                    l3w.show(childFragmentManager, "CommentEditorDialog");
                }
            }
        });
        this.LJFF.setOnCommonRatingBarScoreListener(new C29722(context));
        MethodCollector.m14707o(1222);
    }

    public /* synthetic */ CommentBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
