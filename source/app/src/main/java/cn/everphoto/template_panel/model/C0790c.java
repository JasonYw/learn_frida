package cn.everphoto.template_panel.model;

import cn.everphoto.model.EpTemplate;
import cn.everphoto.model.MergedTemplateItem;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* renamed from: cn.everphoto.template_panel.model.c */
/* loaded from: classes4.dex */
public final class C0790c {
    public static ChangeQuickRedirect LIZ;
    public EpTemplate LIZIZ;
    public String LIZJ;
    public boolean LIZLLL;

    /* renamed from: LJ */
    public int f21073LJ;
    public boolean LJFF;

    static {
        Covode.recordClassIndex(3813);
    }

    public C0790c() {
        this(null, null, false, 0, false, 31);
    }

    public final MergedTemplateItem LIZIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 4);
        if (proxy.isSupported) {
            return (MergedTemplateItem) proxy.result;
        }
        EpTemplate epTemplate = this.LIZIZ;
        if (epTemplate != null) {
            return epTemplate.getMergedTemplateItem();
        }
        return null;
    }

    public final long LIZ() {
        MergedTemplateItem mergedTemplateItem;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return ((Long) proxy.result).longValue();
        }
        EpTemplate epTemplate = this.LIZIZ;
        if (epTemplate != null && (mergedTemplateItem = epTemplate.getMergedTemplateItem()) != null) {
            return mergedTemplateItem.templateId;
        }
        return -1L;
    }

    public C0790c(EpTemplate epTemplate, String str, boolean z, int i, boolean z2) {
        this.LIZIZ = epTemplate;
        this.LIZJ = str;
        this.LIZLLL = z;
        this.f21073LJ = i;
        this.LJFF = z2;
    }

    public /* synthetic */ C0790c(EpTemplate epTemplate, String str, boolean z, int i, boolean z2, int i2) {
        this((i2 & 1) != 0 ? null : epTemplate, (i2 & 2) != 0 ? "" : str, false, (i2 & 8) != 0 ? 0 : i, false);
    }
}
