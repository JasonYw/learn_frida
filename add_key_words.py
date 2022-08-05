import os
import re
from copy import deepcopy

proto_file = open('douyin_video_struct.proto','r').readlines()

douyin_video  = open('douyin_video.proto','w')
for i in proto_file:
    if i.startswith('//') or i.startswith('message') or '}' in i or 'repeated' in i or 'syntax = "proto3";' in i or 'package' in i:
        douyin_video.write(i)
    else:
        c = deepcopy(i)
        a = c.replace('\n','').lstrip(' ')
        a = f'  optional {a}\n'
        douyin_video.write(a)
douyin_video.close()




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