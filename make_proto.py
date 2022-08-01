import re
import os


proto_java_path = 'a.txt'
output_path = 'x.proto'

proto_java_lines = open(proto_java_path,'r').readlines()
output = open(output_path,'w')
output.write('syntax = "proto3";\n')
for line in proto_java_lines:
    #ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, status_code(feedItemList));
    try:
        a = re.findall(r'\.(.+)\.encodeWithTag\(protoWriter, (\d+), (.+)\(',line)[0]
        type_ = a[0].lower()
        num = int(a[1])
        name = a[2]
        print(f'{type_} {name} = {num};')
        output.write(f'{type_} {name} = {num};\n')
    except:
        print(f'{line}')
        output.write(f'{line}\n')
output.close()