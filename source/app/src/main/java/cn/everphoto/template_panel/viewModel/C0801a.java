package cn.everphoto.template_panel.viewModel;

import android.content.Intent;
import android.util.SparseArray;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import cn.everphoto.model.EpTemplate;
import cn.everphoto.model.MergedTemplateItem;
import cn.everphoto.model.TemplateResponseItem;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.ies.cutsameconsumer.templatemodel.TextSegment;
import com.p1594ss.android.ugc.cut_ui.CutSource;
import com.p1594ss.android.ugc.cut_ui.CutSourceType;
import com.p1594ss.android.ugc.cut_ui.MediaItem;
import com.p1594ss.android.ugc.cut_ui.TextItem;
import com.p1594ss.android.ugc.cut_ui.p2815b.C29797b;
import com.p1594ss.android.ugc.cut_ui.player.CutPlayerInterface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import p003X.AbstractC83316IsY;
import p003X.C106862S5w;
import p003X.C83189IqV;
import p003X.C83191IqX;
import p003X.C83314IsW;
import p003X.C83350It6;

/* renamed from: cn.everphoto.template_panel.viewModel.a */
/* loaded from: classes4.dex */
public final class C0801a extends ViewModel {
    public static ChangeQuickRedirect LIZ;
    public CutSource LIZIZ;
    public Intent LIZJ;
    public List<MediaItem> LIZLLL;

    /* renamed from: LJ */
    public List<TextItem> f21077LJ;
    public AbstractC83316IsY LJFF;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public C29797b LJIIL;
    public C83314IsW LJIILIIL;
    public C83189IqV LJIILJJIL;
    public SparseArray<MediaItem> LJI = new SparseArray<>();
    public List<MediaItem> LJII = new ArrayList();
    public List<TextItem> LJIIIIZZ = new ArrayList();
    public List<TextItem> LJIIIZ = new ArrayList();
    public CutPlayerInterface.TemplateType LJIILL = CutPlayerInterface.TemplateType.LV;
    public final MutableLiveData<Pair<Boolean, Long>> LJJIJ = new MutableLiveData<>();
    public final LiveData<Pair<Boolean, Long>> LJIILLIIL = this.LJJIJ;
    public final MutableLiveData<Boolean> LJIIZILJ = new MutableLiveData<>();
    public final LiveData<Boolean> LJIJ = this.LJIIZILJ;
    public final MutableLiveData<Boolean> LJJIJIIJI = new MutableLiveData<>();
    public final LiveData<Boolean> LJIJI = this.LJJIJIIJI;
    public final MutableLiveData<List<TextSegment>> LJIJJ = new MutableLiveData<>();
    public final LiveData<List<TextSegment>> LJIJJLI = this.LJIJJ;
    public final MutableLiveData<List<MediaItem>> LJIL = new MutableLiveData<>();
    public final LiveData<List<MediaItem>> LJJ = this.LJIL;
    public final MutableLiveData<MediaItem> LJJI = new MutableLiveData<>();
    public final LiveData<MediaItem> LJJIFFI = this.LJJI;
    public final MutableLiveData<Pair<Boolean, Long>> LJJII = new MutableLiveData<>();
    public final LiveData<Pair<Boolean, Long>> LJJIII = this.LJJII;
    public final MutableLiveData<Triple<Integer, Integer, Intent>> LJJIIJ = new MutableLiveData<>();
    public final LiveData<Triple<Integer, Integer, Intent>> LJJIIJZLJL = this.LJJIIJ;
    public Function0<Unit> LJJIIZ = CutSameMaterialViewModel$onSaveMvTextAction$1.INSTANCE;
    public Function0<Unit> LJJIIZI = CutSameMaterialViewModel$onCancelMvTextAction$1.INSTANCE;

    static {
        Covode.recordClassIndex(3849);
    }

    public final CutSource LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (CutSource) proxy.result;
        }
        CutSource cutSource = this.LIZIZ;
        if (cutSource == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return cutSource;
    }

    public final List<MediaItem> LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 5);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        List<MediaItem> list = this.LIZLLL;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return list;
    }

    public final List<TextItem> LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 7);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        List<TextItem> list = this.f21077LJ;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        return list;
    }

    public final void LIZLLL() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 33).isSupported) {
            return;
        }
        this.LJIIZILJ.setValue(Boolean.TRUE);
        this.LJJIJIIJI.setValue(Boolean.valueOf(!this.LJIIIZ.isEmpty()));
        this.LJIJJ.setValue(C83191IqX.LIZJ(this.LJIIIZ));
    }

    /* renamed from: LJ */
    public final List<String> m20550LJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 34);
        if (proxy.isSupported) {
            return (List) proxy.result;
        }
        List<TextItem> list = this.LJIIIIZZ;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (TextItem textItem : list) {
            arrayList.add(textItem.getText());
        }
        return CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList);
    }

    public final void LIZLLL(List<TextItem> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 11).isSupported) {
            return;
        }
        C106862S5w.LIZ(list);
        this.LJIIIIZZ = list;
    }

    /* renamed from: LJ */
    public final void m20549LJ(List<TextItem> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 12).isSupported) {
            return;
        }
        C106862S5w.LIZ(list);
        this.LJIIIZ = list;
    }

    public final void LIZIZ(List<TextItem> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 8).isSupported) {
            return;
        }
        C106862S5w.LIZ(list);
        this.f21077LJ = list;
    }

    public final void LIZJ(List<MediaItem> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 10).isSupported) {
            return;
        }
        C106862S5w.LIZ(list);
        this.LJII = list;
    }

    public final void LIZ(CutSource cutSource) {
        if (PatchProxy.proxy(new Object[]{cutSource}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(cutSource);
        this.LIZIZ = cutSource;
    }

    public final void LIZ(C83350It6 c83350It6) {
        MergedTemplateItem mergedTemplateItem;
        TemplateResponseItem templateResponseItem;
        MergedTemplateItem mergedTemplateItem2;
        TemplateResponseItem templateResponseItem2;
        if (PatchProxy.proxy(new Object[]{c83350It6}, this, LIZ, false, 32).isSupported) {
            return;
        }
        C106862S5w.LIZ(c83350It6);
        List<MediaItem> list = c83350It6.LJIIJJI;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((MediaItem) obj).LIZLLL) {
                    arrayList.add(obj);
                }
            }
            this.LJII = TypeIntrinsics.asMutableList(arrayList);
        }
        List<TextItem> list2 = c83350It6.LJIIL;
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list2) {
                if (((TextItem) obj2).getMutable()) {
                    arrayList2.add(obj2);
                }
            }
            this.LJIIIZ = TypeIntrinsics.asMutableList(arrayList2);
        }
        String str = null;
        if (this.LJIILL == CutPlayerInterface.TemplateType.LV) {
            EpTemplate epTemplate = c83350It6.LJIIJ;
            if (epTemplate != null && (mergedTemplateItem2 = epTemplate.getMergedTemplateItem()) != null && (templateResponseItem2 = mergedTemplateItem2.cutSameInfo) != null) {
                str = templateResponseItem2.templateUrl;
            }
        } else {
            EpTemplate epTemplate2 = c83350It6.LJIIJ;
            if (epTemplate2 != null && (mergedTemplateItem = epTemplate2.getMergedTemplateItem()) != null && (templateResponseItem = mergedTemplateItem.cutSameInfo) != null) {
                str = templateResponseItem.nleTemplateUrl;
            }
        }
        if (str == null) {
            str = "";
        }
        this.LIZIZ = new CutSource(str, CutSourceType.URL);
    }

    public final void LIZ(List<MediaItem> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, LIZ, false, 6).isSupported) {
            return;
        }
        C106862S5w.LIZ(list);
        this.LIZLLL = list;
    }

    public final void LIZ(boolean z) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 17).isSupported) {
            return;
        }
        this.LJJIJIIJI.setValue(Boolean.valueOf(z));
    }

    public final void LIZ(boolean z, long j) {
        if (PatchProxy.proxy(new Object[]{Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j)}, this, LIZ, false, 14).isSupported) {
            return;
        }
        this.LJJIJ.setValue(new Pair<>(Boolean.valueOf(z), Long.valueOf(j)));
    }

    public static /* synthetic */ void LIZ(C0801a c0801a, boolean z, long j, int i, Object obj) {
        if (PatchProxy.proxy(new Object[]{c0801a, Byte.valueOf(z ? (byte) 1 : (byte) 0), 0L, 2, null}, null, LIZ, true, 15).isSupported) {
            return;
        }
        c0801a.LIZ(z, 300L);
    }
}
