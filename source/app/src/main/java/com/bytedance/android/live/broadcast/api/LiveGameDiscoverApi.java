package com.bytedance.android.live.broadcast.api;

import com.bytedance.android.live.base.model.feed.C2827a;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.network.response.ExtraResponse;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Query;
import io.reactivex.Observable;
import java.util.List;
import p003X.AbstractC100834PnQ;

/* loaded from: classes8.dex */
public interface LiveGameDiscoverApi {
    static {
        Covode.recordClassIndex(14400);
    }

    @GET("/webcast/game/recommend/feed/")
    Observable<ExtraResponse<List<FeedItem>, C2827a>> getLiveGameRecRoomList(@Query("count") Long l, @Query("offset") Long l2, @Query("enter_source") String str, @Query("aid") int i);

    @GET("/webcast/game/tab/")
    Observable<AbstractC100834PnQ<C2926t>> getLiveGameTab(@Query("enter_source") String str);

    @GET("/webcast/game/tab/feed/")
    Observable<ExtraResponse<List<FeedItem>, C2827a>> getLiveGameTabRoomList(@Query("id_str") String str, @Query("draw_room_id") String str2, @Query("is_draw") Long l, @Query("count") Long l2, @Query("offset") Long l3, @Query("enter_source") String str3, @Query("aid") int i);
}
