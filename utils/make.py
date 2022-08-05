import os
import re


proto_file = open('douyin_video.proto','r').read()

proto_file_1 = open('douyin_video_1.proto','w')
a = re.findall(r'package\s+\"?\'?(.+)\'?\"?\;',proto_file)
for i in a:
    proto_file =proto_file.replace(f'{i}.','')
proto_file_1.write(proto_file)
proto_file_1.close()




# proto_file = open(f'douyin_video.proto','w')
# for i in os.listdir('proto'):
#     f = open(f'proto/{i}','r').readlines()
#     for j in f:
#         if j.startswith('import'):
#             proto_file.write(f'//{j}')
#         elif j.startswith('package'):
#             proto_file.write(f'//{j}')
#         else:
#             proto_file.write(j)

# proto_file.close()