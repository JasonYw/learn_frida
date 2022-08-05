from google.protobuf.json_format import MessageToDict
import a_pb2 as a
import json



if __name__ == '__main__':
    with open('a.txt', 'rb') as f:
        resp = f.read()
    info = a.AwemeStructV2()
    info.ParseFromString(resp)
    message = json.dumps(MessageToDict(info, preserving_proto_field_name=True), ensure_ascii=False)

    message_json = json.loads(message)
    print(message_json)
    print('-=' * 100, "sajor loading")
