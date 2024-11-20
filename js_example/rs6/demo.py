import requests
from parsel import Selector

session = requests.session()

headers = {
    "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/123.0.0.0 Safari/537.36",
}

html_res = session.get(
    "https://www.nmpa.gov.cn/datasearch/home-index.html", headers=headers
)

open("index.html", "w").write(html_res.text)
ts_path = Selector(html_res.text).xpath("//script/@src").get()
ts_file_url = "https://www.nmpa.gov.cn" + ts_path


content = Selector(html_res.text).xpath("//meta/@content").getall()[1]


headers.update(
    {
        "Referer": "https://www.nmpa.gov.cn/datasearch/home-index.html",
    }
)

ts_file_res = session.get(ts_file_url, headers=headers)

open(ts_path.split("/")[-1], "wb").write(ts_file_res.content)
