import blackboxprotobuf
import os


def to_json():
    for i in os.listdir('result/'):
        if '.json' not in i:
            f = open(f'result/{i}','rb').read()
            for j in range(3):
                try:
                    c = open(f'result/{i}.json','w')
                    message_, typedef = blackboxprotobuf.protobuf_to_json(f)
                    input()
                    c.write(message_)
                    c.close()
                    os.remove(f'result/{i}')
                    break
                except:
                    continue


if __name__ == "__main__":
    to_json()