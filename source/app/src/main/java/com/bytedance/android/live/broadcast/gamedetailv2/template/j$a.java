package com.bytedance.android.live.broadcast.gamedetailv2.template;

import android.view.View;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.android.live.broadcast.comment.data.C2988e;
import com.bytedance.android.live.broadcast.gamedetailv2.data.C3119b;
import com.bytedance.android.live.broadcast.gamedetailv2.data.C3120d;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.live.datacontext.C13491f;
import com.google.android.material.tabs.TabLayout;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import p003X.C106862S5w;
import p003X.C116971W2r;
import p003X.C2WC;
import p003X.C89045L6p;
import p003X.C89050L6u;
import p003X.IQV;
import p003X.L7T;
import p003X.LK5;

/* loaded from: classes5.dex */
public final class j$a extends L7T<C3120d> {
    public static ChangeQuickRedirect LIZ;
    public final TabLayout LIZLLL;

    /* renamed from: LJ */
    public final ViewPager f25895LJ;
    public C89050L6u LJFF;
    public final LinearLayout LJI;
    public final View LJII;
    public final ArrayList<C3120d> LJIIIIZZ = new ArrayList<>();
    public String LJIIIZ = "";
    public int LJIIJ = 1;
    public HashMap<String, Integer> LJIIJJI = new HashMap<>();
    public final C89045L6p LJIIL;

    static {
        Covode.recordClassIndex(16720);
    }

    @Override // p003X.L7T
    public final void LIZ() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j$a(View view) {
        super(view);
        C106862S5w.LIZ(view);
        View findViewById = view.findViewById(2131192377);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.LIZLLL = (TabLayout) findViewById;
        View findViewById2 = view.findViewById(2131197227);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "");
        this.f25895LJ = (ViewPager) findViewById2;
        View findViewById3 = view.findViewById(2131181943);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "");
        this.LJI = (LinearLayout) findViewById3;
        View findViewById4 = view.findViewById(2131196396);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "");
        this.LJII = findViewById4;
        C13491f LIZ2 = IQV.LIZ(C89045L6p.class);
        this.LJIIL = (C89045L6p) (!(LIZ2 instanceof C89045L6p) ? null : LIZ2);
    }

    public final void LIZ(int i) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 5).isSupported || i == this.LJIIJ) {
            return;
        }
        this.LJIIJ = i;
        int i2 = this.LJIIJ;
        if (i2 != 1) {
            if (i2 == 2) {
                this.LIZLLL.setBackgroundColor(LK5.LIZIZ(2131626090));
                this.LJII.setVisibility(0);
                return;
            }
            return;
        }
        this.LIZLLL.setBackgroundColor(LK5.LIZIZ(2131623937));
        this.LJII.setVisibility(8);
    }

    @Override // p003X.L7T
    public final /* synthetic */ void LIZ(C3120d c3120d) {
        C2WC<C3119b> LIZIZ;
        C3119b LIZ2;
        C2988e c2988e;
        C3120d c3120d2 = c3120d;
        if (!PatchProxy.proxy(new Object[]{c3120d2}, this, LIZ, false, 1).isSupported) {
            C106862S5w.LIZ(c3120d2);
            this.LJIIIIZZ.clear();
            C89045L6p c89045L6p = this.LJIIL;
            Integer num = null;
            if (c89045L6p != null && (LIZIZ = c89045L6p.LIZIZ()) != null && (LIZ2 = LIZIZ.LIZ()) != null && (c2988e = LIZ2.LJII) != null) {
                num = Integer.valueOf(c2988e.LIZLLL);
            }
            SettingKey<Boolean> settingKey = LiveSettingKeys.LIVE_GAME_PROMOTE_COMMENT_ENABLED;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            if (!settingKey.getValue().booleanValue() || num == null || num.intValue() != 2) {
                Iterator<C3120d> it = c3120d2.f25887LJ.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C3120d next = it.next();
                    if (Intrinsics.areEqual(next.LIZJ, "tab_comment")) {
                        c3120d2.f25887LJ.remove(next);
                        break;
                    }
                }
            }
            this.LJIIIIZZ.addAll(c3120d2.f25887LJ);
            int size = this.LJIIIIZZ.size();
            for (int i = 0; i < size; i++) {
                String str = this.LJIIIIZZ.get(i).LIZJ;
                if (str != null) {
                    this.LJIIJJI.put(str, Integer.valueOf(i));
                }
            }
            String str2 = this.LJIIIZ;
            if (str2 != null && (!StringsKt__StringsJVMKt.isBlank(str2))) {
                Integer num2 = this.LJIIJJI.get(str2);
                if (num2 != null) {
                    int intValue = num2.intValue();
                    if (!PatchProxy.proxy(new Object[]{Integer.valueOf(intValue)}, this, LIZ, false, 6).isSupported) {
                        try {
                            Field declaredField = C116971W2r.LIZ("androidx.viewpager.widget.ViewPager").getDeclaredField("mCurItem");
                            Intrinsics.checkNotNullExpressionValue(declaredField, "");
                            declaredField.setAccessible(true);
                            declaredField.setInt(this.f25895LJ, intValue);
                        } catch (Exception unused) {
                            this.f25895LJ.setCurrentItem(intValue);
                        }
                    }
                }
                this.LJIIIZ = "";
            }
            this.LJFF = new C89050L6u(this.LJIIIIZZ);
            this.f25895LJ.setAdapter(this.LJFF);
            this.LIZLLL.setupWithViewPager(this.f25895LJ);
            this.f25895LJ.setOffscreenPageLimit(this.LJIIIIZZ.size());
        }
    }

    @Override // p003X.L7T
    public final /* synthetic */ void LIZ(boolean z, C3120d c3120d) {
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), c3120d}, this, LIZ, false, 7).isSupported) {
            C106862S5w.LIZ(c3120d);
        }
    }

    public final void LIZ(String str, Boolean bool) {
        if (PatchProxy.proxy(new Object[]{str, bool}, this, LIZ, false, 3).isSupported) {
            return;
        }
        if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
            Integer num = this.LJIIJJI.get(str);
            if (num != null) {
                this.f25895LJ.setCurrentItem(num.intValue());
                return;
            }
            return;
        }
        this.LJIIIZ = str;
    }
}
