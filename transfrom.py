# import blackboxprotobuf

import Protobufaweme_v2_feed_responseAdapter_pb2
import json
from google.protobuf.json_format import MessageToDict
with open('testdata.text', 'rb') as f:
    a = f.read()

info = Protobufaweme_v2_feed_responseAdapter_pb2.Protobufaweme_v2_feed_responseAdapter()
info.ParseFromString(a)
print(json.dumps(MessageToDict(info, preserving_proto_field_name=True), ensure_ascii=False))
