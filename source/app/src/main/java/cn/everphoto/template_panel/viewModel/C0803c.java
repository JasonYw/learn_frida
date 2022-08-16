package cn.everphoto.template_panel.viewModel;

import android.content.Context;
import android.content.res.Resources;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import cn.everphoto.model.EpTemplate;
import cn.everphoto.model.MergedTemplateItem;
import cn.everphoto.model.TemplateResponseItem;
import cn.everphoto.onekey.AbstractC0779f;
import cn.everphoto.template_panel.model.C0790c;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.cutsame.cut_android.TemplateSource;
import com.bytedance.ies.cutsameconsumer.templatemodel.TemplateModel;
import com.p1594ss.android.ugc.cut_ui.CutSource;
import com.p1594ss.android.ugc.cut_ui.CutSourceType;
import com.p1594ss.android.ugc.effectmanager.common.listener.IEffectNetWorker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC83316IsY;
import p003X.AbstractC83373ItT;
import p003X.C106862S5w;
import p003X.C83227Ir7;
import p003X.C83358ItE;
import p003X.C84T;
import p003X.C86249Jyl;

/* renamed from: cn.everphoto.template_panel.viewModel.c */
/* loaded from: classes4.dex */
public final class C0803c extends ViewModel {
    public static ChangeQuickRedirect LIZ;
    public Resources LIZIZ;
    public C84T LIZJ;
    public C0790c LJI;
    public C0790c LJII;
    public C0790c LJIIIIZZ;
    public ArrayList<String> LJIIIZ;
    public TemplateModel LJIIJ;
    public AbstractC83316IsY LJIIJJI;
    public AbstractC83373ItT LJIIL;
    public List<EpTemplate> LJIILIIL;
    public long LJIILJJIL;
    public TemplateModel LJIILL;
    public AbstractC0779f LJIJI;
    public boolean LIZLLL = true;

    /* renamed from: LJ */
    public boolean f21079LJ = true;
    public long LJFF = -1;
    public final ArrayList<C0790c> LJIILLIIL = new ArrayList<>();
    public final ArrayList<C0790c> LJIIZILJ = new ArrayList<>();
    public final Lazy LJIJ = LazyKt__LazyJVMKt.lazy(new CutSameTemplateViewModel$noneTemplateItem$2(this));
    public String LJIJJ = "";
    public final MutableLiveData<Pair<Boolean, Long>> LJJIJIIJIL = new MutableLiveData<>();
    public final LiveData<Pair<Boolean, Long>> LJIJJLI = this.LJJIJIIJIL;
    public final MutableLiveData<Boolean> LJJIJIL = new MutableLiveData<>();
    public final LiveData<Boolean> LJIL = this.LJJIJIL;
    public final MutableLiveData<Boolean> LJJIJL = new MutableLiveData<>();
    public final LiveData<Boolean> LJJ = this.LJJIJL;
    public final MutableLiveData<Boolean> LJJIJLIJ = new MutableLiveData<>();
    public final LiveData<Boolean> LJJI = this.LJJIJLIJ;
    public final MutableLiveData<ArrayList<C0790c>> LJJIFFI = new MutableLiveData<>();
    public final LiveData<ArrayList<C0790c>> LJJII = this.LJJIFFI;
    public final MutableLiveData<Pair<TemplateModel, Integer>> LJJIL = new MutableLiveData<>();
    public final LiveData<Pair<TemplateModel, Integer>> LJJIII = this.LJJIL;
    public final MutableLiveData<Boolean> LJJIZ = new MutableLiveData<>();
    public final LiveData<Boolean> LJJIIJ = this.LJJIZ;
    public final MutableLiveData<Boolean> LJJIIJZLJL = new MutableLiveData<>();
    public final LiveData<Boolean> LJJIIZ = this.LJJIIJZLJL;
    public final MutableLiveData<Boolean> LJJIIZI = new MutableLiveData<>();
    public final LiveData<Boolean> LJJIJ = this.LJJIIZI;
    public final MutableLiveData<String> LJJJ = new MutableLiveData<>();
    public final LiveData<String> LJJIJIIJI = this.LJJJ;

    static {
        Covode.recordClassIndex(3852);
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            return;
        }
        this.LJJIZ.setValue(Boolean.TRUE);
    }

    public final void LIZ(C0790c c0790c) {
        this.LJII = c0790c;
        this.LJIIIIZZ = c0790c;
    }

    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.LJIJJ = str;
    }

    public final void LIZ(TemplateModel templateModel, int i) {
        if (PatchProxy.proxy(new Object[]{templateModel, Integer.valueOf(i)}, this, LIZ, false, 7).isSupported) {
            return;
        }
        this.LJJIL.setValue(TuplesKt.m137to(templateModel, Integer.valueOf(i)));
    }

    public final void LIZ(Context context, IEffectNetWorker iEffectNetWorker) {
        String str;
        TemplateResponseItem templateResponseItem;
        TemplateResponseItem templateResponseItem2;
        String str2;
        if (PatchProxy.proxy(new Object[]{context, iEffectNetWorker}, this, LIZ, false, 18).isSupported) {
            return;
        }
        C106862S5w.LIZ(iEffectNetWorker);
        if (!this.LJIIZILJ.isEmpty() && context != null) {
            C0790c c0790c = this.LJIIZILJ.get(0);
            String str3 = "";
            Intrinsics.checkExpressionValueIsNotNull(c0790c, str3);
            C0790c c0790c2 = c0790c;
            C86249Jyl.LIZ(new CutSameTemplateViewModel$preDownloadTemplate$1(iEffectNetWorker));
            MergedTemplateItem LIZIZ = c0790c2.LIZIZ();
            if (LIZIZ != null && (templateResponseItem2 = LIZIZ.cutSameInfo) != null && (str2 = templateResponseItem2.templateUrl) != null) {
                str3 = str2;
            }
            CutSource cutSource = new CutSource(str3, CutSourceType.URL);
            MergedTemplateItem LIZIZ2 = c0790c2.LIZIZ();
            if (LIZIZ2 != null && (templateResponseItem = LIZIZ2.cutSameInfo) != null) {
                str = templateResponseItem.md5;
            } else {
                str = null;
            }
            C83227Ir7.LIZ(context, new TemplateSource(context, cutSource, null, str), new C83358ItE(this, c0790c2, context, iEffectNetWorker));
        }
    }

    public final void LIZ(boolean z, long j) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j)}, this, LIZ, false, 5).isSupported) {
            return;
        }
        this.LJJIJIIJIL.setValue(new Pair<>(Boolean.valueOf(z), Long.valueOf(j)));
    }
}
