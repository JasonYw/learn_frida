import re
import os
from tqdm import tqdm

OUTPUT_FILENAME = "douyin.proto"
FILELIST = set()

LOG = "proto.log"

f = open(LOG, "w")


def get_all_file(path=os.getcwd()):
    for root, dirs, files in os.walk(path):
        for f in tqdm(files):
            if f.endswith(".java"):
                FILELIST.add(os.path.join(root, f))


def get_proto_from_filelist():
    fr = open(OUTPUT_FILENAME, "w")
    fr.write('syntax = "proto3";\n\n\n')
    for file in tqdm(FILELIST):
        data = open(file, "r").read()
        res = re.findall(
            r"(\w+)\.(.*?)\.encodeWithTag\(protoWriter, (\d+), .*?\.(.*?)\);", data
        )
        if res:
            f.write("获取:" + file + "\n")
            fr.write("message %s {\n" % (file.split("/")[-1].replace(".java", "")))
            for item in res:
                line = "{} {} = {};\n".format(
                    (
                        "repeated {}".format(item[1].lower().split(".")[0])
                        if item[1].lower().__contains__("asrepeated")
                        else item[1].lower()
                    )
                    if item[0] == "ProtoAdapter"
                    else "repeated {}".format(item[0])
                    if item[1] == "ADAPTER.asRepeated()"
                    else item[0],
                    item[3],
                    item[2],
                )
                if "(" in line and ")" in line:
                    temp_ = re.findall(r"(valueOf\(.+\.(.+)\))\s?=\s?\d+;", line)
                    if temp_:
                        line = line.replace(*temp_[0])
                fr.write(f" {line}")
            fr.write("}\n\n")
        else:
            f.write("无法获取:" + file + "\n")


if __name__ == "__main__":
    get_all_file()
    get_proto_from_filelist()
