# import blackboxprotobuf

import feed_aweme_pb2
import douyin_pb2
# import douyin_video_pb2
import json
from google.protobuf.json_format import MessageToDict

a = open("aweme_v2_data", "rb").read()
b = open("ok.json", "w")
# info = feed_aweme_pb2.AwemeFeedResponse()
# info = douyin_video_pb2.Protobufaweme_v2_feed_responseAdapter()
info = douyin_pb2.feeditemlist()
info.ParseFromString(a)
b.write(
    json.dumps(
        MessageToDict(info, preserving_proto_field_name=True), ensure_ascii=True
    )
)
