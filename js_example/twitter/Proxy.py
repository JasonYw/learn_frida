import requests

class Proxy:
    def __init__(self,proxy_ip: str = '127.0.0.1', proxy_port: int = 7890, proxy_username: str = None, proxy_password: str = None,proxy_api:str = None):
        self.proxy_ip = proxy_ip
        self.proxy_port = proxy_port
        self.proxy_username = proxy_username
        self.proxy_password = proxy_password
        self.proxy_api = proxy_api
        if self.proxy_api:
            self.proxies = self._getApi()
        elif self.proxy_ip and self.proxy_port and self.proxy_username and self.proxy_password:
            self.proxies = {
                'http': f'http://{self.proxy_username}:{self.proxy_password}@{self.proxy_ip}:{self.proxy_port}',
                'https': f'http://{self.proxy_username}:{self.proxy_password}@{self.proxy_ip}:{self.proxy_port}'
            }
        elif self.proxy_ip and self.proxy_port:
            self.proxies = {
                'http': f'http://{self.proxy_ip}:{self.proxy_port}',
                'https': f'http://{self.proxy_ip}:{self.proxy_port}'
            }
        else:
            self.proxies = {}
        
    def getProxies(self) -> dict:
        return self.proxies

    def _getApi(self) -> dict:
        return {}