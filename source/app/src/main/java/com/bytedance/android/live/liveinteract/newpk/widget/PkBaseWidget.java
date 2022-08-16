package com.bytedance.android.live.liveinteract.newpk.widget;

import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.Guideline;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.setting.SettingKey;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.linkpk.AbstractC4256d;
import com.bytedance.android.live.linkpk.LinkCrossRoomDataHolder;
import com.bytedance.android.live.liveinteract.newpk.p377d.AbstractC4586a;
import com.bytedance.android.live.liveinteract.newpk.p377d.p378a.C4587a;
import com.bytedance.android.live.liveinteract.newpk.p379vm.PkDataContext;
import com.bytedance.android.live.liveinteract.widget.widget.PkProgressBarV2;
import com.bytedance.android.livesdk.chatroom.C5923dp;
import com.bytedance.android.livesdk.chatroom.widget.RoomWidget;
import com.bytedance.android.livesdk.config.C6936ds;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.model.C9068l;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.Widget;
import com.bytedance.ies.sdk.widgets.WidgetManager;
import com.bytedance.sdk.bridge.p1355js.delegate.JsBridgeDelegate;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC413402Xu;
import p003X.AbstractC4569445g;
import p003X.C106862S5w;
import p003X.C2S8;
import p003X.C2WC;
import p003X.C458614Br;
import p003X.C78469GwZ;
import p003X.C78470Gwa;
import p003X.C78471Gwb;
import p003X.C79046HEa;
import p003X.C80354Hls;
import p003X.C81978ISu;
import p003X.C82056IVu;
import p003X.HSO;
import p003X.HTD;
import p003X.HTW;
import p003X.HUA;
import p003X.HUJ;
import p003X.HXT;
import p003X.IQX;
import p003X.LK1;
import p003X.M0Q;
import p003X.QB4;

/* loaded from: classes3.dex */
public abstract class PkBaseWidget<T extends PkDataContext> extends RoomWidget implements PkProgressBarV2.AbstractC5146a, AbstractC4569445g {

    /* renamed from: LJ */
    public static ChangeQuickRedirect f26384LJ;
    public View LIZ;
    public Guideline LIZIZ;
    public T LJFF;
    public C80354Hls LJI;
    public HTW LJII;
    public HSImageView LJIIIIZZ;
    public HSImageView LJIIIZ;
    public ImageView LJIIJ;
    public ImageView LJIIJJI;
    public Room LJIILJJIL;
    public boolean LJIILL;
    public HSO LJIILLIIL;
    public PkGuestInfoWidget LJIIZILJ;
    public PkContributorWidget LJIJ;
    public PkProgressBarWidget LJIJI;
    public PkAtmosphereAnimWidget LJIJJ;
    public PkLynxInfoWidget LJIJJLI;
    public PkLastBattleResultWidget LJIL;
    public C82056IVu LJJ;
    public int LJJI;
    public final long LJJIFFI;
    public final long LJJII;
    public final C458614Br LJJIII;
    public final CompositeDisposable LJIIL = new CompositeDisposable();
    public final LinkCrossRoomDataHolder LJIILIIL = LinkCrossRoomDataHolder.LJII();
    public final Observer<AbstractC4256d> LIZJ = new HUA(this);

    static {
        Covode.recordClassIndex(28771);
    }

    public abstract Pair<T, Disposable> LIZ();

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public int getLayoutId() {
        return 2131699881;
    }

    @Override // com.bytedance.android.livesdk.chatroom.widget.RoomWidget, com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (PatchProxy.proxy(new Object[]{lifecycleOwner, event}, this, f26384LJ, false, 20).isSupported) {
            return;
        }
        super.onStateChanged(lifecycleOwner, event);
    }

    public final T LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, f26384LJ, false, 1);
        if (proxy.isSupported) {
            return (T) proxy.result;
        }
        T t = this.LJFF;
        if (t == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return t;
    }

    /* renamed from: LJ */
    public final HTW m15721LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, f26384LJ, false, 5);
        if (proxy.isSupported) {
            return (HTW) proxy.result;
        }
        HTW htw = this.LJII;
        if (htw == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return htw;
    }

    public final void LJFF() {
        if (PatchProxy.proxy(new Object[0], this, f26384LJ, false, 10).isSupported) {
            return;
        }
        ImageView imageView = this.LJIIJ;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        imageView.setBackgroundResource(2130854764);
        ImageView imageView2 = this.LJIIJJI;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        imageView2.setBackgroundResource(2130854764);
    }

    private final boolean LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, f26384LJ, false, 14);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (this.dataCenter == null) {
            return false;
        }
        Object obj = this.dataCenter.get("DATA_IS_HIDE_INTERACTION", (String) Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(obj, "");
        if (!((Boolean) obj).booleanValue() || !C2S8.LIZIZ(Boolean.valueOf(this.LJIILL)) || C79046HEa.LIZ().LIZJ()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onDestroy() {
        MutableLiveData<User> LIZIZ;
        MutableLiveData<AbstractC4256d> LIZ;
        LiveData<Long> liveData;
        MutableLiveData<User> mutableLiveData;
        LiveData<AbstractC4256d> liveData2;
        if (PatchProxy.proxy(new Object[0], this, f26384LJ, false, 8).isSupported) {
            return;
        }
        super.onDestroy();
        this.LJIIL.clear();
        C80354Hls c80354Hls = this.LJI;
        if (c80354Hls == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else if (!PatchProxy.proxy(new Object[0], c80354Hls, C80354Hls.LIZ, false, 10).isSupported) {
            c80354Hls.onCleared();
        }
        HTW htw = this.LJII;
        if (htw == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else if (!PatchProxy.proxy(new Object[0], htw, HTW.LIZ, false, 11).isSupported) {
            htw.onCleared();
        }
        T t = this.LJFF;
        if (t == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            LiveData<AbstractC4256d> liveData3 = t.LJIIIZ;
            if (liveData3 != null) {
                liveData3.removeObserver(this.LIZJ);
            }
        }
        C4587a LJFF = HTD.LIZIZ.LJFF();
        if (LJFF != null && !PatchProxy.proxy(new Object[0], LJFF, C4587a.LIZ, false, 4).isSupported) {
            PkDataContext LIZ2 = HTD.LIZIZ.LIZ();
            if (LIZ2 != null && (liveData2 = LIZ2.LJIIIZ) != null) {
                liveData2.removeObserver(LJFF.LIZJ);
            }
            PkDataContext LIZ3 = HTD.LIZIZ.LIZ();
            if (LIZ3 != null && (mutableLiveData = LIZ3.LJJI) != null) {
                mutableLiveData.removeObserver(LJFF.LIZLLL);
            }
            PkDataContext LIZ4 = HTD.LIZIZ.LIZ();
            if (LIZ4 != null && (liveData = LIZ4.LJIIJJI) != null) {
                liveData.removeObserver(LJFF.f26379LJ);
            }
            AbstractC4586a abstractC4586a = LJFF.LIZIZ;
            if (abstractC4586a != null && (LIZ = abstractC4586a.LIZ()) != null) {
                LIZ.postValue(AbstractC4256d.C4257a.LIZIZ);
            }
            AbstractC4586a abstractC4586a2 = LJFF.LIZIZ;
            if (abstractC4586a2 != null && (LIZIZ = abstractC4586a2.LIZIZ()) != null) {
                LIZIZ.postValue(null);
            }
        }
    }

    @Override // com.bytedance.android.live.core.tetris.widgets.LiveWidget, com.bytedance.ies.sdk.widgets.Widget
    public void onCreate() {
        Room room;
        boolean z;
        LiveData<Long> liveData;
        MutableLiveData<User> mutableLiveData;
        LiveData<AbstractC4256d> liveData2;
        AbstractC413402Xu<Boolean> LJIILJJIL;
        Boolean LIZIZ;
        C2WC<Room> LIZ;
        if (PatchProxy.proxy(new Object[0], this, f26384LJ, false, 7).isSupported) {
            return;
        }
        super.onCreate();
        C5923dp LJJJI = LJJJI();
        if (LJJJI != null && (LIZ = LJJJI.LIZ()) != null) {
            room = LIZ.LIZ();
        } else {
            room = null;
        }
        this.LJIILJJIL = room;
        C5923dp LJJJI2 = LJJJI();
        if (LJJJI2 != null && (LJIILJJIL = LJJJI2.LJIILJJIL()) != null && (LIZIZ = LJIILJJIL.LIZIZ()) != null) {
            z = LIZIZ.booleanValue();
        } else {
            z = false;
        }
        this.LJIILL = z;
        this.LJIILLIIL = new HSO(this.LJIILL, this.LJIILJJIL, this.LJIILIIL);
        View view = this.contentView;
        Intrinsics.checkNotNullExpressionValue(view, "");
        View findViewById = view.findViewById(2131166302);
        Intrinsics.checkNotNullExpressionValue(findViewById, "");
        this.LIZ = findViewById;
        View view2 = this.contentView;
        Intrinsics.checkNotNullExpressionValue(view2, "");
        Guideline guideline = (Guideline) view2.findViewById(2131176115);
        Intrinsics.checkNotNullExpressionValue(guideline, "");
        this.LIZIZ = guideline;
        View view3 = this.contentView;
        Intrinsics.checkNotNullExpressionValue(view3, "");
        HSImageView hSImageView = (HSImageView) view3.findViewById(2131179334);
        Intrinsics.checkNotNullExpressionValue(hSImageView, "");
        this.LJIIIIZZ = hSImageView;
        View view4 = this.contentView;
        Intrinsics.checkNotNullExpressionValue(view4, "");
        HSImageView hSImageView2 = (HSImageView) view4.findViewById(2131179326);
        Intrinsics.checkNotNullExpressionValue(hSImageView2, "");
        this.LJIIIZ = hSImageView2;
        View view5 = this.contentView;
        Intrinsics.checkNotNullExpressionValue(view5, "");
        ImageView imageView = (ImageView) view5.findViewById(2131179332);
        Intrinsics.checkNotNullExpressionValue(imageView, "");
        this.LJIIJJI = imageView;
        View view6 = this.contentView;
        Intrinsics.checkNotNullExpressionValue(view6, "");
        ImageView imageView2 = (ImageView) view6.findViewById(2131179329);
        Intrinsics.checkNotNullExpressionValue(imageView2, "");
        this.LJIIJ = imageView2;
        Pair<T, Disposable> LIZ2 = LIZ();
        this.LJFF = LIZ2.getFirst();
        IQX.LIZ(LIZ2.getFirst(), "PkDataContext");
        QB4.LIZ(LIZ2.getSecond(), this.LJIIL);
        T t = this.LJFF;
        if (t == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        this.LJI = new C80354Hls(t, this.dataCenter);
        T t2 = this.LJFF;
        if (t2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        this.LJII = new HTW(t2, this.dataCenter);
        C4587a LJFF = HTD.LIZIZ.LJFF();
        if (LJFF != null && !PatchProxy.proxy(new Object[0], LJFF, C4587a.LIZ, false, 3).isSupported) {
            PkDataContext LIZ3 = HTD.LIZIZ.LIZ();
            if (LIZ3 != null && (liveData2 = LIZ3.LJIIIZ) != null) {
                liveData2.observeForever(LJFF.LIZJ);
            }
            PkDataContext LIZ4 = HTD.LIZIZ.LIZ();
            if (LIZ4 != null && (mutableLiveData = LIZ4.LJJI) != null) {
                mutableLiveData.observeForever(LJFF.LIZLLL);
            }
            PkDataContext LIZ5 = HTD.LIZIZ.LIZ();
            if (LIZ5 != null && (liveData = LIZ5.LJIIJJI) != null) {
                liveData.observeForever(LJFF.f26379LJ);
            }
        }
        if (!PatchProxy.proxy(new Object[0], this, f26384LJ, false, 12).isSupported) {
            enableSubWidgetManager();
            T t3 = this.LJFF;
            if (t3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            C80354Hls c80354Hls = this.LJI;
            if (c80354Hls == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            this.LJIJI = new PkProgressBarWidget(t3, c80354Hls, this.LJJIII);
            this.subWidgetManager.load(2131185193, this.LJIJI);
            PkProgressBarWidget pkProgressBarWidget = this.LJIJI;
            if (pkProgressBarWidget != null && !PatchProxy.proxy(new Object[]{this}, pkProgressBarWidget, PkProgressBarWidget.LIZ, false, 4).isSupported) {
                C106862S5w.LIZ(this);
                HXT hxt = pkProgressBarWidget.LIZIZ;
                if (hxt == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                hxt.getPkProgressV2().setMShowPkStarAnimationListener(this);
            }
            T t4 = this.LJFF;
            if (t4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            this.LJIJJ = new PkAtmosphereAnimWidget(t4);
            this.subWidgetManager.load(2131185170, this.LJIJJ);
            WidgetManager widgetManager = this.subWidgetManager;
            T t5 = this.LJFF;
            if (t5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            HTW htw = this.LJII;
            if (htw == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            widgetManager.load(2131185207, new PkTitleWidget(t5, htw));
            T t6 = this.LJFF;
            if (t6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            C458614Br c458614Br = this.LJJIII;
            HTW htw2 = this.LJII;
            if (htw2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            this.LJIIZILJ = new PkGuestInfoWidget(t6, c458614Br, htw2);
            this.subWidgetManager.load(2131185186, this.LJIIZILJ);
            WidgetManager widgetManager2 = this.subWidgetManager;
            T t7 = this.LJFF;
            if (t7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            HTW htw3 = this.LJII;
            if (htw3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            widgetManager2.load(2131185204, new PkStartAnimWidget(t7, htw3));
            WidgetManager widgetManager3 = this.subWidgetManager;
            T t8 = this.LJFF;
            if (t8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            HTW htw4 = this.LJII;
            if (htw4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            widgetManager3.load(2131185200, new PkResultAnimWidget(t8, htw4));
            WidgetManager widgetManager4 = this.subWidgetManager;
            T t9 = this.LJFF;
            if (t9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            widgetManager4.load(2131185176, new PkBattleUserInfoWidget(t9));
            T t10 = this.LJFF;
            if (t10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            C80354Hls c80354Hls2 = this.LJI;
            if (c80354Hls2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            this.LJIJ = new PkContributorWidget(t10, c80354Hls2, this.LJJIII);
            this.subWidgetManager.load(2131185184, this.LJIJ);
            WidgetManager widgetManager5 = this.subWidgetManager;
            T t11 = this.LJFF;
            if (t11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            HTW htw5 = this.LJII;
            if (htw5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            widgetManager5.load(2131185177, new PkBo3RoundResultWidget(t11, htw5));
            T t12 = this.LJFF;
            if (t12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            C80354Hls c80354Hls3 = this.LJI;
            if (c80354Hls3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            HTW htw6 = this.LJII;
            if (htw6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            this.LJIJJLI = new PkLynxInfoWidget(t12, c80354Hls3, htw6, this.LJJIII);
            this.subWidgetManager.load(2131185188, this.LJIJJLI);
            T t13 = this.LJFF;
            if (t13 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            this.LJIL = new PkLastBattleResultWidget(t13);
            this.subWidgetManager.load(2131185187, this.LJIL);
            WidgetManager widgetManager6 = this.subWidgetManager;
            T t14 = this.LJFF;
            if (t14 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            C80354Hls c80354Hls4 = this.LJI;
            if (c80354Hls4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            widgetManager6.load(2131185197, new PkPropCardWidget(t14, c80354Hls4));
            WidgetManager widgetManager7 = this.subWidgetManager;
            T t15 = this.LJFF;
            if (t15 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            C80354Hls c80354Hls5 = this.LJI;
            if (c80354Hls5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            widgetManager7.load(2131185182, new PkConsecutiveVictoryInfoWidget(t15, c80354Hls5, this.LJJIII));
            WidgetManager widgetManager8 = this.subWidgetManager;
            T t16 = this.LJFF;
            if (t16 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            C80354Hls c80354Hls6 = this.LJI;
            if (c80354Hls6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            widgetManager8.load(2131185203, new PkStarActivityInfoWidget(t16, c80354Hls6, this.LJJIII));
            WidgetManager widgetManager9 = this.subWidgetManager;
            ViewGroup viewGroup = this.containerView;
            T t17 = this.LJFF;
            if (t17 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            HTW htw7 = this.LJII;
            if (htw7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            widgetManager9.load(viewGroup, (Widget) new PkOperationalPlayWidget(t17, htw7), false);
        }
        T t18 = this.LJFF;
        if (t18 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            LiveData<AbstractC4256d> liveData3 = t18.LJIIIZ;
            if (liveData3 != null) {
                liveData3.observeForever(this.LIZJ);
            }
        }
        DataCenter dataCenter = this.dataCenter;
        View view7 = this.contentView;
        Intrinsics.checkNotNullExpressionValue(view7, "");
        this.LJJ = new C82056IVu(dataCenter, view7);
        View view8 = this.contentView;
        Intrinsics.checkNotNullExpressionValue(view8, "");
        View findViewById2 = view8.findViewById(2131196958);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new HUJ(this));
        }
    }

    public static final /* synthetic */ HSImageView LIZ(PkBaseWidget pkBaseWidget) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{pkBaseWidget}, null, f26384LJ, true, 16);
        if (proxy.isSupported) {
            return (HSImageView) proxy.result;
        }
        HSImageView hSImageView = pkBaseWidget.LJIIIIZZ;
        if (hSImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return hSImageView;
    }

    public static final /* synthetic */ HSImageView LIZIZ(PkBaseWidget pkBaseWidget) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{pkBaseWidget}, null, f26384LJ, true, 17);
        if (proxy.isSupported) {
            return (HSImageView) proxy.result;
        }
        HSImageView hSImageView = pkBaseWidget.LJIIIZ;
        if (hSImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return hSImageView;
    }

    public static final /* synthetic */ ImageView LIZJ(PkBaseWidget pkBaseWidget) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{pkBaseWidget}, null, f26384LJ, true, 18);
        if (proxy.isSupported) {
            return (ImageView) proxy.result;
        }
        ImageView imageView = pkBaseWidget.LJIIJ;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return imageView;
    }

    public static final /* synthetic */ ImageView LIZLLL(PkBaseWidget pkBaseWidget) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{pkBaseWidget}, null, f26384LJ, true, 19);
        if (proxy.isSupported) {
            return (ImageView) proxy.result;
        }
        ImageView imageView = pkBaseWidget.LJIIJJI;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return imageView;
    }

    @Override // com.bytedance.ies.sdk.widgets.Widget
    public void onConfigurationChanged(Configuration configuration) {
        C6936ds c6936ds;
        String str;
        if (PatchProxy.proxy(new Object[]{configuration}, this, f26384LJ, false, 9).isSupported) {
            return;
        }
        super.onConfigurationChanged(configuration);
        if (this.LJJIII.LIZIZ() && !this.LJJIII.LIZLLL()) {
            HSImageView hSImageView = this.LJIIIIZZ;
            if (hSImageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            LK1.LIZ((View) hSImageView, false);
            HSImageView hSImageView2 = this.LJIIIZ;
            if (hSImageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            LK1.LIZ((View) hSImageView2, false);
            ImageView imageView = this.LJIIJ;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            LK1.LIZIZ(imageView, true);
            ImageView imageView2 = this.LJIIJJI;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            LK1.LIZIZ(imageView2, true);
            LJFF();
            return;
        }
        HSImageView hSImageView3 = this.LJIIIIZZ;
        if (hSImageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        LK1.LIZ((View) hSImageView3, true);
        HSImageView hSImageView4 = this.LJIIIZ;
        if (hSImageView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        LK1.LIZ((View) hSImageView4, true);
        ImageView imageView3 = this.LJIIJ;
        if (imageView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        LK1.LIZIZ(imageView3, false);
        ImageView imageView4 = this.LJIIJJI;
        if (imageView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        LK1.LIZIZ(imageView4, false);
        if (!PatchProxy.proxy(new Object[0], this, f26384LJ, false, 11).isSupported) {
            T t = this.LJFF;
            if (t == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            long j = t.LJJIJIIJI;
            SettingKey<String> settingKey = LiveSettingKeys.LIVE_PK_DENOISE_TOP_BG_URL;
            Intrinsics.checkNotNullExpressionValue(settingKey, "");
            String value = settingKey.getValue();
            SettingKey<Map<Long, C6936ds>> settingKey2 = LiveConfigSettingKeys.LIVE_PK_SKIN_PACKAGE;
            Intrinsics.checkNotNullExpressionValue(settingKey2, "");
            Map<Long, C6936ds> value2 = settingKey2.getValue();
            if (value2 != null && (c6936ds = value2.get(Long.valueOf(j))) != null && (str = c6936ds.LJIILL) != null) {
                value = str;
            }
            HSImageView hSImageView5 = this.LJIIIIZZ;
            if (hSImageView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            M0Q.LIZ(hSImageView5, value);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.live.liveinteract.widget.widget.PkProgressBarV2.AbstractC5146a
    public final void LIZ(boolean z) {
        PkAtmosphereAnimWidget pkAtmosphereAnimWidget;
        if (!PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, f26384LJ, false, 15).isSupported && (pkAtmosphereAnimWidget = this.LJIJJ) != null && !PatchProxy.proxy(new Object[]{Byte.valueOf((byte) z)}, pkAtmosphereAnimWidget, PkAtmosphereAnimWidget.LIZ, false, 3).isSupported) {
            C78470Gwa c78470Gwa = pkAtmosphereAnimWidget.LIZIZ;
            if (c78470Gwa == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            LK1.LIZ((View) c78470Gwa, true);
            if (z != 0) {
                C78470Gwa c78470Gwa2 = pkAtmosphereAnimWidget.LIZIZ;
                if (c78470Gwa2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                if (c78470Gwa2.getLeftAnim().getVisibility() != 0) {
                    C78470Gwa c78470Gwa3 = pkAtmosphereAnimWidget.LIZIZ;
                    if (c78470Gwa3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                    if (c78470Gwa3.getRightAnim().getVisibility() == 0) {
                        C78470Gwa c78470Gwa4 = pkAtmosphereAnimWidget.LIZIZ;
                        if (c78470Gwa4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                        }
                        LK1.LIZ((View) c78470Gwa4.getRightAnim(), false);
                    }
                    C78470Gwa c78470Gwa5 = pkAtmosphereAnimWidget.LIZIZ;
                    if (c78470Gwa5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                    HSImageView leftAnim = c78470Gwa5.getLeftAnim();
                    SettingKey<C9068l> settingKey = LiveSettingKeys.LIVE_PK_ATMOSPHERE_ANIMATION_URLS;
                    Intrinsics.checkNotNullExpressionValue(settingKey, "");
                    C81978ISu.LIZ(leftAnim, settingKey.getValue().LJII);
                    C78470Gwa c78470Gwa6 = pkAtmosphereAnimWidget.LIZIZ;
                    if (c78470Gwa6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("");
                    }
                    LK1.LIZ((View) c78470Gwa6.getLeftAnim(), true);
                    QB4.LIZ(Observable.timer(JsBridgeDelegate.GET_URL_OUT_TIME, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new C78469GwZ(pkAtmosphereAnimWidget)), pkAtmosphereAnimWidget.LIZJ);
                    return;
                }
                return;
            }
            C78470Gwa c78470Gwa7 = pkAtmosphereAnimWidget.LIZIZ;
            if (c78470Gwa7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            if (c78470Gwa7.getRightAnim().getVisibility() == 0) {
                return;
            }
            C78470Gwa c78470Gwa8 = pkAtmosphereAnimWidget.LIZIZ;
            if (c78470Gwa8 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            if (c78470Gwa8.getLeftAnim().getVisibility() == 0) {
                C78470Gwa c78470Gwa9 = pkAtmosphereAnimWidget.LIZIZ;
                if (c78470Gwa9 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                }
                LK1.LIZ((View) c78470Gwa9.getLeftAnim(), false);
            }
            C78470Gwa c78470Gwa10 = pkAtmosphereAnimWidget.LIZIZ;
            if (c78470Gwa10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            HSImageView rightAnim = c78470Gwa10.getRightAnim();
            SettingKey<C9068l> settingKey2 = LiveSettingKeys.LIVE_PK_ATMOSPHERE_ANIMATION_URLS;
            Intrinsics.checkNotNullExpressionValue(settingKey2, "");
            C81978ISu.LIZ(rightAnim, settingKey2.getValue().LJIIIIZZ);
            C78470Gwa c78470Gwa11 = pkAtmosphereAnimWidget.LIZIZ;
            if (c78470Gwa11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            LK1.LIZ((View) c78470Gwa11.getRightAnim(), true);
            QB4.LIZ(Observable.timer(JsBridgeDelegate.GET_URL_OUT_TIME, TimeUnit.MILLISECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new C78471Gwb(pkAtmosphereAnimWidget)), pkAtmosphereAnimWidget.LIZJ);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
        if (r0.getValue().booleanValue() == false) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZ(int r7, int r8) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.newpk.widget.PkBaseWidget.LIZ(int, int):void");
    }

    public PkBaseWidget(long j, long j2, C458614Br c458614Br) {
        C106862S5w.LIZ(c458614Br);
        this.LJJIFFI = j;
        this.LJJII = j2;
        this.LJJIII = c458614Br;
    }
}
