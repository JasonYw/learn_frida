import re
import os


proto_java_path = 'a.txt'

proto_java_lines = open(proto_java_path,'r').readlines()
for line in proto_java_lines:
    #ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, status_code(feedItemList));
    a = re.findall(r'\.(.+)\.encodeWithTag\(protoWriter, (\d+), (.+)\(',line)[0]
    type_ = a[0].lower()
    num = int(a[1])
    name = a[2]
    print(f'{type_} {name} = {num},')
