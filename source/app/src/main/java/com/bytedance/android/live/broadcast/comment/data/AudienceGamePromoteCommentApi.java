package com.bytedance.android.live.broadcast.comment.data;

import com.bytedance.android.live.network.response.C5176i;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.http.Field;
import com.bytedance.retrofit2.http.FieldMap;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.POST;
import io.reactivex.Observable;
import java.util.Map;
import p003X.AbstractC100834PnQ;

/* loaded from: classes5.dex */
public interface AudienceGamePromoteCommentApi {
    static {
        Covode.recordClassIndex(15314);
    }

    @FormUrlEncoded
    @POST("/webcast/gamecp/delete_evaluation")
    Observable<C5176i<Object>> deleteEvaluation(@Field("eval_id") String str);

    @FormUrlEncoded
    @POST("/webcast/gamecp/comment_list")
    Observable<AbstractC100834PnQ<C2994k>> fetchReplyList(@FieldMap Map<String, String> map);

    @FormUrlEncoded
    @POST("/webcast/gamecp/game/evaluation_list")
    Observable<C5176i<C2986b>> getCommentDetailList(@Field("game_id") String str, @Field("order_type") int i, @Field("count") int i2, @Field("offset") int i3);

    @FormUrlEncoded
    @POST("/webcast/gamecp/like_action")
    Observable<C5176i<Object>> likeCommentRequest(@FieldMap Map<String, String> map);

    @FormUrlEncoded
    @POST("/webcast/gamecp/make_comment/")
    Observable<AbstractC100834PnQ<C2991h>> makeComment(@Field("game_id") String str, @Field("score") Double d, @Field("content") String str2, @Field("submit_time") Long l, @Field("image_list") String str3);

    @FormUrlEncoded
    @POST("/webcast/gamecp/make_reply")
    Observable<C5176i<C2992i>> makeReply(@FieldMap Map<String, String> map);
}
