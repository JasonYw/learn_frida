package anet.channel.strategy;

import com.bytedance.covode.number.Covode;
import java.io.File;
import java.util.Comparator;

/* renamed from: anet.channel.strategy.n */
/* loaded from: classes2.dex */
public final class C0575n implements Comparator<File> {
    static {
        Covode.recordClassIndex(2343);
    }

    @Override // java.util.Comparator
    /* renamed from: a */
    public final int compare(File file, File file2) {
        return (int) (file2.lastModified() - file.lastModified());
    }
}
