package com.yedam.chapter13.lifofifo;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {

		Queue<Message> messageQueue = new LinkedList<Message>();
		// LinkedList 머엿샘..? 배운기억소멸 (ಥ _ ಥ)
		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendSMS", "신용권"));
		messageQueue.offer(new Message("sendKakaotalk", "홍두께"));

		while (!messageQueue.isEmpty()) { // 메세지큐에 내용이 있는 동안 와일문 !
			Message message = messageQueue.poll(); // 끄집어내는게 .poll()
			switch (message.command) {
			case "sendMail":
				System.out.println(message.to + "님에게 메일을 보내자!");
				break;
			case "sendSMS":
				System.out.println(message.to + "님에게 sms 보내자");
				break;
			case "sendKakaotalk":
				System.out.println(message.to + "님에케 카톡을 ㄱㄱ");
				break;
			}
		}

	}

}
