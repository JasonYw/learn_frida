import re
import os


proto_java_path = 'a.txt'
proto_java_lines = open(proto_java_path,'r').readlines()
class_ = proto_java_lines[0].replace('\n','')
output_path = f'{class_}.proto'
output = open(output_path,'w')
output.write('syntax = "proto3";\n')
output.write(f'message {class_} '+'{\n')
for line in proto_java_lines[1:]:
    #ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, status_code(feedItemList));
    try:
        if line.startswith('ProtoAdapter'):
            a = re.findall(r'\.(.+)\.encodeWithTag\(protoWriter, (\d+), (.+)\(',line)[0]
            type_ = a[0].lower()
            num = int(a[1])
            name = a[2]
            output.write(f'\t{type_} {name} = {num};\n')
        else:
            output.write(f'\t//{line}')
    except:
        output.write(f'\t//{line}')
output.write('}')
output.close()