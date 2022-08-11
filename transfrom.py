# import blackboxprotobuf

import douyin_pb2
import json
from google.protobuf.json_format import MessageToDict


def decode_proto(bs):
    info = douyin_pb2.feeditemlist()
    info.ParseFromString(bs)
    print(
        json.dumps(
            MessageToDict(info, preserving_proto_field_name=True), ensure_ascii=True
        )
    )
