package cn.ever.cloud.android.services.download;

import cn.ever.cloud.network.entity.NEncChunk;
import cn.ever.cloud.utils.LogHelper;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class Downloader$encryptDownloadInternal$2 extends Lambda implements Function2<byte[], Integer, Unit> {
    public static ChangeQuickRedirect changeQuickRedirect;
    public final /* synthetic */ NEncChunk $chunk;
    public final /* synthetic */ Ref.ObjectRef $chunkBytes;
    public final /* synthetic */ Ref.IntRef $downloaded;
    public final /* synthetic */ Function1 $progressFn;

    static {
        Covode.recordClassIndex(3039);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Downloader$encryptDownloadInternal$2(Ref.ObjectRef objectRef, Ref.IntRef intRef, Function1 function1, NEncChunk nEncChunk) {
        super(2);
        this.$chunkBytes = objectRef;
        this.$downloaded = intRef;
        this.$progressFn = function1;
        this.$chunk = nEncChunk;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ Unit invoke(byte[] bArr, Integer num) {
        invoke(bArr, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r0v30, types: [byte[], T] */
    public final void invoke(byte[] bArr, int i) {
        if (PatchProxy.proxy(new Object[]{bArr, Integer.valueOf(i)}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(bArr);
        if (this.$downloaded.element + i > ((byte[]) this.$chunkBytes.element).length) {
            Ref.ObjectRef objectRef = this.$chunkBytes;
            objectRef.element = ArraysKt___ArraysJvmKt.plus((byte[]) objectRef.element, new byte[((byte[]) this.$chunkBytes.element).length]);
        }
        ArraysKt___ArraysJvmKt.copyInto(bArr, (byte[]) this.$chunkBytes.element, this.$downloaded.element, 0, i);
        this.$downloaded.element += i;
        this.$progressFn.invoke(Long.valueOf(i));
        LogHelper.INSTANCE.m20552v("Downloader", "download chunk=" + this.$chunk.getOffset() + ", read len=" + i + ", total=" + this.$downloaded.element);
    }
}
