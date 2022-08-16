package cn.everphoto.onekey;

import cn.everphoto.core.localmedia.Asset;
import cn.everphoto.model.AssetCVBean;
import cn.everphoto.model.MusicInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import io.reactivex.android.schedulers.AndroidSchedulers;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Ref;
import p003X.C106005Rod;
import p003X.C106007Rof;
import p003X.C106862S5w;
import p003X.C116381Vrb;
import p003X.C116385Vrf;
import p003X.C116386Vrg;
import p003X.C116428VsM;
import p003X.C116462Vsu;
import p003X.CallableC116375VrV;
import p003X.RunnableC116388Vri;
import p003X.RunnableC116390Vrk;
import p003X.RunnableC116392Vrm;
import p003X.RunnableC116394Vro;

/* loaded from: classes13.dex */
public final class c$a implements AbstractC0779f {
    public static ChangeQuickRedirect LIZ;
    public final List<Asset> LIZIZ;
    public final MusicInfo LIZJ;
    public final AbstractC0777d LIZLLL;

    /* renamed from: LJ */
    public final /* synthetic */ C116381Vrb f21070LJ;
    public final List<String> LJFF;
    public final List<String> LJI;
    public final long LJII;

    static {
        Covode.recordClassIndex(3642);
    }

    @Override // cn.everphoto.onekey.AbstractC0779f
    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
            return;
        }
        C106007Rof.LIZ().scheduleDirect(new RunnableC116392Vrm(this));
    }

    public final void LIZIZ() {
        MethodCollector.m14708i(247);
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            MethodCollector.m14707o(247);
            return;
        }
        synchronized (this.f21070LJ.LIZJ) {
            try {
                this.f21070LJ.LIZJ.remove(this);
                AndroidSchedulers.mainThread().scheduleDirect(new RunnableC116394Vro(this));
            } catch (Throwable th) {
                MethodCollector.m14707o(247);
                throw th;
            }
        }
        MethodCollector.m14707o(247);
    }

    public final void LIZ(Asset asset, AssetCVBean assetCVBean) {
        MethodCollector.m14708i(248);
        if (PatchProxy.proxy(new Object[]{asset, assetCVBean}, this, LIZ, false, 3).isSupported) {
            MethodCollector.m14707o(248);
            return;
        }
        C106862S5w.LIZ(asset, assetCVBean);
        synchronized (this.f21070LJ.LIZJ) {
            try {
                String resourcePath = asset.getResourcePath();
                if (this.LJI.contains(resourcePath)) {
                    this.LJI.remove(resourcePath);
                    C106005Rod.LIZ("OneKey", "finish " + resourcePath + " left: " + this.LJI);
                    AndroidSchedulers.mainThread().scheduleDirect(new RunnableC116390Vrk(this, asset, assetCVBean));
                    if (this.LJI.isEmpty()) {
                        C116428VsM c116428VsM = C116428VsM.LIZIZ;
                        String valueOf = String.valueOf(System.currentTimeMillis() - this.LJII);
                        if (!PatchProxy.proxy(new Object[]{c116428VsM, "0", "0", valueOf, null, 8, null}, null, C116428VsM.LIZ, true, 8).isSupported) {
                            c116428VsM.LIZ("0", "0", valueOf, null);
                        }
                        Ref.ObjectRef objectRef = new Ref.ObjectRef();
                        objectRef.element = null;
                        C116462Vsu.LIZ(new CallableC116375VrV(objectRef, this, asset, assetCVBean)).observeOn(AndroidSchedulers.mainThread()).subscribe(new C116385Vrf(objectRef, this, asset, assetCVBean), new C116386Vrg(objectRef, this, asset, assetCVBean));
                    }
                }
            } catch (Throwable th) {
                MethodCollector.m14707o(248);
                throw th;
            }
        }
        MethodCollector.m14707o(248);
    }

    public final void LIZ(int i, String str, Throwable th) {
        MethodCollector.m14708i(249);
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, th}, this, LIZ, false, 5).isSupported) {
            MethodCollector.m14707o(249);
            return;
        }
        C106862S5w.LIZ(str, th);
        synchronized (this.f21070LJ.LIZJ) {
            try {
                if (this.LJI.contains(str)) {
                    this.f21070LJ.LIZJ.remove(this);
                    C116428VsM.LIZIZ.LIZ("1", "0", String.valueOf(System.currentTimeMillis() - this.LJII), th.getMessage());
                    AndroidSchedulers.mainThread().scheduleDirect(new RunnableC116388Vri(this, str, th, i));
                }
            } catch (Throwable th2) {
                MethodCollector.m14707o(249);
                throw th2;
            }
        }
        MethodCollector.m14707o(249);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c$a(C116381Vrb c116381Vrb, List<? extends Asset> list, MusicInfo musicInfo, AbstractC0777d abstractC0777d) {
        C106862S5w.LIZ(list, abstractC0777d);
        this.f21070LJ = c116381Vrb;
        this.LIZIZ = list;
        this.LIZJ = musicInfo;
        this.LIZLLL = abstractC0777d;
        List<Asset> list2 = this.LIZIZ;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (Asset asset : list2) {
            arrayList.add(asset.getResourcePath());
        }
        this.LJFF = arrayList;
        this.LJI = new CopyOnWriteArrayList(this.LJFF);
        this.LJII = System.currentTimeMillis();
    }
}
