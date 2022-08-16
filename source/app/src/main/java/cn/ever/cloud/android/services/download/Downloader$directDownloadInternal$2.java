package cn.ever.cloud.android.services.download;

import cn.ever.cloud.utils.LogHelper;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.io.RandomAccessFile;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class Downloader$directDownloadInternal$2 extends Lambda implements Function2<byte[], Integer, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ Ref.LongRef $downloaded;
    public final /* synthetic */ Function1 $progressFn;
    public final /* synthetic */ RandomAccessFile $targetFile;

    static {
        Covode.recordClassIndex(3024);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Downloader$directDownloadInternal$2(RandomAccessFile randomAccessFile, Ref.LongRef longRef, Function1 function1) {
        super(2);
        this.$targetFile = randomAccessFile;
        this.$downloaded = longRef;
        this.$progressFn = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Unit invoke(byte[] bArr, Integer num) {
        invoke(bArr, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(byte[] bArr, int i) {
        if (PatchProxy.proxy(new Object[]{bArr, Integer.valueOf(i)}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(bArr);
        this.$targetFile.write(bArr, 0, i);
        this.$downloaded.element += i;
        this.$progressFn.invoke(Long.valueOf(this.$downloaded.element));
        LogHelper.INSTANCE.m20552v("Downloader", "direct download, read len=" + i);
    }
}
