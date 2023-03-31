import imaplib
import email
import time


class Email:
    def __init__(self, email_address: str, password: str, imap_host: str, imap_port: int) -> None:
        self.email_address = email_address
        self.password = password
        self.imap_host = imap_host
        self.imap_port = imap_port

    def __enter__(self):
        # 连接IMAP服务器
        self.mail = imaplib.IMAP4_SSL(self.imap_host, self.imap_port)
        # 登录到邮箱
        self.mail.login(self.email_address, self.password)
        # 选择邮件文件夹（这里选择收件箱）
        self.mail.select('inbox')
        return self

    def __exit__(self, exc_type, exc_value, traceback):
        self.mail.close()
        self.mail.logout()

    def selectUnSeenEmail(self, sender: str = None, last_timestamp: int = None):
        # 搜索未读邮件
        status, response = self.mail.search(None, 'UNSEEN')
        unread_msgs = response[0].split()
        # 遍历邮件并打印主题和发件人
        for msg_id in unread_msgs:
            status, response = self.mail.fetch(msg_id, '(RFC822)')
            email_body = response[0][1]
            mail_message = email.message_from_bytes(email_body)
            print(msg_id, mail_message['Subject'],mail_message['From'])
            if sender and last_timestamp and sender == mail_message['From'] and int(time.mktime(time.strptime(mail_message['Date'][:-5], "%a, %d %b %Y %H:%M:%S"))) >= last_timestamp:
                return msg_id, mail_message['Subject'], mail_message

    def addSeenFlag(self, msg_id):
        self.mail.store(msg_id, '+FLAGS', '\Seen')


if __name__ == "__main__":
    with Email("971341273@qq.com", "iyiawkgucdajbcaa", "imap.qq.com", 993) as f:
        f.selectUnSeenEmail()
