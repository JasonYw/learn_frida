package bytedance.p029io;

import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* renamed from: bytedance.io.e */
/* loaded from: classes9.dex */
public final class C0612e {
    public static ChangeQuickRedirect LIZ;
    public long LIZIZ;
    public String LIZJ;
    public long LIZLLL;

    /* renamed from: LJ */
    public long f20853LJ;
    public String LJFF;
    public long LJI;
    public long LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public Uri LJIIJJI;
    public String LJIIL;
    public long LJIILIIL;
    public int LJIILJJIL;
    public String LJIILL;
    public String LJIILLIIL;
    public String LJIIZILJ;
    public String LJIJ;
    public long LJIJI;

    static {
        Covode.recordClassIndex(2573);
    }

    public final String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "BdMediaItem{id=" + this.LIZIZ + ", name='" + this.LIZJ + "', modify=" + this.LIZLLL + ", dateAdded=" + this.f20853LJ + ", mimeType='" + this.LJFF + "', duration=" + this.LJI + ", fileSize=" + this.LJII + ", width=" + this.LJIIIIZZ + ", height=" + this.LJIIIZ + ", musicType=" + this.LJIIJ + ", uri=" + this.LJIIJJI + ", relativePath='" + this.LJIIL + "', dateToken=" + this.LJIILIIL + ", orientation=" + this.LJIILJJIL + ", resolution='" + this.LJIILL + "', album='" + this.LJIILLIIL + "', artist='" + this.LJIIZILJ + "', title='" + this.LJIJ + "', albumId=" + this.LJIJI + '}';
    }
}
