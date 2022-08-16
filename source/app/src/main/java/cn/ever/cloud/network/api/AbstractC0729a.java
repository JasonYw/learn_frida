package cn.ever.cloud.network.api;

import cn.ever.cloud.network.entity.C0731a;
import cn.ever.cloud.network.entity.C0732b;
import cn.ever.cloud.network.entity.C0733c;
import cn.ever.cloud.network.entity.C0734d;
import cn.ever.cloud.network.entity.C0736f;
import cn.ever.cloud.network.entity.C0737g;
import cn.ever.cloud.network.entity.NGetAssetEncRequest;
import cn.ever.cloud.network.entity.NGetUpdatesRequest;
import cn.ever.cloud.network.entity.NGetVideoPlayerRequest;
import cn.ever.cloud.network.entity.NPostSyncCommandRequest;
import cn.ever.cloud.network.entity.NUploadCompleteRequest;
import cn.ever.cloud.network.entity.NUploadStateRequest;
import com.bytedance.covode.number.Covode;
import kotlin.coroutines.Continuation;
import p003X.AbstractC522236kD;

/* renamed from: cn.ever.cloud.network.api.a */
/* loaded from: classes23.dex */
public interface AbstractC0729a extends DownloadApi, AbstractC522236kD {
    static {
        Covode.recordClassIndex(3173);
    }

    Object getAssetEnc(NGetAssetEncRequest nGetAssetEncRequest, Continuation<? super C0731a> continuation);

    Object getUpdates(NGetUpdatesRequest nGetUpdatesRequest, Continuation<? super C0732b> continuation);

    Object getVideoPlayer(NGetVideoPlayerRequest nGetVideoPlayerRequest, Continuation<? super C0733c> continuation);

    Object postSyncCommand(NPostSyncCommandRequest nPostSyncCommandRequest, Continuation<? super C0734d> continuation);

    Object uploadComplete(NUploadCompleteRequest nUploadCompleteRequest, Continuation<? super C0736f> continuation);

    Object uploadState(NUploadStateRequest nUploadStateRequest, Continuation<? super C0737g> continuation);
}
