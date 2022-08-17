import re
import os
from tqdm import tqdm

OUTPUT_FILENAME = "douyin.proto"
FILELIST = set()

LOG = "proto.log"

f = open(LOG, "w")


def get_all_file(path=os.getcwd()):
    for root, dirs, files in tqdm(os.walk(path)):
        for f in files:
            if f.endswith(".java"):
                FILELIST.add(os.path.join(root, f))


def get_proto_from_filelist():
    fr = open(OUTPUT_FILENAME, "w")
    fr.write('syntax = "proto3";\n\n\n')
    for file in tqdm(FILELIST):
        try:
            data = open(file, "r").read()
            res = re.findall(
                r"(\w+)\.(.*?)\.(asRepeated\(\)\.)?encodeWithTag\(protoWriter, (\d+), (.+)\);",
                data,
            )
            message = re.findall(r'encode\(ProtoWriter.protoWriter, (.*?) ',data)
            if res:
                f.write("获取:" + file + message[0].lower() + "\n")
                fr.write(f"message {message[0].lower()} "+'{\n')
                for item in res:
                    try:
                        if 'ProtoAdapter' == item[0]:
                            type_ = item[1].lower()
                        else:
                            type_ = item[0].lower()
                        if 'asRepeated()' in item[2]:
                            type_ = f'repeated {type_}'
                        else:
                            type_ = f'optional {type_}'
                        num  = item[3]
                        if '.' in item[4]:
                            tag = re.findall(r'\(?.+\.(.+)\)?',item[4])[0].replace(')','')
                        else:
                            tag = re.findall(r'(.+)\(',item[4])[0]
                        line = f'   {type_} {tag} = {num};\n'
                    except:
                        line = f'   {item}\n'
                    fr.write(line)
                fr.write("}\n")
            else:
                f.write("无法获取:" + file + "\n")
        except Exception as e:
            f.write(f"处理出错: {e} {file} \n")
        


if __name__ == "__main__":
    get_all_file('D:\\documents\\frida-douyin\\source_code\\app\\src\\main\\java\\com\\p1594ss\\')
    get_proto_from_filelist()
